package ad;

import ad.C0288t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p300uc.C8661o;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9960m0;
import p375zc.InterfaceC9940c0;
import p375zc.InterfaceC9942d0;
import p375zc.InterfaceC9972x;

/* JADX INFO: renamed from: ad.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0261h0 {

    /* JADX INFO: renamed from: a */
    public static final C0288t.a f641a = new C0288t.a();

    /* JADX INFO: renamed from: b */
    public static final C0288t.a f642b = new C0288t.a();

    /* JADX INFO: renamed from: a */
    public static Map m761a(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c) {
        return m762b(interfaceC9218f, abstractC9939c);
    }

    /* JADX INFO: renamed from: b */
    public static final Map m762b(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zM764d = m764d(abstractC9939c, interfaceC9218f);
        m773m(interfaceC9218f, abstractC9939c);
        int iMo35891e = interfaceC9218f.mo35891e();
        for (int i10 = 0; i10 < iMo35891e; i10++) {
            List listMo35893g = interfaceC9218f.mo35893g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo35893g) {
                if (obj instanceof InterfaceC9940c0) {
                    arrayList.add(obj);
                }
            }
            InterfaceC9940c0 interfaceC9940c0 = (InterfaceC9940c0) AbstractC5081g0.m20539K0(arrayList);
            if (interfaceC9940c0 != null && (strArrNames = interfaceC9940c0.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zM764d) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    }
                    m763c(linkedHashMap, interfaceC9218f, lowerCase2, i10);
                }
            }
            if (zM764d) {
                lowerCase = interfaceC9218f.mo35892f(i10).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                m763c(linkedHashMap, interfaceC9218f, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? AbstractC5109u0.m20768i() : linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public static final void m763c(Map map, InterfaceC9218f interfaceC9218f, String str, int i10) {
        String str2 = AbstractC1061t.m3842c(interfaceC9218f.mo35896j(), AbstractC9224l.b.f31485a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new C0243b0("The suggested name '" + str + "' for " + str2 + ' ' + interfaceC9218f.mo35892f(i10) + " is already one of the names for " + str2 + ' ' + interfaceC9218f.mo35892f(((Number) AbstractC5109u0.m20769j(map, str)).intValue()) + " in " + interfaceC9218f);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m764d(AbstractC9939c abstractC9939c, InterfaceC9218f interfaceC9218f) {
        return abstractC9939c.m38514f().m38555h() && AbstractC1061t.m3842c(interfaceC9218f.mo35896j(), AbstractC9224l.b.f31485a);
    }

    /* JADX INFO: renamed from: e */
    public static final Map m765e(final AbstractC9939c abstractC9939c, final InterfaceC9218f interfaceC9218f) {
        abstractC9939c.getClass();
        interfaceC9218f.getClass();
        return (Map) AbstractC9960m0.m38573a(abstractC9939c).m845b(interfaceC9218f, f641a, new InterfaceC0173a() { // from class: ad.g0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC0261h0.m761a(interfaceC9218f, abstractC9939c);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final C0288t.a m766f() {
        return f641a;
    }

    /* JADX INFO: renamed from: g */
    public static final String m767g(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c, int i10) {
        interfaceC9218f.getClass();
        abstractC9939c.getClass();
        m773m(interfaceC9218f, abstractC9939c);
        return interfaceC9218f.mo35892f(i10);
    }

    /* JADX INFO: renamed from: h */
    public static final int m768h(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c, String str) {
        interfaceC9218f.getClass();
        abstractC9939c.getClass();
        str.getClass();
        if (m764d(abstractC9939c, interfaceC9218f)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return m771k(interfaceC9218f, abstractC9939c, lowerCase);
        }
        m773m(interfaceC9218f, abstractC9939c);
        int iMo35890d = interfaceC9218f.mo35890d(str);
        return (iMo35890d == -3 && abstractC9939c.m38514f().m38562o()) ? m771k(interfaceC9218f, abstractC9939c, str) : iMo35890d;
    }

    /* JADX INFO: renamed from: i */
    public static final int m769i(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c, String str, String str2) {
        interfaceC9218f.getClass();
        abstractC9939c.getClass();
        str.getClass();
        str2.getClass();
        int iM768h = m768h(interfaceC9218f, abstractC9939c, str);
        if (iM768h != -3) {
            return iM768h;
        }
        throw new C8661o(interfaceC9218f.mo35888a() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m770j(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return m769i(interfaceC9218f, abstractC9939c, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static final int m771k(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c, String str) {
        Integer num = (Integer) m765e(abstractC9939c, interfaceC9218f).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m772l(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c) {
        interfaceC9218f.getClass();
        abstractC9939c.getClass();
        if (abstractC9939c.m38514f().m38558k()) {
            return true;
        }
        List annotations = interfaceC9218f.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC9972x) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC9942d0 m773m(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c) {
        interfaceC9218f.getClass();
        abstractC9939c.getClass();
        if (AbstractC1061t.m3842c(interfaceC9218f.mo35896j(), AbstractC9225m.a.f31486a)) {
            abstractC9939c.m38514f().m38559l();
        }
        return null;
    }
}
