package p007B0;

import me.dartcv.nuke.BuildConfig;
import p001A0.C0105e;
import p056K2.C0891q;
import p058L.AbstractC0907I;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.InterfaceC2160t;
import p170h1.AbstractC2218i;
import p203n.C2626I;
import p203n.C2647c;
import p204n0.C2683b;

/* JADX INFO: renamed from: B0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0183P extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f633h;

    /* JADX INFO: renamed from: i */
    public int f634i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f635j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f636k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183P(long j5, C0185S c0185s, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f633h = 0;
        this.f635j = j5;
        this.f636k = c0185s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f633h) {
        }
        return ((C0183P) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f633h) {
            case 0:
                return new C0183P(this.f635j, (C0185S) this.f636k, interfaceC1046d);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0183P((C2647c) this.f636k, this.f635j, interfaceC1046d, 1);
            default:
                return new C0183P((AbstractC2218i) this.f636k, this.f635j, interfaceC1046d, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C2135g c2135g;
        switch (this.f633h) {
            case 0:
                int i5 = this.f634i;
                long j5 = this.f635j;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f634i = 1;
                    if (AbstractC2162v.m3983e(j5 - 8, this) == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1784a.m3205S(obj);
                        c2135g = ((C0185S) this.f636k).f642f;
                        if (c2135g != null) {
                            c2135g.mo278i(AbstractC1784a.m3229o(new C0202p(j5)));
                        }
                        return C0891q.f2780a;
                    }
                    AbstractC1784a.m3205S(obj);
                }
                this.f634i = 2;
                if (AbstractC2162v.m3983e(8L, this) == enumC1152a) {
                    return enumC1152a;
                }
                c2135g = ((C0185S) this.f636k).f642f;
                if (c2135g != null) {
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i6 = this.f634i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2647c c2647c = (C2647c) this.f636k;
                    C2683b c2683b = new C2683b(this.f635j);
                    C2626I c2626i = AbstractC0907I.f2823d;
                    this.f634i = 1;
                    Object objM4604c = C2647c.m4604c(c2647c, c2683b, c2626i, null, this, 12);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM4604c == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            default:
                int i7 = this.f634i;
                if (i7 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C0105e c0105e = ((AbstractC2218i) this.f636k).f7231d;
                    this.f634i = 1;
                    Object objM138b = c0105e.m138b(this.f635j, this);
                    EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                    if (objM138b == enumC1152a3) {
                        return enumC1152a3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0183P(Object obj, long j5, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f633h = i5;
        this.f636k = obj;
        this.f635j = j5;
    }
}
