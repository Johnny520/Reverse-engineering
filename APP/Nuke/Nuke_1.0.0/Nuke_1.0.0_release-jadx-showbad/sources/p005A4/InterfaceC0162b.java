package p005A4;

/* JADX INFO: renamed from: A4.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0162b {
    /* JADX INFO: renamed from: a */
    boolean mo229a();

    /* JADX INFO: renamed from: b */
    boolean mo230b();

    /* JADX INFO: renamed from: c */
    void mo231c(String str, Throwable th);

    /* JADX INFO: renamed from: d */
    boolean mo232d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    default boolean mo233e(int i5) {
        char c5;
        if (i5 == 1) {
            c5 = '(';
        } else if (i5 == 2) {
            c5 = 30;
        } else if (i5 == 3) {
            c5 = 20;
        } else if (i5 == 4) {
            c5 = '\n';
        } else {
            if (i5 != 5) {
                throw null;
            }
            c5 = 0;
        }
        if (c5 == 0) {
            return mo236h();
        }
        if (c5 == '\n') {
            return mo230b();
        }
        if (c5 == 20) {
            return mo234f();
        }
        if (c5 == 30) {
            return mo229a();
        }
        if (c5 == '(') {
            return mo232d();
        }
        StringBuilder sb = new StringBuilder("Level [");
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    boolean mo234f();

    /* JADX INFO: renamed from: g */
    void mo235g(String str);

    /* JADX INFO: renamed from: h */
    boolean mo236h();
}
