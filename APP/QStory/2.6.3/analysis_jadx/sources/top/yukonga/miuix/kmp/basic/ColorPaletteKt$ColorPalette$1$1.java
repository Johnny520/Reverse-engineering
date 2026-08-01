package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.ui.graphics.C1599;
import androidx.window.area.AbstractC2567;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p053.AbstractC6561;
import p063.InterfaceC6862;
import p341.AbstractC8810;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ColorPaletteKt$ColorPalette$1$1", f = "ColorPalette.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ColorPaletteKt$ColorPalette$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1395 $alpha$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ List<Float> $grayV;
    final /* synthetic */ int $hueColumns;
    final /* synthetic */ boolean $includeGrayColumn;
    final /* synthetic */ InterfaceC1395 $lastAcceptedHSV$delegate;
    final /* synthetic */ List<Pair<Float, Float>> $rowSV;
    final /* synthetic */ InterfaceC1398 $selectedCol$delegate;
    final /* synthetic */ InterfaceC1398 $selectedRow$delegate;
    final /* synthetic */ int $totalColumns;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPaletteKt$ColorPalette$1$1(long j, boolean z, int i, int i2, List<Float> list, List<Pair<Float, Float>> list2, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC1398 interfaceC1398, InterfaceC1398 interfaceC13982, InterfaceC4357<? super ColorPaletteKt$ColorPalette$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$color = j;
        this.$includeGrayColumn = z;
        this.$totalColumns = i;
        this.$hueColumns = i2;
        this.$grayV = list;
        this.$rowSV = list2;
        this.$lastAcceptedHSV$delegate = interfaceC1395;
        this.$alpha$delegate = interfaceC13952;
        this.$selectedCol$delegate = interfaceC1398;
        this.$selectedRow$delegate = interfaceC13982;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ColorPaletteKt$ColorPalette$1$1(this.$color, this.$includeGrayColumn, this.$totalColumns, this.$hueColumns, this.$grayV, this.$rowSV, this.$lastAcceptedHSV$delegate, this.$alpha$delegate, this.$selectedCol$delegate, this.$selectedRow$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ColorPaletteKt$ColorPalette$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        long j = this.$color;
        int i2 = AbstractC8810.f24796;
        float fM2952 = ((int) (C1599.m2952(j) * 255.0f)) / 255.0f;
        float fM2953 = ((int) (C1599.m2953(j) * 255.0f)) / 255.0f;
        float fM2947 = ((int) (C1599.m2947(j) * 255.0f)) / 255.0f;
        float fMax = Math.max(fM2952, Math.max(fM2953, fM2947));
        float fMin = fMax - Math.min(fM2952, Math.min(fM2953, fM2947));
        float fM5071 = AbstractC2567.m5071(fMin == 0.0f ? 0.0f : fMax == fM2952 ? ((((fM2953 - fM2947) / fMin) * 60.0f) + 360.0f) % 360.0f : fMax == fM2953 ? ((((fM2947 - fM2952) / fMin) * 60.0f) + 120.0f) % 360.0f : ((((fM2952 - fM2953) / fMin) * 60.0f) + 240.0f) % 360.0f, 0.0f, 360.0f);
        float f = fMax > 0.0f ? fMin / fMax : 0.0f;
        int i3 = 0;
        float[] fArr = {fM5071, AbstractC2567.m5071(f, 0.0f, 1.0f), AbstractC2567.m5071(fMax, 0.0f, 1.0f)};
        float f2 = fArr[0];
        float fM50712 = AbstractC2567.m5071(fArr[1] * 100.0f, 0.0f, 100.0f) / 100.0f;
        float fM50713 = AbstractC2567.m5071(fArr[2] * 100.0f, 0.0f, 100.0f) / 100.0f;
        Triple triple = new Triple(new Float(f2), new Float(fM50712), new Float(fM50713));
        Triple triple2 = (Triple) this.$lastAcceptedHSV$delegate.getValue();
        C5176 c5176 = C5176.f14739;
        if (triple2 != null) {
            float fAbs = Math.abs(((Number) triple2.getFirst()).floatValue() - ((Number) triple.getFirst()).floatValue());
            if (Math.min(fAbs, 360.0f - fAbs) <= 1.5f && Math.abs(((Number) triple2.getSecond()).floatValue() - ((Number) triple.getSecond()).floatValue()) <= 0.02f && Math.abs(((Number) triple2.getThird()).floatValue() - ((Number) triple.getThird()).floatValue()) <= 0.02f) {
                this.$alpha$delegate.setValue(Float.valueOf(C1599.m2948(this.$color)));
                this.$lastAcceptedHSV$delegate.setValue(triple);
                return c5176;
            }
        }
        boolean z = this.$includeGrayColumn && fM50712 < 0.05f;
        int iM5090 = z ? this.$totalColumns - 1 : AbstractC2567.m5090(AbstractC6561.m12058(((f2 % 360.0f) / 360.0f) * this.$hueColumns), 0, this.$hueColumns - 1);
        float f3 = Float.POSITIVE_INFINITY;
        if (z) {
            List<Float> list = this.$grayV;
            int size = list.size();
            i = 0;
            while (i3 < size) {
                float fFloatValue = fM50713 - list.get(i3).floatValue();
                float f4 = fFloatValue * fFloatValue;
                if (f4 < f3) {
                    i = i3;
                    f3 = f4;
                }
                i3++;
            }
        } else {
            List<Pair<Float, Float>> list2 = this.$rowSV;
            int size2 = list2.size();
            int i4 = 0;
            while (i3 < size2) {
                float fFloatValue2 = fM50712 - list2.get(i3).getFirst().floatValue();
                float fFloatValue3 = fM50713 - list2.get(i3).getSecond().floatValue();
                float f5 = (fFloatValue3 * fFloatValue3) + (fFloatValue2 * fFloatValue2);
                if (f5 < f3) {
                    i4 = i3;
                    f3 = f5;
                }
                i3++;
            }
            i = i4;
        }
        ((AbstractC1346) this.$selectedCol$delegate).m2433(iM5090);
        ((AbstractC1346) this.$selectedRow$delegate).m2433(i);
        this.$alpha$delegate.setValue(Float.valueOf(C1599.m2948(this.$color)));
        this.$lastAcceptedHSV$delegate.setValue(triple);
        return c5176;
    }
}
