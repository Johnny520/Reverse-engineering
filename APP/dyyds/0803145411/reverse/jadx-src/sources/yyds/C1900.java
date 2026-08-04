package yyds;

import android.app.Activity;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛸᲇᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final WeakHashMap f9618;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final ThreadLocal f9619;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0078 f9620;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1900 f9621;

    static {
        AbstractC2328.m4341(-923026699486062L);
        f9621 = new C1900();
        f9620 = new C0078(new C0824(15));
        f9618 = new WeakHashMap();
        f9619 = new ThreadLocal();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static native Activity m3681();

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static void m3682(String str, Object obj, Method method, Method method2, Method method3, Method method4, String str2) throws IllegalAccessException, InvocationTargetException {
        Activity activityM3681;
        Object objInvoke;
        C1509.f7142.getClass();
        if (!C1509.m3123() || (activityM3681 = m3681()) == null || (objInvoke = method2.invoke(null, activityM3681)) == null) {
            return;
        }
        Object objInvoke2 = method3.invoke(objInvoke, Boolean.FALSE);
        String str3 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
        if (str3 != null) {
            C2336.f11496.m4354(AbstractC2328.m4341(-911425992819566L) + str2 + AbstractC2328.m4341(-911529072034670L) + str3);
            return;
        }
        Object objInvoke3 = method.invoke(obj, null);
        Boolean bool = Boolean.TRUE;
        if (AbstractC1544.m3188(objInvoke3, bool)) {
            method4.invoke(obj, AbstractC2328.m4341(-911765295235950L), bool);
            return;
        }
        C2336.f11496.m4354(AbstractC2328.m4341(-911563431773038L) + str2 + AbstractC2328.m4341(-911687985824622L) + str);
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static native String m3683(String str, String str2, String str3);

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static native boolean m3684(Object obj, String str);

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        long j;
        long j2;
        long j3;
        EnumC2298 enumC2298;
        Method methodM664;
        final Method methodM6642;
        final Method methodM6643;
        final Method methodM6644;
        final Method methodM6645;
        final Method methodM6646;
        final Method methodM6647;
        C1329 c1329 = C1329.f6114;
        Class cls = Integer.TYPE;
        m679((C0757) AbstractC2104.m4019(-651060780368750L, -651146679714670L), null, new C1844(20));
        String strM4341 = AbstractC2328.m4341(-651181039453038L);
        AbstractC2328.m4341(-651309888471918L);
        m679((C0757) C1586.m3253(strM4341), EnumC1543.f7398, new C2200(0));
        String strM43412 = AbstractC2328.m4341(-651370018014062L);
        AbstractC2328.m4341(-651503162000238L);
        m679((C0757) C1586.m3253(strM43412), EnumC1543.f7778, new C2200(1));
        String strM43413 = AbstractC2328.m4341(-651563291542382L);
        AbstractC2328.m4341(-651670665724782L);
        m679((C0757) C1586.m3253(strM43413), EnumC1543.f7573, new C1844(12));
        String strM43414 = AbstractC2328.m4341(-651717910365038L);
        AbstractC2328.m4341(-651825284547438L);
        m679((C0757) C1586.m3253(strM43414), EnumC1543.f7818, new C1844(13));
        Class clsM2792 = AbstractC1371.m2792(AbstractC2328.m4341(-913238469018478L), null, 3);
        EnumC2298 enumC22982 = EnumC2298.f11300;
        Class cls2 = Boolean.TYPE;
        C1900 c1900 = f9621;
        if (clsM2792 != null) {
            int i = AbstractC2293.f11258;
            C2014 c2014M1326 = AbstractC0476.m1326(clsM2792);
            j2 = -989976649696110L;
            C0903 c0903 = (C0903) c2014M1326.f10074;
            c0903.f4118 = 2;
            C1189 c1189M3892 = c2014M1326.m3892();
            c0903.f4118 = 2;
            c1189M3892.m2391(enumC22982);
            c1189M3892.m4188(1);
            c1189M3892.m4189(Arrays.copyOf(new Object[]{AbstractC2328.m4341(-913607836205934L)}, 1));
            c1189M3892.f5455 = AbstractC1700.m3448(cls2);
            C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
            c1900.getClass();
            AbstractC2328.m4341(-989955174859630L);
            if (c0536 == null) {
                C2336.f11496.m4359(AbstractC2328.m4341(-989976649696110L));
                j = -989955174859630L;
            } else {
                C0213 c0213M4006 = AbstractC2104.m4006(-917859853828974L);
                j = -989955174859630L;
                c0213M4006.m870(new C1844(18));
                c1900.m682(c0536.f2572, null, new C0052(26, c0213M4006));
            }
        } else {
            j = -989955174859630L;
            j2 = -989976649696110L;
        }
        C0757 c0757 = (C0757) AbstractC2104.m4019(-639150836056942L, -639223850500974L);
        AbstractC2328.m4341(-990900067664750L);
        C1329 c13292 = C1329.f6114;
        if (c0757 == null) {
            j3 = -990900067664750L;
        } else {
            C0213 c0213M40062 = AbstractC2104.m4006(-918628652974958L);
            j3 = -990900067664750L;
            c0213M40062.m870(new C1844(25));
            m682(c0757.m1704() ? c0757.m1703(m678()) : C0757.m1702(c0757, m678()), null, new C0052(26, c0213M40062));
        }
        C0757 c07572 = (C0757) AbstractC2104.m4019(-639382764290926L, -639451483767662L);
        AbstractC2328.m4341(j3);
        C1329 c13293 = C1329.f6114;
        if (c07572 != null) {
            C0213 c0213M40063 = AbstractC2104.m4006(-919131164148590L);
            c0213M40063.m870(new C1844(19));
            m682(c07572.m1704() ? c07572.m1703(m678()) : C0757.m1702(c07572, m678()), null, new C0052(26, c0213M40063));
        }
        m685(EnumC1543.f7717, new C1844(14));
        m685(EnumC1543.f7414, new C1844(15));
        m685(EnumC1543.f7690, new C1844(26));
        boolean z = AbstractC0606.f2913;
        AbstractC0606.f2953 = AbstractC0145.m664(EnumC1543.f7457);
        m689(EnumC1543.f7517, new C1844(27));
        AbstractC0606.f2956 = AbstractC0145.m664(EnumC1543.f7775);
        AbstractC0606.f2907 = AbstractC0145.m664(EnumC1543.f7465);
        final Method methodM6648 = AbstractC0145.m664(EnumC1543.f7561);
        final Method methodM6649 = AbstractC0145.m664(EnumC1543.f7578);
        final Method methodM66410 = AbstractC0145.m664(EnumC1543.f7788);
        final Method methodM66411 = AbstractC0145.m664(EnumC1543.f7400);
        AbstractC0606.f2903 = methodM66411;
        final Method methodM66412 = AbstractC0145.m664(EnumC1543.f7621);
        final Method methodM66413 = AbstractC0145.m664(EnumC1543.f7770);
        final Method methodM66414 = AbstractC0145.m664(EnumC1543.f7502);
        final Method methodM66415 = AbstractC0145.m664(EnumC1543.f7735);
        final Method methodM66416 = AbstractC0145.m664(EnumC1543.f7834);
        final int i2 = 1;
        m687((C0757) AbstractC2104.m4019(-643793695703918L, -643888184984430L), null, new InterfaceC1549() { // from class: yyds.ᛲᛴᲁᛴ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj);
        });
        Method methodM66417 = AbstractC0145.m664(EnumC1543.f7612);
        if (methodM66417 != null && (methodM664 = AbstractC0145.m664(EnumC1543.f7813)) != null && (methodM6642 = AbstractC0145.m664(EnumC1543.f7410)) != null && (methodM6643 = AbstractC0145.m664(EnumC1543.f7407)) != null && (methodM6644 = AbstractC0145.m664(EnumC1543.f7569)) != null && (methodM6645 = AbstractC0145.m664(EnumC1543.f7701)) != null && (methodM6646 = AbstractC0145.m664(EnumC1543.f7765)) != null && (methodM6647 = AbstractC0145.m664(EnumC1543.f7702)) != null && methodM66413 != null && methodM66414 != null && methodM66415 != null && methodM66416 != null) {
            C2701.f13261.getClass();
            XposedInterface.HookHandle hookHandleIntercept = C2701.m4785().hook(methodM66417).intercept(new C2043(2));
            AbstractC2328.m4341(-912817562223470L);
            C0174.f998.getClass();
            C0174.m734(hookHandleIntercept);
            XposedInterface.HookHandle hookHandleIntercept2 = C2701.m4785().hook(methodM664).intercept(new XposedInterface.Hooker() { // from class: yyds.ᛸᛲᛸᛵ
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object intercept(XposedInterface.Chain chain) {
                    Object c2658;
                    Throwable thM4249;
                    Aweme aweme;
                    String str;
                    Object objInvoke;
                    AbstractC2328.m4341(-915746729919342L);
                    ArrayDeque arrayDeque = (ArrayDeque) C1900.f9619.get();
                    Object objPeekLast = arrayDeque != null ? arrayDeque.peekLast() : null;
                    C1509.f7142.getClass();
                    boolean zM3123 = C1509.m3123();
                    Method method = methodM6642;
                    Method method2 = methodM6643;
                    if (zM3123 && objPeekLast != null) {
                        try {
                            Object objInvoke2 = method.invoke(objPeekLast, null);
                            aweme = objInvoke2 instanceof Aweme ? (Aweme) objInvoke2 : null;
                        } catch (Throwable th) {
                            c2658 = new C2658(th);
                        }
                        if (aweme == null || (str = aweme.aid) == null) {
                            thM4249 = C2248.m4249(c2658);
                            if (thM4249 != null) {
                            }
                            obj = (C1389) (c2658 instanceof C2658 ? null : c2658);
                        } else {
                            if (AbstractC0473.m1313(str)) {
                                str = null;
                            }
                            c2658 = (str == null || (objInvoke = method2.invoke(objPeekLast, null)) == null) ? null : new C1389(objPeekLast, aweme, objInvoke, str);
                            thM4249 = C2248.m4249(c2658);
                            if (thM4249 != null) {
                                C2336.f11496.m4355(AbstractC2328.m4341(-915772499723118L), thM4249);
                            }
                            obj = (C1389) (c2658 instanceof C2658 ? null : c2658);
                        }
                    }
                    C1389 c1389 = obj;
                    List args = chain.getArgs();
                    AbstractC2328.m4341(-915836924232558L);
                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                    if (c1389 != 0) {
                        C1900 c19002 = C1900.f9621;
                        Object obj = c1389.f6480;
                        String str2 = c1389.f6483;
                        c19002.getClass();
                        if (C1900.m3684(obj, str2)) {
                            ((Handler) C1900.f9620.getValue()).post(new RunnableC1339(c1389, method, method2, methodM6644, methodM6645, methodM6646, methodM6647, methodM66413, methodM66414, methodM66415, methodM66416));
                        }
                    }
                    return objProceed;
                }
            });
            AbstractC2328.m4341(-912881986732910L);
            C0174.m734(hookHandleIntercept2);
        }
        String strM43415 = AbstractC2328.m4341(-913792519799662L);
        String strM43416 = AbstractC2328.m4341(-914002973197166L);
        try {
            Class clsM27922 = AbstractC1371.m2792(strM43415, null, 3);
            if (clsM27922 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-914024448033646L).concat(strM43415));
                C1329 c13294 = C1329.f6114;
                if (!AbstractC0473.m1313(strM43416)) {
                    C1329.f6115.add(new Pair(strM43416, strM43416));
                }
            } else {
                int i3 = AbstractC2293.f11258;
                C2014 c2014M13262 = AbstractC0476.m1326(clsM27922);
                ((C0903) c2014M13262.f10074).f4118 = 2;
                C1189 c1189M38922 = c2014M13262.m3892();
                c1189M38922.m2391(enumC22982);
                c1189M38922.f12003 = AbstractC2328.m4341(-914101757444974L);
                c1189M38922.m4189(Arrays.copyOf(new Object[]{AbstractC2328.m4341(-914157592019822L)}, 1));
                c1189M38922.f5455 = AbstractC1700.m3448(cls2);
                C0536 c05362 = (C0536) AbstractC1595.m3280(c1189M38922.mo736());
                c1900.getClass();
                AbstractC2328.m4341(j);
                if (c05362 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(j2));
                } else {
                    C0213 c0213 = new C0213();
                    AbstractC2328.m4341(-921450446488430L);
                    c0213.m871(new C1844(23));
                    c1900.m682(c05362.f2572, null, new C0052(26, c0213));
                }
                C1329 c13295 = C1329.f6114;
            }
            enumC2298 = enumC22982;
        } catch (Exception e) {
            enumC2298 = enumC22982;
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-914264966202222L)), strM43415, -914303620907886L), e);
            C1329 c13296 = C1329.f6114;
            AbstractC2104.m4010(strM43415, strM43416, C1329.f6115);
        }
        AbstractC0606.f2929 = AbstractC0145.m664(EnumC1543.f7592);
        C0757 c07573 = (C0757) AbstractC2104.m4019(-646353496212334L, -646460870394734L);
        if (c07573 != null) {
            c1900.m679((C0757) AbstractC2104.m4019(-673751092593518L, -673849876841326L), null, new C2782(c07573, 3));
        }
        String strM43417 = AbstractC2328.m4341(-914333685678958L);
        try {
            Class clsM27923 = AbstractC1371.m2792(strM43417, null, 3);
            if (clsM27923 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-914484009534318L).concat(strM43417));
            } else {
                int i4 = AbstractC2293.f11258;
                C2014 c2014M13263 = AbstractC0476.m1326(clsM27923);
                ((C0903) c2014M13263.f10074).f4118 = 2;
                C1189 c1189M38923 = c2014M13263.m3892();
                c1189M38923.m2391(enumC2298);
                c1189M38923.f12003 = AbstractC2328.m4341(-914561318945646L);
                c1189M38923.m4189(Arrays.copyOf(new Object[]{AbstractC1700.m3448(cls2), AbstractC1700.m3448(String.class), AbstractC1700.m3448(cls), AbstractC1700.m3448(cls)}, 4));
                c1189M38923.f5455 = AbstractC1700.m3448(cls);
                C0536 c05363 = (C0536) AbstractC1595.m3280(c1189M38923.mo736());
                c1900.getClass();
                AbstractC2328.m4341(j);
                if (c05363 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(j2));
                } else {
                    C0213 c02132 = new C0213();
                    AbstractC2328.m4341(-922232130536302L);
                    c02132.m870(new C1844(17));
                    c1900.m682(c05363.f2572, null, new C0052(26, c02132));
                }
            }
        } catch (Exception e2) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-914612858553198L)), strM43417, -914651513258862L), e2);
            AbstractC2104.m4010(strM43417, strM43417, C1329.f6115);
        }
        m689(EnumC1543.f7649, new C1844(28));
        m684(EnumC1543.f7673, new C1844(29));
        String strM43418 = AbstractC2328.m4341(-914681578029934L);
        try {
            Class clsM27924 = AbstractC1371.m2792(strM43418, null, 3);
            if (clsM27924 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-914982225740654L).concat(strM43418));
            } else {
                int i5 = AbstractC2293.f11258;
                C2014 c2014M13264 = AbstractC0476.m1326(clsM27924);
                ((C0903) c2014M13264.f10074).f4118 = 2;
                C1189 c1189M38924 = c2014M13264.m3892();
                ((C0903) c2014M13264.f10074).f4118 = 2;
                c1189M38924.m2391(EnumC2298.f11297, EnumC2298.f11298);
                c1189M38924.f12003 = AbstractC2328.m4341(-915059535151982L);
                c1189M38924.m4189(Arrays.copyOf(new Object[]{AbstractC1700.m3448(cls), AbstractC2328.m4341(-915123959661422L), AbstractC1700.m3448(cls2), AbstractC1700.m3448(String.class), AbstractC2328.m4341(-915304348287854L), AbstractC1700.m3448(cls2)}, 6));
                c1189M38924.f5455 = AbstractC1700.m3448(cls2);
                C0536 c05364 = (C0536) AbstractC1595.m3281(c1189M38924.mo736());
                c1900.getClass();
                AbstractC2328.m4341(j);
                if (c05364 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(j2));
                } else {
                    C0213 c02133 = new C0213();
                    AbstractC2328.m4341(-922979454845806L);
                    c02133.m870(new C1844(21));
                    c1900.m682(c05364.f2572, null, new C0052(26, c02133));
                }
            }
        } catch (Exception e3) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-915484736914286L)), strM43418, -915523391619950L), e3);
            AbstractC2104.m4010(strM43418, strM43418, C1329.f6115);
        }
    }
}
