package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5207;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {119, 121}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ InterfaceC5207 $channel;
    final /* synthetic */ C1842 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C1842 c1842, InterfaceC5207 interfaceC5207, Context context, InterfaceC4357<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = c1842;
        this.$channel = interfaceC5207;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, interfaceC4357);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5318 interfaceC5318, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(interfaceC5318, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r4 = (kotlinx.coroutines.flow.InterfaceC5318) r4
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Throwable -> L19
        L17:
            r9 = r4
            goto L46
        L19:
            r9 = move-exception
            goto L91
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            r8 = 0
            return r8
        L23:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r4 = (kotlinx.coroutines.flow.InterfaceC5318) r4
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Throwable -> L19
            goto L58
        L2f:
            kotlin.AbstractC5185.m10210(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r9 = (kotlinx.coroutines.flow.InterfaceC5318) r9
            android.content.ContentResolver r1 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.飘花落叶言子兰世苏哲楪 r6 = r8.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r1 = r8.$channel     // Catch: java.lang.Throwable -> L19
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = r1.iterator()     // Catch: java.lang.Throwable -> L19
        L46:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r3     // Catch: java.lang.Throwable -> L19
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r1.m10264(r8)     // Catch: java.lang.Throwable -> L19
            if (r4 != r0) goto L55
            goto L86
        L55:
            r7 = r4
            r4 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L87
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1     // Catch: java.lang.Throwable -> L19
            r1.m10262()     // Catch: java.lang.Throwable -> L19
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L19
            androidx.collection.飘花落叶言子世兰楪苏哲 r5 = androidx.compose.ui.platform.AbstractC1838.f5340     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L19
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r4.emit(r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L17
        L86:
            return r0
        L87:
            android.content.ContentResolver r9 = r8.$resolver
            androidx.compose.ui.platform.飘花落叶言子兰世苏哲楪 r8 = r8.$contentObserver
            r9.unregisterContentObserver(r8)
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            return r8
        L91:
            android.content.ContentResolver r0 = r8.$resolver
            androidx.compose.ui.platform.飘花落叶言子兰世苏哲楪 r8 = r8.$contentObserver
            r0.unregisterContentObserver(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
