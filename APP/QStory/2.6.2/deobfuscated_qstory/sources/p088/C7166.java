package p088;

import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1358;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3252;
import io.ktor.util.C4205;
import io.ktor.utils.io.C4248;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.random.AbstractC4400;
import kotlin.sequences.AbstractC5121;
import kotlin.text.AbstractC5143;
import kotlin.text.C5136;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p024.AbstractC6291;
import p052.InterfaceC6542;
import p075.C6957;
import p075.C6960;
import p089.C7179;
import p114.AbstractC7333;
import p114.C7334;
import p116.AbstractC7347;
import p116.C7338;
import p140.AbstractC7534;
import p236.AbstractC8095;
import p236.AbstractC8121;
import p256.C8196;
import p325.AbstractC8753;
import p325.AbstractC8757;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7166 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19141;

    public /* synthetic */ C7166(int i) {
        this.f19141 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = 2;
        switch (this.f19141) {
            case 0:
                return C7163.f19137;
            case 1:
                return C7164.f19139;
            case 2:
                return C7149.f19116;
            case 3:
                return C7154.f19124;
            case 4:
                try {
                    Class.forName("java.nio.file.Files");
                    return new C6960(i);
                } catch (ClassNotFoundException unused) {
                    return new C6957(i);
                }
            case 5:
                C1334 c1334 = AbstractC7333.f19551;
                return C7334.f19552;
            case 6:
                return new C7338(new LinkedHashMap());
            case 7:
                C1334 c13342 = AbstractC7347.f19579;
                return null;
            case 8:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 9:
                C1358 c1358 = AbstractC7534.f20421;
                return null;
            case 10:
                return Integer.valueOf(AbstractC4400.Default.nextInt(2147418112) + 65536);
            case 11:
                C4205 c4205 = new C4205();
                c4205.putAll(AbstractC8121.m13558(AbstractC4343.m8790((List) AbstractC8095.f22341.getValue())));
                return c4205;
            case 12:
                return AbstractC8121.m13558(AbstractC5121.m10111(AbstractC4343.m8790((List) AbstractC8095.f22341.getValue()), new C7179(8)));
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                return AbstractC5121.m10106(AbstractC5121.m10107(new C5136(), new C7179(9)));
            case 16:
                return new C4248(false);
            case 17:
                return new LinkedHashMap();
            case 18:
                C8196 c8196 = C8196.f22568;
                String property = System.getProperty(ClassFileVersion.VersionLocator.JAVA_VERSION);
                property.getClass();
                try {
                    List listM10147 = AbstractC5143.m10147(property, new char[]{SignatureVisitor.SUPER, '_'});
                    return listM10147.size() == 2 ? new C8196((String) listM10147.get(0), Integer.parseInt((String) listM10147.get(1))) : new C8196(property, -1);
                } catch (Throwable unused2) {
                    return C8196.f22568;
                }
            case 19:
                return AbstractC8753.m14416().getFriendRKey();
            case 20:
                return AbstractC8753.m14416().getSkey();
            case 21:
                return AbstractC8753.m14416().getCurrentFriendUin();
            case 22:
                return AbstractC8753.m14416().getRealSkey();
            case 23:
                return AbstractC8753.m14416().getGroupRKey();
            case 24:
                return AbstractC8757.m14433(new C7179(16));
            case 25:
                return AbstractC8753.m14416().getCurrentGroupUin();
            case 26:
                PluginInfo pluginInfo = new PluginInfo();
                pluginInfo.setPluginID("mcp_builtin_tools");
                pluginInfo.setPluginName("MCP Builtin Tools");
                pluginInfo.setPluginLocalPath("");
                return new QQNTPluginMethod(new PluginLoader(pluginInfo));
            case 27:
                return new C3252();
            case 28:
                Object obj = AbstractC6291.f17375.get(PluginMessageCallbackAPI.class);
                "null cannot be cast to non-null type lin.xposed.hook.javaplugin.PluginMessageCallbackAPI";
                obj.getClass();
                return (PluginMessageCallbackAPI) obj;
            default:
                return InfoSyncPush.SyncContent._childSerializers$_anonymous_();
        }
    }
}
