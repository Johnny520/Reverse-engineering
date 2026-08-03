package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ConsoleInterface {
    void error(java.lang.Object r1);

    java.io.PrintStream getErr();

    java.io.Reader getIn();

    java.io.PrintStream getOut();

    void print(java.lang.Object r1);

    void println(java.lang.Object r1);

    default void prompt(java.lang.String r1) {
            r0 = this;
            r0.print(r1)
            return
    }
}
