package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends java.util.AbstractSet {
    public abstract java.lang.Object a(int r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            o5.n r0 = new o5.n
            r0.<init>(r1)
            return r0
    }
}
