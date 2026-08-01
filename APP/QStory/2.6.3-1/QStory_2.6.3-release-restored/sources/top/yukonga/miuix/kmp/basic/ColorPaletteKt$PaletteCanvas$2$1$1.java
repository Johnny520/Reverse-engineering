package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import com.android.p002dx.p005io.Opcodes;
import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8735;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ColorPaletteKt$PaletteCanvas$2$1$1", m556f = "ColorPalette.kt", m557l = {Opcodes.REM_DOUBLE_2ADDR, Opcodes.OR_INT_LIT16}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ColorPaletteKt$PaletteCanvas$2$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ InterfaceC2168 $onSelectState;
    final /* synthetic */ int $rows;
    final /* synthetic */ InterfaceC2230 $sizePx$delegate;
    final /* synthetic */ int $totalColumns;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPaletteKt$PaletteCanvas$2$1$1(int i, int i2, boolean z, InterfaceC2168 interfaceC2168, InterfaceC2230 interfaceC2230, InterfaceC5189<? super ColorPaletteKt$PaletteCanvas$2$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$rows = i;
        this.$totalColumns = i2;
        this.$isRtl = z;
        this.$onSelectState = interfaceC2168;
        this.$sizePx$delegate = interfaceC2230;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ColorPaletteKt$PaletteCanvas$2$1$1 colorPaletteKt$PaletteCanvas$2$1$1 = new ColorPaletteKt$PaletteCanvas$2$1$1(this.$rows, this.$totalColumns, this.$isRtl, this.$onSelectState, this.$sizePx$delegate, interfaceC5189);
        colorPaletteKt$PaletteCanvas$2$1$1.L$0 = obj;
        return colorPaletteKt$PaletteCanvas$2$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ColorPaletteKt$PaletteCanvas$2$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
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
    */
    public final Object invokeSuspend(Object obj) {
        Object objM1835;
        int i;
        int i2;
        long j;
        Object objM3559;
        Object next;
        InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 2;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = interfaceC2468;
            this.label = 1;
            objM1835 = AbstractC1344.m1835(interfaceC2468, null, this, 3);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                i = this.I$1;
                i2 = this.I$0;
                AbstractC6017.m10769(obj);
                objM3559 = obj;
                C2487 c2487 = (C2487) objM3559;
                Iterator it = c2487.f5197.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC2481.m3586(((C2478) next).f5154, j)) {
                        break;
                    }
                }
                C2478 c2478 = (C2478) next;
                if ((c2478 != null || (c2478 = (C2478) AbstractC5176.m9374(c2487.f5197)) != null) && c2478.f5151) {
                    Pair pairM11952 = AbstractC6862.m11952(c2478.f5152, ((C8735) this.$sizePx$delegate.getValue()).f22224, this.$rows, this.$totalColumns, this.$isRtl);
                    ((InterfaceC7383) this.$onSelectState.getValue()).invoke(new Integer(((Number) pairM11952.component1()).intValue()), new Integer(((Number) pairM11952.component2()).intValue()));
                    c2478.m3584();
                    i4 = 2;
                    this.L$0 = interfaceC2468;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.J$0 = j;
                    this.label = i4;
                    objM3559 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                }
                return C6008.f15084;
            }
            AbstractC6017.m10769(obj);
            objM1835 = obj;
        }
        C2478 c24782 = (C2478) objM1835;
        if (((int) (((C8735) this.$sizePx$delegate.getValue()).f22224 >> 32)) != 0 && ((int) (((C8735) this.$sizePx$delegate.getValue()).f22224 & 4294967295L)) != 0) {
            Pair pairM119522 = AbstractC6862.m11952(c24782.f5152, ((C8735) this.$sizePx$delegate.getValue()).f22224, this.$rows, this.$totalColumns, this.$isRtl);
            int iIntValue = ((Number) pairM119522.component1()).intValue();
            int iIntValue2 = ((Number) pairM119522.component2()).intValue();
            ((InterfaceC7383) this.$onSelectState.getValue()).invoke(new Integer(iIntValue), new Integer(iIntValue2));
            long j2 = c24782.f5154;
            i = iIntValue2;
            i2 = iIntValue;
            j = j2;
            this.L$0 = interfaceC2468;
            this.L$1 = null;
            this.I$0 = i2;
            this.I$1 = i;
            this.J$0 = j;
            this.label = i4;
            objM3559 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
        }
        return C6008.f15084;
    }
}
