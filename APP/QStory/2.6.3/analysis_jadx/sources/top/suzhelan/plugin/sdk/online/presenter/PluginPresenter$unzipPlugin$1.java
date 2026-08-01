package top.suzhelan.plugin.sdk.online.presenter;

import com.bumptech.glide.AbstractC3066;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.internal.AbstractC5365;
import org.apache.commons.compress.archivers.zip.C5585;
import org.apache.commons.compress.archivers.zip.C5593;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p093.C7201;
import p095.C7207;
import p376.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1", f = "PluginPresenter.kt", l = {125}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PluginPresenter$unzipPlugin$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ String $desDirectory;
    final /* synthetic */ InterfaceC6558 $onEnd;
    final /* synthetic */ String $zipFilePath;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$unzipPlugin$1$1", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6558 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6558 interfaceC6558, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$onEnd = interfaceC6558;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$onEnd, interfaceC4357);
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
            this.$onEnd.invoke(Boolean.TRUE);
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$unzipPlugin$1(String str, String str2, InterfaceC6558 interfaceC6558, InterfaceC4357<? super PluginPresenter$unzipPlugin$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$zipFilePath = str;
        this.$desDirectory = str2;
        this.$onEnd = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new PluginPresenter$unzipPlugin$1(this.$zipFilePath, this.$desDirectory, this.$onEnd, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PluginPresenter$unzipPlugin$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        C5593 c5593;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
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
                    c5593 = new C5593(bufferedInputStream);
                } finally {
                }
                while (true) {
                    try {
                        C5585 c5585M10957 = c5593.m10957();
                        if (c5585M10957 == null) {
                            break;
                        }
                        String str3 = str2 + File.separator + c5585M10957.getName();
                        if (c5585M10957.isDirectory()) {
                            AbstractC3066.m6856(new File(str3));
                        } else {
                            AbstractC3066.m6856(new File(str3).getParentFile());
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                            try {
                                AbstractC8985.m14586(c5593, bufferedOutputStream);
                                bufferedOutputStream.close();
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                c5593.close();
                bufferedInputStream.close();
                fileInputStream.close();
                C7207 c7207 = AbstractC5395.f15030;
                C7201 c7201 = AbstractC5365.f14960;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onEnd, null);
                this.label = 1;
                if (AbstractC5399.m10470(c7201, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } finally {
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
