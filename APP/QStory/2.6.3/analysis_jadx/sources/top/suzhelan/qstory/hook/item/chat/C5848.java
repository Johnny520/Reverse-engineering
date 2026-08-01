package top.suzhelan.qstory.hook.item.chat;

import com.android.dx.io.Opcodes;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5848 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.REM_INT_LIT16)).getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            Method method = null;
            boolean z = false;
            for (Method method2 : declaredMethods) {
                Class<?> returnType = method2.getReturnType();
                Class cls = Boolean.TYPE;
                if (AbstractC4395.m8907(returnType, cls) && Arrays.equals(method2.getParameterTypes(), new Class[]{cls})) {
                    if (z) {
                        throw new IllegalArgumentException(AbstractC8405.m13972(2141));
                    }
                    z = true;
                    method = method2;
                }
            }
            if (!z) {
                throw new NoSuchElementException(AbstractC8405.m13972(2142));
            }
            XposedBridge.hookMethod(method, new C5812(this, 13));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
