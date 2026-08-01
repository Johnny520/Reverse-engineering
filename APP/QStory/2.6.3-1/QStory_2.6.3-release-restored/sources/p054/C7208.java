package p054;

import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.Stack;
import p042.AbstractC7145;
import p043.InterfaceC7146;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7208 extends AbstractC7145 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object f17880;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Object f17881;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Object f17882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Stack f17883 = new Stack();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17885;

    public C7208() {
        "AIO_doOnCreate_initUI";
        "QQNT_AIOCreate";
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC3888.m7256()) {
            XposedBridge.hookMethod(this.f17885, new C7202(6));
            return;
        }
        XposedBridge.hookMethod(this.f17884, new C7202(4));
        try {
            XposedHelpers.findAndHookMethod("com.tencent.aio.base.chat.ChatPie", classLoader, "onDestroy", new Object[]{new C7202(5)});
        } catch (Exception unused) {
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        if (AbstractC3888.m7256()) {
            this.f17884 = c3902.m7449("QQNT_AIOCreate");
        } else {
            this.f17885 = c3902.m7449("AIO_doOnCreate_initUI");
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        if (AbstractC3888.m7256()) {
            c3902.m7447(C3902.m7446("rootVMBuild")[0], "QQNT_AIOCreate");
            return;
        }
        for (Method method : C3902.m7446("AIO_doOnCreate_initUI")) {
            if (method.getDeclaringClass().getName().equals("com.tencent.mobileqq.activity.aio.core.BaseChatPie")) {
                c3902.m7447(method, "AIO_doOnCreate_initUI");
                return;
            }
        }
    }
}
