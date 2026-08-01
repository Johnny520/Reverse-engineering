package com.bumptech.glide.load.engine;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2928;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.C2975;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p222.AbstractC7988;
import p286.C8396;
import p286.InterfaceC8392;
import p286.InterfaceC8398;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2986 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2928 f9440 = new C2928(50);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f9441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f9442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8392 f9443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8392 f9444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2973 f9445;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8396 f9446;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class f9447;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8398 f9448;

    public C2986(C2973 c2973, InterfaceC8392 interfaceC8392, InterfaceC8392 interfaceC83922, int i, int i2, InterfaceC8398 interfaceC8398, Class cls, C8396 c8396) {
        this.f9445 = c2973;
        this.f9444 = interfaceC8392;
        this.f9443 = interfaceC83922;
        this.f9442 = i;
        this.f9441 = i2;
        this.f9448 = interfaceC8398;
        this.f9447 = cls;
        this.f9446 = c8396;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C2986) {
            C2986 c2986 = (C2986) obj;
            if (this.f9441 == c2986.f9441 && this.f9442 == c2986.f9442 && AbstractC7988.m13444(this.f9448, c2986.f9448) && this.f9447.equals(c2986.f9447) && this.f9444.equals(c2986.f9444) && this.f9443.equals(c2986.f9443) && this.f9446.equals(c2986.f9446)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        int iHashCode = ((((this.f9443.hashCode() + (this.f9444.hashCode() * 31)) * 31) + this.f9442) * 31) + this.f9441;
        InterfaceC8398 interfaceC8398 = this.f9448;
        if (interfaceC8398 != null) {
            iHashCode = (iHashCode * 31) + interfaceC8398.hashCode();
        }
        return this.f9446.f23273.hashCode() + AbstractC2442.m4559(iHashCode * 31, 31, this.f9447);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f9444 + ", signature=" + this.f9443 + ", width=" + this.f9442 + ", height=" + this.f9441 + ", decodedResourceClass=" + this.f9447 + ", transformation='" + this.f9448 + "', options=" + this.f9446 + '}';
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
    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6410(MessageDigest messageDigest) {
        Object objM6386;
        C2973 c2973 = this.f9445;
        synchronized (c2973) {
            C2974 c2974 = c2973.f9404;
            InterfaceC2979 interfaceC2979M6392 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
            if (interfaceC2979M6392 == null) {
                interfaceC2979M6392 = c2974.m6392();
            }
            C2975 c2975 = (C2975) interfaceC2979M6392;
            c2975.f9408 = 8;
            c2975.f9407 = byte[].class;
            objM6386 = c2973.m6386(c2975, byte[].class);
        }
        byte[] bArr = (byte[]) objM6386;
        ByteBuffer.wrap(bArr).putInt(this.f9442).putInt(this.f9441).array();
        this.f9443.mo6410(messageDigest);
        this.f9444.mo6410(messageDigest);
        messageDigest.update(bArr);
        InterfaceC8398 interfaceC8398 = this.f9448;
        if (interfaceC8398 != null) {
            interfaceC8398.mo6410(messageDigest);
        }
        this.f9446.mo6410(messageDigest);
        C2928 c2928 = f9440;
        Class cls = this.f9447;
        byte[] bytes = (byte[]) c2928.m6326(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC8392.f23271);
            c2928.m6323(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f9445.m6391(bArr);
    }
}
