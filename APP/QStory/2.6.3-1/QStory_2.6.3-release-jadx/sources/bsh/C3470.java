package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3470 extends AbstractC3469 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f8248;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Constructor f8249;

    public C3470(Constructor constructor) {
        super(constructor);
        this.f8249 = constructor;
        Class cls = this.f8230;
        Object[] objArr = AbstractC3500.f8347;
        this.f8248 = Modifier.isStatic(cls.getModifiers());
    }

    @Override // bsh.AbstractC3469, bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3455 mo5853(Object obj, Object[] objArr) {
        if (this.f8230.isMemberClass() && !this.f8248) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.mo5853(obj, objArr);
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final boolean mo5873() {
        return this.f8248;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final MethodHandle mo5855(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectConstructor = MethodHandles.lookup().unreflectConstructor(this.f8249);
                if (this.f8244 && methodHandleUnreflectConstructor != null) {
                    methodHandleUnreflectConstructor = methodHandleUnreflectConstructor.asVarargsCollector(this.f8247);
                }
                return methodHandleUnreflectConstructor;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f8249 = null;
        }
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Class mo5856() {
        return this.f8230;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo5876() {
        return this.f8230.isMemberClass();
    }
}
