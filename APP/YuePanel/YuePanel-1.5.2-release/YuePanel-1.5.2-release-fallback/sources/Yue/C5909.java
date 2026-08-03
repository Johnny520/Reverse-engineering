package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5909 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.Object[] f21566;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f21567;

    public C5909() {
            r1 = this;
            r0 = 15
            r1.<init>(r0)
            return
    }

    public C5909(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto Ld
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f21566 = r1
            r1 = 0
            r0.f21567 = r1
            return
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public C5909(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f21566 = r1
            r0.f21567 = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object r1) {
            r0 = this;
            r0.push(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r3 = this;
            java.lang.Object[] r0 = r3.f21566
        L2:
            int r1 = r3.f21567
            if (r1 <= 0) goto Le
            int r1 = r1 + (-1)
            r3.f21567 = r1
            r2 = 0
            r0[r1] = r2
            goto L2
        Le:
            return
    }

    public java.lang.Object clone() {
            r4 = this;
            int r0 = r4.f21567
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.f21566
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            Yue.ۥۣۢ۟ۧ r0 = new Yue.ۥۣۢ۟ۧ
            int r2 = r4.f21567
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f21567
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
            r4 = this;
            int r0 = r4.f21567
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.f21566
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            Yue.ۥ۟ۡۧۧ r0 = new Yue.ۥ۟ۡۧۧ
            r0.<init>(r1)
            return r0
    }

    public java.lang.Object peek() {
            r2 = this;
            java.lang.Object[] r0 = r2.f21566     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            int r1 = r2.f21567     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            int r1 = r1 + (-1)
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            return r0
        L9:
            java.util.EmptyStackException r0 = new java.util.EmptyStackException
            r0.<init>()
            throw r0
    }

    public java.lang.Object pop() {
            r4 = this;
            java.lang.Object[] r0 = r4.f21566     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            int r1 = r4.f21567     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            int r1 = r1 + (-1)
            r4.f21567 = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            r2 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            r3 = 0
            r0[r1] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Le
            return r2
        Le:
            int r0 = r4.f21567
            if (r0 >= 0) goto L15
            r0 = 0
            r4.f21567 = r0
        L15:
            java.util.EmptyStackException r0 = new java.util.EmptyStackException
            r0.<init>()
            throw r0
    }

    public void push(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f21567
            java.lang.Object[] r1 = r3.f21566
            int r1 = r1.length
            if (r0 != r1) goto La
            r3.m21943()
        La:
            java.lang.Object[] r0 = r3.f21566
            int r1 = r3.f21567
            int r2 = r1 + 1
            r3.f21567 = r2
            r0[r1] = r4
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.f21567
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m21943() {
            r4 = this;
            int r0 = r4.f21567
            if (r0 != 0) goto La
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.f21566 = r0
            return
        La:
            int r1 = r0 * 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r4.f21566
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            r4.f21566 = r1
            return
    }
}
