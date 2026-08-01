package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.ui.graphics.C1599;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p000.AbstractC6087;
import p052.InterfaceC6553;
import p053.AbstractC6560;
import p063.InterfaceC6861;
import p344.AbstractC8833;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ColorPaletteKt$ColorPalette$1$1", f = "ColorPalette.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ColorPaletteKt$ColorPalette$1$1 extends SuspendLambda implements InterfaceC6553 {
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
    public ColorPaletteKt$ColorPalette$1$1(long j, boolean z, int i, int i2, List<Float> list, List<Pair<Float, Float>> list2, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC1398 interfaceC1398, InterfaceC1398 interfaceC13982, InterfaceC4356<? super ColorPaletteKt$ColorPalette$1$1> interfaceC4356) {
        super(2, interfaceC4356);
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
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ColorPaletteKt$ColorPalette$1$1(this.$color, this.$includeGrayColumn, this.$totalColumns, this.$hueColumns, this.$grayV, this.$rowSV, this.$lastAcceptedHSV$delegate, this.$alpha$delegate, this.$selectedCol$delegate, this.$selectedRow$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ColorPaletteKt$ColorPalette$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        long j = this.$color;
        int i2 = AbstractC8833.f24841;
        float fM2942 = ((int) (C1599.m2942(j) * 255.0f)) / 255.0f;
        float fM2943 = ((int) (C1599.m2943(j) * 255.0f)) / 255.0f;
        float fM2937 = ((int) (C1599.m2937(j) * 255.0f)) / 255.0f;
        float fMax = Math.max(fM2942, Math.max(fM2943, fM2937));
        float fMin = fMax - Math.min(fM2942, Math.min(fM2943, fM2937));
        float fM11419 = AbstractC6087.m11419(fMin == 0.0f ? 0.0f : fMax == fM2942 ? ((((fM2943 - fM2937) / fMin) * 60.0f) + 360.0f) % 360.0f : fMax == fM2943 ? ((((fM2937 - fM2942) / fMin) * 60.0f) + 120.0f) % 360.0f : ((((fM2942 - fM2943) / fMin) * 60.0f) + 240.0f) % 360.0f, 0.0f, 360.0f);
        float f = fMax > 0.0f ? fMin / fMax : 0.0f;
        int i3 = 0;
        float[] fArr = {fM11419, AbstractC6087.m11419(f, 0.0f, 1.0f), AbstractC6087.m11419(fMax, 0.0f, 1.0f)};
        float f2 = fArr[0];
        float fM114192 = AbstractC6087.m11419(fArr[1] * 100.0f, 0.0f, 100.0f) / 100.0f;
        float fM114193 = AbstractC6087.m11419(fArr[2] * 100.0f, 0.0f, 100.0f) / 100.0f;
        Triple triple = new Triple(new Float(f2), new Float(fM114192), new Float(fM114193));
        Triple triple2 = (Triple) this.$lastAcceptedHSV$delegate.getValue();
        C5175 c5175 = C5175.f14739;
        if (triple2 != null) {
            float fAbs = Math.abs(((Number) triple2.getFirst()).floatValue() - ((Number) triple.getFirst()).floatValue());
            if (Math.min(fAbs, 360.0f - fAbs) <= 1.5f && Math.abs(((Number) triple2.getSecond()).floatValue() - ((Number) triple.getSecond()).floatValue()) <= 0.02f && Math.abs(((Number) triple2.getThird()).floatValue() - ((Number) triple.getThird()).floatValue()) <= 0.02f) {
                this.$alpha$delegate.setValue(Float.valueOf(C1599.m2938(this.$color)));
                this.$lastAcceptedHSV$delegate.setValue(triple);
                return c5175;
            }
        }
        boolean z = this.$includeGrayColumn && fM114192 < 0.05f;
        int iM11420 = z ? this.$totalColumns - 1 : AbstractC6087.m11420(AbstractC6560.m12006(((f2 % 360.0f) / 360.0f) * this.$hueColumns), 0, this.$hueColumns - 1);
        float f3 = Float.POSITIVE_INFINITY;
        if (z) {
            List<Float> list = this.$grayV;
            int size = list.size();
            i = 0;
            while (i3 < size) {
                float fFloatValue = fM114193 - list.get(i3).floatValue();
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
                float fFloatValue2 = fM114192 - list2.get(i3).getFirst().floatValue();
                float fFloatValue3 = fM114193 - list2.get(i3).getSecond().floatValue();
                float f5 = (fFloatValue3 * fFloatValue3) + (fFloatValue2 * fFloatValue2);
                if (f5 < f3) {
                    i4 = i3;
                    f3 = f5;
                }
                i3++;
            }
            i = i4;
        }
        ((AbstractC1346) this.$selectedCol$delegate).m2423(iM11420);
        ((AbstractC1346) this.$selectedRow$delegate).m2423(i);
        this.$alpha$delegate.setValue(Float.valueOf(C1599.m2938(this.$color)));
        this.$lastAcceptedHSV$delegate.setValue(triple);
        return c5175;
    }
}
