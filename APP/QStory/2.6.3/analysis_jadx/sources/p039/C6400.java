package p039;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p019.C6263;
import p026.AbstractC6311;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6400 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        if (AbstractC3056.m6696()) {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.REM_INT_LIT16));
            Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(163));
            C6335 c6335M11854 = C6335.m11854(clsM118663);
            c6335M11854.f17458.f3617 = clsM11866;
            Method methodM11855 = c6335M11854.m11855();
            C6335 c6335M118542 = C6335.m11854(clsM118663);
            c6335M118542.f17458.f3617 = List.class;
            Method methodM118552 = c6335M118542.m11855();
            C6335 c6335M118543 = C6335.m11854(clsM118662);
            String name = methodM118552.getName();
            C1245 c1245 = c6335M118543.f17458;
            c1245.f3618 = name;
            c1245.f3617 = List.class;
            m11830(c6335M118543.m11855(), new C4871(methodM11855, 7, classLoader));
            return;
        }
        Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.AND_INT_LIT16)).getDeclaredMethods();
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
        Member memberM11843 = AbstractC6333.m11843(AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.AND_INT_LIT16)), Void.TYPE, AbstractC8405.m13973("喵喵喵呜喵喵呜喵"), new Class[]{Integer.TYPE, Context.class, AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.OR_INT_LIT16))});
        m11830(method, new C6263(17));
        m11830(memberM11843, new C6263(18));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(Opcodes.DIV_INT_LIT16);
    }
}
