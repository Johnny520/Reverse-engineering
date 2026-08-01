package top.suzhelan.qstory.hook.item;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C4207;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.matchers.C5709;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p287.AbstractC8405;
import p366.C8951;
import p389.C9092;
import p392.C9100;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰世苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5906 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16080 = AbstractC8405.m13972(2080);

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC8405.m13972(2083), classLoader);
        if (clsFindClassIfExists == null && (clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC8405.m13972(2084), classLoader)) == null) {
            return;
        }
        XposedHelpers.findAndHookMethod(clsFindClassIfExists, AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜呜呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜喵"), new Object[]{Integer.TYPE, View.class, ViewGroup.class, new C5812(this, 10)});
        Method method = this.f16079;
        if (method != null) {
            m11830(method, new C5925(13));
        } else {
            AbstractC4395.m8908(AbstractC8405.m13972(2081));
            throw null;
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2082);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        Method methodM6889 = c3070.m6889(this.f16080);
        AbstractC8405.m13972(1792);
        methodM6889.getClass();
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵喵喵~喵呜喵呜喵喵呜呜~喵呜喵呜呜呜呜呜");
        this.f16079 = methodM6889;
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        DexKitBridge dexKitBridgeM14694 = C9100.m14694();
        C8951 c8951 = new C8951();
        AbstractC8405.m13972(2089);
        C4207 c4207 = new C4207(15);
        C5709 c5709 = new C5709();
        c4207.invoke(c5709);
        c8951.f25152 = c5709;
        C9092 c9092M14673 = C9092.m14673(dexKitBridgeM14694.m11097(c8951).single().m11124().f15727);
        c9092M14673.m14675(Integer.TYPE, Object.class);
        Method method = (Method) c9092M14673.m14605();
        if (method != null) {
            c3070.m6887(method, this.f16080);
        }
    }
}
