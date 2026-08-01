package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3458 implements Member {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f8225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f8226;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f8229;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Class f8230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f8231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MethodHandle f8233 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f8227 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f8228 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3458(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f8229 = member.getModifiers();
        this.f8230 = member.getDeclaringClass();
        this.f8225 = member.getName();
        this.f8226 = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        Object[] objArr = AbstractC3500.f8347;
        this.f8231 = Modifier.isStatic(member2.getModifiers());
        this.f8232 = member2.isSynthetic();
        if (!C3488.m5920() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m5868(Class cls, Object obj) {
        Class<?> clsM5955 = AbstractC3495.m5955(obj, false);
        if (clsM5955 == null || !cls.isAssignableFrom(clsM5955)) {
            obj = AbstractC3495.m5933(obj, cls, 0);
        }
        return Primitive.unwrap(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (getClass() == obj.getClass()) {
                AbstractC3458 abstractC3458 = (AbstractC3458) obj;
                if (this.f8225.equals(abstractC3458.f8225) && this.f8230 == abstractC3458.f8230 && mo5870() == abstractC3458.mo5870() && mo5856() == abstractC3458.mo5856() && this.f8229 == abstractC3458.f8229) {
                    for (int i = 0; i < mo5870(); i++) {
                        if (mo5869()[i] == abstractC3458.mo5869()[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Member
    public final Class getDeclaringClass() {
        return this.f8230;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f8229;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f8225;
    }

    public final int hashCode() {
        return ((Integer) Stream.of((Object[]) mo5869()).map(new C3474(11)).reduce(75, new C3456())).intValue() ^ (((((getClass().hashCode() ^ this.f8225.hashCode()) ^ this.f8230.hashCode()) ^ mo5870()) ^ mo5856().hashCode()) ^ this.f8229);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f8232;
    }

    public final String toString() {
        return this.f8226;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract Class[] mo5869();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract int mo5870();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] m5871() {
        return (String[]) MethodType.methodType((Class<?>) mo5856(), (Class<?>[]) mo5869()).parameterList().stream().map(new C3474(1)).toArray(new C3483(3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MethodHandle m5872() {
        if (this.f8233 == null) {
            this.f8233 = mo5855(null);
        }
        return this.f8233;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3455 mo5853(Object obj, Object[] objArr) throws InvocationTargetException {
        if (this.f8228 > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + this.f8225 + Arrays.asList(mo5869()));
        }
        ArrayList arrayList = this.f8227;
        arrayList.clear();
        for (int i = 0; i < this.f8228; i++) {
            arrayList.add(m5868(mo5869()[i], objArr[i]));
        }
        return new C3455(arrayList, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean mo5873() {
        return this.f8231;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo5854() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean mo5874() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract MethodHandle mo5855(MethodHandle methodHandle);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Class mo5875() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract Class mo5856();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo5857() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean mo5876() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public synchronized Object mo5877(Object obj, Object... objArr) {
        InvocationTargetException invocationTargetException;
        if (objArr == null) {
            objArr = AbstractC3500.f8347;
            try {
            } finally {
            }
        }
        return Primitive.wrap(m5878(obj, objArr), (Class<?>) mo5856());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized Object m5878(Object obj, Object[] objArr) {
        try {
            AbstractC3500.m5991("Invoking method (entry): ", this, objArr);
            C3455 c3455Mo5853 = mo5853(obj, objArr);
            List<?> list = c3455Mo5853.f8208;
            if (Interpreter.DEBUG.get().booleanValue()) {
                AbstractC3500.m5991("Invoking method (after): ", this, list.toArray());
            }
            if (mo5870() > 0) {
                MethodHandle methodHandleM5872 = m5872();
                if (c3455Mo5853.f8207) {
                    methodHandleM5872 = methodHandleM5872.asFixedArity();
                }
                return methodHandleM5872.invokeWithArguments(list);
            }
            if (!mo5873() && !(this instanceof C3470)) {
                return (Object) m5872().invoke(list.get(0));
            }
            return (Object) m5872().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }
}
