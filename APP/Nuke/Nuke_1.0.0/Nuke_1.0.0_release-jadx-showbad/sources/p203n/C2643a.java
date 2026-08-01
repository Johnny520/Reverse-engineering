package p203n;

import java.util.concurrent.CancellationException;
import p000A.C0006D;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p117X2.C1671p;
import p127Z2.AbstractC1784a;
import p154e2.C2023b;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2643a extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public C2661j f8412h;

    /* JADX INFO: renamed from: i */
    public C1671p f8413i;

    /* JADX INFO: renamed from: j */
    public int f8414j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2647c f8415k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8416l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2633P f8417m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f8418n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1601c f8419o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2643a(C2647c c2647c, Object obj, C2633P c2633p, long j5, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(1, interfaceC1046d);
        this.f8415k = c2647c;
        this.f8416l = obj;
        this.f8417m = c2633p;
        this.f8418n = j5;
        this.f8419o = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        long j5 = this.f8418n;
        InterfaceC1601c interfaceC1601c = this.f8419o;
        return new C2643a(this.f8415k, this.f8416l, this.f8417m, j5, interfaceC1601c, (InterfaceC1046d) obj).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C2647c c2647c;
        C2661j c2661j;
        C1671p c1671p;
        C2633P c2633p = this.f8417m;
        int i5 = this.f8414j;
        C2647c c2647c2 = this.f8415k;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1671p = this.f8413i;
            c2661j = this.f8412h;
            try {
                AbstractC1784a.m3205S(obj);
                c2647c = c2647c2;
                EnumC2655g enumC2655g = !c1671p.f5705d ? EnumC2655g.f8462d : EnumC2655g.f8463e;
                C2647c.m4603b(c2647c);
                return new C2023b(5, c2661j, enumC2655g);
            } catch (CancellationException e5) {
                e = e5;
                c2647c = c2647c2;
                C2647c.m4603b(c2647c);
                throw e;
            }
        }
        AbstractC1784a.m3205S(obj);
        try {
            c2647c2.f8428c.f8479f = (AbstractC2670o) c2647c2.f8426a.f8459a.mo1h(this.f8416l);
            c2647c2.f8430e.setValue(c2633p.f8368c);
            c2647c2.f8429d.setValue(Boolean.TRUE);
            C2661j c2661j2 = c2647c2.f8428c;
            C2661j c2661j3 = new C2661j(c2661j2.f8477d, c2661j2.f8478e.getValue(), AbstractC2649d.m4612e(c2661j2.f8479f), c2661j2.f8480g, Long.MIN_VALUE, c2661j2.f8482i);
            C1671p c1671p2 = new C1671p();
            long j5 = this.f8418n;
            C0006D c0006d = new C0006D(c2647c2, c2661j3, this.f8419o, c1671p2, 2);
            c2647c = c2647c2;
            try {
                this.f8412h = c2661j3;
                this.f8413i = c1671p2;
                this.f8414j = 1;
                Object objM4609b = AbstractC2649d.m4609b(c2661j3, c2633p, j5, c0006d, this);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM4609b == enumC1152a) {
                    return enumC1152a;
                }
                c2661j = c2661j3;
                c1671p = c1671p2;
                if (!c1671p.f5705d) {
                }
                C2647c.m4603b(c2647c);
                return new C2023b(5, c2661j, enumC2655g);
            } catch (CancellationException e6) {
                e = e6;
            }
        } catch (CancellationException e7) {
            e = e7;
            c2647c = c2647c2;
            C2647c.m4603b(c2647c);
            throw e;
        }
        C2647c.m4603b(c2647c);
        throw e;
    }
}
