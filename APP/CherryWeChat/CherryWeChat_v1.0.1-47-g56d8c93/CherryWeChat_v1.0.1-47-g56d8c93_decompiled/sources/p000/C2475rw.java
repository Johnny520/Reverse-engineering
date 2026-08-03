package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: rw */
/* JADX INFO: loaded from: classes.dex */
public final class C2475rw implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: j */
    public static final C0118Cp f8699j = new C0118Cp(50);

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

    public C2475rw(C2812zp c2812zp, InterfaceC0802Sm interfaceC0802Sm, InterfaceC0802Sm interfaceC0802Sm2, int i, int i2, InterfaceC0098CB interfaceC0098CB, Class cls, C2644vt c2644vt) {
        this.f8700b = c2812zp;
        this.f8701c = interfaceC0802Sm;
        this.f8702d = interfaceC0802Sm2;
        this.f8703e = i;
        this.f8704f = i2;
        this.f8707i = interfaceC0098CB;
        this.f8705g = cls;
        this.f8706h = c2644vt;
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
    public final void mo172b(MessageDigest messageDigest) {
        Object objM5443e;
        C2812zp c2812zp = this.f8700b;
        synchronized (c2812zp) {
            C2769yp c2769yp = c2812zp.f9527b;
            InterfaceC0938Vt interfaceC0938VtM5340g = (InterfaceC0938Vt) ((ArrayDeque) c2769yp.f9067a).poll();
            if (interfaceC0938VtM5340g == null) {
                interfaceC0938VtM5340g = c2769yp.m5340g();
            }
            C2726xp c2726xp = (C2726xp) interfaceC0938VtM5340g;
            c2726xp.f9312b = 8;
            c2726xp.f9313c = byte[].class;
            objM5443e = c2812zp.m5443e(c2726xp, byte[].class);
        }
        byte[] bArr = (byte[]) objM5443e;
        ByteBuffer.wrap(bArr).putInt(this.f8703e).putInt(this.f8704f).array();
        this.f8702d.mo172b(messageDigest);
        this.f8701c.mo172b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC0098CB interfaceC0098CB = this.f8707i;
        if (interfaceC0098CB != null) {
            interfaceC0098CB.mo172b(messageDigest);
        }
        this.f8706h.mo172b(messageDigest);
        C0118Cp c0118Cp = f8699j;
        Class cls = this.f8705g;
        byte[] bytes = (byte[]) c0118Cp.m186a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC0802Sm.f2524a);
            c0118Cp.m189d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f8700b.m5445g(bArr);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C2475rw) {
            C2475rw c2475rw = (C2475rw) obj;
            if (this.f8704f == c2475rw.f8704f && this.f8703e == c2475rw.f8703e && AbstractC2622vD.m5131b(this.f8707i, c2475rw.f8707i) && this.f8705g.equals(c2475rw.f8705g) && this.f8701c.equals(c2475rw.f8701c) && this.f8702d.equals(c2475rw.f8702d) && this.f8706h.equals(c2475rw.f8706h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        int iHashCode = ((((this.f8702d.hashCode() + (this.f8701c.hashCode() * 31)) * 31) + this.f8703e) * 31) + this.f8704f;
        InterfaceC0098CB interfaceC0098CB = this.f8707i;
        if (interfaceC0098CB != null) {
            iHashCode = (iHashCode * 31) + interfaceC0098CB.hashCode();
        }
        return this.f8706h.f9156b.hashCode() + ((this.f8705g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8701c + ", signature=" + this.f8702d + ", width=" + this.f8703e + ", height=" + this.f8704f + ", decodedResourceClass=" + this.f8705g + ", transformation='" + this.f8707i + "', options=" + this.f8706h + '}';
    }
}
