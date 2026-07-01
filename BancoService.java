package banco.service;

import banco.dao.ContaCorrenteDAO;
import banco.dao.ContaPoupancaDAO;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class BancoService {
    private ContaCorrenteDAO contaCorrenteDAO;
    private ContaPoupancaDAO contaPoupancaDAO;

    public BancoService() {
        this.contaCorrenteDAO = new ContaCorrenteDAO();
        this.contaPoupancaDAO = new ContaPoupancaDAO();
    }

    public void abrirContaCorrente(ContaCorrente conta) throws Exception {
        contaCorrenteDAO.inserir(conta);
    }

    public void abrirContaPoupanca(ContaPoupanca conta) throws Exception {
        contaPoupancaDAO.inserir(conta);
    }

    public void transferirEntreCorrentes(ContaCorrente origem, ContaCorrente destino, double valor) throws Exception {
        origem.transferir(destino, valor);
        contaCorrenteDAO.atualizar(origem);
        contaCorrenteDAO.atualizar(destino);
    }

    public void transferirEntrePoupancas(ContaPoupanca origem, ContaPoupanca destino, double valor) throws Exception {
        origem.transferir(destino, valor);
        contaPoupancaDAO.atualizar(origem);
        contaPoupancaDAO.atualizar(destino);
    }

    public void aplicarRendimento(ContaPoupanca conta) throws Exception {
        conta.aplicarRendimento();
        contaPoupancaDAO.atualizar(conta);
        
    }
}
