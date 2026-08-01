package p000;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a7 extends m51 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0045b7 f61h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f62i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008a7(C0045b7 c0045b7, Object obj, InterfaceC0322ik interfaceC0322ik) {
        super(1, interfaceC0322ik);
        this.f61h = c0045b7;
        this.f62i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: c */
    public final InterfaceC0322ik mo25c(InterfaceC0322ik interfaceC0322ik) {
        return new C0008a7(this.f61h, this.f62i, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        C0008a7 c0008a7 = (C0008a7) mo25c((InterfaceC0322ik) obj);
        na1 na1Var = na1.f4229a;
        c0008a7.mo16m(na1Var);
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        w60.m4891M(obj);
        C0045b7 c0045b7 = this.f61h;
        C0045b7.m321b(c0045b7);
        Object objM320a = C0045b7.m320a(c0045b7, this.f62i);
        c0045b7.f432c.f7016e.setValue(objM320a);
        c0045b7.f434e.setValue(objM320a);
        return na1.f4229a;
    }
}
