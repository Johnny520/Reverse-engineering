package p000;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: renamed from: vl */
/* JADX INFO: loaded from: classes.dex */
public final class C2636vl extends AbstractC2140ka {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9145c;

    public C2636vl(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.f9145c = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f7486b = AbstractC2130k7.m4316c(bArr);
        this.f7485a = i;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: c */
    public final int[] mo4325c(int[] iArr, int i) {
        switch (this.f9145c) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f7486b;
                int[] iArr4 = AbstractC2130k7.f7474a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = (int[]) this.f7486b;
                int[] iArr7 = new int[16];
                int[] iArr8 = AbstractC2130k7.f7474a;
                System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
                System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
                iArr7[12] = iArr[0];
                iArr7[13] = iArr[1];
                iArr7[14] = iArr[2];
                iArr7[15] = iArr[3];
                AbstractC2130k7.m4315b(iArr7);
                iArr7[4] = iArr7[12];
                iArr7[5] = iArr7[13];
                iArr7[6] = iArr7[14];
                iArr7[7] = iArr7[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
                System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: i */
    public final int mo4326i() {
        switch (this.f9145c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
