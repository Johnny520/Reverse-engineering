package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc2 implements mn0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bd2.<clinit>():void, fg1.<clinit>():void, nl2.<clinit>():void, t11.<clinit>():void, tz2.<clinit>():void] */
    public /* synthetic */ yc2(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        yd ydVar;
        Object objA;
        switch (this.h) {
            case 0:
                return Integer.valueOf(((bx0) obj2).a);
            case 1:
                return Integer.valueOf(((gm0) obj2).a);
            case 2:
                return Integer.valueOf(((hm0) obj2).a);
            case 3:
                p13 p13Var = (p13) obj2;
                return p13Var != null ? p13.a(p13Var.a, p13.c) : false ? Boolean.FALSE : eu.w(Float.valueOf(p13.c(p13Var.a)), bd2.a(new q13(p13.b(p13Var.a)), bd2.w, (bc2) obj));
            case 4:
                db1 db1Var = (db1) obj2;
                return eu.w(db1Var.a, bd2.a(db1Var.b, bd2.i, (bc2) obj));
            case 5:
                long j = ((q13) obj2).a;
                if (q13.a(j, 8589934592L)) {
                    return 0;
                }
                if (q13.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                rs1 rs1Var = (rs1) obj2;
                return rs1Var != null ? rs1.b(rs1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : eu.w(Float.valueOf(Float.intBitsToFloat((int) (rs1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (rs1Var.a & 4294967295L))));
            case 7:
                bc2 bc2Var = (bc2) obj;
                rd rdVar = (rd) obj2;
                Object obj3 = rdVar.a;
                if (obj3 instanceof vw1) {
                    ydVar = yd.h;
                } else if (obj3 instanceof lt2) {
                    ydVar = yd.i;
                } else if (obj3 instanceof ha3) {
                    ydVar = yd.j;
                } else if (obj3 instanceof v83) {
                    ydVar = yd.k;
                } else if (obj3 instanceof eb1) {
                    ydVar = yd.l;
                } else if (obj3 instanceof db1) {
                    ydVar = yd.m;
                } else {
                    if (!(obj3 instanceof hv2)) {
                        throw new UnsupportedOperationException();
                    }
                    ydVar = yd.n;
                }
                switch (ydVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = bd2.a((vw1) obj3, bd2.g, bc2Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = bd2.a((lt2) obj3, bd2.h, bc2Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = bd2.a((ha3) obj3, bd2.c, bc2Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = bd2.a((v83) obj3, bd2.d, bc2Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = bd2.a((eb1) obj3, bd2.e, bc2Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = bd2.a((db1) obj3, bd2.f, bc2Var);
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        obj3.getClass();
                        objA = ((hv2) obj3).a;
                        break;
                    default:
                        c80.s();
                        return null;
                }
                return eu.w(ydVar, objA, Integer.valueOf(rdVar.b), Integer.valueOf(rdVar.c), rdVar.d);
            case 8:
                bc2 bc2Var2 = (bc2) obj;
                List list = ((kc1) obj2).h;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(bd2.a((jc1) list.get(i), bd2.z, bc2Var2));
                }
                return arrayList;
            case 9:
                return ((jc1) obj2).a.toLanguageTag();
            case 10:
                bc2 bc2Var3 = (bc2) obj;
                ya1 ya1Var = (ya1) obj2;
                return eu.w(bd2.a(new va1(ya1Var.a), bd2.B, bc2Var3), bd2.a(new xa1(ya1Var.b), bd2.C, bc2Var3), bd2.a(new wa1(ya1Var.c), bd2.D, bc2Var3));
            case 11:
                return Float.valueOf(((va1) obj2).a);
            case 12:
                return Integer.valueOf(((xa1) obj2).a);
            case 13:
                return Integer.valueOf(((wa1) obj2).a);
            case 14:
                return ((ha3) obj2).a;
            case 15:
                bc2 bc2Var4 = (bc2) obj;
                vw1 vw1Var = (vw1) obj2;
                Object objA2 = bd2.a(new ky2(vw1Var.a), bd2.q, bc2Var4);
                Object objA3 = bd2.a(new jz2(vw1Var.b), bd2.r, bc2Var4);
                Object objA4 = bd2.a(new p13(vw1Var.c), bd2.v, bc2Var4);
                n03 n03Var = vw1Var.d;
                n03 n03Var2 = n03.c;
                Object objA5 = bd2.a(n03Var, bd2.l, bc2Var4);
                Object objA6 = bd2.a(vw1Var.e, t11.e, bc2Var4);
                ya1 ya1Var2 = vw1Var.f;
                ya1 ya1Var3 = ya1.d;
                return eu.w(objA2, objA3, objA4, objA5, objA6, bd2.a(ya1Var2, bd2.A, bc2Var4), bd2.a(new ta1(vw1Var.g), t11.g, bc2Var4), bd2.a(new bx0(vw1Var.h), bd2.s, bc2Var4), bd2.a(vw1Var.i, t11.h, bc2Var4));
            case 16:
                return ((v83) obj2).a;
            case 17:
                bc2 bc2Var5 = (bc2) obj;
                lt2 lt2Var = (lt2) obj2;
                ju juVar = new ju(lt2Var.a.b());
                ad2 ad2Var = bd2.p;
                Object objA7 = bd2.a(juVar, ad2Var, bc2Var5);
                p13 p13Var2 = new p13(lt2Var.b);
                ad2 ad2Var2 = bd2.v;
                Object objA8 = bd2.a(p13Var2, ad2Var2, bc2Var5);
                im0 im0Var = lt2Var.c;
                im0 im0Var2 = im0.i;
                Object objA9 = bd2.a(im0Var, bd2.m, bc2Var5);
                Object objA10 = bd2.a(lt2Var.d, bd2.t, bc2Var5);
                Object objA11 = bd2.a(lt2Var.e, bd2.u, bc2Var5);
                String str = lt2Var.g;
                Object objA12 = bd2.a(new p13(lt2Var.h), ad2Var2, bc2Var5);
                Object objA13 = bd2.a(lt2Var.i, bd2.n, bc2Var5);
                Object objA14 = bd2.a(lt2Var.j, bd2.k, bc2Var5);
                kc1 kc1Var = lt2Var.k;
                kc1 kc1Var2 = kc1.j;
                Object objA15 = bd2.a(kc1Var, bd2.y, bc2Var5);
                Object objA16 = bd2.a(new ju(lt2Var.l), ad2Var, bc2Var5);
                Object objA17 = bd2.a(lt2Var.m, bd2.j, bc2Var5);
                bq2 bq2Var = lt2Var.n;
                bq2 bq2Var2 = bq2.d;
                return eu.w(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, bd2.a(bq2Var, bd2.o, bc2Var5));
            case 18:
                bc2 bc2Var6 = (bc2) obj;
                b13 b13Var = (b13) obj2;
                lt2 lt2Var2 = b13Var.a;
                dq1 dq1Var = bd2.h;
                return eu.w(bd2.a(lt2Var2, dq1Var, bc2Var6), bd2.a(b13Var.b, dq1Var, bc2Var6), bd2.a(b13Var.c, dq1Var, bc2Var6), bd2.a(b13Var.d, dq1Var, bc2Var6));
            case 19:
                k02 k02Var = (k02) obj2;
                Boolean boolValueOf = Boolean.valueOf(k02Var.a);
                dq1 dq1Var2 = bd2.a;
                return eu.w(boolValueOf, bd2.a(new wd0(k02Var.b), t11.f, (bc2) obj));
            case AIChatConfig.MaxContextRounds /* 20 */:
                return Integer.valueOf(((wd0) obj2).a);
            case 21:
                return Integer.valueOf(((ta1) obj2).a);
            case 22:
                d13 d13Var = (d13) obj2;
                return eu.w(bd2.a(new c13(d13Var.a), t11.i, (bc2) obj), Boolean.valueOf(d13Var.b));
            case 23:
                return Integer.valueOf(((c13) obj2).a);
            case 24:
                return Integer.valueOf(((nl2) obj2).a.g());
            case 25:
                tz2 tz2Var = (tz2) obj2;
                return eu.P(Float.valueOf(tz2Var.a.g()), Boolean.valueOf(((qv1) tz2Var.f.getValue()) == qv1.h));
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
                    a20 a20Var = d23Var.a;
                    Trace.beginSection(null);
                    Object[] objArr = d23Var.b;
                    int i2 = d23Var.d;
                    objArr[i2] = a83.a;
                    a33[] a33VarArr = d23Var.c;
                    d23Var.d = i2 + 1;
                    a33VarArr[i2] = (a33) y10Var3;
                }
                return d23Var;
        }
    }
}
