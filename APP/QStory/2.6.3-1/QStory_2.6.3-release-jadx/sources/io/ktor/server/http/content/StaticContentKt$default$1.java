package io.ktor.server.http.content;

import com.materialkolor.dynamiccolor.C4639;
import io.ktor.server.routing.C4987;
import io.ktor.server.routing.C4995;
import java.io.File;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.http.content.StaticContentKt$default$1", m556f = "StaticContent.kt", m557l = {419}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class StaticContentKt$default$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$default$1(File file, List<? extends CompressedFileType> list, InterfaceC5189<? super StaticContentKt$default$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$file = file;
        this.$compressedTypes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StaticContentKt$default$1 staticContentKt$default$1 = new StaticContentKt$default$1(this.$file, this.$compressedTypes, interfaceC5189);
        staticContentKt$default$1.L$0 = obj;
        return staticContentKt$default$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C4987 c4987, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StaticContentKt$default$1) create(c4987, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C4995 c4995 = ((C4987) this.L$0).f12928;
            File file = this.$file;
            List<CompressedFileType> list = this.$compressedTypes;
            this.label = 1;
            if (AbstractC4957.m9084(c4995, file, list, new C4639(19), new C4639(20), new PreCompressedKt$respondStaticFile$4(null), this) == coroutineSingletons) {
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
}
