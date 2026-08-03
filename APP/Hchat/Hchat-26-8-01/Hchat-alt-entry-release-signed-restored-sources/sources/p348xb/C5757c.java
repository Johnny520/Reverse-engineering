package p348xb;

import ci.C0589j;
import ci.C0609u;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p279t1.C4081a;
import p279t1.C4082b;
import p279t1.C4084d;
import p370yf.AbstractC6044i;
import tf.AbstractC4165l;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5757c extends AbstractC6044i implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5763i f23432h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f23433i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC3599t f23434j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5757c(C5763i c5763i, float f3, InterfaceC3599t interfaceC3599t, InterfaceC5557c interfaceC5557c) {
        super(1, interfaceC5557c);
        this.f23432h = c5763i;
        this.f23433i = f3;
        this.f23434j = interfaceC3599t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        return new C5757c(this.f23432h, this.f23433i, this.f23434j, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C5757c c5757c = (C5757c) create((InterfaceC5557c) obj);
        C3967n c3967n = C3967n.f12976a;
        c5757c.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        C5763i c5763i = this.f23432h;
        C4082b c4082b = (C4082b) c5763i.f23466q.f8339h;
        C4084d c4084d = c4082b.f13523a;
        C4081a[] c4081aArr = c4084d.f13532d;
        AbstractC4165l.m8387v0(0, c4081aArr.length, null, c4081aArr);
        c4084d.f13533e = 0;
        C4084d c4084d2 = c4082b.f13524b;
        C4081a[] c4081aArr2 = c4084d2.f13532d;
        AbstractC4165l.m8387v0(0, c4081aArr2.length, null, c4081aArr2);
        c4084d2.f13533e = 0;
        c4082b.f13525c = 0L;
        InterfaceC3599t interfaceC3599t = c5763i.f23450a;
        AbstractC3603v.m7563q(interfaceC3599t, null, new C0609u(c5763i, null, 7), 3);
        C5755a c5755a = new C5755a(c5763i, ((Number) AbstractC3754e0.m7913t(new Float(this.f23433i), c5763i.f23451b)).floatValue(), null, 0);
        InterfaceC3599t interfaceC3599t2 = this.f23434j;
        AbstractC3603v.m7563q(interfaceC3599t2, null, c5755a, 3);
        if (((Number) c5763i.f23461l.m4360d()).floatValue() != 0.0f) {
            AbstractC3603v.m7563q(interfaceC3599t2, null, new C5756b(c5763i, null, 0), 3);
        }
        AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(c5763i, (InterfaceC5557c) null, 24), 3);
        return C3967n.f12976a;
    }
}
