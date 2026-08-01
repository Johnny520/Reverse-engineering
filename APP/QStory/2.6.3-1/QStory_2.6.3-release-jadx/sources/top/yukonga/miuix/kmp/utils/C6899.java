package top.yukonga.miuix.kmp.utils;

import androidx.compose.p001ui.input.nestedscroll.C2451;
import androidx.compose.p001ui.input.nestedscroll.C2454;
import androidx.compose.p001ui.input.nestedscroll.InterfaceC2455;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2586;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.C2700;
import androidx.compose.p001ui.platform.InterfaceC2683;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.collections.AbstractC5171;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import p128.C8158;
import p221.C8731;
import p221.C8732;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.basic.AbstractC6848;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6899 extends AbstractC2623 implements InterfaceC2618, InterfaceC2608, InterfaceC2455 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC8725 f16938;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC2683 f16939;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public float f16940;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public float f16942;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public float f16943;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C6249 f16944;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f16948 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f16947 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2454 f16946 = new C2454();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C6878 f16945 = new C6878();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final float f16941 = 1.0f;

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo3546(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f6624) {
            return 0L;
        }
        float fAbs = Math.abs(this.f16940);
        float f = this.f16941;
        boolean z = fAbs > f;
        if (m11980().m11988() != z) {
            m11980().m11987(z);
        }
        if (AbstractC2620.m3916(this, AbstractC6848.f16785) != null) {
            C3775.m6954();
            return 0L;
        }
        C2454 c2454 = this.f16946;
        if (i != 1) {
            return c2454.m3552(i, j);
        }
        C6249 c6249 = this.f16944;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        long jM3552 = this.f16947 ? c2454.m3552(i, j) : 0L;
        long jM13085 = C8158.m13085(j, jM3552);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f16948 ? jM13085 & 4294967295L : jM13085 >> 32));
        if (Math.abs(this.f16940) <= f || Math.signum(fIntBitsToFloat) == Math.signum(this.f16943)) {
            return jM3552;
        }
        if (Math.signum(fIntBitsToFloat) == Math.signum(this.f16943)) {
            m11981(fIntBitsToFloat);
            if (this.f16948) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3552 >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jM3552 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat4);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
            }
        } else {
            float f2 = Math.abs(this.f16943) <= Math.abs(fIntBitsToFloat) ? -this.f16943 : fIntBitsToFloat;
            if (Math.abs(this.f16943) <= Math.abs(fIntBitsToFloat)) {
                m11984();
            } else {
                m11981(f2);
            }
            if (this.f16948) {
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jM3552 >> 32));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jM3552 & 4294967295L)) + f2;
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat6);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat7);
            } else {
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jM3552 >> 32)) + f2;
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (jM3552 & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
            }
        }
        return (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C6903 m11980() {
        return (C6903) AbstractC2620.m3916(this, AbstractC6894.f16928);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m11981(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16943 + f;
        this.f16943 = f2;
        float f3 = this.f16942;
        float fM5631 = AbstractC3400.m5631(f2, -f3, f3);
        this.f16943 = fM5631;
        float fMin = Math.min(Math.abs(fM5631) / this.f16942, 1.0f);
        float f4 = this.f16942;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11985(Math.signum(this.f16943) * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m11982(float f) {
        if (Math.abs(this.f16940) <= this.f16941 && f == 0.0f) {
            m11984();
            return;
        }
        C6249 c6249 = this.f16944;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        this.f16944 = AbstractC6231.m11036(m4427(), null, null, new OverscrollNode$startSpringAnimation$1(this, f, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m11983() {
        InterfaceC8725 interfaceC8725 = (InterfaceC8725) AbstractC2620.m3916(this, AbstractC2737.f5933);
        InterfaceC2683 interfaceC2683 = (InterfaceC2683) AbstractC2620.m3916(this, AbstractC2737.f5925);
        if (AbstractC5227.m9466(interfaceC8725, this.f16938) && AbstractC5227.m9466(interfaceC2683, this.f16939)) {
            return;
        }
        this.f16938 = interfaceC8725;
        this.f16939 = interfaceC2683;
        this.f16942 = this.f16948 ? interfaceC8725.mo1904(C8732.m13913(((C2700) interfaceC2683).m4044())) : interfaceC8725.mo1904(C8732.m13912(((C2700) interfaceC2683).m4044()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m11984() {
        m11985(0.0f);
        this.f16943 = 0.0f;
        if (this.f6624) {
            m11980().m11987(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m11985(float f) {
        if (this.f16940 == f) {
            return;
        }
        this.f16940 = f;
        if (this.f6624) {
            C2583 c2583M3906 = AbstractC2620.m3906(this);
            C2586 c2586 = C2583.f5434;
            c2583M3906.m3785(false);
        }
    }

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1814(long j, long j2, int i) {
        if (!this.f6624) {
            return 0L;
        }
        boolean z = Math.abs(this.f16940) > this.f16941;
        if (m11980().m11988() != z) {
            m11980().m11987(z);
        }
        if (AbstractC2620.m3916(this, AbstractC6848.f16785) != null) {
            C3775.m6954();
            return 0L;
        }
        if (i != 1) {
            return this.f16946.m3554(j, j2, i);
        }
        C6249 c6249 = this.f16944;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        long jM3554 = this.f16947 ? this.f16946.m3554(j, j2, i) : 0L;
        long jM13085 = C8158.m13085(j2, jM3554);
        m11981(Float.intBitsToFloat((int) (this.f16948 ? jM13085 & 4294967295L : jM13085 >> 32)));
        if (this.f16948) {
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM3554 >> 32)))) << 32);
        }
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM3554 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)))) << 32);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        m11984();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        m11983();
        m3924(new C2451(this, this.f16946));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        interfaceC2490.getClass();
        m11983();
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C6898(abstractC2559Mo3615, 3, this));
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
    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3549(long j, InterfaceC5189 interfaceC5189) {
        OverscrollNode$onPreFling$1 overscrollNode$onPreFling$1;
        long j2;
        if (interfaceC5189 instanceof OverscrollNode$onPreFling$1) {
            overscrollNode$onPreFling$1 = (OverscrollNode$onPreFling$1) interfaceC5189;
            int i = overscrollNode$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overscrollNode$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                overscrollNode$onPreFling$1 = new OverscrollNode$onPreFling$1(this, interfaceC5189);
            }
        }
        Object objM3553 = overscrollNode$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = overscrollNode$onPreFling$1.label;
        float f = this.f16941;
        if (i2 == 0) {
            AbstractC6017.m10769(objM3553);
            j2 = 0;
            if (!this.f6624) {
                return new C8731(0L);
            }
            ?? r6 = Math.abs(this.f16940) <= f ? 0 : 1;
            if (m11980().m11988() != r6) {
                m11980().m11987(r6);
            }
            if (AbstractC2620.m3916(this, AbstractC6848.f16785) != null) {
                C3775.m6954();
                return null;
            }
            C6249 c6249 = this.f16944;
            if (c6249 != null) {
                c6249.mo10815(null);
            }
            if (this.f16947) {
                overscrollNode$onPreFling$1.J$0 = j;
                overscrollNode$onPreFling$1.I$0 = r6;
                overscrollNode$onPreFling$1.label = 2;
                objM3553 = this.f16946.m3553(j, overscrollNode$onPreFling$1);
                if (objM3553 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            long jM13908 = C8731.m13908(j, j2);
            float fM13909 = !this.f16948 ? C8731.m13909(jM13908) : C8731.m13910(jM13908);
            if (Math.abs(this.f16940) > f) {
                return new C8731(j2);
            }
            if (Math.signum(fM13909) == Math.signum(this.f16940)) {
                m11982(fM13909);
                return new C8731(C8731.m13907(j2, this.f16948 ? AbstractC3738.m6871(0.0f, C8731.m13909(jM13908)) : AbstractC3738.m6871(C8731.m13910(jM13908), 0.0f)));
            }
            m11982(fM13909);
            return new C8731(C8731.m13907(j2, this.f16948 ? AbstractC3738.m6871(0.0f, C8731.m13909(jM13908) / 2.13333f) : AbstractC3738.m6871(C8731.m13910(jM13908) / 2.13333f, 0.0f)));
        }
        if (i2 == 1) {
            AbstractC6017.m10769(objM3553);
            return objM3553;
        }
        if (i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = overscrollNode$onPreFling$1.J$0;
        AbstractC6017.m10769(objM3553);
        j2 = ((C8731) objM3553).f22216;
        long jM139082 = C8731.m13908(j, j2);
        if (!this.f16948) {
        }
        if (Math.abs(this.f16940) > f) {
        }
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
    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1815(long j, long j2, ContinuationImpl continuationImpl) {
        OverscrollNode$onPostFling$1 overscrollNode$onPostFling$1;
        long j3;
        if (continuationImpl instanceof OverscrollNode$onPostFling$1) {
            overscrollNode$onPostFling$1 = (OverscrollNode$onPostFling$1) continuationImpl;
            int i = overscrollNode$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overscrollNode$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                overscrollNode$onPostFling$1 = new OverscrollNode$onPostFling$1(this, continuationImpl);
            }
        }
        OverscrollNode$onPostFling$1 overscrollNode$onPostFling$12 = overscrollNode$onPostFling$1;
        Object objM3555 = overscrollNode$onPostFling$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = overscrollNode$onPostFling$12.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM3555);
            j3 = 0;
            if (!this.f6624) {
                return new C8731(0L);
            }
            ?? r4 = Math.abs(this.f16940) <= this.f16941 ? 0 : 1;
            if (m11980().m11988() != r4) {
                m11980().m11987(r4);
            }
            if (AbstractC2620.m3916(this, AbstractC6848.f16785) != null) {
                C3775.m6954();
                return null;
            }
            C6249 c6249 = this.f16944;
            if (c6249 != null) {
                c6249.mo10815(null);
            }
            if (!this.f16947) {
                long jM13908 = C8731.m13908(j2, j3);
                float fM13909 = (!this.f16948 ? C8731.m13909(jM13908) : C8731.m13910(jM13908)) / 1.53333f;
                m11982(fM13909);
                return new C8731(C8731.m13907(j3, !this.f16948 ? AbstractC3738.m6871(0.0f, fM13909) : AbstractC3738.m6871(fM13909, 0.0f)));
            }
            overscrollNode$onPostFling$12.J$0 = j;
            overscrollNode$onPostFling$12.J$1 = j2;
            overscrollNode$onPostFling$12.I$0 = r4;
            overscrollNode$onPostFling$12.label = 2;
            objM3555 = this.f16946.m3555(j, j2, overscrollNode$onPostFling$12);
            if (objM3555 == coroutineSingletons) {
                return coroutineSingletons;
            }
            j2 = j2;
        } else {
            if (i2 == 1) {
                AbstractC6017.m10769(objM3555);
                return objM3555;
            }
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = overscrollNode$onPostFling$12.J$1;
            AbstractC6017.m10769(objM3555);
        }
        j3 = ((C8731) objM3555).f22216;
        long jM139082 = C8731.m13908(j2, j3);
        float fM139092 = (!this.f16948 ? C8731.m13909(jM139082) : C8731.m13910(jM139082)) / 1.53333f;
        m11982(fM139092);
        return new C8731(C8731.m13907(j3, !this.f16948 ? AbstractC3738.m6871(0.0f, fM139092) : AbstractC3738.m6871(fM139092, 0.0f)));
    }
}
