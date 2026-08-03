package sg;

import java.util.concurrent.atomic.AtomicReferenceArray;
import okio.C3193a;
import p249qg.InterfaceC3590o1;
import vg.AbstractC4568q;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: sg.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3979k extends AbstractC4568q {

    /* JADX INFO: renamed from: e */
    public final C3971c f13021e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f13022f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3979k(long j3, C3979k c3979k, C3971c c3971c, int i9) {
        super(j3, c3979k, i9);
        this.f13021e = c3971c;
        this.f13022f = new AtomicReferenceArray(AbstractC3973e.f12998b * 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.AbstractC4568q
    /* JADX INFO: renamed from: f */
    public final int mo8219f() {
        return AbstractC3973e.f12998b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m8224m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // vg.AbstractC4568q
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8220g(int i9, InterfaceC5561g interfaceC5561g) {
        int i10 = AbstractC3973e.f12998b;
        boolean z9 = i9 >= i10;
        if (z9) {
            i9 -= i10;
        }
        this.f13022f.get(i9 * 2);
        while (true) {
            Object objM8222k = m8222k(i9);
            boolean z10 = objM8222k instanceof InterfaceC3590o1;
            C3971c c3971c = this.f13021e;
            if (z10 || (objM8222k instanceof C3985q)) {
                if (m8221j(objM8222k, i9, z9 ? AbstractC3973e.f13006j : AbstractC3973e.f13007k)) {
                    m8224m(i9, null);
                    m8223l(i9, !z9);
                    if (z9) {
                        c3971c.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM8222k == AbstractC3973e.f13006j || objM8222k == AbstractC3973e.f13007k) {
                    break;
                }
                if (objM8222k != AbstractC3973e.f13003g && objM8222k != AbstractC3973e.f13002f) {
                    if (objM8222k == AbstractC3973e.f13005i || objM8222k == AbstractC3973e.f13000d || objM8222k == AbstractC3973e.f13008l) {
                        return;
                    }
                    C3193a.m6826p(objM8222k, "unexpected state: ");
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m8221j(Object obj, int i9, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i9 * 2) + 1;
        do {
            atomicReferenceArray = this.f13022f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m8222k(int i9) {
        return this.f13022f.get((i9 * 2) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m8223l(int i9, boolean z9) {
        if (z9) {
            C3971c c3971c = this.f13021e;
            c3971c.getClass();
            c3971c.m8195E((this.f15053c * ((long) AbstractC3973e.f12998b)) + ((long) i9));
        }
        m9015h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m8224m(int i9, Object obj) {
        this.f13022f.set(i9 * 2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m8225n(int i9, Object obj) {
        this.f13022f.set((i9 * 2) + 1, obj);
    }
}
