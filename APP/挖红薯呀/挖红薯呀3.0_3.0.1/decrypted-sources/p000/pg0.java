package p000;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4851d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o30.<clinit>():void, ux0.<clinit>():void, w60.q(int, java.util.List):int, yw0.<clinit>():void] */
    public /* synthetic */ pg0(int i) {
        this.f4851d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f4851d;
        na1 na1Var = na1.f4229a;
        j31 j31Var = null;
        i71Var = null;
        i71 i71Var = null;
        i71Var = null;
        i71 i71Var2 = null;
        j31Var = null;
        int i2 = 0;
        switch (i) {
            case 0:
                wo0 wo0Var = (wo0) obj;
                return "[" + wo0Var.f7160b + ", " + wo0Var.f7161c + ')';
            case 1:
                return na1Var;
            case 2:
                C0310i7 c0310i7 = ((hj0) obj).f2273a;
                if (c0310i7 != null) {
                    c0310i7.invoke();
                }
                return na1Var;
            case 3:
                fq0 fq0Var = (fq0) obj;
                int i3 = AbstractC0828v5.f6409a;
                g41 g41Var = AbstractC0676r4.f5291b;
                fq0Var.getClass();
                Context context = (Context) AbstractC0398kl.m1936v(fq0Var, g41Var);
                InterfaceC0968ym interfaceC0968ym = (InterfaceC0968ym) AbstractC0398kl.m1936v(fq0Var, AbstractC0131dj.f1121h);
                zm0 zm0Var = (zm0) AbstractC0398kl.m1936v(fq0Var, an0.f198a);
                if (zm0Var == null) {
                    return null;
                }
                return new C0380k5(context, interfaceC0968ym, zm0Var.f7926a, zm0Var.f7927b);
            case 4:
                return new yw0((Map) obj);
            case 5:
                return obj;
            case 6:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) ux0.f6327h.f920f;
                Boolean bool = Boolean.FALSE;
                j31 j31Var2 = (p30.m3002l(obj2, bool) || obj2 == null) ? null : (j31) interfaceC0742sw.invoke(obj2);
                Object obj3 = list.get(1);
                j31 j31Var3 = (p30.m3002l(obj3, bool) || obj3 == null) ? null : (j31) interfaceC0742sw.invoke(obj3);
                Object obj4 = list.get(2);
                j31 j31Var4 = (p30.m3002l(obj4, bool) || obj4 == null) ? null : (j31) interfaceC0742sw.invoke(obj4);
                Object obj5 = list.get(3);
                if (!p30.m3002l(obj5, bool) && obj5 != null) {
                    j31Var = (j31) interfaceC0742sw.invoke(obj5);
                }
                return new i71(j31Var2, j31Var3, j31Var4, j31Var);
            case 7:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (p30.m3002l(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((InterfaceC0742sw) ux0.f6320a.f920f).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new C0200f8(list3, str);
            case 8:
                obj.getClass();
                return new u61(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                List list4 = (List) obj;
                return new y61(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                v71[] v71VarArr = u71.f6157b;
                InterfaceC0742sw interfaceC0742sw2 = ux0.f6341v.f6067e;
                Boolean bool2 = Boolean.FALSE;
                p30.m3002l(obj8, bool2);
                u71 u71Var = obj8 != null ? (u71) interfaceC0742sw2.invoke(obj8) : null;
                u71Var.getClass();
                long j = u71Var.f6159a;
                Object obj9 = list5.get(1);
                p30.m3002l(obj9, bool2);
                u71 u71Var2 = obj9 != null ? (u71) interfaceC0742sw2.invoke(obj9) : null;
                u71Var2.getClass();
                return new z61(j, u71Var2.f6159a);
            case 11:
                obj.getClass();
                return new C1018zv(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                return new C0992z9(((Float) obj).floatValue());
            case 13:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new l71(r60.m3402d(iIntValue, num2.intValue()));
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i4 = C0207ff.f1708h;
                Boolean bool3 = Boolean.FALSE;
                p30.m3002l(obj12, bool3);
                C0207ff c0207ff = obj12 != null ? p30.m3002l(obj12, Boolean.FALSE) ? new C0207ff(C0207ff.f1707g) : new C0207ff(p30.m2992b(((Integer) obj12).intValue())) : null;
                c0207ff.getClass();
                long j2 = c0207ff.f1709a;
                Object obj13 = list7.get(1);
                tx0 tx0Var = ux0.f6343x;
                p30.m3002l(obj13, bool3);
                ok0 ok0Var = obj13 != null ? (ok0) tx0Var.f6067e.invoke(obj13) : null;
                ok0Var.getClass();
                long j3 = ok0Var.f4590a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new v01(j2, j3, f.floatValue());
            case j50.f2734e /* 15 */:
                obj.getClass();
                return new r61(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                C0111d c0111d = ux0.f6328i;
                if (!p30.m3002l(obj16, Boolean.FALSE) && obj16 != null) {
                    i71Var2 = (i71) ((InterfaceC0742sw) c0111d.f920f).invoke(obj16);
                }
                return new sa0(str2, i71Var2);
            case 17:
                obj.getClass();
                return new w61(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                return new C0336iz(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i2 < size) {
                    Object obj17 = list9.get(i2);
                    C0163e8 c0163e8 = (p30.m3002l(obj17, Boolean.FALSE) || obj17 == null) ? null : (C0163e8) ((InterfaceC0742sw) ux0.f6321b.f920f).invoke(obj17);
                    c0163e8.getClass();
                    arrayList.add(c0163e8);
                    i2++;
                }
                return arrayList;
            case 20:
                obj.getClass();
                return new C0940xv(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new C0977yv(((Integer) obj).intValue());
            case 22:
                Boolean bool4 = Boolean.FALSE;
                if (p30.m3002l(obj, bool4)) {
                    return new u71(u71.f6158c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                tx0 tx0Var2 = ux0.f6342w;
                p30.m3002l(obj19, bool4);
                v71 v71Var = obj19 != null ? (v71) tx0Var2.f6067e.invoke(obj19) : null;
                v71Var.getClass();
                return new u71(j50.m1670t(fFloatValue, v71Var.f6440a));
            case 23:
                return p30.m3002l(obj, 0) ? new v71(8589934592L) : p30.m3002l(obj, 1) ? new v71(4294967296L) : new v71(0L);
            case 24:
                if (p30.m3002l(obj, Boolean.FALSE)) {
                    return new ok0(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new ok0((((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            case 25:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i2 < size2) {
                    Object obj22 = list12.get(i2);
                    eb0 eb0Var = (p30.m3002l(obj22, Boolean.FALSE) || obj22 == null) ? null : (eb0) ((InterfaceC0742sw) ux0.f6345z.f920f).invoke(obj22);
                    eb0Var.getClass();
                    arrayList2.add(eb0Var);
                    i2++;
                }
                return new fb0(arrayList2);
            case 26:
                obj.getClass();
                String str3 = (String) obj;
                cr0.f883a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (p30.m3002l(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new eb0(localeForLanguageTag);
            case 27:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                C0111d c0111d2 = ux0.f6328i;
                if (!p30.m3002l(obj24, Boolean.FALSE) && obj24 != null) {
                    i71Var = (i71) ((InterfaceC0742sw) c0111d2.f920f).invoke(obj24);
                }
                return new ra0(str4, i71Var);
            case 28:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = ia0.f2498b;
                tx0 tx0Var3 = ux0.f6317B;
                Boolean bool5 = Boolean.FALSE;
                p30.m3002l(obj25, bool5);
                ia0 ia0Var = obj25 != null ? (ia0) tx0Var3.f6067e.invoke(obj25) : null;
                ia0Var.getClass();
                float f6 = ia0Var.f2501a;
                Object obj26 = list14.get(1);
                tx0 tx0Var4 = ux0.f6318C;
                p30.m3002l(obj26, bool5);
                ka0 ka0Var = obj26 != null ? (ka0) tx0Var4.f6067e.invoke(obj26) : null;
                ka0Var.getClass();
                int i5 = ka0Var.f3055a;
                Object obj27 = list14.get(2);
                tx0 tx0Var5 = ux0.f6319D;
                p30.m3002l(obj27, bool5);
                ja0 ja0Var = obj27 != null ? (ja0) tx0Var5.f6067e.invoke(obj27) : null;
                ja0Var.getClass();
                return new la0(f6, i5, ja0Var.f2778a);
            default:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                ia0.m1570a(fFloatValue3);
                return new ia0(fFloatValue3);
        }
    }
}
