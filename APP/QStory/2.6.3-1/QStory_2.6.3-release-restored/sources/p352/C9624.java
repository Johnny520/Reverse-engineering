package p352;

import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.C3902;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9624 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f25107;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f25108;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC7187.f17853 < 6368) {
            C8376 c8376 = new C8376(29);
            Method method = this.f25107;
            if (method != null) {
                m12390(method, c8376);
            }
            Method method2 = this.f25108;
            if (method2 != null) {
                m12390(method2, c8376);
                return;
            }
            return;
        }
        for (Constructor<?> constructor : classLoader.loadClass("com.tencent.mobileqq.aio.shortcurtbar.AIOShortcutBarVM$c").getDeclaredConstructors()) {
            m12390(constructor, new C8376(27));
        }
        Class clsM12425 = AbstractC7166.m12425("com.tencent.input.base.panelcontainer.h$l");
        Class cls = Integer.TYPE;
        m12390(AbstractC3738.m6882(clsM12425, new Class[]{String.class, cls, Boolean.TYPE, cls}), new C8376(28));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "此功能在新的QQ版本中已被弃用，请使用QQ自带的半屏/全屏开关";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        this.f25107 = c3902.m7449("QQNT_TABAPI");
        this.f25108 = c3902.m7449("QQ_TABAPI");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        for (Method method : C3902.m7446("experimentGroupId")) {
            String name = method.getDeclaringClass().getName();
            if (name.startsWith("com.tencent.mobileqq.aio.api.impl.QQTabApiNtImpl")) {
                c3902.m7447(method, "QQNT_TABAPI");
            }
            if (name.startsWith("com.tencent.mobileqq.aio.api.impl.QQTabApiImpl")) {
                c3902.m7447(method, "QQ_TABAPI");
            }
        }
    }
}
