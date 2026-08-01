package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import kotlin.sequences.InterfaceC5126;
import kotlin.text.AbstractC5143;
import p081.InterfaceC7024;
import p081.InterfaceC7025;
import p081.InterfaceC7026;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4451 extends AbstractC4440 implements InterfaceC7027, InterfaceC7026, InterfaceC7025, InterfaceC7024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f13079;

    public C4451(Class cls) {
        cls.getClass();
        this.f13079 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4451) {
            return AbstractC4394.m8917(this.f13079, ((C4451) obj).f13079);
        }
        return false;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f13079;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? EmptyList.INSTANCE : AbstractC4921.m9895(declaredAnnotations);
    }

    @Override // p081.InterfaceC7024
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f13079.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C4437(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f13079.hashCode();
    }

    public final String toString() {
        return C4451.class.getName() + ": " + this.f13079;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4690 m8998() {
        Class cls = this.f13079;
        return cls.isAnonymousClass() ? C4690.m9340(AbstractC5143.m10141(cls.getName(), ".")) : C4690.m9340(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List m8999() {
        Method[] declaredMethods = this.f13079.getDeclaredMethods();
        declaredMethods.getClass();
        return AbstractC5121.m10106(AbstractC5121.m10111(new C5114(AbstractC4346.m8841(declaredMethods), true, new C1012(this, 4)), ReflectJavaClass$methods$2.INSTANCE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4686 m9000() {
        return AbstractC4430.m8987(this.f13079).m9337();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List m9001() {
        Field[] declaredFields = this.f13079.getDeclaredFields();
        declaredFields.getClass();
        InterfaceC5126 interfaceC5126M8841 = AbstractC4346.m8841(declaredFields);
        ReflectJavaClass$fields$1 reflectJavaClass$fields$1 = ReflectJavaClass$fields$1.INSTANCE;
        reflectJavaClass$fields$1.getClass();
        return AbstractC5121.m10106(AbstractC5121.m10111(new C5114(interfaceC5126M8841, false, reflectJavaClass$fields$1), ReflectJavaClass$fields$2.INSTANCE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m9002() {
        Constructor<?>[] declaredConstructors = this.f13079.getDeclaredConstructors();
        declaredConstructors.getClass();
        InterfaceC5126 interfaceC5126M8841 = AbstractC4346.m8841(declaredConstructors);
        ReflectJavaClass$constructors$1 reflectJavaClass$constructors$1 = ReflectJavaClass$constructors$1.INSTANCE;
        reflectJavaClass$constructors$1.getClass();
        return AbstractC5121.m10106(AbstractC5121.m10111(new C5114(interfaceC5126M8841, false, reflectJavaClass$constructors$1), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4429 mo8982(C4686 c4686) {
        Annotation[] declaredAnnotations;
        c4686.getClass();
        Class cls = this.f13079;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC4921.m9900(declaredAnnotations, c4686);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m9003() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f13079;
        cls.getClass();
        C0325 c0325 = AbstractC5061.f14602;
        Boolean bool = null;
        if (c0325 == null) {
            try {
                c0325 = new C0325(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                c0325 = new C0325(bool, bool, bool, bool, 7);
            }
            AbstractC5061.f14602 = c0325;
        }
        Method method = (Method) c0325.f1094;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList m9004() {
        Class cls = this.f13079;
        cls.getClass();
        C0325 c0325 = AbstractC5061.f14602;
        if (c0325 == null) {
            try {
                c0325 = new C0325(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                c0325 = new C0325(objArr, objArr, objArr, objArr, 7);
            }
            AbstractC5061.f14602 = c0325;
        }
        Method method = (Method) c0325.f1093;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C4439(obj));
        }
        return arrayList;
    }
}
