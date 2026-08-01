package p037;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.Stack;
import p009.InterfaceC6152;
import p026.AbstractC6298;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6362 extends AbstractC6298 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object f17489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Object f17490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Object f17491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Stack f17492 = new Stack();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17494;

    public C6362() {
        "AIO_doOnCreate_initUI";
        "QQNT_AIOCreate";
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC6560.m12011()) {
            XposedBridge.hookMethod(this.f17494, new C6356(6));
            return;
        }
        XposedBridge.hookMethod(this.f17493, new C6356(4));
        try {
            XposedHelpers.findAndHookMethod("com.tencent.aio.base.chat.ChatPie", classLoader, "onDestroy", new Object[]{new C6356(5)});
        } catch (Exception unused) {
        }
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        if (AbstractC6560.m12011()) {
            this.f17493 = c3069.m6902("QQNT_AIOCreate");
        } else {
            this.f17494 = c3069.m6902("AIO_doOnCreate_initUI");
        }
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        if (AbstractC6560.m12011()) {
            c3069.m6900(C3069.m6899("rootVMBuild")[0], "QQNT_AIOCreate");
            return;
        }
        for (Method method : C3069.m6899("AIO_doOnCreate_initUI")) {
            if (method.getDeclaringClass().getName().equals("com.tencent.mobileqq.activity.aio.core.BaseChatPie")) {
                c3069.m6900(method, "AIO_doOnCreate_initUI");
                return;
            }
        }
    }
}
