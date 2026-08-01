package top.suzhelan.sticker.sdk.presenter;

import com.bumptech.glide.load.engine.C3005;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.sticker.sdk.entity.StickerListResponse;
import top.suzhelan.sticker.sdk.net.StickerResult;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1", f = "StickerPresenter.kt", l = {91, 95}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class StickerPresenter$searchStickers$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $onData;
    final /* synthetic */ String $query;
    Object L$0;
    int label;
    final /* synthetic */ C5985 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6558 $onData;
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6558 interfaceC6558, StickerResult<StickerListResponse> stickerResult, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$onData = interfaceC6558;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$onData, this.$res, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.$onData.invoke(this.$res.getData().getList());
            return C5176.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;
        final /* synthetic */ C5985 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C5985 c5985, StickerResult<StickerListResponse> stickerResult, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c5985;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.this$0, this.$res, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            C3005 c3005 = this.this$0.f16305;
            StickerResult<StickerListResponse> stickerResult = this.$res;
            if (stickerResult == null || (message = stickerResult.getMessage()) == null) {
                message = "搜索失败";
            }
            c3005.m6494(message);
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$searchStickers$1(String str, InterfaceC6558 interfaceC6558, C5985 c5985, InterfaceC4357<? super StickerPresenter$searchStickers$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$query = str;
        this.$onData = interfaceC6558;
        this.this$0 = c5985;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new StickerPresenter$searchStickers$1(this.$query, this.$onData, this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StickerPresenter$searchStickers$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10470(r1, r2, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10470(r1, r3, r11) == r0) goto L21;
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r4
        L14:
            java.lang.Object r11 = r11.L$0
            top.suzhelan.sticker.sdk.net.StickerResult r11 = (top.suzhelan.sticker.sdk.net.StickerResult) r11
            kotlin.AbstractC5185.m10210(r12)
            goto L70
        L1c:
            kotlin.AbstractC5185.m10210(r12)
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
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5395.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5365.f14960
            top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1 r2 = new top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r5 = r11.$onData
            r2.<init>(r5, r12, r4)
            r11.L$0 = r4
            r11.label = r3
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10470(r1, r2, r11)
            if (r11 != r0) goto L70
            goto L6f
        L5a:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5395.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5365.f14960
            top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2 r3 = new top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2
            top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏哲兰 r5 = r11.this$0
            r3.<init>(r5, r12, r4)
            r11.L$0 = r4
            r11.label = r2
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10470(r1, r3, r11)
            if (r11 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5176.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
