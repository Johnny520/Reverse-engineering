package yyds;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᛶᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0145 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0078 f890 = new C0078(new C1223(1, this));

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0078 f891 = new C0078(new C2307(1));

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0078 f892 = new C0078(new C2307(2));

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0078 f893 = new C0078(new C2307(3));

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0078 f889 = new C0078(new C2307(4));

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static void m663(String str, Throwable th) {
        AbstractC2328.m4341(-985995215012718L);
        AbstractC2328.m4341(-986029574751086L);
        C2701.f13261.getClass();
        C2701.m4801(str, th);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static Method m664(EnumC1543 enumC1543) {
        AbstractC2328.m4341(-989693181854574L);
        C0757 c0757M3254 = C1586.m3254(enumC1543.f7843);
        if (c0757M3254 == null) {
            return null;
        }
        C2701.f13261.getClass();
        return C0757.m1702(c0757M3254, C2701.m4787());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C2068 m666(EnumC1543 enumC1543) {
        AbstractC2328.m4341(-989925110088558L);
        String str = enumC1543.f7843;
        AbstractC2328.m4341(-383454253056878L);
        return (C2068) C1586.m3253(str);
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static void m667(String str) {
        AbstractC2328.m4341(-985960855274350L);
        C2701.f13261.getClass();
        C2701.m4802(str);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1743 m670(EnumC1543 enumC1543) {
        AbstractC2328.m4341(-989895045317486L);
        String str = enumC1543.f7843;
        AbstractC2328.m4341(-383419893318510L);
        return (C1743) C1586.m3253(str);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static Object m671(Object obj, String str) {
        if (str != null && !AbstractC0473.m1313(str) && obj != null) {
            int i = AbstractC2293.f11258;
            C2014 c2014M1327 = AbstractC0476.m1327(obj);
            ((C0903) c2014M1327.f10074).f4118 = 2;
            C0802 c0802M3893 = c2014M1327.m3893();
            c0802M3893.m4478();
            c0802M3893.f3681 = str;
            C1558 c1558 = (C1558) AbstractC1595.m3281(c0802M3893.mo736());
            Object objM3209 = c1558 != null ? c1558.m3209() : null;
            if (objM3209 != null) {
                return objM3209;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static Object m672(Object obj, String str, Object... objArr) {
        AbstractC2328.m4341(-993769105818478L);
        AbstractC2328.m4341(-993816350458734L);
        if (obj == null) {
            return null;
        }
        int i = AbstractC2293.f11258;
        C2014 c2014M1327 = AbstractC0476.m1327(obj);
        ((C0903) c2014M1327.f10074).f4118 = 2;
        C1189 c1189M3892 = c2014M1327.m3892();
        c1189M3892.m4478();
        c1189M3892.f12003 = str;
        C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
        if (c0536 != null) {
            return c0536.m1375(Arrays.copyOf(objArr, objArr.length));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m673(Member member, EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-988709634343790L);
        C1329 c1329 = C1329.f6114;
        if (member != null) {
            m682(member, enumC1543, new C1388(interfaceC1549, this, 0));
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m674(Method method, EnumC1543 enumC1543, InterfaceC1549 interfaceC1549, InterfaceC1549 interfaceC15492) {
        AbstractC2328.m4341(-987799101277038L);
        AbstractC2328.m4341(-987880705655662L);
        C1329 c1329 = C1329.f6114;
        if (method != null) {
            m682(method, enumC1543, new C2133(interfaceC1549, 8, interfaceC15492));
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C2746 m675(C0757 c0757, EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        Object c2658;
        C2746 c2746 = C2746.f13459;
        AbstractC2328.m4341(-991265139884910L);
        if (c0757 == null) {
            return null;
        }
        C1329 c1329 = C1329.f6114;
        try {
            m673(c0757.m1704() ? c0757.m1703(m678()) : C0757.m1702(c0757, m678()), enumC1543, interfaceC1549);
            c2658 = c2746;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-991320974459758L), thM4249);
        }
        return c2746;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m676(List list, EnumC1543 enumC1543, C1548 c1548) {
        AbstractC2328.m4341(-992227212559214L);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m687((C0757) it.next(), enumC1543, c1548);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final void m677(Member member, EnumC1543 enumC1543, final InterfaceC0097 interfaceC0097) {
        AbstractC2328.m4341(-986192783508334L);
        AbstractC2328.m4341(-986222848279406L);
        C1329 c1329 = C1329.f6114;
        if (!(member instanceof Method) && !(member instanceof Constructor)) {
            C0188.m798(AbstractC2328.m4341(-986368877167470L).concat(member.getClass().getName()));
            return;
        }
        C2701.f13261.getClass();
        XposedInterface.HookBuilder hookBuilderHook = C2701.m4785().hook((Executable) member);
        AbstractC2328.m4341(-986261502985070L);
        XposedInterface.HookHandle hookHandleIntercept = hookBuilderHook.intercept(new XposedInterface.Hooker(this) { // from class: yyds.ᲇᲁᛱᛳ
            public final Object intercept(XposedInterface.Chain chain) {
                AbstractC2328.m4341(-994834257707886L);
                AbstractC2328.m4341(-986072524424046L);
                AbstractC2328.m4341(-986111179129710L);
                List args = chain.getArgs();
                AbstractC2328.m4341(-986136948933486L);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(args);
                C1829 c1829 = new C1829(chain.getThisObject(), arrayList, args, chain);
                InterfaceC0097 interfaceC00972 = interfaceC0097;
                interfaceC00972.mo385(c1829);
                if (c1829.f9183) {
                    return c1829.f9187;
                }
                C0488 c0488 = new C0488(chain.getThisObject(), arrayList, chain.proceed(arrayList.toArray(new Object[0])));
                interfaceC00972.mo399(c0488);
                return c0488.f2407;
            }
        });
        AbstractC2328.m4341(-986304452658030L);
        C0174.f998.getClass();
        C0174.m734(hookHandleIntercept);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ClassLoader m678() {
        return (ClassLoader) this.f890.getValue();
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m679(C0757 c0757, EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        Object c2658;
        AbstractC2328.m4341(-990354606818158L);
        if (c0757 == null) {
            return;
        }
        try {
            if (c0757.m1704()) {
                m688(c0757.m1703(m678()), enumC1543, interfaceC1549);
            } else {
                m688(C0757.m1702(c0757, m678()), enumC1543, interfaceC1549);
            }
            c2658 = C2746.f13459;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-990410441393006L), thM4249);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final native void m680(List list, EnumC1543 enumC1543, C0179 c0179);

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m681(C0536 c0536, InterfaceC1549 interfaceC1549) {
        Method method;
        AbstractC2328.m4341(-990298772243310L);
        if (c0536 == null || (method = c0536.f2572) == null) {
            return;
        }
        m673(method, null, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m682(Member member, EnumC1543 enumC1543, InterfaceC0097 interfaceC0097) {
        AbstractC2328.m4341(-987227870626670L);
        AbstractC2328.m4341(-987257935397742L);
        C1329 c1329 = C1329.f6114;
        m677(member, enumC1543, new C0644(interfaceC0097, this, member.getDeclaringClass(), member.getName()));
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final void m683(C0536 c0536, InterfaceC1549 interfaceC1549) {
        Method method;
        AbstractC2328.m4341(-990242937668462L);
        if (c0536 == null || (method = c0536.f2572) == null) {
            return;
        }
        m688(method, null, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void m684(EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-989809145971566L);
        AbstractC2328.m4341(-989839210742638L);
        m679(C1586.m3254(enumC1543.f7843), enumC1543, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m685(EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-989641642247022L);
        AbstractC2328.m4341(-989671707018094L);
        m687(C1586.m3254(enumC1543.f7843), enumC1543, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final void m686() {
        Object c2658;
        try {
            mo420();
            c2658 = C2746.f13459;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-985767581746030L) + this + AbstractC2328.m4341(-985789056582510L), thM4249);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m687(C0757 c0757, EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-990900067664750L);
        C1329 c1329 = C1329.f6114;
        if (c0757 == null) {
            return;
        }
        C0213 c0213 = new C0213();
        interfaceC1549.mo371(c0213);
        m682(c0757.m1704() ? c0757.m1703(m678()) : C0757.m1702(c0757, m678()), enumC1543, new C0052(26, c0213));
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m688(Member member, EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-988284432581486L);
        C1329 c1329 = C1329.f6114;
        if (member != null) {
            m682(member, enumC1543, new C1388(interfaceC1549, this, 1));
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m689(EnumC1543 enumC1543, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-989723246625646L);
        AbstractC2328.m4341(-989753311396718L);
        m675(C1586.m3254(enumC1543.f7843), enumC1543, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract void mo420();
}
