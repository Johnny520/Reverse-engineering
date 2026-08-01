package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0137;
import androidx.collection.C0235;
import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C1247;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1290 f3742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long f3743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C1287 f3744;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static List f3748;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0137 f3749;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AtomicInt f3750;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static List f3751;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1272 f3752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0995 f3747 = new C0995(12);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0108 f3746 = new C0108(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f3745 = new Object();

    static {
        C1287 c1287 = C1287.f3764;
        f3744 = c1287;
        f3743 = 2L;
        C1290 c1290 = new C1290();
        c1290.f3774 = new long[16];
        c1290.f3777 = new int[16];
        int[] iArr = new int[16];
        char c = 0;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        c1290.f3773 = iArr;
        f3742 = c1290;
        C0137 c0137 = new C0137(2, c);
        c0137.f595 = new int[16];
        c0137.f594 = new C1247[16];
        f3749 = c0137;
        EmptyList emptyList = EmptyList.INSTANCE;
        f3748 = emptyList;
        f3751 = emptyList;
        long j = f3743;
        f3743 = 1 + j;
        C1272 c1272 = new C1272(j, c1287, null, new C0995(11));
        f3744 = f3744.m2292(c1272.f3762);
        f3752 = c1272;
        f3750 = new AtomicInt(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2258() {
        C0137 c0137 = f3749;
        int i = c0137.f596;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C1247 c1247 = ((C1247[]) c0137.f594)[i2];
            Object obj = c1247 != null ? c1247.get() : null;
            if (obj != null && m2274((InterfaceC1257) obj)) {
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
    public static final java.lang.Object m2259(p052.InterfaceC6558 r15) {
        /*
            androidx.compose.runtime.snapshots.飘花落叶言子楪世苏哲兰 r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3752
            java.lang.Object r1 = androidx.compose.runtime.snapshots.AbstractC1280.f3745
            monitor-enter(r1)
            androidx.collection.飘花落叶言子世兰楪哲苏 r2 = r0.f3697     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            androidx.compose.runtime.internal.AtomicInt r3 = androidx.compose.runtime.snapshots.AbstractC1280.f3750     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.add(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = m2268(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.util.List r4 = androidx.compose.runtime.snapshots.AbstractC1280.f3748     // Catch: java.lang.Throwable -> L36
            androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏 r5 = new androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6554) r8     // Catch: java.lang.Throwable -> L36
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3750
            r0.add(r3)
            goto L44
        L3e:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3750
            r0.add(r3)
            throw r15
        L44:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3745
            monitor-enter(r0)
            m2258()     // Catch: java.lang.Throwable -> L86
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
            m2271(r11)     // Catch: java.lang.Throwable -> L86
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.AbstractC1280.m2259(飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1287 m2260(C1287 c1287, long j, long j2) {
        while (AbstractC4395.m8904(j, j2) < 0) {
            c1287 = c1287.m2292(j);
            j++;
        }
        return c1287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2261(AbstractC1286 abstractC1286) {
        long j;
        if (f3744.m2289(abstractC1286.mo2210())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC1286.mo2210());
        sb.append(", disposed=");
        sb.append(abstractC1286.f3761);
        sb.append(", applied=");
        C1271 c1271 = abstractC1286 instanceof C1271 ? (C1271) abstractC1286 : null;
        sb.append(c1271 != null ? Boolean.valueOf(c1271.f3696) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f3745) {
            C1290 c1290 = f3742;
            j = c1290.f3776 > 0 ? ((long[]) c1290.f3774)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap m2262(long j, C1271 c1271, C1287 c1287) {
        long[] jArr;
        C1287 c12872;
        long[] jArr2;
        C1287 c12873;
        int i;
        int i2;
        AbstractC1255 abstractC1255M2265;
        C0235 c0235Mo2221 = c1271.mo2221();
        if (c0235Mo2221 != null) {
            long jMo2210 = c1271.mo2210();
            C1287 c1287M2288 = c1271.mo2204().m2292(jMo2210).m2288(c1271.f3702);
            Object[] objArr = c0235Mo2221.f1000;
            long[] jArr3 = c0235Mo2221.f1001;
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
                                AbstractC1255 abstractC1255Mo2193 = interfaceC1257.mo2193();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                AbstractC1255 abstractC1255M22652 = m2265(abstractC1255Mo2193, j, c1287);
                                if (abstractC1255M22652 == null || (abstractC1255M2265 = m2265(abstractC1255Mo2193, jMo2210, c1287M2288)) == null || abstractC1255M22652.equals(abstractC1255M2265)) {
                                    c12873 = c1287M2288;
                                } else {
                                    c12873 = c1287M2288;
                                    AbstractC1255 abstractC1255M22653 = m2265(abstractC1255Mo2193, jMo2210, c1271.mo2204());
                                    if (abstractC1255M22653 == null) {
                                        m2272();
                                        throw null;
                                    }
                                    AbstractC1255 abstractC1255Mo2200 = interfaceC1257.mo2200(abstractC1255M2265, abstractC1255M22652, abstractC1255M22653);
                                    if (abstractC1255Mo2200 == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC1255M22652, abstractC1255Mo2200);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c12873 = c1287M2288;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            c1287M2288 = c12873;
                        }
                        jArr = jArr3;
                        c12872 = c1287M2288;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c12872 = c1287M2288;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    c1287M2288 = c12872;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2263() {
        m2259(f3747);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final AbstractC1255 m2264(AbstractC1255 abstractC1255, InterfaceC1257 interfaceC1257) {
        AbstractC1255 abstractC1255M2265;
        AbstractC1286 abstractC1286M2280 = m2280();
        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2280.mo2203();
        if (interfaceC6558Mo2203 != null) {
            interfaceC6558Mo2203.invoke(interfaceC1257);
        }
        AbstractC1255 abstractC1255M22652 = m2265(abstractC1255, abstractC1286M2280.mo2210(), abstractC1286M2280.mo2204());
        if (abstractC1255M22652 != null) {
            return abstractC1255M22652;
        }
        synchronized (f3745) {
            AbstractC1286 abstractC1286M22802 = m2280();
            AbstractC1255 abstractC1255Mo2193 = interfaceC1257.mo2193();
            abstractC1255Mo2193.getClass();
            abstractC1255M2265 = m2265(abstractC1255Mo2193, abstractC1286M22802.mo2210(), abstractC1286M22802.mo2204());
            if (abstractC1255M2265 == null) {
                m2272();
                throw null;
            }
        }
        return abstractC1255M2265;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final AbstractC1255 m2265(AbstractC1255 abstractC1255, long j, C1287 c1287) {
        AbstractC1255 abstractC12552 = null;
        while (abstractC1255 != null) {
            long j2 = abstractC1255.f3647;
            if (j2 != 0 && AbstractC4395.m8904(j2, j) <= 0 && !c1287.m2289(j2) && (abstractC12552 == null || AbstractC4395.m8904(abstractC12552.f3647, abstractC1255.f3647) < 0)) {
                abstractC12552 = abstractC1255;
            }
            abstractC1255 = abstractC1255.f3646;
        }
        if (abstractC12552 != null) {
            return abstractC12552;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final AbstractC1255 m2266(AbstractC1255 abstractC1255, InterfaceC1257 interfaceC1257, AbstractC1286 abstractC1286) {
        AbstractC1255 abstractC1255M2265;
        if (abstractC1286.mo2202()) {
            abstractC1286.mo2208(interfaceC1257);
        }
        long jMo2210 = abstractC1286.mo2210();
        AbstractC1255 abstractC1255M22652 = m2265(abstractC1255, jMo2210, abstractC1286.mo2204());
        if (abstractC1255M22652 == null) {
            m2272();
            throw null;
        }
        if (abstractC1255M22652.f3647 == abstractC1286.mo2210()) {
            return abstractC1255M22652;
        }
        synchronized (f3745) {
            abstractC1255M2265 = m2265(interfaceC1257.mo2193(), jMo2210, abstractC1286.mo2204());
            if (abstractC1255M2265 == null) {
                m2272();
                throw null;
            }
            if (abstractC1255M2265.f3647 != jMo2210) {
                AbstractC1255 abstractC1255M2270 = m2270(abstractC1255M2265, interfaceC1257);
                abstractC1255M2270.mo2197(abstractC1255M2265);
                abstractC1255M2270.f3647 = abstractC1286.mo2210();
                abstractC1255M2265 = abstractC1255M2270;
            }
        }
        if (abstractC1255M22652.f3647 != 1) {
            abstractC1286.mo2208(interfaceC1257);
        }
        return abstractC1255M2265;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m2267(int i) {
        C1290 c1290 = f3742;
        int i2 = ((int[]) c1290.f3773)[i];
        c1290.m2293(i2, c1290.f3776 - 1);
        c1290.f3776--;
        long[] jArr = (long[]) c1290.f3774;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (AbstractC4395.m8904(jArr[i4], j) <= 0) {
                break;
            }
            c1290.m2293(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c1290.f3774;
        int i5 = c1290.f3776 >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c1290.f3776 && AbstractC4395.m8904(jArr2[i6], jArr2[i7]) < 0) {
                if (AbstractC4395.m8904(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c1290.m2293(i6, i2);
                i2 = i6;
            } else {
                if (AbstractC4395.m8904(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c1290.m2293(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c1290.f3773)[i] = c1290.f3775;
        c1290.f3775 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Object m2268(C1272 c1272, InterfaceC6558 interfaceC6558) {
        long j = c1272.f3762;
        Object objInvoke = interfaceC6558.invoke(f3744.m2290(j));
        long j2 = f3743;
        f3743 = 1 + j2;
        C1287 c1287M2290 = f3744.m2290(j);
        f3744 = c1287M2290;
        c1272.f3762 = j2;
        c1272.f3763 = c1287M2290;
        c1272.f3698 = 0;
        c1272.f3697 = null;
        c1272.m2286();
        f3744 = f3744.m2292(j2);
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m2269(AbstractC1286 abstractC1286, InterfaceC1257 interfaceC1257) {
        abstractC1286.mo2218(abstractC1286.mo2223() + 1);
        InterfaceC6558 interfaceC6558Mo2213 = abstractC1286.mo2213();
        if (interfaceC6558Mo2213 != null) {
            interfaceC6558Mo2213.invoke(interfaceC1257);
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
    public static final androidx.compose.runtime.snapshots.AbstractC1255 m2270(androidx.compose.runtime.snapshots.AbstractC1255 r10, androidx.compose.runtime.snapshots.InterfaceC1257 r11) {
        /*
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r0 = r11.mo2193()
            long r1 = androidx.compose.runtime.snapshots.AbstractC1280.f3743
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏哲兰世 r3 = androidx.compose.runtime.snapshots.AbstractC1280.f3742
            int r4 = r3.f3776
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f3774
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
            long r5 = r0.f3647
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = kotlin.jvm.internal.AbstractC4395.m8904(r5, r1)
            if (r7 > 0) goto L48
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲 r7 = androidx.compose.runtime.snapshots.C1287.f3764
            boolean r5 = r7.m2289(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f3647
            long r5 = r4.f3647
            int r1 = kotlin.jvm.internal.AbstractC4395.m8904(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r0 = r0.f3646
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f3647 = r0
            return r3
        L55:
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r10 = r10.mo2196(r0)
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r0 = r11.mo2193()
            r10.f3646 = r0
            r11.mo2194(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.AbstractC1280.m2270(androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏, androidx.compose.runtime.snapshots.飘花落叶言子世楪哲兰苏):androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final void m2271(InterfaceC1257 interfaceC1257) {
        if (m2274(interfaceC1257)) {
            C0137 c0137 = f3749;
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
                AbstractC4347.m8836(i11, i9, i, (int[]) c0137.f595, iArr);
                AbstractC4347.m8841(0, i9, 6, (int[]) c0137.f595, iArr);
                c0137.f594 = c1247Arr2;
                c0137.f595 = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(c1247Arr, i9, c1247Arr, i12, i - i9);
                int[] iArr2 = (int[]) c0137.f595;
                AbstractC4347.m8836(i12, i9, i, iArr2, iArr2);
            }
            ((C1247[]) c0137.f594)[i9] = new C1247(interfaceC1257);
            ((int[]) c0137.f595)[i9] = iIdentityHashCode;
            c0137.f596++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final void m2272() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final AbstractC1255 m2273(AbstractC1255 abstractC1255, AbstractC1256 abstractC1256, AbstractC1286 abstractC1286, AbstractC1255 abstractC12552) {
        AbstractC1255 abstractC1255M2270;
        if (abstractC1286.mo2202()) {
            abstractC1286.mo2208(abstractC1256);
        }
        long jMo2210 = abstractC1286.mo2210();
        if (abstractC12552.f3647 == jMo2210) {
            return abstractC12552;
        }
        synchronized (f3745) {
            abstractC1255M2270 = m2270(abstractC1255, abstractC1256);
        }
        abstractC1255M2270.f3647 = jMo2210;
        if (abstractC12552.f3647 != 1) {
            abstractC1286.mo2208(abstractC1256);
        }
        return abstractC1255M2270;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m2274(InterfaceC1257 interfaceC1257) {
        AbstractC1255 abstractC1255;
        long j = f3743;
        C1290 c1290 = f3742;
        if (c1290.f3776 > 0) {
            j = ((long[]) c1290.f3774)[0];
        }
        AbstractC1255 abstractC12552 = null;
        AbstractC1255 abstractC1255Mo2193 = null;
        int i = 0;
        for (AbstractC1255 abstractC1255Mo21932 = interfaceC1257.mo2193(); abstractC1255Mo21932 != null; abstractC1255Mo21932 = abstractC1255Mo21932.f3646) {
            long j2 = abstractC1255Mo21932.f3647;
            if (j2 != 0) {
                if (AbstractC4395.m8904(j2, j) >= 0) {
                    i++;
                } else if (abstractC12552 == null) {
                    i++;
                    abstractC12552 = abstractC1255Mo21932;
                } else {
                    if (AbstractC4395.m8904(abstractC1255Mo21932.f3647, abstractC12552.f3647) < 0) {
                        abstractC1255 = abstractC12552;
                        abstractC12552 = abstractC1255Mo21932;
                    } else {
                        abstractC1255 = abstractC1255Mo21932;
                    }
                    if (abstractC1255Mo2193 == null) {
                        abstractC1255Mo2193 = interfaceC1257.mo2193();
                        AbstractC1255 abstractC12553 = abstractC1255Mo2193;
                        while (true) {
                            if (abstractC1255Mo2193 == null) {
                                abstractC1255Mo2193 = abstractC12553;
                                break;
                            }
                            if (AbstractC4395.m8904(abstractC1255Mo2193.f3647, j) >= 0) {
                                break;
                            }
                            if (AbstractC4395.m8904(abstractC12553.f3647, abstractC1255Mo2193.f3647) < 0) {
                                abstractC12553 = abstractC1255Mo2193;
                            }
                            abstractC1255Mo2193 = abstractC1255Mo2193.f3646;
                        }
                    }
                    abstractC12552.f3647 = 0L;
                    abstractC12552.mo2197(abstractC1255Mo2193);
                    abstractC12552 = abstractC1255;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC1255 m2275(AbstractC1255 abstractC1255) {
        AbstractC1255 abstractC1255M2265;
        AbstractC1286 abstractC1286M2280 = m2280();
        AbstractC1255 abstractC1255M22652 = m2265(abstractC1255, abstractC1286M2280.mo2210(), abstractC1286M2280.mo2204());
        if (abstractC1255M22652 != null) {
            return abstractC1255M22652;
        }
        synchronized (f3745) {
            AbstractC1286 abstractC1286M22802 = m2280();
            abstractC1255M2265 = m2265(abstractC1255, abstractC1286M22802.mo2210(), abstractC1286M22802.mo2204());
        }
        if (abstractC1255M2265 != null) {
            return abstractC1255M2265;
        }
        m2272();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AbstractC1286 m2276(AbstractC1286 abstractC1286, InterfaceC6558 interfaceC6558, boolean z) {
        boolean z2 = abstractC1286 instanceof C1271;
        if (z2 || abstractC1286 == null) {
            return new C1262(z2 ? (C1271) abstractC1286 : null, interfaceC6558, null, false, z);
        }
        return new C1261(abstractC1286, interfaceC6558, false, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC6558 m2277(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, boolean z) {
        if (!z) {
            interfaceC65582 = null;
        }
        return (interfaceC6558 == null || interfaceC65582 == null || interfaceC6558 == interfaceC65582) ? interfaceC6558 == null ? interfaceC65582 : interfaceC6558 : new C1288(interfaceC6558, interfaceC65582, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC6558 m2278(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        return (interfaceC6558 == null || interfaceC65582 == null || interfaceC6558 == interfaceC65582) ? interfaceC6558 == null ? interfaceC65582 : interfaceC6558 : new C1288(interfaceC6558, interfaceC65582, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final AbstractC1255 m2279(AbstractC1255 abstractC1255, AbstractC1286 abstractC1286) {
        AbstractC1255 abstractC1255M2265;
        AbstractC1255 abstractC1255M22652 = m2265(abstractC1255, abstractC1286.mo2210(), abstractC1286.mo2204());
        if (abstractC1255M22652 != null) {
            return abstractC1255M22652;
        }
        synchronized (f3745) {
            abstractC1255M2265 = m2265(abstractC1255, abstractC1286.mo2210(), abstractC1286.mo2204());
        }
        if (abstractC1255M2265 != null) {
            return abstractC1255M2265;
        }
        m2272();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final AbstractC1286 m2280() {
        AbstractC1286 abstractC1286 = (AbstractC1286) f3746.m393();
        return abstractC1286 == null ? f3752 : abstractC1286;
    }
}
