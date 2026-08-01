package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3889;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C5523;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5262 extends AbstractC5273 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Annotation f13396;

    public C5262(Annotation annotation) {
        annotation.getClass();
        this.f13396 = annotation;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5262) {
            return this.f13396 == ((C5262) obj).f13396;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13396);
    }

    public final String toString() {
        return C5262.class.getName() + ": " + this.f13396;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m9532() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f13396;
        Method[] declaredMethods = AbstractC3889.m7316(AbstractC3889.m7319(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            C5523 c5523M9889 = C5523.m9889(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC5263.f13400;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C5277(c5523M9889, (Enum) objInvoke) : objInvoke instanceof Annotation ? new C5280(c5523M9889, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new C5279(c5523M9889, (Object[]) objInvoke) : objInvoke instanceof Class ? new C5281(c5523M9889, (Class) objInvoke) : new C5275(c5523M9889, objInvoke));
        }
        return arrayList;
    }
}
