package p216p;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p232s.C3162i;
import p232s.C3163j;
import p232s.C3164k;
import p232s.C3165l;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2841e extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8926h;

    /* JADX INFO: renamed from: i */
    public int f8927i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2865v f8928j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C3164k f8929k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2841e(C2865v c2865v, C3164k c3164k, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f8926h = i5;
        this.f8928j = c2865v;
        this.f8929k = c3164k;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f8926h) {
        }
        return ((C2841e) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f8926h) {
            case 0:
                return new C2841e(this.f8928j, this.f8929k, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C2841e(this.f8928j, this.f8929k, interfaceC1046d, 1);
            case 2:
                return new C2841e(this.f8928j, this.f8929k, interfaceC1046d, 2);
            default:
                return new C2841e(this.f8928j, this.f8929k, interfaceC1046d, 3);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) throws Throwable {
        switch (this.f8926h) {
            case 0:
                int i5 = this.f8927i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C3162i c3162i = this.f8928j.f9046t;
                    if (c3162i != null) {
                        C3163j c3163j = new C3163j(this.f8929k);
                        this.f8927i = 1;
                        Object objM5429a = c3162i.m5429a(c3163j, this);
                        EnumC1152a enumC1152a = EnumC1152a.f3788d;
                        if (objM5429a == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i6 = this.f8927i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C3162i c3162i2 = this.f8928j.f9046t;
                    if (c3162i2 != null) {
                        C3163j c3163j2 = new C3163j(this.f8929k);
                        this.f8927i = 1;
                        Object objM5429a2 = c3162i2.m5429a(c3163j2, this);
                        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                        if (objM5429a2 == enumC1152a2) {
                            return enumC1152a2;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case 2:
                int i7 = this.f8927i;
                if (i7 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C3162i c3162i3 = this.f8928j.f9046t;
                    if (c3162i3 != null) {
                        this.f8927i = 1;
                        Object objM5429a3 = c3162i3.m5429a(this.f8929k, this);
                        EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                        if (objM5429a3 == enumC1152a3) {
                            return enumC1152a3;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            default:
                int i8 = this.f8927i;
                if (i8 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C3162i c3162i4 = this.f8928j.f9046t;
                    if (c3162i4 != null) {
                        C3165l c3165l = new C3165l(this.f8929k);
                        this.f8927i = 1;
                        Object objM5429a4 = c3162i4.m5429a(c3165l, this);
                        EnumC1152a enumC1152a4 = EnumC1152a.f3788d;
                        if (objM5429a4 == enumC1152a4) {
                            return enumC1152a4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }
}
