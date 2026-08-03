package p150k5;

import ac.C0058k;
import java.util.Iterator;

/* JADX INFO: renamed from: k5.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2246b0 implements Iterable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7445g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7446h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0058k f7447i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2246b0(C0058k c0058k, int i9, int i10) {
        this.f7447i = c0058k;
        this.f7445g = i9;
        this.f7446h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2244a0(this, ((C2270u) this.f7447i.f177i).f7532b, this.f7445g);
    }
}
