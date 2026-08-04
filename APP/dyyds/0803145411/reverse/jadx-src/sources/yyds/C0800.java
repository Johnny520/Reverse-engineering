package yyds;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᛴᛲᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800 implements InterfaceC1410 {

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C2170 f3670 = new C2170(50);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0822 f3671;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final InterfaceC0556 f3672;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f3673;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2267 f3674;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Class f3675;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1410 f3676;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f3677;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC1410 f3678;

    public C0800(C2267 c2267, InterfaceC1410 interfaceC1410, InterfaceC1410 interfaceC14102, int i, int i2, InterfaceC0556 interfaceC0556, Class cls, C0822 c0822) {
        this.f3674 = c2267;
        this.f3676 = interfaceC1410;
        this.f3678 = interfaceC14102;
        this.f3673 = i;
        this.f3677 = i2;
        this.f3672 = interfaceC0556;
        this.f3675 = cls;
        this.f3671 = c0822;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C0800) {
            C0800 c0800 = (C0800) obj;
            if (this.f3677 == c0800.f3677 && this.f3673 == c0800.f3673 && AbstractC0181.m757(this.f3672, c0800.f3672) && this.f3675.equals(c0800.f3675) && this.f3676.equals(c0800.f3676) && this.f3678.equals(c0800.f3678) && this.f3671.equals(c0800.f3671)) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        int iHashCode = ((((this.f3678.hashCode() + (this.f3676.hashCode() * 31)) * 31) + this.f3673) * 31) + this.f3677;
        InterfaceC0556 interfaceC0556 = this.f3672;
        if (interfaceC0556 != null) {
            iHashCode = (iHashCode * 31) + interfaceC0556.hashCode();
        }
        int iHashCode2 = this.f3675.hashCode();
        return this.f3671.f3758.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3676 + ", signature=" + this.f3678 + ", width=" + this.f3673 + ", height=" + this.f3677 + ", decodedResourceClass=" + this.f3675 + ", transformation='" + this.f3672 + "', options=" + this.f3671 + '}';
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
    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        Object objM4268;
        C2267 c2267 = this.f3674;
        synchronized (c2267) {
            C1075 c1075 = c2267.f11180;
            InterfaceC1490 interfaceC1490M2282 = (InterfaceC1490) ((ArrayDeque) c1075.f3409).poll();
            if (interfaceC1490M2282 == null) {
                interfaceC1490M2282 = c1075.m2282();
            }
            C0305 c0305 = (C0305) interfaceC1490M2282;
            c0305.f1608 = 8;
            c0305.f1609 = byte[].class;
            objM4268 = c2267.m4268(c0305, byte[].class);
        }
        byte[] bArr = (byte[]) objM4268;
        ByteBuffer.wrap(bArr).putInt(this.f3673).putInt(this.f3677).array();
        this.f3678.mo1227(messageDigest);
        this.f3676.mo1227(messageDigest);
        messageDigest.update(bArr);
        InterfaceC0556 interfaceC0556 = this.f3672;
        if (interfaceC0556 != null) {
            interfaceC0556.mo1227(messageDigest);
        }
        this.f3671.mo1227(messageDigest);
        C2170 c2170 = f3670;
        Class cls = this.f3675;
        byte[] bytes = (byte[]) c2170.m4134(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC1410.f6680);
            c2170.m4135(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f3674.m4271(bArr);
    }
}
