package androidx.compose.p001ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import androidx.collection.C1083;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m556f = "WindowRecomposer.android.kt", m557l = {119, 121}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ C2677 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C2677 c2677, InterfaceC6039 interfaceC6039, Context context, InterfaceC5189<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = c2677;
        this.$channel = interfaceC6039;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, interfaceC5189);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r4.emit(r5, r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:18:0x0046, B:22:0x0058, B:24:0x0060, B:14:0x002b, B:17:0x0040), top: B:31:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6150 interfaceC6150;
        InterfaceC6150 interfaceC61502;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 it;
        Object objM10823;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC6150 = (InterfaceC6150) this.L$0;
                this.$resolver.registerContentObserver(this.$animationScaleUri, false, this.$contentObserver);
                it = this.$channel.iterator();
                this.L$0 = interfaceC6150;
                this.L$1 = it;
                this.label = 1;
                C6023 c6023 = (C6023) it;
                objM10823 = c6023.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
            } else if (i == 1) {
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
                interfaceC61502 = (InterfaceC6150) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6044 = interfaceC60442;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$1;
                interfaceC61502 = (InterfaceC6150) this.L$0;
                AbstractC6017.m10769(obj);
                InterfaceC6044 interfaceC60444 = interfaceC60443;
                interfaceC6150 = interfaceC61502;
                it = interfaceC60444;
                this.L$0 = interfaceC6150;
                this.L$1 = it;
                this.label = 1;
                C6023 c60232 = (C6023) it;
                objM10823 = c60232.m10823(this);
                if (objM10823 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC61502 = interfaceC6150;
                obj = objM10823;
                interfaceC6044 = c60232;
                if (((Boolean) obj).booleanValue()) {
                    this.$resolver.unregisterContentObserver(this.$contentObserver);
                    return C6008.f15084;
                }
                C6023 c60233 = (C6023) interfaceC6044;
                c60233.m10821();
                Context context = this.$applicationContext;
                C1083 c1083 = AbstractC2673.f5685;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.L$0 = interfaceC61502;
                this.L$1 = c60233;
                this.label = 2;
                interfaceC60444 = c60233;
            }
        } catch (Throwable th) {
            this.$resolver.unregisterContentObserver(this.$contentObserver);
            throw th;
        }
    }
}
