package p152e0;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000A.C0072l0;
import p061L2.C0982v;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p179i4.AbstractC2352g;
import p186k.AbstractC2415L;
import p186k.C2408E;

/* JADX INFO: renamed from: e0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2000g implements InterfaceC1999f {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c f6718d;

    /* JADX INFO: renamed from: e */
    public final C2408E f6719e;

    /* JADX INFO: renamed from: f */
    public C2408E f6720f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2000g(Map map, InterfaceC1601c interfaceC1601c) {
        C2408E c2408e;
        this.f6718d = interfaceC1601c;
        if (map == null || map.isEmpty()) {
            c2408e = null;
        } else {
            c2408e = new C2408E(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c2408e.m4278m(entry.getKey(), entry.getValue());
            }
        }
        this.f6719e = c2408e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: a */
    public final boolean mo1275a(Object obj) {
        return ((Boolean) this.f6718d.mo1h(obj)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo1276b() {
        char c5;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        char c6;
        long j8;
        C2408E c2408e = this.f6719e;
        if (c2408e == null && this.f6720f == null) {
            return C0982v.f3048d;
        }
        int i7 = 0;
        int i8 = c2408e != null ? c2408e.f7791e : 0;
        C2408E c2408e2 = this.f6720f;
        HashMap map = new HashMap(i8 + (c2408e2 != null ? c2408e2.f7791e : 0));
        char c7 = 7;
        long j9 = -9187201950435737472L;
        int i9 = 8;
        if (c2408e != null) {
            Object[] objArr = c2408e.f7788b;
            Object[] objArr2 = c2408e.f7789c;
            long[] jArr3 = c2408e.f7787a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                j6 = 128;
                while (true) {
                    long j10 = jArr3[i10];
                    j7 = 255;
                    if ((((~j10) << c7) & j10 & j9) != j9) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j10 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                c6 = c7;
                                j8 = j9;
                                map.put((String) objArr[i13], (List) objArr2[i13]);
                            } else {
                                c6 = c7;
                                j8 = j9;
                            }
                            j10 >>= 8;
                            i12++;
                            c7 = c6;
                            j9 = j8;
                        }
                        c5 = c7;
                        j5 = j9;
                        if (i11 != 8) {
                            break;
                        }
                    } else {
                        c5 = c7;
                        j5 = j9;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    c7 = c5;
                    j9 = j5;
                }
            } else {
                c5 = 7;
                j5 = -9187201950435737472L;
                j6 = 128;
                j7 = 255;
            }
        }
        C2408E c2408e3 = this.f6720f;
        if (c2408e3 != null) {
            Object[] objArr3 = c2408e3.f7788b;
            Object[] objArr4 = c2408e3.f7789c;
            long[] jArr4 = c2408e3.f7787a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                while (true) {
                    long j11 = jArr4[i14];
                    if ((((~j11) << c5) & j11 & j5) != j5) {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        int i16 = i7;
                        while (i16 < i15) {
                            if ((j11 & j7) < j6) {
                                int i17 = (i14 << 3) + i16;
                                Object obj = objArr3[i17];
                                List list = (List) objArr4[i17];
                                String str = (String) obj;
                                i6 = i9;
                                if (list.size() == 1) {
                                    Object objMo6a = ((InterfaceC1599a) list.get(i7)).mo6a();
                                    if (objMo6a != null) {
                                        if (!mo1275a(objMo6a)) {
                                            throw new IllegalStateException(AbstractC2004k.m3669a(objMo6a).toString());
                                        }
                                        map.put(str, AbstractC2352g.m4195h(objMo6a));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i7 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objMo6a2 = ((InterfaceC1599a) list.get(i7)).mo6a();
                                        if (objMo6a2 != null && !mo1275a(objMo6a2)) {
                                            throw new IllegalStateException(AbstractC2004k.m3669a(objMo6a2).toString());
                                        }
                                        arrayList.add(objMo6a2);
                                        i7++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i6 = i9;
                            }
                            j11 >>= i6;
                            i16++;
                            i9 = i6;
                            jArr4 = jArr2;
                            i7 = 0;
                        }
                        jArr = jArr4;
                        i5 = i9;
                        if (i15 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i5 = i9;
                    }
                    if (i14 == length2) {
                        break;
                    }
                    i14++;
                    i9 = i5;
                    jArr4 = jArr;
                    i7 = 0;
                }
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: c */
    public final Object mo1277c(String str) {
        C2408E c2408e = this.f6719e;
        List list = c2408e != null ? (List) c2408e.m4276k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c2408e != null) {
            List listSubList = list.subList(1, list.size());
            int iM4271f = c2408e.m4271f(str);
            if (iM4271f < 0) {
                iM4271f = ~iM4271f;
            }
            Object[] objArr = c2408e.f7789c;
            Object obj = objArr[iM4271f];
            c2408e.f7788b[iM4271f] = str;
            objArr[iM4271f] = listSubList;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: d */
    public final InterfaceC1998e mo1278d(String str, InterfaceC1599a interfaceC1599a) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!AbstractC1926h.m3580w(str.charAt(i5))) {
                C2408E c2408e = this.f6720f;
                if (c2408e == null) {
                    long[] jArr = AbstractC2415L.f7816a;
                    c2408e = new C2408E();
                    this.f6720f = c2408e;
                }
                Object objM4272g = c2408e.m4272g(str);
                if (objM4272g == null) {
                    objM4272g = new ArrayList();
                    c2408e.m4278m(str, objM4272g);
                }
                ((List) objM4272g).add(interfaceC1599a);
                return new C0072l0(c2408e, str, interfaceC1599a, 19);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
