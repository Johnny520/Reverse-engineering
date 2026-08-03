package bsh;

import java.io.PrintStream;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ConsoleInterface {
    void error(Object obj);

    PrintStream getErr();

    Reader getIn();

    PrintStream getOut();

    void print(Object obj);

    void println(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void prompt(String str) {
        print(str);
    }
}
