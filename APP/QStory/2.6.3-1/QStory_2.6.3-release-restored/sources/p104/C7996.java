package p104;

import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2193;
import com.google.gson.C4085;
import io.ktor.util.C5038;
import io.ktor.utils.p007io.C5081;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.random.AbstractC5233;
import kotlin.sequences.AbstractC5954;
import kotlin.text.AbstractC5976;
import kotlin.text.C5969;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p040.AbstractC7138;
import p068.InterfaceC7372;
import p091.C7787;
import p091.C7790;
import p105.C8009;
import p130.AbstractC8163;
import p130.C8164;
import p132.AbstractC8177;
import p132.C8168;
import p156.AbstractC8364;
import p252.AbstractC8925;
import p252.AbstractC8951;
import p272.C9026;
import p345.AbstractC9590;
import p345.AbstractC9594;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7996 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19481;

    public /* synthetic */ C7996(int i) {
        this.f19481 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = 2;
        switch (this.f19481) {
            case 0:
                return C7993.f19477;
            case 1:
                return C7994.f19479;
            case 2:
                return C7979.f19456;
            case 3:
                return C7984.f19464;
            case 4:
                try {
                    Class.forName("java.nio.file.Files");
                    return new C7790(i);
                } catch (ClassNotFoundException unused) {
                    return new C7787(i);
                }
            case 5:
                C2169 c2169 = AbstractC8163.f19891;
                return C8164.f19892;
            case 6:
                return new C8168(new LinkedHashMap());
            case 7:
                C2169 c21692 = AbstractC8177.f19919;
                return null;
            case 8:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 9:
                C2193 c2193 = AbstractC8364.f20761;
                return null;
            case 10:
                return Integer.valueOf(AbstractC5233.Default.nextInt(2147418112) + 65536);
            case 11:
                C5038 c5038 = new C5038();
                c5038.putAll(AbstractC8951.m14146(AbstractC5176.m9362((List) AbstractC8925.f22684.getValue())));
                return c5038;
            case 12:
                return AbstractC8951.m14146(AbstractC5954.m10670(AbstractC5176.m9362((List) AbstractC8925.f22684.getValue()), new C8009(8)));
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                return AbstractC5954.m10669(AbstractC5954.m10671(new C5969(), new C8009(9)));
            case 16:
                return new C5081(false);
            case 17:
                return new LinkedHashMap();
            case 18:
                C9026 c9026 = C9026.f22912;
                String property = System.getProperty(ClassFileVersion.VersionLocator.JAVA_VERSION);
                property.getClass();
                try {
                    List listM10709 = AbstractC5976.m10709(property, new char[]{SignatureVisitor.SUPER, '_'});
                    return listM10709.size() == 2 ? new C9026((String) listM10709.get(0), Integer.parseInt((String) listM10709.get(1))) : new C9026(property, -1);
                } catch (Throwable unused2) {
                    return C9026.f22912;
                }
            case 19:
                Object obj = AbstractC7138.f17769.get(PluginMessageCallbackAPI.class);
                "null cannot be cast to non-null type lin.xposed.hook.javaplugin.PluginMessageCallbackAPI";
                obj.getClass();
                return (PluginMessageCallbackAPI) obj;
            case 20:
                return AbstractC9590.m15009().getFriendRKey();
            case 21:
                return AbstractC9590.m15009().getSkey();
            case 22:
                return AbstractC9590.m15009().getCurrentFriendUin();
            case 23:
                return AbstractC9590.m15009().getRealSkey();
            case 24:
                return AbstractC9590.m15009().getGroupRKey();
            case 25:
                return AbstractC9594.m15026(new C8009(16));
            case 26:
                return AbstractC9590.m15009().getCurrentGroupUin();
            case 27:
                PluginInfo pluginInfo = new PluginInfo();
                pluginInfo.setPluginID("mcp_builtin_tools");
                pluginInfo.setPluginName("MCP Builtin Tools");
                pluginInfo.setPluginLocalPath("");
                return new QQNTPluginMethod(new PluginLoader(pluginInfo));
            case 28:
                return new C4085();
            default:
                return InfoSyncPush.SyncContent._childSerializers$_anonymous_();
        }
    }
}
