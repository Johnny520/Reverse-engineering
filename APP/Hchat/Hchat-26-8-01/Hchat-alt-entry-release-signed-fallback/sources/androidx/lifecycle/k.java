package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum k extends java.lang.Enum {
    private static final /* synthetic */ zf.a $ENTRIES = null;
    private static final /* synthetic */ androidx.lifecycle.k[] $VALUES = null;
    public static final androidx.lifecycle.i Companion = null;
    public static final androidx.lifecycle.k ON_ANY = null;
    public static final androidx.lifecycle.k ON_CREATE = null;
    public static final androidx.lifecycle.k ON_DESTROY = null;
    public static final androidx.lifecycle.k ON_PAUSE = null;
    public static final androidx.lifecycle.k ON_RESUME = null;
    public static final androidx.lifecycle.k ON_START = null;
    public static final androidx.lifecycle.k ON_STOP = null;

    static {
            androidx.lifecycle.k r0 = new androidx.lifecycle.k
            java.lang.String r1 = "ON_CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.lifecycle.k.ON_CREATE = r0
            androidx.lifecycle.k r1 = new androidx.lifecycle.k
            java.lang.String r2 = "ON_START"
            r3 = 1
            r1.<init>(r2, r3)
            androidx.lifecycle.k.ON_START = r1
            androidx.lifecycle.k r2 = new androidx.lifecycle.k
            java.lang.String r3 = "ON_RESUME"
            r4 = 2
            r2.<init>(r3, r4)
            androidx.lifecycle.k.ON_RESUME = r2
            androidx.lifecycle.k r3 = new androidx.lifecycle.k
            java.lang.String r4 = "ON_PAUSE"
            r5 = 3
            r3.<init>(r4, r5)
            androidx.lifecycle.k.ON_PAUSE = r3
            androidx.lifecycle.k r4 = new androidx.lifecycle.k
            java.lang.String r5 = "ON_STOP"
            r6 = 4
            r4.<init>(r5, r6)
            androidx.lifecycle.k.ON_STOP = r4
            androidx.lifecycle.k r5 = new androidx.lifecycle.k
            java.lang.String r6 = "ON_DESTROY"
            r7 = 5
            r5.<init>(r6, r7)
            androidx.lifecycle.k.ON_DESTROY = r5
            androidx.lifecycle.k r6 = new androidx.lifecycle.k
            java.lang.String r7 = "ON_ANY"
            r8 = 6
            r6.<init>(r7, r8)
            androidx.lifecycle.k.ON_ANY = r6
            androidx.lifecycle.k[] r0 = new androidx.lifecycle.k[]{r0, r1, r2, r3, r4, r5, r6}
            androidx.lifecycle.k.$VALUES = r0
            zf.b r1 = new zf.b
            r1.<init>(r0)
            androidx.lifecycle.k.$ENTRIES = r1
            androidx.lifecycle.i r0 = new androidx.lifecycle.i
            r0.<init>()
            androidx.lifecycle.k.Companion = r0
            return
    }

    public static androidx.lifecycle.k valueOf(java.lang.String r1) {
            java.lang.Class<androidx.lifecycle.k> r0 = androidx.lifecycle.k.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.lifecycle.k r1 = (androidx.lifecycle.k) r1
            return r1
    }

    public static androidx.lifecycle.k[] values() {
            androidx.lifecycle.k[] r0 = androidx.lifecycle.k.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.lifecycle.k[] r0 = (androidx.lifecycle.k[]) r0
            return r0
    }

    public final androidx.lifecycle.l a() {
            r3 = this;
            int[] r0 = androidx.lifecycle.j.f288a
            int r1 = r3.ordinal()
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
            okio.a.k()
            r0 = 0
            return r0
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " has no target state"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L27:
            androidx.lifecycle.l r0 = androidx.lifecycle.l.f289g
            return r0
        L2a:
            androidx.lifecycle.l r0 = androidx.lifecycle.l.f293k
            return r0
        L2d:
            androidx.lifecycle.l r0 = androidx.lifecycle.l.f292j
            return r0
        L30:
            androidx.lifecycle.l r0 = androidx.lifecycle.l.f291i
            return r0
    }
}
