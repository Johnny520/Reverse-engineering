package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.view.View;
import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p050.AbstractC7176;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6757 extends AbstractC7140 {
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        continue;
     */
    @Override // p042.AbstractC7143
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Iterator it = AbstractC7176.m12490(AbstractC9234.m14531(1782), AbstractC9234.m14531(1783)).iterator();
        loop0: while (it.hasNext()) {
            try {
                Method[] declaredMethods = AbstractC7166.m12425((String) it.next()).getDeclaredMethods();
                AbstractC9234.m14531(1555);
                declaredMethods.getClass();
                ArrayList arrayList = new ArrayList();
                for (Method method2 : declaredMethods) {
                    if (AbstractC5227.m9466(method2.getReturnType(), View.class) && method2.getParameterCount() == 0 && !Modifier.isStatic(method2.getModifiers())) {
                        arrayList.add(method2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    XposedBridge.hookMethod((Method) it2.next(), new C6745(3));
                }
                break loop0;
            } catch (Exception unused) {
            }
        }
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1784));
            Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(1785));
            Method[] declaredMethods2 = clsM12425.getDeclaredMethods();
            AbstractC9234.m14531(1555);
            declaredMethods2.getClass();
            int length = declaredMethods2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods2[i];
                if (method.getParameterCount() > 0 && AbstractC5227.m9466(method.getParameterTypes()[0], clsM124252)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6745(4));
            }
        } catch (Exception unused2) {
        }
        Class cls = Void.TYPE;
        Class cls2 = Boolean.TYPE;
        try {
            XposedBridge.hookAllMethods(AbstractC7166.m12425(AbstractC9234.m14531(1786)), AbstractC9234.m14531(1787), new C6745(5));
        } catch (Exception unused3) {
        }
        try {
            Class clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(1788));
            Class clsM124254 = AbstractC7166.m12425(AbstractC9234.m14531(1789));
            try {
                C7164 c7164M12413 = C7164.m12413(clsM124253);
                Class[] clsArr = {Activity.class, clsM124254, cls2, Integer.TYPE, Object.class};
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3964 = clsArr;
                c2080.f3962 = cls;
                Result.m9304constructorimpl(XposedBridge.hookMethod(c7164M12413.m12414(), new C6745(6)));
            } catch (Throwable th) {
                Result.m9304constructorimpl(new Result.Failure(th));
            }
            try {
                C7164 c7164M124132 = C7164.m12413(clsM124253);
                C2080 c20802 = c7164M124132.f17803;
                c20802.f3964 = new Class[]{Activity.class, clsM124254, cls2};
                c20802.f3962 = cls;
                Result.m9304constructorimpl(XposedBridge.hookMethod(c7164M124132.m12414(), new C6745(7)));
            } catch (Throwable th2) {
                Result.m9304constructorimpl(new Result.Failure(th2));
            }
        } catch (Exception unused4) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1781);
    }
}
