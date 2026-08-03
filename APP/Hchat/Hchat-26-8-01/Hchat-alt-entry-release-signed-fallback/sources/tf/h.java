package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends java.util.AbstractSet implements java.util.Set, hg.e {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.a()
            return r0
    }
}
