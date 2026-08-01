package p002a1;

/* JADX INFO: renamed from: a1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0020k extends AbstractC0010a {

    /* JADX INFO: renamed from: s */
    public final Object f33s;

    public C0020k(Object obj, int i10) {
        super(i10, 1);
        this.f33s = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m21g();
        m25x(m23o() + 1);
        return this.f33s;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m22l();
        m25x(m23o() - 1);
        return this.f33s;
    }
}
