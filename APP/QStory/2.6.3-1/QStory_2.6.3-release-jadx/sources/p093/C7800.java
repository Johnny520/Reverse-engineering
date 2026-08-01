package p093;

import android.app.Activity;
import androidx.core.view.C3075;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7387;
import p086.C7727;
import p163.C8393;
import p163.C8394;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7800 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClassLoader f19007;

    public C7800(ClassLoader classLoader) {
        classLoader.getClass();
        this.f19007 = classLoader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C3075 m12845(C5520 c5520, C7727 c7727) {
        Class<?> cls;
        C7799 c7799M14244;
        c5520.getClass();
        c7727.getClass();
        String strM10688 = AbstractC5971.m10688(c5520.f14043.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        C5519 c5519 = c5520.f14044;
        if (!c5519.f14041.m9873()) {
            strM10688 = c5519 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM10688;
        }
        try {
            cls = Class.forName(strM10688, false, this.f19007);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (c7799M14244 = AbstractC9019.m14244(cls)) == null) {
            return null;
        }
        return new C3075(c7799M14244, 19);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8393 m12846(Object obj, InterfaceC5925 interfaceC5925, Activity activity, InterfaceC7387 interfaceC7387) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        interfaceC5925.getClass();
        activity.getClass();
        C8394 c8394 = new C8394(interfaceC5925, interfaceC7387);
        ClassLoader classLoader = this.f19007;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, c8394);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new C8393(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }
}
