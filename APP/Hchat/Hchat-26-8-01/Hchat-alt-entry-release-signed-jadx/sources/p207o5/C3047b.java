package p207o5;

import p150k5.C2245b;
import p150k5.C2270u;

/* JADX INFO: renamed from: o5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3047b extends AbstractC3060o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2270u f9867g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9868h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f9869i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3047b(C2270u c2270u, int i9, int i10) {
        this.f9867g = c2270u;
        this.f9868h = i9;
        this.f9869i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3060o
    /* JADX INFO: renamed from: a */
    public final Object mo5520a(int i9) {
        C2270u c2270u = this.f9867g;
        return new C2245b(c2270u, c2270u.f7532b.m583N((i9 * 4) + this.f9868h + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9869i;
    }
}
