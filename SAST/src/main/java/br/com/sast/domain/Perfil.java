package br.com.sast.domain;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Classe definida para mapear a entidade "tb_perfil" e seus atributos.
 * @author Luiz Felipe Magalhães Galindo <lfgalindo@live.com>
 * @since 30/08/2016
 */

@Entity
@Table(name = "tb_perfil")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	
	@Column(length = 45, nullable = false)
	private String nomePerfil;
	
	@Column(nullable = false)
	private Integer gerenciarClientes;
	
	@Column(nullable = false)
	private Integer gerenciarFuncionarios;
	
	@Column(nullable = false)
	private Integer gerenciarCargos;
	
	@Column(nullable = false)
	private Integer gerenciarPlanos;
	
	@Column(nullable = false)
	private Integer gerenciarManutencoes;
	
	@Column(nullable = false)
	private Integer gerenciarConfiguracoes;
        
        //Exibit 'sim' e 'nao' na visualização de perfis
        @Transient
        private String gerCli;
        
        @Transient
        private String gerFunc;
        
        @Transient
        private String gerCargo;
        
        @Transient
        private String gerPlan;
        
        @Transient
        private String gerMan;
        
        @Transient
        private String GerConfig;
        
        public String getGerCliInt() {
                
            if (gerenciarClientes == 1 ){
                gerCli = "Sim";
            }
            else{
                gerCli = "Não";
            }
            
            return gerCli;
        }
        
        public String getGerFuncInt() {

            if (gerenciarFuncionarios == 1 ){
                gerFunc = "Sim";
            }
            else{
                gerFunc = "Não";
            }
            
            return gerFunc;
        }
        
        public String getGerCargInt() {

            if (gerenciarCargos == 1 ){
                gerCargo = "Sim";
            }
            else{
                gerCargo = "Não";
            }
            
            return gerCargo;
        }
        
        public String getGerPlanInt() {

            if (gerenciarPlanos == 1 ){
                gerPlan = "Sim";
            }
            else{
                gerPlan = "Não";
            }
            
            return gerPlan;
        }
        
        public String getGerManInt() {

            if (gerenciarManutencoes == 1 ){
                gerMan = "Sim";
            }
            else{
                gerMan = "Não";
            }
            
            return gerMan;
        }
        
        public String getGerConfigInt() {

            if (gerenciarConfiguracoes == 1 ){
                GerConfig = "Sim";
            }
            else{
                GerConfig = "Não";
            }
            
            return GerConfig;
        }
        
	
	/** Setters e Getters **/
	
	public void setCodigo(Integer codigo){
		this.codigo = codigo;
	}
	public Integer getCodigo(){
		return codigo;
	}
	
	public void setNomePerfil(String nomePerfil){
		this.nomePerfil = nomePerfil;
	}
	public String getNomePerfil(){
		return nomePerfil;
	}
	
	
	public void setGerenciarCargos(boolean gerenciarCargos){
		
                Integer op = 0;
                
                if (gerenciarCargos == true){
                    op = 1;
                }
                
                this.gerenciarCargos = op;
	}
	public Integer getGerenciarCargos(){
		return gerenciarCargos;
	}
	
	public void setGerenciarPlanos(boolean gerenciarPlanos){
		
                Integer op = 0;
                
                if (gerenciarPlanos == true){
                    op = 1;
                }
                
                this.gerenciarPlanos = op;
	}
	public Integer getGerenciarPlanos(){
		return gerenciarPlanos;
	}
	
	public void setGerenciarManutencoes(boolean gerenciarManutencoes){
		
                Integer op = 0;
                
                if (gerenciarManutencoes == true){
                    op = 1;
                }
                
                this.gerenciarManutencoes = op;
	}
	public Integer getGerenciarManutencoes(){
		return gerenciarManutencoes;
	}
	
	public void setGerenciarConfiguracoes(boolean gerenciarConfiguracoes){
		
                Integer op = 0;
                
                if (gerenciarConfiguracoes == true){
                    op = 1;
                }
                
                this.gerenciarConfiguracoes = op;
	}
	public Integer getGerenciarConficuracoes(){
		return gerenciarConfiguracoes;
	}
	
        public Integer getGerenciarClientes() {
		return gerenciarClientes;
	}
	public void setGerenciarClientes(boolean gerenciarClientes) {
		
                Integer op = 0;
                
                if (gerenciarClientes == true){
                    op = 1;
                }
                
                this.gerenciarClientes = op;
	}
	public Integer getGerenciarFuncionarios() {
		return gerenciarFuncionarios;
	}
	public void setGerenciarFuncionarios(boolean gerenciarFuncionarios) {
		
                Integer op = 0;
                
                if (gerenciarFuncionarios == true){
                    op = 1;
                }
                
                this.gerenciarFuncionarios = op;
	}
	public Integer getGerenciarConfiguracoes() {
		return gerenciarConfiguracoes;
	}
	public String toString(){
		return "Perfil " + codigo + ": { " + nomePerfil + " }";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perfil other = (Perfil) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
}
