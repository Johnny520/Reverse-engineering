package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends java.util.AbstractList implements java.util.List, hg.c {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    public abstract java.lang.Object c(int r1);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.c(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.a()
            return r0
    }
}
