package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0947W1 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2969a;

    /* JADX INFO: renamed from: b */
    public final Object f2970b;

    public C0947W1(int i, byte[] bArr) throws GeneralSecurityException {
        this.f2969a = i;
        switch (i) {
            case 2:
                this.f2970b = new C2679wl(0, bArr);
                return;
            case 3:
                this.f2970b = new C2679wl(1, bArr);
                return;
            default:
                if (!AbstractC2374ph.m4806c(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f2970b = new C2593ul(bArr);
                return;
        }
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f2969a) {
            case 0:
                byte[] bArrM2297a = AbstractC1192av.m2297a(12);
                C2593ul c2593ul = (C2593ul) this.f2970b;
                boolean z = c2593ul.f8969b;
                if (bArrM2297a.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
                if (z) {
                    System.arraycopy(bArrM2297a, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecM5101a = C2593ul.m5101a(bArrM2297a);
                C0174E1 c0174e1 = C2593ul.f8967c;
                ((Cipher) c0174e1.get()).init(1, c2593ul.f8968a, algorithmParameterSpecM5101a);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) c0174e1.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) c0174e1.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(AbstractC2374ph.m4813j(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                try {
                    return m1807d(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException unused) {
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused2) {
                    }
                    return m1807d(bArr, bArr2);
                }
            case 2:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrM2297a2 = AbstractC1192av.m2297a(12);
                byteBufferAllocate.put(bArrM2297a2);
                ((C2679wl) this.f2970b).m81g(byteBufferAllocate, bArrM2297a2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrM2297a3 = AbstractC1192av.m2297a(24);
                byteBufferAllocate2.put(bArrM2297a3);
                ((C2679wl) this.f2970b).m81g(byteBufferAllocate2, bArrM2297a3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f2969a) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                C2593ul c2593ul = (C2593ul) this.f2970b;
                boolean z = c2593ul.f8969b;
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length < (z ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecM5101a = C2593ul.m5101a(bArrCopyOf);
                C0174E1 c0174e1 = C2593ul.f8967c;
                ((Cipher) c0174e1.get()).init(2, c2593ul.f8968a, algorithmParameterSpecM5101a);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) c0174e1.get()).updateAAD(bArr2);
                }
                int i = z ? 12 : 0;
                int length = bArr.length;
                if (z) {
                    length -= 12;
                }
                return ((Cipher) c0174e1.get()).doFinal(bArr, i, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                try {
                    return m1806c(bArr, bArr2);
                } catch (AEADBadTagException e) {
                    throw e;
                } catch (GeneralSecurityException | ProviderException unused) {
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused2) {
                    }
                    return m1806c(bArr, bArr2);
                }
            case 2:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C2679wl) this.f2970b).m80f(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C2679wl) this.f2970b).m80f(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public byte[] m1806c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.f2970b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    /* JADX INFO: renamed from: d */
    public byte[] m1807d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.f2970b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public C0947W1(String str, KeyStore keyStore) throws InvalidKeyException {
        this.f2969a = 1;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f2970b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(AbstractC0213Ey.m420r("Keystore cannot load the key with ID: ", str));
        }
    }
}
