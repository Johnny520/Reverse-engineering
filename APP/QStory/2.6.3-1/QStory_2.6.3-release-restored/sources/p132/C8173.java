package p132;

import androidx.appcompat.app.C0955;
import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8173 implements InterfaceC8174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1083 f19915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1083 f19916;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f19917;

    public C8173(Map map, InterfaceC7387 interfaceC7387) {
        C1083 c1083;
        this.f19917 = interfaceC7387;
        if (map == null || map.isEmpty()) {
            c1083 = null;
        } else {
            c1083 = new C1083(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c1083.m1315(entry.getKey(), entry.getValue());
            }
        }
        this.f19915 = c1083;
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8167 mo2041(String str, InterfaceC7372 interfaceC7372) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC8568.m13623(str.charAt(i))) {
                C1083 c1083 = this.f19916;
                if (c1083 == null) {
                    long[] jArr = AbstractC1137.f1352;
                    c1083 = new C1083();
                    this.f19916 = c1083;
                }
                Object objM1317 = c1083.m1317(str);
                if (objM1317 == null) {
                    objM1317 = new ArrayList();
                    c1083.m1315(str, objM1317);
                }
                ((List) objM1317).add(interfaceC7372);
                return new C0955(c1083, str, interfaceC7372, 26);
            }
        }
        C6755.m11869("Registered key is empty or blank");
        return null;
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo2043(String str) {
        C1083 c1083 = this.f19915;
        List list = c1083 != null ? (List) c1083.m1318(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c1083 != null) {
            List listSubList = list.subList(1, list.size());
            int iM1309 = c1083.m1309(str);
            if (iM1309 < 0) {
                iM1309 = ~iM1309;
            }
            Object[] objArr = c1083.f1224;
            Object obj = objArr[iM1309];
            c1083.f1225[iM1309] = str;
            objArr[iM1309] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo2044() {
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
        C1083 c1083 = this.f19915;
        if (c1083 == null && this.f19916 == null) {
            return AbstractC5171.m9335();
        }
        int i3 = 0;
        int i4 = c1083 != null ? c1083.f1222 : 0;
        C1083 c10832 = this.f19916;
        HashMap map = new HashMap(i4 + (c10832 != null ? c10832.f1222 : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (c1083 != null) {
            Object[] objArr = c1083.f1225;
            Object[] objArr2 = c1083.f1224;
            long[] jArr3 = c1083.f1226;
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
        C1083 c10833 = this.f19916;
        if (c10833 != null) {
            Object[] objArr3 = c10833.f1225;
            Object[] objArr4 = c10833.f1224;
            long[] jArr4 = c10833.f1226;
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
                                    Object objInvoke = ((InterfaceC7372) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!mo2045(objInvoke)) {
                                            C6755.m11871(AbstractC8176.m13100(objInvoke));
                                            return null;
                                        }
                                        map.put(str, AbstractC7176.m12471(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((InterfaceC7372) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !mo2045(objInvoke2)) {
                                            C6755.m11871(AbstractC8176.m13100(objInvoke2));
                                            return null;
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

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo2045(Object obj) {
        return ((Boolean) this.f19917.invoke(obj)).booleanValue();
    }
}
