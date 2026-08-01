package com.bumptech.glide.load.engine;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.C3762;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.C3807;
import com.bumptech.glide.load.engine.bitmap_recycle.C3808;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3812;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p238.AbstractC8818;
import p302.C9226;
import p302.InterfaceC9222;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3819 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C3762 f9787 = new C3762(50);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f9788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f9789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC9222 f9790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC9222 f9791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3806 f9792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C9226 f9793;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class f9794;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC9228 f9795;

    public C3819(C3806 c3806, InterfaceC9222 interfaceC9222, InterfaceC9222 interfaceC92222, int i, int i2, InterfaceC9228 interfaceC9228, Class cls, C9226 c9226) {
        this.f9792 = c3806;
        this.f9791 = interfaceC9222;
        this.f9790 = interfaceC92222;
        this.f9789 = i;
        this.f9788 = i2;
        this.f9795 = interfaceC9228;
        this.f9794 = cls;
        this.f9793 = c9226;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C3819) {
            C3819 c3819 = (C3819) obj;
            if (this.f9788 == c3819.f9788 && this.f9789 == c3819.f9789 && AbstractC8818.m14031(this.f9795, c3819.f9795) && this.f9794.equals(c3819.f9794) && this.f9791.equals(c3819.f9791) && this.f9790.equals(c3819.f9790) && this.f9793.equals(c3819.f9793)) {
                return true;
            }
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        int iHashCode = ((((this.f9790.hashCode() + (this.f9791.hashCode() * 31)) * 31) + this.f9789) * 31) + this.f9788;
        InterfaceC9228 interfaceC9228 = this.f9795;
        if (interfaceC9228 != null) {
            iHashCode = (iHashCode * 31) + interfaceC9228.hashCode();
        }
        return this.f9793.f23617.hashCode() + AbstractC3275.m5129(iHashCode * 31, 31, this.f9794);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f9791 + ", signature=" + this.f9790 + ", width=" + this.f9789 + ", height=" + this.f9788 + ", decodedResourceClass=" + this.f9794 + ", transformation='" + this.f9795 + "', options=" + this.f9793 + '}';
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
    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7028(MessageDigest messageDigest) {
        Object objM7004;
        C3806 c3806 = this.f9792;
        synchronized (c3806) {
            C3807 c3807 = c3806.f9751;
            InterfaceC3812 interfaceC3812M7010 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
            if (interfaceC3812M7010 == null) {
                interfaceC3812M7010 = c3807.m7010();
            }
            C3808 c3808 = (C3808) interfaceC3812M7010;
            c3808.f9755 = 8;
            c3808.f9754 = byte[].class;
            objM7004 = c3806.m7004(c3808, byte[].class);
        }
        byte[] bArr = (byte[]) objM7004;
        ByteBuffer.wrap(bArr).putInt(this.f9789).putInt(this.f9788).array();
        this.f9790.mo7028(messageDigest);
        this.f9791.mo7028(messageDigest);
        messageDigest.update(bArr);
        InterfaceC9228 interfaceC9228 = this.f9795;
        if (interfaceC9228 != null) {
            interfaceC9228.mo7028(messageDigest);
        }
        this.f9793.mo7028(messageDigest);
        C3762 c3762 = f9787;
        Class cls = this.f9794;
        byte[] bytes = (byte[]) c3762.m6944(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC9222.f23615);
            c3762.m6941(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f9792.m7009(bArr);
    }
}
