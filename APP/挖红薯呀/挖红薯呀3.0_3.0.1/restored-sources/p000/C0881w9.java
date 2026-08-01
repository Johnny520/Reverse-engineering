package p000;

import android.content.Context;
import java.util.List;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.matchers.AnnotationElementMatcher;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.query.matchers.MethodsMatcher;
import org.luckypray.dexkit.result.ClassData;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0881w9 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7049d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [mg.R(java.lang.Object):java.lang.String, mg.W(java.lang.Object):java.lang.String, o.invoke(java.lang.Object):java.lang.Object, o30.d(hw, pe0, boolean, x01, cc, gc, jn0, xw, ji, int, int):void, rk.<clinit>():void, rn.C3(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.L3(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader, java.lang.Class<?>):java.util.List<java.lang.Class<?>>, rn.V3(org.luckypray.dexkit.query.matchers.AnnotationMatcher):na1, rn.g5(org.luckypray.dexkit.query.FindClass):na1, rn.j3(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.l4(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.m4(org.luckypray.dexkit.query.FindClass):na1, rn.p3(org.luckypray.dexkit.query.FindClass):na1, rn.s4(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader):java.lang.Class<?>, rn.t4(org.luckypray.dexkit.query.FindClass):na1, rn.u4(org.luckypray.dexkit.query.matchers.ClassMatcher):na1, rn.u5(org.luckypray.dexkit.query.FindClass):na1, rn.y3(org.luckypray.dexkit.query.matchers.ClassMatcher):na1, rn.z3(org.luckypray.dexkit.query.matchers.MethodsMatcher):na1, rn.z4(org.luckypray.dexkit.query.FindClass):na1] */
    public /* synthetic */ C0881w9(int i) {
        this.f7049d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f7049d;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                vb0 vb0Var = (vb0) obj;
                vb0Var.m4473d(pf1.f4836b, (int) (vb0Var.m4472a().mo342G() >> 32));
                vb0Var.m4473d(pf1.f4835a, 0.0f);
                return na1Var;
            case 1:
                ((d60) obj).m648a();
                return na1Var;
            case 2:
                fq0 fq0Var = (fq0) obj;
                g41 g41Var = AbstractC0676r4.f5291b;
                fq0Var.getClass();
                if (((Context) AbstractC0398kl.m1936v(fq0Var, g41Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0468mb.f3909b;
                }
                InterfaceC0386kb.f3057a.getClass();
                return C0349jb.f2784c;
            case 3:
                d01.m620a((f01) obj, 0);
                return na1Var;
            case 4:
                ((h91) obj).getClass();
                throw new ClassCastException();
            case 5:
                ((h91) obj).getClass();
                throw new ClassCastException();
            case 6:
                return Boolean.valueOf(C0473mg.m2523X((String) obj));
            case 7:
                return Boolean.valueOf(C0473mg.m2518S((String) obj));
            case 8:
                InterfaceC0515nk interfaceC0515nk = (InterfaceC0515nk) obj;
                if (interfaceC0515nk instanceof AbstractC0692rk) {
                    return (AbstractC0692rk) interfaceC0515nk;
                }
                return null;
            case 9:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new C0399km(iIntValue, ((Float) obj3).floatValue(), new C0381k6(3, list));
            case 10:
                return C0695rn.m3616M3((FindClass) obj);
            case 11:
                return C0695rn.m3911z3((MethodsMatcher) obj);
            case 12:
                return C0695rn.m3882v5((ClassMatcher) obj);
            case 13:
                return C0695rn.m3686W3((AnnotationElementMatcher) obj);
            case 14:
                return C0695rn.m3873u4((ClassMatcher) obj);
            case j50.f2734e /* 15 */:
                return C0695rn.m3865t4((FindClass) obj);
            case 16:
                return Boolean.valueOf(C0695rn.m3904y4((ClassData) obj));
            case 17:
                return C0695rn.m3912z4((FindClass) obj);
            case 18:
                return Boolean.valueOf(C0695rn.m3547D4((ClassData) obj));
            case 19:
                return C0695rn.m3523A4((ClassMatcher) obj);
            case 20:
                return C0695rn.m3810m4((FindClass) obj);
            case 21:
                return C0695rn.m3793k3((FindClass) obj);
            case 22:
                return C0695rn.m3809m3((FindClass) obj);
            case 23:
                return C0695rn.m3818n4((ClassMatcher) obj);
            case 24:
                return C0695rn.m3841q3((ClassMatcher) obj);
            case 25:
                return C0695rn.m3771h5((ClassMatcher) obj);
            case 26:
                return C0695rn.m3522A3((MethodMatcher) obj);
            case 27:
                return C0695rn.m3530B3((MethodMatcher) obj);
            case 28:
                return C0695rn.m3546D3((FindClass) obj);
            default:
                return C0695rn.m3881v4((MethodsMatcher) obj);
        }
    }
}
