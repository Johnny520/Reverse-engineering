package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import com.android.dx.io.Opcodes;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ColorPaletteKt$PaletteCanvas$2$1$1", f = "ColorPalette.kt", l = {Opcodes.REM_DOUBLE_2ADDR, Opcodes.OR_INT_LIT16}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class ColorPaletteKt$PaletteCanvas$2$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC1333 $onSelectState;
    final /* synthetic */ int $rows;
    final /* synthetic */ InterfaceC1395 $sizePx$delegate;
    final /* synthetic */ int $totalColumns;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPaletteKt$PaletteCanvas$2$1$1(int i, int i2, boolean z, InterfaceC1333 interfaceC1333, InterfaceC1395 interfaceC1395, InterfaceC4357<? super ColorPaletteKt$PaletteCanvas$2$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$rows = i;
        this.$totalColumns = i2;
        this.$isRtl = z;
        this.$onSelectState = interfaceC1333;
        this.$sizePx$delegate = interfaceC1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ColorPaletteKt$PaletteCanvas$2$1$1 colorPaletteKt$PaletteCanvas$2$1$1 = new ColorPaletteKt$PaletteCanvas$2$1$1(this.$rows, this.$totalColumns, this.$isRtl, this.$onSelectState, this.$sizePx$delegate, interfaceC4357);
        colorPaletteKt$PaletteCanvas$2$1$1.L$0 = obj;
        return colorPaletteKt$PaletteCanvas$2$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ColorPaletteKt$PaletteCanvas$2$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r3 == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (r9 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00bb -> B:22:0x00be). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.ColorPaletteKt$PaletteCanvas$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
