package defpackage;

/* JADX INFO: renamed from: ᛳᛲᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0431 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1128 f2126 = null;

    static {
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.lang.String r2 = "xn--"
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f5018 = r2
            defpackage.AbstractC0431.f2126 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static int m1209(int r0, int r1, boolean r2) {
            if (r2 == 0) goto L5
            int r0 = r0 / 700
            goto L7
        L5:
            int r0 = r0 / 2
        L7:
            int r1 = r0 / r1
            int r1 = r1 + r0
            r0 = 0
        Lb:
            r2 = 455(0x1c7, float:6.38E-43)
            if (r1 <= r2) goto L14
            int r1 = r1 / 35
            int r0 = r0 + 36
            goto Lb
        L14:
            int r2 = r1 * 36
            int r1 = r1 + 38
            int r2 = r2 / r1
            int r2 = r2 + r0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static int m1210(int r3) {
            r0 = 26
            if (r3 >= r0) goto L7
            int r3 = r3 + 97
            return r3
        L7:
            r0 = 36
            if (r3 >= r0) goto Le
            int r3 = r3 + 22
            return r3
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unexpected digit: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
