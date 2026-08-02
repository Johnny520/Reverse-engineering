package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gc2 implements fc2 {

    /* JADX INFO: renamed from: h */
    public final in0 f3397h;

    /* JADX INFO: renamed from: i */
    public final rk1 f3398i;

    /* JADX INFO: renamed from: j */
    public rk1 f3399j;

    public gc2(Map map, in0 in0Var) {
        rk1 rk1Var;
        this.f3397h = in0Var;
        if (map == null || map.isEmpty()) {
            rk1Var = null;
        } else {
            rk1Var = new rk1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                rk1Var.m4511m(entry.getKey(), entry.getValue());
            }
        }
        this.f3398i = rk1Var;
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: a */
    public final ec2 mo975a(String str, xm0 xm0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!xe1.m6099Q(str.charAt(i))) {
                rk1 rk1Var = this.f3399j;
                if (rk1Var == null) {
                    long[] jArr = ed2.f2401a;
                    rk1Var = new rk1();
                    this.f3399j = rk1Var;
                }
                Object objM4505g = rk1Var.m4505g(str);
                if (objM4505g == null) {
                    objM4505g = new ArrayList();
                    rk1Var.m4511m(str, objM4505g);
                }
                ((List) objM4505g).add(xm0Var);
                return new C0043b5(rk1Var, str, xm0Var, 27);
            }
        }
        C0676s.m4651j("Registered key is empty or blank");
        return null;
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: b */
    public final boolean mo976b(Object obj) {
        return ((Boolean) this.f3397h.mo5j(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // p000.fc2
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo977c() {
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
        rk1 rk1Var = this.f3398i;
        if (rk1Var == null && this.f3399j == null) {
            return ce0.f1492h;
        }
        int i3 = 0;
        int i4 = rk1Var != null ? rk1Var.f9622e : 0;
        rk1 rk1Var2 = this.f3399j;
        HashMap map = new HashMap(i4 + (rk1Var2 != null ? rk1Var2.f9622e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (rk1Var != null) {
            Object[] objArr = rk1Var.f9619b;
            Object[] objArr2 = rk1Var.f9620c;
            long[] jArr3 = rk1Var.f9618a;
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
        rk1 rk1Var3 = this.f3399j;
        if (rk1Var3 != null) {
            Object[] objArr3 = rk1Var3.f9619b;
            Object[] objArr4 = rk1Var3.f9620c;
            long[] jArr4 = rk1Var3.f9618a;
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
                                    Object objMo6a = ((xm0) list.get(i3)).mo6a();
                                    if (objMo6a != null) {
                                        if (!mo976b(objMo6a)) {
                                            c80.m665h(gf1.m1903u(objMo6a));
                                            return null;
                                        }
                                        map.put(str, AbstractC0179eu.m1473w(objMo6a));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objMo6a2 = ((xm0) list.get(i3)).mo6a();
                                        if (objMo6a2 != null && !mo976b(objMo6a2)) {
                                            c80.m665h(gf1.m1903u(objMo6a2));
                                            return null;
                                        }
                                        arrayList.add(objMo6a2);
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

    @Override // p000.fc2
    /* JADX INFO: renamed from: d */
    public final Object mo978d(String str) {
        rk1 rk1Var = this.f3398i;
        List list = rk1Var != null ? (List) rk1Var.m4509k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && rk1Var != null) {
            List listSubList = list.subList(1, list.size());
            int iM4504f = rk1Var.m4504f(str);
            if (iM4504f < 0) {
                iM4504f = ~iM4504f;
            }
            Object[] objArr = rk1Var.f9620c;
            Object obj = objArr[iM4504f];
            rk1Var.f9619b[iM4504f] = str;
            objArr[iM4504f] = listSubList;
        }
        return list.get(0);
    }
}
