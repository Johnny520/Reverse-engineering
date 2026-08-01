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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2624 implements Member {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f7878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f7879;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f7882;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Class f7883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f7884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f7885;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MethodHandle f7886 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f7880 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f7881 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2624(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f7882 = member.getModifiers();
        this.f7883 = member.getDeclaringClass();
        this.f7878 = member.getName();
        this.f7879 = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        Object[] objArr = AbstractC2666.f8000;
        this.f7884 = Modifier.isStatic(member2.getModifiers());
        this.f7885 = member2.isSynthetic();
        if (!C2654.m5315() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m5263(Class cls, Object obj) {
        Class<?> clsM5350 = AbstractC2661.m5350(obj, false);
        if (clsM5350 == null || !cls.isAssignableFrom(clsM5350)) {
            obj = AbstractC2661.m5328(obj, cls, 0);
        }
        return Primitive.unwrap(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (getClass() == obj.getClass()) {
                AbstractC2624 abstractC2624 = (AbstractC2624) obj;
                if (this.f7878.equals(abstractC2624.f7878) && this.f7883 == abstractC2624.f7883 && mo5265() == abstractC2624.mo5265() && mo5251() == abstractC2624.mo5251() && this.f7882 == abstractC2624.f7882) {
                    for (int i = 0; i < mo5265(); i++) {
                        if (mo5264()[i] == abstractC2624.mo5264()[i]) {
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
        return this.f7883;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f7882;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f7878;
    }

    public final int hashCode() {
        return ((Integer) Stream.of((Object[]) mo5264()).map(new C2640(11)).reduce(75, new C2622())).intValue() ^ (((((getClass().hashCode() ^ this.f7878.hashCode()) ^ this.f7883.hashCode()) ^ mo5265()) ^ mo5251().hashCode()) ^ this.f7882);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f7885;
    }

    public final String toString() {
        return this.f7879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract Class[] mo5264();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract int mo5265();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] m5266() {
        return (String[]) MethodType.methodType((Class<?>) mo5251(), (Class<?>[]) mo5264()).parameterList().stream().map(new C2640(1)).toArray(new C2649(3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MethodHandle m5267() {
        if (this.f7886 == null) {
            this.f7886 = mo5250(null);
        }
        return this.f7886;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2621 mo5248(Object obj, Object[] objArr) throws InvocationTargetException {
        if (this.f7881 > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + this.f7878 + Arrays.asList(mo5264()));
        }
        ArrayList arrayList = this.f7880;
        arrayList.clear();
        for (int i = 0; i < this.f7881; i++) {
            arrayList.add(m5263(mo5264()[i], objArr[i]));
        }
        return new C2621(arrayList, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean mo5268() {
        return this.f7884;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo5249() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean mo5269() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract MethodHandle mo5250(MethodHandle methodHandle);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Class mo5270() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract Class mo5251();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo5252() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean mo5271() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public synchronized Object mo5272(Object obj, Object... objArr) {
        InvocationTargetException invocationTargetException;
        if (objArr == null) {
            objArr = AbstractC2666.f8000;
            try {
            } finally {
            }
        }
        return Primitive.wrap(m5273(obj, objArr), (Class<?>) mo5251());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized Object m5273(Object obj, Object[] objArr) {
        try {
            AbstractC2666.m5386("Invoking method (entry): ", this, objArr);
            C2621 c2621Mo5248 = mo5248(obj, objArr);
            List<?> list = c2621Mo5248.f7861;
            if (Interpreter.DEBUG.get().booleanValue()) {
                AbstractC2666.m5386("Invoking method (after): ", this, list.toArray());
            }
            if (mo5265() > 0) {
                MethodHandle methodHandleM5267 = m5267();
                if (c2621Mo5248.f7860) {
                    methodHandleM5267 = methodHandleM5267.asFixedArity();
                }
                return methodHandleM5267.invokeWithArguments(list);
            }
            if (!mo5268() && !(this instanceof C2636)) {
                return (Object) m5267().invoke(list.get(0));
            }
            return (Object) m5267().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }
}
