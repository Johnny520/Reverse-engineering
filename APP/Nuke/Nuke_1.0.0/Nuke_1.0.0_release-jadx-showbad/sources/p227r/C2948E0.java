package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2948E0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9313h;

    /* JADX INFO: renamed from: i */
    public int f9314i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2989g0 f9315j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2948E0(C2989g0 c2989g0, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f9313h = i5;
        this.f9315j = c2989g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f9313h) {
        }
        return ((C2948E0) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f9313h) {
            case 0:
                return new C2948E0(this.f9315j, interfaceC1046d, 0);
            default:
                return new C2948E0(this.f9315j, interfaceC1046d, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f9313h) {
            case 0:
                int i5 = this.f9314i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f9314i = 1;
                    Object objM5200e = this.f9315j.m5200e(this);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objM5200e == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            default:
                int i6 = this.f9314i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f9314i = 1;
                    Object objM5200e2 = this.f9315j.m5200e(this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM5200e2 == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }
}
