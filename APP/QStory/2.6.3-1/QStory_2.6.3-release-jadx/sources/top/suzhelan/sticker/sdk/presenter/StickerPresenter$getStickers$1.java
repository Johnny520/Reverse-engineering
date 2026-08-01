package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.load.engine.C3837;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.entity.StickerListResponse;
import top.suzhelan.sticker.sdk.net.StickerApiService;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerResult;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1", m556f = "StickerPresenter.kt", m557l = {61, 74, 78}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class StickerPresenter$getStickers$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $keyword;
    final /* synthetic */ InterfaceC7387 $onData;
    final /* synthetic */ String $sort;
    final /* synthetic */ String $tag;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C6815 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1$1", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08061 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ List<OnlineStickerInfo> $filtered;
        final /* synthetic */ InterfaceC7387 $onData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08061(InterfaceC7387 interfaceC7387, List<OnlineStickerInfo> list, InterfaceC5189<? super C08061> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onData = interfaceC7387;
            this.$filtered = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08061(this.$onData, this.$filtered, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08061) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onData.invoke(this.$filtered);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1$2", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08072 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ List<OnlineStickerInfo> $filtered;
        final /* synthetic */ InterfaceC7387 $onData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08072(InterfaceC7387 interfaceC7387, List<OnlineStickerInfo> list, InterfaceC5189<? super C08072> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onData = interfaceC7387;
            this.$filtered = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08072(this.$onData, this.$filtered, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08072) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onData.invoke(this.$filtered);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$getStickers$1$3", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08083 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ StickerResult<StickerListResponse> $res;
        int label;
        final /* synthetic */ C6815 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08083(C6815 c6815, StickerResult<StickerListResponse> stickerResult, InterfaceC5189<? super C08083> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6815;
            this.$res = stickerResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08083(this.this$0, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08083) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
                message = "加载失败";
            }
            c3837.m7054(message);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$getStickers$1(String str, String str2, C6815 c6815, String str3, InterfaceC7387 interfaceC7387, InterfaceC5189<? super StickerPresenter$getStickers$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$tag = str;
        this.$sort = str2;
        this.this$0 = c6815;
        this.$keyword = str3;
        this.$onData = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new StickerPresenter$getStickers$1(this.$tag, this.$sort, this.this$0, this.$keyword, this.$onData, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StickerPresenter$getStickers$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r2, r13) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r2, r13) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r14, r3, r13) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                } else if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC6017.m10769(obj);
        } else {
            AbstractC6017.m10769(obj);
            String strM696 = AbstractC0900.m696(this.$tag, this.$sort);
            if (this.this$0.f16646.containsKey(strM696)) {
                C6815 c6815 = this.this$0;
                Object obj2 = c6815.f16646.get(strM696);
                obj2.getClass();
                List listM11920 = C6815.m11920(c6815, (List) obj2, this.$keyword);
                C8036 c8036 = AbstractC6227.f15375;
                C8030 c8030 = AbstractC6197.f15305;
                C08061 c08061 = new C08061(this.$onData, listM11920, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
            } else {
                StickerResult stickerResult = (StickerResult) StickerApiService.getStickerList$default(StickerClientKt.getStickerApiService(), 0, 50, AbstractC5227.m9466(this.$tag, "全部") ? null : this.$tag, this.$sort, 1, null).execute().f16101;
                if (stickerResult == null || !stickerResult.isSuccess() || stickerResult.getData() == null) {
                    C8036 c80362 = AbstractC6227.f15375;
                    C8030 c80302 = AbstractC6197.f15305;
                    C08083 c08083 = new C08083(this.this$0, stickerResult, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                } else {
                    this.this$0.f16646.put(strM696, ((StickerListResponse) stickerResult.getData()).getList());
                    List listM119202 = C6815.m11920(this.this$0, ((StickerListResponse) stickerResult.getData()).getList(), this.$keyword);
                    C8036 c80363 = AbstractC6227.f15375;
                    C8030 c80303 = AbstractC6197.f15305;
                    C08072 c08072 = new C08072(this.$onData, listM119202, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
            }
        }
        return C6008.f15084;
    }
}
