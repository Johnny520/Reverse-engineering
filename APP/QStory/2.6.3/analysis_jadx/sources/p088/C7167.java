package p088;

import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1358;
import com.google.gson.C3253;
import io.ktor.util.C4206;
import io.ktor.utils.io.C4249;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.random.AbstractC4401;
import kotlin.sequences.AbstractC5122;
import kotlin.text.AbstractC5144;
import kotlin.text.C5137;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p024.AbstractC6309;
import p052.InterfaceC6543;
import p075.C6958;
import p075.C6961;
import p089.C7180;
import p114.AbstractC7334;
import p114.C7335;
import p116.AbstractC7348;
import p116.C7339;
import p140.AbstractC7535;
import p236.AbstractC8096;
import p236.AbstractC8122;
import p256.C8197;
import p287.AbstractC8405;
import p329.AbstractC8761;
import p329.AbstractC8765;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7167 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19136;

    public /* synthetic */ C7167(int i) {
        this.f19136 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = 2;
        switch (this.f19136) {
            case 0:
                return C7164.f19132;
            case 1:
                return C7165.f19134;
            case 2:
                return C7150.f19111;
            case 3:
                return C7155.f19119;
            case 4:
                try {
                    Class.forName("java.nio.file.Files");
                    return new C6961(i);
                } catch (ClassNotFoundException unused) {
                    return new C6958(i);
                }
            case 5:
                C1334 c1334 = AbstractC7334.f19546;
                return C7335.f19547;
            case 6:
                return new C7339(new LinkedHashMap());
            case 7:
                C1334 c13342 = AbstractC7348.f19574;
                return null;
            case 8:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 9:
                C1358 c1358 = AbstractC7535.f20416;
                return null;
            case 10:
                return Integer.valueOf(AbstractC4401.Default.nextInt(2147418112) + 65536);
            case 11:
                C4206 c4206 = new C4206();
                c4206.putAll(AbstractC8122.m13587(AbstractC4344.m8803((List) AbstractC8096.f22339.getValue())));
                return c4206;
            case 12:
                return AbstractC8122.m13587(AbstractC5122.m10111(AbstractC4344.m8803((List) AbstractC8096.f22339.getValue()), new C7180(8)));
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                return AbstractC5122.m10110(AbstractC5122.m10112(new C5137(), new C7180(9)));
            case 16:
                return new C4249(false);
            case 17:
                return new LinkedHashMap();
            case 18:
                C8197 c8197 = C8197.f22567;
                String property = System.getProperty(ClassFileVersion.VersionLocator.JAVA_VERSION);
                property.getClass();
                try {
                    List listM10150 = AbstractC5144.m10150(property, new char[]{SignatureVisitor.SUPER, '_'});
                    return listM10150.size() == 2 ? new C8197((String) listM10150.get(0), Integer.parseInt((String) listM10150.get(1))) : new C8197(property, -1);
                } catch (Throwable unused2) {
                    return C8197.f22567;
                }
            case 19:
                Object obj = AbstractC6309.f17424.get(PluginMessageCallbackAPI.class);
                AbstractC8405.m13972(2607);
                obj.getClass();
                return (PluginMessageCallbackAPI) obj;
            case 20:
                return AbstractC8761.m14450().getFriendRKey();
            case 21:
                return AbstractC8761.m14450().getSkey();
            case 22:
                return AbstractC8761.m14450().getCurrentFriendUin();
            case 23:
                return AbstractC8761.m14450().getRealSkey();
            case 24:
                return AbstractC8761.m14450().getGroupRKey();
            case 25:
                return AbstractC8765.m14467(new C7180(16));
            case 26:
                return AbstractC8761.m14450().getCurrentGroupUin();
            case 27:
                PluginInfo pluginInfo = new PluginInfo();
                pluginInfo.setPluginID(AbstractC8405.m13972(2434));
                pluginInfo.setPluginName(AbstractC8405.m13972(2435));
                pluginInfo.setPluginLocalPath("");
                return new QQNTPluginMethod(new PluginLoader(pluginInfo));
            case 28:
                return new C3253();
            default:
                return InfoSyncPush.SyncContent._childSerializers$_anonymous_();
        }
    }
}
