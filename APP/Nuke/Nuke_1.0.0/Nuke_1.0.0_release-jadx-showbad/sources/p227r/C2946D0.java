package p227r;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2946D0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9310h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2989g0 f9311i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2946D0(C2989g0 c2989g0, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f9310h = i5;
        this.f9311i = c2989g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f9310h) {
            case 0:
                C2946D0 c2946d0 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q = C0891q.f2780a;
                c2946d0.mo8p(c0891q);
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                C2946D0 c2946d02 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q2 = C0891q.f2780a;
                c2946d02.mo8p(c0891q2);
                return c0891q2;
            case 2:
                C2946D0 c2946d03 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q3 = C0891q.f2780a;
                c2946d03.mo8p(c0891q3);
                return c0891q3;
            case 3:
                C2946D0 c2946d04 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q4 = C0891q.f2780a;
                c2946d04.mo8p(c0891q4);
                return c0891q4;
            case 4:
                C2946D0 c2946d05 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q5 = C0891q.f2780a;
                c2946d05.mo8p(c0891q5);
                return c0891q5;
            case 5:
                C2946D0 c2946d06 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q6 = C0891q.f2780a;
                c2946d06.mo8p(c0891q6);
                return c0891q6;
            case 6:
                C2946D0 c2946d07 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q7 = C0891q.f2780a;
                c2946d07.mo8p(c0891q7);
                return c0891q7;
            default:
                C2946D0 c2946d08 = (C2946D0) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q8 = C0891q.f2780a;
                c2946d08.mo8p(c0891q8);
                return c0891q8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f9310h) {
            case 0:
                return new C2946D0(this.f9311i, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C2946D0(this.f9311i, interfaceC1046d, 1);
            case 2:
                return new C2946D0(this.f9311i, interfaceC1046d, 2);
            case 3:
                return new C2946D0(this.f9311i, interfaceC1046d, 3);
            case 4:
                return new C2946D0(this.f9311i, interfaceC1046d, 4);
            case 5:
                return new C2946D0(this.f9311i, interfaceC1046d, 5);
            case 6:
                return new C2946D0(this.f9311i, interfaceC1046d, 6);
            default:
                return new C2946D0(this.f9311i, interfaceC1046d, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f9310h;
        C0891q c0891q = C0891q.f2780a;
        C2989g0 c2989g0 = this.f9311i;
        switch (i5) {
            case 0:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5198a();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5199d();
                break;
            case 2:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5199d();
                break;
            case 3:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5198a();
                break;
            case 4:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5199d();
                break;
            case 5:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5199d();
                break;
            case 6:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5198a();
                break;
            default:
                AbstractC1784a.m3205S(obj);
                c2989g0.m5199d();
                break;
        }
        return c0891q;
    }
}
