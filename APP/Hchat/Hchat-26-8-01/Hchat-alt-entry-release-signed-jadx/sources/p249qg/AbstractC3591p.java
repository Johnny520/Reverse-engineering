package p249qg;

import p211o9.C3092e;
import vg.AbstractC4552a;
import vg.C4558g;
import wf.AbstractC5555a;
import wf.C5558d;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3591p extends AbstractC5555a implements InterfaceC5559e {

    /* JADX INFO: renamed from: h */
    public static final C3588o f11604h = new C3588o(C5558d.f22660g, new C3092e(25));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3591p() {
        super(C5558d.f22660g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.AbstractC5555a, wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        InterfaceC5559e interfaceC5559e;
        interfaceC5560f.getClass();
        if (interfaceC5560f instanceof C3588o) {
            C3588o c3588o = (C3588o) interfaceC5560f;
            InterfaceC5560f interfaceC5560f2 = this.f22657g;
            if ((interfaceC5560f2 == c3588o || c3588o.f11603h == interfaceC5560f2) && (interfaceC5559e = (InterfaceC5559e) c3588o.f11602g.invoke(this)) != null) {
                return interfaceC5559e;
            }
        } else if (C5558d.f22660g == interfaceC5560f) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (((wf.InterfaceC5559e) r3.f11602g.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (wf.C5558d.f22660g == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        return wf.C5562h.f22661g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return r2;
     */
    @Override // wf.AbstractC5555a, wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        interfaceC5560f.getClass();
        if (interfaceC5560f instanceof C3588o) {
            C3588o c3588o = (C3588o) interfaceC5560f;
            InterfaceC5560f interfaceC5560f2 = this.f22657g;
            if (interfaceC5560f2 != c3588o) {
                if (c3588o.f11603h != interfaceC5560f2) {
                    return this;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC3603v.m7556j(this);
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public boolean mo7542x(InterfaceC5561g interfaceC5561g) {
        return !(this instanceof AbstractC3581l1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public AbstractC3591p mo7543y(int i9) {
        AbstractC4552a.m8982a(i9);
        return new C4558g(this, i9);
    }
}
