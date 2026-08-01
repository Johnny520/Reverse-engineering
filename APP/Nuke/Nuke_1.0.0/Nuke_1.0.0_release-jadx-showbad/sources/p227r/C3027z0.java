package p227r;

import p001A0.C0105e;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p153e1.C2021q;

/* JADX INFO: renamed from: r.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3027z0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public long f9600h;

    /* JADX INFO: renamed from: i */
    public int f9601i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f9602j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2940A0 f9603k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3027z0(C2940A0 c2940a0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9603k = c2940a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        long j5 = ((C2021q) obj).f6750a;
        C3027z0 c3027z0 = new C3027z0(this.f9603k, (InterfaceC1046d) obj2);
        c3027z0.f9602j = j5;
        return c3027z0.mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C3027z0 c3027z0 = new C3027z0(this.f9603k, interfaceC1046d);
        c3027z0.f9602j = ((C2021q) obj).f6750a;
        return c3027z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        int i5 = this.f9601i;
        C2940A0 c2940a0 = this.f9603k;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            j5 = this.f9602j;
            C0105e c0105e = c2940a0.f9275f;
            this.f9602j = j5;
            this.f9601i = 1;
            obj = c0105e.m138b(j5, this);
            if (obj != enumC1152a) {
            }
            return enumC1152a;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j8 = this.f9600h;
                j7 = this.f9602j;
                AbstractC1784a.m3205S(obj);
                return new C2021q(C2021q.m3716d(j7, C2021q.m3716d(j8, ((C2021q) obj).f6750a)));
            }
            j6 = this.f9600h;
            j5 = this.f9602j;
            AbstractC1784a.m3205S(obj);
            long j9 = ((C2021q) obj).f6750a;
            C0105e c0105e2 = c2940a0.f9275f;
            long jM3716d = C2021q.m3716d(j6, j9);
            this.f9602j = j5;
            this.f9600h = j9;
            this.f9601i = 3;
            obj = c0105e2.m137a(jM3716d, j9, this);
            if (obj != enumC1152a) {
                j7 = j5;
                j8 = j9;
                return new C2021q(C2021q.m3716d(j7, C2021q.m3716d(j8, ((C2021q) obj).f6750a)));
            }
            return enumC1152a;
        }
        j5 = this.f9602j;
        AbstractC1784a.m3205S(obj);
        long jM3716d2 = C2021q.m3716d(j5, ((C2021q) obj).f6750a);
        this.f9602j = j5;
        this.f9600h = jM3716d2;
        this.f9601i = 2;
        obj = c2940a0.m5141a(jM3716d2, this);
        if (obj != enumC1152a) {
            j6 = jM3716d2;
            long j92 = ((C2021q) obj).f6750a;
            C0105e c0105e22 = c2940a0.f9275f;
            long jM3716d3 = C2021q.m3716d(j6, j92);
            this.f9602j = j5;
            this.f9600h = j92;
            this.f9601i = 3;
            obj = c0105e22.m137a(jM3716d3, j92, this);
            if (obj != enumC1152a) {
            }
        }
        return enumC1152a;
    }
}
