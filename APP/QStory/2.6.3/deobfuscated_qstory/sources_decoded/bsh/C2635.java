package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2635 extends AbstractC2625 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f7895;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public MethodHandle f7896;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Class f7897;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Field f7898;

    public C2635(Field field) {
        super(field);
        this.f7895 = false;
        this.f7897 = field.getType();
        this.f7898 = field;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Class[] mo5309() {
        return new Class[]{this.f7897};
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5310() {
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final MethodHandle m5344() {
        if (this.f7896 == null) {
            try {
                try {
                    this.f7896 = MethodHandles.lookup().unreflectSetter(this.f7898);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } finally {
                if (this.f7895) {
                    this.f7898 = null;
                }
            }
        }
        return this.f7896;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final MethodHandle mo5295(MethodHandle methodHandle) {
        try {
            try {
                return MethodHandles.lookup().unreflectGetter(this.f7898);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f7895 = true;
            if (this.f7896 != null) {
                this.f7898 = null;
            }
        }
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Class mo5296() {
        return this.f7897;
    }

    @Override // bsh.AbstractC2625
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final synchronized Object mo5317(Object obj, Object... objArr) {
        try {
            int length = objArr.length;
            boolean z = this.f7886;
            if (length == 0) {
                if (z) {
                    return Primitive.wrap((Object) m5312().invoke(), (Class<?>) this.f7897);
                }
                return Primitive.wrap((Object) m5312().invoke(obj), (Class<?>) this.f7897);
            }
            if (z) {
                return (Object) m5344().invoke(AbstractC2625.m5308(new Class[]{this.f7897}[0], objArr[0]));
            }
            return (Object) m5344().invoke(obj, AbstractC2625.m5308(new Class[]{this.f7897}[0], objArr[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }
}
