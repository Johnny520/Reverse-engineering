package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wn0 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Integer f11767 = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r1 = r0
        L19:
            if (r1 == 0) goto L22
            int r2 = r1.intValue()
            if (r2 <= 0) goto L22
            r0 = r1
        L22:
            p000.wn0.f11767 = r0
            return
    }
}
