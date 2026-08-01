package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class az {
    public static final defpackage.m a = null;

    static {
            java.lang.Integer r0 = defpackage.lp.a
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            r1 = 34
            if (r0 < r1) goto Ld
            goto L13
        Ld:
            qj r0 = new qj
            r0.<init>()
            goto L18
        L13:
            rx r0 = new rx
            r0.<init>()
        L18:
            defpackage.az.a = r0
            return
    }

    public az() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a(int r1);

    public abstract int b();

    public int c(int r4, int r5) {
            r3 = this;
            if (r5 <= r4) goto L34
            int r0 = r5 - r4
            if (r0 > 0) goto L14
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lb
            goto L14
        Lb:
            int r0 = r3.b()
            if (r4 > r0) goto Lb
            if (r0 >= r5) goto Lb
            return r0
        L14:
            int r5 = -r0
            r5 = r5 & r0
            if (r5 != r0) goto L23
            int r5 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r5 = 31 - r5
            int r5 = r3.a(r5)
            goto L32
        L23:
            int r5 = r3.b()
            int r5 = r5 >>> 1
            int r1 = r5 % r0
            int r5 = r5 - r1
            int r2 = r0 + (-1)
            int r2 = r2 + r5
            if (r2 < 0) goto L23
            r5 = r1
        L32:
            int r4 = r4 + r5
            return r4
        L34:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Random range is empty: ["
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ")."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
