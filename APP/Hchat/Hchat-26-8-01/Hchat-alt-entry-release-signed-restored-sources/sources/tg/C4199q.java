package tg;

import p249qg.InterfaceC3596r0;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4199q extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C4200r f13773g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4187e f13774h;

    /* JADX INFO: renamed from: i */
    public C4202t f13775i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3596r0 f13776j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f13777k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4200r f13778l;

    /* JADX INFO: renamed from: m */
    public int f13779m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4199q(C4200r c4200r, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13778l = c4200r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f13777k = obj;
        this.f13779m |= Integer.MIN_VALUE;
        C4200r.m8449j(this.f13778l, null, this);
        return EnumC5799a.f23547g;
    }
}
