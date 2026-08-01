package io.ktor.server.http.content;

import com.android.dx.io.Opcodes;
import io.ktor.server.application.InterfaceC4056;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentKt$staticResources$2", f = "StaticContent.kt", l = {Opcodes.SHR_INT_LIT8}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$staticResources$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $basePackage;
    final /* synthetic */ InterfaceC6557 $cacheControl;
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ InterfaceC6557 $contentType;
    final /* synthetic */ String $defaultPath;
    final /* synthetic */ InterfaceC6557 $exclude;
    final /* synthetic */ List<String> $extensions;
    final /* synthetic */ String $index;
    final /* synthetic */ InterfaceC6550 $modifier;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$staticResources$2(String str, String str2, List<? extends CompressedFileType> list, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, InterfaceC6550 interfaceC6550, InterfaceC6557 interfaceC65573, List<String> list2, String str3, InterfaceC4356<? super StaticContentKt$staticResources$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$index = str;
        this.$basePackage = str2;
        this.$compressedTypes = list;
        this.$contentType = interfaceC6557;
        this.$cacheControl = interfaceC65572;
        this.$modifier = interfaceC6550;
        this.$exclude = interfaceC65573;
        this.$extensions = list2;
        this.$defaultPath = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        StaticContentKt$staticResources$2 staticContentKt$staticResources$2 = new StaticContentKt$staticResources$2(this.$index, this.$basePackage, this.$compressedTypes, this.$contentType, this.$cacheControl, this.$modifier, this.$exclude, this.$extensions, this.$defaultPath, interfaceC4356);
        staticContentKt$staticResources$2.L$0 = obj;
        return staticContentKt$staticResources$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC4056 interfaceC4056, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StaticContentKt$staticResources$2) create(interfaceC4056, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4056 interfaceC4056 = (InterfaceC4056) this.L$0;
            String str = this.$index;
            String str2 = this.$basePackage;
            List<CompressedFileType> list = this.$compressedTypes;
            InterfaceC6557 interfaceC6557 = this.$contentType;
            InterfaceC6557 interfaceC65572 = this.$cacheControl;
            InterfaceC6550 interfaceC6550 = this.$modifier;
            InterfaceC6557 interfaceC65573 = this.$exclude;
            List<String> list2 = this.$extensions;
            String str3 = this.$defaultPath;
            this.label = 1;
            if (AbstractC4121.m8527(interfaceC4056, str, str2, list, interfaceC6557, interfaceC65572, interfaceC6550, interfaceC65573, list2, str3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
