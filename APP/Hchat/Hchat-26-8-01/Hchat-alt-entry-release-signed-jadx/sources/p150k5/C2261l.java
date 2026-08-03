package p150k5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p207o5.AbstractC3063r;
import p207o5.AbstractC3064s;

/* JADX INFO: renamed from: k5.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2261l extends AbstractC3064s {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f7503k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f7504l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2261l(Object obj, C0119x c0119x, int i9, int i10, int i11) {
        super(c0119x, i9, i10);
        this.f7503k = i11;
        this.f7504l = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3064s
    /* JADX INFO: renamed from: a */
    public final Object mo5503a(C0016a c0016a, int i9) {
        switch (this.f7503k) {
            case 0:
                return Integer.valueOf(c0016a.m211o(false));
            case 1:
                return Integer.valueOf(c0016a.m211o(false));
            case 2:
                return Integer.valueOf(c0016a.m211o(false));
            default:
                return ((AbstractC3063r) this.f7504l).mo5499a(c0016a, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3064s, java.util.ListIterator, java.util.Iterator
    public Object next() {
        switch (this.f7503k) {
            case 0:
                int i9 = this.f9908j;
                C2263n c2263n = (C2263n) this.f7504l;
                if (i9 == ((C2264o) c2263n.f7510l).f7518q) {
                    c2263n.f7507i = this.f9905g.f55h;
                }
                return (Integer) super.next();
            case 1:
                int i10 = this.f9908j;
                C2263n c2263n2 = (C2263n) this.f7504l;
                if (i10 == ((C2264o) c2263n2.f7510l).f7519r) {
                    c2263n2.f7508j = this.f9905g.f55h;
                }
                return (Integer) super.next();
            case 2:
                int i11 = this.f9908j;
                C2263n c2263n3 = (C2263n) this.f7504l;
                if (i11 == ((C2264o) c2263n3.f7510l).f7520s) {
                    c2263n3.f7509k = this.f9905g.f55h;
                }
                return (Integer) super.next();
            default:
                return super.next();
        }
    }
}
