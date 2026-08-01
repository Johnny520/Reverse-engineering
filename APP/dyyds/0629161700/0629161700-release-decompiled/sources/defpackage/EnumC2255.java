package defpackage;

/* JADX INFO: renamed from: ᲈᛶᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2255 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.EnumC2255[] $VALUES = null;
    public static final defpackage.C0704 Companion = null;
    public static final defpackage.EnumC2255 ON_ANY = null;
    public static final defpackage.EnumC2255 ON_CREATE = null;
    public static final defpackage.EnumC2255 ON_DESTROY = null;
    public static final defpackage.EnumC2255 ON_PAUSE = null;
    public static final defpackage.EnumC2255 ON_RESUME = null;
    public static final defpackage.EnumC2255 ON_START = null;
    public static final defpackage.EnumC2255 ON_STOP = null;

    static {
            ᲈᛶᛱᛲ r0 = new ᲈᛶᛱᛲ
            java.lang.String r1 = "ON_CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.EnumC2255.ON_CREATE = r0
            ᲈᛶᛱᛲ r1 = new ᲈᛶᛱᛲ
            java.lang.String r2 = "ON_START"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.EnumC2255.ON_START = r1
            ᲈᛶᛱᛲ r2 = new ᲈᛶᛱᛲ
            java.lang.String r3 = "ON_RESUME"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.EnumC2255.ON_RESUME = r2
            ᲈᛶᛱᛲ r3 = new ᲈᛶᛱᛲ
            java.lang.String r4 = "ON_PAUSE"
            r5 = 3
            r3.<init>(r4, r5)
            defpackage.EnumC2255.ON_PAUSE = r3
            ᲈᛶᛱᛲ r4 = new ᲈᛶᛱᛲ
            java.lang.String r5 = "ON_STOP"
            r6 = 4
            r4.<init>(r5, r6)
            defpackage.EnumC2255.ON_STOP = r4
            ᲈᛶᛱᛲ r5 = new ᲈᛶᛱᛲ
            java.lang.String r6 = "ON_DESTROY"
            r7 = 5
            r5.<init>(r6, r7)
            defpackage.EnumC2255.ON_DESTROY = r5
            ᲈᛶᛱᛲ r6 = new ᲈᛶᛱᛲ
            java.lang.String r7 = "ON_ANY"
            r8 = 6
            r6.<init>(r7, r8)
            defpackage.EnumC2255.ON_ANY = r6
            ᲈᛶᛱᛲ[] r0 = new defpackage.EnumC2255[]{r0, r1, r2, r3, r4, r5, r6}
            defpackage.EnumC2255.$VALUES = r0
            ᛴᛷᛴᛶ r0 = new ᛴᛷᛴᛶ
            r0.<init>()
            defpackage.EnumC2255.Companion = r0
            return
    }

    public static defpackage.EnumC2255 valueOf(java.lang.String r1) {
            java.lang.Class<ᲈᛶᛱᛲ> r0 = defpackage.EnumC2255.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ᲈᛶᛱᛲ r1 = (defpackage.EnumC2255) r1
            return r1
    }

    public static defpackage.EnumC2255[] values() {
            ᲈᛶᛱᛲ[] r0 = defpackage.EnumC2255.$VALUES
            java.lang.Object r0 = r0.clone()
            ᲈᛶᛱᛲ[] r0 = (defpackage.EnumC2255[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.EnumC0578 m3649() {
            r2 = this;
            int[] r0 = defpackage.AbstractC2251.f9576
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
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2853
            return r2
        L25:
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2855
            return r2
        L28:
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2854
            return r2
        L2b:
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2851
            return r2
    }
}
