package yyds;

import android.os.Handler;
import android.os.Looper;
import com.android.NativeUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛱᛷᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0154 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final WeakHashMap f955;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final ThreadLocal f956;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Handler f957;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static volatile Method f958;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0154 f959;

    static {
        AbstractC2328.m4341(-1014273279689582L);
        AbstractC2328.m4341(-1014367768970094L);
        f959 = new C0154();
        f957 = new Handler(Looper.getMainLooper());
        f955 = new WeakHashMap();
        f956 = new ThreadLocal();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static int m699(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        return (number != null ? number.intValue() : 0) > 0 ? 2 : 1;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static void m700(Object obj, Method method, ArrayList arrayList, int i) {
        WeakHashMap weakHashMap = f955;
        synchronized (weakHashMap) {
            weakHashMap.put(obj, new C0272(method, arrayList.toArray(new Object[0]), i));
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static boolean m701(Object obj) {
        Object c2658;
        Method method = f958;
        if (method == null) {
            return false;
        }
        try {
            ThreadLocal threadLocal = f956;
            threadLocal.set(Boolean.TRUE);
            try {
                Boolean bool = Boolean.FALSE;
                method.invoke(obj, bool, AbstractC2328.m4341(-1013147998258030L), 1, null);
                c2658 = method.invoke(obj, bool, AbstractC2328.m4341(-1013242487538542L), 2, null);
                threadLocal.remove();
            } catch (Throwable th) {
                f956.remove();
                throw th;
            }
        } catch (Throwable th2) {
            c2658 = new C2658(th2);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1013336976819054L), thM4249);
        }
        return !(c2658 instanceof C2658);
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static boolean m702(ArrayList arrayList) {
        Object objM3276 = AbstractC1595.m3276(0, arrayList);
        String str = objM3276 instanceof String ? (String) objM3276 : null;
        if (str != null) {
            Object objM32762 = AbstractC1595.m3276(3, arrayList);
            String str2 = objM32762 instanceof String ? (String) objM32762 : null;
            if (str2 != null && str.equals(AbstractC2328.m4341(-1012770041135982L)) && str2.equals(AbstractC2328.m4341(-1012864530416494L))) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        Object c2658;
        Method methodM1702;
        Object c26582;
        Method methodM17022;
        Object c26583;
        Method methodM17023;
        Object c26584;
        C1329 c1329 = C1329.f6114;
        C0757 c0757 = (C0757) AbstractC2104.m4019(-633425644651374L, -633563083604846L);
        C0757 c07572 = (C0757) AbstractC2104.m4019(-633601738310510L, -633756357133166L);
        C0757 c07573 = (C0757) AbstractC2104.m4019(-633795011838830L, -633953925628782L);
        if (c0757 != null) {
            try {
                methodM1702 = C0757.m1702(c0757, m678());
                methodM1702.setAccessible(true);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
        } else {
            methodM1702 = null;
        }
        c2658 = methodM1702;
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1012293299766126L), thM4249);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        final Method method = (Method) c2658;
        if (c07572 != null) {
            try {
                methodM17022 = C0757.m1702(c07572, m678());
                methodM17022.setAccessible(true);
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
        } else {
            methodM17022 = null;
        }
        c26582 = methodM17022;
        Throwable thM42492 = C2248.m4249(c26582);
        if (thM42492 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1012383494079342L), thM42492);
        }
        if (c26582 instanceof C2658) {
            c26582 = null;
        }
        final Method method2 = (Method) c26582;
        if (c07573 != null) {
            try {
                methodM17023 = C0757.m1702(c07573, m678());
                methodM17023.setAccessible(true);
            } catch (Throwable th3) {
                c26583 = new C2658(th3);
            }
        } else {
            methodM17023 = null;
        }
        c26583 = methodM17023;
        Throwable thM42493 = C2248.m4249(c26583);
        if (thM42493 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1012473688392558L), thM42493);
        }
        if (c26583 instanceof C2658) {
            c26583 = null;
        }
        final Method method3 = (Method) c26583;
        try {
            C1329 c13292 = C1329.f6114;
            String strM4341 = AbstractC2328.m4341(-633992580334446L);
            AbstractC2328.m4341(-634121429353326L);
            C0757 c07574 = (C0757) C1586.m3253(strM4341);
            if (c07574 != null) {
                Method methodM17024 = C0757.m1702(c07574, m678());
                methodM17024.setAccessible(true);
                c26584 = methodM17024;
            } else {
                c26584 = null;
            }
        } catch (Throwable th4) {
            c26584 = new C2658(th4);
        }
        Throwable thM42494 = C2248.m4249(c26584);
        if (thM42494 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1012563882705774L), thM42494);
        }
        Method method4 = (Method) (c26584 instanceof C2658 ? null : c26584);
        if (method4 == null || (method == null && method2 == null && method3 == null)) {
            C2336.f11496.m4354(AbstractC2328.m4341(-1012654077018990L));
            return;
        }
        f958 = method4;
        int i = 26;
        if (c0757 != null && method != null) {
            EnumC1543 enumC1543 = EnumC1543.f7405;
            AbstractC2328.m4341(-990900067664750L);
            C1329 c13293 = C1329.f6114;
            C0213 c0213M4006 = AbstractC2104.m4006(-1013538840281966L);
            final int i2 = 3;
            c0213M4006.m871(new InterfaceC1549() { // from class: yyds.ᛷᲈᲈᲁ
                static {
                    NativeUtil.classesInit0(136);
                }

                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final native Object mo371(Object obj);
            });
            m682(c0757.m1704() ? c0757.m1703(m678()) : C0757.m1702(c0757, m678()), enumC1543, new C0052(i, c0213M4006));
        }
        if (c07572 != null && method2 != null) {
            EnumC1543 enumC15432 = EnumC1543.f7520;
            AbstractC2328.m4341(-990900067664750L);
            C1329 c13294 = C1329.f6114;
            C0213 c0213M40062 = AbstractC2104.m4006(-1013732113810286L);
            final int i3 = 5;
            c0213M40062.m871(new InterfaceC1549() { // from class: yyds.ᛷᲈᲈᲁ
                static {
                    NativeUtil.classesInit0(136);
                }

                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final native Object mo371(Object obj);
            });
            m682(c07572.m1704() ? c07572.m1703(m678()) : C0757.m1702(c07572, m678()), enumC15432, new C0052(i, c0213M40062));
        }
        if (c07573 != null && method3 != null) {
            EnumC1543 enumC15433 = EnumC1543.f7776;
            AbstractC2328.m4341(-990900067664750L);
            C1329 c13295 = C1329.f6114;
            C0213 c0213M40063 = AbstractC2104.m4006(-1013929682305902L);
            final int i4 = 4;
            c0213M40063.m871(new InterfaceC1549() { // from class: yyds.ᛷᲈᲈᲁ
                static {
                    NativeUtil.classesInit0(136);
                }

                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final native Object mo371(Object obj);
            });
            m682(c07573.m1704() ? c07573.m1703(m678()) : C0757.m1702(c07573, m678()), enumC15433, new C0052(i, c0213M40063));
        }
        m688(method4, EnumC1543.f7598, new C1756(16));
    }
}
