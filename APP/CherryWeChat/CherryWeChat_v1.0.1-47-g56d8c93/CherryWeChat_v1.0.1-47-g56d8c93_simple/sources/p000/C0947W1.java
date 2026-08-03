package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0947W1 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2969a;

    /* JADX INFO: renamed from: b */
    public final Object f2970b;

    public C0947W1(int r2, byte[] r3) {
        this.f2969a = r2;
        switch(r2) {
            case 2: goto L12;
            case 3: goto L10;
            default: goto L5;
        };
    L10:
        this.f2970b = new C2679wl(1, r3);
        return;
    L12:
        this.f2970b = new C2679wl(0, r3);
        return;
    L5:
        if (AbstractC2374ph.m4806c(2) == false) goto L9;
        this.f2970b = new C2593ul(r3);
        return;
    L9:
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] r12, byte[] r13) {
        switch(this.f2969a) {
            case 0: goto L14;
            case 1: goto L42;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ByteBuffer r0 = ByteBuffer.allocate(r12.length + 40);
        byte[] r1 = AbstractC1192av.m2297a(24);
        r0.put(r1);
        ((C2679wl) this.f2970b).m81g(r0, r1, r12, r13);
        return r0.array();
    L6:
        ByteBuffer r02 = ByteBuffer.allocate(r12.length + 28);
        byte[] r14 = AbstractC1192av.m2297a(12);
        r02.put(r14);
        ((C2679wl) this.f2970b).m81g(r02, r14, r12, r13);
        return r02.array();
    L14:
        byte[] r15 = AbstractC1192av.m2297a(12);
        C2593ul r2 = (C2593ul) this.f2970b;
        boolean r3 = r2.f8969b;
        if (r15.length != 12) goto L40;
        if (r12.length > 2147483619) goto L38;
        if (r3 == false) goto L20;
        int r4 = r12.length + 28;
    L21:
        byte[] r9 = new byte[r4];
        if (r3 == false) goto L24;
        System.arraycopy(r15, 0, r9, 0, 12);
    L24:
        AlgorithmParameterSpec r16 = C2593ul.m5101a(r15);
        C0174E1 r5 = C2593ul.f8967c;
        ((Cipher) r5.get()).init(1, r2.f8968a, r16);
        if (r13 != null) goto L27;
    L29:
        if (r3 == false) goto L31;
        int r10 = 12;
    L32:
        int r122 = ((Cipher) r5.get()).doFinal(r12, 0, r12.length, r9, r10);
        if (r122 != (r12.length + 16)) goto L36;
        return r9;
    L36:
        throw new GeneralSecurityException(AbstractC2374ph.m4813j(r122 - r12.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    L31:
        r10 = 0;
        goto L32
    L27:
        if (r13.length == 0) goto L29;
        ((Cipher) r5.get()).updateAAD(r13);
        goto L29
    L20:
        r4 = r12.length + 16;
        goto L21
    L38:
        throw new GeneralSecurityException("plaintext too long");
    L40:
        throw new GeneralSecurityException("iv is wrong size");
    L42:
        return m1807d(r12, r13);
    L44:
        Thread.sleep((int) (Math.random() * 100.0d));     // Catch: InterruptedException -> L41
    L13:
        return m1807d(r12, r13);
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] r9, byte[] r10) {
        switch(this.f2969a) {
            case 0: goto L28;
            case 1: goto L17;
            case 2: goto L11;
            default: goto L5;
        };
    L28:
        byte[] r1 = Arrays.copyOf(r9, 12);
        C2593ul r2 = (C2593ul) this.f2970b;
        boolean r3 = r2.f8969b;
        if (r1.length != 12) goto L57;
        if (r3 == false) goto L32;
        int r4 = 28;
    L34:
        if (r9.length < r4) goto L55;
        int r42 = 0;
        if (r3 == true) goto L38;
    L42:
        AlgorithmParameterSpec r12 = C2593ul.m5101a(r1);
        C0174E1 r5 = C2593ul.f8967c;
        ((Cipher) r5.get()).init(2, r2.f8968a, r12);
        if (r10 != null) goto L45;
    L47:
        if (r3 == false) goto L49;
        r42 = 12;
    L49:
        int r102 = r9.length;
        if (r3 == false) goto L53;
        r102 = r102 - 12;
    L53:
        return ((Cipher) r5.get()).doFinal(r9, r42, r102);
    L45:
        if (r10.length == 0) goto L47;
        ((Cipher) r5.get()).updateAAD(r10);
        goto L47
    L38:
        if (ByteBuffer.wrap(r1).equals(ByteBuffer.wrap(r9, 0, 12)) == true) goto L42;
        throw new GeneralSecurityException("iv does not match prepended iv");
    L55:
        throw new GeneralSecurityException("ciphertext too short");
    L32:
        r4 = 16;
        goto L34
    L57:
        throw new GeneralSecurityException("iv is wrong size");
    L5:
        if (r9.length < 40) goto L9;
        byte[] r13 = Arrays.copyOf(r9, 24);
        return ((C2679wl) this.f2970b).m80f(ByteBuffer.wrap(r9, 24, r9.length - 24), r13, r10);
    L9:
        throw new GeneralSecurityException("ciphertext too short");
    L11:
        if (r9.length < 28) goto L15;
        byte[] r14 = Arrays.copyOf(r9, 12);
        return ((C2679wl) this.f2970b).m80f(ByteBuffer.wrap(r9, 12, r9.length - 12), r14, r10);
    L15:
        throw new GeneralSecurityException("ciphertext too short");
    L17:
        if (r9.length < 28) goto L27;
        goto L59
    L63:
        return m1806c(r9, r10);
    L24:
        e = move-exception;
        throw e;
    L59:
        Thread.sleep((int) (Math.random() * 100.0d));     // Catch: InterruptedException -> L58
    L23:
        return m1806c(r9, r10);
    L27:
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* JADX INFO: renamed from: c */
    public byte[] m1806c(byte[] r6, byte[] r7) {
        GCMParameterSpec r0 = new GCMParameterSpec(128, r6, 0, 12);
        Cipher r1 = Cipher.getInstance("AES/GCM/NoPadding");
        r1.init(2, (SecretKey) this.f2970b, r0);
        r1.updateAAD(r7);
        return r1.doFinal(r6, 12, r6.length - 12);
    }

    /* JADX INFO: renamed from: d */
    public byte[] m1807d(byte[] r8, byte[] r9) {
        if (r8.length > 2147483619) goto L7;
        byte[] r5 = new byte[r8.length + 28];
        Cipher r1 = Cipher.getInstance("AES/GCM/NoPadding");
        r1.init(1, (SecretKey) this.f2970b);
        r1.updateAAD(r9);
        r1.doFinal(r8, 0, r8.length, r5, 12);
        System.arraycopy(r1.getIV(), 0, r5, 0, 12);
        return r5;
    L7:
        throw new GeneralSecurityException("plaintext too long");
    }

    public C0947W1(String r2, KeyStore r3) {
        this.f2969a = 1;
        SecretKey r32 = (SecretKey) r3.getKey(r2, null);
        this.f2970b = r32;
        if (r32 == null) goto L6;
        return;
    L6:
        throw new InvalidKeyException(AbstractC0213Ey.m420r("Keystore cannot load the key with ID: ", r2));
    }
}
