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
import com.alibaba.fastjson2.C2941;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import p000.AbstractC6087;
import p112.C7328;
import p205.C7902;
import p205.InterfaceC7895;
import top.yukonga.miuix.kmp.basic.AbstractC6012;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6064 extends AbstractC1788 implements InterfaceC1783, InterfaceC1773, InterfaceC1620 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC7895 f16584;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1848 f16585;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public float f16586;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public float f16588;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public float f16589;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C5416 f16590;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f16594 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f16593 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1619 f16592 = new C1619();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C6043 f16591 = new C6043();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final float f16587 = 1.0f;

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo2976(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f6278) {
            return 0L;
        }
        float fAbs = Math.abs(this.f16586);
        float f = this.f16587;
        boolean z = fAbs > f;
        if (m11361().m11369() != z) {
            m11361().m11368(z);
        }
        if (AbstractC1785.m3346(this, AbstractC6012.f16431) != null) {
            C2941.m6336();
            return 0L;
        }
        C1619 c1619 = this.f16592;
        if (i != 1) {
            return c1619.m2982(i, j);
        }
        C5416 c5416 = this.f16590;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        long jM2982 = this.f16593 ? c1619.m2982(i, j) : 0L;
        long jM12499 = C7328.m12499(j, jM2982);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f16594 ? jM12499 & 4294967295L : jM12499 >> 32));
        if (Math.abs(this.f16586) <= f || Math.signum(fIntBitsToFloat) == Math.signum(this.f16589)) {
            return jM2982;
        }
        if (Math.signum(fIntBitsToFloat) == Math.signum(this.f16589)) {
            m11362(fIntBitsToFloat);
            if (this.f16594) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2982 >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jM2982 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat4);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
            }
        } else {
            float f2 = Math.abs(this.f16589) <= Math.abs(fIntBitsToFloat) ? -this.f16589 : fIntBitsToFloat;
            if (Math.abs(this.f16589) <= Math.abs(fIntBitsToFloat)) {
                m11365();
            } else {
                m11362(f2);
            }
            if (this.f16594) {
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jM2982 >> 32));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jM2982 & 4294967295L)) + f2;
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat6);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat7);
            } else {
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jM2982 >> 32)) + f2;
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (jM2982 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
            }
        }
        return (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C6068 m11361() {
        return (C6068) AbstractC1785.m3346(this, AbstractC6059.f16574);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m11362(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16589 + f;
        this.f16589 = f2;
        float f3 = this.f16588;
        float fM11419 = AbstractC6087.m11419(f2, -f3, f3);
        this.f16589 = fM11419;
        float fMin = Math.min(Math.abs(fM11419) / this.f16588, 1.0f);
        float f4 = this.f16588;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11366(Math.signum(this.f16589) * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m11363(float f) {
        if (Math.abs(this.f16586) <= this.f16587 && f == 0.0f) {
            m11365();
            return;
        }
        C5416 c5416 = this.f16590;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        this.f16590 = AbstractC5398.m10473(m3857(), null, null, new OverscrollNode$startSpringAnimation$1(this, f, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m11364() {
        InterfaceC7895 interfaceC7895 = (InterfaceC7895) AbstractC1785.m3346(this, AbstractC1902.f5587);
        InterfaceC1848 interfaceC1848 = (InterfaceC1848) AbstractC1785.m3346(this, AbstractC1902.f5579);
        if (AbstractC4394.m8917(interfaceC7895, this.f16584) && AbstractC4394.m8917(interfaceC1848, this.f16585)) {
            return;
        }
        this.f16584 = interfaceC7895;
        this.f16585 = interfaceC1848;
        this.f16588 = this.f16594 ? interfaceC7895.mo1334(C7902.m13326(((C1865) interfaceC1848).m3474())) : interfaceC7895.mo1334(C7902.m13325(((C1865) interfaceC1848).m3474()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m11365() {
        m11366(0.0f);
        this.f16589 = 0.0f;
        if (this.f6278) {
            m11361().m11368(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m11366(float f) {
        if (this.f16586 == f) {
            return;
        }
        this.f16586 = f;
        if (this.f6278) {
            C1748 c1748M3336 = AbstractC1785.m3336(this);
            C1751 c1751 = C1748.f5088;
            c1748M3336.m3215(false);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1244(long j, long j2, int i) {
        if (!this.f6278) {
            return 0L;
        }
        boolean z = Math.abs(this.f16586) > this.f16587;
        if (m11361().m11369() != z) {
            m11361().m11368(z);
        }
        if (AbstractC1785.m3346(this, AbstractC6012.f16431) != null) {
            C2941.m6336();
            return 0L;
        }
        if (i != 1) {
            return this.f16592.m2984(j, j2, i);
        }
        C5416 c5416 = this.f16590;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        long jM2984 = this.f16593 ? this.f16592.m2984(j, j2, i) : 0L;
        long jM12499 = C7328.m12499(j2, jM2984);
        m11362(Float.intBitsToFloat((int) (this.f16594 ? jM12499 & 4294967295L : jM12499 >> 32)));
        if (this.f16594) {
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM2984 >> 32)))) << 32);
        }
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM2984 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)))) << 32);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        m11365();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        m11364();
        m3354(new C1616(this, this.f16592));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        m11364();
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C6063(abstractC1724Mo3045, 3, this));
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
    public final java.lang.Object mo2979(long r10, kotlin.coroutines.InterfaceC4356 r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6064.mo2979(long, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
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
    public final java.lang.Object mo1245(long r10, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
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
            kotlin.AbstractC5184.m10206(r14)
            goto L8e
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r2
        L35:
            kotlin.AbstractC5184.m10206(r14)
            return r14
        L39:
            kotlin.AbstractC5184.m10206(r14)
            boolean r14 = r9.f6278
            r7 = 0
            if (r14 != 0) goto L48
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r9 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r9.<init>(r7)
            return r9
        L48:
            float r14 = r9.f16586
            float r14 = java.lang.Math.abs(r14)
            float r1 = r9.f16587
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 <= 0) goto L55
            goto L56
        L55:
            r4 = 0
        L56:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲兰苏世 r14 = r9.m11361()
            boolean r14 = r14.m11369()
            if (r14 == r4) goto L67
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪哲兰苏世 r14 = r9.m11361()
            r14.m11368(r4)
        L67:
            androidx.compose.runtime.飘花落叶言子楪兰世苏哲 r14 = top.yukonga.miuix.kmp.basic.AbstractC6012.f16431
            java.lang.Object r14 = androidx.compose.ui.node.AbstractC1785.m3346(r9, r14)
            if (r14 != 0) goto Lc4
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r14 = r9.f16590
            if (r14 == 0) goto L76
            r14.mo10252(r2)
        L76:
            boolean r14 = r9.f16593
            if (r14 == 0) goto L93
            r6.J$0 = r10
            r6.J$1 = r12
            r6.I$0 = r4
            r6.label = r3
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r1 = r9.f16592
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.m2985(r2, r4, r6)
            if (r14 != r0) goto L8d
            return r0
        L8d:
            r12 = r4
        L8e:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r14 = (p205.C7901) r14
            long r7 = r14.f21874
            goto L94
        L93:
            r4 = r12
        L94:
            long r10 = p205.C7901.m13321(r12, r7)
            boolean r12 = r9.f16594
            if (r12 == 0) goto La1
            float r10 = p205.C7901.m13322(r10)
            goto La5
        La1:
            float r10 = p205.C7901.m13323(r10)
        La5:
            r11 = 1069827112(0x3fc44428, float:1.53333)
            float r10 = r10 / r11
            r9.m11363(r10)
            boolean r9 = r9.f16594
            r11 = 0
            if (r9 == 0) goto Lb6
            long r9 = androidx.compose.foundation.draganddrop.AbstractC0455.m1149(r11, r10)
            goto Lba
        Lb6:
            long r9 = androidx.compose.foundation.draganddrop.AbstractC0455.m1149(r10, r11)
        Lba:
            long r9 = p205.C7901.m13320(r7, r9)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r11 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r11.<init>(r9)
            return r11
        Lc4:
            com.alibaba.fastjson2.C2941.m6336()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6064.mo1245(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
