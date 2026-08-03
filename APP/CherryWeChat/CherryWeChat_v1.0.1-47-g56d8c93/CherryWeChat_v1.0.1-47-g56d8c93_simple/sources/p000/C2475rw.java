package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: rw */
/* JADX INFO: loaded from: classes.dex */
public final class C2475rw implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: j */
    public static final C0118Cp f8699j = null;

    /* JADX INFO: renamed from: b */
    public final C2812zp f8700b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0802Sm f8701c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0802Sm f8702d;

    /* JADX INFO: renamed from: e */
    public final int f8703e;

    /* JADX INFO: renamed from: f */
    public final int f8704f;

    /* JADX INFO: renamed from: g */
    public final Class f8705g;

    /* JADX INFO: renamed from: h */
    public final C2644vt f8706h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0098CB f8707i;

    static {
        f8699j = new C0118Cp(50);
    }

    public C2475rw(C2812zp r1, InterfaceC0802Sm r2, InterfaceC0802Sm r3, int r4, int r5, InterfaceC0098CB r6, Class r7, C2644vt r8) {
        this.f8700b = r1;
        this.f8701c = r2;
        this.f8702d = r3;
        this.f8703e = r4;
        this.f8704f = r5;
        this.f8707i = r6;
        this.f8705g = r7;
        this.f8706h = r8;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r6) {
        C2812zp r0 = this.f8700b;
        monitor-enter(r0);
        C2769yp r2 = r0.f9527b;     // Catch: Throwable -> L17
        InterfaceC0938Vt r3 = (InterfaceC0938Vt) ((ArrayDeque) r2.f9067a).poll();     // Catch: Throwable -> L17
        if (r3 != null) goto L7;
        r3 = r2.m5340g();     // Catch: Throwable -> L17
    L7:
        C2726xp r32 = (C2726xp) r3;     // Catch: Throwable -> L17
        r32.f9312b = 8;     // Catch: Throwable -> L17
        r32.f9313c = byte[].class;     // Catch: Throwable -> L17
        Object r1 = r0.m5443e(r32, byte[].class);     // Catch: Throwable -> L17
        monitor-exit(r0);
        byte[] r12 = (byte[]) r1;
        ByteBuffer.wrap(r12).putInt(this.f8703e).putInt(this.f8704f).array();
        this.f8702d.mo172b(r6);
        this.f8701c.mo172b(r6);
        r6.update(r12);
        InterfaceC0098CB r02 = this.f8707i;
        if (r02 == null) goto L12;
        r02.mo172b(r6);
    L12:
        this.f8706h.mo172b(r6);
        C0118Cp r03 = f8699j;
        Class r22 = this.f8705g;
        byte[] r33 = (byte[]) r03.m186a(r22);
        if (r33 != null) goto L15;
        r33 = r22.getName().getBytes(InterfaceC0802Sm.f2524a);
        r03.m189d(r22, r33);
    L15:
        r6.update(r33);
        this.f8700b.m5445g(r12);
        return;
    L17:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r4) {
        if ((r4 instanceof C2475rw) == false) goto L20;
        C2475rw r42 = (C2475rw) r4;
        if (this.f8704f != r42.f8704f) goto L20;
        if (this.f8703e != r42.f8703e) goto L20;
        if (AbstractC2622vD.m5131b(this.f8707i, r42.f8707i) == false) goto L20;
        if (this.f8705g.equals(r42.f8705g) == false) goto L20;
        if (this.f8701c.equals(r42.f8701c) == false) goto L20;
        if (this.f8702d.equals(r42.f8702d) == false) goto L20;
        if (this.f8706h.equals(r42.f8706h) == false) goto L20;
        return true;
    L20:
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        int r0 = this.f8701c.hashCode() * 31;
        int r1 = ((((this.f8702d.hashCode() + r0) * 31) + this.f8703e) * 31) + this.f8704f;
        InterfaceC0098CB r02 = this.f8707i;
        if (r02 == null) goto L5;
        r1 = (r1 * 31) + r02.hashCode();
    L5:
        int r03 = this.f8705g.hashCode();
        int r04 = (r03 + (r1 * 31)) * 31;
        return this.f8706h.f9156b.hashCode() + r04;
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8701c + ", signature=" + this.f8702d + ", width=" + this.f8703e + ", height=" + this.f8704f + ", decodedResourceClass=" + this.f8705g + ", transformation='" + this.f8707i + "', options=" + this.f8706h + '}';
    }
}
