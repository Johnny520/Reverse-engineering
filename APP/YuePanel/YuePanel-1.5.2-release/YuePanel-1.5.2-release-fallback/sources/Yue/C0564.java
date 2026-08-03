package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0564 extends Yue.AbstractC2455 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final float[] f1470;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f1471;

    public C0564(@Yue.InterfaceC4418 float[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f1470 = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f1471
            float[] r1 = r2.f1470
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.AbstractC2455
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float mo2005() {
            r3 = this;
            float[] r0 = r3.f1470     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f1471     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f1471 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        Lb:
            r0 = move-exception
            int r1 = r3.f1471
            int r1 = r1 + (-1)
            r3.f1471 = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }
}
