package p038;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p022.C6267;
import p026.AbstractC6293;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p032.C6316;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6390 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        if (AbstractC6560.m12011()) {
            Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
            Class clsM118382 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent");
            Class clsM118383 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
            C6316 c6316M11826 = C6316.m11826(clsM118383);
            c6316M11826.f17409.f3616 = clsM11838;
            Method methodM11827 = c6316M11826.m11827();
            C6316 c6316M118262 = C6316.m11826(clsM118383);
            c6316M118262.f17409.f3616 = List.class;
            Method methodM118272 = c6316M118262.m11827();
            C6316 c6316M118263 = C6316.m11826(clsM118382);
            String name = methodM118272.getName();
            C1245 c1245 = c6316M118263.f17409;
            c1245.f3617 = name;
            c1245.f3616 = List.class;
            m11802(c6316M118263.m11827(), new C4870(methodM11827, 7, classLoader));
            return;
        }
        Method[] declaredMethods = AbstractC6318.m11838("com.tencent.mobileqq.activity.aio.item.PttItemBuilder").getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == View.class && method.getReturnType().isArray()) {
                break;
            } else {
                i++;
            }
        }
        Member memberM11815 = AbstractC6314.m11815(AbstractC6318.m11838("com.tencent.mobileqq.activity.aio.item.PttItemBuilder"), Void.TYPE, "a", new Class[]{Integer.TYPE, Context.class, AbstractC6318.m11838("com.tencent.mobileqq.data.ChatMessage")});
        m11802(method, new C6267(17));
        m11802(memberM11815, new C6267(18));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u957f\u6309\u4e00\u6761\u8bed\u97f3";
    }
}
