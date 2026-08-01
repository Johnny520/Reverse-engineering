package top.suzhelan.qstory.hook.item.chat;

import com.android.p002dx.p005io.Opcodes;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6678 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        try {
            Method[] declaredMethods = AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent").getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            Method method = null;
            boolean z = false;
            for (Method method2 : declaredMethods) {
                Class<?> returnType = method2.getReturnType();
                Class cls = Boolean.TYPE;
                if (AbstractC5227.m9466(returnType, cls) && Arrays.equals(method2.getParameterTypes(), new Class[]{cls})) {
                    if (z) {
                        throw new IllegalArgumentException("Array contains more than one matching element.");
                    }
                    z = true;
                    method = method2;
                }
            }
            if (!z) {
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            XposedBridge.hookMethod(method, new C6642(this, 13));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
