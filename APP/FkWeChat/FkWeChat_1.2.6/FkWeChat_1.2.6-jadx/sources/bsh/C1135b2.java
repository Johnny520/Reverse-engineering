package bsh;

import bsh.AbstractC1241q2;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.b2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1135b2 extends AbstractC1175f2 {

    /* JADX INFO: renamed from: D */
    public Constructor f3464D;

    /* JADX INFO: renamed from: E */
    public final boolean f3465E;

    public C1135b2(Constructor constructor) {
        super(constructor);
        this.f3464D = constructor;
        this.f3465E = AbstractC1143c4.m4186o0(getDeclaringClass());
    }

    @Override // bsh.AbstractC1175f2, bsh.AbstractC1241q2
    /* JADX INFO: renamed from: e */
    public AbstractC1241q2.a mo4106e(Object obj, Object[] objArr) {
        if (mo4108t() && !mo4109v()) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.mo4106e(obj, objArr);
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: n */
    public Class mo4107n() {
        return getDeclaringClass();
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: t */
    public boolean mo4108t() {
        return getDeclaringClass().isMemberClass();
    }

    @Override // bsh.AbstractC1241q2
    /* JADX INFO: renamed from: v */
    public boolean mo4109v() {
        return this.f3465E;
    }

    @Override // bsh.AbstractC1175f2, bsh.AbstractC1241q2
    /* JADX INFO: renamed from: x */
    public MethodHandle mo4110x(MethodHandle methodHandle) {
        try {
            try {
                return super.mo4110x(MethodHandles.lookup().unreflectConstructor(this.f3464D));
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } finally {
            this.f3464D = null;
        }
    }
}
