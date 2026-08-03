package p000;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: renamed from: vl */
/* JADX INFO: loaded from: classes.dex */
public final class C2636vl extends AbstractC2140ka {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9145c;

    public C2636vl(byte[] r2, int r3, int r4) {
        this.f9145c = r4;
        if (r2.length != 32) goto L7;
        this.f7486b = AbstractC2130k7.m4316c(r2);
        this.f7485a = r3;
        return;
    L7:
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: c */
    public final int[] mo4325c(int[] r14, int r15) {
        switch(this.f9145c) {
            case 0: goto L11;
            default: goto L5;
        };
    L5:
        if (r14.length != 6) goto L9;
        int[] r2 = new int[16];
        int[] r3 = (int[]) this.f7486b;
        int[] r0 = new int[16];
        int[] r4 = AbstractC2130k7.f7474a;
        System.arraycopy(r4, 0, r0, 0, r4.length);
        System.arraycopy(r3, 0, r0, r4.length, 8);
        r0[12] = r14[0];
        r0[13] = r14[1];
        r0[14] = r14[2];
        r0[15] = r14[3];
        AbstractC2130k7.m4315b(r0);
        r0[4] = r0[12];
        r0[5] = r0[13];
        r0[6] = r0[14];
        r0[7] = r0[15];
        int[] r02 = Arrays.copyOf(r0, 8);
        System.arraycopy(r4, 0, r2, 0, r4.length);
        System.arraycopy(r02, 0, r2, r4.length, 8);
        r2[12] = r15;
        r2[13] = 0;
        r2[14] = r14[4];
        r2[15] = r14[5];
        return r2;
    L9:
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r14.length * 32)}));
    L11:
        if (r14.length != 3) goto L15;
        int[] r03 = new int[16];
        int[] r1 = (int[]) this.f7486b;
        int[] r22 = AbstractC2130k7.f7474a;
        System.arraycopy(r22, 0, r03, 0, r22.length);
        System.arraycopy(r1, 0, r03, r22.length, 8);
        r03[12] = r15;
        System.arraycopy(r14, 0, r03, 13, r14.length);
        return r03;
    L15:
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r14.length * 32)}));
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: i */
    public final int mo4326i() {
        switch(this.f9145c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 24;
    L6:
        return 12;
    }
}
