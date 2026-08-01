package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum br0 extends java.lang.Enum {
    private static final /* synthetic */ p000.InterfaceC0742qz $ENTRIES = null;
    private static final /* synthetic */ p000.br0[] $VALUES = null;
    public static final p000.zq0 Companion = null;
    public static final p000.br0 ON_ANY = null;
    public static final p000.br0 ON_CREATE = null;
    public static final p000.br0 ON_DESTROY = null;
    public static final p000.br0 ON_PAUSE = null;
    public static final p000.br0 ON_RESUME = null;
    public static final p000.br0 ON_START = null;
    public static final p000.br0 ON_STOP = null;

    static {
            br0 r0 = new br0
            java.lang.String r1 = "ON_CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            p000.br0.ON_CREATE = r0
            br0 r1 = new br0
            java.lang.String r2 = "ON_START"
            r3 = 1
            r1.<init>(r2, r3)
            p000.br0.ON_START = r1
            br0 r2 = new br0
            java.lang.String r3 = "ON_RESUME"
            r4 = 2
            r2.<init>(r3, r4)
            p000.br0.ON_RESUME = r2
            br0 r3 = new br0
            java.lang.String r4 = "ON_PAUSE"
            r5 = 3
            r3.<init>(r4, r5)
            p000.br0.ON_PAUSE = r3
            br0 r4 = new br0
            java.lang.String r5 = "ON_STOP"
            r6 = 4
            r4.<init>(r5, r6)
            p000.br0.ON_STOP = r4
            br0 r5 = new br0
            java.lang.String r6 = "ON_DESTROY"
            r7 = 5
            r5.<init>(r6, r7)
            p000.br0.ON_DESTROY = r5
            br0 r6 = new br0
            java.lang.String r7 = "ON_ANY"
            r8 = 6
            r6.<init>(r7, r8)
            p000.br0.ON_ANY = r6
            br0[] r0 = new p000.br0[]{r0, r1, r2, r3, r4, r5, r6}
            p000.br0.$VALUES = r0
            rz r1 = new rz
            r1.<init>(r0)
            p000.br0.$ENTRIES = r1
            zq0 r0 = new zq0
            r0.<init>()
            p000.br0.Companion = r0
            return
    }

    public static p000.br0 valueOf(java.lang.String r1) {
            java.lang.Class<br0> r0 = p000.br0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            br0 r1 = (p000.br0) r1
            return r1
    }

    public static p000.br0[] values() {
            br0[] r0 = p000.br0.$VALUES
            java.lang.Object r0 = r0.clone()
            br0[] r0 = (p000.br0[]) r0
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final p000.cr0 m1004() {
            r2 = this;
            int[] r0 = p000.ar0.f1287
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L27;
                case 7: goto L10;
                default: goto Lb;
            }
        Lb:
            p000.C1080.m7272()
            r2 = 0
            return r2
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " has no target state"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L27:
            cr0 r2 = p000.cr0.f2724
            return r2
        L2a:
            cr0 r2 = p000.cr0.f2728
            return r2
        L2d:
            cr0 r2 = p000.cr0.f2727
            return r2
        L30:
            cr0 r2 = p000.cr0.f2726
            return r2
    }
}
