package p216p;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p232s.C3162i;
import p232s.C3164k;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2839d extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f8921h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3162i f8922i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3164k f8923j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f8924k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2865v f8925l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2839d(C3162i c3162i, C3164k c3164k, boolean z5, C2865v c2865v, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f8922i = c3162i;
        this.f8923j = c3164k;
        this.f8924k = z5;
        this.f8925l = c2865v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2839d) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C2839d(this.f8922i, this.f8923j, this.f8924k, this.f8925l, interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.f8922i.m5429a(r3, r7) == r4) goto L15;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        int i5 = this.f8921h;
        C3164k c3164k = this.f8923j;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            long j5 = AbstractC2866w.f9053a;
            this.f8921h = 1;
            if (AbstractC2162v.m3983e(j5, this) != enumC1152a) {
            }
            return enumC1152a;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            boolean z5 = this.f8924k;
            C2865v c2865v = this.f8925l;
            if (z5) {
                c2865v.f9039G = c3164k;
            } else {
                c2865v.f9035C = c3164k;
            }
            return C0891q.f2780a;
        }
        AbstractC1784a.m3205S(obj);
        this.f8921h = 2;
    }
}
