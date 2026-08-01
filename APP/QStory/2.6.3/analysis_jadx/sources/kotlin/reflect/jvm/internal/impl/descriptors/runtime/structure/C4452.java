package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import kotlin.sequences.InterfaceC5127;
import kotlin.text.AbstractC5144;
import p081.InterfaceC7025;
import p081.InterfaceC7026;
import p081.InterfaceC7027;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4452 extends AbstractC4441 implements InterfaceC7028, InterfaceC7027, InterfaceC7026, InterfaceC7025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f13083;

    public C4452(Class cls) {
        cls.getClass();
        this.f13083 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4452) {
            return AbstractC4395.m8907(this.f13083, ((C4452) obj).f13083);
        }
        return false;
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f13083;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? EmptyList.INSTANCE : AbstractC3055.m6652(declaredAnnotations);
    }

    @Override // p081.InterfaceC7025
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f13083.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C4438(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f13083.hashCode();
    }

    public final String toString() {
        return C4452.class.getName() + ": " + this.f13083;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4691 m8988() {
        Class cls = this.f13083;
        return cls.isAnonymousClass() ? C4691.m9330(AbstractC5144.m10156(cls.getName(), ".")) : C4691.m9330(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List m8989() {
        Method[] declaredMethods = this.f13083.getDeclaredMethods();
        declaredMethods.getClass();
        return AbstractC5122.m10110(AbstractC5122.m10111(new C5115(AbstractC4347.m8838(declaredMethods), true, new C1012(this, 4)), ReflectJavaClass$methods$2.INSTANCE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4687 m8990() {
        return AbstractC4431.m8977(this.f13083).m9327();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List m8991() {
        Field[] declaredFields = this.f13083.getDeclaredFields();
        declaredFields.getClass();
        InterfaceC5127 interfaceC5127M8838 = AbstractC4347.m8838(declaredFields);
        ReflectJavaClass$fields$1 reflectJavaClass$fields$1 = ReflectJavaClass$fields$1.INSTANCE;
        reflectJavaClass$fields$1.getClass();
        return AbstractC5122.m10110(AbstractC5122.m10111(new C5115(interfaceC5127M8838, false, reflectJavaClass$fields$1), ReflectJavaClass$fields$2.INSTANCE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m8992() {
        Constructor<?>[] declaredConstructors = this.f13083.getDeclaredConstructors();
        declaredConstructors.getClass();
        InterfaceC5127 interfaceC5127M8838 = AbstractC4347.m8838(declaredConstructors);
        ReflectJavaClass$constructors$1 reflectJavaClass$constructors$1 = ReflectJavaClass$constructors$1.INSTANCE;
        reflectJavaClass$constructors$1.getClass();
        return AbstractC5122.m10110(AbstractC5122.m10111(new C5115(interfaceC5127M8838, false, reflectJavaClass$constructors$1), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // p081.InterfaceC7028
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4430 mo8972(C4687 c4687) {
        Annotation[] declaredAnnotations;
        c4687.getClass();
        Class cls = this.f13083;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC3055.m6658(declaredAnnotations, c4687);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m8993() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f13083;
        cls.getClass();
        C0325 c0325 = AbstractC3056.f9763;
        Boolean bool = null;
        if (c0325 == null) {
            try {
                c0325 = new C0325(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                c0325 = new C0325(bool, bool, bool, bool, 7);
            }
            AbstractC3056.f9763 = c0325;
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
    public final ArrayList m8994() {
        Class cls = this.f13083;
        cls.getClass();
        C0325 c0325 = AbstractC3056.f9763;
        if (c0325 == null) {
            try {
                c0325 = new C0325(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                c0325 = new C0325(objArr, objArr, objArr, objArr, 7);
            }
            AbstractC3056.f9763 = c0325;
        }
        Method method = (Method) c0325.f1093;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C4440(obj));
        }
        return arrayList;
    }
}
