package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲀᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1174 extends java.lang.Enum {
    private static final /* synthetic */ xhss.EnumC1174[] $VALUES = null;
    public static final xhss.C1110 Companion = null;
    public static final xhss.EnumC1174 ON_ANY = null;
    public static final xhss.EnumC1174 ON_CREATE = null;
    public static final xhss.EnumC1174 ON_DESTROY = null;
    public static final xhss.EnumC1174 ON_PAUSE = null;
    public static final xhss.EnumC1174 ON_RESUME = null;
    public static final xhss.EnumC1174 ON_START = null;
    public static final xhss.EnumC1174 ON_STOP = null;

    static {
            xhss.ᲈᲀᛵᛸ r0 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r1 = "ON_CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            xhss.EnumC1174.ON_CREATE = r0
            xhss.ᲈᲀᛵᛸ r1 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r2 = "ON_START"
            r3 = 1
            r1.<init>(r2, r3)
            xhss.EnumC1174.ON_START = r1
            xhss.ᲈᲀᛵᛸ r2 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r3 = "ON_RESUME"
            r4 = 2
            r2.<init>(r3, r4)
            xhss.EnumC1174.ON_RESUME = r2
            xhss.ᲈᲀᛵᛸ r3 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r4 = "ON_PAUSE"
            r5 = 3
            r3.<init>(r4, r5)
            xhss.EnumC1174.ON_PAUSE = r3
            xhss.ᲈᲀᛵᛸ r4 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r5 = "ON_STOP"
            r6 = 4
            r4.<init>(r5, r6)
            xhss.EnumC1174.ON_STOP = r4
            xhss.ᲈᲀᛵᛸ r5 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r6 = "ON_DESTROY"
            r7 = 5
            r5.<init>(r6, r7)
            xhss.EnumC1174.ON_DESTROY = r5
            xhss.ᲈᲀᛵᛸ r6 = new xhss.ᲈᲀᛵᛸ
            java.lang.String r7 = "ON_ANY"
            r8 = 6
            r6.<init>(r7, r8)
            xhss.EnumC1174.ON_ANY = r6
            xhss.ᲈᲀᛵᛸ[] r0 = new xhss.EnumC1174[]{r0, r1, r2, r3, r4, r5, r6}
            xhss.EnumC1174.$VALUES = r0
            xhss.ᲇᲈᲁᲈ r0 = new xhss.ᲇᲈᲁᲈ
            r0.<init>()
            xhss.EnumC1174.Companion = r0
            return
    }

    public static xhss.EnumC1174 valueOf(java.lang.String r1) {
            java.lang.Class<xhss.ᲈᲀᛵᛸ> r0 = xhss.EnumC1174.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xhss.ᲈᲀᛵᛸ r1 = (xhss.EnumC1174) r1
            return r1
    }

    public static xhss.EnumC1174[] values() {
            xhss.ᲈᲀᛵᛸ[] r0 = xhss.EnumC1174.$VALUES
            java.lang.Object r0 = r0.clone()
            xhss.ᲈᲀᛵᛸ[] r0 = (xhss.EnumC1174[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.EnumC0064 m1864() {
            r2 = this;
            int[] r0 = xhss.AbstractC0665.f2275
            int r1 = r2.ordinal()
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
            r1.append(r2)
            java.lang.String r2 = " has no target state"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L22:
            xhss.ᛱᛷᛸᲁ r2 = xhss.EnumC0064.f351
            return r2
        L25:
            xhss.ᛱᛷᛸᲁ r2 = xhss.EnumC0064.f356
            return r2
        L28:
            xhss.ᛱᛷᛸᲁ r2 = xhss.EnumC0064.f353
            return r2
        L2b:
            xhss.ᛱᛷᛸᲁ r2 = xhss.EnumC0064.f355
            return r2
    }
}
