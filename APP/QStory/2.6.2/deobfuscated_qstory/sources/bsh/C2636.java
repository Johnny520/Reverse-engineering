package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2636 extends AbstractC2635 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f7901;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Constructor f7902;

    public C2636(Constructor constructor) {
        super(constructor);
        this.f7902 = constructor;
        Class cls = this.f7883;
        Object[] objArr = AbstractC2666.f8000;
        this.f7901 = Modifier.isStatic(cls.getModifiers());
    }

    @Override // bsh.AbstractC2635, bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2621 mo5248(Object obj, Object[] objArr) {
        if (this.f7883.isMemberClass() && !this.f7901) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.mo5248(obj, objArr);
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final boolean mo5268() {
        return this.f7901;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final MethodHandle mo5250(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectConstructor = MethodHandles.lookup().unreflectConstructor(this.f7902);
                if (this.f7897 && methodHandleUnreflectConstructor != null) {
                    methodHandleUnreflectConstructor = methodHandleUnreflectConstructor.asVarargsCollector(this.f7900);
                }
                return methodHandleUnreflectConstructor;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f7902 = null;
        }
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Class mo5251() {
        return this.f7883;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo5271() {
        return this.f7883.isMemberClass();
    }
}
