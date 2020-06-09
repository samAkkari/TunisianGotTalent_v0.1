package tunisiangottalent.domain;






public class Reclamation  {

	// Fields

	private Double idReclamation;
	private Utilisateur utilisateur;
	private String type;
	private String detailReclamation;
        private String url;
        
	// Constructors

	/** default constructor */
	public Reclamation() {
	}

	/** full constructor */
	public Reclamation(Double idReclamation, Utilisateur utilisateur,
			String type, String detailReclamation,String url) {
		this.idReclamation = idReclamation;
		this.utilisateur = utilisateur;
		this.type = type;
		this.detailReclamation = detailReclamation;
                this.url = url;
	}

	// Property accessors
	
	public Double getIdReclamation() {
		return this.idReclamation;
	}

	public void setIdReclamation(Double idReclamation) {
		this.idReclamation = idReclamation;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

 	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

 	public String getDetailReclamation() {
		return this.detailReclamation;
	}

	public void setDetailReclamation(String detailReclamation) {
		this.detailReclamation = detailReclamation;
	}

        public String getUrl() {
                return url;
        }

         public void setUrl(String url) {
                this.url = url;
        }

}