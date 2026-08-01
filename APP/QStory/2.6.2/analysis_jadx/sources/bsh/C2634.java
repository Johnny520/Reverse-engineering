package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2634 extends AbstractC2624 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f7893;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public MethodHandle f7894;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Class f7895;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Field f7896;

    public C2634(Field field) {
        super(field);
        this.f7893 = false;
        this.f7895 = field.getType();
        this.f7896 = field;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Class[] mo5264() {
        return new Class[]{this.f7895};
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5265() {
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final MethodHandle m5299() {
        if (this.f7894 == null) {
            try {
                try {
                    this.f7894 = MethodHandles.lookup().unreflectSetter(this.f7896);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } finally {
                if (this.f7893) {
                    this.f7896 = null;
                }
            }
        }
        return this.f7894;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final MethodHandle mo5250(MethodHandle methodHandle) {
        try {
            try {
                return MethodHandles.lookup().unreflectGetter(this.f7896);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f7893 = true;
            if (this.f7894 != null) {
                this.f7896 = null;
            }
        }
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Class mo5251() {
        return this.f7895;
    }

    @Override // bsh.AbstractC2624
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final synchronized Object mo5272(Object obj, Object... objArr) {
        try {
            int length = objArr.length;
            boolean z = this.f7884;
            if (length == 0) {
                if (z) {
                    return Primitive.wrap((Object) m5267().invoke(), (Class<?>) this.f7895);
                }
                return Primitive.wrap((Object) m5267().invoke(obj), (Class<?>) this.f7895);
            }
            if (z) {
                return (Object) m5299().invoke(AbstractC2624.m5263(new Class[]{this.f7895}[0], objArr[0]));
            }
            return (Object) m5299().invoke(obj, AbstractC2624.m5263(new Class[]{this.f7895}[0], objArr[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }
}
