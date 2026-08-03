package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1140 implements java.util.Iterator {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f3510;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f3511;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f3512;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f3513;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ Yue.C1141 f3514;

    public C1140(Yue.C1141 r3) {
            r2 = this;
            r2.<init>()
            r2.f3514 = r3
            int r0 = Yue.C1141.m5990(r3)
            r2.f3510 = r0
            int r1 = Yue.C1141.m5991(r3)
            r2.f3511 = r1
            int r3 = Yue.C1141.m5992(r3)
            r2.f3512 = r3
            r2.f3513 = r0
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            r1.m5989()
            int r0 = r1.f3512
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r3 = this;
            r3.m5989()
            int r0 = r3.f3512
            if (r0 == 0) goto L21
            int r0 = r0 + (-1)
            r3.f3512 = r0
            Yue.ۥ۟ۤۦۨ r0 = r3.f3514
            java.lang.Object[] r0 = Yue.C1141.m5993(r0)
            int r1 = r3.f3513
            r0 = r0[r1]
            int r1 = r1 + 1
            Yue.ۥ۟ۤۦۨ r2 = r3.f3514
            int r2 = Yue.C1141.m5994(r2)
            r1 = r1 & r2
            r3.f3513 = r1
            return r0
        L21:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m5989() {
            r2 = this;
            int r0 = r2.f3510
            Yue.ۥ۟ۤۦۨ r1 = r2.f3514
            int r1 = Yue.C1141.m5990(r1)
            if (r0 != r1) goto L1b
            int r0 = r2.f3511
            Yue.ۥ۟ۤۦۨ r1 = r2.f3514
            int r1 = Yue.C1141.m5991(r1)
            if (r0 != r1) goto L15
            return
        L15:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        L1b:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }
}
