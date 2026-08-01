package p216p;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p232s.C3162i;
import p232s.C3164k;
import p232s.C3165l;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2837c extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8914h = 1;

    /* JADX INFO: renamed from: i */
    public int f8915i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3162i f8916j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C3164k f8917k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2837c(C3162i c3162i, C3164k c3164k, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f8916j = c3162i;
        this.f8917k = c3164k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f8914h) {
        }
        return ((C2837c) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f8914h) {
            case 0:
                return new C2837c(this.f8917k, this.f8916j, interfaceC1046d);
            default:
                return new C2837c(this.f8916j, this.f8917k, interfaceC1046d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) throws Throwable {
        switch (this.f8914h) {
            case 0:
                int i5 = this.f8915i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C3165l c3165l = new C3165l(this.f8917k);
                    this.f8915i = 1;
                    Object objM5429a = this.f8916j.m5429a(c3165l, this);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objM5429a == enumC1152a) {
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
                int i6 = this.f8915i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f8915i = 1;
                    Object objM5429a2 = this.f8916j.m5429a(this.f8917k, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM5429a2 == enumC1152a2) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2837c(C3164k c3164k, C3162i c3162i, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f8917k = c3164k;
        this.f8916j = c3162i;
    }
}
