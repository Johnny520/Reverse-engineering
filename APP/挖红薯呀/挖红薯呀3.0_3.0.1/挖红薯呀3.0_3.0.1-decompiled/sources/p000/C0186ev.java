package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: ev */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0186ev implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final C0186ev f1529b = new C0186ev(0);

    /* JADX INFO: renamed from: c */
    public static final C0186ev f1530c = new C0186ev(1);

    /* JADX INFO: renamed from: d */
    public static final C0186ev f1531d = new C0186ev(2);

    /* JADX INFO: renamed from: e */
    public static final C0186ev f1532e = new C0186ev(3);

    /* JADX INFO: renamed from: f */
    public static final C0186ev f1533f = new C0186ev(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1534a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ev.<clinit>():void, f8.<init>(java.util.List, java.lang.String):void, r9.<init>(f8, s71, java.util.List, ym, jv):void, rd0.<clinit>():void] */
    public /* synthetic */ C0186ev(int i) {
        this.f1534a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1534a) {
            case 0:
                C0149dv c0149dv = (C0149dv) obj;
                C0149dv c0149dv2 = (C0149dv) obj2;
                if (!AbstractC0307i4.m1544t(c0149dv) || !AbstractC0307i4.m1544t(c0149dv2)) {
                    if (AbstractC0307i4.m1544t(c0149dv)) {
                        return -1;
                    }
                    return AbstractC0307i4.m1544t(c0149dv2) ? 1 : 0;
                }
                b60 b60VarM3039Q = pf1.m3039Q(c0149dv);
                b60 b60VarM3039Q2 = pf1.m3039Q(c0149dv2);
                if (p30.m3002l(b60VarM3039Q, b60VarM3039Q2)) {
                    return 0;
                }
                Object[] objArr = new b60[16];
                int i = 0;
                while (b60VarM3039Q != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = b60VarM3039Q;
                    i++;
                    b60VarM3039Q = b60VarM3039Q.m315v();
                }
                Object[] objArr3 = new b60[16];
                int i3 = 0;
                while (b60VarM3039Q2 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = b60VarM3039Q2;
                    i3++;
                    b60VarM3039Q2 = b60VarM3039Q2.m315v();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (p30.m3002l(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return p30.m3008r(((b60) objArr[i5]).m316w(), ((b60) objArr3[i5]).m316w());
                }
                C0921xc.m5134o("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                st0 st0VarM5186h = ((xz0) obj).m5186h();
                st0 st0VarM5186h2 = ((xz0) obj2).m5186h();
                int iCompare = Float.compare(st0VarM5186h.f5832a, st0VarM5186h2.f5832a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(st0VarM5186h.f5833b, st0VarM5186h2.f5833b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(st0VarM5186h.f5835d, st0VarM5186h2.f5835d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(st0VarM5186h.f5834c, st0VarM5186h2.f5834c);
            case 2:
                b60 b60Var = (b60) obj;
                b60 b60Var2 = (b60) obj2;
                int iM3008r = p30.m3008r(b60Var2.f420s, b60Var.f420s);
                return iM3008r != 0 ? iM3008r : p30.m3008r(b60Var.hashCode(), b60Var2.hashCode());
            case 3:
                st0 st0VarM5186h3 = ((xz0) obj).m5186h();
                st0 st0VarM5186h4 = ((xz0) obj2).m5186h();
                int iCompare4 = Float.compare(st0VarM5186h4.f5834c, st0VarM5186h3.f5834c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(st0VarM5186h3.f5833b, st0VarM5186h4.f5833b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(st0VarM5186h3.f5835d, st0VarM5186h4.f5835d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(st0VarM5186h4.f5832a, st0VarM5186h3.f5832a);
            case 4:
                uo0 uo0Var = (uo0) obj;
                uo0 uo0Var2 = (uo0) obj2;
                int iCompare7 = Float.compare(((st0) uo0Var.f6274d).f5833b, ((st0) uo0Var2.f6274d).f5833b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((st0) uo0Var.f6274d).f5835d, ((st0) uo0Var2.f6274d).f5835d);
            case 5:
                return pf1.m3056p(Integer.valueOf(((C0163e8) obj).f1339b), Integer.valueOf(((C0163e8) obj2).f1339b));
            case 6:
                return pf1.m3056p(Integer.valueOf(((C0163e8) obj).f1339b), Integer.valueOf(((C0163e8) obj2).f1339b));
            default:
                b60 b60Var3 = (b60) obj;
                b60 b60Var4 = (b60) obj2;
                int iM3008r2 = p30.m3008r(b60Var3.f420s, b60Var4.f420s);
                return iM3008r2 != 0 ? iM3008r2 : p30.m3008r(b60Var3.hashCode(), b60Var4.hashCode());
        }
    }
}
