class Voice{
    public void preparevoice(){
        Animal[] animals= new Animal[5];
        animals[0]= new cow();
        animals[1]= new dog();
        animals[2]= new lion();
        animals[3]= new pig();
        animals[4]= new goat();
        
        hear(animals);
    }
    
    public void hear(Animal[] animals){
        for(Animal animal:animals)
            animal.makevoice();
    }
}