package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2636 extends AbstractC2625 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f7899;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f7900;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Class[] f7901;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Class f7902;

    public AbstractC2636(Executable executable) {
        super(executable);
        Class<?>[] parameterTypes = executable.getParameterTypes();
        this.f7901 = parameterTypes;
        int parameterCount = executable.getParameterCount();
        this.f7900 = parameterCount;
        boolean zIsVarArgs = executable.isVarArgs();
        this.f7899 = zIsVarArgs;
        int i = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f7883 = i;
        this.f7902 = zIsVarArgs ? parameterTypes[i] : Void.TYPE;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Class[] mo5309() {
        return this.f7901;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5310() {
        return this.f7900;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2622 mo5293(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo5293(obj, objArr);
        int i = this.f7883;
        ArrayList arrayList = this.f7882;
        boolean z = false;
        z = false;
        if (this.f7899) {
            int length = objArr.length;
            Class cls = this.f7902;
            if (i < length) {
                Object obj2 = objArr[i];
                int length2 = objArr.length;
                int i2 = this.f7900;
                if (i2 == length2 && obj2 != null && obj2.getClass().isArray() && AbstractC2662.m5376(cls).isAssignableFrom(obj2.getClass().getComponentType())) {
                    arrayList.add(obj2);
                } else if (i2 == objArr.length && obj2 != null && obj2.getClass().isArray() && Object[].class.isAssignableFrom(obj2.getClass())) {
                    Object[] objArr2 = (Object[]) obj2;
                    Object objNewInstance = Array.newInstance((Class<?>) AbstractC2662.m5376(cls), objArr2.length);
                    for (int i3 = 0; i3 < objArr2.length; i3++) {
                        Array.set(objNewInstance, i3, AbstractC2625.m5308(AbstractC2662.m5376(cls), objArr2[i3]));
                    }
                    arrayList.add(objNewInstance);
                } else {
                    int length3 = objArr.length - this.f7883;
                    Object objNewInstance2 = Array.newInstance((Class<?>) AbstractC2662.m5376(cls), length3);
                    for (int i4 = 0; i4 < length3; i4++) {
                        Array.set(objNewInstance2, i4, AbstractC2625.m5308(AbstractC2662.m5376(cls), objArr[this.f7883 + i4]));
                    }
                    arrayList.add(objNewInstance2);
                }
            } else {
                arrayList.add(Array.newInstance((Class<?>) AbstractC2662.m5376(cls), 0));
            }
            z = true;
        } else if (i < objArr.length) {
            arrayList.add(AbstractC2625.m5308(this.f7901[i], objArr[i]));
        }
        return new C2622(arrayList, z);
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo5314() {
        return this.f7899;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Class mo5315() {
        return AbstractC2662.m5376(this.f7902);
    }
}
