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
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SliderKt$VerticalSlider$4$1$1", m556f = "Slider.kt", m557l = {380}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SliderKt$VerticalSlider$4$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2168 $animatedValueState;
    final /* synthetic */ InterfaceC2168 $currentLayoutHeight$delegate;
    final /* synthetic */ InterfaceC2168 $currentLayoutWidth$delegate;
    final /* synthetic */ InterfaceC2230 $isHoveringThumb$delegate;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ InterfaceC7343 $valueRange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$VerticalSlider$4$1$1(InterfaceC2168 interfaceC2168, InterfaceC7343 interfaceC7343, boolean z, InterfaceC2230 interfaceC2230, InterfaceC2168 interfaceC21682, InterfaceC2168 interfaceC21683, InterfaceC5189<? super SliderKt$VerticalSlider$4$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$animatedValueState = interfaceC2168;
        this.$valueRange = interfaceC7343;
        this.$reverseDirection = z;
        this.$isHoveringThumb$delegate = interfaceC2230;
        this.$currentLayoutWidth$delegate = interfaceC21682;
        this.$currentLayoutHeight$delegate = interfaceC21683;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SliderKt$VerticalSlider$4$1$1 sliderKt$VerticalSlider$4$1$1 = new SliderKt$VerticalSlider$4$1$1(this.$animatedValueState, this.$valueRange, this.$reverseDirection, this.$isHoveringThumb$delegate, this.$currentLayoutWidth$delegate, this.$currentLayoutHeight$delegate, interfaceC5189);
        sliderKt$VerticalSlider$4$1$1.L$0 = obj;
        return sliderKt$VerticalSlider$4$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SliderKt$VerticalSlider$4$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Path cross not found for [B:34:0x00dd, B:15:0x0037], limit reached: 32 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.SliderKt$VerticalSlider$4$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
