package p000;

/* JADX INFO: renamed from: lo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0519lo {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ int[] f6725 = null;

    static {
            java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
        L10:
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L19
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
        L19:
            p000.AbstractC0519lo.f6725 = r0
            return
    }
}
