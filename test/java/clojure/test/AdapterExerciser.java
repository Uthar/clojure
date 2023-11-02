package clojure.test;

public class AdapterExerciser {

    @FunctionalInterface
    public interface L {
        public long RetL();
    }
    @FunctionalInterface
    public interface I {
        public int RetI();
    }
    @FunctionalInterface
    public interface B {
        public boolean RetB();
    }
    @FunctionalInterface
    public interface D {
        public double RetD();
    }
    @FunctionalInterface
    public interface O {
        public AdapterExerciser RetO();
    }

    @FunctionalInterface
    public interface LL {
        public long takesLRetL(long a);
    }
    @FunctionalInterface
    public interface DL {
        public long takesDRetL(double a);
    }
    @FunctionalInterface
    public interface OL {
        public long takesORetL(AdapterExerciser a);
    }
    @FunctionalInterface
    public interface LI {
        public int takesLRetI(long a);
    }
    @FunctionalInterface
    public interface DI {
        public int takesDRetI(double a);
    }
    @FunctionalInterface
    public interface OI {
        public int takesORetI(AdapterExerciser a);
    }
    @FunctionalInterface
    public interface LB {
        public boolean takesLRetB(long a);
    }
    @FunctionalInterface
    public interface DB {
        public boolean takesDRetB(double a);
    }
    @FunctionalInterface
    public interface OB {
        public boolean takesORetB(AdapterExerciser a);
    }
    @FunctionalInterface
    public interface OD {
        public double takesORetD(AdapterExerciser a);
    }
    @FunctionalInterface
    public interface LD {
        public double takesLRetD(long a);
    }
    @FunctionalInterface
    public interface DD {
        public double takesDRetD(double a);
    }
    @FunctionalInterface
    public interface LO {
        public AdapterExerciser takesLRetO(long a);
    }
    @FunctionalInterface
    public interface DO {
        public AdapterExerciser takesDRetO(double a);
    }
    @FunctionalInterface
    public interface OO {
        public AdapterExerciser takesORetO(AdapterExerciser a);
    }

