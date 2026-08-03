package sh;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p116i.C1785r0;
import p117i0.C1829f1;
import p117i0.C1833g1;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4000d1 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ long f13092h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f13093i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f13094j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4052u0 f13095k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f13096l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1829f1 f13097m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1833g1 f13098n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1833g1 f13099o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f13100p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4000d1(boolean z9, InterfaceC1231l interfaceC1231l, C4052u0 c4052u0, InterfaceC1809a1 interfaceC1809a1, C1829f1 c1829f1, C1833g1 c1833g1, C1833g1 c1833g12, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f13093i = z9;
        this.f13094j = interfaceC1231l;
        this.f13095k = c4052u0;
        this.f13096l = interfaceC1809a1;
        this.f13097m = c1829f1;
        this.f13098n = c1833g1;
        this.f13099o = c1833g12;
        this.f13100p = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        long j3 = ((C0807b) obj2).f2414a;
        C1833g1 c1833g1 = this.f13099o;
        InterfaceC1809a1 interfaceC1809a1 = this.f13100p;
        C4000d1 c4000d1 = new C4000d1(this.f13093i, this.f13094j, this.f13095k, this.f13096l, this.f13097m, this.f13098n, c1833g1, interfaceC1809a1, (InterfaceC5557c) obj3);
        c4000d1.f13092h = j3;
        C3967n c3967n = C3967n.f12976a;
        c4000d1.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        long j3 = this.f13092h;
        AbstractC1089i.m2732I0(obj);
        C1785r0 c1785r0 = AbstractC4008f1.f13123a;
        this.f13096l.setValue(Boolean.TRUE);
        int i9 = (int) (j3 >> 32);
        this.f13097m.m4489h(Float.intBitsToFloat(i9));
        float fM8232c = AbstractC4008f1.m8232c(Float.intBitsToFloat(i9), this.f13098n.m4492g(), this.f13099o.m4492g());
        if (this.f13093i) {
            fM8232c = 1.0f - fM8232c;
        }
        float fFloatValue = ((Number) this.f13094j.invoke(new Float(fM8232c))).floatValue();
        ((InterfaceC1231l) this.f13100p.getValue()).invoke(new Float(fFloatValue));
        C4052u0 c4052u0 = this.f13095k;
        c4052u0.f13388a = false;
        c4052u0.f13389b = fFloatValue;
        c4052u0.f13390c = false;
        return C3967n.f12976a;
    }
}
