package p000;

/* JADX INFO: renamed from: vo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0917vo {
    /* JADX INFO: renamed from: α */
    public static boolean m6273() {
            org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
            if (r0 != 0) goto L7
            goto L2a
        L7:
            int r1 = r0.major()
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L16
            int r0 = r0.major()
            if (r0 <= r2) goto L2a
            goto L29
        L16:
            int r1 = r0.minor()
            if (r1 == r3) goto L23
            int r0 = r0.minor()
            if (r0 <= r3) goto L2a
            goto L29
        L23:
            int r0 = r0.patch()
            if (r0 < 0) goto L2a
        L29:
            return r3
        L2a:
            r0 = 0
            return r0
    }
}
