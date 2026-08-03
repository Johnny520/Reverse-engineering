package p332wb;

import p077f8.AbstractC1089i;
import p080fb.C1183v;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.pt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5222pt extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC3599t f20091h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20092i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20093j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1183v f20094k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20095l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20096m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5222pt(InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, C1183v c1183v, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f20091h = interfaceC3599t;
        this.f20092i = interfaceC1809a1;
        this.f20093j = interfaceC1809a12;
        this.f20094k = c1183v;
        this.f20095l = interfaceC1809a13;
        this.f20096m = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C5222pt(this.f20091h, this.f20092i, this.f20093j, this.f20094k, this.f20095l, this.f20096m, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C5222pt c5222pt = (C5222pt) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2);
        C3967n c3967n = C3967n.f12976a;
        c5222pt.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        C5491y2.m9827f0(this.f20091h, this.f20092i, this.f20093j, this.f20094k, this.f20095l, this.f20096m);
        return C3967n.f12976a;
    }
}
