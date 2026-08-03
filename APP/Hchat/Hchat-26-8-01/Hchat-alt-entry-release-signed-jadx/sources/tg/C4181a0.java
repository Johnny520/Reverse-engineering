package tg;

import p249qg.InterfaceC3596r0;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4181a0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C4183b0 f13722g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4187e f13723h;

    /* JADX INFO: renamed from: i */
    public C4185c0 f13724i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3596r0 f13725j;

    /* JADX INFO: renamed from: k */
    public Object f13726k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f13727l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C4183b0 f13728m;

    /* JADX INFO: renamed from: n */
    public int f13729n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4181a0(C4183b0 c4183b0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13728m = c4183b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13727l = obj;
        this.f13729n |= Integer.MIN_VALUE;
        this.f13728m.mo6025b(null, this);
        return EnumC5799a.f23547g;
    }
}
