package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1674s;
import p127Z2.AbstractC1784a;
import p153e1.C2021q;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: r.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3023x0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public C2940A0 f9579h;

    /* JADX INFO: renamed from: i */
    public C1674s f9580i;

    /* JADX INFO: renamed from: j */
    public long f9581j;

    /* JADX INFO: renamed from: k */
    public int f9582k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f9583l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2940A0 f9584m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1674s f9585n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long f9586o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3023x0(C2940A0 c2940a0, C1674s c1674s, long j5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9584m = c2940a0;
        this.f9585n = c1674s;
        this.f9586o = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C3023x0) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C3023x0 c3023x0 = new C3023x0(this.f9584m, this.f9585n, this.f9586o, interfaceC1046d);
        c3023x0.f9583l = obj;
        return c3023x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) throws Throwable {
        C2940A0 c2940a0;
        C1674s c1674s;
        long j5;
        C2940A0 c2940a02;
        int i5 = this.f9582k;
        EnumC2983d0 enumC2983d0 = EnumC2983d0.f9448e;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            C3025y0 c3025y0 = (C3025y0) this.f9583l;
            c2940a0 = this.f9584m;
            C3021w0 c3021w0 = new C3021w0(c2940a0, c3025y0);
            C2996k c2996k = c2940a0.f9272c;
            C1674s c1674s2 = this.f9585n;
            long j6 = c1674s2.f5708d;
            EnumC2983d0 enumC2983d02 = c2940a0.f9273d;
            long j7 = this.f9586o;
            float fM5144d = c2940a0.m5144d(enumC2983d02 == enumC2983d0 ? C2021q.m3714b(j7) : C2021q.m3715c(j7));
            this.f9583l = c2940a0;
            this.f9579h = c2940a0;
            this.f9580i = c1674s2;
            this.f9581j = j6;
            this.f9582k = 1;
            c2996k.getClass();
            obj = AbstractC2162v.m4001w(c2996k.f9491b, new C2994j(fM5144d, c2996k, c3021w0, null), this);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (obj == enumC1152a) {
                return enumC1152a;
            }
            c1674s = c1674s2;
            j5 = j6;
            c2940a02 = c2940a0;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = this.f9581j;
            c1674s = this.f9580i;
            c2940a0 = this.f9579h;
            c2940a02 = (C2940A0) this.f9583l;
            AbstractC1784a.m3205S(obj);
        }
        float fM5144d2 = c2940a02.m5144d(((Number) obj).floatValue());
        c1674s.f5708d = c2940a0.f9273d == enumC2983d0 ? C2021q.m3713a(j5, fM5144d2, 0.0f, 2) : C2021q.m3713a(j5, 0.0f, fM5144d2, 1);
        return C0891q.f2780a;
    }
}
