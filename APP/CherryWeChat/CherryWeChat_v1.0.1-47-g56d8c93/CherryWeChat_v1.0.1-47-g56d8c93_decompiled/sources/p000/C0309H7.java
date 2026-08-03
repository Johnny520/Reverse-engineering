package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.lua.api.CherryAPI;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import org.luckypray.dexkit.DexKitBridge;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: H7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0309H7 implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1025a;

    public /* synthetic */ C0309H7(int i) {
        this.f1025a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0689  */
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        C0017Aa c0017Aa;
        switch (this.f1025a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                String str = (String) obj2;
                AbstractC0295Gu.m625r(-182536110078005L);
                AbstractC0295Gu.m625r(-182579059750965L);
                String name = imageView.getContext().getClass().getName();
                switch (name.hashCode()) {
                    case -1539430146:
                        if (name.equals(AbstractC0295Gu.m625r(-183382218635317L))) {
                            for (String str2 : AbstractC0585Nj.m1156x().keySet()) {
                                if (str.equals(str2)) {
                                    HashMap map = AbstractC0999XA.f3193a;
                                    Drawable drawableM2890b = C1517hw.m2890b((String) AbstractC0585Nj.m1156x().get(str2));
                                    if (drawableM2890b != null) {
                                        String strM625r = AbstractC0295Gu.m625r(-181728656226357L);
                                        Object[] objArr = {Boolean.FALSE};
                                        AbstractC0295Gu.m625r(-578325936338997L);
                                        XposedHelpers.callMethod(imageView, strM625r, Arrays.copyOf(objArr, 1));
                                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                                        imageView.setImageDrawable(drawableM2890b);
                                    }
                                }
                            }
                        }
                        break;
                    case 831517504:
                        if (name.equals(AbstractC0295Gu.m625r(-183214714910773L))) {
                        }
                        break;
                    case 1414355821:
                        if (name.equals(AbstractC0295Gu.m625r(-182613419489333L))) {
                        }
                        break;
                    case 1617560950:
                        if (name.equals(AbstractC0295Gu.m625r(-183090160859189L))) {
                        }
                        break;
                }
                return C0829TC.f2620a;
            case 1:
                return Integer.valueOf(CherryAPI.registerLogApi$lambda$1((String) obj, (String) obj2));
            case 2:
                return Integer.valueOf(CherryAPI.registerLogApi$lambda$2((String) obj, (String) obj2));
            case 3:
                return Integer.valueOf(CherryAPI.registerLogApi$lambda$3((String) obj, (String) obj2));
            case 4:
                return Integer.valueOf(CherryAPI.registerLogApi$lambda$4((String) obj, (String) obj2));
            case 5:
                String str3 = (String) obj;
                InterfaceC1049Yb interfaceC1049Yb = (InterfaceC1049Yb) obj2;
                if (str3.length() == 0) {
                    return interfaceC1049Yb.toString();
                }
                return str3 + ", " + interfaceC1049Yb;
            case 6:
                InterfaceC1049Yb interfaceC1049Yb2 = (InterfaceC1049Yb) obj2;
                InterfaceC1137ac interfaceC1137acMo26s = ((InterfaceC1137ac) obj).mo26s(interfaceC1049Yb2.getKey());
                C0366If c0366If = C0366If.f1247a;
                if (interfaceC1137acMo26s == c0366If) {
                    return interfaceC1049Yb2;
                }
                C1456gf c1456gf = C1456gf.f5158b;
                AbstractC1217bc abstractC1217bc = (AbstractC1217bc) interfaceC1137acMo26s.mo24m(c1456gf);
                if (abstractC1217bc == null) {
                    c0017Aa = new C0017Aa(interfaceC1137acMo26s, interfaceC1049Yb2);
                } else {
                    InterfaceC1137ac interfaceC1137acMo26s2 = interfaceC1137acMo26s.mo26s(c1456gf);
                    if (interfaceC1137acMo26s2 == c0366If) {
                        return new C0017Aa(interfaceC1049Yb2, abstractC1217bc);
                    }
                    c0017Aa = new C0017Aa(new C0017Aa(interfaceC1137acMo26s2, interfaceC1049Yb2), abstractC1217bc);
                }
                return c0017Aa;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return ((InterfaceC1137ac) obj).mo23l((InterfaceC1049Yb) obj2);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return ((InterfaceC1137ac) obj).mo23l((InterfaceC1049Yb) obj2);
            case 10:
                throw ((IOException) obj2);
            case 11:
                InterfaceC1049Yb interfaceC1049Yb3 = (InterfaceC1049Yb) obj2;
                if (!(interfaceC1049Yb3 instanceof InterfaceC1085ZA)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC1049Yb3 : Integer.valueOf(iIntValue + 1);
            case 12:
                InterfaceC1085ZA interfaceC1085ZA = (InterfaceC1085ZA) obj;
                InterfaceC1049Yb interfaceC1049Yb4 = (InterfaceC1049Yb) obj2;
                if (interfaceC1085ZA != null) {
                    return interfaceC1085ZA;
                }
                if (interfaceC1049Yb4 instanceof InterfaceC1085ZA) {
                    return (InterfaceC1085ZA) interfaceC1049Yb4;
                }
                return null;
            case 13:
                return (C1252cB) obj;
            case 14:
                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-590489283721269L, -590519348492341L);
                C0850Tr c0850Tr = new C0850Tr();
                c0850Tr.m1685P(AbstractC0295Gu.m625r(-590549413263413L), AbstractC0295Gu.m625r(-590643902543925L));
                c2147khM4811h.f7512m = c0850Tr;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 15:
                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-591318212409397L, -591348277180469L);
                C0850Tr c0850Tr2 = new C0850Tr();
                c0850Tr2.m1685P(AbstractC0295Gu.m625r(-591378341951541L), AbstractC0295Gu.m625r(-591494306068533L));
                c2147khM4811h2.f7512m = c0850Tr2;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h2).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 16:
                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-591026154633269L, -591056219404341L);
                C0850Tr c0850Tr3 = new C0850Tr();
                c0850Tr3.m1685P(AbstractC0295Gu.m625r(-591086284175413L), AbstractC0295Gu.m625r(-591193658357813L));
                c2147khM4811h3.f7512m = c0850Tr3;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h3).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 17:
                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-595299647092789L, -595329711863861L);
                C0850Tr c0850Tr4 = new C0850Tr();
                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-595359776634933L), AbstractC0295Gu.m625r(-594883035265077L), AbstractC0295Gu.m625r(-594904510101557L));
                c0850Tr4.f2697l = new C2435qz(AbstractC0295Gu.m625r(-594930279905333L), 5);
                c2147khM4811h4.f7512m = c0850Tr4;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h4).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 18:
                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-589621700327477L, -589651765098549L);
                C0850Tr c0850Tr5 = new C0850Tr();
                c0850Tr5.m1685P(AbstractC0295Gu.m625r(-589681829869621L));
                c2147khM4811h5.f7512m = c0850Tr5;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h5).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 19:
                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-589845038626869L, -589875103397941L);
                C0850Tr c0850Tr6 = new C0850Tr();
                c0850Tr6.m1685P(AbstractC0295Gu.m625r(-589355412355125L));
                String name2 = AbstractC1257cG.m2377e().getDeclaringClass().getName();
                AbstractC0295Gu.m625r(-589402656995381L);
                C0182E9 c0182e9 = new C0182E9();
                c0182e9.f536l = new C2435qz(name2, 5);
                c0850Tr6.f2698m = c0182e9;
                String name3 = AbstractC1257cG.m2377e().getParameterTypes()[0].getName();
                AbstractC0295Gu.m625r(-589458491570229L);
                C0182E9 c0182e92 = new C0182E9();
                c0182e92.f536l = new C2435qz(name3, 5);
                c0850Tr6.f2699n = c0182e92;
                c2147khM4811h6.f7512m = c0850Tr6;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h6).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-589514326145077L, -589544390916149L);
                C0850Tr c0850Tr7 = new C0850Tr();
                c0850Tr7.m1685P(AbstractC0295Gu.m625r(-589574455687221L));
                c0850Tr7.m1685P(AbstractC0295Gu.m625r(-590222995748917L));
                c0850Tr7.m1685P(AbstractC0295Gu.m625r(-590317485029429L));
                c0850Tr7.m1685P(AbstractC0295Gu.m625r(-590390499473461L));
                C0182E9 c0182e93 = new C0182E9();
                c0182e93.f536l = new C2435qz(AbstractC0235Fd.m478a(Map.class), 5);
                c0850Tr7.f2699n = c0182e93;
                c2147khM4811h7.f7512m = c0850Tr7;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h7).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 21:
                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-589930937972789L, -589961002743861L);
                C0850Tr c0850Tr8 = new C0850Tr();
                c0850Tr8.m1685P(AbstractC0295Gu.m625r(-589991067514933L), AbstractC0295Gu.m625r(-590115621566517L));
                c2147khM4811h8.f7512m = c0850Tr8;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h8).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 22:
                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-571024491935797L, -571054556706869L);
                C0850Tr c0850Tr9 = new C0850Tr();
                c0850Tr9.m1685P(AbstractC0295Gu.m625r(-571084621477941L), AbstractC0295Gu.m625r(-571161930889269L));
                c2147khM4811h9.f7512m = c0850Tr9;
                Method methodM293a = ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h9).m5219a()).m1562g().m293a((ClassLoader) obj2);
                Method[] methods = methodM293a.getDeclaringClass().getMethods();
                AbstractC0295Gu.m625r(-570809743570997L);
                for (Method method : methods) {
                    if (method.getParameterCount() == 2 && AbstractC0585Nj.m1134a(method.getParameterTypes()[0], String.class) && AbstractC0585Nj.m1134a(method.getParameterTypes()[1], String.class) && AbstractC0585Nj.m1134a(method.getReturnType(), Void.TYPE) && !AbstractC0585Nj.m1134a(method.getName(), methodM293a.getName())) {
                        return method;
                    }
                }
                return null;
            case 23:
                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-570878463047733L, -570908527818805L);
                C0850Tr c0850Tr10 = new C0850Tr();
                c0850Tr10.m1685P(AbstractC0295Gu.m625r(-571488348403765L), AbstractC0295Gu.m625r(-571638672259125L));
                c2147khM4811h10.f7512m = c0850Tr10;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h10).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 24:
                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-571273600038965L, -571303664810037L);
                C0850Tr c0850Tr11 = new C0850Tr();
                c0850Tr11.m1685P(AbstractC0295Gu.m625r(-571333729581109L), AbstractC0295Gu.m625r(-569834785994805L));
                c2147khM4811h11.f7512m = c0850Tr11;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h11).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 25:
                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-569993699784757L, -570023764555829L);
                C0850Tr c0850Tr12 = new C0850Tr();
                c0850Tr12.m1685P(AbstractC0295Gu.m625r(-570053829326901L));
                c0850Tr12.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-569628627564597L)));
                c2147khM4811h12.f7512m = c0850Tr12;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h12).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 26:
                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-570427491481653L, -570457556252725L);
                C0850Tr c0850Tr13 = new C0850Tr();
                c0850Tr13.m1685P(AbstractC0295Gu.m625r(-570487621023797L), AbstractC0295Gu.m625r(-570629354944565L));
                c2147khM4811h13.f7512m = c0850Tr13;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h13).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 27:
                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-570195563247669L, -570225628018741L);
                C0850Tr c0850Tr14 = new C0850Tr();
                c0850Tr14.m1685P(AbstractC0295Gu.m625r(-570255692789813L), AbstractC0295Gu.m625r(-568791108941877L));
                c2147khM4811h14.f7512m = c0850Tr14;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h14).m5219a()).m1562g().m293a((ClassLoader) obj2);
            case 28:
                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594964639643701L, -594994704414773L);
                C0850Tr c0850Tr15 = new C0850Tr();
                c0850Tr15.m1686Q(AbstractC0295Gu.m625r(-595024769185845L), AbstractC0295Gu.m625r(-595720553887797L));
                c2147khM4811h15.f7512m = c0850Tr15;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h15).m5219a()).m1562g().m293a((ClassLoader) obj2);
            default:
                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-568464691427381L, -568494756198453L);
                C0850Tr c0850Tr16 = new C0850Tr();
                c0850Tr16.m1685P(AbstractC0295Gu.m625r(-568524820969525L));
                c0850Tr16.m1683N(1);
                c2147khM4811h16.f7512m = c0850Tr16;
                return ((C0764Rr) ((DexKitBridge) obj).m4739l(c2147khM4811h16).m5219a()).m1562g().m293a((ClassLoader) obj2);
        }
    }
}
