package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛶᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1798 extends AbstractC0024 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static volatile C1798 f9065;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final ExecutorC0511 f9066 = new ExecutorC0511(0);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C1447 f9067 = new C1447();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static C1798 m3577() {
        if (f9065 != null) {
            return f9065;
        }
        synchronized (C1798.class) {
            try {
                if (f9065 == null) {
                    f9065 = new C1798();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9065;
    }
}
