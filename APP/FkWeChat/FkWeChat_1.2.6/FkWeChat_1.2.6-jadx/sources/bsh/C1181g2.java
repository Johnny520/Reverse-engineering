package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: bsh.g2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1181g2 extends AbstractC1241q2 {

    /* JADX INFO: renamed from: A */
    public final Class f3559A;

    /* JADX INFO: renamed from: B */
    public MethodHandle f3560B;

    /* JADX INFO: renamed from: C */
    public boolean f3561C;

    /* JADX INFO: renamed from: z */
    public Field f3562z;

    public C1181g2(Field field) {
        super(field);
        this.f3561C = false;
        this.f3559A = field.getType();
        this.f3562z = field;
    }

    /* JADX INFO: renamed from: A */
    public MethodHandle m4331A() {
        try {
            try {
                return MethodHandles.lookup().unreflectSetter(this.f3562z);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } finally {
            if (this.f3561C) {
                this.f3562z = null;
            }
        }
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: l */
    public int mo4320l() {
        return 1;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: m */
    public Class[] mo4321m() {
        return new Class[]{this.f3559A};
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: n */
    public Class mo4107n() {
        return this.f3559A;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: q */
    public synchronized Object mo4332q(Object obj, Object... objArr) {
        try {
            if (objArr.length == 0) {
                if (mo4109v()) {
                    return Primitive.wrap((Object) m5057j().invoke(), (Class<?>) mo4107n());
                }
                return Primitive.wrap((Object) m5057j().invoke(obj), (Class<?>) mo4107n());
            }
            if (mo4109v()) {
                return (Object) m4333z().invoke(super.m5055d(objArr[0], mo4321m()[0]));
            }
            return (Object) m4333z().invoke(obj, super.m5055d(objArr[0], mo4321m()[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: x */
    public MethodHandle mo4110x(MethodHandle methodHandle) {
        try {
            try {
                return MethodHandles.lookup().unreflectGetter(this.f3562z);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } finally {
            this.f3561C = true;
            if (this.f3560B != null) {
                this.f3562z = null;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public MethodHandle m4333z() {
        if (this.f3560B == null) {
            this.f3560B = m4331A();
        }
        return this.f3560B;
    }
}
