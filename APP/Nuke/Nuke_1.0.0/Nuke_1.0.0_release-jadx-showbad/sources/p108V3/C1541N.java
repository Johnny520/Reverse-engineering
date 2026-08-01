package p108V3;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import me.dartcv.nuke.BuildConfig;
import p000A.C0013G0;
import p000A.C0019J0;
import p000A.C0024M;
import p007B0.C0209w;
import p007B0.InterfaceC0169B;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;
import p227r.AbstractC2945D;
import p227r.AbstractC2958J0;
import p227r.C2942B0;
import p227r.C2989g0;

/* JADX INFO: renamed from: V3.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1541N implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5359c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1347Y f5360d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1541N(InterfaceC1601c interfaceC1601c, C1547U c1547u, InterfaceC1347Y interfaceC1347Y, int i5) {
        this.f5357a = i5;
        this.f5358b = interfaceC1601c;
        this.f5359c = c1547u;
        this.f5360d = interfaceC1347Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p134ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC0169B interfaceC0169B, InterfaceC1046d interfaceC1046d) {
        int i5 = this.f5357a;
        final int i6 = 0;
        final int i7 = 1;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        Object obj = this.f5359c;
        final InterfaceC1347Y interfaceC1347Y = this.f5360d;
        Object obj2 = this.f5358b;
        C0891q c0891q = C0891q.f2780a;
        switch (i5) {
            case 0:
                final InterfaceC1601c interfaceC1601c = (InterfaceC1601c) obj2;
                final C1547U c1547u = (C1547U) obj;
                Object objM5159c = AbstractC2958J0.m5159c(interfaceC0169B, new InterfaceC1601c() { // from class: V3.M
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj3) {
                        C2683b c2683b = (C2683b) obj3;
                        switch (i6) {
                            case 0:
                                AbstractC1543P.m2806M(interfaceC1601c, c1547u, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case BuildConfig.VERSION_CODE /* 1 */:
                                AbstractC1543P.m2806M(interfaceC1601c, c1547u, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case 2:
                                AbstractC1543P.m2807N(interfaceC1601c, c1547u, interfaceC1347Y, c2683b.f8556a);
                                break;
                            default:
                                AbstractC1543P.m2807N(interfaceC1601c, c1547u, interfaceC1347Y, c2683b.f8556a);
                                break;
                        }
                        return C0891q.f2780a;
                    }
                }, interfaceC1046d);
                return objM5159c == enumC1152a ? objM5159c : c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                final InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) obj2;
                final C1547U c1547u2 = (C1547U) obj;
                Object objM5153d = AbstractC2945D.m5153d(interfaceC0169B, new InterfaceC1601c() { // from class: V3.M
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj3) {
                        C2683b c2683b = (C2683b) obj3;
                        switch (i7) {
                            case 0:
                                AbstractC1543P.m2806M(interfaceC1601c2, c1547u2, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case BuildConfig.VERSION_CODE /* 1 */:
                                AbstractC1543P.m2806M(interfaceC1601c2, c1547u2, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case 2:
                                AbstractC1543P.m2807N(interfaceC1601c2, c1547u2, interfaceC1347Y, c2683b.f8556a);
                                break;
                            default:
                                AbstractC1543P.m2807N(interfaceC1601c2, c1547u2, interfaceC1347Y, c2683b.f8556a);
                                break;
                        }
                        return C0891q.f2780a;
                    }
                }, new InterfaceC1603e() { // from class: V3.O
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1603e
                    /* JADX INFO: renamed from: g */
                    public final Object mo0g(Object obj3, Object obj4) {
                        C0209w c0209w = (C0209w) obj3;
                        switch (i6) {
                            case 0:
                                AbstractC1665j.m2985e(c0209w, "change");
                                c0209w.m320a();
                                AbstractC1543P.m2806M(interfaceC1601c2, c1547u2, interfaceC1347Y, c0209w.f713c);
                                break;
                            default:
                                AbstractC1665j.m2985e(c0209w, "change");
                                c0209w.m320a();
                                AbstractC1543P.m2807N(interfaceC1601c2, c1547u2, interfaceC1347Y, c0209w.f713c);
                                break;
                        }
                        return C0891q.f2780a;
                    }
                }, interfaceC1046d);
                return objM5153d == enumC1152a ? objM5153d : c0891q;
            case 2:
                final InterfaceC1601c interfaceC1601c3 = (InterfaceC1601c) obj2;
                final C1547U c1547u3 = (C1547U) obj;
                final int i8 = 2;
                Object objM5159c2 = AbstractC2958J0.m5159c(interfaceC0169B, new InterfaceC1601c() { // from class: V3.M
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj3) {
                        C2683b c2683b = (C2683b) obj3;
                        switch (i8) {
                            case 0:
                                AbstractC1543P.m2806M(interfaceC1601c3, c1547u3, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case BuildConfig.VERSION_CODE /* 1 */:
                                AbstractC1543P.m2806M(interfaceC1601c3, c1547u3, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case 2:
                                AbstractC1543P.m2807N(interfaceC1601c3, c1547u3, interfaceC1347Y, c2683b.f8556a);
                                break;
                            default:
                                AbstractC1543P.m2807N(interfaceC1601c3, c1547u3, interfaceC1347Y, c2683b.f8556a);
                                break;
                        }
                        return C0891q.f2780a;
                    }
                }, interfaceC1046d);
                return objM5159c2 == enumC1152a ? objM5159c2 : c0891q;
            case 3:
                final InterfaceC1601c interfaceC1601c4 = (InterfaceC1601c) obj2;
                final C1547U c1547u4 = (C1547U) obj;
                final int i9 = 3;
                Object objM5153d2 = AbstractC2945D.m5153d(interfaceC0169B, new InterfaceC1601c() { // from class: V3.M
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj3) {
                        C2683b c2683b = (C2683b) obj3;
                        switch (i9) {
                            case 0:
                                AbstractC1543P.m2806M(interfaceC1601c4, c1547u4, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case BuildConfig.VERSION_CODE /* 1 */:
                                AbstractC1543P.m2806M(interfaceC1601c4, c1547u4, interfaceC1347Y, c2683b.f8556a);
                                break;
                            case 2:
                                AbstractC1543P.m2807N(interfaceC1601c4, c1547u4, interfaceC1347Y, c2683b.f8556a);
                                break;
                            default:
                                AbstractC1543P.m2807N(interfaceC1601c4, c1547u4, interfaceC1347Y, c2683b.f8556a);
                                break;
                        }
                        return C0891q.f2780a;
                    }
                }, new InterfaceC1603e() { // from class: V3.O
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1603e
                    /* JADX INFO: renamed from: g */
                    public final Object mo0g(Object obj3, Object obj4) {
                        C0209w c0209w = (C0209w) obj3;
                        switch (i7) {
                            case 0:
                                AbstractC1665j.m2985e(c0209w, "change");
                                c0209w.m320a();
                                AbstractC1543P.m2806M(interfaceC1601c4, c1547u4, interfaceC1347Y, c0209w.f713c);
                                break;
                            default:
                                AbstractC1665j.m2985e(c0209w, "change");
                                c0209w.m320a();
                                AbstractC1543P.m2807N(interfaceC1601c4, c1547u4, interfaceC1347Y, c0209w.f713c);
                                break;
                        }
                        return C0891q.f2780a;
                    }
                }, interfaceC1046d);
                return objM5153d2 == enumC1152a ? objM5153d2 : c0891q;
            default:
                C0019J0 c0019j0 = new C0019J0((InterfaceC2160t) obj2, interfaceC1347Y, null);
                C0013G0 c0013g0 = new C0013G0((InterfaceC1347Y) obj, 1);
                C2942B0 c2942b0 = AbstractC2958J0.f9362a;
                Object objM3982d = AbstractC2162v.m3982d(new C0024M(interfaceC0169B, c0019j0, c0013g0, new C2989g0(interfaceC0169B), (InterfaceC1046d) null), interfaceC1046d);
                if (objM3982d != enumC1152a) {
                    objM3982d = c0891q;
                }
                return objM3982d == enumC1152a ? objM3982d : c0891q;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1541N(InterfaceC2160t interfaceC2160t, InterfaceC1347Y interfaceC1347Y, InterfaceC1347Y interfaceC1347Y2) {
        this.f5357a = 4;
        this.f5358b = interfaceC2160t;
        this.f5360d = interfaceC1347Y;
        this.f5359c = interfaceC1347Y2;
    }
}
