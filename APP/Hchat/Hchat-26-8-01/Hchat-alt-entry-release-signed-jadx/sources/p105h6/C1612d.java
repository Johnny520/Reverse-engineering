package p105h6;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p151k6.C2316s0;
import p208o6.C3066a;

/* JADX INFO: renamed from: h6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1612d extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5288b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1612d(Object obj, int i9) {
        this.f5287a = i9;
        this.f5288b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        switch (this.f5287a) {
            case 0:
                ((AbstractC1622n) this.f5288b).mo4127b(c3066a, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c3066a.m6501b();
                int length = atomicLongArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    ((AbstractC1622n) this.f5288b).mo4127b(c3066a, Long.valueOf(atomicLongArray.get(i9)));
                }
                c3066a.m6504g();
                break;
            default:
                ((C2316s0) this.f5288b).f7639i.mo4127b(c3066a, obj);
                break;
        }
    }
}
