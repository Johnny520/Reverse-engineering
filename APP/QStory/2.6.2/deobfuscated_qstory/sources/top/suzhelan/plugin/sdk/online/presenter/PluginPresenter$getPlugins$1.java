package top.suzhelan.plugin.sdk.online.presenter;

import com.bumptech.glide.load.engine.C3004;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import lin.xposed.hook.javaplugin.view.C5548;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p257.C8197;
import p257.C8207;
import p257.C8226;
import p257.RunnableC8233;
import p388.C9099;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1", f = "PluginPresenter.kt", l = {59, 70, 74}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PluginPresenter$getPlugins$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $onData;
    final /* synthetic */ String $sort;
    final /* synthetic */ String $tag;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5804 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$1", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ String $key;
        final /* synthetic */ InterfaceC6557 $onData;
        int label;
        final /* synthetic */ C5804 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6557 interfaceC6557, C5804 c5804, String str, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onData = interfaceC6557;
            this.this$0 = c5804;
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onData, this.this$0, this.$key, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            InterfaceC6557 interfaceC6557 = this.$onData;
            Object obj2 = this.this$0.f15916.get(this.$key);
            obj2.getClass();
            interfaceC6557.invoke(obj2);
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$2", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6557 $onData;
        final /* synthetic */ QSResult<List<C9099>> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC6557 interfaceC6557, QSResult<List<C9099>> qSResult, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onData = interfaceC6557;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$onData, this.$res, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$onData.invoke(this.$res.getData());
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$3", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ QSResult<List<C9099>> $res;
        int label;
        final /* synthetic */ C5804 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C5804 c5804, QSResult<List<C9099>> qSResult, InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c5804;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass3(this.this$0, this.$res, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            C3004 c3004 = this.this$0.f15920;
            QSResult<List<C9099>> qSResult = this.$res;
            String message = qSResult != null ? qSResult.getMessage() : null;
            message.getClass();
            C8197.m13693();
            C8226 c8226 = (C8226) c3004.f9535;
            c8226.getClass();
            AbstractC3737.m8043(new RunnableC8233(c8226, 1));
            C8207.m13712(message, "错误").mo13702("确定", new C5548(5));
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$getPlugins$1(String str, String str2, C5804 c5804, InterfaceC6557 interfaceC6557, InterfaceC4356<? super PluginPresenter$getPlugins$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$tag = str;
        this.$sort = str2;
        this.this$0 = c5804;
        this.$onData = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PluginPresenter$getPlugins$1(this.$tag, this.$sort, this.this$0, this.$onData, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PluginPresenter$getPlugins$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r1, r2, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r9, r2, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r9, r3, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        return r0;
     */
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
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L11
            goto L17
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r5
        L17:
            java.lang.Object r0 = r8.L$1
            top.suzhelan.plugin.sdk.online.net.QSResult r0 = (top.suzhelan.plugin.sdk.online.net.QSResult) r0
        L1b:
            java.lang.Object r8 = r8.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.AbstractC5184.m10206(r9)
            goto Lb1
        L24:
            kotlin.AbstractC5184.m10206(r9)
            java.lang.String r9 = r8.$tag
            java.lang.String r1 = r8.$sort
            java.lang.String r9 = androidx.activity.AbstractC0053.m136(r9, r1)
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏 r1 = r8.this$0
            java.util.LinkedHashMap r1 = r1.f15916
            boolean r1 = r1.containsKey(r9)
            if (r1 == 0) goto L51
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5394.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5364.f14960
            top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$1 r2 = new top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r3 = r8.$onData
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏 r6 = r8.this$0
            r2.<init>(r3, r6, r9, r5)
            r8.L$0 = r5
            r8.label = r4
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10466(r1, r2, r8)
            if (r8 != r0) goto Lb1
            goto Lb0
        L51:
            top.suzhelan.plugin.sdk.online.net.ApiService r1 = top.suzhelan.plugin.sdk.online.net.PluginClientKt.getApiService()
            java.lang.String r4 = top.suzhelan.plugin.sdk.online.net.PluginSdkConfig.getUSER_UIN()
            java.lang.String r6 = r8.$sort
            java.lang.String r7 = r8.$tag
            retrofit2.飘花落叶言子楪世兰苏哲 r1 = r1.getOnlinePluginList(r4, r6, r7)
            retrofit2.飘花落叶言子世兰楪哲苏 r1 = r1.execute()
            java.lang.Object r1 = r1.f15756
            top.suzhelan.plugin.sdk.online.net.QSResult r1 = (top.suzhelan.plugin.sdk.online.net.QSResult) r1
            if (r1 == 0) goto L99
            int r4 = r1.getStatus()
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 != r6) goto L99
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏 r2 = r8.this$0
            java.util.LinkedHashMap r2 = r2.f15916
            java.lang.Object r4 = r1.getData()
            r4.getClass()
            r2.put(r9, r4)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r9 = kotlinx.coroutines.AbstractC5394.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r9 = kotlinx.coroutines.internal.AbstractC5364.f14960
            top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$2 r2 = new top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$2
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r8.$onData
            r2.<init>(r4, r1, r5)
            r8.L$0 = r5
            r8.L$1 = r5
            r8.label = r3
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10466(r9, r2, r8)
            if (r8 != r0) goto Lb1
            goto Lb0
        L99:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r9 = kotlinx.coroutines.AbstractC5394.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r9 = kotlinx.coroutines.internal.AbstractC5364.f14960
            top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$3 r3 = new top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$3
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏 r4 = r8.this$0
            r3.<init>(r4, r1, r5)
            r8.L$0 = r5
            r8.L$1 = r5
            r8.label = r2
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10466(r9, r3, r8)
            if (r8 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
