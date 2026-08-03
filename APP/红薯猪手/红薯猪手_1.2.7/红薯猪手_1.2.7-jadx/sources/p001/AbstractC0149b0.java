package p001;

/* JADX INFO: renamed from: ۟.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0149b0 implements InterfaceC0425v3 {

    /* JADX INFO: renamed from: ۥ */
    public static final StringBuilder f695 = new StringBuilder();

    /* JADX INFO: renamed from: ۟.b0$a */
    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public static void m817(Throwable th) {
            C0341oa.m915(new byte[]{-118}, new byte[]{-17, 110, 48, 52, -16, 28});
            C0341oa.m915(new byte[]{-56, 79, -59, -65, -95, -65, -54}, new byte[]{-12, 60, -96, -53, -116, -128});
            StringBuilder sb = AbstractC0149b0.f695;
            sb.setLength(0);
            sb.append(th.toString());
            for (int i = 0; i < 3; i++) {
                StringBuilder sb2 = AbstractC0149b0.f695;
                sb2.append('\n');
                sb2.append(th.getStackTrace()[i]);
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            C0237h4.m865(stackTrace);
            for (StackTraceElement stackTraceElement : stackTrace) {
            }
        }
    }

    static {
        new Throwable();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract String mo816();
}
