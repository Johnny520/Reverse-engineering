package p150k5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p080fb.AbstractC1184v0;
import p207o5.AbstractC3063r;
import p228p5.C3323b;

/* JADX INFO: renamed from: k5.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2250d0 extends AbstractC3063r {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7456j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f7457k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2250d0(Object obj, C0119x c0119x, int i9, int i10, int i11) {
        super(c0119x, i9, i10);
        this.f7456j = i11;
        this.f7457k = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3063r
    /* JADX INFO: renamed from: a */
    public final Object mo5499a(C0016a c0016a, int i9) {
        switch (this.f7456j) {
            case 0:
                return new C2256g0(((C2254f0) this.f7457k).f7470a, c0016a);
            default:
                return AbstractC1184v0.m3183J(((C3323b) this.f7457k).f10704g, c0016a);
        }
    }
}
