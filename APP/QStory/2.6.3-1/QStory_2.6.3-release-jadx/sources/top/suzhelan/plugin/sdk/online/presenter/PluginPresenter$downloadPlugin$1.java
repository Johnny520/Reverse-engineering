package top.suzhelan.plugin.sdk.online.presenter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p023.AbstractC6957;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p401.C9895;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$downloadPlugin$1", m556f = "PluginPresenter.kt", m557l = {110}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PluginPresenter$downloadPlugin$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onEnd;
    final /* synthetic */ C9895 $plugin;
    final /* synthetic */ String $targetPath;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$downloadPlugin$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$downloadPlugin$1$2", m556f = "PluginPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07932 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7387 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07932(InterfaceC7387 interfaceC7387, InterfaceC5189<? super C07932> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7387;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07932(this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07932) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.TRUE);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$downloadPlugin$1(String str, C9895 c9895, InterfaceC7387 interfaceC7387, InterfaceC5189<? super PluginPresenter$downloadPlugin$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$targetPath = str;
        this.$plugin = c9895;
        this.$onEnd = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PluginPresenter$downloadPlugin$1(this.$targetPath, this.$plugin, this.$onEnd, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PluginPresenter$downloadPlugin$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            File file = new File(this.$targetPath);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            Object obj2 = PluginClientKt.getApiService().download(this.$plugin.getCloudId()).execute().f16101;
            obj2.getClass();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((AbstractC6957) obj2).m12077());
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bArr = new byte[2048];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, i2);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            bufferedInputStream.close();
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C07932 c07932 = new C07932(this.$onEnd, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC6231.m11029(c8030, c07932, this) == coroutineSingletons) {
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
