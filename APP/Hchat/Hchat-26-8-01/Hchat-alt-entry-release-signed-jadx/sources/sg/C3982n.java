package sg;

import gg.AbstractC1426v;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p162l3.InterfaceC2461o;
import p249qg.InterfaceC3590o1;
import p276sf.C3967n;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sg.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3982n extends C3971c {

    /* JADX INFO: renamed from: q */
    public final EnumC3969a f13023q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3982n(int i9, EnumC3969a enumC3969a) {
        super(i9);
        this.f13023q = enumC3969a;
        if (enumC3969a == EnumC3969a.f12979g) {
            C3193a.m6819h(AbstractC1426v.m3834a(C3971c.class).m3820c(), "This implementation does not support suspension for senders, use ", " instead");
            throw null;
        }
        if (i9 >= 1) {
            return;
        }
        C2104o.m5291q(AbstractC0921a.m2250m(i9, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8226F(Object obj, boolean z9) {
        EnumC3969a enumC3969a = this.f13023q;
        EnumC3969a enumC3969a2 = EnumC3969a.f12981i;
        C3967n c3967n = C3967n.f12976a;
        if (enumC3969a == enumC3969a2) {
            Object objMo8208p = super.mo8208p(obj);
            return (!(objMo8208p instanceof C3977i) || (objMo8208p instanceof C3976h)) ? objMo8208p : c3967n;
        }
        InterfaceC2461o interfaceC2461o = AbstractC3973e.f13000d;
        C3979k c3979k = (C3979k) C3971c.f12990l.get(this);
        while (true) {
            long andIncrement = C3971c.f12986h.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean zM8211t = m8211t(andIncrement, false);
            int i9 = AbstractC3973e.f12998b;
            long j4 = i9;
            long j5 = j3 / j4;
            int i10 = (int) (j3 % j4);
            if (c3979k.f15053c != j5) {
                C3979k c3979kM8188b = C3971c.m8188b(this, j5, c3979k);
                if (c3979kM8188b != null) {
                    c3979k = c3979kM8188b;
                } else if (zM8211t) {
                    return new C3976h(m8207o());
                }
            }
            int iM8190e = C3971c.m8190e(this, c3979k, i10, obj, j3, interfaceC2461o, zM8211t);
            if (iM8190e == 0) {
                c3979k.m8994a();
                return c3967n;
            }
            if (iM8190e == 1) {
                break;
            }
            if (iM8190e != 2) {
                if (iM8190e == 3) {
                    C2104o.m5276A("unexpected");
                    return null;
                }
                if (iM8190e == 4) {
                    if (j3 < C3971c.f12987i.get(this)) {
                        c3979k.m8994a();
                    }
                    return new C3976h(m8207o());
                }
                if (iM8190e == 5) {
                    c3979k.m8994a();
                }
            } else {
                if (zM8211t) {
                    c3979k.m9015h();
                    return new C3976h(m8207o());
                }
                InterfaceC3590o1 interfaceC3590o1 = interfaceC2461o instanceof InterfaceC3590o1 ? (InterfaceC3590o1) interfaceC2461o : null;
                if (interfaceC3590o1 != null) {
                    interfaceC3590o1.mo7505a(c3979k, i10 + i9);
                }
                m8202j((c3979k.f15053c * j4) + ((long) i10));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.C3971c, sg.InterfaceC3984p
    /* JADX INFO: renamed from: p */
    public final Object mo8208p(Object obj) {
        return m8226F(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.C3971c, sg.InterfaceC3984p
    /* JADX INFO: renamed from: q */
    public final Object mo8209q(Object obj, InterfaceC5557c interfaceC5557c) throws Throwable {
        if (m8226F(obj, true) instanceof C3976h) {
            throw m8207o();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.C3971c
    /* JADX INFO: renamed from: v */
    public final boolean mo8213v() {
        return this.f13023q == EnumC3969a.f12980h;
    }
}
