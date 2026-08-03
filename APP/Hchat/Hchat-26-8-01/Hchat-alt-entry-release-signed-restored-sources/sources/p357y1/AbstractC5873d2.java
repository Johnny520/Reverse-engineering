package p357y1;

import ci.C0579e;
import okio.C3193a;
import p012ah.C0086a;
import p070f0.C0984p;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1858m2;
import p136j8.C2104o;
import p266s0.C3878h;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5641r1;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: y1.d2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5873d2 {

    /* JADX INFO: renamed from: a */
    public static final C1858m2 f23846a = new C1858m2(C5936t1.f24151i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10576a(C0984p c0984p, C0579e c0579e, AbstractC6038c abstractC6038c) {
        C5865b2 c5865b2;
        if (abstractC6038c instanceof C5865b2) {
            c5865b2 = (C5865b2) abstractC6038c;
            int i9 = c5865b2.f23823h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5865b2.f23823h = i9 - Integer.MIN_VALUE;
            } else {
                c5865b2 = new C5865b2(abstractC6038c);
            }
        }
        Object obj = c5865b2.f23822g;
        int i10 = c5865b2.f23823h;
        if (i10 != 0) {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                AbstractC1089i.m2732I0(obj);
                C3193a.m6814c();
                return;
            }
        }
        AbstractC1089i.m2732I0(obj);
        if (!c0984p.f23788g.f23801t) {
            C2104o.m5294t("establishTextInputSession called from an unattached node");
            return;
        }
        InterfaceC5641r1 interfaceC5641r1M10168x = AbstractC5618k.m10168x(c0984p);
        C3878h c3878h = (C3878h) AbstractC5618k.m10167w(c0984p).f22774H;
        c3878h.getClass();
        if (AbstractC1874r.m4640v(c3878h, f23846a) != null) {
            C0086a.m445d();
        } else {
            c5865b2.f23823h = 1;
            m10577b(interfaceC5641r1M10168x, c0579e, c5865b2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10577b(InterfaceC5641r1 interfaceC5641r1, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        C5869c2 c5869c2;
        if (abstractC6038c instanceof C5869c2) {
            c5869c2 = (C5869c2) abstractC6038c;
            int i9 = c5869c2.f23835h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5869c2.f23835h = i9 - Integer.MIN_VALUE;
            } else {
                c5869c2 = new C5869c2(abstractC6038c);
            }
        }
        Object obj = c5869c2.f23834g;
        int i10 = c5869c2.f23835h;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            c5869c2.f23835h = 1;
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10654M(interfaceC1235p, c5869c2);
        } else if (i10 == 1) {
            AbstractC1089i.m2732I0(obj);
            C3193a.m6814c();
        } else if (i10 != 2) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC1089i.m2732I0(obj);
            C3193a.m6814c();
        }
    }
}
