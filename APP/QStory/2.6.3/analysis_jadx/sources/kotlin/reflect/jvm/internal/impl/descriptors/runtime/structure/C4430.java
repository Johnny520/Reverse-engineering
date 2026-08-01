package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3057;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4691;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4430 extends AbstractC4441 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Annotation f13051;

    public C4430(Annotation annotation) {
        annotation.getClass();
        this.f13051 = annotation;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4430) {
            return this.f13051 == ((C4430) obj).f13051;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13051);
    }

    public final String toString() {
        return C4430.class.getName() + ": " + this.f13051;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m8973() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f13051;
        Method[] declaredMethods = AbstractC3057.m6756(AbstractC3057.m6759(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            C4691 c4691M9330 = C4691.m9330(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC4431.f13055;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C4445(c4691M9330, (Enum) objInvoke) : objInvoke instanceof Annotation ? new C4448(c4691M9330, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new C4447(c4691M9330, (Object[]) objInvoke) : objInvoke instanceof Class ? new C4449(c4691M9330, (Class) objInvoke) : new C4443(c4691M9330, objInvoke));
        }
        return arrayList;
    }
}
