package lin.xposed.hook.javaplugin.online.upload;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.AbstractC3066;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.io.IOException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5404;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.internal.AbstractC5365;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.online.upload.UploadPlugin;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6133;
import p007.C6124;
import p007.C6144;
import p052.InterfaceC6554;
import p053.AbstractC6561;
import p063.InterfaceC6862;
import p093.C7201;
import p095.C7207;
import p095.ExecutorC7208;
import p257.C8198;
import p257.C8208;
import p257.RunnableC8202;
import p287.AbstractC8405;
import top.suzhelan.plugin.sdk.online.net.ApiService;
import top.suzhelan.plugin.sdk.online.net.PluginClient;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/io/File;", "pluginZipFile", "Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "", "uploadToNet", "(Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "Llin/xposed/hook/javaplugin/bean/PluginInfo;", "plugin", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "upload", "(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "TAG", "Ljava/lang/String;", "L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;", "waitDialog", "L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "exceptionHandler", "Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "scope", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class UploadPlugin {
    public static final int $stable = 8;
    private final String TAG = AbstractC8405.m13972(1269);
    private final InterfaceC5404 exceptionHandler;
    private final InterfaceC5401 scope;
    private final C8198 waitDialog;

    /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1", f = "UploadPlugin.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ PluginInfo $plugin;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
        @InterfaceC6862(c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1", f = "UploadPlugin.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C55361 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ QSResult<String> $res;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C55361(QSResult<String> qSResult, InterfaceC4357<? super C55361> interfaceC4357) {
                super(2, interfaceC4357);
                this.$res = qSResult;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(C8208 c8208, View view) {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$1(C8208 c8208, View view) {
                return false;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new C55361(this.$res, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((C55361) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C5925.m11311(AbstractC8405.m13972(1261));
                    return null;
                }
                AbstractC5185.m10210(obj);
                if (this.$res.getStatus() == 200) {
                    final int i = 0;
                    C8208.m13729(this.$res.getMessage(), AbstractC8405.m13972(1260)).mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new InterfaceC3750() { // from class: lin.xposed.hook.javaplugin.online.upload.飘花落叶言子楪世苏哲兰
                        @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
                        public final boolean onClick(AbstractC3738 abstractC3738, View view) {
                            C8208 c8208 = (C8208) abstractC3738;
                            switch (i) {
                                case 0:
                                    return UploadPlugin.AnonymousClass1.C55361.invokeSuspend$lambda$0(c8208, view);
                                default:
                                    return UploadPlugin.AnonymousClass1.C55361.invokeSuspend$lambda$1(c8208, view);
                            }
                        }
                    });
                } else {
                    final int i2 = 1;
                    C8208.m13729(this.$res.getMessage(), AbstractC8405.m13972(1258)).mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new InterfaceC3750() { // from class: lin.xposed.hook.javaplugin.online.upload.飘花落叶言子楪世苏哲兰
                        @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
                        public final boolean onClick(AbstractC3738 abstractC3738, View view) {
                            C8208 c8208 = (C8208) abstractC3738;
                            switch (i2) {
                                case 0:
                                    return UploadPlugin.AnonymousClass1.C55361.invokeSuspend$lambda$0(c8208, view);
                                default:
                                    return UploadPlugin.AnonymousClass1.C55361.invokeSuspend$lambda$1(c8208, view);
                            }
                        }
                    });
                }
                return C5176.f14739;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PluginInfo pluginInfo, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$plugin = pluginInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return UploadPlugin.this.new AnonymousClass1(this.$plugin, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5176 c5176 = C5176.f14739;
            if (i != 0) {
                if (i != 1) {
                    C5925.m11311(AbstractC8405.m13972(1261));
                    return null;
                }
                AbstractC5185.m10210(obj);
                return c5176;
            }
            AbstractC5185.m10210(obj);
            String strM8311 = AbstractC3933.m8311(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵"));
            AbstractC8405.m13972(1262);
            strM8311.getClass();
            PluginSdkConfig.setDOWNLOAD_DIR(strM8311);
            PluginSdkConfig.setINSTALL_DIR(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜")));
            String currentUin = QQEnvTool.getCurrentUin();
            AbstractC8405.m13972(1263);
            currentUin.getClass();
            PluginSdkConfig.setUSER_UIN(currentUin);
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            AbstractC8405.m13972(1264);
            currentAccountNickName.getClass();
            PluginSdkConfig.setUSER_NICKNAME(currentAccountNickName);
            UploadPlugin.this.waitDialog.m13712();
            C8198 c8198 = UploadPlugin.this.waitDialog;
            c8198.f22574 = AbstractC8405.m13972(1265);
            c8198.m13711();
            PluginManager.stopPlugin(this.$plugin);
            if (!PluginManager.loadPlugin(null, this.$plugin)) {
                C8208.m13729(AbstractC8405.m13972(1266), AbstractC8405.m13972(1258));
                return c5176;
            }
            PluginManager.stopPlugin(this.$plugin);
            C8198 c81982 = UploadPlugin.this.waitDialog;
            c81982.f22574 = AbstractC8405.m13972(1267);
            c81982.m13711();
            String pluginLocalPath = this.$plugin.getPluginLocalPath();
            File file = new File(AbstractC3933.m8311(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵")), System.currentTimeMillis() + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜喵喵喵"));
            AbstractC6561.m12051(pluginLocalPath, file.getAbsolutePath());
            C8198 c81983 = UploadPlugin.this.waitDialog;
            c81983.f22574 = AbstractC8405.m13972(1268);
            c81983.m13711();
            QSResult qSResultUploadToNet = UploadPlugin.this.uploadToNet(file);
            C8198 c81984 = UploadPlugin.this.waitDialog;
            c81984.f11584 = false;
            AbstractC3738.m8030(new RunnableC8202(c81984, 2));
            C7207 c7207 = AbstractC5395.f15030;
            C7201 c7201 = AbstractC5365.f14960;
            C55361 c55361 = new C55361(qSResultUploadToNet, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            return AbstractC5399.m10470(c7201, c55361, this) == coroutineSingletons ? coroutineSingletons : c5176;
        }
    }

    public UploadPlugin() {
        C8198 c8198 = new C8198();
        AbstractC8405.m13972(1270);
        this.waitDialog = c8198;
        UploadPlugin$special$$inlined$CoroutineExceptionHandler$1 uploadPlugin$special$$inlined$CoroutineExceptionHandler$1 = new UploadPlugin$special$$inlined$CoroutineExceptionHandler$1(C5433.f15082, this);
        this.exceptionHandler = uploadPlugin$special$$inlined$CoroutineExceptionHandler$1;
        C7207 c7207 = AbstractC5395.f15030;
        this.scope = AbstractC5399.m10489(ExecutorC7208.f19225.plus(uploadPlugin$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QSResult<String> uploadToNet(File pluginZipFile) {
        ApiService apiService = PluginClient.getApiService();
        int i = AbstractC6133.f16789;
        Regex regex = C6144.f16859;
        C6144 c6144M6711 = AbstractC3056.m6711(AbstractC8405.m13972(37));
        pluginZipFile.getClass();
        Object obj = apiService.uploadFile(AbstractC3066.m6864(AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜"), pluginZipFile.getName(), new C6124(c6144M6711, pluginZipFile)), AbstractC3065.m6841(PluginSdkConfig.getUSER_UIN(), AbstractC3056.m6711(AbstractC8405.m13972(702))), AbstractC3065.m6841(PluginSdkConfig.getUSER_NICKNAME(), AbstractC3056.m6711(AbstractC8405.m13972(702)))).execute().f15756;
        obj.getClass();
        return (QSResult) obj;
    }

    public final InterfaceC5452 upload(PluginInfo plugin) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵");
        plugin.getClass();
        return AbstractC5399.m10477(this.scope, null, null, new AnonymousClass1(plugin, null), 3);
    }
}
