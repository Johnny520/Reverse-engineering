package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.InterfaceC1398;
import com.android.dx.io.Opcodes;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p048.C6518;
import p052.InterfaceC6550;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$9$1", f = "NumberPicker.kt", l = {193, Opcodes.SUB_DOUBLE_2ADDR, Opcodes.RSUB_INT, Opcodes.SHL_INT_LIT8}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "velocity", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$9$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ int $coercedValue;
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ InterfaceC1333 $currentOnValueChange$delegate;
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ C0331 $flingAnimatable;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    final /* synthetic */ InterfaceC1395 $isUserScrolling$delegate;
    final /* synthetic */ int $itemCount;
    final /* synthetic */ InterfaceC1398 $itemHeightPx$delegate;
    final /* synthetic */ C6518 $range;
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
    public NumberPickerKt$NumberPicker$9$1(C0331 c0331, boolean z, int i, int i2, C6518 c6518, int i3, InterfaceC1395 interfaceC1395, InterfaceC1398 interfaceC1398, InterfaceC1397 interfaceC1397, InterfaceC1333 interfaceC1333, InterfaceC1395 interfaceC13952, InterfaceC4356<? super NumberPickerKt$NumberPicker$9$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$flingAnimatable = c0331;
        this.$wrapAround = z;
        this.$currentIndex = i;
        this.$itemCount = i2;
        this.$range = c6518;
        this.$coercedValue = i3;
        this.$isDragging$delegate = interfaceC1395;
        this.$itemHeightPx$delegate = interfaceC1398;
        this.$dragOffset$delegate = interfaceC1397;
        this.$currentOnValueChange$delegate = interfaceC1333;
        this.$isUserScrolling$delegate = interfaceC13952;
    }

    public final Object invoke(InterfaceC5400 interfaceC5400, float f, InterfaceC4356<? super C5175> interfaceC4356) {
        NumberPickerKt$NumberPicker$9$1 numberPickerKt$NumberPicker$9$1 = new NumberPickerKt$NumberPicker$9$1(this.$flingAnimatable, this.$wrapAround, this.$currentIndex, this.$itemCount, this.$range, this.$coercedValue, this.$isDragging$delegate, this.$itemHeightPx$delegate, this.$dragOffset$delegate, this.$currentOnValueChange$delegate, this.$isUserScrolling$delegate, interfaceC4356);
        numberPickerKt$NumberPicker$9$1.F$0 = f;
        return numberPickerKt$NumberPicker$9$1.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x019b, code lost:
    
        if (r11.m1030(r13, r17) != r8) goto L40;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$9$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5400) obj, ((Number) obj2).floatValue(), (InterfaceC4356<? super C5175>) obj3);
    }
}
