package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7706 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3034 = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: ۥ */
    public static final int m3807() {
        return f3034;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m3808(@InterfaceC6399 String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
