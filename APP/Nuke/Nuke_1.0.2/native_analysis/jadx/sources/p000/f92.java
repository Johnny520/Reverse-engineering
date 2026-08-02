package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f92 implements a51 {

    /* JADX INFO: renamed from: j */
    public static final wd1 f2867j = new wd1(50);

    /* JADX INFO: renamed from: b */
    public final td1 f2868b;

    /* JADX INFO: renamed from: c */
    public final a51 f2869c;

    /* JADX INFO: renamed from: d */
    public final a51 f2870d;

    /* JADX INFO: renamed from: e */
    public final int f2871e;

    /* JADX INFO: renamed from: f */
    public final int f2872f;

    /* JADX INFO: renamed from: g */
    public final Class f2873g;

    /* JADX INFO: renamed from: h */
    public final ov1 f2874h;

    /* JADX INFO: renamed from: i */
    public final n33 f2875i;

    public f92(td1 td1Var, a51 a51Var, a51 a51Var2, int i, int i2, n33 n33Var, Class cls, ov1 ov1Var) {
        this.f2868b = td1Var;
        this.f2869c = a51Var;
        this.f2870d = a51Var2;
        this.f2871e = i;
        this.f2872f = i2;
        this.f2875i = n33Var;
        this.f2873g = cls;
        this.f2874h = ov1Var;
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
    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        Object objM5169e;
        td1 td1Var = this.f2868b;
        synchronized (td1Var) {
            sd1 sd1Var = td1Var.f10682b;
            y12 y12VarM4809k = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
            if (y12VarM4809k == null) {
                y12VarM4809k = sd1Var.m4809k();
            }
            rd1 rd1Var = (rd1) y12VarM4809k;
            rd1Var.f9519b = 8;
            rd1Var.f9520c = byte[].class;
            objM5169e = td1Var.m5169e(rd1Var, byte[].class);
        }
        byte[] bArr = (byte[]) objM5169e;
        ByteBuffer.wrap(bArr).putInt(this.f2871e).putInt(this.f2872f).array();
        this.f2870d.mo96b(messageDigest);
        this.f2869c.mo96b(messageDigest);
        messageDigest.update(bArr);
        n33 n33Var = this.f2875i;
        if (n33Var != null) {
            n33Var.mo96b(messageDigest);
        }
        this.f2874h.mo96b(messageDigest);
        wd1 wd1Var = f2867j;
        Class cls = this.f2873g;
        byte[] bytes = (byte[]) wd1Var.m5869c(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a51.f64a);
            wd1Var.m5871f(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f2868b.m5171g(bArr);
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof f92) {
            f92 f92Var = (f92) obj;
            if (this.f2872f == f92Var.f2872f && this.f2871e == f92Var.f2871e && b93.m495b(this.f2875i, f92Var.f2875i) && this.f2873g.equals(f92Var.f2873g) && this.f2869c.equals(f92Var.f2869c) && this.f2870d.equals(f92Var.f2870d) && this.f2874h.equals(f92Var.f2874h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        int iHashCode = ((((this.f2870d.hashCode() + (this.f2869c.hashCode() * 31)) * 31) + this.f2871e) * 31) + this.f2872f;
        n33 n33Var = this.f2875i;
        if (n33Var != null) {
            iHashCode = (iHashCode * 31) + n33Var.hashCode();
        }
        int iHashCode2 = this.f2873g.hashCode();
        return this.f2874h.f7858b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f2869c + ", signature=" + this.f2870d + ", width=" + this.f2871e + ", height=" + this.f2872f + ", decodedResourceClass=" + this.f2873g + ", transformation='" + this.f2875i + "', options=" + this.f2874h + '}';
    }
}
