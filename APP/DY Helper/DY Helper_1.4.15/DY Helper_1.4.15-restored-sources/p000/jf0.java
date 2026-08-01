package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jf0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f5453 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.jf0.f5453 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.String m2957(java.lang.String r2) {
            java.lang.Character r0 = p000.q02.m4658(r2)
            if (r0 != 0) goto L7
            goto Lf
        L7:
            char r0 = r0.charValue()
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 == r1) goto L10
        Lf:
            return r2
        L10:
            java.util.concurrent.ConcurrentHashMap r0 = p000.jf0.f5453
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L28
            java.lang.String r1 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1315(r2)
            java.lang.Object r2 = r0.putIfAbsent(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L27
            return r1
        L27:
            return r2
        L28:
            return r1
    }
}
