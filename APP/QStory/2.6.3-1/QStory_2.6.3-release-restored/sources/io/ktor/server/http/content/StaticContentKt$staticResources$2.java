package io.ktor.server.http.content;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.server.application.InterfaceC4889;
import java.util.List;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.http.content.StaticContentKt$staticResources$2", m556f = "StaticContent.kt", m557l = {Opcodes.SHR_INT_LIT8}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class StaticContentKt$staticResources$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $basePackage;
    final /* synthetic */ InterfaceC7387 $cacheControl;
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ InterfaceC7387 $contentType;
    final /* synthetic */ String $defaultPath;
    final /* synthetic */ InterfaceC7387 $exclude;
    final /* synthetic */ List<String> $extensions;
    final /* synthetic */ String $index;
    final /* synthetic */ InterfaceC7380 $modifier;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$staticResources$2(String str, String str2, List<? extends CompressedFileType> list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, List<String> list2, String str3, InterfaceC5189<? super StaticContentKt$staticResources$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$index = str;
        this.$basePackage = str2;
        this.$compressedTypes = list;
        this.$contentType = interfaceC7387;
        this.$cacheControl = interfaceC73872;
        this.$modifier = interfaceC7380;
        this.$exclude = interfaceC73873;
        this.$extensions = list2;
        this.$defaultPath = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StaticContentKt$staticResources$2 staticContentKt$staticResources$2 = new StaticContentKt$staticResources$2(this.$index, this.$basePackage, this.$compressedTypes, this.$contentType, this.$cacheControl, this.$modifier, this.$exclude, this.$extensions, this.$defaultPath, interfaceC5189);
        staticContentKt$staticResources$2.L$0 = obj;
        return staticContentKt$staticResources$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC4889 interfaceC4889, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StaticContentKt$staticResources$2) create(interfaceC4889, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC4889 interfaceC4889 = (InterfaceC4889) this.L$0;
            String str = this.$index;
            String str2 = this.$basePackage;
            List<CompressedFileType> list = this.$compressedTypes;
            InterfaceC7387 interfaceC7387 = this.$contentType;
            InterfaceC7387 interfaceC73872 = this.$cacheControl;
            InterfaceC7380 interfaceC7380 = this.$modifier;
            InterfaceC7387 interfaceC73873 = this.$exclude;
            List<String> list2 = this.$extensions;
            String str3 = this.$defaultPath;
            this.label = 1;
            if (AbstractC4954.m9076(interfaceC4889, str, str2, list, interfaceC7387, interfaceC73872, interfaceC7380, interfaceC73873, list2, str3, this) == coroutineSingletons) {
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
