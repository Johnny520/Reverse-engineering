package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0137;
import androidx.collection.C0235;
import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C1247;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1290 f3741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long f3742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C1287 f3743;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static List f3747;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0137 f3748;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AtomicInt f3749;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static List f3750;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1272 f3751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0995 f3746 = new C0995(12);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0108 f3745 = new C0108(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f3744 = new Object();

    static {
        C1287 c1287 = C1287.f3763;
        f3743 = c1287;
        f3742 = 2L;
        C1290 c1290 = new C1290();
        c1290.f3773 = new long[16];
        c1290.f3776 = new int[16];
        int[] iArr = new int[16];
        char c = 0;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        c1290.f3772 = iArr;
        f3741 = c1290;
        C0137 c0137 = new C0137(2, c);
        c0137.f595 = new int[16];
        c0137.f594 = new C1247[16];
        f3748 = c0137;
        EmptyList emptyList = EmptyList.INSTANCE;
        f3747 = emptyList;
        f3750 = emptyList;
        long j = f3742;
        f3742 = 1 + j;
        C1272 c1272 = new C1272(j, c1287, null, new C0995(11));
        f3743 = f3743.m2282(c1272.f3761);
        f3751 = c1272;
        f3749 = new AtomicInt(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2248() {
        C0137 c0137 = f3748;
        int i = c0137.f596;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C1247 c1247 = ((C1247[]) c0137.f594)[i2];
            Object obj = c1247 != null ? c1247.get() : null;
            if (obj != null && m2264((InterfaceC1257) obj)) {
                if (i3 != i2) {
                    ((C1247[]) c0137.f594)[i3] = c1247;
                    int[] iArr = (int[]) c0137.f595;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((C1247[]) c0137.f594)[i4] = null;
            ((int[]) c0137.f595)[i4] = 0;
        }
        if (i3 != i) {
            c0137.f596 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2249(p052.InterfaceC6557 r15) {
        /*
            androidx.compose.runtime.snapshots.飘花落叶言子楪世苏哲兰 r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3751
            java.lang.Object r1 = androidx.compose.runtime.snapshots.AbstractC1280.f3744
            monitor-enter(r1)
            androidx.collection.飘花落叶言子世兰楪哲苏 r2 = r0.f3696     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            androidx.compose.runtime.internal.AtomicInt r3 = androidx.compose.runtime.snapshots.AbstractC1280.f3749     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.add(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = m2258(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.util.List r4 = androidx.compose.runtime.snapshots.AbstractC1280.f3747     // Catch: java.lang.Throwable -> L36
            androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏 r5 = new androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6553) r8     // Catch: java.lang.Throwable -> L36
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3749
            r0.add(r3)
            goto L44
        L3e:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3749
            r0.add(r3)
            throw r15
        L44:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3744
            monitor-enter(r0)
            m2248()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f1000     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f1001     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            androidx.compose.runtime.snapshots.飘花落叶言子世楪哲兰苏 r11 = (androidx.compose.runtime.snapshots.InterfaceC1257) r11     // Catch: java.lang.Throwable -> L86
            m2261(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.AbstractC1280.m2249(飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1287 m2250(C1287 c1287, long j, long j2) {
        while (AbstractC4394.m8914(j, j2) < 0) {
            c1287 = c1287.m2282(j);
            j++;
        }
        return c1287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2251(AbstractC1286 abstractC1286) {
        long j;
        if (f3743.m2279(abstractC1286.mo2200())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC1286.mo2200());
        sb.append(", disposed=");
        sb.append(abstractC1286.f3760);
        sb.append(", applied=");
        C1271 c1271 = abstractC1286 instanceof C1271 ? (C1271) abstractC1286 : null;
        sb.append(c1271 != null ? Boolean.valueOf(c1271.f3695) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f3744) {
            C1290 c1290 = f3741;
            j = c1290.f3775 > 0 ? ((long[]) c1290.f3773)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap m2252(long j, C1271 c1271, C1287 c1287) {
        long[] jArr;
        C1287 c12872;
        long[] jArr2;
        C1287 c12873;
        int i;
        int i2;
        AbstractC1255 abstractC1255M2255;
        C0235 c0235Mo2211 = c1271.mo2211();
        if (c0235Mo2211 != null) {
            long jMo2200 = c1271.mo2200();
            C1287 c1287M2278 = c1271.mo2194().m2282(jMo2200).m2278(c1271.f3701);
            Object[] objArr = c0235Mo2211.f1000;
            long[] jArr3 = c0235Mo2211.f1001;
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
                                InterfaceC1257 interfaceC1257 = (InterfaceC1257) objArr[(i3 << 3) + i6];
                                AbstractC1255 abstractC1255Mo2183 = interfaceC1257.mo2183();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                AbstractC1255 abstractC1255M22552 = m2255(abstractC1255Mo2183, j, c1287);
                                if (abstractC1255M22552 == null || (abstractC1255M2255 = m2255(abstractC1255Mo2183, jMo2200, c1287M2278)) == null || abstractC1255M22552.equals(abstractC1255M2255)) {
                                    c12873 = c1287M2278;
                                } else {
                                    c12873 = c1287M2278;
                                    AbstractC1255 abstractC1255M22553 = m2255(abstractC1255Mo2183, jMo2200, c1271.mo2194());
                                    if (abstractC1255M22553 == null) {
                                        m2262();
                                        throw null;
                                    }
                                    AbstractC1255 abstractC1255Mo2190 = interfaceC1257.mo2190(abstractC1255M2255, abstractC1255M22552, abstractC1255M22553);
                                    if (abstractC1255Mo2190 == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC1255M22552, abstractC1255Mo2190);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c12873 = c1287M2278;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            c1287M2278 = c12873;
                        }
                        jArr = jArr3;
                        c12872 = c1287M2278;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c12872 = c1287M2278;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    c1287M2278 = c12872;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2253() {
        m2249(f3746);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final AbstractC1255 m2254(AbstractC1255 abstractC1255, InterfaceC1257 interfaceC1257) {
        AbstractC1255 abstractC1255M2255;
        AbstractC1286 abstractC1286M2270 = m2270();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2270.mo2193();
        if (interfaceC6557Mo2193 != null) {
            interfaceC6557Mo2193.invoke(interfaceC1257);
        }
        AbstractC1255 abstractC1255M22552 = m2255(abstractC1255, abstractC1286M2270.mo2200(), abstractC1286M2270.mo2194());
        if (abstractC1255M22552 != null) {
            return abstractC1255M22552;
        }
        synchronized (f3744) {
            AbstractC1286 abstractC1286M22702 = m2270();
            AbstractC1255 abstractC1255Mo2183 = interfaceC1257.mo2183();
            abstractC1255Mo2183.getClass();
            abstractC1255M2255 = m2255(abstractC1255Mo2183, abstractC1286M22702.mo2200(), abstractC1286M22702.mo2194());
            if (abstractC1255M2255 == null) {
                m2262();
                throw null;
            }
        }
        return abstractC1255M2255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final AbstractC1255 m2255(AbstractC1255 abstractC1255, long j, C1287 c1287) {
        AbstractC1255 abstractC12552 = null;
        while (abstractC1255 != null) {
            long j2 = abstractC1255.f3646;
            if (j2 != 0 && AbstractC4394.m8914(j2, j) <= 0 && !c1287.m2279(j2) && (abstractC12552 == null || AbstractC4394.m8914(abstractC12552.f3646, abstractC1255.f3646) < 0)) {
                abstractC12552 = abstractC1255;
            }
            abstractC1255 = abstractC1255.f3645;
        }
        if (abstractC12552 != null) {
            return abstractC12552;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final AbstractC1255 m2256(AbstractC1255 abstractC1255, InterfaceC1257 interfaceC1257, AbstractC1286 abstractC1286) {
        AbstractC1255 abstractC1255M2255;
        if (abstractC1286.mo2192()) {
            abstractC1286.mo2198(interfaceC1257);
        }
        long jMo2200 = abstractC1286.mo2200();
        AbstractC1255 abstractC1255M22552 = m2255(abstractC1255, jMo2200, abstractC1286.mo2194());
        if (abstractC1255M22552 == null) {
            m2262();
            throw null;
        }
        if (abstractC1255M22552.f3646 == abstractC1286.mo2200()) {
            return abstractC1255M22552;
        }
        synchronized (f3744) {
            abstractC1255M2255 = m2255(interfaceC1257.mo2183(), jMo2200, abstractC1286.mo2194());
            if (abstractC1255M2255 == null) {
                m2262();
                throw null;
            }
            if (abstractC1255M2255.f3646 != jMo2200) {
                AbstractC1255 abstractC1255M2260 = m2260(abstractC1255M2255, interfaceC1257);
                abstractC1255M2260.mo2187(abstractC1255M2255);
                abstractC1255M2260.f3646 = abstractC1286.mo2200();
                abstractC1255M2255 = abstractC1255M2260;
            }
        }
        if (abstractC1255M22552.f3646 != 1) {
            abstractC1286.mo2198(interfaceC1257);
        }
        return abstractC1255M2255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m2257(int i) {
        C1290 c1290 = f3741;
        int i2 = ((int[]) c1290.f3772)[i];
        c1290.m2283(i2, c1290.f3775 - 1);
        c1290.f3775--;
        long[] jArr = (long[]) c1290.f3773;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (AbstractC4394.m8914(jArr[i4], j) <= 0) {
                break;
            }
            c1290.m2283(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c1290.f3773;
        int i5 = c1290.f3775 >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c1290.f3775 && AbstractC4394.m8914(jArr2[i6], jArr2[i7]) < 0) {
                if (AbstractC4394.m8914(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c1290.m2283(i6, i2);
                i2 = i6;
            } else {
                if (AbstractC4394.m8914(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c1290.m2283(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c1290.f3772)[i] = c1290.f3774;
        c1290.f3774 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Object m2258(C1272 c1272, InterfaceC6557 interfaceC6557) {
        long j = c1272.f3761;
        Object objInvoke = interfaceC6557.invoke(f3743.m2280(j));
        long j2 = f3742;
        f3742 = 1 + j2;
        C1287 c1287M2280 = f3743.m2280(j);
        f3743 = c1287M2280;
        c1272.f3761 = j2;
        c1272.f3762 = c1287M2280;
        c1272.f3697 = 0;
        c1272.f3696 = null;
        c1272.m2276();
        f3743 = f3743.m2282(j2);
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m2259(AbstractC1286 abstractC1286, InterfaceC1257 interfaceC1257) {
        abstractC1286.mo2208(abstractC1286.mo2213() + 1);
        InterfaceC6557 interfaceC6557Mo2203 = abstractC1286.mo2203();
        if (interfaceC6557Mo2203 != null) {
            interfaceC6557Mo2203.invoke(interfaceC1257);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.snapshots.AbstractC1255 m2260(androidx.compose.runtime.snapshots.AbstractC1255 r10, androidx.compose.runtime.snapshots.InterfaceC1257 r11) {
        /*
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r0 = r11.mo2183()
            long r1 = androidx.compose.runtime.snapshots.AbstractC1280.f3742
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏哲兰世 r3 = androidx.compose.runtime.snapshots.AbstractC1280.f3741
            int r4 = r3.f3775
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f3773
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f3646
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = kotlin.jvm.internal.AbstractC4394.m8914(r5, r1)
            if (r7 > 0) goto L48
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲 r7 = androidx.compose.runtime.snapshots.C1287.f3763
            boolean r5 = r7.m2279(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f3646
            long r5 = r4.f3646
            int r1 = kotlin.jvm.internal.AbstractC4394.m8914(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r0 = r0.f3645
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f3646 = r0
            return r3
        L55:
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r10 = r10.mo2186(r0)
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r0 = r11.mo2183()
            r10.f3645 = r0
            r11.mo2184(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.AbstractC1280.m2260(androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏, androidx.compose.runtime.snapshots.飘花落叶言子世楪哲兰苏):androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final void m2261(InterfaceC1257 interfaceC1257) {
        if (m2264(interfaceC1257)) {
            C0137 c0137 = f3748;
            int i = c0137.f596;
            int iIdentityHashCode = System.identityHashCode(interfaceC1257);
            int i2 = -1;
            if (i > 0) {
                int i3 = c0137.f596 - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c0137.f595)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        C1247 c1247 = ((C1247[]) c0137.f594)[i5];
                        if (interfaceC1257 == (c1247 != null ? c1247.get() : null)) {
                            i2 = i5;
                        } else {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) c0137.f595)[i7] == iIdentityHashCode; i7--) {
                                C1247 c12472 = ((C1247[]) c0137.f594)[i7];
                                if ((c12472 != null ? c12472.get() : null) == interfaceC1257) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = c0137.f596;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(c0137.f596 + 1);
                                    break;
                                } else {
                                    if (((int[]) c0137.f595)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    C1247 c12473 = ((C1247[]) c0137.f594)[i5];
                                    if ((c12473 != null ? c12473.get() : null) == interfaceC1257) {
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
            C1247[] c1247Arr = (C1247[]) c0137.f594;
            int length = c1247Arr.length;
            if (i == length) {
                int i10 = length * 2;
                C1247[] c1247Arr2 = new C1247[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(c1247Arr, i9, c1247Arr2, i11, i - i9);
                System.arraycopy((C1247[]) c0137.f594, 0, c1247Arr2, 0, i9);
                AbstractC4346.m8842(i11, i9, i, (int[]) c0137.f595, iArr);
                AbstractC4346.m8838(0, i9, 6, (int[]) c0137.f595, iArr);
                c0137.f594 = c1247Arr2;
                c0137.f595 = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(c1247Arr, i9, c1247Arr, i12, i - i9);
                int[] iArr2 = (int[]) c0137.f595;
                AbstractC4346.m8842(i12, i9, i, iArr2, iArr2);
            }
            ((C1247[]) c0137.f594)[i9] = new C1247(interfaceC1257);
            ((int[]) c0137.f595)[i9] = iIdentityHashCode;
            c0137.f596++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final void m2262() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final AbstractC1255 m2263(AbstractC1255 abstractC1255, AbstractC1256 abstractC1256, AbstractC1286 abstractC1286, AbstractC1255 abstractC12552) {
        AbstractC1255 abstractC1255M2260;
        if (abstractC1286.mo2192()) {
            abstractC1286.mo2198(abstractC1256);
        }
        long jMo2200 = abstractC1286.mo2200();
        if (abstractC12552.f3646 == jMo2200) {
            return abstractC12552;
        }
        synchronized (f3744) {
            abstractC1255M2260 = m2260(abstractC1255, abstractC1256);
        }
        abstractC1255M2260.f3646 = jMo2200;
        if (abstractC12552.f3646 != 1) {
            abstractC1286.mo2198(abstractC1256);
        }
        return abstractC1255M2260;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m2264(InterfaceC1257 interfaceC1257) {
        AbstractC1255 abstractC1255;
        long j = f3742;
        C1290 c1290 = f3741;
        if (c1290.f3775 > 0) {
            j = ((long[]) c1290.f3773)[0];
        }
        AbstractC1255 abstractC12552 = null;
        AbstractC1255 abstractC1255Mo2183 = null;
        int i = 0;
        for (AbstractC1255 abstractC1255Mo21832 = interfaceC1257.mo2183(); abstractC1255Mo21832 != null; abstractC1255Mo21832 = abstractC1255Mo21832.f3645) {
            long j2 = abstractC1255Mo21832.f3646;
            if (j2 != 0) {
                if (AbstractC4394.m8914(j2, j) >= 0) {
                    i++;
                } else if (abstractC12552 == null) {
                    i++;
                    abstractC12552 = abstractC1255Mo21832;
                } else {
                    if (AbstractC4394.m8914(abstractC1255Mo21832.f3646, abstractC12552.f3646) < 0) {
                        abstractC1255 = abstractC12552;
                        abstractC12552 = abstractC1255Mo21832;
                    } else {
                        abstractC1255 = abstractC1255Mo21832;
                    }
                    if (abstractC1255Mo2183 == null) {
                        abstractC1255Mo2183 = interfaceC1257.mo2183();
                        AbstractC1255 abstractC12553 = abstractC1255Mo2183;
                        while (true) {
                            if (abstractC1255Mo2183 == null) {
                                abstractC1255Mo2183 = abstractC12553;
                                break;
                            }
                            if (AbstractC4394.m8914(abstractC1255Mo2183.f3646, j) >= 0) {
                                break;
                            }
                            if (AbstractC4394.m8914(abstractC12553.f3646, abstractC1255Mo2183.f3646) < 0) {
                                abstractC12553 = abstractC1255Mo2183;
                            }
                            abstractC1255Mo2183 = abstractC1255Mo2183.f3645;
                        }
                    }
                    abstractC12552.f3646 = 0L;
                    abstractC12552.mo2187(abstractC1255Mo2183);
                    abstractC12552 = abstractC1255;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC1255 m2265(AbstractC1255 abstractC1255) {
        AbstractC1255 abstractC1255M2255;
        AbstractC1286 abstractC1286M2270 = m2270();
        AbstractC1255 abstractC1255M22552 = m2255(abstractC1255, abstractC1286M2270.mo2200(), abstractC1286M2270.mo2194());
        if (abstractC1255M22552 != null) {
            return abstractC1255M22552;
        }
        synchronized (f3744) {
            AbstractC1286 abstractC1286M22702 = m2270();
            abstractC1255M2255 = m2255(abstractC1255, abstractC1286M22702.mo2200(), abstractC1286M22702.mo2194());
        }
        if (abstractC1255M2255 != null) {
            return abstractC1255M2255;
        }
        m2262();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AbstractC1286 m2266(AbstractC1286 abstractC1286, InterfaceC6557 interfaceC6557, boolean z) {
        boolean z2 = abstractC1286 instanceof C1271;
        if (z2 || abstractC1286 == null) {
            return new C1262(z2 ? (C1271) abstractC1286 : null, interfaceC6557, null, false, z);
        }
        return new C1261(abstractC1286, interfaceC6557, false, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC6557 m2267(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, boolean z) {
        if (!z) {
            interfaceC65572 = null;
        }
        return (interfaceC6557 == null || interfaceC65572 == null || interfaceC6557 == interfaceC65572) ? interfaceC6557 == null ? interfaceC65572 : interfaceC6557 : new C1288(interfaceC6557, interfaceC65572, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC6557 m2268(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        return (interfaceC6557 == null || interfaceC65572 == null || interfaceC6557 == interfaceC65572) ? interfaceC6557 == null ? interfaceC65572 : interfaceC6557 : new C1288(interfaceC6557, interfaceC65572, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final AbstractC1255 m2269(AbstractC1255 abstractC1255, AbstractC1286 abstractC1286) {
        AbstractC1255 abstractC1255M2255;
        AbstractC1255 abstractC1255M22552 = m2255(abstractC1255, abstractC1286.mo2200(), abstractC1286.mo2194());
        if (abstractC1255M22552 != null) {
            return abstractC1255M22552;
        }
        synchronized (f3744) {
            abstractC1255M2255 = m2255(abstractC1255, abstractC1286.mo2200(), abstractC1286.mo2194());
        }
        if (abstractC1255M2255 != null) {
            return abstractC1255M2255;
        }
        m2262();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final AbstractC1286 m2270() {
        AbstractC1286 abstractC1286 = (AbstractC1286) f3745.m391();
        return abstractC1286 == null ? f3751 : abstractC1286;
    }
}
