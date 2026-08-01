package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C5039;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.matchers.C6539;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p303.AbstractC9234;
import p382.C9780;
import p405.C9921;
import p408.C9929;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰世苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6736 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16425 = AbstractC9234.m14531(2080);

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2083), classLoader);
        if (clsFindClassIfExists == null && (clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2084), classLoader)) == null) {
            return;
        }
        XposedHelpers.findAndHookMethod(clsFindClassIfExists, AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜呜呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜喵"), new Object[]{Integer.TYPE, View.class, ViewGroup.class, new C6642(this, 10)});
        Method method = this.f16424;
        if (method != null) {
            m12389(method, new C6755(13));
        } else {
            AbstractC5227.m9467(AbstractC9234.m14531(2081));
            throw null;
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2082);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        Method methodM7449 = c3902.m7449(this.f16425);
        AbstractC9234.m14531(1792);
        methodM7449.getClass();
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        this.f16424 = methodM7449;
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        DexKitBridge dexKitBridgeM15253 = C9929.m15253();
        C9780 c9780 = new C9780();
        AbstractC9234.m14531(2089);
        C5039 c5039 = new C5039(15);
        C6539 c6539 = new C6539();
        c5039.invoke(c6539);
        c9780.f25497 = c6539;
        C9921 c9921M15232 = C9921.m15232(dexKitBridgeM15253.m11656(c9780).single().m11683().f16072);
        c9921M15232.m15234(Integer.TYPE, Object.class);
        Method method = (Method) c9921M15232.m15164();
        if (method != null) {
            c3902.m7447(method, this.f16425);
        }
    }
}
