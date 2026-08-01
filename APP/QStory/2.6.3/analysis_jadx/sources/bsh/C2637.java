package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2637 extends AbstractC2636 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f7903;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Constructor f7904;

    public C2637(Constructor constructor) {
        super(constructor);
        this.f7904 = constructor;
        Class cls = this.f7885;
        Object[] objArr = AbstractC2667.f8002;
        this.f7903 = Modifier.isStatic(cls.getModifiers());
    }

    @Override // bsh.AbstractC2636, bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2622 mo5293(Object obj, Object[] objArr) {
        if (this.f7885.isMemberClass() && !this.f7903) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.mo5293(obj, objArr);
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final boolean mo5313() {
        return this.f7903;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final MethodHandle mo5295(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectConstructor = MethodHandles.lookup().unreflectConstructor(this.f7904);
                if (this.f7899 && methodHandleUnreflectConstructor != null) {
                    methodHandleUnreflectConstructor = methodHandleUnreflectConstructor.asVarargsCollector(this.f7902);
                }
                return methodHandleUnreflectConstructor;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f7904 = null;
        }
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Class mo5296() {
        return this.f7885;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo5316() {
        return this.f7885.isMemberClass();
    }
}
