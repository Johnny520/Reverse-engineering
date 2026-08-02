package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc2 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13407h;

    public /* synthetic */ yc2(int i) {
        this.f13407h = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        EnumC0919yd enumC0919yd;
        Object objM513a;
        switch (this.f13407h) {
            case 0:
                return Integer.valueOf(((bx0) obj2).f1063a);
            case 1:
                return Integer.valueOf(((gm0) obj2).f3581a);
            case 2:
                return Integer.valueOf(((hm0) obj2).f4076a);
            case 3:
                p13 p13Var = (p13) obj2;
                return p13Var != null ? p13.m3673a(p13Var.f7929a, p13.f7928c) : false ? Boolean.FALSE : AbstractC0179eu.m1473w(Float.valueOf(p13.m3675c(p13Var.f7929a)), bd2.m513a(new q13(p13.m3674b(p13Var.f7929a)), bd2.f814w, (bc2) obj));
            case 4:
                db1 db1Var = (db1) obj2;
                return AbstractC0179eu.m1473w(db1Var.f1954a, bd2.m513a(db1Var.f1955b, bd2.f800i, (bc2) obj));
            case 5:
                long j = ((q13) obj2).f8703a;
                if (q13.m4041a(j, 8589934592L)) {
                    return 0;
                }
                if (q13.m4041a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                rs1 rs1Var = (rs1) obj2;
                return rs1Var != null ? rs1.m4609b(rs1Var.f9744a, 9205357640488583168L) : false ? Boolean.FALSE : AbstractC0179eu.m1473w(Float.valueOf(Float.intBitsToFloat((int) (rs1Var.f9744a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (rs1Var.f9744a & 4294967295L))));
            case 7:
                bc2 bc2Var = (bc2) obj;
                C0652rd c0652rd = (C0652rd) obj2;
                Object obj3 = c0652rd.f9514a;
                if (obj3 instanceof vw1) {
                    enumC0919yd = EnumC0919yd.f13413h;
                } else if (obj3 instanceof lt2) {
                    enumC0919yd = EnumC0919yd.f13414i;
                } else if (obj3 instanceof ha3) {
                    enumC0919yd = EnumC0919yd.f13415j;
                } else if (obj3 instanceof v83) {
                    enumC0919yd = EnumC0919yd.f13416k;
                } else if (obj3 instanceof eb1) {
                    enumC0919yd = EnumC0919yd.f13417l;
                } else if (obj3 instanceof db1) {
                    enumC0919yd = EnumC0919yd.f13418m;
                } else {
                    if (!(obj3 instanceof hv2)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0919yd = EnumC0919yd.f13419n;
                }
                switch (enumC0919yd.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objM513a = bd2.m513a((vw1) obj3, bd2.f798g, bc2Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objM513a = bd2.m513a((lt2) obj3, bd2.f799h, bc2Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objM513a = bd2.m513a((ha3) obj3, bd2.f794c, bc2Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objM513a = bd2.m513a((v83) obj3, bd2.f795d, bc2Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objM513a = bd2.m513a((eb1) obj3, bd2.f796e, bc2Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objM513a = bd2.m513a((db1) obj3, bd2.f797f, bc2Var);
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        obj3.getClass();
                        objM513a = ((hv2) obj3).f4144a;
                        break;
                    default:
                        c80.m675s();
                        return null;
                }
                return AbstractC0179eu.m1473w(enumC0919yd, objM513a, Integer.valueOf(c0652rd.f9515b), Integer.valueOf(c0652rd.f9516c), c0652rd.f9517d);
            case 8:
                bc2 bc2Var2 = (bc2) obj;
                List list = ((kc1) obj2).f5454h;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(bd2.m513a((jc1) list.get(i), bd2.f817z, bc2Var2));
                }
                return arrayList;
            case 9:
                return ((jc1) obj2).f4962a.toLanguageTag();
            case 10:
                bc2 bc2Var3 = (bc2) obj;
                ya1 ya1Var = (ya1) obj2;
                return AbstractC0179eu.m1473w(bd2.m513a(new va1(ya1Var.f13381a), bd2.f789B, bc2Var3), bd2.m513a(new xa1(ya1Var.f13382b), bd2.f790C, bc2Var3), bd2.m513a(new wa1(ya1Var.f13383c), bd2.f791D, bc2Var3));
            case 11:
                return Float.valueOf(((va1) obj2).f11867a);
            case 12:
                return Integer.valueOf(((xa1) obj2).f12929a);
            case 13:
                return Integer.valueOf(((wa1) obj2).f12443a);
            case 14:
                return ((ha3) obj2).f3935a;
            case 15:
                bc2 bc2Var4 = (bc2) obj;
                vw1 vw1Var = (vw1) obj2;
                Object objM513a2 = bd2.m513a(new ky2(vw1Var.f12198a), bd2.f808q, bc2Var4);
                Object objM513a3 = bd2.m513a(new jz2(vw1Var.f12199b), bd2.f809r, bc2Var4);
                Object objM513a4 = bd2.m513a(new p13(vw1Var.f12200c), bd2.f813v, bc2Var4);
                n03 n03Var = vw1Var.f12201d;
                n03 n03Var2 = n03.f6960c;
                Object objM513a5 = bd2.m513a(n03Var, bd2.f803l, bc2Var4);
                Object objM513a6 = bd2.m513a(vw1Var.f12202e, t11.f10483e, bc2Var4);
                ya1 ya1Var2 = vw1Var.f12203f;
                ya1 ya1Var3 = ya1.f13380d;
                return AbstractC0179eu.m1473w(objM513a2, objM513a3, objM513a4, objM513a5, objM513a6, bd2.m513a(ya1Var2, bd2.f788A, bc2Var4), bd2.m513a(new ta1(vw1Var.f12204g), t11.f10485g, bc2Var4), bd2.m513a(new bx0(vw1Var.f12205h), bd2.f810s, bc2Var4), bd2.m513a(vw1Var.f12206i, t11.f10486h, bc2Var4));
            case 16:
                return ((v83) obj2).f11844a;
            case 17:
                bc2 bc2Var5 = (bc2) obj;
                lt2 lt2Var = (lt2) obj2;
                C0363ju c0363ju = new C0363ju(lt2Var.f6301a.mo864b());
                ad2 ad2Var = bd2.f807p;
                Object objM513a7 = bd2.m513a(c0363ju, ad2Var, bc2Var5);
                p13 p13Var2 = new p13(lt2Var.f6302b);
                ad2 ad2Var2 = bd2.f813v;
                Object objM513a8 = bd2.m513a(p13Var2, ad2Var2, bc2Var5);
                im0 im0Var = lt2Var.f6303c;
                im0 im0Var2 = im0.f4679i;
                Object objM513a9 = bd2.m513a(im0Var, bd2.f804m, bc2Var5);
                Object objM513a10 = bd2.m513a(lt2Var.f6304d, bd2.f811t, bc2Var5);
                Object objM513a11 = bd2.m513a(lt2Var.f6305e, bd2.f812u, bc2Var5);
                String str = lt2Var.f6307g;
                Object objM513a12 = bd2.m513a(new p13(lt2Var.f6308h), ad2Var2, bc2Var5);
                Object objM513a13 = bd2.m513a(lt2Var.f6309i, bd2.f805n, bc2Var5);
                Object objM513a14 = bd2.m513a(lt2Var.f6310j, bd2.f802k, bc2Var5);
                kc1 kc1Var = lt2Var.f6311k;
                kc1 kc1Var2 = kc1.f5453j;
                Object objM513a15 = bd2.m513a(kc1Var, bd2.f816y, bc2Var5);
                Object objM513a16 = bd2.m513a(new C0363ju(lt2Var.f6312l), ad2Var, bc2Var5);
                Object objM513a17 = bd2.m513a(lt2Var.f6313m, bd2.f801j, bc2Var5);
                bq2 bq2Var = lt2Var.f6314n;
                bq2 bq2Var2 = bq2.f985d;
                return AbstractC0179eu.m1473w(objM513a7, objM513a8, objM513a9, objM513a10, objM513a11, -1, str, objM513a12, objM513a13, objM513a14, objM513a15, objM513a16, objM513a17, bd2.m513a(bq2Var, bd2.f806o, bc2Var5));
            case 18:
                bc2 bc2Var6 = (bc2) obj;
                b13 b13Var = (b13) obj2;
                lt2 lt2Var2 = b13Var.f524a;
                dq1 dq1Var = bd2.f799h;
                return AbstractC0179eu.m1473w(bd2.m513a(lt2Var2, dq1Var, bc2Var6), bd2.m513a(b13Var.f525b, dq1Var, bc2Var6), bd2.m513a(b13Var.f526c, dq1Var, bc2Var6), bd2.m513a(b13Var.f527d, dq1Var, bc2Var6));
            case 19:
                k02 k02Var = (k02) obj2;
                Boolean boolValueOf = Boolean.valueOf(k02Var.f5294a);
                dq1 dq1Var2 = bd2.f792a;
                return AbstractC0179eu.m1473w(boolValueOf, bd2.m513a(new wd0(k02Var.f5295b), t11.f10484f, (bc2) obj));
            case AIChatConfig.MaxContextRounds /* 20 */:
                return Integer.valueOf(((wd0) obj2).f12465a);
            case 21:
                return Integer.valueOf(((ta1) obj2).f10656a);
            case 22:
                d13 d13Var = (d13) obj2;
                return AbstractC0179eu.m1473w(bd2.m513a(new c13(d13Var.f1814a), t11.f10487i, (bc2) obj), Boolean.valueOf(d13Var.f1815b));
            case 23:
                return Integer.valueOf(((c13) obj2).f1106a);
            case 24:
                return Integer.valueOf(((nl2) obj2).f7216a.m2759g());
            case 25:
                tz2 tz2Var = (tz2) obj2;
                return AbstractC0179eu.m1435P(Float.valueOf(tz2Var.f11013a.m2591g()), Boolean.valueOf(((qv1) tz2Var.f11018f.getValue()) == qv1.f9205h));
            case 26:
                y10 y10Var = (y10) obj2;
                if (!(y10Var instanceof a33)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? y10Var : Integer.valueOf(iIntValue + 1);
            case 27:
                y10 y10Var2 = (y10) obj2;
                if (y10Var2 instanceof a33) {
                    return (a33) y10Var2;
                }
                return null;
            default:
                d23 d23Var = (d23) obj;
                y10 y10Var3 = (y10) obj2;
                if (y10Var3 instanceof a33) {
                    a20 a20Var = d23Var.f1842a;
                    Trace.beginSection(null);
                    Object[] objArr = d23Var.f1843b;
                    int i2 = d23Var.f1845d;
                    objArr[i2] = a83.f116a;
                    a33[] a33VarArr = d23Var.f1844c;
                    d23Var.f1845d = i2 + 1;
                    a33VarArr[i2] = (a33) y10Var3;
                }
                return d23Var;
        }
    }
}
