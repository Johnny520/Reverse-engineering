package top.suzhelan.plugin.sdk.online.presenter;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.load.engine.C3837;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import lin.xposed.hook.javaplugin.view.C6380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p273.C9027;
import p273.C9037;
import p273.C9056;
import p273.RunnableC9063;
import p401.C9895;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1", m556f = "PluginPresenter.kt", m557l = {59, 70, 74}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PluginPresenter$getPlugins$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onData;
    final /* synthetic */ String $sort;
    final /* synthetic */ String $tag;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6635 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$1", m556f = "PluginPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07941 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ String $key;
        final /* synthetic */ InterfaceC7387 $onData;
        int label;
        final /* synthetic */ C6635 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07941(InterfaceC7387 interfaceC7387, C6635 c6635, String str, InterfaceC5189<? super C07941> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onData = interfaceC7387;
            this.this$0 = c6635;
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07941(this.$onData, this.this$0, this.$key, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07941) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            InterfaceC7387 interfaceC7387 = this.$onData;
            Object obj2 = this.this$0.f16261.get(this.$key);
            obj2.getClass();
            interfaceC7387.invoke(obj2);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$2", m556f = "PluginPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07952 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7387 $onData;
        final /* synthetic */ QSResult<List<C9895>> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07952(InterfaceC7387 interfaceC7387, QSResult<List<C9895>> qSResult, InterfaceC5189<? super C07952> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onData = interfaceC7387;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07952(this.$onData, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07952) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onData.invoke(this.$res.getData());
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$getPlugins$1$3", m556f = "PluginPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07963 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ QSResult<List<C9895>> $res;
        int label;
        final /* synthetic */ C6635 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07963(C6635 c6635, QSResult<List<C9895>> qSResult, InterfaceC5189<? super C07963> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6635;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07963(this.this$0, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07963) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C3837 c3837 = this.this$0.f16265;
            QSResult<List<C9895>> qSResult = this.$res;
            String message = qSResult != null ? qSResult.getMessage() : null;
            message.getClass();
            C9027.m14269();
            C9056 c9056 = (C9056) c3837.f9882;
            c9056.getClass();
            AbstractC4570.m8589(new RunnableC9063(c9056, 1));
            C9037.m14288(message, "错误").mo14278("确定", new C6380(5));
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$getPlugins$1(String str, String str2, C6635 c6635, InterfaceC7387 interfaceC7387, InterfaceC5189<? super PluginPresenter$getPlugins$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$tag = str;
        this.$sort = str2;
        this.this$0 = c6635;
        this.$onData = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PluginPresenter$getPlugins$1(this.$tag, this.$sort, this.this$0, this.$onData, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PluginPresenter$getPlugins$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r2, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r9, r2, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r9, r3, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
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
                if (i != 2 && i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC6017.m10769(obj);
        } else {
            AbstractC6017.m10769(obj);
            String strM696 = AbstractC0900.m696(this.$tag, this.$sort);
            if (this.this$0.f16261.containsKey(strM696)) {
                C8036 c8036 = AbstractC6227.f15375;
                C8030 c8030 = AbstractC6197.f15305;
                C07941 c07941 = new C07941(this.$onData, this.this$0, strM696, null);
                this.L$0 = null;
                this.label = 1;
            } else {
                QSResult qSResult = (QSResult) PluginClientKt.getApiService().getOnlinePluginList(PluginSdkConfig.getUSER_UIN(), this.$sort, this.$tag).execute().f16101;
                if (qSResult == null || qSResult.getStatus() != 200) {
                    C8036 c80362 = AbstractC6227.f15375;
                    C8030 c80302 = AbstractC6197.f15305;
                    C07963 c07963 = new C07963(this.this$0, qSResult, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                } else {
                    LinkedHashMap linkedHashMap = this.this$0.f16261;
                    Object data = qSResult.getData();
                    data.getClass();
                    linkedHashMap.put(strM696, data);
                    C8036 c80363 = AbstractC6227.f15375;
                    C8030 c80303 = AbstractC6197.f15305;
                    C07952 c07952 = new C07952(this.$onData, qSResult, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                }
            }
        }
        return C6008.f15084;
    }
}
