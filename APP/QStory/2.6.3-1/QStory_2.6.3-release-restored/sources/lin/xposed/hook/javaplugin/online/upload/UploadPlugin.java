package lin.xposed.hook.javaplugin.online.upload;

import android.view.View;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.AbstractC3898;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6236;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.internal.AbstractC6197;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.online.upload.UploadPlugin;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p023.AbstractC6962;
import p023.C6953;
import p023.C6973;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p111.ExecutorC8037;
import p273.C9027;
import p273.C9037;
import p273.RunnableC9031;
import top.suzhelan.plugin.sdk.online.net.ApiService;
import top.suzhelan.plugin.sdk.online.net.PluginClient;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m151d2 = {"Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/io/File;", "pluginZipFile", "Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "", "uploadToNet", "(Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "Llin/xposed/hook/javaplugin/bean/PluginInfo;", "plugin", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "upload", "(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "TAG", "Ljava/lang/String;", "L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;", "waitDialog", "L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "exceptionHandler", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "scope", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class UploadPlugin {
    public static final int $stable = 8;
    private final String TAG = "UploadPlugin";
    private final InterfaceC6236 exceptionHandler;
    private final InterfaceC6233 scope;
    private final C9027 waitDialog;

    /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1", m556f = "UploadPlugin.kt", m557l = {88}, m558m = "invokeSuspend", m559v = 2)
    public static final class C04141 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ PluginInfo $plugin;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
        @InterfaceC7691(m555c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1", m556f = "UploadPlugin.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ QSResult<String> $res;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(QSResult<String> qSResult, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$res = qSResult;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(C9037 c9037, View view) {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$1(C9037 c9037, View view) {
                return false;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(this.$res, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                if (this.$res.getStatus() == 200) {
                    final int i = 0;
                    C9037.m14288(this.$res.getMessage(), "上传成功").mo14278("确定", new InterfaceC4582() { // from class: lin.xposed.hook.javaplugin.online.upload.飘花落叶言子楪世苏哲兰
                        @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
                        public final boolean onClick(AbstractC4570 abstractC4570, View view) {
                            C9037 c9037 = (C9037) abstractC4570;
                            switch (i) {
                                case 0:
                                    return UploadPlugin.C04141.AnonymousClass1.invokeSuspend$lambda$0(c9037, view);
                                default:
                                    return UploadPlugin.C04141.AnonymousClass1.invokeSuspend$lambda$1(c9037, view);
                            }
                        }
                    });
                } else {
                    final int i2 = 1;
                    C9037.m14288(this.$res.getMessage(), "上传失败").mo14278("确定", new InterfaceC4582() { // from class: lin.xposed.hook.javaplugin.online.upload.飘花落叶言子楪世苏哲兰
                        @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
                        public final boolean onClick(AbstractC4570 abstractC4570, View view) {
                            C9037 c9037 = (C9037) abstractC4570;
                            switch (i2) {
                                case 0:
                                    return UploadPlugin.C04141.AnonymousClass1.invokeSuspend$lambda$0(c9037, view);
                                default:
                                    return UploadPlugin.C04141.AnonymousClass1.invokeSuspend$lambda$1(c9037, view);
                            }
                        }
                    });
                }
                return C6008.f15084;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04141(PluginInfo pluginInfo, InterfaceC5189<? super C04141> interfaceC5189) {
            super(2, interfaceC5189);
            this.$plugin = pluginInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return UploadPlugin.this.new C04141(this.$plugin, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C04141) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            if (i != 0) {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                return c6008;
            }
            AbstractC6017.m10769(obj);
            String strM8870 = AbstractC4765.m8870("Plugin");
            "getModuleCachePath(...)";
            strM8870.getClass();
            PluginSdkConfig.setDOWNLOAD_DIR(strM8870);
            PluginSdkConfig.setINSTALL_DIR(AbstractC4765.m8874().concat("/Plugin"));
            String currentUin = QQEnvTool.getCurrentUin();
            "getCurrentUin(...)";
            currentUin.getClass();
            PluginSdkConfig.setUSER_UIN(currentUin);
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            "getCurrentAccountNickName(...)";
            currentAccountNickName.getClass();
            PluginSdkConfig.setUSER_NICKNAME(currentAccountNickName);
            UploadPlugin.this.waitDialog.m14271();
            C9027 c9027 = UploadPlugin.this.waitDialog;
            c9027.f22919 = "上传中-运行脚本中...";
            c9027.m14270();
            PluginManager.stopPlugin(this.$plugin);
            if (!PluginManager.loadPlugin(null, this.$plugin)) {
                C9037.m14288("执行脚本时出现异常", "上传失败");
                return c6008;
            }
            PluginManager.stopPlugin(this.$plugin);
            C9027 c90272 = UploadPlugin.this.waitDialog;
            c90272.f22919 = "压缩中...";
            c90272.m14270();
            String pluginLocalPath = this.$plugin.getPluginLocalPath();
            File file = new File(AbstractC4765.m8870("Plugin"), System.currentTimeMillis() + ".zip");
            AbstractC7390.m12610(pluginLocalPath, file.getAbsolutePath());
            C9027 c90273 = UploadPlugin.this.waitDialog;
            c90273.f22919 = "上传中...";
            c90273.m14270();
            QSResult qSResultUploadToNet = UploadPlugin.this.uploadToNet(file);
            C9027 c90274 = UploadPlugin.this.waitDialog;
            c90274.f11929 = false;
            AbstractC4570.m8589(new RunnableC9031(c90274, 2));
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(qSResultUploadToNet, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            return AbstractC6231.m11029(c8030, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : c6008;
        }
    }

    public UploadPlugin() {
        C9027 c9027 = new C9027();
        "build(...)";
        this.waitDialog = c9027;
        UploadPlugin$special$$inlined$CoroutineExceptionHandler$1 uploadPlugin$special$$inlined$CoroutineExceptionHandler$1 = new UploadPlugin$special$$inlined$CoroutineExceptionHandler$1(C6265.f15427, this);
        this.exceptionHandler = uploadPlugin$special$$inlined$CoroutineExceptionHandler$1;
        C8036 c8036 = AbstractC6227.f15375;
        this.scope = AbstractC6231.m11048(ExecutorC8037.f19570.plus(uploadPlugin$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QSResult<String> uploadToNet(File pluginZipFile) {
        ApiService apiService = PluginClient.getApiService();
        int i = AbstractC6962.f17134;
        Regex regex = C6973.f17204;
        C6973 c6973M7271 = AbstractC3888.m7271("multipart/form-data");
        pluginZipFile.getClass();
        Object obj = apiService.uploadFile(AbstractC3898.m7424("file", pluginZipFile.getName(), new C6953(c6973M7271, pluginZipFile)), AbstractC3897.m7401(PluginSdkConfig.getUSER_UIN(), AbstractC3888.m7271("text/plain")), AbstractC3897.m7401(PluginSdkConfig.getUSER_NICKNAME(), AbstractC3888.m7271("text/plain"))).execute().f16101;
        obj.getClass();
        return (QSResult) obj;
    }

    public final InterfaceC6284 upload(PluginInfo plugin) {
        "plugin";
        plugin.getClass();
        return AbstractC6231.m11036(this.scope, null, null, new C04141(plugin, null), 3);
    }
}
