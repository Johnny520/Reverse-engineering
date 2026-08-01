package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C0984;
import androidx.collection.C1082;
import androidx.compose.foundation.text.C1833;
import androidx.compose.runtime.collection.C2057;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C2082;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2115 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2125 f4087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long f4088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2122 f4089;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static List f4093;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0984 f4094;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AtomicInt f4095;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static List f4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2107 f4097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1833 f4092 = new C1833(12);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0955 f4091 = new C0955(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f4090 = new Object();

    static {
        C2122 c2122 = C2122.f4109;
        f4089 = c2122;
        f4088 = 2L;
        C2125 c2125 = new C2125();
        c2125.f4119 = new long[16];
        c2125.f4122 = new int[16];
        int[] iArr = new int[16];
        char c = 0;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        c2125.f4118 = iArr;
        f4087 = c2125;
        C0984 c0984 = new C0984(2, c);
        c0984.f940 = new int[16];
        c0984.f939 = new C2082[16];
        f4094 = c0984;
        EmptyList emptyList = EmptyList.INSTANCE;
        f4093 = emptyList;
        f4096 = emptyList;
        long j = f4088;
        f4088 = 1 + j;
        C2107 c2107 = new C2107(j, c2122, null, new C1833(11));
        f4089 = f4089.m2852(c2107.f4107);
        f4097 = c2107;
        f4095 = new AtomicInt(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2818() {
        C0984 c0984 = f4094;
        int i = c0984.f941;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C2082 c2082 = ((C2082[]) c0984.f939)[i2];
            Object obj = c2082 != null ? c2082.get() : null;
            if (obj != null && m2834((InterfaceC2092) obj)) {
                if (i3 != i2) {
                    ((C2082[]) c0984.f939)[i3] = c2082;
                    int[] iArr = (int[]) c0984.f940;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((C2082[]) c0984.f939)[i4] = null;
            ((int[]) c0984.f940)[i4] = 0;
        }
        if (i3 != i) {
            c0984.f941 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2819(InterfaceC7387 interfaceC7387) {
        C1082 c1082;
        Object objM2828;
        C2107 c2107 = f4097;
        synchronized (f4090) {
            try {
                c1082 = c2107.f4042;
                if (c1082 != null) {
                    f4095.add(1);
                }
                objM2828 = m2828(c2107, interfaceC7387);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1082 != null) {
            try {
                List list = f4093;
                C2057 c2057 = new C2057(c1082);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC7383) list.get(i)).invoke(c2057, c2107);
                }
            } finally {
                f4095.add(-1);
            }
        }
        synchronized (f4090) {
            m2818();
            if (c1082 != null) {
                Object[] objArr = c1082.f1345;
                long[] jArr = c1082.f1346;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m2831((InterfaceC2092) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objM2828;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2122 m2820(C2122 c2122, long j, long j2) {
        while (AbstractC5227.m9463(j, j2) < 0) {
            c2122 = c2122.m2852(j);
            j++;
        }
        return c2122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2821(AbstractC2121 abstractC2121) {
        long j;
        if (f4089.m2849(abstractC2121.mo2770())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC2121.mo2770());
        sb.append(", disposed=");
        sb.append(abstractC2121.f4106);
        sb.append(", applied=");
        C2106 c2106 = abstractC2121 instanceof C2106 ? (C2106) abstractC2121 : null;
        sb.append(c2106 != null ? Boolean.valueOf(c2106.f4041) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f4090) {
            C2125 c2125 = f4087;
            j = c2125.f4121 > 0 ? ((long[]) c2125.f4119)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap m2822(long j, C2106 c2106, C2122 c2122) {
        long[] jArr;
        C2122 c21222;
        long[] jArr2;
        C2122 c21223;
        int i;
        int i2;
        AbstractC2090 abstractC2090M2825;
        C1082 c1082Mo2781 = c2106.mo2781();
        if (c1082Mo2781 != null) {
            long jMo2770 = c2106.mo2770();
            C2122 c2122M2848 = c2106.mo2764().m2852(jMo2770).m2848(c2106.f4047);
            Object[] objArr = c1082Mo2781.f1345;
            long[] jArr3 = c1082Mo2781.f1346;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                InterfaceC2092 interfaceC2092 = (InterfaceC2092) objArr[(i3 << 3) + i6];
                                AbstractC2090 abstractC2090Mo2753 = interfaceC2092.mo2753();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                AbstractC2090 abstractC2090M28252 = m2825(abstractC2090Mo2753, j, c2122);
                                if (abstractC2090M28252 == null || (abstractC2090M2825 = m2825(abstractC2090Mo2753, jMo2770, c2122M2848)) == null || abstractC2090M28252.equals(abstractC2090M2825)) {
                                    c21223 = c2122M2848;
                                } else {
                                    c21223 = c2122M2848;
                                    AbstractC2090 abstractC2090M28253 = m2825(abstractC2090Mo2753, jMo2770, c2106.mo2764());
                                    if (abstractC2090M28253 == null) {
                                        m2832();
                                        throw null;
                                    }
                                    AbstractC2090 abstractC2090Mo2760 = interfaceC2092.mo2760(abstractC2090M2825, abstractC2090M28252, abstractC2090M28253);
                                    if (abstractC2090Mo2760 == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC2090M28252, abstractC2090Mo2760);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c21223 = c2122M2848;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            c2122M2848 = c21223;
                        }
                        jArr = jArr3;
                        c21222 = c2122M2848;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c21222 = c2122M2848;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    c2122M2848 = c21222;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2823() {
        m2819(f4092);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final AbstractC2090 m2824(AbstractC2090 abstractC2090, InterfaceC2092 interfaceC2092) {
        AbstractC2090 abstractC2090M2825;
        AbstractC2121 abstractC2121M2840 = m2840();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2840.mo2763();
        if (interfaceC7387Mo2763 != null) {
            interfaceC7387Mo2763.invoke(interfaceC2092);
        }
        AbstractC2090 abstractC2090M28252 = m2825(abstractC2090, abstractC2121M2840.mo2770(), abstractC2121M2840.mo2764());
        if (abstractC2090M28252 != null) {
            return abstractC2090M28252;
        }
        synchronized (f4090) {
            AbstractC2121 abstractC2121M28402 = m2840();
            AbstractC2090 abstractC2090Mo2753 = interfaceC2092.mo2753();
            abstractC2090Mo2753.getClass();
            abstractC2090M2825 = m2825(abstractC2090Mo2753, abstractC2121M28402.mo2770(), abstractC2121M28402.mo2764());
            if (abstractC2090M2825 == null) {
                m2832();
                throw null;
            }
        }
        return abstractC2090M2825;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final AbstractC2090 m2825(AbstractC2090 abstractC2090, long j, C2122 c2122) {
        AbstractC2090 abstractC20902 = null;
        while (abstractC2090 != null) {
            long j2 = abstractC2090.f3992;
            if (j2 != 0 && AbstractC5227.m9463(j2, j) <= 0 && !c2122.m2849(j2) && (abstractC20902 == null || AbstractC5227.m9463(abstractC20902.f3992, abstractC2090.f3992) < 0)) {
                abstractC20902 = abstractC2090;
            }
            abstractC2090 = abstractC2090.f3991;
        }
        if (abstractC20902 != null) {
            return abstractC20902;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final AbstractC2090 m2826(AbstractC2090 abstractC2090, InterfaceC2092 interfaceC2092, AbstractC2121 abstractC2121) {
        AbstractC2090 abstractC2090M2825;
        if (abstractC2121.mo2762()) {
            abstractC2121.mo2768(interfaceC2092);
        }
        long jMo2770 = abstractC2121.mo2770();
        AbstractC2090 abstractC2090M28252 = m2825(abstractC2090, jMo2770, abstractC2121.mo2764());
        if (abstractC2090M28252 == null) {
            m2832();
            throw null;
        }
        if (abstractC2090M28252.f3992 == abstractC2121.mo2770()) {
            return abstractC2090M28252;
        }
        synchronized (f4090) {
            abstractC2090M2825 = m2825(interfaceC2092.mo2753(), jMo2770, abstractC2121.mo2764());
            if (abstractC2090M2825 == null) {
                m2832();
                throw null;
            }
            if (abstractC2090M2825.f3992 != jMo2770) {
                AbstractC2090 abstractC2090M2830 = m2830(abstractC2090M2825, interfaceC2092);
                abstractC2090M2830.mo2757(abstractC2090M2825);
                abstractC2090M2830.f3992 = abstractC2121.mo2770();
                abstractC2090M2825 = abstractC2090M2830;
            }
        }
        if (abstractC2090M28252.f3992 != 1) {
            abstractC2121.mo2768(interfaceC2092);
        }
        return abstractC2090M2825;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m2827(int i) {
        C2125 c2125 = f4087;
        int i2 = ((int[]) c2125.f4118)[i];
        c2125.m2853(i2, c2125.f4121 - 1);
        c2125.f4121--;
        long[] jArr = (long[]) c2125.f4119;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (AbstractC5227.m9463(jArr[i4], j) <= 0) {
                break;
            }
            c2125.m2853(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c2125.f4119;
        int i5 = c2125.f4121 >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c2125.f4121 && AbstractC5227.m9463(jArr2[i6], jArr2[i7]) < 0) {
                if (AbstractC5227.m9463(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c2125.m2853(i6, i2);
                i2 = i6;
            } else {
                if (AbstractC5227.m9463(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c2125.m2853(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c2125.f4118)[i] = c2125.f4120;
        c2125.f4120 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Object m2828(C2107 c2107, InterfaceC7387 interfaceC7387) {
        long j = c2107.f4107;
        Object objInvoke = interfaceC7387.invoke(f4089.m2850(j));
        long j2 = f4088;
        f4088 = 1 + j2;
        C2122 c2122M2850 = f4089.m2850(j);
        f4089 = c2122M2850;
        c2107.f4107 = j2;
        c2107.f4108 = c2122M2850;
        c2107.f4043 = 0;
        c2107.f4042 = null;
        c2107.m2846();
        f4089 = f4089.m2852(j2);
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m2829(AbstractC2121 abstractC2121, InterfaceC2092 interfaceC2092) {
        abstractC2121.mo2778(abstractC2121.mo2783() + 1);
        InterfaceC7387 interfaceC7387Mo2773 = abstractC2121.mo2773();
        if (interfaceC7387Mo2773 != null) {
            interfaceC7387Mo2773.invoke(interfaceC2092);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC2090 m2830(AbstractC2090 abstractC2090, InterfaceC2092 interfaceC2092) {
        AbstractC2090 abstractC2090Mo2753 = interfaceC2092.mo2753();
        long j = f4088;
        C2125 c2125 = f4087;
        if (c2125.f4121 > 0) {
            j = ((long[]) c2125.f4119)[0];
        }
        long j2 = j - 1;
        AbstractC2090 abstractC20902 = null;
        AbstractC2090 abstractC20903 = null;
        while (true) {
            if (abstractC2090Mo2753 == null) {
                break;
            }
            long j3 = abstractC2090Mo2753.f3992;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && AbstractC5227.m9463(j3, j2) <= 0 && !C2122.f4109.m2849(j3)) {
                if (abstractC20903 == null) {
                    abstractC20903 = abstractC2090Mo2753;
                } else {
                    if (AbstractC5227.m9463(abstractC2090Mo2753.f3992, abstractC20903.f3992) < 0) {
                        break;
                    }
                    abstractC20902 = abstractC20903;
                }
            }
            abstractC2090Mo2753 = abstractC2090Mo2753.f3991;
        }
        if (abstractC20902 != null) {
            abstractC20902.f3992 = Long.MAX_VALUE;
            return abstractC20902;
        }
        AbstractC2090 abstractC2090Mo2756 = abstractC2090.mo2756(Long.MAX_VALUE);
        abstractC2090Mo2756.f3991 = interfaceC2092.mo2753();
        interfaceC2092.mo2754(abstractC2090Mo2756);
        return abstractC2090Mo2756;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final void m2831(InterfaceC2092 interfaceC2092) {
        if (m2834(interfaceC2092)) {
            C0984 c0984 = f4094;
            int i = c0984.f941;
            int iIdentityHashCode = System.identityHashCode(interfaceC2092);
            int i2 = -1;
            if (i > 0) {
                int i3 = c0984.f941 - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c0984.f940)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        C2082 c2082 = ((C2082[]) c0984.f939)[i5];
                        if (interfaceC2092 == (c2082 != null ? c2082.get() : null)) {
                            i2 = i5;
                        } else {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) c0984.f940)[i7] == iIdentityHashCode; i7--) {
                                C2082 c20822 = ((C2082[]) c0984.f939)[i7];
                                if ((c20822 != null ? c20822.get() : null) == interfaceC2092) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = c0984.f941;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(c0984.f941 + 1);
                                    break;
                                } else {
                                    if (((int[]) c0984.f940)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    C2082 c20823 = ((C2082[]) c0984.f939)[i5];
                                    if ((c20823 != null ? c20823.get() : null) == interfaceC2092) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            i2 = i5;
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            C2082[] c2082Arr = (C2082[]) c0984.f939;
            int length = c2082Arr.length;
            if (i == length) {
                int i10 = length * 2;
                C2082[] c2082Arr2 = new C2082[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(c2082Arr, i9, c2082Arr2, i11, i - i9);
                System.arraycopy((C2082[]) c0984.f939, 0, c2082Arr2, 0, i9);
                AbstractC5179.m9395(i11, i9, i, (int[]) c0984.f940, iArr);
                AbstractC5179.m9400(0, i9, 6, (int[]) c0984.f940, iArr);
                c0984.f939 = c2082Arr2;
                c0984.f940 = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(c2082Arr, i9, c2082Arr, i12, i - i9);
                int[] iArr2 = (int[]) c0984.f940;
                AbstractC5179.m9395(i12, i9, i, iArr2, iArr2);
            }
            ((C2082[]) c0984.f939)[i9] = new C2082(interfaceC2092);
            ((int[]) c0984.f940)[i9] = iIdentityHashCode;
            c0984.f941++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final void m2832() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final AbstractC2090 m2833(AbstractC2090 abstractC2090, AbstractC2091 abstractC2091, AbstractC2121 abstractC2121, AbstractC2090 abstractC20902) {
        AbstractC2090 abstractC2090M2830;
        if (abstractC2121.mo2762()) {
            abstractC2121.mo2768(abstractC2091);
        }
        long jMo2770 = abstractC2121.mo2770();
        if (abstractC20902.f3992 == jMo2770) {
            return abstractC20902;
        }
        synchronized (f4090) {
            abstractC2090M2830 = m2830(abstractC2090, abstractC2091);
        }
        abstractC2090M2830.f3992 = jMo2770;
        if (abstractC20902.f3992 != 1) {
            abstractC2121.mo2768(abstractC2091);
        }
        return abstractC2090M2830;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m2834(InterfaceC2092 interfaceC2092) {
        AbstractC2090 abstractC2090;
        long j = f4088;
        C2125 c2125 = f4087;
        if (c2125.f4121 > 0) {
            j = ((long[]) c2125.f4119)[0];
        }
        AbstractC2090 abstractC20902 = null;
        AbstractC2090 abstractC2090Mo2753 = null;
        int i = 0;
        for (AbstractC2090 abstractC2090Mo27532 = interfaceC2092.mo2753(); abstractC2090Mo27532 != null; abstractC2090Mo27532 = abstractC2090Mo27532.f3991) {
            long j2 = abstractC2090Mo27532.f3992;
            if (j2 != 0) {
                if (AbstractC5227.m9463(j2, j) >= 0) {
                    i++;
                } else if (abstractC20902 == null) {
                    i++;
                    abstractC20902 = abstractC2090Mo27532;
                } else {
                    if (AbstractC5227.m9463(abstractC2090Mo27532.f3992, abstractC20902.f3992) < 0) {
                        abstractC2090 = abstractC20902;
                        abstractC20902 = abstractC2090Mo27532;
                    } else {
                        abstractC2090 = abstractC2090Mo27532;
                    }
                    if (abstractC2090Mo2753 == null) {
                        abstractC2090Mo2753 = interfaceC2092.mo2753();
                        AbstractC2090 abstractC20903 = abstractC2090Mo2753;
                        while (true) {
                            if (abstractC2090Mo2753 == null) {
                                abstractC2090Mo2753 = abstractC20903;
                                break;
                            }
                            if (AbstractC5227.m9463(abstractC2090Mo2753.f3992, j) >= 0) {
                                break;
                            }
                            if (AbstractC5227.m9463(abstractC20903.f3992, abstractC2090Mo2753.f3992) < 0) {
                                abstractC20903 = abstractC2090Mo2753;
                            }
                            abstractC2090Mo2753 = abstractC2090Mo2753.f3991;
                        }
                    }
                    abstractC20902.f3992 = 0L;
                    abstractC20902.mo2757(abstractC2090Mo2753);
                    abstractC20902 = abstractC2090;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC2090 m2835(AbstractC2090 abstractC2090) {
        AbstractC2090 abstractC2090M2825;
        AbstractC2121 abstractC2121M2840 = m2840();
        AbstractC2090 abstractC2090M28252 = m2825(abstractC2090, abstractC2121M2840.mo2770(), abstractC2121M2840.mo2764());
        if (abstractC2090M28252 != null) {
            return abstractC2090M28252;
        }
        synchronized (f4090) {
            AbstractC2121 abstractC2121M28402 = m2840();
            abstractC2090M2825 = m2825(abstractC2090, abstractC2121M28402.mo2770(), abstractC2121M28402.mo2764());
        }
        if (abstractC2090M2825 != null) {
            return abstractC2090M2825;
        }
        m2832();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AbstractC2121 m2836(AbstractC2121 abstractC2121, InterfaceC7387 interfaceC7387, boolean z) {
        boolean z2 = abstractC2121 instanceof C2106;
        if (z2 || abstractC2121 == null) {
            return new C2097(z2 ? (C2106) abstractC2121 : null, interfaceC7387, null, false, z);
        }
        return new C2096(abstractC2121, interfaceC7387, false, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC7387 m2837(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, boolean z) {
        if (!z) {
            interfaceC73872 = null;
        }
        return (interfaceC7387 == null || interfaceC73872 == null || interfaceC7387 == interfaceC73872) ? interfaceC7387 == null ? interfaceC73872 : interfaceC7387 : new C2123(interfaceC7387, interfaceC73872, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC7387 m2838(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        return (interfaceC7387 == null || interfaceC73872 == null || interfaceC7387 == interfaceC73872) ? interfaceC7387 == null ? interfaceC73872 : interfaceC7387 : new C2123(interfaceC7387, interfaceC73872, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final AbstractC2090 m2839(AbstractC2090 abstractC2090, AbstractC2121 abstractC2121) {
        AbstractC2090 abstractC2090M2825;
        AbstractC2090 abstractC2090M28252 = m2825(abstractC2090, abstractC2121.mo2770(), abstractC2121.mo2764());
        if (abstractC2090M28252 != null) {
            return abstractC2090M28252;
        }
        synchronized (f4090) {
            abstractC2090M2825 = m2825(abstractC2090, abstractC2121.mo2770(), abstractC2121.mo2764());
        }
        if (abstractC2090M2825 != null) {
            return abstractC2090M2825;
        }
        m2832();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final AbstractC2121 m2840() {
        AbstractC2121 abstractC2121 = (AbstractC2121) f4091.m953();
        return abstractC2121 == null ? f4097 : abstractC2121;
    }
}
