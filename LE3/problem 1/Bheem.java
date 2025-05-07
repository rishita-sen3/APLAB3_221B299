// Concrete class Bheem extends Pandav
class Bheem extends Pandav {
    // Bheem is obedient but less kind than Arjun
    @Override
    public void obey() {
        System.out.println("Bheem is equally obedient as Arjun.");
    }

    // Bheem is less kind than Arjun
    @Override
    public String kind() {
        return "Bheem is less kind than Arjun.";
    }
}