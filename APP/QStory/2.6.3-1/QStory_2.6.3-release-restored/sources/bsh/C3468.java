package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: bsh.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3468 extends AbstractC3458 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f8240;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public MethodHandle f8241;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Class f8242;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Field f8243;

    public C3468(Field field) {
        super(field);
        this.f8240 = false;
        this.f8242 = field.getType();
        this.f8243 = field;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Class[] mo5869() {
        return new Class[]{this.f8242};
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5870() {
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final MethodHandle m5904() {
        if (this.f8241 == null) {
            try {
                try {
                    this.f8241 = MethodHandles.lookup().unreflectSetter(this.f8243);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } finally {
                if (this.f8240) {
                    this.f8243 = null;
                }
            }
        }
        return this.f8241;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final MethodHandle mo5855(MethodHandle methodHandle) {
        try {
            try {
                return MethodHandles.lookup().unreflectGetter(this.f8243);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            this.f8240 = true;
            if (this.f8241 != null) {
                this.f8243 = null;
            }
        }
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Class mo5856() {
        return this.f8242;
    }

    @Override // bsh.AbstractC3458
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final synchronized Object mo5877(Object obj, Object... objArr) {
        try {
            int length = objArr.length;
            boolean z = this.f8231;
            if (length == 0) {
                if (z) {
                    return Primitive.wrap((Object) m5872().invoke(), (Class<?>) this.f8242);
                }
                return Primitive.wrap((Object) m5872().invoke(obj), (Class<?>) this.f8242);
            }
            if (z) {
                return (Object) m5904().invoke(AbstractC3458.m5868(new Class[]{this.f8242}[0], objArr[0]));
            }
            return (Object) m5904().invoke(obj, AbstractC3458.m5868(new Class[]{this.f8242}[0], objArr[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }
}
