package p000;

import android.content.res.Resources;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5856d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [cg.m(java.lang.Object):java.lang.Object, kl.<clinit>():void, p30.<clinit>():void, py0.<clinit>():void, t21.<clinit>():void, top.anjao2024.xp1whs.MainActivity.onCreate(android.os.Bundle):void, us0.invoke():java.lang.Object, ux0.<clinit>():void, wy0.<clinit>():void] */
    public /* synthetic */ sx0(int i) {
        this.f5856d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        C0163e8 c0163e8;
        int i = this.f5856d;
        na1 na1Var = na1.f4229a;
        ap0 ap0Var = null;
        c0066bs = null;
        C0066bs c0066bs = null;
        v01Var = null;
        v01 v01Var = null;
        k71Var = null;
        k71 k71Var = null;
        ra0Var = null;
        ra0 ra0Var = null;
        sa0Var = null;
        sa0 sa0Var = null;
        wa1Var = null;
        wa1 wa1Var = null;
        ub1Var = null;
        ub1 ub1Var = null;
        j31Var = null;
        j31 j31Var = null;
        ap0Var = null;
        switch (i) {
            case 0:
                obj.getClass();
                return new ka0(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                EnumC0274h8 enumC0274h8 = obj2 != null ? (EnumC0274h8) obj2 : null;
                enumC0274h8.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (enumC0274h8.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        C0111d c0111d = ux0.f6326g;
                        if (!p30.m3002l(obj6, Boolean.FALSE) && obj6 != null) {
                            ap0Var = (ap0) ((InterfaceC0742sw) c0111d.f920f).invoke(obj6);
                        }
                        ap0Var.getClass();
                        c0163e8 = new C0163e8(ap0Var, iIntValue, iIntValue2, str);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        C0111d c0111d2 = ux0.f6327h;
                        if (!p30.m3002l(obj7, Boolean.FALSE) && obj7 != null) {
                            j31Var = (j31) ((InterfaceC0742sw) c0111d2.f920f).invoke(obj7);
                        }
                        j31Var.getClass();
                        c0163e8 = new C0163e8(j31Var, iIntValue, iIntValue2, str);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        C0111d c0111d3 = ux0.f6322c;
                        if (!p30.m3002l(obj8, Boolean.FALSE) && obj8 != null) {
                            ub1Var = (ub1) ((InterfaceC0742sw) c0111d3.f920f).invoke(obj8);
                        }
                        ub1Var.getClass();
                        c0163e8 = new C0163e8(ub1Var, iIntValue, iIntValue2, str);
                        break;
                    case 3:
                        Object obj9 = list.get(1);
                        C0111d c0111d4 = ux0.f6323d;
                        if (!p30.m3002l(obj9, Boolean.FALSE) && obj9 != null) {
                            wa1Var = (wa1) ((InterfaceC0742sw) c0111d4.f920f).invoke(obj9);
                        }
                        wa1Var.getClass();
                        c0163e8 = new C0163e8(wa1Var, iIntValue, iIntValue2, str);
                        break;
                    case 4:
                        Object obj10 = list.get(1);
                        C0111d c0111d5 = ux0.f6324e;
                        if (!p30.m3002l(obj10, Boolean.FALSE) && obj10 != null) {
                            sa0Var = (sa0) ((InterfaceC0742sw) c0111d5.f920f).invoke(obj10);
                        }
                        sa0Var.getClass();
                        c0163e8 = new C0163e8(sa0Var, iIntValue, iIntValue2, str);
                        break;
                    case 5:
                        Object obj11 = list.get(1);
                        C0111d c0111d6 = ux0.f6325f;
                        if (!p30.m3002l(obj11, Boolean.FALSE) && obj11 != null) {
                            ra0Var = (ra0) ((InterfaceC0742sw) c0111d6.f920f).invoke(obj11);
                        }
                        ra0Var.getClass();
                        c0163e8 = new C0163e8(ra0Var, iIntValue, iIntValue2, str);
                        break;
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        c0163e8 = new C0163e8(new j41(str2), iIntValue, iIntValue2, str);
                        break;
                    default:
                        C0921xc.m5129j();
                        return null;
                }
                return c0163e8;
            case 2:
                obj.getClass();
                return new ja0(((Integer) obj).intValue());
            case 3:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new ub1(str3);
            case 4:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new wa1(str4);
            case 5:
                obj.getClass();
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                tx0 tx0Var = ux0.f6336q;
                Boolean bool = Boolean.FALSE;
                p30.m3002l(obj13, bool);
                r61 r61Var = obj13 != null ? (r61) tx0Var.f6067e.invoke(obj13) : null;
                r61Var.getClass();
                int i2 = r61Var.f5306a;
                Object obj14 = list2.get(1);
                tx0 tx0Var2 = ux0.f6337r;
                p30.m3002l(obj14, bool);
                w61 w61Var = obj14 != null ? (w61) tx0Var2.f6067e.invoke(obj14) : null;
                w61Var.getClass();
                int i3 = w61Var.f7014a;
                Object obj15 = list2.get(2);
                v71[] v71VarArr = u71.f6157b;
                tx0 tx0Var3 = ux0.f6341v;
                p30.m3002l(obj15, bool);
                u71 u71Var = obj15 != null ? (u71) tx0Var3.f6067e.invoke(obj15) : null;
                u71Var.getClass();
                long j = u71Var.f6159a;
                Object obj16 = list2.get(3);
                z61 z61Var = z61.f7816c;
                z61 z61Var2 = (p30.m3002l(obj16, bool) || obj16 == null) ? null : (z61) ((InterfaceC0742sw) ux0.f6331l.f920f).invoke(obj16);
                Object obj17 = list2.get(4);
                er0 er0Var = (p30.m3002l(obj17, bool) || obj17 == null) ? null : (er0) ((InterfaceC0742sw) p30.f4740g.f920f).invoke(obj17);
                Object obj18 = list2.get(5);
                la0 la0Var = la0.f3399d;
                la0 la0Var2 = (p30.m3002l(obj18, bool) || obj18 == null) ? null : (la0) ((InterfaceC0742sw) ux0.f6316A.f920f).invoke(obj18);
                Object obj19 = list2.get(6);
                ga0 ga0Var = (p30.m3002l(obj19, bool) || obj19 == null) ? null : (ga0) ((InterfaceC0742sw) p30.f4742i.f920f).invoke(obj19);
                ga0Var.getClass();
                int i4 = ga0Var.f1899a;
                Object obj20 = list2.get(7);
                tx0 tx0Var4 = ux0.f6338s;
                p30.m3002l(obj20, bool);
                C0336iz c0336iz = obj20 != null ? (C0336iz) tx0Var4.f6067e.invoke(obj20) : null;
                c0336iz.getClass();
                int i5 = c0336iz.f2635a;
                Object obj21 = list2.get(8);
                C0111d c0111d7 = p30.f4743j;
                if (!p30.m3002l(obj21, bool) && obj21 != null) {
                    k71Var = (k71) ((InterfaceC0742sw) c0111d7.f920f).invoke(obj21);
                }
                return new ap0(i2, i3, j, z61Var2, er0Var, la0Var2, i4, i5, k71Var);
            case 6:
                obj.getClass();
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i6 = C0207ff.f1708h;
                Boolean bool2 = Boolean.FALSE;
                p30.m3002l(obj22, bool2);
                C0207ff c0207ff = obj22 != null ? obj22.equals(bool2) ? new C0207ff(C0207ff.f1707g) : new C0207ff(p30.m2992b(((Integer) obj22).intValue())) : null;
                c0207ff.getClass();
                long j2 = c0207ff.f1709a;
                Object obj23 = list3.get(1);
                v71[] v71VarArr2 = u71.f6157b;
                InterfaceC0742sw interfaceC0742sw = ux0.f6341v.f6067e;
                p30.m3002l(obj23, bool2);
                u71 u71Var2 = obj23 != null ? (u71) interfaceC0742sw.invoke(obj23) : null;
                u71Var2.getClass();
                long j3 = u71Var2.f6159a;
                Object obj24 = list3.get(2);
                C1018zv c1018zv = C1018zv.f8004e;
                C1018zv c1018zv2 = (p30.m3002l(obj24, bool2) || obj24 == null) ? null : (C1018zv) ((InterfaceC0742sw) ux0.f6332m.f920f).invoke(obj24);
                Object obj25 = list3.get(3);
                C0940xv c0940xv = (p30.m3002l(obj25, bool2) || obj25 == null) ? null : (C0940xv) ((InterfaceC0742sw) ux0.f6339t.f920f).invoke(obj25);
                Object obj26 = list3.get(4);
                C0977yv c0977yv = (p30.m3002l(obj26, bool2) || obj26 == null) ? null : (C0977yv) ((InterfaceC0742sw) ux0.f6340u.f920f).invoke(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                p30.m3002l(obj28, bool2);
                u71 u71Var3 = obj28 != null ? (u71) interfaceC0742sw.invoke(obj28) : null;
                u71Var3.getClass();
                long j4 = u71Var3.f6159a;
                Object obj29 = list3.get(8);
                C0992z9 c0992z9 = (p30.m3002l(obj29, bool2) || obj29 == null) ? null : (C0992z9) ((InterfaceC0742sw) ux0.f6333n.f920f).invoke(obj29);
                Object obj30 = list3.get(9);
                y61 y61Var = (p30.m3002l(obj30, bool2) || obj30 == null) ? null : (y61) ((InterfaceC0742sw) ux0.f6330k.f920f).invoke(obj30);
                Object obj31 = list3.get(10);
                fb0 fb0Var = fb0.f1650f;
                fb0 fb0Var2 = (p30.m3002l(obj31, bool2) || obj31 == null) ? null : (fb0) ((InterfaceC0742sw) ux0.f6344y.f920f).invoke(obj31);
                Object obj32 = list3.get(11);
                p30.m3002l(obj32, bool2);
                C0207ff c0207ff2 = obj32 != null ? obj32.equals(bool2) ? new C0207ff(C0207ff.f1707g) : new C0207ff(p30.m2992b(((Integer) obj32).intValue())) : null;
                c0207ff2.getClass();
                long j5 = c0207ff2.f1709a;
                Object obj33 = list3.get(12);
                u61 u61Var = (p30.m3002l(obj33, bool2) || obj33 == null) ? null : (u61) ((InterfaceC0742sw) ux0.f6329j.f920f).invoke(obj33);
                Object obj34 = list3.get(13);
                v01 v01Var2 = v01.f6368d;
                C0111d c0111d8 = ux0.f6334o;
                if (!p30.m3002l(obj34, bool2) && obj34 != null) {
                    v01Var = (v01) ((InterfaceC0742sw) c0111d8.f920f).invoke(obj34);
                }
                return new j31(j2, j3, c1018zv2, c0940xv, c0977yv, (z51) null, str5, j4, c0992z9, y61Var, fb0Var2, j5, u61Var, v01Var, 49184);
            case 7:
                obj.getClass();
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                C0111d c0111d9 = p30.f4741h;
                if (!p30.m3002l(obj36, Boolean.FALSE) && obj36 != null) {
                    c0066bs = (C0066bs) ((InterfaceC0742sw) c0111d9.f920f).invoke(obj36);
                }
                c0066bs.getClass();
                return new er0(c0066bs.f563a, zBooleanValue);
            case 8:
                obj.getClass();
                return new C0066bs(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                return new ga0(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                j71 j71Var = (p30.m3002l(obj37, Boolean.FALSE) || obj37 == null) ? null : (j71) ((InterfaceC0742sw) p30.f4744k.f920f).invoke(obj37);
                j71Var.getClass();
                int i7 = j71Var.f2768a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                bool4.getClass();
                return new k71(i7, bool4.booleanValue());
            case 11:
                obj.getClass();
                return new j71(((Integer) obj).intValue());
            case 12:
                return new py0(((Integer) obj).intValue());
            case 13:
                return Boolean.valueOf(!false);
            case 14:
                u40[] u40VarArr = d01.f923a;
                ((f01) obj).mo17a(b01.f326e, na1Var);
                return na1Var;
            case j50.f2734e /* 15 */:
                sx0 sx0Var = t21.f5891a;
                return na1Var;
            case 16:
                u40[] u40VarArr2 = d01.f923a;
                e01 e01Var = b01.f333l;
                u40 u40Var = d01.f923a[5];
                ((f01) obj).mo17a(e01Var, Boolean.TRUE);
                return na1Var;
            case 17:
                return na1Var;
            case 18:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 19:
                ((Float) obj).getClass();
                return na1Var;
            case 20:
                ((InterfaceC0298hw) obj).invoke();
                return na1Var;
            case 21:
                return new C0916x7(((Float) obj).floatValue());
            case 22:
                return new C0916x7(((Integer) obj).intValue());
            case 23:
                return Integer.valueOf((int) ((C0916x7) obj).f7277a);
            case 24:
                return new C0916x7(((C0520np) obj).f4301d);
            case 25:
                return new C0520np(((C0916x7) obj).f7277a);
            case 26:
                C0623pp c0623pp = (C0623pp) obj;
                return new C0953y7(Float.intBitsToFloat((int) (c0623pp.f4938a >> 32)), Float.intBitsToFloat((int) (c0623pp.f4938a & 4294967295L)));
            case 27:
                C0953y7 c0953y7 = (C0953y7) obj;
                return new C0623pp((((long) Float.floatToRawIntBits(c0953y7.f7557a)) << 32) | (((long) Float.floatToRawIntBits(c0953y7.f7558b)) & 4294967295L));
            case 28:
                q11 q11Var = (q11) obj;
                return new C0953y7(Float.intBitsToFloat((int) (q11Var.f5022a >> 32)), Float.intBitsToFloat((int) (q11Var.f5022a & 4294967295L)));
            default:
                C0953y7 c0953y72 = (C0953y7) obj;
                return new q11((((long) Float.floatToRawIntBits(c0953y72.f7557a)) << 32) | (((long) Float.floatToRawIntBits(c0953y72.f7558b)) & 4294967295L));
        }
    }
}
