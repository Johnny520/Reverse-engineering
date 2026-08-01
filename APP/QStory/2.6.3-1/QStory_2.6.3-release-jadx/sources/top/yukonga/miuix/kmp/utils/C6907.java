package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1922;
import androidx.compose.foundation.gestures.C1343;
import androidx.compose.foundation.gestures.C1351;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p128.C8158;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6907 implements InterfaceC1922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f16957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f16958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f16959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6910 f16960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f16961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f16962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C6910 f16963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C6910 f16964;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f16967;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC6284 f16968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C6906 f16969;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC6284 f16971;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6878 f16966 = new C6878();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6878 f16970 = new C6878();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C6911 f16965 = new C6911(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11989(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16957;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f16958 + f;
        this.f16958 = f3;
        float fM5631 = AbstractC3400.m5631(f3, -f2, f2);
        this.f16958 = fM5631;
        float fMin = Math.min(Math.abs(fM5631) / this.f16957, 1.0f);
        float fSignum = Math.signum(this.f16958);
        float f4 = this.f16957;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11991(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11990(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16967;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f16959 + f;
        this.f16959 = f3;
        float fM5631 = AbstractC3400.m5631(f3, -f2, f2);
        this.f16959 = fM5631;
        float fMin = Math.min(Math.abs(fM5631) / this.f16967, 1.0f);
        float fSignum = Math.signum(this.f16959);
        float f4 = this.f16967;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11992(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2515(long j, int i, C1351 c1351) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        c1351.getClass();
        C1343 c1343 = (C1343) c1351.f1855;
        if (i != 1) {
            C8158 c8158 = new C8158(c1343.m1825(c1343.f1841, j, c1343.f1844));
            m11993();
            return c8158.f19886;
        }
        C6910 c6910 = this.f16964;
        if (c6910 != null) {
            c6910.invoke();
        }
        InterfaceC6284 interfaceC6284 = this.f16968;
        if (interfaceC6284 != null) {
            interfaceC6284.mo10815(null);
        }
        InterfaceC6284 interfaceC62842 = this.f16971;
        if (interfaceC62842 != null) {
            interfaceC62842.mo10815(null);
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        if (Math.abs(this.f16961) <= 1.0f || Float.intBitsToFloat(i2) == 0.0f || Math.signum(Float.intBitsToFloat(i2)) == Math.signum(this.f16958)) {
            fIntBitsToFloat = 0.0f;
        } else {
            float fIntBitsToFloat4 = Math.abs(this.f16958) <= Math.abs(Float.intBitsToFloat(i2)) ? -this.f16958 : Float.intBitsToFloat(i2);
            if (Math.abs(this.f16958) <= Math.abs(Float.intBitsToFloat(i2))) {
                m11991(0.0f);
                this.f16958 = 0.0f;
                float f = fIntBitsToFloat4;
                fIntBitsToFloat3 = Float.intBitsToFloat(i2) - fIntBitsToFloat4;
                fIntBitsToFloat = f;
            } else {
                m11989(fIntBitsToFloat4);
                fIntBitsToFloat = Float.intBitsToFloat(i2);
                fIntBitsToFloat3 = 0.0f;
            }
        }
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        if (Math.abs(this.f16962) <= 1.0f || Float.intBitsToFloat(i3) == 0.0f || Math.signum(Float.intBitsToFloat(i3)) == Math.signum(this.f16959)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            float fIntBitsToFloat6 = Math.abs(this.f16959) <= Math.abs(Float.intBitsToFloat(i3)) ? -this.f16959 : Float.intBitsToFloat(i3);
            if (Math.abs(this.f16959) <= Math.abs(Float.intBitsToFloat(i3))) {
                m11992(0.0f);
                this.f16959 = 0.0f;
                float f2 = fIntBitsToFloat6;
                fIntBitsToFloat5 = Float.intBitsToFloat(i3) - fIntBitsToFloat6;
                fIntBitsToFloat2 = f2;
            } else {
                m11990(fIntBitsToFloat6);
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                fIntBitsToFloat5 = 0.0f;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        long j2 = new C8158(c1343.m1825(c1343.f1841, jFloatToRawIntBits, c1343.f1844)).f19886;
        long jM13085 = C8158.m13085(jFloatToRawIntBits, j2);
        int i4 = (int) (jM13085 & 4294967295L);
        if (Float.intBitsToFloat(i4) != 0.0f) {
            m11989(Float.intBitsToFloat(i4));
        }
        int i5 = (int) (jM13085 >> 32);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            m11990(Float.intBitsToFloat(i5));
        }
        m11993();
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat + (Float.intBitsToFloat(i4) != 0.0f ? Float.intBitsToFloat(i4) : 0.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 >> 32)) + fIntBitsToFloat2) + (Float.intBitsToFloat(i5) == 0.0f ? 0.0f : Float.intBitsToFloat(i5)))) << 32);
    }

    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo2516() {
        return Math.abs(this.f16962) > 1.0f || Math.abs(this.f16961) > 1.0f;
    }

    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2622 mo2517() {
        return this.f16965;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.compose.foundation.InterfaceC1922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2518(long j, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        MiuixOverscrollEffect$applyToFling$1 miuixOverscrollEffect$applyToFling$1;
        long jM6871;
        long jM68712;
        int i;
        long j2;
        if (continuationImpl instanceof MiuixOverscrollEffect$applyToFling$1) {
            miuixOverscrollEffect$applyToFling$1 = (MiuixOverscrollEffect$applyToFling$1) continuationImpl;
            int i2 = miuixOverscrollEffect$applyToFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                miuixOverscrollEffect$applyToFling$1.label = i2 - Integer.MIN_VALUE;
            } else {
                miuixOverscrollEffect$applyToFling$1 = new MiuixOverscrollEffect$applyToFling$1(this, continuationImpl);
            }
        }
        Object objInvoke = miuixOverscrollEffect$applyToFling$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = miuixOverscrollEffect$applyToFling$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(objInvoke);
            int i4 = Math.abs(this.f16961) > 1.0f ? 1 : 0;
            int i5 = Math.abs(this.f16962) > 1.0f ? 1 : 0;
            C6910 c6910 = this.f16964;
            if (c6910 != null) {
                c6910.invoke();
            }
            InterfaceC6284 interfaceC6284 = this.f16968;
            if (interfaceC6284 != null) {
                interfaceC6284.mo10815(null);
            }
            InterfaceC6284 interfaceC62842 = this.f16971;
            if (interfaceC62842 != null) {
                interfaceC62842.mo10815(null);
            }
            if (i4 == 0 || C8731.m13909(j) == 0.0f) {
                jM6871 = j;
            } else if (Math.signum(C8731.m13909(j)) == Math.signum(this.f16961)) {
                m11995(C8731.m13909(j));
                jM6871 = AbstractC3738.m6871(C8731.m13910(j), 0.0f);
            } else {
                m11995(C8731.m13909(j));
                jM6871 = AbstractC3738.m6871(C8731.m13910(j), C8731.m13909(j) / 2.13333f);
            }
            if (i5 == 0 || C8731.m13910(j) == 0.0f) {
                jM68712 = jM6871;
            } else if (Math.signum(C8731.m13910(j)) == Math.signum(this.f16962)) {
                m11994(C8731.m13910(j));
                jM68712 = AbstractC3738.m6871(0.0f, C8731.m13909(jM6871));
            } else {
                m11994(C8731.m13910(j));
                jM68712 = AbstractC3738.m6871(C8731.m13910(j) / 2.13333f, C8731.m13909(jM6871));
            }
            Object c8731 = new C8731(jM68712);
            miuixOverscrollEffect$applyToFling$1.L$0 = null;
            miuixOverscrollEffect$applyToFling$1.J$0 = j;
            miuixOverscrollEffect$applyToFling$1.I$0 = i4;
            miuixOverscrollEffect$applyToFling$1.I$1 = i5;
            miuixOverscrollEffect$applyToFling$1.I$2 = 0;
            miuixOverscrollEffect$applyToFling$1.J$1 = jM68712;
            miuixOverscrollEffect$applyToFling$1.label = 1;
            objInvoke = interfaceC7383.invoke(c8731, miuixOverscrollEffect$applyToFling$1);
            if (objInvoke == obj) {
                return obj;
            }
            i = 0;
            j2 = jM68712;
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = miuixOverscrollEffect$applyToFling$1.J$1;
            i = miuixOverscrollEffect$applyToFling$1.I$2;
            AbstractC6017.m10769(objInvoke);
        }
        long jM13908 = C8731.m13908(j2, ((C8731) objInvoke).f22216);
        if (i == 0) {
            m11995(C8731.m13909(jM13908) / 1.53333f);
        }
        m11994(C8731.m13910(jM13908) / 1.53333f);
        m11993();
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11991(float f) {
        if (this.f16961 == f) {
            return;
        }
        this.f16961 = f;
        C6910 c6910 = this.f16960;
        if (c6910 != null) {
            c6910.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11992(float f) {
        if (this.f16962 == f) {
            return;
        }
        this.f16962 = f;
        C6910 c6910 = this.f16960;
        if (c6910 != null) {
            c6910.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11993() {
        C6903 c6903;
        boolean zMo2516;
        C6910 c6910 = this.f16963;
        if (c6910 == null || (c6903 = (C6903) c6910.invoke()) == null || c6903.m11988() == (zMo2516 = mo2516())) {
            return;
        }
        c6903.m11987(zMo2516);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11994(float f) {
        if (Math.abs(this.f16962) <= 1.0f && f == 0.0f) {
            m11992(0.0f);
            this.f16959 = 0.0f;
            return;
        }
        InterfaceC6284 interfaceC6284 = this.f16971;
        if (interfaceC6284 != null) {
            interfaceC6284.mo10815(null);
        }
        C6906 c6906 = this.f16969;
        this.f16971 = c6906 != null ? (InterfaceC6284) c6906.invoke(new MiuixOverscrollEffect$startSpringAnimationX$1(this, f, null)) : null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11995(float f) {
        if (Math.abs(this.f16961) <= 1.0f && f == 0.0f) {
            m11991(0.0f);
            this.f16958 = 0.0f;
            return;
        }
        InterfaceC6284 interfaceC6284 = this.f16968;
        if (interfaceC6284 != null) {
            interfaceC6284.mo10815(null);
        }
        C6906 c6906 = this.f16969;
        this.f16968 = c6906 != null ? (InterfaceC6284) c6906.invoke(new MiuixOverscrollEffect$startSpringAnimationY$1(this, f, null)) : null;
    }
}
