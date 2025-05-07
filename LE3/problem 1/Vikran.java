class Vikarn extends Kaurav {
    // Vikarn is a fighter but noble
    @Override
    public void fight() {
        System.out.println("Vikarn is fighting nobly.");
    }

    // Vikarn is obedient
    @Override
    public void obey() {
        System.out.println("Vikarn is obedient despite being a Kaurav.");
    }

    // Vikarn is kind
    public String kind() {
        return "Vikarn is kind and noble.";
    }
}