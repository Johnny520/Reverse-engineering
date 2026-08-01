package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p064.InterfaceC7343;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SliderKt$RangeSlider$4$1$1", m556f = "Slider.kt", m557l = {604}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SliderKt$RangeSlider$4$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2168 $animatedEndValueState;
    final /* synthetic */ InterfaceC2168 $animatedStartValueState;
    final /* synthetic */ InterfaceC2168 $currentLayoutHeight$delegate;
    final /* synthetic */ InterfaceC2168 $currentLayoutWidth$delegate;
    final /* synthetic */ InterfaceC2230 $isHoveringEndThumb$delegate;
    final /* synthetic */ InterfaceC2230 $isHoveringStartThumb$delegate;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC7343 $valueRange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$4$1$1(InterfaceC2168 interfaceC2168, InterfaceC7343 interfaceC7343, InterfaceC2168 interfaceC21682, boolean z, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC2168 interfaceC21683, InterfaceC2168 interfaceC21684, InterfaceC5189<? super SliderKt$RangeSlider$4$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$animatedStartValueState = interfaceC2168;
        this.$valueRange = interfaceC7343;
        this.$animatedEndValueState = interfaceC21682;
        this.$isRtl = z;
        this.$isHoveringStartThumb$delegate = interfaceC2230;
        this.$isHoveringEndThumb$delegate = interfaceC22302;
        this.$currentLayoutHeight$delegate = interfaceC21683;
        this.$currentLayoutWidth$delegate = interfaceC21684;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SliderKt$RangeSlider$4$1$1 sliderKt$RangeSlider$4$1$1 = new SliderKt$RangeSlider$4$1$1(this.$animatedStartValueState, this.$valueRange, this.$animatedEndValueState, this.$isRtl, this.$isHoveringStartThumb$delegate, this.$isHoveringEndThumb$delegate, this.$currentLayoutHeight$delegate, this.$currentLayoutWidth$delegate, interfaceC5189);
        sliderKt$RangeSlider$4$1$1.L$0 = obj;
        return sliderKt$RangeSlider$4$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SliderKt$RangeSlider$4$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Path cross not found for [B:41:0x0138, B:15:0x0037], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:12:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.SliderKt$RangeSlider$4$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
