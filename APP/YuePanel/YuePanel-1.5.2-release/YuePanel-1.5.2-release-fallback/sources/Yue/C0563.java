package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0563 extends Yue.AbstractC1960 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final double[] f1468;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f1469;

    public C0563(@Yue.InterfaceC4418 double[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f1468 = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f1469
            double[] r1 = r2.f1468
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.AbstractC1960
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public double mo2004() {
            r3 = this;
            double[] r0 = r3.f1468     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f1469     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f1469 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r1 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r1
        Lb:
            r0 = move-exception
            int r1 = r3.f1469
            int r1 = r1 + (-1)
            r3.f1469 = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }
}
