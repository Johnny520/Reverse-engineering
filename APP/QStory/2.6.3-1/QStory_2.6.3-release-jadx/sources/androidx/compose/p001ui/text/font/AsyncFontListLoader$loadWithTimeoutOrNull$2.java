package androidx.compose.p001ui.text.font;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", m556f = "FontListFontFamilyTypefaceAdapter.kt", m557l = {315}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, m152k = 3, m153mv = {2, 1, 0})
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2829 $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AbstractC2810 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AbstractC2810 abstractC2810, InterfaceC2829 interfaceC2829, InterfaceC5189<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC2810;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return obj;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
