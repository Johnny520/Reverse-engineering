package p197m;

import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p153e1.C2016l;
import p203n.AbstractC2649d;
import p203n.InterfaceC2637U;
import p203n.InterfaceC2677v;

/* JADX INFO: renamed from: m.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2557q extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8165e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2558r f8166f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f8167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2557q(C2558r c2558r, long j5, int i5) {
        super(1);
        this.f8165e = i5;
        this.f8166f = c2558r;
        this.f8167g = j5;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        long j5;
        InterfaceC2677v interfaceC2677v;
        long j6;
        switch (this.f8165e) {
            case 0:
                InterfaceC2637U interfaceC2637U = (InterfaceC2637U) obj;
                Object objMo4476a = interfaceC2637U.mo4476a();
                C2558r c2558r = this.f8166f;
                if (AbstractC1665j.m2981a(objMo4476a, c2558r.f8170t.mo4476a())) {
                    j5 = C2016l.m3704a(c2558r.f8171u, AbstractC2550j.f8152a) ? this.f8167g : c2558r.f8171u;
                } else {
                    InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) c2558r.f8170t.f8174c.m4272g(interfaceC2637U.mo4476a());
                    j5 = interfaceC1339T0 != null ? ((C2016l) interfaceC1339T0.getValue()).f6741a : 0L;
                }
                InterfaceC1339T0 interfaceC1339T02 = (InterfaceC1339T0) c2558r.f8170t.f8174c.m4272g(interfaceC2637U.mo4477c());
                long j7 = interfaceC1339T02 != null ? ((C2016l) interfaceC1339T02.getValue()).f6741a : 0L;
                C2537W c2537w = (C2537W) c2558r.f8169s.getValue();
                return (c2537w == null || (interfaceC2677v = (InterfaceC2677v) c2537w.f8103a.mo0g(new C2016l(j5), new C2016l(j7))) == null) ? AbstractC2649d.m4617j(0.0f, 400.0f, null, 5) : interfaceC2677v;
            default:
                C2558r c2558r2 = this.f8166f;
                if (AbstractC1665j.m2981a(obj, c2558r2.f8170t.mo4476a())) {
                    j6 = C2016l.m3704a(c2558r2.f8171u, AbstractC2550j.f8152a) ? this.f8167g : c2558r2.f8171u;
                } else {
                    InterfaceC1339T0 interfaceC1339T03 = (InterfaceC1339T0) c2558r2.f8170t.f8174c.m4272g(obj);
                    j6 = interfaceC1339T03 != null ? ((C2016l) interfaceC1339T03.getValue()).f6741a : 0L;
                }
                return new C2016l(j6);
        }
    }
}
