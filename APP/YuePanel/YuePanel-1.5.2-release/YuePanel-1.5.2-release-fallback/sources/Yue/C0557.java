package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0557 extends Yue.AbstractC0875 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final byte[] f1451;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f1452;

    public C0557(@Yue.InterfaceC4418 byte[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f1451 = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f1452
            byte[] r1 = r2.f1451
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.AbstractC0875
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public byte mo1979() {
            r3 = this;
            byte[] r0 = r3.f1451     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f1452     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f1452 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        Lb:
            r0 = move-exception
            int r1 = r3.f1452
            int r1 = r1 + (-1)
            r3.f1452 = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }
}
