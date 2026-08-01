package androidx.compose.runtime.snapshots;

import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.runtime.AbstractC1392;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C1271 extends AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final int[] f3692 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6557 f3693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 f3694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f3695;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C0235 f3696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int[] f3698;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3699;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ArrayList f3700;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1287 f3701;

    public C1271(long j, C1287 c1287, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        super(j, c1287);
        this.f3694 = interfaceC6557;
        this.f3693 = interfaceC65572;
        this.f3701 = C1287.f3763;
        this.f3698 = f3692;
        this.f3699 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public C1271 mo2205(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        C1270 c1270;
        if (this.f3760) {
            AbstractC1392.m2528("Cannot use a disposed snapshot");
        }
        if (this.f3695 && this.f3759 < 0) {
            AbstractC1392.m2527("Unsupported operation on a disposed or applied snapshot");
        }
        m2216(mo2200());
        Object obj = AbstractC1280.f3744;
        synchronized (obj) {
            long j = AbstractC1280.f3742;
            AbstractC1280.f3742 = j + 1;
            AbstractC1280.f3743 = AbstractC1280.f3743.m2282(j);
            C1287 c1287Mo2194 = mo2194();
            mo2212(c1287Mo2194.m2282(j));
            c1270 = new C1270(j, AbstractC1280.m2250(c1287Mo2194, mo2200() + 1, j), AbstractC1280.m2267(interfaceC6557, mo2193(), true), AbstractC1280.m2268(interfaceC65572, mo2203()), this);
        }
        if (this.f3695 || this.f3760) {
            return c1270;
        }
        long jMo2200 = mo2200();
        synchronized (obj) {
            long j2 = AbstractC1280.f3742;
            AbstractC1280.f3742 = j2 + 1;
            mo2209(j2);
            AbstractC1280.f3743 = AbstractC1280.f3743.m2282(mo2200());
        }
        mo2212(AbstractC1280.m2250(mo2194(), jMo2200 + 1, mo2200()));
        return c1270;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo2206(C0235 c0235) {
        this.f3696 = c0235;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2216(long j) {
        synchronized (AbstractC1280.f3744) {
            this.f3701 = this.f3701.m2282(j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC1274 m2217(long j, C0235 c0235, HashMap map, C1287 c1287) {
        ArrayList arrayList;
        ArrayList arrayListM8825;
        ArrayList arrayList2;
        C1287 c12872;
        Object[] objArr;
        long[] jArr;
        C1287 c12873;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        AbstractC1255 abstractC1255Mo2190;
        C1287 c1287M2278 = mo2194().m2282(mo2200()).m2278(this.f3701);
        Object[] objArr3 = c0235.f1000;
        long[] jArr3 = c0235.f1001;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListM8825 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC1257 interfaceC1257 = (InterfaceC1257) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            AbstractC1255 abstractC1255Mo2183 = interfaceC1257.mo2183();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC1255 abstractC1255M2255 = AbstractC1280.m2255(abstractC1255Mo2183, j, c1287);
                            if (abstractC1255M2255 == null) {
                                arrayList3 = arrayListM8825;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListM8825;
                                j2 = j3;
                                AbstractC1255 abstractC1255M22552 = AbstractC1280.m2255(abstractC1255Mo2183, mo2200(), c1287M2278);
                                if (abstractC1255M22552 != null && abstractC1255M22552.f3646 != 1 && !abstractC1255M2255.equals(abstractC1255M22552)) {
                                    c12873 = c1287M2278;
                                    AbstractC1255 abstractC1255M22553 = AbstractC1280.m2255(abstractC1255Mo2183, mo2200(), mo2194());
                                    if (abstractC1255M22553 == null) {
                                        AbstractC1280.m2262();
                                        throw null;
                                    }
                                    if (map == null || (abstractC1255Mo2190 = (AbstractC1255) map.get(abstractC1255M2255)) == null) {
                                        abstractC1255Mo2190 = interfaceC1257.mo2190(abstractC1255M22552, abstractC1255M2255, abstractC1255M22553);
                                    }
                                    if (abstractC1255Mo2190 == null) {
                                        return new C1285(this);
                                    }
                                    if (!abstractC1255Mo2190.equals(abstractC1255M22553)) {
                                        if (abstractC1255Mo2190.equals(abstractC1255M2255)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new Pair(interfaceC1257, abstractC1255M2255.mo2186(mo2200())));
                                            arrayListM8825 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListM8825.add(interfaceC1257);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!abstractC1255Mo2190.equals(abstractC1255M22552) ? new Pair(interfaceC1257, abstractC1255Mo2190) : new Pair(interfaceC1257, abstractC1255M22552.mo2186(mo2200())));
                                        }
                                    }
                                    arrayListM8825 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListM8825 = arrayList3;
                            }
                            c12873 = c1287M2278;
                            arrayList2 = arrayList4;
                            arrayListM8825 = arrayList3;
                        } else {
                            c12873 = c1287M2278;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c1287M2278 = c12873;
                    }
                    c12872 = c1287M2278;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    c12872 = c1287M2278;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                c1287M2278 = c12872;
            }
        } else {
            arrayList = null;
            arrayListM8825 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m2219();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                InterfaceC1257 interfaceC12572 = (InterfaceC1257) pair.component1();
                AbstractC1255 abstractC1255 = (AbstractC1255) pair.component2();
                abstractC1255.f3646 = j;
                synchronized (AbstractC1280.f3744) {
                    abstractC1255.f3645 = interfaceC12572.mo2183();
                    interfaceC12572.mo2184(abstractC1255);
                }
            }
        }
        if (arrayListM8825 != null) {
            int size2 = arrayListM8825.size();
            for (int i6 = 0; i6 < size2; i6++) {
                c0235.m745((InterfaceC1257) arrayListM8825.get(i6));
            }
            ArrayList arrayList6 = this.f3700;
            if (arrayList6 != null) {
                arrayListM8825 = AbstractC4343.m8825(arrayListM8825, arrayList6);
            }
            this.f3700 = arrayListM8825;
        }
        return C1289.f3771;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: merged with bridge method [inline-methods] */
    public InterfaceC6557 mo2193() {
        return this.f3694;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo2192() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo2195() {
        if (this.f3760) {
            return;
        }
        this.f3760 = true;
        synchronized (AbstractC1280.f3744) {
            m2276();
        }
        mo2202();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2218() {
        AbstractC1280.f3743 = AbstractC1280.f3743.m2280(mo2200()).m2281(this.f3701);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo2208(int i) {
        this.f3697 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.AbstractC1274 mo2210() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1271.mo2210():androidx.compose.runtime.snapshots.飘花落叶言子楪兰世苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public C0235 mo2211() {
        return this.f3696;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public AbstractC1286 mo2196(InterfaceC6557 interfaceC6557) {
        C1269 c1269;
        if (this.f3760) {
            AbstractC1392.m2528("Cannot use a disposed snapshot");
        }
        if (this.f3695 && this.f3759 < 0) {
            AbstractC1392.m2527("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo2200 = mo2200();
        m2216(mo2200());
        Object obj = AbstractC1280.f3744;
        synchronized (obj) {
            long j = AbstractC1280.f3742;
            AbstractC1280.f3742 = j + 1;
            AbstractC1280.f3743 = AbstractC1280.f3743.m2282(j);
            c1269 = new C1269(j, AbstractC1280.m2250(mo2194(), jMo2200 + 1, j), AbstractC1280.m2267(interfaceC6557, mo2193(), true), this);
        }
        if (this.f3695 || this.f3760) {
            return c1269;
        }
        long jMo22002 = mo2200();
        synchronized (obj) {
            long j2 = AbstractC1280.f3742;
            AbstractC1280.f3742 = j2 + 1;
            mo2209(j2);
            AbstractC1280.f3743 = AbstractC1280.f3743.m2282(mo2200());
        }
        mo2212(AbstractC1280.m2250(mo2194(), jMo22002 + 1, mo2200()));
        return c1269;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2219() {
        m2216(mo2200());
        if (this.f3695 || this.f3760) {
            return;
        }
        long jMo2200 = mo2200();
        synchronized (AbstractC1280.f3744) {
            long j = AbstractC1280.f3742;
            AbstractC1280.f3742 = j + 1;
            mo2209(j);
            AbstractC1280.f3743 = AbstractC1280.f3743.m2282(mo2200());
        }
        mo2212(AbstractC1280.m2250(mo2194(), jMo2200 + 1, mo2200()));
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo2198(InterfaceC1257 interfaceC1257) {
        C0235 c0235Mo2211 = mo2211();
        if (c0235Mo2211 == null) {
            C0235 c0235 = AbstractC0285.f997;
            c0235Mo2211 = new C0235();
            mo2206(c0235Mo2211);
        }
        c0235Mo2211.m740(interfaceC1257);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo2199() {
        if (this.f3695 || this.f3760) {
            return;
        }
        m2219();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo2220() {
        int length = this.f3698.length;
        for (int i = 0; i < length; i++) {
            AbstractC1280.m2257(this.f3698[i]);
        }
        m2276();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo2213() {
        return this.f3697;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo2201() {
        this.f3699++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2202() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f3699
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            androidx.compose.runtime.AbstractC1392.m2528(r1)
        Lc:
            int r1 = r0.f3699
            int r1 = r1 + (-1)
            r0.f3699 = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f3695
            if (r1 != 0) goto L94
            androidx.collection.飘花落叶言子世兰楪哲苏 r1 = r0.mo2211()
            if (r1 == 0) goto L91
            boolean r2 = r0.f3695
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            androidx.compose.runtime.AbstractC1392.m2527(r2)
        L27:
            r2 = 0
            r0.mo2206(r2)
            long r2 = r0.mo2200()
            java.lang.Object[] r4 = r1.f1000
            long[] r1 = r1.f1001
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            androidx.compose.runtime.snapshots.飘花落叶言子世楪哲兰苏 r13 = (androidx.compose.runtime.snapshots.InterfaceC1257) r13
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r13 = r13.mo2183()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f3646
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲 r6 = r0.f3701
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.AbstractC4343.m8789(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            androidx.compose.foundation.text.飘花落叶言子苏世楪兰哲 r6 = androidx.compose.runtime.snapshots.AbstractC1280.f3746
            r14 = 0
            r13.f3646 = r14
        L83:
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r13 = r13.f3645
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.m2275()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1271.mo2202():void");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC6557 mo2203() {
        return this.f3693;
    }
}
