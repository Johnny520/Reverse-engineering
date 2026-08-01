package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p048.InterfaceC6514;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.SliderKt$VerticalSlider$4$1$1", f = "Slider.kt", l = {380}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class SliderKt$VerticalSlider$4$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1333 $animatedValueState;
    final /* synthetic */ InterfaceC1333 $currentLayoutHeight$delegate;
    final /* synthetic */ InterfaceC1333 $currentLayoutWidth$delegate;
    final /* synthetic */ InterfaceC1395 $isHoveringThumb$delegate;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ InterfaceC6514 $valueRange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$VerticalSlider$4$1$1(InterfaceC1333 interfaceC1333, InterfaceC6514 interfaceC6514, boolean z, InterfaceC1395 interfaceC1395, InterfaceC1333 interfaceC13332, InterfaceC1333 interfaceC13333, InterfaceC4357<? super SliderKt$VerticalSlider$4$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$animatedValueState = interfaceC1333;
        this.$valueRange = interfaceC6514;
        this.$reverseDirection = z;
        this.$isHoveringThumb$delegate = interfaceC1395;
        this.$currentLayoutWidth$delegate = interfaceC13332;
        this.$currentLayoutHeight$delegate = interfaceC13333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SliderKt$VerticalSlider$4$1$1 sliderKt$VerticalSlider$4$1$1 = new SliderKt$VerticalSlider$4$1$1(this.$animatedValueState, this.$valueRange, this.$reverseDirection, this.$isHoveringThumb$delegate, this.$currentLayoutWidth$delegate, this.$currentLayoutHeight$delegate, interfaceC4357);
        sliderKt$VerticalSlider$4$1$1.L$0 = obj;
        return sliderKt$VerticalSlider$4$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SliderKt$VerticalSlider$4$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.SliderKt$VerticalSlider$4$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
