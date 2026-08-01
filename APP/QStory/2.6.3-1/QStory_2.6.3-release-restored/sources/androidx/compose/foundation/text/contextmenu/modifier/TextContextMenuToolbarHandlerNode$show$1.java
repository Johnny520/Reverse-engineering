package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", m556f = "TextContextMenuToolbarHandlerModifier.kt", m557l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.DIV_DOUBLE_2ADDR, Opcodes.ADD_INT_LIT16, Opcodes.ADD_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextContextMenuToolbarHandlerNode$show$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1674 $provider;
    Object L$0;
    int label;
    final /* synthetic */ C1663 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuToolbarHandlerNode$show$1(C1663 c1663, InterfaceC1674 interfaceC1674, InterfaceC5189<? super TextContextMenuToolbarHandlerNode$show$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1663;
        this.$provider = interfaceC1674;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.this$0, this.$provider, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextContextMenuToolbarHandlerNode$show$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r7.invoke(r6) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC7387 interfaceC7387;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th2) {
            InterfaceC7387 interfaceC73872 = this.this$0.f2689;
            if (interfaceC73872 == null) {
                throw th2;
            }
            this.L$0 = th2;
            this.label = 4;
            if (interfaceC73872.invoke(this) != coroutineSingletons) {
                th = th2;
            }
            return coroutineSingletons;
        }
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7387 interfaceC73873 = this.this$0.f2690;
            if (interfaceC73873 != null) {
                this.label = 1;
                if (interfaceC73873.invoke(this) == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    interfaceC7387 = this.this$0.f2689;
                    if (interfaceC7387 != null) {
                        this.label = 3;
                    }
                    return C6008.f15084;
                }
                if (i == 3) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                if (i != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th;
            }
            AbstractC6017.m10769(obj);
        }
        InterfaceC1674 interfaceC1674 = this.$provider;
        C1663 c1663 = this.this$0;
        this.label = 2;
        if (interfaceC1674.mo2196(c1663, this) != coroutineSingletons) {
            interfaceC7387 = this.this$0.f2689;
            if (interfaceC7387 != null) {
            }
            return C6008.f15084;
        }
        return coroutineSingletons;
    }
}
