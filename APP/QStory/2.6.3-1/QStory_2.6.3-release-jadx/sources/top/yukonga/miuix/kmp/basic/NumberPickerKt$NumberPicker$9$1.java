package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.C1232;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.AbstractC1189;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1179;
import androidx.compose.animation.core.C1188;
import androidx.compose.animation.core.InterfaceC1204;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.InterfaceC2233;
import androidx.window.area.AbstractC3400;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p064.C7348;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$9$1", m556f = "NumberPicker.kt", m557l = {193, Opcodes.SUB_DOUBLE_2ADDR, Opcodes.RSUB_INT, Opcodes.SHL_INT_LIT8}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "velocity", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, m152k = 3, m153mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$9$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ int $coercedValue;
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ InterfaceC2168 $currentOnValueChange$delegate;
    final /* synthetic */ InterfaceC2232 $dragOffset$delegate;
    final /* synthetic */ C1177 $flingAnimatable;
    final /* synthetic */ InterfaceC2230 $isDragging$delegate;
    final /* synthetic */ InterfaceC2230 $isUserScrolling$delegate;
    final /* synthetic */ int $itemCount;
    final /* synthetic */ InterfaceC2233 $itemHeightPx$delegate;
    final /* synthetic */ C7348 $range;
    final /* synthetic */ boolean $wrapAround;
    /* synthetic */ float F$0;
    float F$1;
    float F$2;
    float F$3;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$9$1(C1177 c1177, boolean z, int i, int i2, C7348 c7348, int i3, InterfaceC2230 interfaceC2230, InterfaceC2233 interfaceC2233, InterfaceC2232 interfaceC2232, InterfaceC2168 interfaceC2168, InterfaceC2230 interfaceC22302, InterfaceC5189<? super NumberPickerKt$NumberPicker$9$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$flingAnimatable = c1177;
        this.$wrapAround = z;
        this.$currentIndex = i;
        this.$itemCount = i2;
        this.$range = c7348;
        this.$coercedValue = i3;
        this.$isDragging$delegate = interfaceC2230;
        this.$itemHeightPx$delegate = interfaceC2233;
        this.$dragOffset$delegate = interfaceC2232;
        this.$currentOnValueChange$delegate = interfaceC2168;
        this.$isUserScrolling$delegate = interfaceC22302;
    }

    public final Object invoke(InterfaceC6233 interfaceC6233, float f, InterfaceC5189<? super C6008> interfaceC5189) {
        NumberPickerKt$NumberPicker$9$1 numberPickerKt$NumberPicker$9$1 = new NumberPickerKt$NumberPicker$9$1(this.$flingAnimatable, this.$wrapAround, this.$currentIndex, this.$itemCount, this.$range, this.$coercedValue, this.$isDragging$delegate, this.$itemHeightPx$delegate, this.$dragOffset$delegate, this.$currentOnValueChange$delegate, this.$isUserScrolling$delegate, interfaceC5189);
        numberPickerKt$NumberPicker$9$1.F$0 = f;
        return numberPickerKt$NumberPicker$9$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x019b, code lost:
    
        if (r11.m1591(r13, r17) != r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float fM2994;
        C1179 c1179;
        C1177 c1177;
        Float f;
        Object objM1593;
        InterfaceC1204 interfaceC1204;
        float f2;
        float f3;
        C1177 c11772;
        Float f4;
        C1145 c1145M1574;
        float f5;
        float f6;
        float f7;
        int i;
        float f8 = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            this.$isDragging$delegate.setValue(Boolean.FALSE);
            if (((AbstractC2181) this.$itemHeightPx$delegate).m2992() > 0) {
                fM2994 = ((AbstractC2184) this.$dragOffset$delegate).m2994();
                ((AbstractC2184) this.$dragOffset$delegate).m2995(0.0f);
                C1177 c11773 = this.$flingAnimatable;
                Float f9 = new Float(fM2994);
                this.F$0 = f8;
                this.F$1 = fM2994;
                this.label = 1;
                if (c11773.m1591(f9, this) != coroutineSingletons) {
                    float fM2992 = (-f8) / ((AbstractC2181) this.$itemHeightPx$delegate).m2992();
                    c1179 = new C1179(new C1232(1));
                    if (!this.$wrapAround) {
                    }
                    c1177 = this.$flingAnimatable;
                    f = new Float(fM2992);
                    this.L$0 = null;
                    this.F$0 = f8;
                    this.F$1 = fM2994;
                    this.F$2 = fM2992;
                    this.label = 2;
                    objM1593 = c1177.m1593();
                    interfaceC1204 = c1177.f1474;
                    if (c1177.m1592(new C1188(c1179, interfaceC1204, objM1593, (AbstractC1189) interfaceC1204.mo1622().invoke(f)), f, null, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
        if (i2 == 1) {
            fM2994 = this.F$1;
            AbstractC6017.m10769(obj);
            float fM29922 = (-f8) / ((AbstractC2181) this.$itemHeightPx$delegate).m2992();
            c1179 = new C1179(new C1232(1));
            if (!this.$wrapAround) {
                this.$flingAnimatable.m1595(new Float(-this.$currentIndex), new Float((this.$itemCount - 1) - r4));
            }
            c1177 = this.$flingAnimatable;
            f = new Float(fM29922);
            this.L$0 = null;
            this.F$0 = f8;
            this.F$1 = fM2994;
            this.F$2 = fM29922;
            this.label = 2;
            objM1593 = c1177.m1593();
            interfaceC1204 = c1177.f1474;
            if (c1177.m1592(new C1188(c1179, interfaceC1204, objM1593, (AbstractC1189) interfaceC1204.mo1622().invoke(f)), f, null, this) != coroutineSingletons) {
                f2 = fM2994;
                f3 = fM29922;
                this.$flingAnimatable.m1595(new Float(Float.NEGATIVE_INFINITY), new Float(Float.POSITIVE_INFINITY));
                float fM12617 = AbstractC7390.m12617(((Number) this.$flingAnimatable.m1593()).floatValue());
                c11772 = this.$flingAnimatable;
                f4 = new Float(fM12617);
                c1145M1574 = AbstractC1176.m1574(1.0f, 400.0f, null, 4);
                this.L$0 = null;
                this.F$0 = f8;
                this.F$1 = f2;
                this.F$2 = f3;
                this.F$3 = fM12617;
                this.label = 3;
                if (C1177.m1589(c11772, f4, c1145M1574, null, null, this, 12) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 2) {
            float f10 = this.F$2;
            float f11 = this.F$1;
            AbstractC6017.m10769(obj);
            f2 = f11;
            f3 = f10;
            this.$flingAnimatable.m1595(new Float(Float.NEGATIVE_INFINITY), new Float(Float.POSITIVE_INFINITY));
            float fM126172 = AbstractC7390.m12617(((Number) this.$flingAnimatable.m1593()).floatValue());
            c11772 = this.$flingAnimatable;
            f4 = new Float(fM126172);
            c1145M1574 = AbstractC1176.m1574(1.0f, 400.0f, null, 4);
            this.L$0 = null;
            this.F$0 = f8;
            this.F$1 = f2;
            this.F$2 = f3;
            this.F$3 = fM126172;
            this.label = 3;
            if (C1177.m1589(c11772, f4, c1145M1574, null, null, this, 12) != coroutineSingletons) {
                f5 = f3;
                f6 = f2;
                f7 = fM126172;
                int iM12617 = AbstractC7390.m12617(((Number) this.$flingAnimatable.m1593()).floatValue());
                boolean z = this.$wrapAround;
                int i3 = this.$currentIndex;
                int i4 = this.$itemCount;
                if (!z) {
                }
                i = this.$range.f18163 + iM5650;
                if (i != this.$coercedValue) {
                }
                this.$isUserScrolling$delegate.setValue(Boolean.FALSE);
                C1177 c11774 = this.$flingAnimatable;
                Float f12 = new Float(0.0f);
                this.L$0 = null;
                this.F$0 = f8;
                this.F$1 = f6;
                this.F$2 = f5;
                this.F$3 = f7;
                this.I$0 = iM12617;
                this.I$1 = iM5650;
                this.I$2 = i;
                this.label = 4;
            }
            return coroutineSingletons;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        f7 = this.F$3;
        f5 = this.F$2;
        f6 = this.F$1;
        AbstractC6017.m10769(obj);
        int iM126172 = AbstractC7390.m12617(((Number) this.$flingAnimatable.m1593()).floatValue());
        boolean z2 = this.$wrapAround;
        int i32 = this.$currentIndex;
        int i42 = this.$itemCount;
        int iM5650 = !z2 ? (((i32 + iM126172) % i42) + i42) % i42 : AbstractC3400.m5650(i32 + iM126172, 0, i42 - 1);
        i = this.$range.f18163 + iM5650;
        if (i != this.$coercedValue) {
            ((InterfaceC7387) this.$currentOnValueChange$delegate.getValue()).invoke(new Integer(i));
        }
        this.$isUserScrolling$delegate.setValue(Boolean.FALSE);
        C1177 c117742 = this.$flingAnimatable;
        Float f122 = new Float(0.0f);
        this.L$0 = null;
        this.F$0 = f8;
        this.F$1 = f6;
        this.F$2 = f5;
        this.F$3 = f7;
        this.I$0 = iM126172;
        this.I$1 = iM5650;
        this.I$2 = i;
        this.label = 4;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6233) obj, ((Number) obj2).floatValue(), (InterfaceC5189<? super C6008>) obj3);
    }
}
