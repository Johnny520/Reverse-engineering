package top.suzhelan.sticker.sdk.presenter;

import com.bumptech.glide.load.engine.C3837;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.StickerListResponse;
import top.suzhelan.sticker.sdk.net.StickerApiService;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerResult;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1", m556f = "StickerPresenter.kt", m557l = {91, 95}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class StickerPresenter$searchStickers$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onData;
    final /* synthetic */ String $query;
    Object L$0;
    int label;
    final /* synthetic */ C6815 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$1", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08101 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7387 $onData;
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08101(InterfaceC7387 interfaceC7387, StickerResult<StickerListResponse> stickerResult, InterfaceC5189<? super C08101> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onData = interfaceC7387;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08101(this.$onData, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08101) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onData.invoke(this.$res.getData().getList());
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$searchStickers$1$2", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08112 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;
        final /* synthetic */ C6815 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08112(C6815 c6815, StickerResult<StickerListResponse> stickerResult, InterfaceC5189<? super C08112> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6815;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08112(this.this$0, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08112) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C3837 c3837 = this.this$0.f16650;
            StickerResult<StickerListResponse> stickerResult = this.$res;
            if (stickerResult == null || (message = stickerResult.getMessage()) == null) {
                message = "搜索失败";
            }
            c3837.m7054(message);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$searchStickers$1(String str, InterfaceC7387 interfaceC7387, C6815 c6815, InterfaceC5189<? super StickerPresenter$searchStickers$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$query = str;
        this.$onData = interfaceC7387;
        this.this$0 = c6815;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new StickerPresenter$searchStickers$1(this.$query, this.$onData, this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StickerPresenter$searchStickers$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r2, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r3, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            StickerResult stickerResult = (StickerResult) StickerApiService.searchStickers$default(StickerClientKt.getStickerApiService(), this.$query, 0, 50, 2, null).execute().f16101;
            if (stickerResult == null || !stickerResult.isSuccess() || stickerResult.getData() == null) {
                C8036 c8036 = AbstractC6227.f15375;
                C8030 c8030 = AbstractC6197.f15305;
                C08112 c08112 = new C08112(this.this$0, stickerResult, null);
                this.L$0 = null;
                this.label = 2;
            } else {
                C8036 c80362 = AbstractC6227.f15375;
                C8030 c80302 = AbstractC6197.f15305;
                C08101 c08101 = new C08101(this.$onData, stickerResult, null);
                this.L$0 = null;
                this.label = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
