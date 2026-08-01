package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import androidx.window.area.AbstractC3400;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p079.InterfaceC7691;
import p357.AbstractC9639;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ColorPaletteKt$ColorPalette$1$1", m556f = "ColorPalette.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ColorPaletteKt$ColorPalette$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2230 $alpha$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ List<Float> $grayV;
    final /* synthetic */ int $hueColumns;
    final /* synthetic */ boolean $includeGrayColumn;
    final /* synthetic */ InterfaceC2230 $lastAcceptedHSV$delegate;
    final /* synthetic */ List<Pair<Float, Float>> $rowSV;
    final /* synthetic */ InterfaceC2233 $selectedCol$delegate;
    final /* synthetic */ InterfaceC2233 $selectedRow$delegate;
    final /* synthetic */ int $totalColumns;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPaletteKt$ColorPalette$1$1(long j, boolean z, int i, int i2, List<Float> list, List<Pair<Float, Float>> list2, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC2233 interfaceC2233, InterfaceC2233 interfaceC22332, InterfaceC5189<? super ColorPaletteKt$ColorPalette$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$color = j;
        this.$includeGrayColumn = z;
        this.$totalColumns = i;
        this.$hueColumns = i2;
        this.$grayV = list;
        this.$rowSV = list2;
        this.$lastAcceptedHSV$delegate = interfaceC2230;
        this.$alpha$delegate = interfaceC22302;
        this.$selectedCol$delegate = interfaceC2233;
        this.$selectedRow$delegate = interfaceC22332;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ColorPaletteKt$ColorPalette$1$1(this.$color, this.$includeGrayColumn, this.$totalColumns, this.$hueColumns, this.$grayV, this.$rowSV, this.$lastAcceptedHSV$delegate, this.$alpha$delegate, this.$selectedCol$delegate, this.$selectedRow$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ColorPaletteKt$ColorPalette$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        long j = this.$color;
        int i2 = AbstractC9639.f25141;
        float fM3512 = ((int) (C2434.m3512(j) * 255.0f)) / 255.0f;
        float fM3513 = ((int) (C2434.m3513(j) * 255.0f)) / 255.0f;
        float fM3507 = ((int) (C2434.m3507(j) * 255.0f)) / 255.0f;
        float fMax = Math.max(fM3512, Math.max(fM3513, fM3507));
        float fMin = fMax - Math.min(fM3512, Math.min(fM3513, fM3507));
        float fM5631 = AbstractC3400.m5631(fMin == 0.0f ? 0.0f : fMax == fM3512 ? ((((fM3513 - fM3507) / fMin) * 60.0f) + 360.0f) % 360.0f : fMax == fM3513 ? ((((fM3507 - fM3512) / fMin) * 60.0f) + 120.0f) % 360.0f : ((((fM3512 - fM3513) / fMin) * 60.0f) + 240.0f) % 360.0f, 0.0f, 360.0f);
        float f = fMax > 0.0f ? fMin / fMax : 0.0f;
        int i3 = 0;
        float[] fArr = {fM5631, AbstractC3400.m5631(f, 0.0f, 1.0f), AbstractC3400.m5631(fMax, 0.0f, 1.0f)};
        float f2 = fArr[0];
        float fM56312 = AbstractC3400.m5631(fArr[1] * 100.0f, 0.0f, 100.0f) / 100.0f;
        float fM56313 = AbstractC3400.m5631(fArr[2] * 100.0f, 0.0f, 100.0f) / 100.0f;
        Triple triple = new Triple(new Float(f2), new Float(fM56312), new Float(fM56313));
        Triple triple2 = (Triple) this.$lastAcceptedHSV$delegate.getValue();
        C6008 c6008 = C6008.f15084;
        if (triple2 != null) {
            float fAbs = Math.abs(((Number) triple2.getFirst()).floatValue() - ((Number) triple.getFirst()).floatValue());
            if (Math.min(fAbs, 360.0f - fAbs) <= 1.5f && Math.abs(((Number) triple2.getSecond()).floatValue() - ((Number) triple.getSecond()).floatValue()) <= 0.02f && Math.abs(((Number) triple2.getThird()).floatValue() - ((Number) triple.getThird()).floatValue()) <= 0.02f) {
                this.$alpha$delegate.setValue(Float.valueOf(C2434.m3508(this.$color)));
                this.$lastAcceptedHSV$delegate.setValue(triple);
                return c6008;
            }
        }
        boolean z = this.$includeGrayColumn && fM56312 < 0.05f;
        int iM5650 = z ? this.$totalColumns - 1 : AbstractC3400.m5650(AbstractC7390.m12617(((f2 % 360.0f) / 360.0f) * this.$hueColumns), 0, this.$hueColumns - 1);
        float f3 = Float.POSITIVE_INFINITY;
        if (z) {
            List<Float> list = this.$grayV;
            int size = list.size();
            i = 0;
            while (i3 < size) {
                float fFloatValue = fM56313 - list.get(i3).floatValue();
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
                float fFloatValue2 = fM56312 - list2.get(i3).getFirst().floatValue();
                float fFloatValue3 = fM56313 - list2.get(i3).getSecond().floatValue();
                float f5 = (fFloatValue3 * fFloatValue3) + (fFloatValue2 * fFloatValue2);
                if (f5 < f3) {
                    i4 = i3;
                    f3 = f5;
                }
                i3++;
            }
            i = i4;
        }
        ((AbstractC2181) this.$selectedCol$delegate).m2993(iM5650);
        ((AbstractC2181) this.$selectedRow$delegate).m2993(i);
        this.$alpha$delegate.setValue(Float.valueOf(C2434.m3508(this.$color)));
        this.$lastAcceptedHSV$delegate.setValue(triple);
        return c6008;
    }
}
