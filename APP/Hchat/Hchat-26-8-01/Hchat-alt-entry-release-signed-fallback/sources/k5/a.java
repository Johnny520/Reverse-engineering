package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends java.util.AbstractSet {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.x f7167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Comparable f7171k;

    public a(java.lang.Comparable r1, androidx.lifecycle.x r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f7170j = r5
            r0.f7171k = r1
            r0.<init>()
            r0.f7167g = r2
            r0.f7168h = r3
            r0.f7169i = r4
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r4 = this;
            o5.g r0 = new o5.g
            int r1 = r4.f7168h
            int r2 = r4.f7169i
            androidx.lifecycle.x r3 = r4.f7167g
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.f7169i
            return r0
    }
}
