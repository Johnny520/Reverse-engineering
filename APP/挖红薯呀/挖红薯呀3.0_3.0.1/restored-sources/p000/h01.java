package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h01 {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f2112a;

    /* JADX INFO: renamed from: b */
    public static final C0462m7 f2113b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new g01(new g01(i == 0 ? C0186ev.f1532e : C0186ev.f1530c));
            i++;
        }
        f2112a = comparatorArr;
        f2113b = C0462m7.f3828G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1272a(xz0 xz0Var, ArrayList arrayList, C0711s2 c0711s2, C0711s2 c0711s22, ug0 ug0Var) {
        sz0 sz0Var = xz0Var.f7471d;
        Object objM1701g = sz0Var.f5877d.m1701g(b01.f334m);
        if (objM1701g == null) {
            objM1701g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM1701g).booleanValue();
        if ((zBooleanValue || ((Boolean) c0711s22.invoke(xz0Var)).booleanValue()) && ((Boolean) c0711s2.invoke(xz0Var)).booleanValue()) {
            arrayList.add(xz0Var);
        }
        if (zBooleanValue) {
            ug0Var.m4330i(xz0Var.f7474g, m1273b(xz0Var, c0711s2, c0711s22, xz0.m5178j(7, xz0Var)));
            return;
        }
        List listM5178j = xz0.m5178j(7, xz0Var);
        int size = listM5178j.size();
        for (int i = 0; i < size; i++) {
            m1272a((xz0) listM5178j.get(i), arrayList, c0711s2, c0711s22, ug0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[EDGE_INSN: B:53:0x00d2->B:32:0x00d2 BREAK  A[LOOP:2: B:21:0x0069->B:31:0x00ce]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[LOOP:1: B:12:0x0046->B:34:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[EDGE_INSN: B:51:0x00f4->B:35:0x00f4 BREAK  A[LOOP:1: B:12:0x0046->B:34:0x00ef], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m1273b(xz0 xz0Var, C0711s2 c0711s2, C0711s2 c0711s22, List list) {
        ug0 ug0Var = v20.f6389a;
        ug0 ug0Var2 = new ug0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m1272a((xz0) list.get(i), arrayList, c0711s2, c0711s22, ug0Var2);
        }
        int i2 = 1;
        char c = xz0Var.f7470c.f389C == k50.f3016e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                xz0 xz0Var2 = (xz0) arrayList.get(i3);
                if (i3 != 0) {
                    float f = xz0Var2.m5186h().f5833b;
                    float f2 = xz0Var2.m5186h().f5835d;
                    int i4 = f >= f2 ? i2 : 0;
                    int size3 = arrayList2.size() - i2;
                    if (size3 >= 0) {
                        int i5 = 0;
                        while (true) {
                            st0 st0Var = (st0) ((uo0) arrayList2.get(i5)).f6274d;
                            float f3 = st0Var.f5833b;
                            float f4 = st0Var.f5835d;
                            boolean z = f3 >= f4;
                            if (i4 == 0 && !z && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i5, new uo0(new st0(Math.max(st0Var.f5832a, 0.0f), Math.max(st0Var.f5833b, f), Math.min(st0Var.f5834c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((uo0) arrayList2.get(i5)).f6275e));
                                ((List) ((uo0) arrayList2.get(i5)).f6275e).add(xz0Var2);
                                break;
                            }
                            if (i5 == size3) {
                                break;
                            }
                            i5++;
                        }
                        arrayList2.add(new uo0(xz0Var2.m5186h(), new ArrayList(new C0880w8(new xz0[]{xz0Var2}, true))));
                        if (i3 != size2) {
                            break;
                        }
                        i3++;
                        i2 = 1;
                    } else {
                        arrayList2.add(new uo0(xz0Var2.m5186h(), new ArrayList(new C0880w8(new xz0[]{xz0Var2}, true))));
                        if (i3 != size2) {
                        }
                    }
                }
            }
        }
        AbstractC0127df.m688F(arrayList2, C0186ev.f1533f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f2112a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            uo0 uo0Var = (uo0) arrayList2.get(i6);
            AbstractC0127df.m688F((List) uo0Var.f6275e, comparator);
            arrayList3.addAll((Collection) uo0Var.f6275e);
        }
        AbstractC0127df.m688F(arrayList3, new C0511ng(1, f2113b));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) ug0Var2.m4248b(((xz0) arrayList3.get(size5)).f7474g);
            if (list2 != null) {
                if (((Boolean) c0711s22.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
