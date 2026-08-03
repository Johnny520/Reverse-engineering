package p119i2;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okio.C3193a;
import p057e1.C0807b;
import p071f1.AbstractC0996c0;
import p071f1.C1024q0;
import p071f1.C1034w;
import p085fg.InterfaceC1231l;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p222p.AbstractC3199a;
import p225p2.C3289a;
import p225p2.C3290b;
import p227p4.C3315t;
import p280t2.C4085a;
import p280t2.C4088d;
import p280t2.C4090f;
import p280t2.C4091g;
import p280t2.C4092h;
import p280t2.C4093i;
import p280t2.C4095k;
import p280t2.C4096l;
import p280t2.C4097m;
import p280t2.C4100p;
import p280t2.C4101q;
import p293u2.C4245o;
import p293u2.C4246p;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: i2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1946q implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6595g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i2.d0.<clinit>():void, i2.e0.d(int, java.util.List):int] */
    public /* synthetic */ C1946q(int i9) {
        this.f6595g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C1922e c1922e;
        int i9 = 0;
        C1925f0 c1925f0 = null;
        c1934k = null;
        C1934k c1934k = null;
        c1936l = null;
        C1936l c1936l = null;
        c1943o0 = null;
        C1943o0 c1943o0 = null;
        c1945p0 = null;
        C1945p0 c1945p0 = null;
        c1925f0 = null;
        C1925f0 c1925f02 = null;
        c1950u = null;
        C1950u c1950u = null;
        c1937l0 = null;
        C1937l0 c1937l0 = null;
        c1937l0 = null;
        C1937l0 c1937l02 = null;
        c1925f0 = null;
        switch (this.f6595g) {
            case 0:
                C1947r c1947r = (C1947r) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(c1947r.f6597b);
                sb2.append(", ");
                return AbstractC3199a.m6841n(sb2, c1947r.f6598c, ')');
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) AbstractC1921d0.f6484h.f10678i;
                Boolean bool = Boolean.FALSE;
                C1925f0 c1925f03 = (AbstractC1416l.m3825a(obj2, bool) || obj2 == null) ? null : (C1925f0) interfaceC1231l.invoke(obj2);
                Object obj3 = list.get(1);
                C1925f0 c1925f04 = (AbstractC1416l.m3825a(obj3, bool) || obj3 == null) ? null : (C1925f0) interfaceC1231l.invoke(obj3);
                Object obj4 = list.get(2);
                C1925f0 c1925f05 = (AbstractC1416l.m3825a(obj4, bool) || obj4 == null) ? null : (C1925f0) interfaceC1231l.invoke(obj4);
                Object obj5 = list.get(3);
                if (!AbstractC1416l.m3825a(obj5, bool) && obj5 != null) {
                    c1925f0 = (C1925f0) interfaceC1231l.invoke(obj5);
                }
                return new C1937l0(c1925f03, c1925f04, c1925f05, c1925f0);
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC1416l.m3825a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((InterfaceC1231l) AbstractC1921d0.f6477a.f10678i).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new C1926g(list3, str);
            case 3:
                obj.getClass();
                return new C4096l(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                List list4 = (List) obj;
                return new C4100p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 5:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                C4246p[] c4246pArr = C4245o.f13923b;
                InterfaceC1231l interfaceC1231l2 = AbstractC1921d0.f6498v.f6469h;
                Boolean bool2 = Boolean.FALSE;
                AbstractC1416l.m3825a(obj8, bool2);
                C4245o c4245o = obj8 != null ? (C4245o) interfaceC1231l2.invoke(obj8) : null;
                c4245o.getClass();
                long j3 = c4245o.f13925a;
                Object obj9 = list5.get(1);
                AbstractC1416l.m3825a(obj9, bool2);
                C4245o c4245o2 = obj9 != null ? (C4245o) interfaceC1231l2.invoke(obj9) : null;
                c4245o2.getClass();
                return new C4101q(j3, c4245o2.f13925a);
            case 6:
                obj.getClass();
                return new C2767k(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                return new C4085a(((Float) obj).floatValue());
            case 8:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new C1939m0(AbstractC1923e0.m4784b(iIntValue, num2.intValue()));
            case 9:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i10 = C1034w.f3264h;
                Boolean bool3 = Boolean.FALSE;
                AbstractC1416l.m3825a(obj12, bool3);
                C1034w c1034w = obj12 != null ? AbstractC1416l.m3825a(obj12, Boolean.FALSE) ? new C1034w(C1034w.f3263g) : new C1034w(AbstractC0996c0.m2507c(((Integer) obj12).intValue())) : null;
                c1034w.getClass();
                long j4 = c1034w.f3265a;
                Object obj13 = list7.get(1);
                C1919c0 c1919c0 = AbstractC1921d0.f6500x;
                AbstractC1416l.m3825a(obj13, bool3);
                C0807b c0807b = obj13 != null ? (C0807b) c1919c0.f6469h.invoke(obj13) : null;
                c0807b.getClass();
                long j5 = c0807b.f2414a;
                Object obj14 = list7.get(2);
                Float f3 = obj14 != null ? (Float) obj14 : null;
                f3.getClass();
                return new C1024q0(f3.floatValue(), j4, j5);
            case 10:
                obj.getClass();
                return new C4095k(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                C3315t c3315t = AbstractC1921d0.f6485i;
                if (!AbstractC1416l.m3825a(obj16, Boolean.FALSE) && obj16 != null) {
                    c1937l02 = (C1937l0) ((InterfaceC1231l) c3315t.f10678i).invoke(obj16);
                }
                return new C1936l(str2, c1937l02);
            case 12:
                obj.getClass();
                return new C4097m(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new C4088d(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i9 < size) {
                    Object obj17 = list9.get(i9);
                    C1922e c1922e2 = (AbstractC1416l.m3825a(obj17, Boolean.FALSE) || obj17 == null) ? null : (C1922e) ((InterfaceC1231l) AbstractC1921d0.f6478b.f10678i).invoke(obj17);
                    c1922e2.getClass();
                    arrayList.add(c1922e2);
                    i9++;
                }
                return arrayList;
            case 15:
                obj.getClass();
                return new C2765i(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                return new C2766j(((Integer) obj).intValue());
            case 17:
                Boolean bool4 = Boolean.FALSE;
                if (AbstractC1416l.m3825a(obj, bool4)) {
                    return new C4245o(C4245o.f13924c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f10 = obj18 != null ? (Float) obj18 : null;
                f10.getClass();
                float fFloatValue = f10.floatValue();
                Object obj19 = list10.get(1);
                C1919c0 c1919c02 = AbstractC1921d0.f6499w;
                AbstractC1416l.m3825a(obj19, bool4);
                C4246p c4246p = obj19 != null ? (C4246p) c1919c02.f6469h.invoke(obj19) : null;
                c4246p.getClass();
                return new C4245o(AbstractC5700d.m10260R(c4246p.f13926a, fFloatValue));
            case 18:
                return AbstractC1416l.m3825a(obj, 0) ? new C4246p(8589934592L) : AbstractC1416l.m3825a(obj, 1) ? new C4246p(4294967296L) : new C4246p(0L);
            case 19:
                if (AbstractC1416l.m3825a(obj, Boolean.FALSE)) {
                    return new C0807b(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f11 = obj20 != null ? (Float) obj20 : null;
                f11.getClass();
                float fFloatValue2 = f11.floatValue();
                Object obj21 = list11.get(1);
                Float f12 = obj21 != null ? (Float) obj21 : null;
                f12.getClass();
                return new C0807b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
            case 20:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i9 < size2) {
                    Object obj22 = list12.get(i9);
                    C3289a c3289a = (AbstractC1416l.m3825a(obj22, Boolean.FALSE) || obj22 == null) ? null : (C3289a) ((InterfaceC1231l) AbstractC1921d0.f6502z.f10678i).invoke(obj22);
                    c3289a.getClass();
                    arrayList2.add(c3289a);
                    i9++;
                }
                return new C3290b(arrayList2);
            case 21:
                obj.getClass();
                String str3 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (AbstractC1416l.m3825a(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C3289a(localeForLanguageTag);
            case 22:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                C3315t c3315t2 = AbstractC1921d0.f6485i;
                if (!AbstractC1416l.m3825a(obj24, Boolean.FALSE) && obj24 != null) {
                    c1937l0 = (C1937l0) ((InterfaceC1231l) c3315t2.f10678i).invoke(obj24);
                }
                return new C1934k(str4, c1937l0);
            case 23:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f13 = C4090f.f13544b;
                C1919c0 c1919c03 = AbstractC1921d0.f6474B;
                Boolean bool5 = Boolean.FALSE;
                AbstractC1416l.m3825a(obj25, bool5);
                C4090f c4090f = obj25 != null ? (C4090f) c1919c03.f6469h.invoke(obj25) : null;
                c4090f.getClass();
                float f14 = c4090f.f13547a;
                Object obj26 = list14.get(1);
                C1919c0 c1919c04 = AbstractC1921d0.f6475C;
                AbstractC1416l.m3825a(obj26, bool5);
                C4092h c4092h = obj26 != null ? (C4092h) c1919c04.f6469h.invoke(obj26) : null;
                c4092h.getClass();
                int i11 = c4092h.f13549a;
                Object obj27 = list14.get(2);
                C1919c0 c1919c05 = AbstractC1921d0.f6476D;
                AbstractC1416l.m3825a(obj27, bool5);
                C4091g c4091g = obj27 != null ? (C4091g) c1919c05.f6469h.invoke(obj27) : null;
                c4091g.getClass();
                return new C4093i(f14, i11, c4091g.f13548a);
            case 24:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                C4090f.m8272a(fFloatValue3);
                return new C4090f(fFloatValue3);
            case 25:
                obj.getClass();
                return new C4092h(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                List list15 = (List) obj;
                Object obj28 = list15.get(0);
                EnumC1930i enumC1930i = obj28 != null ? (EnumC1930i) obj28 : null;
                enumC1930i.getClass();
                Object obj29 = list15.get(2);
                Integer num3 = obj29 != null ? (Integer) obj29 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj30 = list15.get(3);
                Integer num4 = obj30 != null ? (Integer) obj30 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj31 = list15.get(4);
                String str5 = obj31 != null ? (String) obj31 : null;
                str5.getClass();
                switch (enumC1930i.ordinal()) {
                    case 0:
                        Object obj32 = list15.get(1);
                        C3315t c3315t3 = AbstractC1921d0.f6483g;
                        if (!AbstractC1416l.m3825a(obj32, Boolean.FALSE) && obj32 != null) {
                            c1950u = (C1950u) ((InterfaceC1231l) c3315t3.f10678i).invoke(obj32);
                        }
                        c1950u.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, c1950u);
                        break;
                    case 1:
                        Object obj33 = list15.get(1);
                        C3315t c3315t4 = AbstractC1921d0.f6484h;
                        if (!AbstractC1416l.m3825a(obj33, Boolean.FALSE) && obj33 != null) {
                            c1925f02 = (C1925f0) ((InterfaceC1231l) c3315t4.f10678i).invoke(obj33);
                        }
                        c1925f02.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, c1925f02);
                        break;
                    case 2:
                        Object obj34 = list15.get(1);
                        C3315t c3315t5 = AbstractC1921d0.f6479c;
                        if (!AbstractC1416l.m3825a(obj34, Boolean.FALSE) && obj34 != null) {
                            c1945p0 = (C1945p0) ((InterfaceC1231l) c3315t5.f10678i).invoke(obj34);
                        }
                        c1945p0.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, c1945p0);
                        break;
                    case 3:
                        Object obj35 = list15.get(1);
                        C3315t c3315t6 = AbstractC1921d0.f6480d;
                        if (!AbstractC1416l.m3825a(obj35, Boolean.FALSE) && obj35 != null) {
                            c1943o0 = (C1943o0) ((InterfaceC1231l) c3315t6.f10678i).invoke(obj35);
                        }
                        c1943o0.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, c1943o0);
                        break;
                    case 4:
                        Object obj36 = list15.get(1);
                        C3315t c3315t7 = AbstractC1921d0.f6481e;
                        if (!AbstractC1416l.m3825a(obj36, Boolean.FALSE) && obj36 != null) {
                            c1936l = (C1936l) ((InterfaceC1231l) c3315t7.f10678i).invoke(obj36);
                        }
                        c1936l.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, c1936l);
                        break;
                    case 5:
                        Object obj37 = list15.get(1);
                        C3315t c3315t8 = AbstractC1921d0.f6482f;
                        if (!AbstractC1416l.m3825a(obj37, Boolean.FALSE) && obj37 != null) {
                            c1934k = (C1934k) ((InterfaceC1231l) c3315t8.f10678i).invoke(obj37);
                        }
                        c1934k.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, c1934k);
                        break;
                    case 6:
                        Object obj38 = list15.get(1);
                        String str6 = obj38 != null ? (String) obj38 : null;
                        str6.getClass();
                        c1922e = new C1922e(str5, iIntValue2, iIntValue3, new C1929h0(str6));
                        break;
                    default:
                        C3193a.m6822k();
                        return null;
                }
                return c1922e;
            case 27:
                obj.getClass();
                return new C4091g(((Integer) obj).intValue());
            case 28:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new C1945p0(str7);
            default:
                String str8 = obj != null ? (String) obj : null;
                str8.getClass();
                return new C1943o0(str8);
        }
    }
}
