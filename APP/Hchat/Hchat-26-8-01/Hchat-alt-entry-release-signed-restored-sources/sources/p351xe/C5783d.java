package p351xe;

import java.util.BitSet;
import java.util.function.Consumer;
import p199nd.C2988t;
import p302ud.C4305a;

/* JADX INFO: renamed from: xe.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5783d implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BitSet f23525b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5783d(int i9, BitSet bitSet) {
        this.f23524a = i9;
        this.f23525b = bitSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f23524a) {
            case 0:
                this.f23525b.set(((C2988t) obj).f9755a.f14349j);
                break;
            case 1:
                BitSet bitSet = ((C4305a) obj).f14357r;
                if (!bitSet.isEmpty()) {
                    this.f23525b.or(bitSet);
                }
                break;
            case 2:
                this.f23525b.and(((C4305a) obj).f14355p);
                break;
            default:
                C4305a c4305a = ((C4305a) obj).f14358s;
                if (c4305a != null) {
                    BitSet bitSet2 = c4305a.f14355p;
                    BitSet bitSet3 = this.f23525b;
                    bitSet3.andNot(bitSet2);
                    bitSet3.clear(c4305a.f14349j);
                }
                break;
        }
    }
}
