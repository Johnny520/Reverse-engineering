package p055;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p035.C7092;
import p042.AbstractC7140;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7229 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        if (AbstractC3888.m7256()) {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem");
            Class clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent");
            Class clsM124253 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
            C7164 c7164M12413 = C7164.m12413(clsM124253);
            c7164M12413.f17803.f3962 = clsM12425;
            Method methodM12414 = c7164M12413.m12414();
            C7164 c7164M124132 = C7164.m12413(clsM124253);
            c7164M124132.f17803.f3962 = List.class;
            Method methodM124142 = c7164M124132.m12414();
            C7164 c7164M124133 = C7164.m12413(clsM124252);
            String name = methodM124142.getName();
            C2080 c2080 = c7164M124133.f17803;
            c2080.f3963 = name;
            c2080.f3962 = List.class;
            m12389(c7164M124133.m12414(), new C5703(methodM12414, 7, classLoader));
            return;
        }
        Method[] declaredMethods = AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.item.PttItemBuilder").getDeclaredMethods();
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
        Member memberM12402 = AbstractC7162.m12402(AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.item.PttItemBuilder"), Void.TYPE, "a", new Class[]{Integer.TYPE, Context.class, AbstractC7166.m12425("com.tencent.mobileqq.data.ChatMessage")});
        m12389(method, new C7092(17));
        m12389(memberM12402, new C7092(18));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "长按一条语音";
    }
}
