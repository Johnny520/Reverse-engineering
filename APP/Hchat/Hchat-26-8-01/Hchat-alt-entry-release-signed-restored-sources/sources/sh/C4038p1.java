package sh;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1829f1;
import p117i0.InterfaceC1809a1;
import p187n.C2848b;
import p187n.C2849c;
import p187n.C2857k;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4038p1 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f13310h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2862a f13311i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1829f1 f13312j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f13313k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f13314l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f13315m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C2857k f13316n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1829f1 f13317o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4038p1(boolean z9, InterfaceC2862a interfaceC2862a, C1829f1 c1829f1, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, C2857k c2857k, C1829f1 c1829f12, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f13310h = z9;
        this.f13311i = interfaceC2862a;
        this.f13312j = c1829f1;
        this.f13313k = interfaceC1809a1;
        this.f13314l = interfaceC1809a12;
        this.f13315m = interfaceC1809a13;
        this.f13316n = c2857k;
        this.f13317o = c1829f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        C2857k c2857k = this.f13316n;
        C1829f1 c1829f1 = this.f13317o;
        C4038p1 c4038p1 = new C4038p1(this.f13310h, this.f13311i, this.f13312j, this.f13313k, this.f13314l, this.f13315m, c2857k, c1829f1, (InterfaceC5557c) obj3);
        C3967n c3967n = C3967n.f12976a;
        c4038p1.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1231l interfaceC1231l;
        AbstractC1089i.m2732I0(obj);
        C1829f1 c1829f1 = this.f13312j;
        float fAbs = Math.abs(c1829f1.m4488g());
        boolean z9 = this.f13310h;
        if (fAbs > 10.5f && (interfaceC1231l = (InterfaceC1231l) this.f13313k.getValue()) != null) {
            interfaceC1231l.invoke(Boolean.valueOf(!z9));
        }
        if (!((Boolean) this.f13314l.getValue()).booleanValue() && Math.abs(c1829f1.m4488g()) >= 1.0f) {
            InterfaceC2862a interfaceC2862a = this.f13311i;
            if ((z9 && c1829f1.m4488g() <= -11.0f) || (!z9 && c1829f1.m4488g() <= 10.0f)) {
                ((C2864c) interfaceC2862a).m6283a(22);
            } else if ((z9 && c1829f1.m4488g() >= -10.0f) || (!z9 && c1829f1.m4488g() >= 11.0f)) {
                ((C2864c) interfaceC2862a).m6283a(21);
            }
        }
        C2848b c2848b = (C2848b) this.f13315m.getValue();
        if (c2848b != null) {
            this.f13316n.m6282b(new C2849c(c2848b));
        }
        c1829f1.m4489h(0.0f);
        this.f13317o.m4489h(0.0f);
        return C3967n.f12976a;
    }
}
