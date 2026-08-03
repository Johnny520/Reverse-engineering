package p150k5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p207o5.AbstractC3063r;

/* JADX INFO: renamed from: k5.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2252e0 extends AbstractC3063r {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7461j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2254f0 f7462k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2252e0(C2254f0 c2254f0, C0119x c0119x, int i9, int i10, int i11) {
        super(c0119x, i9, i10);
        this.f7462k = c2254f0;
        this.f7461j = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3063r
    /* JADX INFO: renamed from: a */
    public final Object mo5499a(C0016a c0016a, int i9) {
        return i9 == this.f7461j + (-1) ? new C2249d(c0016a) : new C2256g0(this.f7462k.f7470a, c0016a);
    }
}
