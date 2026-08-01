package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3887;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5333;
import kotlin.reflect.jvm.internal.impl.descriptors.C5335;
import kotlin.reflect.jvm.internal.impl.descriptors.C5339;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p094.C7803;
import p094.C7804;
import p094.C7805;
import p097.InterfaceC7855;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5276 extends AbstractC5273 implements InterfaceC7857, InterfaceC7855 {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5276) && AbstractC5227.m9466(mo9538(), ((AbstractC5276) obj).mo9538());
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        Member memberMo9538 = mo9538();
        memberMo9538.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo9538).getDeclaredAnnotations();
        return declaredAnnotations != null ? AbstractC3887.m7212(declaredAnnotations) : EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return mo9538().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo9538();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC5333 m9541() {
        int modifiers = mo9538().getModifiers();
        return Modifier.isPublic(modifiers) ? C5339.f13491 : Modifier.isPrivate(modifiers) ? C5335.f13487 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C7803.f19010 : C7804.f19011 : C7805.f19012;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m9542(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        AbstractC5269 c5271;
        String str;
        boolean z2;
        C5266 c5266;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C5265 c5265 = C5265.f13407;
        Member memberMo9538 = mo9538();
        memberMo9538.getClass();
        C5266 c52662 = C5265.f13406;
        if (c52662 == null) {
            synchronized (c5265) {
                c52662 = C5265.f13406;
                if (c52662 == null) {
                    Class<?> cls = memberMo9538.getClass();
                    try {
                        c5266 = new C5266(cls.getMethod("getParameters", null), AbstractC5263.m9533(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        c5266 = new C5266(null, null);
                    }
                    C5265.f13406 = c5266;
                    c52662 = c5266;
                }
            }
        }
        Method method2 = c52662.f13409;
        if (method2 == null || (method = c52662.f13408) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(memberMo9538, null);
            objInvoke.getClass();
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, null);
                objInvoke2.getClass();
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            type.getClass();
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                c5271 = cls2.isPrimitive() ? new C5271(cls2) : ((type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) ? new C5283(type) : type instanceof WildcardType ? new C5259((WildcardType) type) : new C5282(type);
            }
            if (arrayList != null) {
                str = (String) AbstractC5176.m9377(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + SignatureVisitor.EXTENDS + size + " (name=" + m9543() + " type=" + c5271 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            }
            arrayList2.add(new C5260(c5271, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5523 m9543() {
        String name = mo9538().getName();
        return name != null ? C5523.m9889(name) : AbstractC5524.f14056;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Member mo9538();

    @Override // p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5262 mo9531(C5519 c5519) {
        c5519.getClass();
        Member memberMo9538 = mo9538();
        memberMo9538.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo9538).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC3887.m7218(declaredAnnotations, c5519);
        }
        return null;
    }
}
