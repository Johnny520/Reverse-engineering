package p077;

import android.app.Activity;
import androidx.core.view.C2242;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.text.AbstractC5139;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6558;
import p070.C6898;
import p147.C7564;
import p147.C7565;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6971 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f18662;

    public C6971(ClassLoader classLoader) {
        classLoader.getClass();
        this.f18662 = classLoader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2242 m12286(C4688 c4688, C6898 c6898) {
        Class<?> cls;
        C6970 c6970M13685;
        c4688.getClass();
        c6898.getClass();
        String strM10129 = AbstractC5139.m10129(c4688.f13698.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        C4687 c4687 = c4688.f13699;
        if (!c4687.f13696.m9314()) {
            strM10129 = c4687 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM10129;
        }
        try {
            cls = Class.forName(strM10129, false, this.f18662);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (c6970M13685 = AbstractC8190.m13685(cls)) == null) {
            return null;
        }
        return new C2242(c6970M13685, 19);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7564 m12287(Object obj, InterfaceC5093 interfaceC5093, Activity activity, InterfaceC6558 interfaceC6558) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        interfaceC5093.getClass();
        activity.getClass();
        C7565 c7565 = new C7565(interfaceC5093, interfaceC6558);
        ClassLoader classLoader = this.f18662;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, c7565);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new C7564(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }
}
