package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import kotlin.sequences.InterfaceC5959;
import kotlin.text.AbstractC5976;
import p097.InterfaceC7854;
import p097.InterfaceC7855;
import p097.InterfaceC7856;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5284 extends AbstractC5273 implements InterfaceC7857, InterfaceC7856, InterfaceC7855, InterfaceC7854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f13428;

    public C5284(Class cls) {
        cls.getClass();
        this.f13428 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5284) {
            return AbstractC5227.m9466(this.f13428, ((C5284) obj).f13428);
        }
        return false;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f13428;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? EmptyList.INSTANCE : AbstractC3887.m7212(declaredAnnotations);
    }

    @Override // p097.InterfaceC7854
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f13428.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C5270(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f13428.hashCode();
    }

    public final String toString() {
        return C5284.class.getName() + ": " + this.f13428;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5523 m9547() {
        Class cls = this.f13428;
        return cls.isAnonymousClass() ? C5523.m9889(AbstractC5976.m10715(cls.getName(), ".")) : C5523.m9889(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List m9548() {
        Method[] declaredMethods = this.f13428.getDeclaredMethods();
        declaredMethods.getClass();
        return AbstractC5954.m10669(AbstractC5954.m10670(new C5947(AbstractC5179.m9397(declaredMethods), true, new C1850(this, 4)), ReflectJavaClass$methods$2.INSTANCE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5519 m9549() {
        return AbstractC5263.m9536(this.f13428).m9886();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List m9550() {
        Field[] declaredFields = this.f13428.getDeclaredFields();
        declaredFields.getClass();
        InterfaceC5959 interfaceC5959M9397 = AbstractC5179.m9397(declaredFields);
        ReflectJavaClass$fields$1 reflectJavaClass$fields$1 = ReflectJavaClass$fields$1.INSTANCE;
        reflectJavaClass$fields$1.getClass();
        return AbstractC5954.m10669(AbstractC5954.m10670(new C5947(interfaceC5959M9397, false, reflectJavaClass$fields$1), ReflectJavaClass$fields$2.INSTANCE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m9551() {
        Constructor<?>[] declaredConstructors = this.f13428.getDeclaredConstructors();
        declaredConstructors.getClass();
        InterfaceC5959 interfaceC5959M9397 = AbstractC5179.m9397(declaredConstructors);
        ReflectJavaClass$constructors$1 reflectJavaClass$constructors$1 = ReflectJavaClass$constructors$1.INSTANCE;
        reflectJavaClass$constructors$1.getClass();
        return AbstractC5954.m10669(AbstractC5954.m10670(new C5947(interfaceC5959M9397, false, reflectJavaClass$constructors$1), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5262 mo9531(C5519 c5519) {
        Annotation[] declaredAnnotations;
        c5519.getClass();
        Class cls = this.f13428;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC3887.m7218(declaredAnnotations, c5519);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m9552() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f13428;
        cls.getClass();
        C1171 c1171 = AbstractC3888.f10108;
        Boolean bool = null;
        if (c1171 == null) {
            try {
                c1171 = new C1171(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                c1171 = new C1171(bool, bool, bool, bool, 7);
            }
            AbstractC3888.f10108 = c1171;
        }
        Method method = (Method) c1171.f1439;
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
    public final ArrayList m9553() {
        Class cls = this.f13428;
        cls.getClass();
        C1171 c1171 = AbstractC3888.f10108;
        if (c1171 == null) {
            try {
                c1171 = new C1171(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                c1171 = new C1171(objArr, objArr, objArr, objArr, 7);
            }
            AbstractC3888.f10108 = c1171;
        }
        Method method = (Method) c1171.f1438;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C5272(obj));
        }
        return arrayList;
    }
}
