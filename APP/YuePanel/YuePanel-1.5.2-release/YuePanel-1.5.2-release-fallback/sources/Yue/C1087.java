package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1087 extends Yue.AbstractC1084 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f3228;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f3229;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f3230;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f3231;

    public C1087(char r3, char r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f3228 = r5
            r2.f3229 = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto L13
            int r5 = Yue.C3329.m13910(r3, r4)
            if (r5 > 0) goto L1a
        L11:
            r0 = r1
            goto L1a
        L13:
            int r5 = Yue.C3329.m13910(r3, r4)
            if (r5 < 0) goto L1a
            goto L11
        L1a:
            r2.f3230 = r0
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            r2.f3231 = r3
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f3230
            return r0
    }

    @Override // Yue.AbstractC1084
    /* JADX INFO: renamed from: ۥ۟ */
    public char mo1983() {
            r2 = this;
            int r0 = r2.f3231
            int r1 = r2.f3229
            if (r0 != r1) goto L14
            boolean r1 = r2.f3230
            if (r1 == 0) goto Le
            r1 = 0
            r2.f3230 = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.f3228
            int r1 = r1 + r0
            r2.f3231 = r1
        L19:
            char r0 = (char) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m5765() {
            r1 = this;
            int r0 = r1.f3228
            return r0
    }
}
