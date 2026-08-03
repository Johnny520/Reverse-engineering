package bsh;

import java.io.PrintStream;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ConsoleAssignable extends ConsoleInterface {
    void setErr(PrintStream printStream);

    void setIn(Reader reader);

    void setOut(PrintStream printStream);
}
