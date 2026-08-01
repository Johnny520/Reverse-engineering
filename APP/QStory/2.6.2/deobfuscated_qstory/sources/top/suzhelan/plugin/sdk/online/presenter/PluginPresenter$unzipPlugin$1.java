package top.suzhelan.plugin.sdk.online.presenter;

import io.ktor.client.plugins.AbstractC3932;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5364;
import org.apache.commons.compress.archivers.zip.C5584;
import org.apache.commons.compress.archivers.zip.C5592;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import p377.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1", f = "PluginPresenter.kt", l = {125}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PluginPresenter$unzipPlugin$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $desDirectory;
    final /* synthetic */ InterfaceC6557 $onEnd;
    final /* synthetic */ String $zipFilePath;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1$1", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6557 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6557 interfaceC6557, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onEnd = interfaceC6557;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onEnd, interfaceC4356);
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
            this.$onEnd.invoke(Boolean.TRUE);
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$unzipPlugin$1(String str, String str2, InterfaceC6557 interfaceC6557, InterfaceC4356<? super PluginPresenter$unzipPlugin$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$zipFilePath = str;
        this.$desDirectory = str2;
        this.$onEnd = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PluginPresenter$unzipPlugin$1(this.$zipFilePath, this.$desDirectory, this.$onEnd, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PluginPresenter$unzipPlugin$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        C5592 c5592;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
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
                    c5592 = new C5592(bufferedInputStream);
                } finally {
                }
                while (true) {
                    try {
                        C5584 c5584M10900 = c5592.m10900();
                        if (c5584M10900 == null) {
                            break;
                        }
                        String str3 = str2 + File.separator + c5584M10900.getName();
                        if (c5584M10900.isDirectory()) {
                            AbstractC3932.m8309(new File(str3));
                        } else {
                            AbstractC3932.m8309(new File(str3).getParentFile());
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                            try {
                                AbstractC8985.m14573(c5592, bufferedOutputStream);
                                bufferedOutputStream.close();
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                c5592.close();
                bufferedInputStream.close();
                fileInputStream.close();
                C7206 c7206 = AbstractC5394.f15030;
                C7200 c7200 = AbstractC5364.f14960;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onEnd, null);
                this.label = 1;
                if (AbstractC5398.m10466(c7200, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } finally {
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
