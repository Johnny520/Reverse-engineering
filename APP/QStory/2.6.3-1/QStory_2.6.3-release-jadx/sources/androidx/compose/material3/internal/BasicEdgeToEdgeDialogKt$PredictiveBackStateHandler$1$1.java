package androidx.compose.material3.internal;

import androidx.compose.foundation.text.input.internal.C1696;
import androidx.compose.runtime.InterfaceC2168;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1", m556f = "BasicEdgeToEdgeDialog.kt", m557l = {100}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2168 $currentOnBack$delegate;
    final /* synthetic */ InterfaceC1958 $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(InterfaceC1958 interfaceC1958, InterfaceC2168 interfaceC2168, InterfaceC5189<? super BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$currentOnBack$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(null, this.$currentOnBack$delegate, interfaceC5189);
        basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.L$0 = obj;
        return basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6151 interfaceC6151, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1) create(interfaceC6151, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                throw null;
            }
            AbstractC6017.m10769(obj);
            InterfaceC6151 interfaceC6151 = (InterfaceC6151) this.L$0;
            C1696 c1696 = new C1696(3);
            this.label = 1;
            if (interfaceC6151.mo9012(c1696, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw null;
        } catch (CancellationException unused) {
            throw null;
        }
    }
}
