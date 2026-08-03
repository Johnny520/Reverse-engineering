package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3278 extends Yue.AbstractC3275 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f10702;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f10703;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f10704;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f10705;

    public C3278(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f10702 = r5
            r2.f10703 = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.f10704 = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f10705 = r3
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f10704
            return r0
    }

    @Override // Yue.AbstractC3275
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo2006() {
            r2 = this;
            int r0 = r2.f10705
            int r1 = r2.f10703
            if (r0 != r1) goto L14
            boolean r1 = r2.f10704
            if (r1 == 0) goto Le
            r1 = 0
            r2.f10704 = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.f10702
            int r1 = r1 + r0
            r2.f10705 = r1
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m13742() {
            r1 = this;
            int r0 = r1.f10702
            return r0
    }
}
