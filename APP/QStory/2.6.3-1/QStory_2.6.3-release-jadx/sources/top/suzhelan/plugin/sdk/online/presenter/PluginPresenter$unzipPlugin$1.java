package top.suzhelan.plugin.sdk.online.presenter;

import com.bumptech.glide.AbstractC3898;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import org.apache.commons.compress.archivers.zip.C6415;
import org.apache.commons.compress.archivers.zip.C6423;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p392.AbstractC9814;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1", m556f = "PluginPresenter.kt", m557l = {125}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PluginPresenter$unzipPlugin$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $desDirectory;
    final /* synthetic */ InterfaceC7387 $onEnd;
    final /* synthetic */ String $zipFilePath;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1$1", m556f = "PluginPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07981 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7387 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07981(InterfaceC7387 interfaceC7387, InterfaceC5189<? super C07981> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7387;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07981(this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07981) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
    public PluginPresenter$unzipPlugin$1(String str, String str2, InterfaceC7387 interfaceC7387, InterfaceC5189<? super PluginPresenter$unzipPlugin$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$zipFilePath = str;
        this.$desDirectory = str2;
        this.$onEnd = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PluginPresenter$unzipPlugin$1(this.$zipFilePath, this.$desDirectory, this.$onEnd, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PluginPresenter$unzipPlugin$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        C6423 c6423;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            String str = this.$zipFilePath;
            String str2 = this.$desDirectory;
            str.getClass();
            str2.getClass();
            File file = new File(str2);
            if (!file.exists() && !file.mkdirs()) {
                throw new Exception("创建解压目标文件夹失败");
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    c6423 = new C6423(bufferedInputStream);
                } finally {
                }
                while (true) {
                    try {
                        C6415 c6415M11516 = c6423.m11516();
                        if (c6415M11516 == null) {
                            break;
                        }
                        String str3 = str2 + File.separator + c6415M11516.getName();
                        if (c6415M11516.isDirectory()) {
                            AbstractC3898.m7416(new File(str3));
                        } else {
                            AbstractC3898.m7416(new File(str3).getParentFile());
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                            try {
                                AbstractC9814.m15145(c6423, bufferedOutputStream);
                                bufferedOutputStream.close();
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                c6423.close();
                bufferedInputStream.close();
                fileInputStream.close();
                C8036 c8036 = AbstractC6227.f15375;
                C8030 c8030 = AbstractC6197.f15305;
                C07981 c07981 = new C07981(this.$onEnd, null);
                this.label = 1;
                if (AbstractC6231.m11029(c8030, c07981, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } finally {
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
