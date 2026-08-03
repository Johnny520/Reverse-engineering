package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class d4 implements java.util.Iterator<java.lang.Integer>, p000.n4 {
    public d4() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Integer next() {
            r1 = this;
            int r0 = r1.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
