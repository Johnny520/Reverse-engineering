package p038;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.JSONObject;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.util.List;
import p010.AbstractC6185;
import p025.InterfaceC6310;
import p026.AbstractC6316;
import p029.C6320;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C6383 extends AbstractC6316 implements InterfaceC6310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public XC_MethodHook.Unhook f17545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6320 f17546 = new C6320(getClass().getSimpleName());

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        String strM13973 = AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        Boolean bool = Boolean.FALSE;
        C6320 c6320 = this.f17546;
        if (((Boolean) c6320.m11840(bool, strM13973)).booleanValue()) {
            ((Integer) c6320.m11840(0, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"))).getClass();
            return;
        }
        C6335 c6335M11854 = C6335.m11854(AbstractC6337.m11866(AbstractC8405.m13972(326)));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        this.f17545 = XposedBridge.hookMethod(c6335M11854.m11855(), new C5812(this, 21));
    }

    @Override // p025.InterfaceC6310
    public final void run() {
        C6320 c6320 = this.f17546;
        c6320.getClass();
        c6320.f17431 = new JSONObject();
        c6320.mo11835();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11962(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals(AbstractC8405.m13972(341))) {
                int id = childAt.getId();
                String strM13973 = AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
                Boolean bool = Boolean.TRUE;
                C6320 c6320 = this.f17546;
                c6320.m11836(bool, strM13973);
                c6320.m11836(Integer.valueOf(id), AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"));
                c6320.m11836(AbstractC6358.f17509, AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵"));
                c6320.mo11835();
                if (this.f17545 != null) {
                    ((Integer) c6320.m11840(0, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"))).getClass();
                    this.f17545.unhook();
                }
                AbstractC6185.m11592(AbstractC8405.m13972(342));
                return;
            }
        }
    }
}
