package p150k5;

import p164l5.C2481b0;
import p164l5.C2483c0;
import p180m5.C2781b;

/* JADX INFO: renamed from: k5.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2267r extends AbstractC2269t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7526g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7527h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f7528i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2267r(int i9, int i10, Object obj) {
        this.f7526g = i10;
        this.f7528i = obj;
        this.f7527h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p150k5.AbstractC2269t
    /* JADX INFO: renamed from: a */
    public final Object mo5496a(int i9) {
        switch (this.f7526g) {
            case 0:
                C2270u c2270u = (C2270u) this.f7528i;
                return new C2781b(c2270u, (i9 * 12) + c2270u.f7546p + 4);
            default:
                return new C2481b0(this, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f7526g) {
            case 0:
                return this.f7527h;
            default:
                return ((C2483c0) this.f7528i).f8126d;
        }
    }
}
