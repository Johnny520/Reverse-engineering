package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3469 extends AbstractC3458 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f8244;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f8245;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Class[] f8246;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Class f8247;

    public AbstractC3469(Executable executable) {
        super(executable);
        Class<?>[] parameterTypes = executable.getParameterTypes();
        this.f8246 = parameterTypes;
        int parameterCount = executable.getParameterCount();
        this.f8245 = parameterCount;
        boolean zIsVarArgs = executable.isVarArgs();
        this.f8244 = zIsVarArgs;
        int i = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f8228 = i;
        this.f8247 = zIsVarArgs ? parameterTypes[i] : Void.TYPE;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Class[] mo5869() {
        return this.f8246;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5870() {
        return this.f8245;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3455 mo5853(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo5853(obj, objArr);
        int i = this.f8228;
        ArrayList arrayList = this.f8227;
        boolean z = false;
        z = false;
        if (this.f8244) {
            int length = objArr.length;
            Class cls = this.f8247;
            if (i < length) {
                Object obj2 = objArr[i];
                int length2 = objArr.length;
                int i2 = this.f8245;
                if (i2 == length2 && obj2 != null && obj2.getClass().isArray() && AbstractC3495.m5936(cls).isAssignableFrom(obj2.getClass().getComponentType())) {
                    arrayList.add(obj2);
                } else if (i2 == objArr.length && obj2 != null && obj2.getClass().isArray() && Object[].class.isAssignableFrom(obj2.getClass())) {
                    Object[] objArr2 = (Object[]) obj2;
                    Object objNewInstance = Array.newInstance((Class<?>) AbstractC3495.m5936(cls), objArr2.length);
                    for (int i3 = 0; i3 < objArr2.length; i3++) {
                        Array.set(objNewInstance, i3, AbstractC3458.m5868(AbstractC3495.m5936(cls), objArr2[i3]));
                    }
                    arrayList.add(objNewInstance);
                } else {
                    int length3 = objArr.length - this.f8228;
                    Object objNewInstance2 = Array.newInstance((Class<?>) AbstractC3495.m5936(cls), length3);
                    for (int i4 = 0; i4 < length3; i4++) {
                        Array.set(objNewInstance2, i4, AbstractC3458.m5868(AbstractC3495.m5936(cls), objArr[this.f8228 + i4]));
                    }
                    arrayList.add(objNewInstance2);
                }
            } else {
                arrayList.add(Array.newInstance((Class<?>) AbstractC3495.m5936(cls), 0));
            }
            z = true;
        } else if (i < objArr.length) {
            arrayList.add(AbstractC3458.m5868(this.f8246[i], objArr[i]));
        }
        return new C3455(arrayList, z);
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo5874() {
        return this.f8244;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Class mo5875() {
        return AbstractC3495.m5936(this.f8247);
    }
}
