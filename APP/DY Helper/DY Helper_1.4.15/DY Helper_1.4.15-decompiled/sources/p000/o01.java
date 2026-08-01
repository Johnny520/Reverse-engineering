package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class o01 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.String f7854 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String f7855 = null;

    static {
            r0 = 10
            java.lang.String r1 = "H"
            r2 = 1
            int r3 = r1.length()
            if (r3 == 0) goto L38
            if (r3 == r2) goto L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r1.length()
            int r4 = r4 * r0
            r3.<init>(r4)
        L17:
            r3.append(r1)
            if (r2 == r0) goto L1f
            int r2 = r2 + 1
            goto L17
        L1f:
            java.lang.String r1 = r3.toString()
            goto L3a
        L24:
            r2 = 0
            char r1 = r1.charAt(r2)
            char[] r3 = new char[r0]
        L2b:
            if (r2 >= r0) goto L32
            r3[r2] = r1
            int r2 = r2 + 1
            goto L2b
        L32:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L3a
        L38:
            java.lang.String r1 = ""
        L3a:
            p000.o01.f7854 = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.o01.f7855 = r0
            return
    }
}
