package top.suzhelan.sticker.sdk.presenter;

import com.bumptech.glide.load.engine.C3004;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.sticker.sdk.entity.StickerListResponse;
import top.suzhelan.sticker.sdk.net.StickerResult;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1", f = "StickerPresenter.kt", l = {91, 95}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class StickerPresenter$searchStickers$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $onData;
    final /* synthetic */ String $query;
    Object L$0;
    int label;
    final /* synthetic */ C5979 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6557 $onData;
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6557 interfaceC6557, StickerResult<StickerListResponse> stickerResult, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onData = interfaceC6557;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onData, this.$res, interfaceC4356);
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
            this.$onData.invoke(this.$res.getData().getList());
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;
        final /* synthetic */ C5979 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C5979 c5979, StickerResult<StickerListResponse> stickerResult, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c5979;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.this$0, this.$res, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            C3004 c3004 = this.this$0.f16296;
            StickerResult<StickerListResponse> stickerResult = this.$res;
            if (stickerResult == null || (message = stickerResult.getMessage()) == null) {
                message = "搜索失败";
            }
            c3004.m6434(message);
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$searchStickers$1(String str, InterfaceC6557 interfaceC6557, C5979 c5979, InterfaceC4356<? super StickerPresenter$searchStickers$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$query = str;
        this.$onData = interfaceC6557;
        this.this$0 = c5979;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new StickerPresenter$searchStickers$1(this.$query, this.$onData, this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StickerPresenter$searchStickers$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r1, r2, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r1, r3, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            if (r1 != r2) goto Le
            goto L14
        Le:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r4
        L14:
            java.lang.Object r11 = r11.L$0
            top.suzhelan.sticker.sdk.net.StickerResult r11 = (top.suzhelan.sticker.sdk.net.StickerResult) r11
            kotlin.AbstractC5184.m10206(r12)
            goto L70
        L1c:
            kotlin.AbstractC5184.m10206(r12)
            top.suzhelan.sticker.sdk.net.StickerApiService r5 = top.suzhelan.sticker.sdk.net.StickerClientKt.getStickerApiService()
            java.lang.String r6 = r11.$query
            r9 = 2
            r10 = 0
            r7 = 0
            r8 = 50
            retrofit2.飘花落叶言子楪世兰苏哲 r12 = top.suzhelan.sticker.sdk.net.StickerApiService.searchStickers$default(r5, r6, r7, r8, r9, r10)
            retrofit2.飘花落叶言子世兰楪哲苏 r12 = r12.execute()
            java.lang.Object r12 = r12.f15756
            top.suzhelan.sticker.sdk.net.StickerResult r12 = (top.suzhelan.sticker.sdk.net.StickerResult) r12
            if (r12 == 0) goto L5a
            boolean r1 = r12.isSuccess()
            if (r1 != r3) goto L5a
            java.lang.Object r1 = r12.getData()
            if (r1 == 0) goto L5a
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5394.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5364.f14960
            top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1 r2 = new top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r5 = r11.$onData
            r2.<init>(r5, r12, r4)
            r11.L$0 = r4
            r11.label = r3
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5398.m10466(r1, r2, r11)
            if (r11 != r0) goto L70
            goto L6f
        L5a:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5394.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5364.f14960
            top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2 r3 = new top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2
            top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏哲兰 r5 = r11.this$0
            r3.<init>(r5, r12, r4)
            r11.L$0 = r4
            r11.label = r2
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5398.m10466(r1, r3, r11)
            if (r11 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
