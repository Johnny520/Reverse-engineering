package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.text.C2869;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", m556f = "TextFieldSelectionManager.kt", m557l = {241, 243}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements InterfaceC7387 {
    int label;
    final /* synthetic */ C1720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(C1720 c1720, InterfaceC5189<? super TextFieldSelectionManager$contextMenuAreaModifier$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.this$0 = c1720;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r9 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1720 c1720 = this.this$0;
            this.label = 1;
            if (c1720.m2314(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.this$0.f2826 = true;
            return c6008;
        }
        AbstractC6017.m10769(obj);
        Pair pairM2311 = C1720.m2311(this.this$0);
        if (pairM2311 != null) {
            C1720 c17202 = this.this$0;
            String str = (String) pairM2311.component1();
            long j = ((C2869) pairM2311.component2()).f6349;
            InterfaceC1755 interfaceC1755 = c17202.f2852;
            if (interfaceC1755 != null) {
                this.label = 2;
                Object objM2421 = ((C1760) interfaceC1755).m2421(str, j, this);
                if (objM2421 != coroutineSingletons) {
                    objM2421 = c6008;
                }
            }
        }
        this.this$0.f2826 = true;
        return c6008;
    }
}
