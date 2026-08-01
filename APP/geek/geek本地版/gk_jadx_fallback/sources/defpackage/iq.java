package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum iq extends java.lang.Enum {
    private static final /* synthetic */ defpackage.iq[] $VALUES = null;
    public static final defpackage.gq Companion = null;
    public static final defpackage.iq ON_ANY = null;
    public static final defpackage.iq ON_CREATE = null;
    public static final defpackage.iq ON_DESTROY = null;
    public static final defpackage.iq ON_PAUSE = null;
    public static final defpackage.iq ON_RESUME = null;
    public static final defpackage.iq ON_START = null;
    public static final defpackage.iq ON_STOP = null;

    static {
            iq r0 = new iq
            java.lang.String r1 = "ON_CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.iq.ON_CREATE = r0
            iq r1 = new iq
            java.lang.String r2 = "ON_START"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.iq.ON_START = r1
            iq r2 = new iq
            java.lang.String r3 = "ON_RESUME"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.iq.ON_RESUME = r2
            iq r3 = new iq
            java.lang.String r4 = "ON_PAUSE"
            r5 = 3
            r3.<init>(r4, r5)
            defpackage.iq.ON_PAUSE = r3
            iq r4 = new iq
            java.lang.String r5 = "ON_STOP"
            r6 = 4
            r4.<init>(r5, r6)
            defpackage.iq.ON_STOP = r4
            iq r5 = new iq
            java.lang.String r6 = "ON_DESTROY"
            r7 = 5
            r5.<init>(r6, r7)
            defpackage.iq.ON_DESTROY = r5
            iq r6 = new iq
            java.lang.String r7 = "ON_ANY"
            r8 = 6
            r6.<init>(r7, r8)
            defpackage.iq.ON_ANY = r6
            iq[] r0 = new defpackage.iq[]{r0, r1, r2, r3, r4, r5, r6}
            defpackage.iq.$VALUES = r0
            gq r0 = new gq
            r0.<init>()
            defpackage.iq.Companion = r0
            return
    }

    public static defpackage.iq valueOf(java.lang.String r1) {
            java.lang.Class<iq> r0 = defpackage.iq.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            iq r1 = (defpackage.iq) r1
            return r1
    }

    public static defpackage.iq[] values() {
            iq[] r0 = defpackage.iq.$VALUES
            java.lang.Object r0 = r0.clone()
            iq[] r0 = (defpackage.iq[]) r0
            return r0
    }

    public final defpackage.jq a() {
            r3 = this;
            int[] r0 = defpackage.hq.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L2b;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L25;
                case 6: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " has no target state"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            jq r0 = defpackage.jq.a
            return r0
        L25:
            jq r0 = defpackage.jq.e
            return r0
        L28:
            jq r0 = defpackage.jq.d
            return r0
        L2b:
            jq r0 = defpackage.jq.c
            return r0
    }
}
