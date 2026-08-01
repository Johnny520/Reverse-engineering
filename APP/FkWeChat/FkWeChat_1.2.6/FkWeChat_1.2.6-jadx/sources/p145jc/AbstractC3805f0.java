package p145jc;

/* JADX INFO: renamed from: jc.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3805f0 {

    /* JADX INFO: renamed from: a */
    public static final int f10978a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static final int m15161a() {
        return f10978a;
    }

    /* JADX INFO: renamed from: b */
    public static final String m15162b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
