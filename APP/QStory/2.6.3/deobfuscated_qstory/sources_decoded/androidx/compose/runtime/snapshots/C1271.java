package androidx.compose.runtime.snapshots;

import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.runtime.AbstractC1392;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1271 extends AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final int[] f3693 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6558 f3694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6558 f3695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f3696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C0235 f3697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3698;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int[] f3699;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3700;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ArrayList f3701;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1287 f3702;

    public C1271(long j, C1287 c1287, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        super(j, c1287);
        this.f3695 = interfaceC6558;
        this.f3694 = interfaceC65582;
        this.f3702 = C1287.f3764;
        this.f3699 = f3693;
        this.f3700 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public C1271 mo2215(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        C1270 c1270;
        if (this.f3761) {
            AbstractC1392.m2538("Cannot use a disposed snapshot");
        }
        if (this.f3696 && this.f3760 < 0) {
            AbstractC1392.m2537("Unsupported operation on a disposed or applied snapshot");
        }
        m2226(mo2210());
        Object obj = AbstractC1280.f3745;
        synchronized (obj) {
            long j = AbstractC1280.f3743;
            AbstractC1280.f3743 = j + 1;
            AbstractC1280.f3744 = AbstractC1280.f3744.m2292(j);
            C1287 c1287Mo2204 = mo2204();
            mo2222(c1287Mo2204.m2292(j));
            c1270 = new C1270(j, AbstractC1280.m2260(c1287Mo2204, mo2210() + 1, j), AbstractC1280.m2277(interfaceC6558, mo2203(), true), AbstractC1280.m2278(interfaceC65582, mo2213()), this);
        }
        if (this.f3696 || this.f3761) {
            return c1270;
        }
        long jMo2210 = mo2210();
        synchronized (obj) {
            long j2 = AbstractC1280.f3743;
            AbstractC1280.f3743 = j2 + 1;
            mo2219(j2);
            AbstractC1280.f3744 = AbstractC1280.f3744.m2292(mo2210());
        }
        mo2222(AbstractC1280.m2260(mo2204(), jMo2210 + 1, mo2210()));
        return c1270;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo2216(C0235 c0235) {
        this.f3697 = c0235;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2226(long j) {
        synchronized (AbstractC1280.f3745) {
            this.f3702 = this.f3702.m2292(j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC1274 m2227(long j, C0235 c0235, HashMap map, C1287 c1287) {
        ArrayList arrayList;
        ArrayList arrayListM8793;
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
        AbstractC1255 abstractC1255Mo2200;
        C1287 c1287M2288 = mo2204().m2292(mo2210()).m2288(this.f3702);
        Object[] objArr3 = c0235.f1000;
        long[] jArr3 = c0235.f1001;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListM8793 = null;
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
                            AbstractC1255 abstractC1255Mo2193 = interfaceC1257.mo2193();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC1255 abstractC1255M2265 = AbstractC1280.m2265(abstractC1255Mo2193, j, c1287);
                            if (abstractC1255M2265 == null) {
                                arrayList3 = arrayListM8793;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListM8793;
                                j2 = j3;
                                AbstractC1255 abstractC1255M22652 = AbstractC1280.m2265(abstractC1255Mo2193, mo2210(), c1287M2288);
                                if (abstractC1255M22652 != null && abstractC1255M22652.f3647 != 1 && !abstractC1255M2265.equals(abstractC1255M22652)) {
                                    c12873 = c1287M2288;
                                    AbstractC1255 abstractC1255M22653 = AbstractC1280.m2265(abstractC1255Mo2193, mo2210(), mo2204());
                                    if (abstractC1255M22653 == null) {
                                        AbstractC1280.m2272();
                                        throw null;
                                    }
                                    if (map == null || (abstractC1255Mo2200 = (AbstractC1255) map.get(abstractC1255M2265)) == null) {
                                        abstractC1255Mo2200 = interfaceC1257.mo2200(abstractC1255M22652, abstractC1255M2265, abstractC1255M22653);
                                    }
                                    if (abstractC1255Mo2200 == null) {
                                        return new C1285(this);
                                    }
                                    if (!abstractC1255Mo2200.equals(abstractC1255M22653)) {
                                        if (abstractC1255Mo2200.equals(abstractC1255M2265)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new Pair(interfaceC1257, abstractC1255M2265.mo2196(mo2210())));
                                            arrayListM8793 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListM8793.add(interfaceC1257);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!abstractC1255Mo2200.equals(abstractC1255M22652) ? new Pair(interfaceC1257, abstractC1255Mo2200) : new Pair(interfaceC1257, abstractC1255M22652.mo2196(mo2210())));
                                        }
                                    }
                                    arrayListM8793 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListM8793 = arrayList3;
                            }
                            c12873 = c1287M2288;
                            arrayList2 = arrayList4;
                            arrayListM8793 = arrayList3;
                        } else {
                            c12873 = c1287M2288;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c1287M2288 = c12873;
                    }
                    c12872 = c1287M2288;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    c12872 = c1287M2288;
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
                c1287M2288 = c12872;
            }
        } else {
            arrayList = null;
            arrayListM8793 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m2229();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                InterfaceC1257 interfaceC12572 = (InterfaceC1257) pair.component1();
                AbstractC1255 abstractC1255 = (AbstractC1255) pair.component2();
                abstractC1255.f3647 = j;
                synchronized (AbstractC1280.f3745) {
                    abstractC1255.f3646 = interfaceC12572.mo2193();
                    interfaceC12572.mo2194(abstractC1255);
                }
            }
        }
        if (arrayListM8793 != null) {
            int size2 = arrayListM8793.size();
            for (int i6 = 0; i6 < size2; i6++) {
                c0235.m746((InterfaceC1257) arrayListM8793.get(i6));
            }
            ArrayList arrayList6 = this.f3701;
            if (arrayList6 != null) {
                arrayListM8793 = AbstractC4344.m8793(arrayListM8793, arrayList6);
            }
            this.f3701 = arrayListM8793;
        }
        return C1289.f3772;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: merged with bridge method [inline-methods] */
    public InterfaceC6558 mo2203() {
        return this.f3695;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo2202() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo2205() {
        if (this.f3761) {
            return;
        }
        this.f3761 = true;
        synchronized (AbstractC1280.f3745) {
            m2286();
        }
        mo2212();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2228() {
        AbstractC1280.f3744 = AbstractC1280.f3744.m2290(mo2210()).m2291(this.f3702);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo2218(int i) {
        this.f3698 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.AbstractC1274 mo2220() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1271.mo2220():androidx.compose.runtime.snapshots.飘花落叶言子楪兰世苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public C0235 mo2221() {
        return this.f3697;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public AbstractC1286 mo2206(InterfaceC6558 interfaceC6558) {
        C1269 c1269;
        if (this.f3761) {
            AbstractC1392.m2538("Cannot use a disposed snapshot");
        }
        if (this.f3696 && this.f3760 < 0) {
            AbstractC1392.m2537("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo2210 = mo2210();
        m2226(mo2210());
        Object obj = AbstractC1280.f3745;
        synchronized (obj) {
            long j = AbstractC1280.f3743;
            AbstractC1280.f3743 = j + 1;
            AbstractC1280.f3744 = AbstractC1280.f3744.m2292(j);
            c1269 = new C1269(j, AbstractC1280.m2260(mo2204(), jMo2210 + 1, j), AbstractC1280.m2277(interfaceC6558, mo2203(), true), this);
        }
        if (this.f3696 || this.f3761) {
            return c1269;
        }
        long jMo22102 = mo2210();
        synchronized (obj) {
            long j2 = AbstractC1280.f3743;
            AbstractC1280.f3743 = j2 + 1;
            mo2219(j2);
            AbstractC1280.f3744 = AbstractC1280.f3744.m2292(mo2210());
        }
        mo2222(AbstractC1280.m2260(mo2204(), jMo22102 + 1, mo2210()));
        return c1269;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2229() {
        m2226(mo2210());
        if (this.f3696 || this.f3761) {
            return;
        }
        long jMo2210 = mo2210();
        synchronized (AbstractC1280.f3745) {
            long j = AbstractC1280.f3743;
            AbstractC1280.f3743 = j + 1;
            mo2219(j);
            AbstractC1280.f3744 = AbstractC1280.f3744.m2292(mo2210());
        }
        mo2222(AbstractC1280.m2260(mo2204(), jMo2210 + 1, mo2210()));
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo2208(InterfaceC1257 interfaceC1257) {
        C0235 c0235Mo2221 = mo2221();
        if (c0235Mo2221 == null) {
            C0235 c0235 = AbstractC0285.f997;
            c0235Mo2221 = new C0235();
            mo2216(c0235Mo2221);
        }
        c0235Mo2221.m741(interfaceC1257);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo2209() {
        if (this.f3696 || this.f3761) {
            return;
        }
        m2229();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo2230() {
        int length = this.f3699.length;
        for (int i = 0; i < length; i++) {
            AbstractC1280.m2267(this.f3699[i]);
        }
        m2286();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo2223() {
        return this.f3698;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo2211() {
        this.f3700++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2212() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f3700
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            androidx.compose.runtime.AbstractC1392.m2538(r1)
        Lc:
            int r1 = r0.f3700
            int r1 = r1 + (-1)
            r0.f3700 = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f3696
            if (r1 != 0) goto L94
            androidx.collection.飘花落叶言子世兰楪哲苏 r1 = r0.mo2221()
            if (r1 == 0) goto L91
            boolean r2 = r0.f3696
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            androidx.compose.runtime.AbstractC1392.m2537(r2)
        L27:
            r2 = 0
            r0.mo2216(r2)
            long r2 = r0.mo2210()
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
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r13 = r13.mo2193()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f3647
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰世哲 r6 = r0.f3702
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.AbstractC4344.m8806(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            androidx.compose.foundation.text.飘花落叶言子苏世楪兰哲 r6 = androidx.compose.runtime.snapshots.AbstractC1280.f3747
            r14 = 0
            r13.f3647 = r14
        L83:
            androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏 r13 = r13.f3646
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
            r0.m2285()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1271.mo2212():void");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC6558 mo2213() {
        return this.f3694;
    }
}
