package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C4206;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.matchers.C5708;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p368.C8958;
import p392.C9125;
import p394.C9129;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5903 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16071;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16072 = AbstractC3056.m6668(-3937780627290719655L);

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937780425427256743L), classLoader);
        if (clsFindClassIfExists == null && (clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937780090419807655L), classLoader)) == null) {
            return;
        }
        XposedHelpers.findAndHookMethod(clsFindClassIfExists, AbstractC3056.m6668(-3937779940095952295L), new Object[]{Integer.TYPE, View.class, ViewGroup.class, new C5811(this, 10)});
        Method method = this.f16071;
        if (method != null) {
            m11802(method, new C5919(13));
        } else {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937780498441700775L));
            throw null;
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937780429722224039L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
        Method methodM6902 = c3069.m6902(this.f16072);
        AbstractC3056.m6668(-3937744974767195559L);
        methodM6902.getClass();
        AbstractC3056.m6668(-3937689840272016807L);
        this.f16071 = methodM6902;
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
        DexKitBridge dexKitBridgeM14697 = C9129.m14697();
        C8958 c8958 = new C8958();
        AbstractC3056.m6668(-3937779635153274279L);
        C4206 c4206 = new C4206(15);
        C5708 c5708 = new C5708();
        c4206.invoke(c5708);
        c8958.f25186 = c5708;
        C9125 c9125M14681 = C9125.m14681(dexKitBridgeM14697.m11040(c8958).single().m11067().f15727);
        c9125M14681.m14683(Integer.TYPE, Object.class);
        Method method = (Method) c9125M14681.m14686();
        if (method != null) {
            c3069.m6900(method, this.f16072);
        }
    }
}
