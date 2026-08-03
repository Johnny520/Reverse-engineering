package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.lua.api.CherryAPI;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: H7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0309H7 implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1025a;

    public /* synthetic */ C0309H7(int r1) {
        this.f1025a = r1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r10, Object r11) {
        Integer r3 = null;
        switch(this.f1025a) {
            case 0: goto L103;
            case 1: goto L102;
            case 2: goto L100;
            case 3: goto L98;
            case 4: goto L96;
            case 5: goto L90;
            case 6: goto L78;
            case 7: goto L76;
            case 8: goto L75;
            case 9: goto L73;
            case 10: goto L70;
            case 11: goto L58;
            case 12: goto L51;
            case 13: goto L49;
            case 14: goto L47;
            case 15: goto L45;
            case 16: goto L43;
            case 17: goto L41;
            case 18: goto L39;
            case 19: goto L37;
            case 20: goto L35;
            case 21: goto L33;
            case 22: goto L18;
            case 23: goto L16;
            case 24: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        C2147kh r0 = AbstractC2374ph.m4811h(-568464691427381L, -568494756198453L);
        C0850Tr r1 = new C0850Tr();
        r1.m1685P(new String[]{AbstractC0295Gu.m625r(-568524820969525L)});
        r1.m1683N(1);
        r0.f7512m = r1;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r0).m5219a()).m1562g().m293a((ClassLoader) r11);
    L6:
        C2147kh r02 = AbstractC2374ph.m4811h(-594964639643701L, -594994704414773L);
        C0850Tr r12 = new C0850Tr();
        r12.m1686Q(new String[]{AbstractC0295Gu.m625r(-595024769185845L), AbstractC0295Gu.m625r(-595720553887797L)});
        r02.f7512m = r12;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r02).m5219a()).m1562g().m293a((ClassLoader) r11);
    L8:
        C2147kh r03 = AbstractC2374ph.m4811h(-570195563247669L, -570225628018741L);
        C0850Tr r13 = new C0850Tr();
        r13.m1685P(new String[]{AbstractC0295Gu.m625r(-570255692789813L), AbstractC0295Gu.m625r(-568791108941877L)});
        r03.f7512m = r13;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r03).m5219a()).m1562g().m293a((ClassLoader) r11);
    L10:
        C2147kh r04 = AbstractC2374ph.m4811h(-570427491481653L, -570457556252725L);
        C0850Tr r14 = new C0850Tr();
        r14.m1685P(new String[]{AbstractC0295Gu.m625r(-570487621023797L), AbstractC0295Gu.m625r(-570629354944565L)});
        r04.f7512m = r14;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r04).m5219a()).m1562g().m293a((ClassLoader) r11);
    L12:
        C2147kh r05 = AbstractC2374ph.m4811h(-569993699784757L, -570023764555829L);
        C0850Tr r15 = new C0850Tr();
        r15.m1685P(new String[]{AbstractC0295Gu.m625r(-570053829326901L)});
        r15.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-569628627564597L)));
        r05.f7512m = r15;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r05).m5219a()).m1562g().m293a((ClassLoader) r11);
    L14:
        C2147kh r06 = AbstractC2374ph.m4811h(-571273600038965L, -571303664810037L);
        C0850Tr r16 = new C0850Tr();
        r16.m1685P(new String[]{AbstractC0295Gu.m625r(-571333729581109L), AbstractC0295Gu.m625r(-569834785994805L)});
        r06.f7512m = r16;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r06).m5219a()).m1562g().m293a((ClassLoader) r11);
    L16:
        C2147kh r07 = AbstractC2374ph.m4811h(-570878463047733L, -570908527818805L);
        C0850Tr r17 = new C0850Tr();
        r17.m1685P(new String[]{AbstractC0295Gu.m625r(-571488348403765L), AbstractC0295Gu.m625r(-571638672259125L)});
        r07.f7512m = r17;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r07).m5219a()).m1562g().m293a((ClassLoader) r11);
    L18:
        C2147kh r08 = AbstractC2374ph.m4811h(-571024491935797L, -571054556706869L);
        C0850Tr r2 = new C0850Tr();
        r2.m1685P(new String[]{AbstractC0295Gu.m625r(-571084621477941L), AbstractC0295Gu.m625r(-571161930889269L)});
        r08.f7512m = r2;
        Method r102 = ((C0764Rr) ((DexKitBridge) r10).m4739l(r08).m5219a()).m1562g().m293a((ClassLoader) r11);
        Method[] r112 = r102.getDeclaringClass().getMethods();
        AbstractC0295Gu.m625r(-570809743570997L);
        int r09 = r112.length;
        int r22 = 0;
    L19:
        if (r22 >= r09) goto L142;
        Method r5 = r112[r22];
        if (r5.getParameterCount() != 2) goto L31;
        if (AbstractC0585Nj.m1134a(r5.getParameterTypes()[0], String.class) == false) goto L31;
        if (AbstractC0585Nj.m1134a(r5.getParameterTypes()[1], String.class) == false) goto L31;
        if (AbstractC0585Nj.m1134a(r5.getReturnType(), Void.TYPE) == false) goto L31;
        if (AbstractC0585Nj.m1134a(r5.getName(), r102.getName()) == true) goto L31;
        return r5;
    L31:
        r22 = r22 + 1;
        goto L19
    L142:
        return null;
    L33:
        C2147kh r010 = AbstractC2374ph.m4811h(-589930937972789L, -589961002743861L);
        C0850Tr r18 = new C0850Tr();
        r18.m1685P(new String[]{AbstractC0295Gu.m625r(-589991067514933L), AbstractC0295Gu.m625r(-590115621566517L)});
        r010.f7512m = r18;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r010).m5219a()).m1562g().m293a((ClassLoader) r11);
    L35:
        C2147kh r011 = AbstractC2374ph.m4811h(-589514326145077L, -589544390916149L);
        C0850Tr r19 = new C0850Tr();
        r19.m1685P(new String[]{AbstractC0295Gu.m625r(-589574455687221L)});
        r19.m1685P(new String[]{AbstractC0295Gu.m625r(-590222995748917L)});
        r19.m1685P(new String[]{AbstractC0295Gu.m625r(-590317485029429L)});
        r19.m1685P(new String[]{AbstractC0295Gu.m625r(-590390499473461L)});
        C0182E9 r32 = new C0182E9();
        r32.f536l = new C2435qz(AbstractC0235Fd.m478a(Map.class), 5);
        r19.f2699n = r32;
        r011.f7512m = r19;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r011).m5219a()).m1562g().m293a((ClassLoader) r11);
    L37:
        C2147kh r012 = AbstractC2374ph.m4811h(-589845038626869L, -589875103397941L);
        C0850Tr r33 = new C0850Tr();
        r33.m1685P(new String[]{AbstractC0295Gu.m625r(-589355412355125L)});
        String r4 = AbstractC1257cG.m2377e().getDeclaringClass().getName();
        AbstractC0295Gu.m625r(-589402656995381L);
        C0182E9 r52 = new C0182E9();
        r52.f536l = new C2435qz(r4, 5);
        r33.f2698m = r52;
        String r110 = AbstractC1257cG.m2377e().getParameterTypes()[0].getName();
        AbstractC0295Gu.m625r(-589458491570229L);
        C0182E9 r42 = new C0182E9();
        r42.f536l = new C2435qz(r110, 5);
        r33.f2699n = r42;
        r012.f7512m = r33;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r012).m5219a()).m1562g().m293a((ClassLoader) r11);
    L39:
        C2147kh r013 = AbstractC2374ph.m4811h(-589621700327477L, -589651765098549L);
        C0850Tr r111 = new C0850Tr();
        r111.m1685P(new String[]{AbstractC0295Gu.m625r(-589681829869621L)});
        r013.f7512m = r111;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r013).m5219a()).m1562g().m293a((ClassLoader) r11);
    L41:
        C2147kh r014 = AbstractC2374ph.m4811h(-595299647092789L, -595329711863861L);
        C0850Tr r113 = new C0850Tr();
        r113.m1686Q(new String[]{AbstractC0295Gu.m625r(-595359776634933L), AbstractC0295Gu.m625r(-594883035265077L), AbstractC0295Gu.m625r(-594904510101557L)});
        r113.f2697l = new C2435qz(AbstractC0295Gu.m625r(-594930279905333L), 5);
        r014.f7512m = r113;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r014).m5219a()).m1562g().m293a((ClassLoader) r11);
    L43:
        C2147kh r015 = AbstractC2374ph.m4811h(-591026154633269L, -591056219404341L);
        C0850Tr r114 = new C0850Tr();
        r114.m1685P(new String[]{AbstractC0295Gu.m625r(-591086284175413L), AbstractC0295Gu.m625r(-591193658357813L)});
        r015.f7512m = r114;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r015).m5219a()).m1562g().m293a((ClassLoader) r11);
    L45:
        C2147kh r016 = AbstractC2374ph.m4811h(-591318212409397L, -591348277180469L);
        C0850Tr r115 = new C0850Tr();
        r115.m1685P(new String[]{AbstractC0295Gu.m625r(-591378341951541L), AbstractC0295Gu.m625r(-591494306068533L)});
        r016.f7512m = r115;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r016).m5219a()).m1562g().m293a((ClassLoader) r11);
    L47:
        C2147kh r017 = AbstractC2374ph.m4811h(-590489283721269L, -590519348492341L);
        C0850Tr r116 = new C0850Tr();
        r116.m1685P(new String[]{AbstractC0295Gu.m625r(-590549413263413L), AbstractC0295Gu.m625r(-590643902543925L)});
        r017.f7512m = r116;
        return ((C0764Rr) ((DexKitBridge) r10).m4739l(r017).m5219a()).m1562g().m293a((ClassLoader) r11);
    L49:
        InterfaceC1049Yb r117 = (InterfaceC1049Yb) r11;
        return (C1252cB) r10;
    L51:
        InterfaceC1085ZA r103 = (InterfaceC1085ZA) r10;
        InterfaceC1049Yb r118 = (InterfaceC1049Yb) r11;
        if (r103 == null) goto L55;
        return r103;
    L55:
        if ((r118 instanceof InterfaceC1085ZA) == true) goto L57;
        return null;
    L57:
        return (InterfaceC1085ZA) r118;
    L58:
        InterfaceC1049Yb r119 = (InterfaceC1049Yb) r11;
        if ((r119 instanceof InterfaceC1085ZA) == true) goto L61;
        return r10;
    L61:
        if ((r10 instanceof Integer) == false) goto L63;
        r3 = (Integer) r10;
    L63:
        if (r3 == null) goto L65;
        int r104 = r3.intValue();
    L66:
        if (r104 != 0) goto L69;
        return r119;
    L69:
        return Integer.valueOf(r104 + 1);
    L65:
        r104 = 1;
        goto L66
    L70:
        File r105 = (File) r10;
        throw ((IOException) r11);
    L76:
        Boolean r106 = (Boolean) r10;
        r106.booleanValue();
        InterfaceC1049Yb r1110 = (InterfaceC1049Yb) r11;
        return r106;
    L78:
        InterfaceC1049Yb r1111 = (InterfaceC1049Yb) r11;
        InterfaceC1137ac r107 = ((InterfaceC1137ac) r10).mo26s(r1111.getKey());
        C0366If r018 = C0366If.f1247a;
        if (r107 == r018) goto L148;
        C1456gf r120 = C1456gf.f5158b;
        AbstractC1217bc r23 = (AbstractC1217bc) r107.mo24m(r120);
        if (r23 != null) goto L85;
        C0017Aa r019 = new C0017Aa(r107, r1111);
    L89:
        return r019;
    L85:
        InterfaceC1137ac r108 = r107.mo26s(r120);
        if (r108 == r018) goto L147;
        r019 = new C0017Aa(new C0017Aa(r108, r1111), r23);
        goto L89
    L147:
        return new C0017Aa(r1111, r23);
    L148:
        return r1111;
    L90:
        String r109 = (String) r10;
        InterfaceC1049Yb r1112 = (InterfaceC1049Yb) r11;
        if (r109.length() != 0) goto L94;
        return r1112.toString();
    L94:
        return r109 + ", " + r1112;
    L103:
        ImageView r1010 = (ImageView) r10;
        String r1113 = (String) r11;
        AbstractC0295Gu.m625r(-182536110078005L);
        AbstractC0295Gu.m625r(-182579059750965L);
        String r020 = r1010.getContext().getClass().getName();
        switch(r020.hashCode()) {
            case -1539430146: goto L116;
            case 831517504: goto L113;
            case 1414355821: goto L110;
            case 1617560950: goto L107;
            default: goto L127;
        };
    L107:
        if (r020.equals(AbstractC0295Gu.m625r(-183090160859189L)) == false) goto L127;
    L118:
        Iterator r021 = AbstractC0585Nj.m1156x().keySet().iterator();
    L120:
        if (r021.hasNext() == false) goto L127;
        String r121 = (String) r021.next();
        if (r1113.equals(r121) == false) goto L120;
        HashMap r24 = AbstractC0999XA.f3193a;
        Drawable r122 = C1517hw.m2890b((String) AbstractC0585Nj.m1156x().get(r121));
        if (r122 == null) goto L120;
        String r25 = AbstractC0295Gu.m625r(-181728656226357L);
        Object[] r34 = {Boolean.FALSE};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r1010, r25, Arrays.copyOf(r34, 1));
        r1010.setScaleType(ImageView.ScaleType.CENTER);
        r1010.setImageDrawable(r122);
        goto L120
    L110:
        if (r020.equals(AbstractC0295Gu.m625r(-182613419489333L)) == true) goto L118;
    L113:
        if (r020.equals(AbstractC0295Gu.m625r(-183214714910773L)) == false) goto L127;
    L116:
        if (r020.equals(AbstractC0295Gu.m625r(-183382218635317L)) == true) goto L118;
    L127:
        return C0829TC.f2620a;
    L73:
        return ((InterfaceC1137ac) r10).mo23l((InterfaceC1049Yb) r11);
    L75:
        return ((InterfaceC1137ac) r10).mo23l((InterfaceC1049Yb) r11);
    L96:
        return Integer.valueOf(CherryAPI.m2994H((String) r10, (String) r11));
    L98:
        return Integer.valueOf(CherryAPI.m3039x((String) r10, (String) r11));
    L100:
        return Integer.valueOf(CherryAPI.m3018c0((String) r10, (String) r11));
    L102:
        return Integer.valueOf(CherryAPI.m3027l((String) r10, (String) r11));
    }
}
