package lin.xposed.hook.javaplugin.online.upload;

import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.io.IOException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5403;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.internal.AbstractC5364;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.online.upload.UploadPlugin;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p015.AbstractC6206;
import p015.C6197;
import p015.C6217;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import p095.ExecutorC7207;
import p253.AbstractC8189;
import p257.C8197;
import p257.C8207;
import p257.RunnableC8201;
import p316.C8675;
import top.suzhelan.plugin.sdk.online.net.ApiService;
import top.suzhelan.plugin.sdk.online.net.PluginClient;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/io/File;", "pluginZipFile", "Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "", "uploadToNet", "(Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "Llin/xposed/hook/javaplugin/bean/PluginInfo;", "plugin", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "upload", "(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "TAG", "Ljava/lang/String;", "L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;", "waitDialog", "L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "exceptionHandler", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "scope", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class UploadPlugin {
    public static final int $stable = 8;
    private final String TAG = "UploadPlugin";
    private final InterfaceC5403 exceptionHandler;
    private final InterfaceC5400 scope;
    private final C8197 waitDialog;

    /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1", f = "UploadPlugin.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ PluginInfo $plugin;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
        @InterfaceC6861(c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1", f = "UploadPlugin.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C55351 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ QSResult<String> $res;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C55351(QSResult<String> qSResult, InterfaceC4356<? super C55351> interfaceC4356) {
                super(2, interfaceC4356);
                this.$res = qSResult;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(C8207 c8207, View view) {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$1(C8207 c8207, View view) {
                return false;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new C55351(this.$res, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((C55351) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                if (this.$res.getStatus() == 200) {
                    final int i = 0;
                    C8207.m13712(this.$res.getMessage(), "\u4e0a\u4f20\u6210\u529f").mo13702("\u786e\u5b9a", new InterfaceC3749() { // from class: lin.xposed.hook.javaplugin.online.upload.飘花落叶言子楪世苏哲兰
                        @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
                        public final boolean onClick(AbstractC3737 abstractC3737, View view) {
                            C8207 c8207 = (C8207) abstractC3737;
                            switch (i) {
                                case 0:
                                    return UploadPlugin.AnonymousClass1.C55351.invokeSuspend$lambda$0(c8207, view);
                                default:
                                    return UploadPlugin.AnonymousClass1.C55351.invokeSuspend$lambda$1(c8207, view);
                            }
                        }
                    });
                } else {
                    final int i2 = 1;
                    C8207.m13712(this.$res.getMessage(), "\u4e0a\u4f20\u5931\u8d25").mo13702("\u786e\u5b9a", new InterfaceC3749() { // from class: lin.xposed.hook.javaplugin.online.upload.飘花落叶言子楪世苏哲兰
                        @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
                        public final boolean onClick(AbstractC3737 abstractC3737, View view) {
                            C8207 c8207 = (C8207) abstractC3737;
                            switch (i2) {
                                case 0:
                                    return UploadPlugin.AnonymousClass1.C55351.invokeSuspend$lambda$0(c8207, view);
                                default:
                                    return UploadPlugin.AnonymousClass1.C55351.invokeSuspend$lambda$1(c8207, view);
                            }
                        }
                    });
                }
                return C5175.f14739;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PluginInfo pluginInfo, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$plugin = pluginInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return UploadPlugin.this.new AnonymousClass1(this.$plugin, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5175 c5175 = C5175.f14739;
            if (i != 0) {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                return c5175;
            }
            AbstractC5184.m10206(obj);
            String strM8321 = AbstractC3932.m8321("Plugin");
            "getModuleCachePath(...)";
            strM8321.getClass();
            PluginSdkConfig.setDOWNLOAD_DIR(strM8321);
            PluginSdkConfig.setINSTALL_DIR(AbstractC3932.m8313().concat("/Plugin"));
            String currentUin = QQEnvTool.getCurrentUin();
            "getCurrentUin(...)";
            currentUin.getClass();
            PluginSdkConfig.setUSER_UIN(currentUin);
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            "getCurrentAccountNickName(...)";
            currentAccountNickName.getClass();
            PluginSdkConfig.setUSER_NICKNAME(currentAccountNickName);
            UploadPlugin.this.waitDialog.m13695();
            C8197 c8197 = UploadPlugin.this.waitDialog;
            c8197.f22575 = "\u4e0a\u4f20\u4e2d-\u8fd0\u884c\u811a\u672c\u4e2d...";
            c8197.m13694();
            PluginManager.stopPlugin(this.$plugin);
            if (!PluginManager.loadPlugin(null, this.$plugin)) {
                C8207.m13712("\u6267\u884c\u811a\u672c\u65f6\u51fa\u73b0\u5f02\u5e38", "\u4e0a\u4f20\u5931\u8d25");
                return c5175;
            }
            PluginManager.stopPlugin(this.$plugin);
            C8197 c81972 = UploadPlugin.this.waitDialog;
            c81972.f22575 = "\u538b\u7f29\u4e2d...";
            c81972.m13694();
            String pluginLocalPath = this.$plugin.getPluginLocalPath();
            File file = new File(AbstractC3932.m8321("Plugin"), System.currentTimeMillis() + ".zip");
            AbstractC3054.m6616(pluginLocalPath, file.getAbsolutePath());
            C8197 c81973 = UploadPlugin.this.waitDialog;
            c81973.f22575 = "\u4e0a\u4f20\u4e2d...";
            c81973.m13694();
            QSResult qSResultUploadToNet = UploadPlugin.this.uploadToNet(file);
            C8197 c81974 = UploadPlugin.this.waitDialog;
            c81974.f11579 = false;
            AbstractC3737.m8043(new RunnableC8201(c81974, 2));
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            C55351 c55351 = new C55351(qSResultUploadToNet, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            return AbstractC5398.m10466(c7200, c55351, this) == coroutineSingletons ? coroutineSingletons : c5175;
        }
    }

    public UploadPlugin() {
        C8197 c8197 = new C8197();
        "build(...)";
        this.waitDialog = c8197;
        UploadPlugin$special$$inlined$CoroutineExceptionHandler$1 uploadPlugin$special$$inlined$CoroutineExceptionHandler$1 = new UploadPlugin$special$$inlined$CoroutineExceptionHandler$1(C5432.f15082, this);
        this.exceptionHandler = uploadPlugin$special$$inlined$CoroutineExceptionHandler$1;
        C7206 c7206 = AbstractC5394.f15030;
        this.scope = AbstractC5398.m10485(ExecutorC7207.f19230.plus(uploadPlugin$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QSResult<String> uploadToNet(File pluginZipFile) {
        ApiService apiService = PluginClient.getApiService();
        int i = AbstractC6206.f17028;
        Regex regex = C6217.f17098;
        C6217 c6217M13679 = AbstractC8189.m13679("multipart/form-data");
        pluginZipFile.getClass();
        Object obj = apiService.uploadFile(AbstractC0455.m1169("file", pluginZipFile.getName(), new C6197(c6217M13679, pluginZipFile)), C8675.m14360(PluginSdkConfig.getUSER_UIN(), AbstractC8189.m13679("text/plain")), C8675.m14360(PluginSdkConfig.getUSER_NICKNAME(), AbstractC8189.m13679("text/plain"))).execute().f15756;
        obj.getClass();
        return (QSResult) obj;
    }

    public final InterfaceC5451 upload(PluginInfo plugin) {
        "plugin";
        plugin.getClass();
        return AbstractC5398.m10473(this.scope, null, null, new AnonymousClass1(plugin, null), 3);
    }
}
