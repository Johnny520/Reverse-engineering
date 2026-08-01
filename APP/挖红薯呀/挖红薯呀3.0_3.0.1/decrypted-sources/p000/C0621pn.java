package p000;

import android.view.View;
import java.util.List;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.matchers.AnnotationMatcher;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.query.matchers.MethodsMatcher;

/* JADX INFO: renamed from: pn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0621pn implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4930d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [x1.t(x1, int):c80] */
    public /* synthetic */ C0621pn(int i, v80 v80Var) {
        this.f4930d = 27;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        switch (this.f4930d) {
            case 0:
                return C0695rn.m3715a5((MethodsMatcher) obj);
            case 1:
                return C0695rn.m3645Q4((FindClass) obj);
            case 2:
                return C0695rn.m3673U4((FindClass) obj);
            case 3:
                return C0695rn.m3687W4((FindClass) obj);
            case 4:
                return C0695rn.m3700Y4((FindClass) obj);
            case 5:
                return C0695rn.m3539C4((MethodMatcher) obj);
            case 6:
                return C0695rn.m3679V3((AnnotationMatcher) obj);
            case 7:
                return C0695rn.m3903y3((ClassMatcher) obj);
            case 8:
                return C0695rn.m3866t5((ClassMatcher) obj);
            case 9:
                return C0695rn.m3777i3((ClassMatcher) obj);
            case 10:
                return C0695rn.m3579H4((MethodsMatcher) obj);
            case 11:
                return C0695rn.m3737d3((ClassMatcher) obj);
            case 12:
                return C0695rn.m3587I4((MethodMatcher) obj);
            case 13:
                return C0695rn.m3672U3((ClassMatcher) obj);
            case 14:
                return C0695rn.m3826o4((MethodsMatcher) obj);
            case j50.f2734e /* 15 */:
                return C0695rn.m3617M4((ClassMatcher) obj);
            case 16:
                return C0695rn.m3835p5((FindClass) obj);
            case 17:
                return C0695rn.m3707Z4((ClassMatcher) obj);
            case 18:
                return C0695rn.m3610L4((FindClass) obj);
            case 19:
                return C0695rn.m3858s5((FindClass) obj);
            case 20:
                return C0695rn.m3874u5((FindClass) obj);
            case 21:
                return C0695rn.m3554E3((ClassMatcher) obj);
            case 22:
                synchronized (t21.f5893c) {
                    List list = t21.f5899i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC0742sw) list.get(i)).invoke(obj);
                    }
                }
                return na1.f4229a;
            case 23:
                return C0906wy.m5059z((View) obj);
            case 24:
                f01 f01Var = (f01) obj;
                u40[] u40VarArr = d01.f923a;
                f01Var.mo17a(b01.f322a, o30.m2782v("微信赞赏码"));
                d01.m620a(f01Var, 5);
                return na1.f4229a;
            case 25:
                return na1.f4229a;
            case 26:
                List list2 = (List) obj;
                return new c90(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 27:
                return na1.f4229a;
            case 28:
                return zc0.m5561q0((uo0) obj);
            default:
                ((Long) obj).getClass();
                return na1.f4229a;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c90.<clinit>():void, cg.m(java.lang.Object):java.lang.Object, o30.f(ro0, pe0, ha, r3, ji, int):void, rn.B4(org.luckypray.dexkit.query.matchers.MethodsMatcher):na1, rn.D3(org.luckypray.dexkit.query.FindClass):na1, rn.G4(org.luckypray.dexkit.query.matchers.ClassMatcher):na1, rn.H4(org.luckypray.dexkit.query.matchers.MethodsMatcher):na1, rn.K4(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):uo0, rn.L4(org.luckypray.dexkit.query.FindClass):na1, rn.P4(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.T3(org.luckypray.dexkit.query.FindClass):na1, rn.U3(org.luckypray.dexkit.query.matchers.ClassMatcher):na1, rn.Y4(org.luckypray.dexkit.query.FindClass):na1, rn.Z4(org.luckypray.dexkit.query.matchers.ClassMatcher):na1, rn.c3(org.luckypray.dexkit.query.FindClass):na1, rn.h3(org.luckypray.dexkit.query.FindClass):na1, rn.n4(org.luckypray.dexkit.query.matchers.ClassMatcher):na1, rn.o5(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.r5(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.s5(org.luckypray.dexkit.query.FindClass):na1, rn.x3(org.luckypray.dexkit.query.FindClass):na1, t21.<clinit>():void, wy.y(android.content.Context, android.view.View):void, zc0.p0(java.util.List, android.content.Context, x60, int, ji, int):na1] */
    public /* synthetic */ C0621pn(int i) {
        this.f4930d = i;
    }
}
