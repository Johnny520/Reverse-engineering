package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0554 extends Yue.AbstractC0799 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final boolean[] f1443;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f1444;

    public C0554(@Yue.InterfaceC4418 boolean[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f1443 = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f1444
            boolean[] r1 = r2.f1443
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.AbstractC0799
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean mo1954() {
            r3 = this;
            boolean[] r0 = r3.f1443     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f1444     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f1444 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            boolean r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        Lb:
            r0 = move-exception
            int r1 = r3.f1444
            int r1 = r1 + (-1)
            r3.f1444 = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }
}
