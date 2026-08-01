package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 implements zw0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0742sw f284d;

    /* JADX INFO: renamed from: e */
    public final jh0 f285e;

    /* JADX INFO: renamed from: f */
    public jh0 f286f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ax0(Map map, InterfaceC0742sw interfaceC0742sw) {
        jh0 jh0Var;
        this.f284d = interfaceC0742sw;
        if (map == null || map.isEmpty()) {
            jh0Var = null;
        } else {
            jh0Var = new jh0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                jh0Var.m1707m(entry.getKey(), entry.getValue());
            }
        }
        this.f285e = jh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: a */
    public final C0541o8 mo214a(String str, InterfaceC0298hw interfaceC0298hw) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!p30.m2978N(str.charAt(i))) {
                jh0 jh0Var = this.f286f;
                if (jh0Var == null) {
                    long[] jArr = dy0.f1212a;
                    jh0Var = new jh0();
                    this.f286f = jh0Var;
                }
                Object objM1701g = jh0Var.m1701g(str);
                if (objM1701g == null) {
                    objM1701g = new ArrayList();
                    jh0Var.m1707m(str, objM1701g);
                }
                ((List) objM1701g).add(interfaceC0298hw);
                return new C0541o8(jh0Var, str, interfaceC0298hw);
            }
        }
        C0921xc.m5131l("Registered key is empty or blank");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: b */
    public final boolean mo215b(Object obj) {
        return ((Boolean) this.f284d.invoke(obj)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // p000.zw0
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo216c() {
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
        jh0 jh0Var = this.f285e;
        if (jh0Var == null && this.f286f == null) {
            return C0330is.f2614d;
        }
        int i3 = 0;
        int i4 = jh0Var != null ? jh0Var.f2882e : 0;
        jh0 jh0Var2 = this.f286f;
        HashMap map = new HashMap(i4 + (jh0Var2 != null ? jh0Var2.f2882e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (jh0Var != null) {
            Object[] objArr = jh0Var.f2879b;
            Object[] objArr2 = jh0Var.f2880c;
            long[] jArr3 = jh0Var.f2878a;
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
        jh0 jh0Var3 = this.f286f;
        if (jh0Var3 != null) {
            Object[] objArr3 = jh0Var3.f2879b;
            Object[] objArr4 = jh0Var3.f2880c;
            long[] jArr4 = jh0Var3.f2878a;
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
                                    Object objInvoke = ((InterfaceC0298hw) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!mo215b(objInvoke)) {
                                            throw new IllegalStateException(r60.m3414p(objInvoke).toString());
                                        }
                                        map.put(str, o30.m2769i(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((InterfaceC0298hw) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !mo215b(objInvoke2)) {
                                            throw new IllegalStateException(r60.m3414p(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
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
    @Override // p000.zw0
    /* JADX INFO: renamed from: d */
    public final Object mo217d(String str) {
        jh0 jh0Var = this.f285e;
        List list = jh0Var != null ? (List) jh0Var.m1705k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && jh0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iM1700f = jh0Var.m1700f(str);
            if (iM1700f < 0) {
                iM1700f = ~iM1700f;
            }
            Object[] objArr = jh0Var.f2880c;
            Object obj = objArr[iM1700f];
            jh0Var.f2879b[iM1700f] = str;
            objArr[iM1700f] = listSubList;
        }
        return list.get(0);
    }
}
