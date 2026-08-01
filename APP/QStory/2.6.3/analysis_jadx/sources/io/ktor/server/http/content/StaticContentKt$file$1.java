package io.ktor.server.http.content;

import com.materialkolor.dynamiccolor.C3807;
import io.ktor.server.routing.C4155;
import io.ktor.server.routing.C4163;
import java.io.File;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.http.content.StaticContentKt$file$1", f = "StaticContent.kt", l = {439}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$file$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$file$1(File file, List<? extends CompressedFileType> list, InterfaceC4357<? super StaticContentKt$file$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$file = file;
        this.$compressedTypes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        StaticContentKt$file$1 staticContentKt$file$1 = new StaticContentKt$file$1(this.$file, this.$compressedTypes, interfaceC4357);
        staticContentKt$file$1.L$0 = obj;
        return staticContentKt$file$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StaticContentKt$file$1) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4163 c4163 = ((C4155) this.L$0).f12583;
            File file = this.$file;
            List<CompressedFileType> list = this.$compressedTypes;
            this.label = 1;
            if (AbstractC4125.m8525(c4163, file, list, new C3807(19), new C3807(20), new PreCompressedKt$respondStaticFile$4(null), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
