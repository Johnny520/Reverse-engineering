package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5568d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [p30.<clinit>():void, py0.<clinit>():void, s91.<clinit>():void, ux0.<clinit>():void] */
    public /* synthetic */ rx0(int i) {
        this.f5568d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        EnumC0274h8 enumC0274h8;
        Object objM4361a;
        switch (this.f5568d) {
            case 0:
                return Integer.valueOf(((w61) obj2).f7014a);
            case 1:
                return Integer.valueOf(((C0336iz) obj2).f2635a);
            case 2:
                return Integer.valueOf(((C0940xv) obj2).f7426a);
            case 3:
                return Integer.valueOf(((C0977yv) obj2).f7696a);
            case 4:
                u71 u71Var = (u71) obj2;
                return u71Var != null ? u71.m4286a(u71Var.f6159a, u71.f6158c) : false ? Boolean.FALSE : o30.m2769i(Float.valueOf(u71.m4288c(u71Var.f6159a)), ux0.m4361a(new v71(u71.m4287b(u71Var.f6159a)), ux0.f6342w, (vw0) obj));
            case 5:
                ra0 ra0Var = (ra0) obj2;
                return o30.m2769i(ra0Var.f5342a, ux0.m4361a(ra0Var.f5343b, ux0.f6328i, (vw0) obj));
            case 6:
                long j = ((v71) obj2).f6440a;
                if (v71.m4419a(j, 8589934592L)) {
                    return 0;
                }
                if (v71.m4419a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 7:
                ok0 ok0Var = (ok0) obj2;
                return ok0Var != null ? ok0.m2931b(ok0Var.f4590a, 9205357640488583168L) : false ? Boolean.FALSE : o30.m2769i(Float.valueOf(Float.intBitsToFloat((int) (ok0Var.f4590a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (ok0Var.f4590a & 4294967295L))));
            case 8:
                vw0 vw0Var = (vw0) obj;
                C0163e8 c0163e8 = (C0163e8) obj2;
                Object obj3 = c0163e8.f1338a;
                if (obj3 instanceof ap0) {
                    enumC0274h8 = EnumC0274h8.f2166d;
                } else if (obj3 instanceof j31) {
                    enumC0274h8 = EnumC0274h8.f2167e;
                } else if (obj3 instanceof ub1) {
                    enumC0274h8 = EnumC0274h8.f2168f;
                } else if (obj3 instanceof wa1) {
                    enumC0274h8 = EnumC0274h8.f2169g;
                } else if (obj3 instanceof sa0) {
                    enumC0274h8 = EnumC0274h8.f2170h;
                } else if (obj3 instanceof ra0) {
                    enumC0274h8 = EnumC0274h8.f2171i;
                } else {
                    if (!(obj3 instanceof j41)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0274h8 = EnumC0274h8.f2172j;
                }
                switch (enumC0274h8.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objM4361a = ux0.m4361a((ap0) obj3, ux0.f6326g, vw0Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objM4361a = ux0.m4361a((j31) obj3, ux0.f6327h, vw0Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objM4361a = ux0.m4361a((ub1) obj3, ux0.f6322c, vw0Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objM4361a = ux0.m4361a((wa1) obj3, ux0.f6323d, vw0Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objM4361a = ux0.m4361a((sa0) obj3, ux0.f6324e, vw0Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objM4361a = ux0.m4361a((ra0) obj3, ux0.f6325f, vw0Var);
                        break;
                    case 6:
                        obj3.getClass();
                        objM4361a = ((j41) obj3).f2720a;
                        break;
                    default:
                        C0921xc.m5129j();
                        return null;
                }
                return o30.m2769i(enumC0274h8, objM4361a, Integer.valueOf(c0163e8.f1339b), Integer.valueOf(c0163e8.f1340c), c0163e8.f1341d);
            case 9:
                vw0 vw0Var2 = (vw0) obj;
                List list = ((fb0) obj2).f1651d;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(ux0.m4361a((eb0) list.get(i), ux0.f6345z, vw0Var2));
                }
                return arrayList;
            case 10:
                return ((eb0) obj2).f1368a.toLanguageTag();
            case 11:
                vw0 vw0Var3 = (vw0) obj;
                la0 la0Var = (la0) obj2;
                return o30.m2769i(ux0.m4361a(new ia0(la0Var.f3400a), ux0.f6317B, vw0Var3), ux0.m4361a(new ka0(la0Var.f3401b), ux0.f6318C, vw0Var3), ux0.m4361a(new ja0(la0Var.f3402c), ux0.f6319D, vw0Var3));
            case 12:
                return Float.valueOf(((ia0) obj2).f2501a);
            case 13:
                return Integer.valueOf(((ka0) obj2).f3055a);
            case 14:
                return Integer.valueOf(((ja0) obj2).f2778a);
            case j50.f2734e /* 15 */:
                return ((ub1) obj2).f6189a;
            case 16:
                vw0 vw0Var4 = (vw0) obj;
                ap0 ap0Var = (ap0) obj2;
                Object objM4361a2 = ux0.m4361a(new r61(ap0Var.f224a), ux0.f6336q, vw0Var4);
                Object objM4361a3 = ux0.m4361a(new w61(ap0Var.f225b), ux0.f6337r, vw0Var4);
                Object objM4361a4 = ux0.m4361a(new u71(ap0Var.f226c), ux0.f6341v, vw0Var4);
                z61 z61Var = ap0Var.f227d;
                z61 z61Var2 = z61.f7816c;
                Object objM4361a5 = ux0.m4361a(z61Var, ux0.f6331l, vw0Var4);
                Object objM4361a6 = ux0.m4361a(ap0Var.f228e, p30.f4740g, vw0Var4);
                la0 la0Var2 = ap0Var.f229f;
                la0 la0Var3 = la0.f3399d;
                return o30.m2769i(objM4361a2, objM4361a3, objM4361a4, objM4361a5, objM4361a6, ux0.m4361a(la0Var2, ux0.f6316A, vw0Var4), ux0.m4361a(new ga0(ap0Var.f230g), p30.f4742i, vw0Var4), ux0.m4361a(new C0336iz(ap0Var.f231h), ux0.f6338s, vw0Var4), ux0.m4361a(ap0Var.f232i, p30.f4743j, vw0Var4));
            case 17:
                return ((wa1) obj2).f7056a;
            case 18:
                vw0 vw0Var5 = (vw0) obj;
                j31 j31Var = (j31) obj2;
                C0207ff c0207ff = new C0207ff(j31Var.f2670a.mo2626a());
                tx0 tx0Var = ux0.f6335p;
                Object objM4361a7 = ux0.m4361a(c0207ff, tx0Var, vw0Var5);
                u71 u71Var2 = new u71(j31Var.f2671b);
                tx0 tx0Var2 = ux0.f6341v;
                Object objM4361a8 = ux0.m4361a(u71Var2, tx0Var2, vw0Var5);
                C1018zv c1018zv = j31Var.f2672c;
                C1018zv c1018zv2 = C1018zv.f8004e;
                Object objM4361a9 = ux0.m4361a(c1018zv, ux0.f6332m, vw0Var5);
                Object objM4361a10 = ux0.m4361a(j31Var.f2673d, ux0.f6339t, vw0Var5);
                Object objM4361a11 = ux0.m4361a(j31Var.f2674e, ux0.f6340u, vw0Var5);
                String str = j31Var.f2676g;
                Object objM4361a12 = ux0.m4361a(new u71(j31Var.f2677h), tx0Var2, vw0Var5);
                Object objM4361a13 = ux0.m4361a(j31Var.f2678i, ux0.f6333n, vw0Var5);
                Object objM4361a14 = ux0.m4361a(j31Var.f2679j, ux0.f6330k, vw0Var5);
                fb0 fb0Var = j31Var.f2680k;
                fb0 fb0Var2 = fb0.f1650f;
                Object objM4361a15 = ux0.m4361a(fb0Var, ux0.f6344y, vw0Var5);
                Object objM4361a16 = ux0.m4361a(new C0207ff(j31Var.f2681l), tx0Var, vw0Var5);
                Object objM4361a17 = ux0.m4361a(j31Var.f2682m, ux0.f6329j, vw0Var5);
                v01 v01Var = j31Var.f2683n;
                v01 v01Var2 = v01.f6368d;
                return o30.m2769i(objM4361a7, objM4361a8, objM4361a9, objM4361a10, objM4361a11, -1, str, objM4361a12, objM4361a13, objM4361a14, objM4361a15, objM4361a16, objM4361a17, ux0.m4361a(v01Var, ux0.f6334o, vw0Var5));
            case 19:
                vw0 vw0Var6 = (vw0) obj;
                i71 i71Var = (i71) obj2;
                j31 j31Var2 = i71Var.f2472a;
                C0111d c0111d = ux0.f6327h;
                return o30.m2769i(ux0.m4361a(j31Var2, c0111d, vw0Var6), ux0.m4361a(i71Var.f2473b, c0111d, vw0Var6), ux0.m4361a(i71Var.f2474c, c0111d, vw0Var6), ux0.m4361a(i71Var.f2475d, c0111d, vw0Var6));
            case 20:
                er0 er0Var = (er0) obj2;
                Boolean boolValueOf = Boolean.valueOf(er0Var.f1521a);
                C0111d c0111d2 = ux0.f6320a;
                return o30.m2769i(boolValueOf, ux0.m4361a(new C0066bs(er0Var.f1522b), p30.f4741h, (vw0) obj));
            case 21:
                return Integer.valueOf(((C0066bs) obj2).f563a);
            case 22:
                return Integer.valueOf(((ga0) obj2).f1899a);
            case 23:
                k71 k71Var = (k71) obj2;
                return o30.m2769i(ux0.m4361a(new j71(k71Var.f3044a), p30.f4744k, (vw0) obj), Boolean.valueOf(k71Var.f3045b));
            case 24:
                return Integer.valueOf(((j71) obj2).f2768a);
            case 25:
                return Integer.valueOf(((py0) obj2).f4988a.m720g());
            case 26:
                return obj;
            case 27:
                if (obj == null) {
                } else {
                    C0921xc.m5123d();
                }
                return null;
            default:
                return (b81) obj;
        }
    }
}
