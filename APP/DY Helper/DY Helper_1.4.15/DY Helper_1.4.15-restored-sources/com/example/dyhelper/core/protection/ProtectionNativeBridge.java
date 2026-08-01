package com.example.dyhelper.core.protection;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProtectionNativeBridge {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f2247 = null;

    static {
            kt0 r0 = new kt0
            r1 = 23
            r0.<init>(r1)
            qq0 r1 = p000.qq0.f9079
            oq0 r0 = p000.ln0.m3611(r1, r0)
            com.example.dyhelper.core.protection.ProtectionNativeBridge.f2247 = r0
            return
    }

    private static final native java.lang.String nativeDecode(java.lang.String r0);

    private static final native boolean nativeEvaluate(int r0, int[] r1);

    /* JADX INFO: renamed from: α */
    public static java.lang.String m1315(java.lang.String r1) {
            r0 = 126(0x7e, float:1.77E-43)
            boolean r0 = p000.q02.m4684(r1, r0)
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = com.example.dyhelper.core.protection.ProtectionNativeBridge.f2247
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            java.lang.String r1 = nativeDecode(r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L26
            return r1
        L26:
            java.lang.String r1 = "invalid protected string"
            p000.C1080.m7279(r1)
        L2b:
            r1 = 0
            return r1
        L2d:
            java.lang.String r1 = "release native protection unavailable"
            p000.C1080.m7279(r1)
            goto L2b
    }

    /* JADX INFO: renamed from: β */
    public static boolean m1316(int r1, int[] r2) {
            java.lang.Object r0 = com.example.dyhelper.core.protection.ProtectionNativeBridge.f2247
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L13
            boolean r1 = nativeEvaluate(r1, r2)
            return r1
        L13:
            r1 = 0
            return r1
    }
}