    @FunctionalInterface
    public interface LLL {
        public long takesLLRetL(long a, long b);
    }
    @FunctionalInterface
    public interface LOL {
        public long takesLORetL(long a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface OLL {
        public long takesOLRetL(AdapterExerciser a, long b);
    }
    @FunctionalInterface
    public interface DDL {
        public long takesDDRetL(double a, double b);
    }
    @FunctionalInterface
    public interface LDL {
        public long takesLDRetL(long a, double b);
    }
    @FunctionalInterface
    public interface DLL {
        public long takesDLRetL(double a, long b);
    }
    @FunctionalInterface
    public interface OOL {
        public long takesOORetL(AdapterExerciser a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface ODL {
        public long takesODRetL(AdapterExerciser a, double b);
    }
    @FunctionalInterface
    public interface DOL {
        public long takesDORetL(double a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface LLI {
        public int takesLLRetI(long a, long b);
    }
    @FunctionalInterface
    public interface LOI {
        public int takesLORetI(long a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface OLI {
        public int takesOLRetI(AdapterExerciser a, long b);
    }
    @FunctionalInterface
    public interface DDI {
        public int takesDDRetI(double a, double b);
    }
    @FunctionalInterface
    public interface LDI {
        public int takesLDRetI(long a, double b);
    }
    @FunctionalInterface
    public interface DLI {
        public int takesDLRetI(double a, long b);
    }
    @FunctionalInterface
    public interface OOI {
        public int takesOORetI(AdapterExerciser a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface ODI {
        public int takesODRetI(AdapterExerciser a, double b);
    }
    @FunctionalInterface
    public interface DOI {
        public int takesDORetI(double a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface LLB {
        public boolean takesLLRetB(long a, long b);
    }
    @FunctionalInterface
    public interface LOB {
        public boolean takesLORetB(long a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface OLB {
        public boolean takesOLRetB(AdapterExerciser a, long b);
    }
    @FunctionalInterface
    public interface DDB {
        public boolean takesDDRetB(double a, double b);
    }
    @FunctionalInterface
    public interface LDB {
        public boolean takesLDRetB(long a, double b);
    }
    @FunctionalInterface
    public interface DLB {
        public boolean takesDLRetB(double a, long b);
    }
    @FunctionalInterface
    public interface OOB {
        public boolean takesOORetB(AdapterExerciser a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface ODB {
        public boolean takesODRetB(AdapterExerciser a, double b);
    }
    @FunctionalInterface
    public interface DOB {
        public boolean takesDORetB(double a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface LLD {
        public double takesLLRetD(long a, long b);
    }
    @FunctionalInterface
    public interface LOD {
        public double takesLORetD(long a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface OLD {
        public double takesOLRetD(AdapterExerciser a, long b);
    }
    @FunctionalInterface
    public interface DDD {
        public double takesDDRetD(double a, double b);
    }
    @FunctionalInterface
    public interface LDD {
        public double takesLDRetD(long a, double b);
    }
    @FunctionalInterface
    public interface DLD {
        public double takesDLRetD(double a, long b);
    }
    @FunctionalInterface
    public interface OOD {
        public double takesOORetD(AdapterExerciser a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface ODD {
        public double takesODRetD(AdapterExerciser a, double b);
    }
    @FunctionalInterface
    public interface DOD {
        public double takesDORetD(double a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface LLO {
        public AdapterExerciser takesLLRetO(long a, long b);
    }
    @FunctionalInterface
    public interface LOO {
        public AdapterExerciser takesLORetO(long a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface OLO {
        public AdapterExerciser takesOLRetO(AdapterExerciser a, long b);
    }
    @FunctionalInterface
    public interface DDO {
        public AdapterExerciser takesDDRetO(double a, double b);
    }
    @FunctionalInterface
    public interface LDO {
        public AdapterExerciser takesLDRetO(long a, double b);
    }
    @FunctionalInterface
    public interface DLO {
        public AdapterExerciser takesDLRetO(double a, long b);
    }
    @FunctionalInterface
    public interface OOO {
        public AdapterExerciser takesOORetO(AdapterExerciser a, AdapterExerciser b);
    }
    @FunctionalInterface
    public interface ODO {
        public AdapterExerciser takesODRetO(AdapterExerciser a, double b);
    }
    @FunctionalInterface
    public interface DOO {
        public AdapterExerciser takesDORetO(double a, AdapterExerciser b);
    }

    @FunctionalInterface
    public interface OOOO {
        public AdapterExerciser takesOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c);
    }
    @FunctionalInterface
    public interface OOOOO {
        public AdapterExerciser takesOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d);
    }
    @FunctionalInterface
    public interface OOOOOO {
        public AdapterExerciser takesOOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e);
    }
    @FunctionalInterface
    public interface OOOOOOO {
        public AdapterExerciser takesOOOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f);
    }
    @FunctionalInterface
    public interface OOOOOOOO {
        public AdapterExerciser takesOOOOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g);
    }
    @FunctionalInterface
    public interface OOOOOOOOO {
        public AdapterExerciser takesOOOOOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g, AdapterExerciser h);
    }
    @FunctionalInterface
    public interface OOOOOOOOOO {
        public AdapterExerciser takesOOOOOOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g, AdapterExerciser h, AdapterExerciser i);
    }
    @FunctionalInterface
    public interface OOOOOOOOOOO {
        public AdapterExerciser takesOOOOOOOOOORetO(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g, AdapterExerciser h, AdapterExerciser i, AdapterExerciser j);
    }
    @FunctionalInterface
    public interface OOOB {
        public boolean takesOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c);
    }
    @FunctionalInterface
    public interface OOOOB {
        public boolean takesOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d);
    }
    @FunctionalInterface
    public interface OOOOOB {
        public boolean takesOOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e);
    }
    @FunctionalInterface
    public interface OOOOOOB {
        public boolean takesOOOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f);
    }
    @FunctionalInterface
    public interface OOOOOOOB {
        public boolean takesOOOOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g);
    }
    @FunctionalInterface
    public interface OOOOOOOOB {
        public boolean takesOOOOOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g, AdapterExerciser h);
    }
    @FunctionalInterface
    public interface OOOOOOOOOB {
        public boolean takesOOOOOOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g, AdapterExerciser h, AdapterExerciser i);
    }
    @FunctionalInterface
    public interface OOOOOOOOOOB {
        public boolean takesOOOOOOOOOORetB(AdapterExerciser a, AdapterExerciser b, AdapterExerciser c, AdapterExerciser d, AdapterExerciser e, AdapterExerciser f, AdapterExerciser g, AdapterExerciser h, AdapterExerciser i, AdapterExerciser j);
    }

    public int methodL(L a)                     { return 1; }
    public int methodI(I a)                     { return 2; }
    public int methodB(B a)                     { return 3; }
    public int methodD(D a)                     { return 4; }
    public int methodO(O a)                     { return 5; }
    public int methodLL(LL a)                   { return 6; }
    public int methodDL(DL a)                   { return 7; }
    public int methodOL(OL a)                   { return 8; }
    public int methodLI(LI a)                   { return 9; }
    public int methodDI(DI a)                   { return 10; }
    public int methodOI(OI a)                   { return 11; }
    public int methodLB(LB a)                   { return 12; }
    public int methodDB(DB a)                   { return 13; }
    public int methodOB(OB a)                   { return 14; }
    public int methodOD(OD a)                   { return 15; }
    public int methodLD(LD a)                   { return 16; }
    public int methodDD(DD a)                   { return 17; }
    public int methodLO(LO a)                   { return 18; }
    public int methodDO(DO a)                   { return 19; }
    public int methodOO(OO a)                   { return 20; }
    public int methodLLL(LLL a)                 { return 21; }
    public int methodLOL(LOL a)                 { return 22; }
    public int methodOLL(OLL a)                 { return 23; }
    public int methodDDL(DDL a)                 { return 24; }
    public int methodLDL(LDL a)                 { return 25; }
    public int methodDLL(DLL a)                 { return 26; }
    public int methodOOL(OOL a)                 { return 27; }
    public int methodODL(ODL a)                 { return 28; }
    public int methodDOL(DOL a)                 { return 29; }
    public int methodLLI(LLI a)                 { return 30; }
    public int methodLOI(LOI a)                 { return 31; }
    public int methodOLI(OLI a)                 { return 32; }
    public int methodDDI(DDI a)                 { return 33; }
    public int methodLDI(LDI a)                 { return 34; }
    public int methodDLI(DLI a)                 { return 35; }
    public int methodOOI(OOI a)                 { return 36; }
    public int methodODI(ODI a)                 { return 37; }
    public int methodDOI(DOI a)                 { return 38; }
    public int methodLLB(LLB a)                 { return 39; }
    public int methodLOB(LOB a)                 { return 40; }
    public int methodOLB(OLB a)                 { return 41; }
    public int methodDDB(DDB a)                 { return 42; }
    public int methodLDB(LDB a)                 { return 43; }
    public int methodDLB(DLB a)                 { return 44; }
    public int methodOOB(OOB a)                 { return 45; }
    public int methodODB(ODB a)                 { return 46; }
    public int methodDOB(DOB a)                 { return 47; }
    public int methodLLD(LLD a)                 { return 48; }
    public int methodLOD(LOD a)                 { return 49; }
    public int methodOLD(OLD a)                 { return 50; }
    public int methodDDD(DDD a)                 { return 51; }
    public int methodLDD(LDD a)                 { return 52; }
    public int methodDLD(DLD a)                 { return 53; }
    public int methodOOD(OOD a)                 { return 54; }
    public int methodODD(ODD a)                 { return 55; }
    public int methodDOD(DOD a)                 { return 56; }
    public int methodLLO(LLO a)                 { return 57; }
    public int methodLOO(LOO a)                 { return 58; }
    public int methodOLO(OLO a)                 { return 59; }
    public int methodDDO(DDO a)                 { return 60; }
    public int methodLDO(LDO a)                 { return 61; }
    public int methodDLO(DLO a)                 { return 62; }
    public int methodOOO(OOO a)                 { return 63; }
    public int methodODO(ODO a)                 { return 64; }
    public int methodDOO(DOO a)                 { return 65; }
    public int methodOOOO(OOOO a)               { return 66; }
    public int methodOOOOO(OOOOO a)             { return 67; }
    public int methodOOOOOO(OOOOOO a)           { return 68; }
    public int methodOOOOOOO(OOOOOOO a)         { return 69; }
    public int methodOOOOOOOO(OOOOOOOO a)       { return 70; }
    public int methodOOOOOOOOO(OOOOOOOOO a)     { return 71; }
    public int methodOOOOOOOOOO(OOOOOOOOOO a)   { return 72; }
    public int methodOOOOOOOOOOO(OOOOOOOOOOO a) { return 73; }
    public int methodOOOB(OOOB a)               { return 74; }
    public int methodOOOOB(OOOOB a)             { return 75; }
    public int methodOOOOOB(OOOOOB a)           { return 76; }
    public int methodOOOOOOB(OOOOOOB a)         { return 77; }
    public int methodOOOOOOOB(OOOOOOOB a)       { return 78; }
    public int methodOOOOOOOOB(OOOOOOOOB a)     { return 79; }
    public int methodOOOOOOOOOB(OOOOOOOOOB a)   { return 80; }
    public int methodOOOOOOOOOOB(OOOOOOOOOOB a) { return 81; }
}
