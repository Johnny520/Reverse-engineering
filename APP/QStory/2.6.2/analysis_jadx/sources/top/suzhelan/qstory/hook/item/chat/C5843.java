package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5843 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        try {
            Method[] declaredMethods = AbstractC6318.m11838(AbstractC3056.m6668(-3937571526807913895L)).getDeclaredMethods();
            AbstractC3056.m6668(-3937714304405734823L);
            declaredMethods.getClass();
            Method method = null;
            boolean z = false;
            for (Method method2 : declaredMethods) {
                Class<?> returnType = method2.getReturnType();
                Class cls = Boolean.TYPE;
                if (AbstractC4394.m8917(returnType, cls) && Arrays.equals(method2.getParameterTypes(), new Class[]{cls})) {
                    if (z) {
                        throw new IllegalArgumentException(AbstractC3056.m6668(-3937789865765373351L));
                    }
                    z = true;
                    method = method2;
                }
            }
            if (!z) {
                throw new NoSuchElementException(AbstractC3056.m6668(-3937789655311975847L));
            }
            XposedBridge.hookMethod(method, new C5811(this, 13));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
