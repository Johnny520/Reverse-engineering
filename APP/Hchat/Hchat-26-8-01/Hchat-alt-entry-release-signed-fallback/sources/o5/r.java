package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends java.util.AbstractSequentialList {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.x f9539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9541i;

    public r(androidx.lifecycle.x r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f9539g = r1
            r0.f9540h = r2
            r0.f9541i = r3
            return
    }

    public abstract java.lang.Object a(a5.a r1, int r2);

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r6 = this;
            k5.l r0 = new k5.l
            int r4 = r6.f9541i
            r5 = 3
            androidx.lifecycle.x r2 = r6.f9539g
            int r3 = r6.f9540h
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r7) {
            r6 = this;
            k5.l r0 = new k5.l
            int r4 = r6.f9541i
            r5 = 3
            androidx.lifecycle.x r2 = r6.f9539g
            int r3 = r6.f9540h
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 0
        Le:
            if (r1 >= r7) goto L16
            r0.next()
            int r1 = r1 + 1
            goto Le
        L16:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f9541i
            return r0
    }
}
