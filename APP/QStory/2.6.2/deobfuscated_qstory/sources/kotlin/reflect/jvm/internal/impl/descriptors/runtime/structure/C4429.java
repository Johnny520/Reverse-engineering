package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p053.AbstractC6560;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4429 extends AbstractC4440 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Annotation f13047;

    public C4429(Annotation annotation) {
        annotation.getClass();
        this.f13047 = annotation;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4429) {
            return this.f13047 == ((C4429) obj).f13047;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13047);
    }

    public final String toString() {
        return C4429.class.getName() + ": " + this.f13047;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m8983() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f13047;
        Method[] declaredMethods = AbstractC6560.m12029(AbstractC6560.m12033(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            C4690 c4690M9340 = C4690.m9340(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC4430.f13051;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C4444(c4690M9340, (Enum) objInvoke) : objInvoke instanceof Annotation ? new C4447(c4690M9340, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new C4446(c4690M9340, (Object[]) objInvoke) : objInvoke instanceof Class ? new C4448(c4690M9340, (Class) objInvoke) : new C4442(c4690M9340, objInvoke));
        }
        return arrayList;
    }
}
