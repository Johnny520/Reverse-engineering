package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc2 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12963h;

    public /* synthetic */ xc2(int i) {
        this.f12963h = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        C0652rd c0652rd;
        int i = 0;
        wd0Var = null;
        wd0 wd0Var = null;
        bq2Var = null;
        bq2 bq2Var = null;
        d13Var = null;
        d13 d13Var = null;
        db1Var = null;
        db1 db1Var = null;
        eb1Var = null;
        eb1 eb1Var = null;
        v83Var = null;
        v83 v83Var = null;
        ha3Var = null;
        ha3 ha3Var = null;
        lt2Var = null;
        lt2 lt2Var = null;
        vw1Var = null;
        vw1 vw1Var = null;
        b13Var = null;
        b13 b13Var = null;
        b13Var = null;
        b13 b13Var2 = null;
        switch (this.f12963h) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i2 = C0363ju.f5218h;
                Boolean bool = Boolean.FALSE;
                t11.m5086l(obj2, bool);
                C0363ju c0363ju = obj2 != null ? t11.m5086l(obj2, Boolean.FALSE) ? new C0363ju(C0363ju.f5217g) : new C0363ju(sp0.m4930b(((Integer) obj2).intValue())) : null;
                c0363ju.getClass();
                long j = c0363ju.f5219a;
                Object obj3 = list.get(1);
                ad2 ad2Var = bd2.f815x;
                t11.m5086l(obj3, bool);
                rs1 rs1Var = obj3 != null ? (rs1) ad2Var.f162i.mo5j(obj3) : null;
                rs1Var.getClass();
                long j2 = rs1Var.f9744a;
                Object obj4 = list.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new bq2(j, j2, f.floatValue());
            case 1:
                obj.getClass();
                return new ky2(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                Object obj6 = list2.get(1);
                dq1 dq1Var = bd2.f800i;
                if (!t11.m5086l(obj6, Boolean.FALSE) && obj6 != null) {
                    b13Var2 = (b13) ((in0) dq1Var.f2148j).mo5j(obj6);
                }
                return new eb1(str, b13Var2);
            case 3:
                obj.getClass();
                return new jz2(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new bx0(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i < size) {
                    Object obj7 = list3.get(i);
                    C0652rd c0652rd2 = (t11.m5086l(obj7, Boolean.FALSE) || obj7 == null) ? null : (C0652rd) ((in0) bd2.f793b.f2148j).mo5j(obj7);
                    c0652rd2.getClass();
                    arrayList.add(c0652rd2);
                    i++;
                }
                return arrayList;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                obj.getClass();
                return new gm0(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                return new hm0(((Integer) obj).intValue());
            case 8:
                Boolean bool2 = Boolean.FALSE;
                if (t11.m5086l(obj, bool2)) {
                    return new p13(p13.f7928c);
                }
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                Float f2 = obj8 != null ? (Float) obj8 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj9 = list4.get(1);
                ad2 ad2Var2 = bd2.f814w;
                t11.m5086l(obj9, bool2);
                q13 q13Var = obj9 != null ? (q13) ad2Var2.f162i.mo5j(obj9) : null;
                q13Var.getClass();
                return new p13(rg3.m4455I(fFloatValue, q13Var.f8703a));
            case 9:
                return t11.m5086l(obj, 0) ? new q13(8589934592L) : t11.m5086l(obj, 1) ? new q13(4294967296L) : new q13(0L);
            case 10:
                if (t11.m5086l(obj, Boolean.FALSE)) {
                    return new rs1(9205357640488583168L);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f3 = obj10 != null ? (Float) obj10 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj11 = list5.get(1);
                Float f4 = obj11 != null ? (Float) obj11 : null;
                f4.getClass();
                return new rs1((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list6.size());
                int size2 = list6.size();
                while (i < size2) {
                    Object obj12 = list6.get(i);
                    jc1 jc1Var = (t11.m5086l(obj12, Boolean.FALSE) || obj12 == null) ? null : (jc1) ((in0) bd2.f817z.f2148j).mo5j(obj12);
                    jc1Var.getClass();
                    arrayList2.add(jc1Var);
                    i++;
                }
                return new kc1(arrayList2);
            case 12:
                obj.getClass();
                String str2 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (t11.m5086l(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new jc1(localeForLanguageTag);
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                String str3 = obj13 != null ? (String) obj13 : null;
                str3.getClass();
                Object obj14 = list7.get(1);
                dq1 dq1Var2 = bd2.f800i;
                if (!t11.m5086l(obj14, Boolean.FALSE) && obj14 != null) {
                    b13Var = (b13) ((in0) dq1Var2.f2148j).mo5j(obj14);
                }
                return new db1(str3, b13Var);
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                float f5 = va1.f11864b;
                ad2 ad2Var3 = bd2.f789B;
                Boolean bool3 = Boolean.FALSE;
                t11.m5086l(obj15, bool3);
                va1 va1Var = obj15 != null ? (va1) ad2Var3.f162i.mo5j(obj15) : null;
                va1Var.getClass();
                float f6 = va1Var.f11867a;
                Object obj16 = list8.get(1);
                ad2 ad2Var4 = bd2.f790C;
                t11.m5086l(obj16, bool3);
                xa1 xa1Var = obj16 != null ? (xa1) ad2Var4.f162i.mo5j(obj16) : null;
                xa1Var.getClass();
                int i3 = xa1Var.f12929a;
                Object obj17 = list8.get(2);
                ad2 ad2Var5 = bd2.f791D;
                t11.m5086l(obj17, bool3);
                wa1 wa1Var = obj17 != null ? (wa1) ad2Var5.f162i.mo5j(obj17) : null;
                wa1Var.getClass();
                return new ya1(f6, i3, wa1Var.f12443a);
            case 15:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                va1.m5660a(fFloatValue3);
                return new va1(fFloatValue3);
            case 16:
                obj.getClass();
                return new xa1(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj18 = list9.get(0);
                EnumC0919yd enumC0919yd = obj18 != null ? (EnumC0919yd) obj18 : null;
                enumC0919yd.getClass();
                Object obj19 = list9.get(2);
                Integer num = obj19 != null ? (Integer) obj19 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj20 = list9.get(3);
                Integer num2 = obj20 != null ? (Integer) obj20 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj21 = list9.get(4);
                String str4 = obj21 != null ? (String) obj21 : null;
                str4.getClass();
                switch (enumC0919yd.ordinal()) {
                    case 0:
                        Object obj22 = list9.get(1);
                        dq1 dq1Var3 = bd2.f798g;
                        if (!t11.m5086l(obj22, Boolean.FALSE) && obj22 != null) {
                            vw1Var = (vw1) ((in0) dq1Var3.f2148j).mo5j(obj22);
                        }
                        vw1Var.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, vw1Var, str4);
                        break;
                    case 1:
                        Object obj23 = list9.get(1);
                        dq1 dq1Var4 = bd2.f799h;
                        if (!t11.m5086l(obj23, Boolean.FALSE) && obj23 != null) {
                            lt2Var = (lt2) ((in0) dq1Var4.f2148j).mo5j(obj23);
                        }
                        lt2Var.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, lt2Var, str4);
                        break;
                    case 2:
                        Object obj24 = list9.get(1);
                        dq1 dq1Var5 = bd2.f794c;
                        if (!t11.m5086l(obj24, Boolean.FALSE) && obj24 != null) {
                            ha3Var = (ha3) ((in0) dq1Var5.f2148j).mo5j(obj24);
                        }
                        ha3Var.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, ha3Var, str4);
                        break;
                    case 3:
                        Object obj25 = list9.get(1);
                        dq1 dq1Var6 = bd2.f795d;
                        if (!t11.m5086l(obj25, Boolean.FALSE) && obj25 != null) {
                            v83Var = (v83) ((in0) dq1Var6.f2148j).mo5j(obj25);
                        }
                        v83Var.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, v83Var, str4);
                        break;
                    case 4:
                        Object obj26 = list9.get(1);
                        dq1 dq1Var7 = bd2.f796e;
                        if (!t11.m5086l(obj26, Boolean.FALSE) && obj26 != null) {
                            eb1Var = (eb1) ((in0) dq1Var7.f2148j).mo5j(obj26);
                        }
                        eb1Var.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, eb1Var, str4);
                        break;
                    case 5:
                        Object obj27 = list9.get(1);
                        dq1 dq1Var8 = bd2.f797f;
                        if (!t11.m5086l(obj27, Boolean.FALSE) && obj27 != null) {
                            db1Var = (db1) ((in0) dq1Var8.f2148j).mo5j(obj27);
                        }
                        db1Var.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, db1Var, str4);
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        Object obj28 = list9.get(1);
                        String str5 = obj28 != null ? (String) obj28 : null;
                        str5.getClass();
                        c0652rd = new C0652rd(iIntValue, iIntValue2, new hv2(str5), str4);
                        break;
                    default:
                        c80.m675s();
                        return null;
                }
                return c0652rd;
            case 18:
                obj.getClass();
                return new wa1(((Integer) obj).intValue());
            case 19:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new ha3(str6);
            case AIChatConfig.MaxContextRounds /* 20 */:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new v83(str7);
            case 21:
                obj.getClass();
                List list10 = (List) obj;
                Object obj29 = list10.get(0);
                ad2 ad2Var6 = bd2.f808q;
                Boolean bool4 = Boolean.FALSE;
                t11.m5086l(obj29, bool4);
                ky2 ky2Var = obj29 != null ? (ky2) ad2Var6.f162i.mo5j(obj29) : null;
                ky2Var.getClass();
                int i4 = ky2Var.f5851a;
                Object obj30 = list10.get(1);
                ad2 ad2Var7 = bd2.f809r;
                t11.m5086l(obj30, bool4);
                jz2 jz2Var = obj30 != null ? (jz2) ad2Var7.f162i.mo5j(obj30) : null;
                jz2Var.getClass();
                int i5 = jz2Var.f5289a;
                Object obj31 = list10.get(2);
                q13[] q13VarArr = p13.f7927b;
                ad2 ad2Var8 = bd2.f813v;
                t11.m5086l(obj31, bool4);
                p13 p13Var = obj31 != null ? (p13) ad2Var8.f162i.mo5j(obj31) : null;
                p13Var.getClass();
                long j3 = p13Var.f7929a;
                Object obj32 = list10.get(3);
                n03 n03Var = n03.f6960c;
                n03 n03Var2 = (t11.m5086l(obj32, bool4) || obj32 == null) ? null : (n03) ((in0) bd2.f803l.f2148j).mo5j(obj32);
                Object obj33 = list10.get(4);
                k02 k02Var = (t11.m5086l(obj33, bool4) || obj33 == null) ? null : (k02) ((in0) t11.f10483e.f2148j).mo5j(obj33);
                Object obj34 = list10.get(5);
                ya1 ya1Var = ya1.f13380d;
                ya1 ya1Var2 = (t11.m5086l(obj34, bool4) || obj34 == null) ? null : (ya1) ((in0) bd2.f788A.f2148j).mo5j(obj34);
                Object obj35 = list10.get(6);
                ta1 ta1Var = (t11.m5086l(obj35, bool4) || obj35 == null) ? null : (ta1) ((in0) t11.f10485g.f2148j).mo5j(obj35);
                ta1Var.getClass();
                int i6 = ta1Var.f10656a;
                Object obj36 = list10.get(7);
                ad2 ad2Var9 = bd2.f810s;
                t11.m5086l(obj36, bool4);
                bx0 bx0Var = obj36 != null ? (bx0) ad2Var9.f162i.mo5j(obj36) : null;
                bx0Var.getClass();
                int i7 = bx0Var.f1063a;
                Object obj37 = list10.get(8);
                dq1 dq1Var9 = t11.f10486h;
                if (!t11.m5086l(obj37, bool4) && obj37 != null) {
                    d13Var = (d13) ((in0) dq1Var9.f2148j).mo5j(obj37);
                }
                return new vw1(i4, i5, j3, n03Var2, k02Var, ya1Var2, i6, i7, d13Var);
            case 22:
                obj.getClass();
                List list11 = (List) obj;
                Object obj38 = list11.get(0);
                int i8 = C0363ju.f5218h;
                Boolean bool5 = Boolean.FALSE;
                t11.m5086l(obj38, bool5);
                C0363ju c0363ju2 = obj38 != null ? obj38.equals(bool5) ? new C0363ju(C0363ju.f5217g) : new C0363ju(sp0.m4930b(((Integer) obj38).intValue())) : null;
                c0363ju2.getClass();
                long j4 = c0363ju2.f5219a;
                Object obj39 = list11.get(1);
                q13[] q13VarArr2 = p13.f7927b;
                in0 in0Var = bd2.f813v.f162i;
                t11.m5086l(obj39, bool5);
                p13 p13Var2 = obj39 != null ? (p13) in0Var.mo5j(obj39) : null;
                p13Var2.getClass();
                long j5 = p13Var2.f7929a;
                Object obj40 = list11.get(2);
                im0 im0Var = im0.f4679i;
                im0 im0Var2 = (t11.m5086l(obj40, bool5) || obj40 == null) ? null : (im0) ((in0) bd2.f804m.f2148j).mo5j(obj40);
                Object obj41 = list11.get(3);
                gm0 gm0Var = (t11.m5086l(obj41, bool5) || obj41 == null) ? null : (gm0) ((in0) bd2.f811t.f2148j).mo5j(obj41);
                Object obj42 = list11.get(4);
                hm0 hm0Var = (t11.m5086l(obj42, bool5) || obj42 == null) ? null : (hm0) ((in0) bd2.f812u.f2148j).mo5j(obj42);
                Object obj43 = list11.get(6);
                String str8 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list11.get(7);
                t11.m5086l(obj44, bool5);
                p13 p13Var3 = obj44 != null ? (p13) in0Var.mo5j(obj44) : null;
                p13Var3.getClass();
                long j6 = p13Var3.f7929a;
                Object obj45 = list11.get(8);
                C0888xj c0888xj = (t11.m5086l(obj45, bool5) || obj45 == null) ? null : (C0888xj) ((in0) bd2.f805n.f2148j).mo5j(obj45);
                Object obj46 = list11.get(9);
                m03 m03Var = (t11.m5086l(obj46, bool5) || obj46 == null) ? null : (m03) ((in0) bd2.f802k.f2148j).mo5j(obj46);
                Object obj47 = list11.get(10);
                kc1 kc1Var = kc1.f5453j;
                kc1 kc1Var2 = (t11.m5086l(obj47, bool5) || obj47 == null) ? null : (kc1) ((in0) bd2.f816y.f2148j).mo5j(obj47);
                Object obj48 = list11.get(11);
                t11.m5086l(obj48, bool5);
                C0363ju c0363ju3 = obj48 != null ? obj48.equals(bool5) ? new C0363ju(C0363ju.f5217g) : new C0363ju(sp0.m4930b(((Integer) obj48).intValue())) : null;
                c0363ju3.getClass();
                long j7 = c0363ju3.f5219a;
                Object obj49 = list11.get(12);
                gz2 gz2Var = (t11.m5086l(obj49, bool5) || obj49 == null) ? null : (gz2) ((in0) bd2.f801j.f2148j).mo5j(obj49);
                Object obj50 = list11.get(13);
                bq2 bq2Var2 = bq2.f985d;
                dq1 dq1Var10 = bd2.f806o;
                if (!t11.m5086l(obj50, bool5) && obj50 != null) {
                    bq2Var = (bq2) ((in0) dq1Var10.f2148j).mo5j(obj50);
                }
                return new lt2(j4, j5, im0Var2, gm0Var, hm0Var, (mx2) null, str8, j6, c0888xj, m03Var, kc1Var2, j7, gz2Var, bq2Var, 49184);
            case 23:
                obj.getClass();
                List list12 = (List) obj;
                Object obj51 = list12.get(0);
                Boolean bool6 = obj51 != null ? (Boolean) obj51 : null;
                bool6.getClass();
                boolean zBooleanValue = bool6.booleanValue();
                Object obj52 = list12.get(1);
                dq1 dq1Var11 = t11.f10484f;
                if (!t11.m5086l(obj52, Boolean.FALSE) && obj52 != null) {
                    wd0Var = (wd0) ((in0) dq1Var11.f2148j).mo5j(obj52);
                }
                wd0Var.getClass();
                return new k02(wd0Var.f12465a, zBooleanValue);
            case 24:
                obj.getClass();
                return new wd0(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new ta1(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                c13 c13Var = (t11.m5086l(obj53, Boolean.FALSE) || obj53 == null) ? null : (c13) ((in0) t11.f10487i.f2148j).mo5j(obj53);
                c13Var.getClass();
                int i9 = c13Var.f1106a;
                Object obj54 = list13.get(1);
                Boolean bool7 = obj54 != null ? (Boolean) obj54 : null;
                bool7.getClass();
                return new d13(i9, bool7.booleanValue());
            case 27:
                obj.getClass();
                return new c13(((Integer) obj).intValue());
            case 28:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + "=" + af2.f186a.m149c(entry.getValue());
            default:
                j31 j31Var = (j31) obj;
                j31Var.getClass();
                i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var != null) {
                    gz0 gz0Var = l31.f5905a;
                    String strMo2263a = i41Var instanceof z31 ? null : i41Var.mo2263a();
                    if (strMo2263a != null) {
                        return strMo2263a;
                    }
                }
                return j31Var.toString();
        }
    }
}
