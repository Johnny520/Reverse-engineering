package top.suzhelan.plugin.sdk.online.presenter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import p015.AbstractC6201;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import p388.C9099;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$downloadPlugin$1", f = "PluginPresenter.kt", l = {110}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PluginPresenter$downloadPlugin$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $onEnd;
    final /* synthetic */ C9099 $plugin;
    final /* synthetic */ String $targetPath;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$downloadPlugin$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.PluginPresenter$downloadPlugin$1$2", f = "PluginPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6557 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC6557 interfaceC6557, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onEnd = interfaceC6557;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$onEnd, interfaceC4356);
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
            this.$onEnd.invoke(Boolean.TRUE);
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginPresenter$downloadPlugin$1(String str, C9099 c9099, InterfaceC6557 interfaceC6557, InterfaceC4356<? super PluginPresenter$downloadPlugin$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$targetPath = str;
        this.$plugin = c9099;
        this.$onEnd = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PluginPresenter$downloadPlugin$1(this.$targetPath, this.$plugin, this.$onEnd, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PluginPresenter$downloadPlugin$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            File file = new File(this.$targetPath);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            Object obj2 = PluginClientKt.getApiService().download(this.$plugin.getCloudId()).execute().f15756;
            obj2.getClass();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((AbstractC6201) obj2).m11647());
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
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onEnd, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC5398.m10466(c7200, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
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
