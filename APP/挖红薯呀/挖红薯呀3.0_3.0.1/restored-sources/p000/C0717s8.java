package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0717s8 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5672d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c90.<clinit>():void, i4.H(pk, ww, jk):java.lang.Object, i4.p(pk, pk, boolean):pk, km.<clinit>():void, mw0.<init>(iu, pk):void, o30.<clinit>():void, od.b(iu, ik):java.lang.Object, oh.<clinit>():void, pf1.J(nk, pk):pk, ux0.<clinit>():void, v50.a(mh, ji, int):void, yw0.<clinit>():void] */
    public /* synthetic */ C0717s8(int i) {
        this.f5672d = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: oh.e(ji, int):na1 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    @Override // p000.InterfaceC0904ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C0171eg c0171eg;
        switch (this.f5672d) {
            case 0:
                return Integer.valueOf(Math.round((1.0f + (((k50) obj2) == k50.f3015d ? -1.0f : 1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 1:
                String str = (String) obj;
                InterfaceC0515nk interfaceC0515nk = (InterfaceC0515nk) obj2;
                str.getClass();
                interfaceC0515nk.getClass();
                if (str.length() == 0) {
                    return interfaceC0515nk.toString();
                }
                return str + ", " + interfaceC0515nk;
            case 2:
                return C0551oh.m2890B((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 3:
                return C0551oh.m2894F((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 4:
                return C0551oh.m2892D((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 5:
                return C0551oh.m2912z((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 6:
                return C0551oh.m2891C((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 7:
                return C0551oh.m2911y((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 8:
                return C0551oh.m2889A((InterfaceC0356ji) obj, ((Integer) obj2).intValue());
            case 9:
                InterfaceC0618pk interfaceC0618pk = (InterfaceC0618pk) obj;
                InterfaceC0515nk interfaceC0515nk2 = (InterfaceC0515nk) obj2;
                interfaceC0618pk.getClass();
                interfaceC0515nk2.getClass();
                InterfaceC0618pk interfaceC0618pkMo66t = interfaceC0618pk.mo66t(interfaceC0515nk2.getKey());
                C0220fs c0220fs = C0220fs.f1799d;
                if (interfaceC0618pkMo66t == c0220fs) {
                    return interfaceC0515nk2;
                }
                C0496n2 c0496n2 = C0496n2.f4163w;
                AbstractC0692rk abstractC0692rk = (AbstractC0692rk) interfaceC0618pkMo66t.mo64l(c0496n2);
                if (abstractC0692rk == null) {
                    c0171eg = new C0171eg(interfaceC0515nk2, interfaceC0618pkMo66t);
                } else {
                    InterfaceC0618pk interfaceC0618pkMo66t2 = interfaceC0618pkMo66t.mo66t(c0496n2);
                    if (interfaceC0618pkMo66t2 == c0220fs) {
                        return new C0171eg(abstractC0692rk, interfaceC0515nk2);
                    }
                    c0171eg = new C0171eg(abstractC0692rk, new C0171eg(interfaceC0515nk2, interfaceC0618pkMo66t2));
                }
                return c0171eg;
            case 10:
                return ((InterfaceC0618pk) obj).mo63h((InterfaceC0515nk) obj2);
            case 11:
                return ((InterfaceC0618pk) obj).mo63h((InterfaceC0515nk) obj2);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 13:
                C0399km c0399km = (C0399km) obj2;
                return o30.m2783w(Integer.valueOf(c0399km.f3543d.f866b.m720g()), Float.valueOf(w60.m4906m(c0399km.m2037l(), -0.5f, 0.5f)), Integer.valueOf(c0399km.mo1941n()));
            case 14:
                c90 c90Var = (c90) obj2;
                return o30.m2783w(Integer.valueOf(((dp0) c90Var.f743e.f1697b).m720g()), Integer.valueOf(((dp0) c90Var.f743e.f1698c).m720g()));
            case j50.f2734e /* 15 */:
                Map mapMo216c = ((f90) obj2).mo216c();
                if (mapMo216c.isEmpty()) {
                    return null;
                }
                return mapMo216c;
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 17:
                yw0 yw0Var = (yw0) obj2;
                Map map = yw0Var.f7698d;
                jh0 jh0Var = yw0Var.f7699e;
                Object[] objArr = jh0Var.f2879b;
                Object[] objArr2 = jh0Var.f2880c;
                long[] jArr = jh0Var.f2878a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapMo216c2 = ((zw0) objArr2[i4]).mo216c();
                                    if (mapMo216c2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapMo216c2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 18:
                return obj2;
            case 19:
                C0200f8 c0200f8 = (C0200f8) obj2;
                return o30.m2769i(c0200f8.f1625e, ux0.m4361a(c0200f8.f1624d, ux0.f6320a, (vw0) obj));
            case 20:
                return Integer.valueOf(((u61) obj2).f6145a);
            case 21:
                y61 y61Var = (y61) obj2;
                return o30.m2769i(Float.valueOf(y61Var.f7555a), Float.valueOf(y61Var.f7556b));
            case 22:
                vw0 vw0Var = (vw0) obj;
                z61 z61Var = (z61) obj2;
                u71 u71Var = new u71(z61Var.f7817a);
                tx0 tx0Var = ux0.f6341v;
                return o30.m2769i(ux0.m4361a(u71Var, tx0Var, vw0Var), ux0.m4361a(new u71(z61Var.f7818b), tx0Var, vw0Var));
            case 23:
                return Integer.valueOf(((C1018zv) obj2).f8009d);
            case 24:
                sa0 sa0Var = (sa0) obj2;
                return o30.m2769i(sa0Var.f5730a, ux0.m4361a(sa0Var.f5731b, ux0.f6328i, (vw0) obj));
            case 25:
                return Float.valueOf(((C0992z9) obj2).f7838a);
            case 26:
                vw0 vw0Var2 = (vw0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(ux0.m4361a((C0163e8) list.get(i5), ux0.f6321b, vw0Var2));
                }
                return arrayList;
            case 27:
                l71 l71Var = (l71) obj2;
                return o30.m2769i(Integer.valueOf((int) (l71Var.f3382a >> 32)), Integer.valueOf((int) (l71Var.f3382a & 4294967295L)));
            case 28:
                vw0 vw0Var3 = (vw0) obj;
                v01 v01Var = (v01) obj2;
                return o30.m2769i(ux0.m4361a(new C0207ff(v01Var.f6369a), ux0.f6335p, vw0Var3), ux0.m4361a(new ok0(v01Var.f6370b), ux0.f6343x, vw0Var3), Float.valueOf(v01Var.f6371c));
            default:
                return Integer.valueOf(((r61) obj2).f5306a);
        }
    }
}
