package p203n;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p007B0.C0172E;
import p041H0.C0566K;
import p047I0.AbstractC0691Q;
import p047I0.AbstractC0757q0;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p153e1.C2011g;
import p153e1.C2014j;
import p153e1.C2016l;
import p153e1.InterfaceC2007c;
import p197m.AbstractC2523H;
import p197m.AbstractC2550j;
import p197m.AbstractC2563w;
import p197m.C2516A;
import p197m.C2528M;
import p197m.C2529N;
import p197m.C2530O;
import p197m.C2535U;
import p197m.C2538X;
import p197m.C2540Z;
import p197m.C2559s;
import p204n0.C2683b;
import p204n0.C2684c;
import p204n0.C2686e;
import p211o0.C2735J;
import p216p.AbstractC2830X;
import p216p.AbstractC2851j;
import p216p.C2829W;
import p216p.C2848h0;
import p216p.C2849i;
import p227r.AbstractC2986f;
import p227r.C2980c;
import p227r.InterfaceC2982d;
import p244u.C3278k0;
import p255w.C3380k;
import p255w.C3385p;
import p276z3.C3522e;

/* JADX INFO: renamed from: n.f0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2654f0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8461d;

    public /* synthetic */ C2654f0(int i5) {
        this.f8461d = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f8461d;
        C0891q c0891q = C0891q.f2780a;
        switch (i5) {
            case 0:
                return Integer.valueOf((int) ((C2663k) obj).f8483a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C2663k(((C2010f) obj).f6732d);
            case 2:
                return new C2010f(((C2663k) obj).f8483a);
            case 3:
                C2011g c2011g = (C2011g) obj;
                return new C2665l(Float.intBitsToFloat((int) (c2011g.f6733a >> 32)), Float.intBitsToFloat((int) (c2011g.f6733a & 4294967295L)));
            case 4:
                C2665l c2665l = (C2665l) obj;
                return new C2011g((((long) Float.floatToRawIntBits(c2665l.f8486a)) << 32) | (((long) Float.floatToRawIntBits(c2665l.f8487b)) & 4294967295L));
            case 5:
                C2686e c2686e = (C2686e) obj;
                return new C2665l(Float.intBitsToFloat((int) (c2686e.f8570a >> 32)), Float.intBitsToFloat((int) (c2686e.f8570a & 4294967295L)));
            case 6:
                C2665l c2665l2 = (C2665l) obj;
                return new C2686e((((long) Float.floatToRawIntBits(c2665l2.f8486a)) << 32) | (((long) Float.floatToRawIntBits(c2665l2.f8487b)) & 4294967295L));
            case 7:
                C2683b c2683b = (C2683b) obj;
                return new C2665l(Float.intBitsToFloat((int) (c2683b.f8556a >> 32)), Float.intBitsToFloat((int) (c2683b.f8556a & 4294967295L)));
            case 8:
                C2665l c2665l3 = (C2665l) obj;
                return new C2683b((((long) Float.floatToRawIntBits(c2665l3.f8486a)) << 32) | (((long) Float.floatToRawIntBits(c2665l3.f8487b)) & 4294967295L));
            case 9:
                long j5 = ((C2014j) obj).f6735a;
                return new C2665l((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 10:
                C2665l c2665l4 = (C2665l) obj;
                return new C2014j((((long) Math.round(c2665l4.f8486a)) << 32) | (((long) Math.round(c2665l4.f8487b)) & 4294967295L));
            case 11:
                long j6 = ((C2016l) obj).f6741a;
                return new C2665l((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case 12:
                C2665l c2665l5 = (C2665l) obj;
                int iRound = Math.round(c2665l5.f8486a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c2665l5.f8487b);
                return new C2016l((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 13:
                C2684c c2684c = (C2684c) obj;
                return new C2669n(c2684c.f8558a, c2684c.f8559b, c2684c.f8560c, c2684c.f8561d);
            case 14:
                C2669n c2669n = (C2669n) obj;
                return new C2684c(c2669n.f8505a, c2669n.f8506b, c2669n.f8507c, c2669n.f8508d);
            case 15:
                return Float.valueOf(((C2663k) obj).f8483a);
            case 16:
                ((C0566K) obj).m857a();
                return c0891q;
            case 17:
                ((Long) obj).getClass();
                return c0891q;
            case 18:
                InterfaceC1378o0 interfaceC1378o0 = (InterfaceC1378o0) obj;
                int i6 = AbstractC2851j.f8972a;
                C1341U0 c1341u0 = AbstractC0691Q.f2211b;
                interfaceC1378o0.getClass();
                Context context = (Context) AbstractC1385s.m2630t(interfaceC1378o0, c1341u0);
                InterfaceC2007c interfaceC2007c = (InterfaceC2007c) AbstractC1385s.m2630t(interfaceC1378o0, AbstractC0757q0.f2358h);
                C2829W c2829w = (C2829W) AbstractC1385s.m2630t(interfaceC1378o0, AbstractC2830X.f8909a);
                if (c2829w == null) {
                    return null;
                }
                return new C2849i(context, interfaceC2007c, c2829w.f8907a, c2829w.f8908b);
            case 19:
                return new C2848h0(((Integer) obj).intValue());
            case 20:
                InterfaceC1378o0 interfaceC1378o02 = (InterfaceC1378o0) obj;
                C1341U0 c1341u02 = AbstractC0691Q.f2211b;
                interfaceC1378o02.getClass();
                if (((Context) AbstractC1385s.m2630t(interfaceC1378o02, c1341u02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC2986f.f9454b;
                }
                InterfaceC2982d.f9446a.getClass();
                return C2980c.f9437c;
            case 21:
                return Boolean.valueOf(!false);
            case 22:
                return c0891q;
            case 23:
                return ((C3278k0) obj).f10125g;
            case 24:
                ((Integer) obj).getClass();
                return null;
            case 25:
                List list = (List) obj;
                return new C3385p(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 26:
                return c0891q;
            case 27:
                C2735J c2735j = (C2735J) obj;
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4801v(-1.0f);
                c2735j.m4792d(0.28f);
                c2735j.m4790D(-4.0f);
                return c0891q;
            default:
                C2559s c2559s = (C2559s) obj;
                AbstractC1665j.m2985e(c2559s, "$this$AnimatedContent");
                C3522e c3522e = new C3522e(c2559s, 0);
                C3522e c3522e2 = new C3522e(c2559s, 1);
                C2650d0 c2650d0M4618k = AbstractC2649d.m4618k(260, 0, null, 6);
                C2652e0 c2652e0 = AbstractC2523H.f8063a;
                C2528M c2528mM4468a = new C2528M(new C2540Z((C2530O) null, new C2538X(new C0172E(22, c3522e), c2650d0M4618k), (AbstractC2563w) null, (C2535U) null, (LinkedHashMap) null, 125)).m4468a(AbstractC2523H.m4465a(AbstractC2649d.m4618k(180, 40, null, 4), 2));
                C2529N c2529nM4469a = new C2529N(new C2540Z((C2530O) null, new C2538X(new C0172E(23, c3522e2), AbstractC2649d.m4618k(220, 0, null, 6)), (AbstractC2563w) (0 == true ? 1 : 0), (C2535U) (0 == true ? 1 : 0), (LinkedHashMap) null, 125)).m4469a(AbstractC2523H.m4466b(AbstractC2649d.m4618k(150, 0, null, 6), 2));
                int i7 = AbstractC2550j.f8153b;
                return new C2516A(c2528mM4468a, c2529nM4469a);
        }
    }

    public /* synthetic */ C2654f0(int i5, C3380k c3380k) {
        this.f8461d = 26;
    }
}
