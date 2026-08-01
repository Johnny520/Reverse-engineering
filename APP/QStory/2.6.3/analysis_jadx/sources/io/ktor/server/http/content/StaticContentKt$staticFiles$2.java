package io.ktor.server.http.content;

import io.ktor.server.application.InterfaceC4057;
import java.io.File;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.http.content.StaticContentKt$staticFiles$2", f = "StaticContent.kt", l = {185}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$staticFiles$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $cacheControl;
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ InterfaceC6558 $contentType;
    final /* synthetic */ String $defaultPath;
    final /* synthetic */ File $dir;
    final /* synthetic */ InterfaceC6558 $exclude;
    final /* synthetic */ List<String> $extensions;
    final /* synthetic */ String $index;
    final /* synthetic */ InterfaceC6551 $modify;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$staticFiles$2(String str, File file, List<? extends CompressedFileType> list, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, InterfaceC6551 interfaceC6551, InterfaceC6558 interfaceC65583, List<String> list2, String str2, InterfaceC4357<? super StaticContentKt$staticFiles$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$index = str;
        this.$dir = file;
        this.$compressedTypes = list;
        this.$contentType = interfaceC6558;
        this.$cacheControl = interfaceC65582;
        this.$modify = interfaceC6551;
        this.$exclude = interfaceC65583;
        this.$extensions = list2;
        this.$defaultPath = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        StaticContentKt$staticFiles$2 staticContentKt$staticFiles$2 = new StaticContentKt$staticFiles$2(this.$index, this.$dir, this.$compressedTypes, this.$contentType, this.$cacheControl, this.$modify, this.$exclude, this.$extensions, this.$defaultPath, interfaceC4357);
        staticContentKt$staticFiles$2.L$0 = obj;
        return staticContentKt$staticFiles$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC4057 interfaceC4057, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StaticContentKt$staticFiles$2) create(interfaceC4057, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC4057 interfaceC4057 = (InterfaceC4057) this.L$0;
            String str = this.$index;
            File file = this.$dir;
            List<CompressedFileType> list = this.$compressedTypes;
            InterfaceC6558 interfaceC6558 = this.$contentType;
            InterfaceC6558 interfaceC65582 = this.$cacheControl;
            InterfaceC6551 interfaceC6551 = this.$modify;
            InterfaceC6558 interfaceC65583 = this.$exclude;
            List<String> list2 = this.$extensions;
            String str2 = this.$defaultPath;
            this.label = 1;
            if (AbstractC4122.m8519(interfaceC4057, str, file, list, interfaceC6558, interfaceC65582, interfaceC6551, interfaceC65583, list2, str2, this) == coroutineSingletons) {
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
