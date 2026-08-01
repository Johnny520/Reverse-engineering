package bsh;

import bsh.AbstractC1241q2;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: renamed from: bsh.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1175f2 extends AbstractC1241q2 {

    /* JADX INFO: renamed from: A */
    public final Class[] f3549A;

    /* JADX INFO: renamed from: B */
    public final int f3550B;

    /* JADX INFO: renamed from: C */
    public final boolean f3551C;

    /* JADX INFO: renamed from: z */
    public final Class f3552z;

    public AbstractC1175f2(Executable executable) {
        super(executable);
        this.f3549A = executable.getParameterTypes();
        int parameterCount = executable.getParameterCount();
        this.f3550B = parameterCount;
        this.f3551C = executable.isVarArgs();
        this.f3782y = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f3552z = mo4323w() ? mo4321m()[this.f3782y] : Void.TYPE;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: e */
    public AbstractC1241q2.a mo4106e(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo4106e(obj, objArr);
        boolean z10 = false;
        if (mo4323w()) {
            if (m5056i() < objArr.length) {
                if (mo4320l() == objArr.length && objArr[m5056i()].getClass().isArray() && mo4322p().isAssignableFrom(objArr[m5056i()].getClass().getComponentType())) {
                    this.f3781x.add(objArr[m5056i()]);
                    z10 = true;
                } else {
                    Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, m5056i(), objArr.length);
                    for (Object obj2 : objArrCopyOfRange) {
                        this.f3781x.add(super.m5055d(obj2, mo4322p()));
                    }
                }
            }
        } else if (objArr != null && m5056i() < objArr.length) {
            this.f3781x.add(super.m5055d(objArr[m5056i()], mo4321m()[m5056i()]));
        }
        return new AbstractC1241q2.a(this.f3781x, z10);
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: l */
    public int mo4320l() {
        return this.f3550B;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: m */
    public Class[] mo4321m() {
        return this.f3549A;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: p */
    public Class mo4322p() {
        return AbstractC1273v4.m5133c(m4324z());
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: w */
    public boolean mo4323w() {
        return this.f3551C;
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: x */
    public MethodHandle mo4110x(MethodHandle methodHandle) {
        return (!mo4323w() || methodHandle == null) ? methodHandle : methodHandle.asVarargsCollector(m4324z());
    }

    /* JADX INFO: renamed from: z */
    public Class m4324z() {
        return this.f3552z;
    }
}
