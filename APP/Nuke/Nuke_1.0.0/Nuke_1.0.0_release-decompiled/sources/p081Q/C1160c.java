package p081Q;

import android.util.Log;
import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.dartcv.nuke.BuildConfig;
import p000A.C0038T0;
import p041H0.InterfaceC0558E0;
import p056K2.C0891q;
import p092S0.AbstractC1250C;
import p092S0.AbstractC1251D;
import p092S0.C1249B;
import p092S0.C1252E;
import p092S0.C1258K;
import p092S0.C1259L;
import p092S0.C1267e;
import p092S0.C1269g;
import p092S0.C1273k;
import p092S0.C1274l;
import p092S0.C1279q;
import p092S0.C1282t;
import p092S0.InterfaceC1264b;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p125Z0.AbstractC1782c;
import p125Z0.C1780a;
import p125Z0.C1781b;
import p147d1.C1951a;
import p147d1.C1954d;
import p147d1.C1956f;
import p147d1.C1957g;
import p147d1.C1958h;
import p147d1.C1959i;
import p147d1.C1961k;
import p147d1.C1962l;
import p147d1.C1963m;
import p147d1.C1966p;
import p147d1.C1967q;
import p153e1.C2019o;
import p153e1.C2020p;
import p204n0.C2683b;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.C2762u;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: Q.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1160c implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3804d;

    public /* synthetic */ C1160c(int i5) {
        this.f3804d = i5;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C1252E c1252e = null;
        c1258k = null;
        C1258K c1258k = null;
        c1258k = null;
        C1258K c1258k2 = null;
        c1252e = null;
        int i5 = 0;
        switch (this.f3804d) {
            case 0:
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2983c((InterfaceC0558E0) obj, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                throw new ClassCastException();
            case 2:
                AbstractC1665j.m2983c((InterfaceC0558E0) obj, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                throw new ClassCastException();
            case 3:
                return Boolean.valueOf(!(((InterfaceC1264b) obj) instanceof C1282t));
            case 4:
                C1279q c1279q = (C1279q) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(c1279q.f4596b);
                sb.append(", ");
                return AbstractC3202a.m5466a(sb, c1279q.f4597c, ')');
            case 5:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) AbstractC1250C.f4470h.f170f;
                Boolean bool = Boolean.FALSE;
                C1252E c1252e2 = (AbstractC1665j.m2981a(obj2, bool) || obj2 == null) ? null : (C1252E) interfaceC1601c.mo1h(obj2);
                Object obj3 = list.get(1);
                C1252E c1252e3 = (AbstractC1665j.m2981a(obj3, bool) || obj3 == null) ? null : (C1252E) interfaceC1601c.mo1h(obj3);
                Object obj4 = list.get(2);
                C1252E c1252e4 = (AbstractC1665j.m2981a(obj4, bool) || obj4 == null) ? null : (C1252E) interfaceC1601c.mo1h(obj4);
                Object obj5 = list.get(3);
                if (!AbstractC1665j.m2981a(obj5, bool) && obj5 != null) {
                    c1252e = (C1252E) interfaceC1601c.mo1h(obj5);
                }
                return new C1258K(c1252e2, c1252e3, c1252e4, c1252e);
            case 6:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC1665j.m2981a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((InterfaceC1601c) AbstractC1250C.f4463a.f170f).mo1h(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                AbstractC1665j.m2982b(str);
                return new C1269g(list3, str);
            case 7:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1962l(((Integer) obj).intValue());
            case 8:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new C1966p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 9:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                C2020p[] c2020pArr = C2019o.f6746b;
                InterfaceC1601c interfaceC1601c2 = AbstractC1250C.f4484v.f4458e;
                Boolean bool2 = Boolean.FALSE;
                AbstractC1665j.m2981a(obj8, bool2);
                C2019o c2019o = obj8 != null ? (C2019o) interfaceC1601c2.mo1h(obj8) : null;
                AbstractC1665j.m2982b(c2019o);
                long j5 = c2019o.f6748a;
                Object obj9 = list5.get(1);
                AbstractC1665j.m2981a(obj9, bool2);
                C2019o c2019o2 = obj9 != null ? (C2019o) interfaceC1601c2.mo1h(obj9) : null;
                AbstractC1665j.m2982b(c2019o2);
                return new C1967q(j5, c2019o2.f6748a);
            case 10:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1587l(((Integer) obj).intValue());
            case 11:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new C1951a(((Float) obj).floatValue());
            case 12:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                AbstractC1665j.m2982b(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                AbstractC1665j.m2982b(num2);
                return new C1259L(AbstractC1251D.m2313b(iIntValue, num2.intValue()));
            case 13:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i6 = C2762u.f8763h;
                Boolean bool3 = Boolean.FALSE;
                AbstractC1665j.m2981a(obj12, bool3);
                C2762u c2762u = obj12 != null ? AbstractC1665j.m2981a(obj12, Boolean.FALSE) ? new C2762u(C2762u.f8762g) : new C2762u(AbstractC2767z.m4933c(((Integer) obj12).intValue())) : null;
                AbstractC1665j.m2982b(c2762u);
                long j6 = c2762u.f8764a;
                Object obj13 = list7.get(1);
                C1249B c1249b = AbstractC1250C.f4486x;
                AbstractC1665j.m2981a(obj13, bool3);
                C2683b c2683b = obj13 != null ? (C2683b) c1249b.f4458e.mo1h(obj13) : null;
                AbstractC1665j.m2982b(c2683b);
                long j7 = c2683b.f8556a;
                Object obj14 = list7.get(2);
                Float f2 = obj14 != null ? (Float) obj14 : null;
                AbstractC1665j.m2982b(f2);
                return new C2737L(j6, j7, f2.floatValue());
            case 14:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1961k(((Integer) obj).intValue());
            case 15:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                AbstractC1665j.m2982b(str2);
                Object obj16 = list8.get(1);
                C0038T0 c0038t0 = AbstractC1250C.f4471i;
                if (!AbstractC1665j.m2981a(obj16, Boolean.FALSE) && obj16 != null) {
                    c1258k2 = (C1258K) ((InterfaceC1601c) c0038t0.f170f).mo1h(obj16);
                }
                return new C1274l(str2, c1258k2);
            case 16:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1963m(((Integer) obj).intValue());
            case 17:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1954d(((Integer) obj).intValue());
            case 18:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i5 < size) {
                    Object obj17 = list9.get(i5);
                    C1267e c1267e = (AbstractC1665j.m2981a(obj17, Boolean.FALSE) || obj17 == null) ? null : (C1267e) ((InterfaceC1601c) AbstractC1250C.f4464b.f170f).mo1h(obj17);
                    AbstractC1665j.m2982b(c1267e);
                    arrayList.add(c1267e);
                    i5++;
                }
                return arrayList;
            case 19:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1585j(((Integer) obj).intValue());
            case 20:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1586k(((Integer) obj).intValue());
            case 21:
                Boolean bool4 = Boolean.FALSE;
                if (AbstractC1665j.m2981a(obj, bool4)) {
                    return new C2019o(C2019o.f6747c);
                }
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f5 = obj18 != null ? (Float) obj18 : null;
                AbstractC1665j.m2982b(f5);
                float fFloatValue = f5.floatValue();
                Object obj19 = list10.get(1);
                C1249B c1249b2 = AbstractC1250C.f4485w;
                AbstractC1665j.m2981a(obj19, bool4);
                C2020p c2020p = obj19 != null ? (C2020p) c1249b2.f4458e.mo1h(obj19) : null;
                AbstractC1665j.m2982b(c2020p);
                return new C2019o(AbstractC1926h.m3582y(fFloatValue, c2020p.f6749a));
            case 22:
                return AbstractC1665j.m2981a(obj, 0) ? new C2020p(8589934592L) : AbstractC1665j.m2981a(obj, 1) ? new C2020p(4294967296L) : new C2020p(0L);
            case 23:
                if (AbstractC1665j.m2981a(obj, Boolean.FALSE)) {
                    return new C2683b(9205357640488583168L);
                }
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f6 = obj20 != null ? (Float) obj20 : null;
                AbstractC1665j.m2982b(f6);
                float fFloatValue2 = f6.floatValue();
                Object obj21 = list11.get(1);
                Float f7 = obj21 != null ? (Float) obj21 : null;
                AbstractC1665j.m2982b(f7);
                return new C2683b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f7.floatValue())) & 4294967295L));
            case 24:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i5 < size2) {
                    Object obj22 = list12.get(i5);
                    C1780a c1780a = (AbstractC1665j.m2981a(obj22, Boolean.FALSE) || obj22 == null) ? null : (C1780a) ((InterfaceC1601c) AbstractC1250C.f4488z.f170f).mo1h(obj22);
                    AbstractC1665j.m2982b(c1780a);
                    arrayList2.add(c1780a);
                    i5++;
                }
                return new C1781b(arrayList2);
            case 25:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                AbstractC1782c.f6092a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (AbstractC1665j.m2981a(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C1780a(localeForLanguageTag);
            case 26:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                AbstractC1665j.m2982b(str4);
                Object obj24 = list13.get(1);
                C0038T0 c0038t02 = AbstractC1250C.f4471i;
                if (!AbstractC1665j.m2981a(obj24, Boolean.FALSE) && obj24 != null) {
                    c1258k = (C1258K) ((InterfaceC1601c) c0038t02.f170f).mo1h(obj24);
                }
                return new C1273k(str4, c1258k);
            case 27:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f8 = C1956f.f6626b;
                C1249B c1249b3 = AbstractC1250C.f4460B;
                Boolean bool5 = Boolean.FALSE;
                AbstractC1665j.m2981a(obj25, bool5);
                C1956f c1956f = obj25 != null ? (C1956f) c1249b3.f4458e.mo1h(obj25) : null;
                AbstractC1665j.m2982b(c1956f);
                float f9 = c1956f.f6629a;
                Object obj26 = list14.get(1);
                C1249B c1249b4 = AbstractC1250C.f4461C;
                AbstractC1665j.m2981a(obj26, bool5);
                C1958h c1958h = obj26 != null ? (C1958h) c1249b4.f4458e.mo1h(obj26) : null;
                AbstractC1665j.m2982b(c1958h);
                int i7 = c1958h.f6631a;
                Object obj27 = list14.get(2);
                C1249B c1249b5 = AbstractC1250C.f4462D;
                AbstractC1665j.m2981a(obj27, bool5);
                C1957g c1957g = obj27 != null ? (C1957g) c1249b5.f4458e.mo1h(obj27) : null;
                AbstractC1665j.m2982b(c1957g);
                return new C1959i(f9, i7, c1957g.f6630a);
            case 28:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) obj).floatValue();
                C1956f.m3624a(fFloatValue3);
                return new C1956f(fFloatValue3);
            default:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1958h(((Integer) obj).intValue());
        }
    }
}
