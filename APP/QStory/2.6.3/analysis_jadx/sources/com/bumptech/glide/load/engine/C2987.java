package com.bumptech.glide.load.engine;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2929;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.C2975;
import com.bumptech.glide.load.engine.bitmap_recycle.C2976;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2980;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p222.AbstractC7989;
import p286.C8397;
import p286.InterfaceC8393;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2987 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2929 f9442 = new C2929(50);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f9443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f9444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8393 f9445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8393 f9446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2974 f9447;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8397 f9448;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class f9449;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8399 f9450;

    public C2987(C2974 c2974, InterfaceC8393 interfaceC8393, InterfaceC8393 interfaceC83932, int i, int i2, InterfaceC8399 interfaceC8399, Class cls, C8397 c8397) {
        this.f9447 = c2974;
        this.f9446 = interfaceC8393;
        this.f9445 = interfaceC83932;
        this.f9444 = i;
        this.f9443 = i2;
        this.f9450 = interfaceC8399;
        this.f9449 = cls;
        this.f9448 = c8397;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C2987) {
            C2987 c2987 = (C2987) obj;
            if (this.f9443 == c2987.f9443 && this.f9444 == c2987.f9444 && AbstractC7989.m13472(this.f9450, c2987.f9450) && this.f9449.equals(c2987.f9449) && this.f9446.equals(c2987.f9446) && this.f9445.equals(c2987.f9445) && this.f9448.equals(c2987.f9448)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        int iHashCode = ((((this.f9445.hashCode() + (this.f9446.hashCode() * 31)) * 31) + this.f9444) * 31) + this.f9443;
        InterfaceC8399 interfaceC8399 = this.f9450;
        if (interfaceC8399 != null) {
            iHashCode = (iHashCode * 31) + interfaceC8399.hashCode();
        }
        return this.f9448.f23272.hashCode() + AbstractC2442.m4569(iHashCode * 31, 31, this.f9449);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f9446 + ", signature=" + this.f9445 + ", width=" + this.f9444 + ", height=" + this.f9443 + ", decodedResourceClass=" + this.f9449 + ", transformation='" + this.f9450 + "', options=" + this.f9448 + '}';
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
    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6468(MessageDigest messageDigest) {
        Object objM6444;
        C2974 c2974 = this.f9447;
        synchronized (c2974) {
            C2975 c2975 = c2974.f9406;
            InterfaceC2980 interfaceC2980M6450 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
            if (interfaceC2980M6450 == null) {
                interfaceC2980M6450 = c2975.m6450();
            }
            C2976 c2976 = (C2976) interfaceC2980M6450;
            c2976.f9410 = 8;
            c2976.f9409 = byte[].class;
            objM6444 = c2974.m6444(c2976, byte[].class);
        }
        byte[] bArr = (byte[]) objM6444;
        ByteBuffer.wrap(bArr).putInt(this.f9444).putInt(this.f9443).array();
        this.f9445.mo6468(messageDigest);
        this.f9446.mo6468(messageDigest);
        messageDigest.update(bArr);
        InterfaceC8399 interfaceC8399 = this.f9450;
        if (interfaceC8399 != null) {
            interfaceC8399.mo6468(messageDigest);
        }
        this.f9448.mo6468(messageDigest);
        C2929 c2929 = f9442;
        Class cls = this.f9449;
        byte[] bytes = (byte[]) c2929.m6384(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC8393.f23270);
            c2929.m6381(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f9447.m6449(bArr);
    }
}
