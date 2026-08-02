package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f92 implements a51 {
    public static final wd1 j = new wd1(50);
    public final td1 b;
    public final a51 c;
    public final a51 d;
    public final int e;
    public final int f;
    public final Class g;
    public final ov1 h;
    public final n33 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f92(td1 td1Var, a51 a51Var, a51 a51Var2, int i, int i2, n33 n33Var, Class cls, ov1 ov1Var) {
        this.b = td1Var;
        this.c = a51Var;
        this.d = a51Var2;
        this.e = i;
        this.f = i2;
        this.i = n33Var;
        this.g = cls;
        this.h = ov1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.a51
    public final void b(MessageDigest messageDigest) {
        Object objE;
        td1 td1Var = this.b;
        synchronized (td1Var) {
            sd1 sd1Var = td1Var.b;
            y12 y12VarK = (y12) ((ArrayDeque) sd1Var.h).poll();
            if (y12VarK == null) {
                y12VarK = sd1Var.k();
            }
            rd1 rd1Var = (rd1) y12VarK;
            rd1Var.b = 8;
            rd1Var.c = byte[].class;
            objE = td1Var.e(rd1Var, byte[].class);
        }
        byte[] bArr = (byte[]) objE;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        n33 n33Var = this.i;
        if (n33Var != null) {
            n33Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        wd1 wd1Var = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) wd1Var.c(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a51.a);
            wd1Var.f(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.g(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final boolean equals(Object obj) {
        if (obj instanceof f92) {
            f92 f92Var = (f92) obj;
            if (this.f == f92Var.f && this.e == f92Var.e && b93.b(this.i, f92Var.i) && this.g.equals(f92Var.g) && this.c.equals(f92Var.c) && this.d.equals(f92Var.d) && this.h.equals(f92Var.h)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        n33 n33Var = this.i;
        if (n33Var != null) {
            iHashCode = (iHashCode * 31) + n33Var.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
