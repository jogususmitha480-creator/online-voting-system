public class Voter {
    private String voterId;
    private String password;
    private boolean hasVoted;

    public Voter(String voterId, String password, boolean hasVoted) {
        this.voterId = voterId;
        this.password = password;
        this.hasVoted = hasVoted;
    }

    public String getVoterId() {
        return voterId;
    }

    public String getPassword() {
        return password;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean voted) {
        this.hasVoted = voted;
    }
}