package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2635 extends AbstractC2624 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f7897;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f7898;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Class[] f7899;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Class f7900;

    public AbstractC2635(Executable executable) {
        super(executable);
        Class<?>[] parameterTypes = executable.getParameterTypes();
        this.f7899 = parameterTypes;
        int parameterCount = executable.getParameterCount();
        this.f7898 = parameterCount;
        boolean zIsVarArgs = executable.isVarArgs();
        this.f7897 = zIsVarArgs;
        int i = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f7881 = i;
        this.f7900 = zIsVarArgs ? parameterTypes[i] : Void.TYPE;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Class[] mo5264() {
        return this.f7899;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5265() {
        return this.f7898;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2621 mo5248(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo5248(obj, objArr);
        int i = this.f7881;
        ArrayList arrayList = this.f7880;
        boolean z = false;
        z = false;
        if (this.f7897) {
            int length = objArr.length;
            Class cls = this.f7900;
            if (i < length) {
                Object obj2 = objArr[i];
                int length2 = objArr.length;
                int i2 = this.f7898;
                if (i2 == length2 && obj2 != null && obj2.getClass().isArray() && AbstractC2661.m5331(cls).isAssignableFrom(obj2.getClass().getComponentType())) {
                    arrayList.add(obj2);
                } else if (i2 == objArr.length && obj2 != null && obj2.getClass().isArray() && Object[].class.isAssignableFrom(obj2.getClass())) {
                    Object[] objArr2 = (Object[]) obj2;
                    Object objNewInstance = Array.newInstance((Class<?>) AbstractC2661.m5331(cls), objArr2.length);
                    for (int i3 = 0; i3 < objArr2.length; i3++) {
                        Array.set(objNewInstance, i3, AbstractC2624.m5263(AbstractC2661.m5331(cls), objArr2[i3]));
                    }
                    arrayList.add(objNewInstance);
                } else {
                    int length3 = objArr.length - this.f7881;
                    Object objNewInstance2 = Array.newInstance((Class<?>) AbstractC2661.m5331(cls), length3);
                    for (int i4 = 0; i4 < length3; i4++) {
                        Array.set(objNewInstance2, i4, AbstractC2624.m5263(AbstractC2661.m5331(cls), objArr[this.f7881 + i4]));
                    }
                    arrayList.add(objNewInstance2);
                }
            } else {
                arrayList.add(Array.newInstance((Class<?>) AbstractC2661.m5331(cls), 0));
            }
            z = true;
        } else if (i < objArr.length) {
            arrayList.add(AbstractC2624.m5263(this.f7899[i], objArr[i]));
        }
        return new C2621(arrayList, z);
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo5269() {
        return this.f7897;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Class mo5270() {
        return AbstractC2661.m5331(this.f7900);
    }
}
