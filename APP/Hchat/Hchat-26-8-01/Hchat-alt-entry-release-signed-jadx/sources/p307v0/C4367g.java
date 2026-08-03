package p307v0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p020b5.C0184c;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import tf.C4174u;

/* JADX INFO: renamed from: v0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4367g implements InterfaceC4366f {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1231l f14572g;

    /* JADX INFO: renamed from: h */
    public final C0943k0 f14573h;

    /* JADX INFO: renamed from: i */
    public C0943k0 f14574i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4367g(Map map, InterfaceC1231l interfaceC1231l) {
        C0943k0 c0943k0;
        this.f14572g = interfaceC1231l;
        if (map == null || map.isEmpty()) {
            c0943k0 = null;
        } else {
            c0943k0 = new C0943k0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c0943k0.m2326m(entry.getKey(), entry.getValue());
            }
        }
        this.f14573h = c0943k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: a */
    public final boolean mo8036a(Object obj) {
        return ((Boolean) this.f14572g.invoke(obj)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo8038c() {
        char c10;
        long j3;
        long j4;
        long j5;
        long[] jArr;
        int i9;
        long[] jArr2;
        int i10;
        char c11;
        long j10;
        C0943k0 c0943k0 = this.f14573h;
        if (c0943k0 == null && this.f14574i == null) {
            return C4174u.f13711g;
        }
        int i11 = 0;
        int i12 = c0943k0 != null ? c0943k0.f2972e : 0;
        C0943k0 c0943k02 = this.f14574i;
        HashMap map = new HashMap(i12 + (c0943k02 != null ? c0943k02.f2972e : 0));
        char c12 = 7;
        long j11 = -9187201950435737472L;
        int i13 = 8;
        if (c0943k0 != null) {
            Object[] objArr = c0943k0.f2969b;
            Object[] objArr2 = c0943k0.f2970c;
            long[] jArr3 = c0943k0.f2968a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                j4 = 128;
                while (true) {
                    long j12 = jArr3[i14];
                    j5 = 255;
                    if ((((~j12) << c12) & j12 & j11) != j11) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j12 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                c11 = c12;
                                j10 = j11;
                                map.put((String) objArr[i17], (List) objArr2[i17]);
                            } else {
                                c11 = c12;
                                j10 = j11;
                            }
                            j12 >>= 8;
                            i16++;
                            c12 = c11;
                            j11 = j10;
                        }
                        c10 = c12;
                        j3 = j11;
                        if (i15 != 8) {
                            break;
                        }
                    } else {
                        c10 = c12;
                        j3 = j11;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    c12 = c10;
                    j11 = j3;
                }
            } else {
                c10 = 7;
                j3 = -9187201950435737472L;
                j4 = 128;
                j5 = 255;
            }
        }
        C0943k0 c0943k03 = this.f14574i;
        if (c0943k03 != null) {
            Object[] objArr3 = c0943k03.f2969b;
            Object[] objArr4 = c0943k03.f2970c;
            long[] jArr4 = c0943k03.f2968a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j13 = jArr4[i18];
                    if ((((~j13) << c10) & j13 & j3) != j3) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i20 = i11;
                        while (i20 < i19) {
                            if ((j13 & j5) < j4) {
                                int i21 = (i18 << 3) + i20;
                                Object obj = objArr3[i21];
                                List list = (List) objArr4[i21];
                                String str = (String) obj;
                                i10 = i13;
                                if (list.size() == 1) {
                                    Object objInvoke = ((InterfaceC1220a) list.get(i11)).invoke();
                                    if (objInvoke != null) {
                                        if (!mo8036a(objInvoke)) {
                                            C0086a.m449h(AbstractC4371k.m8803a(objInvoke));
                                            return null;
                                        }
                                        map.put(str, AbstractC0000a.m72k(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i11 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((InterfaceC1220a) list.get(i11)).invoke();
                                        if (objInvoke2 != null && !mo8036a(objInvoke2)) {
                                            C0086a.m449h(AbstractC4371k.m8803a(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i11++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i10 = i13;
                            }
                            j13 >>= i10;
                            i20++;
                            i13 = i10;
                            jArr4 = jArr2;
                            i11 = 0;
                        }
                        jArr = jArr4;
                        i9 = i13;
                        if (i19 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i9 = i13;
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    i13 = i9;
                    jArr4 = jArr;
                    i11 = 0;
                }
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: d */
    public final Object mo8039d(String str) {
        C0943k0 c0943k0 = this.f14573h;
        List list = c0943k0 != null ? (List) c0943k0.m2324k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c0943k0 != null) {
            List listSubList = list.subList(1, list.size());
            int iM2319f = c0943k0.m2319f(str);
            if (iM2319f < 0) {
                iM2319f = ~iM2319f;
            }
            Object[] objArr = c0943k0.f2970c;
            Object obj = objArr[iM2319f];
            c0943k0.f2969b[iM2319f] = str;
            objArr[iM2319f] = listSubList;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4366f
    /* JADX INFO: renamed from: e */
    public final InterfaceC4365e mo8040e(String str, InterfaceC1220a interfaceC1220a) {
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (!AbstractC0000a.m95v0(str.charAt(i9))) {
                C0943k0 c0943k0 = this.f14574i;
                if (c0943k0 == null) {
                    long[] jArr = AbstractC0957r0.f3015a;
                    c0943k0 = new C0943k0();
                    this.f14574i = c0943k0;
                }
                Object objM2320g = c0943k0.m2320g(str);
                if (objM2320g == null) {
                    objM2320g = new ArrayList();
                    c0943k0.m2326m(str, objM2320g);
                }
                ((List) objM2320g).add(interfaceC1220a);
                return new C0184c(c0943k0, str, interfaceC1220a);
            }
        }
        C2104o.m5294t("Registered key is empty or blank");
        return null;
    }
}
