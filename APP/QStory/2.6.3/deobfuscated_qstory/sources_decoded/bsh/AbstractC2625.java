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
public abstract class AbstractC2625 implements Member {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f7880;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f7881;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f7884;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Class f7885;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f7886;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f7887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MethodHandle f7888 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f7882 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f7883 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2625(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f7884 = member.getModifiers();
        this.f7885 = member.getDeclaringClass();
        this.f7880 = member.getName();
        this.f7881 = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        Object[] objArr = AbstractC2667.f8002;
        this.f7886 = Modifier.isStatic(member2.getModifiers());
        this.f7887 = member2.isSynthetic();
        if (!C2655.m5360() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m5308(Class cls, Object obj) {
        Class<?> clsM5395 = AbstractC2662.m5395(obj, false);
        if (clsM5395 == null || !cls.isAssignableFrom(clsM5395)) {
            obj = AbstractC2662.m5373(obj, cls, 0);
        }
        return Primitive.unwrap(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (getClass() == obj.getClass()) {
                AbstractC2625 abstractC2625 = (AbstractC2625) obj;
                if (this.f7880.equals(abstractC2625.f7880) && this.f7885 == abstractC2625.f7885 && mo5310() == abstractC2625.mo5310() && mo5296() == abstractC2625.mo5296() && this.f7884 == abstractC2625.f7884) {
                    for (int i = 0; i < mo5310(); i++) {
                        if (mo5309()[i] == abstractC2625.mo5309()[i]) {
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
        return this.f7885;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f7884;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f7880;
    }

    public final int hashCode() {
        return ((Integer) Stream.of((Object[]) mo5309()).map(new C2641(11)).reduce(75, new C2623())).intValue() ^ (((((getClass().hashCode() ^ this.f7880.hashCode()) ^ this.f7885.hashCode()) ^ mo5310()) ^ mo5296().hashCode()) ^ this.f7884);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f7887;
    }

    public final String toString() {
        return this.f7881;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract Class[] mo5309();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract int mo5310();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] m5311() {
        return (String[]) MethodType.methodType((Class<?>) mo5296(), (Class<?>[]) mo5309()).parameterList().stream().map(new C2641(1)).toArray(new C2650(3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MethodHandle m5312() {
        if (this.f7888 == null) {
            this.f7888 = mo5295(null);
        }
        return this.f7888;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2622 mo5293(Object obj, Object[] objArr) throws InvocationTargetException {
        if (this.f7883 > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + this.f7880 + Arrays.asList(mo5309()));
        }
        ArrayList arrayList = this.f7882;
        arrayList.clear();
        for (int i = 0; i < this.f7883; i++) {
            arrayList.add(m5308(mo5309()[i], objArr[i]));
        }
        return new C2622(arrayList, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean mo5313() {
        return this.f7886;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo5294() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean mo5314() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract MethodHandle mo5295(MethodHandle methodHandle);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Class mo5315() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract Class mo5296();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo5297() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean mo5316() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public synchronized Object mo5317(Object obj, Object... objArr) {
        InvocationTargetException invocationTargetException;
        if (objArr == null) {
            objArr = AbstractC2667.f8002;
            try {
            } finally {
            }
        }
        return Primitive.wrap(m5318(obj, objArr), (Class<?>) mo5296());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized Object m5318(Object obj, Object[] objArr) {
        try {
            AbstractC2667.m5431("Invoking method (entry): ", this, objArr);
            C2622 c2622Mo5293 = mo5293(obj, objArr);
            List<?> list = c2622Mo5293.f7863;
            if (Interpreter.DEBUG.get().booleanValue()) {
                AbstractC2667.m5431("Invoking method (after): ", this, list.toArray());
            }
            if (mo5310() > 0) {
                MethodHandle methodHandleM5312 = m5312();
                if (c2622Mo5293.f7862) {
                    methodHandleM5312 = methodHandleM5312.asFixedArity();
                }
                return methodHandleM5312.invokeWithArguments(list);
            }
            if (!mo5313() && !(this instanceof C2637)) {
                return (Object) m5312().invoke(list.get(0));
            }
            return (Object) m5312().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }
}
