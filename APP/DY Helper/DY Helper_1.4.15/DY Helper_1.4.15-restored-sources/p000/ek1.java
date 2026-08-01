package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ek1 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0208dd f3583 = null;

    static {
            dd r0 = p000.C0208dd.f3085
            java.lang.String r0 = "xn--"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.ek1.f3583 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m1926(int r0, int r1, boolean r2) {
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

    /* JADX INFO: renamed from: β */
    public static int m1927(int r3) {
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
