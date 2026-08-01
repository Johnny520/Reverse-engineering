package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.input.nestedscroll.C1616;
import androidx.compose.ui.input.nestedscroll.C1619;
import androidx.compose.ui.input.nestedscroll.InterfaceC1620;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.C1865;
import androidx.compose.ui.platform.InterfaceC1848;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.C2942;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import p112.C7329;
import p205.C7903;
import p205.InterfaceC7896;
import top.yukonga.miuix.kmp.basic.AbstractC6018;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6070 extends AbstractC1788 implements InterfaceC1783, InterfaceC1773, InterfaceC1620 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC7896 f16593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1848 f16594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public float f16595;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public float f16597;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public float f16598;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C5417 f16599;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f16603 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f16602 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1619 f16601 = new C1619();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C6049 f16600 = new C6049();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final float f16596 = 1.0f;

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo2986(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f6279) {
            return 0L;
        }
        float fAbs = Math.abs(this.f16595);
        float f = this.f16596;
        boolean z = fAbs > f;
        if (m11421().m11429() != z) {
            m11421().m11428(z);
        }
        if (AbstractC1785.m3356(this, AbstractC6018.f16440) != null) {
            C2942.m6394();
            return 0L;
        }
        C1619 c1619 = this.f16601;
        if (i != 1) {
            return c1619.m2992(i, j);
        }
        C5417 c5417 = this.f16599;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        long jM2992 = this.f16602 ? c1619.m2992(i, j) : 0L;
        long jM12526 = C7329.m12526(j, jM2992);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f16603 ? jM12526 & 4294967295L : jM12526 >> 32));
        if (Math.abs(this.f16595) <= f || Math.signum(fIntBitsToFloat) == Math.signum(this.f16598)) {
            return jM2992;
        }
        if (Math.signum(fIntBitsToFloat) == Math.signum(this.f16598)) {
            m11422(fIntBitsToFloat);
            if (this.f16603) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2992 >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jM2992 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat4);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
            }
        } else {
            float f2 = Math.abs(this.f16598) <= Math.abs(fIntBitsToFloat) ? -this.f16598 : fIntBitsToFloat;
            if (Math.abs(this.f16598) <= Math.abs(fIntBitsToFloat)) {
                m11425();
            } else {
                m11422(f2);
            }
            if (this.f16603) {
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jM2992 >> 32));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jM2992 & 4294967295L)) + f2;
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat6);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat7);
            } else {
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jM2992 >> 32)) + f2;
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (jM2992 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
            }
        }
        return (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C6074 m11421() {
        return (C6074) AbstractC1785.m3356(this, AbstractC6065.f16583);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m11422(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16598 + f;
        this.f16598 = f2;
        float f3 = this.f16597;
        float fM5071 = AbstractC2567.m5071(f2, -f3, f3);
        this.f16598 = fM5071;
        float fMin = Math.min(Math.abs(fM5071) / this.f16597, 1.0f);
        float f4 = this.f16597;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11426(Math.signum(this.f16598) * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m11423(float f) {
        if (Math.abs(this.f16595) <= this.f16596 && f == 0.0f) {
            m11425();
            return;
        }
        C5417 c5417 = this.f16599;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        this.f16599 = AbstractC5399.m10477(m3867(), null, null, new OverscrollNode$startSpringAnimation$1(this, f, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m11424() {
        InterfaceC7896 interfaceC7896 = (InterfaceC7896) AbstractC1785.m3356(this, AbstractC1902.f5588);
        InterfaceC1848 interfaceC1848 = (InterfaceC1848) AbstractC1785.m3356(this, AbstractC1902.f5580);
        if (AbstractC4395.m8907(interfaceC7896, this.f16593) && AbstractC4395.m8907(interfaceC1848, this.f16594)) {
            return;
        }
        this.f16593 = interfaceC7896;
        this.f16594 = interfaceC1848;
        this.f16597 = this.f16603 ? interfaceC7896.mo1344(C7903.m13354(((C1865) interfaceC1848).m3484())) : interfaceC7896.mo1344(C7903.m13353(((C1865) interfaceC1848).m3484()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m11425() {
        m11426(0.0f);
        this.f16598 = 0.0f;
        if (this.f6279) {
            m11421().m11428(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m11426(float f) {
        if (this.f16595 == f) {
            return;
        }
        this.f16595 = f;
        if (this.f6279) {
            C1748 c1748M3346 = AbstractC1785.m3346(this);
            C1751 c1751 = C1748.f5089;
            c1748M3346.m3225(false);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1254(long j, long j2, int i) {
        if (!this.f6279) {
            return 0L;
        }
        boolean z = Math.abs(this.f16595) > this.f16596;
        if (m11421().m11429() != z) {
            m11421().m11428(z);
        }
        if (AbstractC1785.m3356(this, AbstractC6018.f16440) != null) {
            C2942.m6394();
            return 0L;
        }
        if (i != 1) {
            return this.f16601.m2994(j, j2, i);
        }
        C5417 c5417 = this.f16599;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        long jM2994 = this.f16602 ? this.f16601.m2994(j, j2, i) : 0L;
        long jM12526 = C7329.m12526(j2, jM2994);
        m11422(Float.intBitsToFloat((int) (this.f16603 ? jM12526 & 4294967295L : jM12526 >> 32)));
        if (this.f16603) {
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM2994 >> 32)))) << 32);
        }
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM2994 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)))) << 32);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        m11425();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        m11424();
        m3364(new C1616(this, this.f16601));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        m11424();
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C6069(abstractC1724Mo3055, 3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2989(long r10, kotlin.coroutines.InterfaceC4357 r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6070.mo2989(long, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1255(long r10, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof top.yukonga.miuix.kmp.utils.OverscrollNode$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r14
            top.yukonga.miuix.kmp.utils.OverscrollNode$onPostFling$1 r0 = (top.yukonga.miuix.kmp.utils.OverscrollNode$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            top.yukonga.miuix.kmp.utils.OverscrollNode$onPostFling$1 r0 = new top.yukonga.miuix.kmp.utils.OverscrollNode$onPostFling$1
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r12 = r6.J$1
            kotlin.AbstractC5185.m10210(r14)
            goto L8e
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r2
        L35:
            kotlin.AbstractC5185.m10210(r14)
            return r14
        L39:
            kotlin.AbstractC5185.m10210(r14)
            boolean r14 = r9.f6279
            r7 = 0
            if (r14 != 0) goto L48
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r9 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r9.<init>(r7)
            return r9
        L48:
            float r14 = r9.f16595
            float r14 = java.lang.Math.abs(r14)
            float r1 = r9.f16596
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 <= 0) goto L55
            goto L56
        L55:
            r4 = 0
        L56:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲兰苏世 r14 = r9.m11421()
            boolean r14 = r14.m11429()
            if (r14 == r4) goto L67
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲兰苏世 r14 = r9.m11421()
            r14.m11428(r4)
        L67:
            androidx.compose.runtime.飘花落叶言子楪兰世苏哲 r14 = top.yukonga.miuix.kmp.basic.AbstractC6018.f16440
            java.lang.Object r14 = androidx.compose.ui.node.AbstractC1785.m3356(r9, r14)
            if (r14 != 0) goto Lc4
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r14 = r9.f16599
            if (r14 == 0) goto L76
            r14.mo10256(r2)
        L76:
            boolean r14 = r9.f16602
            if (r14 == 0) goto L93
            r6.J$0 = r10
            r6.J$1 = r12
            r6.I$0 = r4
            r6.label = r3
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r1 = r9.f16601
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.m2995(r2, r4, r6)
            if (r14 != r0) goto L8d
            return r0
        L8d:
            r12 = r4
        L8e:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r14 = (p205.C7902) r14
            long r7 = r14.f21871
            goto L94
        L93:
            r4 = r12
        L94:
            long r10 = p205.C7902.m13349(r12, r7)
            boolean r12 = r9.f16603
            if (r12 == 0) goto La1
            float r10 = p205.C7902.m13350(r10)
            goto La5
        La1:
            float r10 = p205.C7902.m13351(r10)
        La5:
            r11 = 1069827112(0x3fc44428, float:1.53333)
            float r10 = r10 / r11
            r9.m11423(r10)
            boolean r9 = r9.f16603
            r11 = 0
            if (r9 == 0) goto Lb6
            long r9 = com.alibaba.fastjson2.AbstractC2905.m6311(r11, r10)
            goto Lba
        Lb6:
            long r9 = com.alibaba.fastjson2.AbstractC2905.m6311(r10, r11)
        Lba:
            long r9 = p205.C7902.m13348(r7, r9)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r11 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r11.<init>(r9)
            return r11
        Lc4:
            com.alibaba.fastjson2.C2942.m6394()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6070.mo1255(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
