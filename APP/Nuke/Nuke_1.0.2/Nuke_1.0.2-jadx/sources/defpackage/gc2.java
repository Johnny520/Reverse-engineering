package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gc2 implements fc2 {
    public final in0 h;
    public final rk1 i;
    public rk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gc2(Map map, in0 in0Var) {
        rk1 rk1Var;
        this.h = in0Var;
        if (map == null || map.isEmpty()) {
            rk1Var = null;
        } else {
            rk1Var = new rk1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                rk1Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.i = rk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final ec2 a(String str, xm0 xm0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!xe1.Q(str.charAt(i))) {
                rk1 rk1Var = this.j;
                if (rk1Var == null) {
                    long[] jArr = ed2.a;
                    rk1Var = new rk1();
                    this.j = rk1Var;
                }
                Object objG = rk1Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    rk1Var.m(str, objG);
                }
                ((List) objG).add(xm0Var);
                return new b5(rk1Var, str, xm0Var, 27);
            }
        }
        s.j("Registered key is empty or blank");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final boolean b(Object obj) {
        return ((Boolean) this.h.j(obj)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.fc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        rk1 rk1Var = this.i;
        if (rk1Var == null && this.j == null) {
            return ce0.h;
        }
        int i3 = 0;
        int i4 = rk1Var != null ? rk1Var.e : 0;
        rk1 rk1Var2 = this.j;
        HashMap map = new HashMap(i4 + (rk1Var2 != null ? rk1Var2.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (rk1Var != null) {
            Object[] objArr = rk1Var.b;
            Object[] objArr2 = rk1Var.c;
            long[] jArr3 = rk1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        }
        rk1 rk1Var3 = this.j;
        if (rk1Var3 != null) {
            Object[] objArr3 = rk1Var3.b;
            Object[] objArr4 = rk1Var3.c;
            long[] jArr4 = rk1Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j7 = jArr4[i10];
                    if ((((~j7) << c) & j7 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j7 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objA = ((xm0) list.get(i3)).a();
                                    if (objA != null) {
                                        if (!b(objA)) {
                                            c80.h(gf1.u(objA));
                                            return null;
                                        }
                                        map.put(str, eu.w(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((xm0) list.get(i3)).a();
                                        if (objA2 != null && !b(objA2)) {
                                            c80.h(gf1.u(objA2));
                                            return null;
                                        }
                                        arrayList.add(objA2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j7 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final Object d(String str) {
        rk1 rk1Var = this.i;
        List list = rk1Var != null ? (List) rk1Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && rk1Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = rk1Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = rk1Var.c;
            Object obj = objArr[iF];
            rk1Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
