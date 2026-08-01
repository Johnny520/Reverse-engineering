package p077;

import android.app.Activity;
import androidx.core.view.C2242;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.text.AbstractC5138;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6557;
import p070.C6897;
import p147.C7563;
import p147.C7564;

/* JADX INFO: renamed from: 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f18667;

    public C6970(ClassLoader classLoader) {
        classLoader.getClass();
        this.f18667 = classLoader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2242 m12259(C4687 c4687, C6897 c6897) {
        Class<?> cls;
        C6969 c6969M10042;
        c4687.getClass();
        c6897.getClass();
        String strM10129 = AbstractC5138.m10129(c4687.f13694.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        C4686 c4686 = c4687.f13695;
        if (!c4686.f13692.m9324()) {
            strM10129 = c4686 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM10129;
        }
        try {
            cls = Class.forName(strM10129, false, this.f18667);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (c6969M10042 = AbstractC5061.m10042(cls)) == null) {
            return null;
        }
        return new C2242(c6969M10042, 19);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7563 m12260(Object obj, InterfaceC5092 interfaceC5092, Activity activity, InterfaceC6557 interfaceC6557) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        interfaceC5092.getClass();
        activity.getClass();
        C7564 c7564 = new C7564(interfaceC5092, interfaceC6557);
        ClassLoader classLoader = this.f18667;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, c7564);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new C7563(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }
}
