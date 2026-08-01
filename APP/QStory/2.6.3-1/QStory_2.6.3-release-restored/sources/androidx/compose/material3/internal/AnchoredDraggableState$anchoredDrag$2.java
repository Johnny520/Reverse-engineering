package androidx.compose.material3.internal;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", m556f = "AnchoredDraggable.kt", m557l = {518}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7380 $block;
    int label;
    final /* synthetic */ AbstractC1952 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$2(AbstractC1952 abstractC1952, InterfaceC7380 interfaceC7380, InterfaceC5189<? super AnchoredDraggableState$anchoredDrag$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.$block = interfaceC7380;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1960 invokeSuspend$lambda$0(AbstractC1952 abstractC1952) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new AnchoredDraggableState$anchoredDrag$2(null, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1954 c1954 = new C1954();
            C01542 c01542 = new C01542(this.$block, null, null);
            this.label = 1;
            if (AbstractC1955.m2574(c1954, c01542, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"T", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "latestAnchors", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", m556f = "AnchoredDraggable.kt", m557l = {519}, m558m = "invokeSuspend")
    public static final class C01542 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7380 $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1952 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01542(InterfaceC7380 interfaceC7380, AbstractC1952 abstractC1952, InterfaceC5189<? super C01542> interfaceC5189) {
            super(2, interfaceC5189);
            this.$block = interfaceC7380;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01542 c01542 = new C01542(this.$block, null, interfaceC5189);
            c01542.L$0 = obj;
            return c01542;
        }

        @Override // p068.InterfaceC7383
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((InterfaceC1960) null, (InterfaceC5189<? super C6008>) obj2);
            }
            C3775.m6954();
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                throw AbstractC0900.m719(this.L$0);
            }
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invoke(InterfaceC1960 interfaceC1960, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01542) create(interfaceC1960, interfaceC5189)).invokeSuspend(C6008.f15084);
        }
    }
}
