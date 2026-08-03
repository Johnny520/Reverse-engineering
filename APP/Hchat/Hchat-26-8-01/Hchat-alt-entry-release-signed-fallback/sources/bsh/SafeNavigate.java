package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SafeNavigate extends java.lang.RuntimeException {
    private static final bsh.SafeNavigate abortException = null;

    static {
            bsh.SafeNavigate r0 = new bsh.SafeNavigate
            r0.<init>()
            bsh.SafeNavigate.abortException = r0
            return
    }

    private SafeNavigate() {
            r0 = this;
            r0.<init>()
            return
    }

    public static bsh.SafeNavigate doAbort() {
            bsh.SafeNavigate r0 = bsh.SafeNavigate.abortException
            return r0
    }
}
