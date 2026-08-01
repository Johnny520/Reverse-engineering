package p088R1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1151m;
import p093S1.C1292d;
import p093S1.C1293e;
import p093S1.C1294f;
import p093S1.InterfaceC1296h;
import p195l2.AbstractC2511o;
import p195l2.C2507k;

/* JADX INFO: renamed from: R1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1196F implements InterfaceC1144f {

    /* JADX INFO: renamed from: j */
    public static final C2507k f3928j = new C2507k(50);

    /* JADX INFO: renamed from: b */
    public final C1294f f3929b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1144f f3930c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1144f f3931d;

    /* JADX INFO: renamed from: e */
    public final int f3932e;

    /* JADX INFO: renamed from: f */
    public final int f3933f;

    /* JADX INFO: renamed from: g */
    public final Class f3934g;

    /* JADX INFO: renamed from: h */
    public final C1147i f3935h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1151m f3936i;

    public C1196F(C1294f c1294f, InterfaceC1144f interfaceC1144f, InterfaceC1144f interfaceC1144f2, int i5, int i6, InterfaceC1151m interfaceC1151m, Class cls, C1147i c1147i) {
        this.f3929b = c1294f;
        this.f3930c = interfaceC1144f;
        this.f3931d = interfaceC1144f2;
        this.f3932e = i5;
        this.f3933f = i6;
        this.f3936i = interfaceC1151m;
        this.f3934g = cls;
        this.f3935h = c1147i;
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
    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        Object objM2386e;
        C1294f c1294f = this.f3929b;
        synchronized (c1294f) {
            C1293e c1293e = c1294f.f4632b;
            InterfaceC1296h interfaceC1296hM2381f = (InterfaceC1296h) ((ArrayDeque) c1293e.f1354d).poll();
            if (interfaceC1296hM2381f == null) {
                interfaceC1296hM2381f = c1293e.m2381f();
            }
            C1292d c1292d = (C1292d) interfaceC1296hM2381f;
            c1292d.f4628b = 8;
            c1292d.f4629c = byte[].class;
            objM2386e = c1294f.m2386e(c1292d, byte[].class);
        }
        byte[] bArr = (byte[]) objM2386e;
        ByteBuffer.wrap(bArr).putInt(this.f3932e).putInt(this.f3933f).array();
        this.f3931d.mo2199b(messageDigest);
        this.f3930c.mo2199b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC1151m interfaceC1151m = this.f3936i;
        if (interfaceC1151m != null) {
            interfaceC1151m.mo2199b(messageDigest);
        }
        this.f3935h.mo2199b(messageDigest);
        C2507k c2507k = f3928j;
        Class cls = this.f3934g;
        byte[] bytes = (byte[]) c2507k.m4447a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC1144f.f3779a);
            c2507k.m4448d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f3929b.m2388g(bArr);
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1196F) {
            C1196F c1196f = (C1196F) obj;
            if (this.f3933f == c1196f.f3933f && this.f3932e == c1196f.f3932e && AbstractC2511o.m4453b(this.f3936i, c1196f.f3936i) && this.f3934g.equals(c1196f.f3934g) && this.f3930c.equals(c1196f.f3930c) && this.f3931d.equals(c1196f.f3931d) && this.f3935h.equals(c1196f.f3935h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        int iHashCode = ((((this.f3931d.hashCode() + (this.f3930c.hashCode() * 31)) * 31) + this.f3932e) * 31) + this.f3933f;
        InterfaceC1151m interfaceC1151m = this.f3936i;
        if (interfaceC1151m != null) {
            iHashCode = (iHashCode * 31) + interfaceC1151m.hashCode();
        }
        return this.f3935h.f3785b.hashCode() + ((this.f3934g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3930c + ", signature=" + this.f3931d + ", width=" + this.f3932e + ", height=" + this.f3933f + ", decodedResourceClass=" + this.f3934g + ", transformation='" + this.f3936i + "', options=" + this.f3935h + '}';
    }
}
