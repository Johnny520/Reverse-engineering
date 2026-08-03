package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: Sf */
/* JADX INFO: loaded from: classes.dex */
public final class C0795Sf implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1506hl f2494a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0891Up f2495b;

    /* JADX INFO: renamed from: c */
    public final int f2496c;

    public C0795Sf(InterfaceC1506hl r1, InterfaceC0891Up r2, int r3) {
        this.f2494a = r1;
        this.f2495b = r2;
        this.f2496c = r3;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] r10, byte[] r11) {
        C0217F1 r1 = (C0217F1) this.f2494a;
        r1.getClass();
        int r0 = r10.length;
        int r2 = r1.f643b;
        int r3 = Integer.MAX_VALUE - r2;
        if (r0 > r3) goto L10;
        byte[] r5 = new byte[r10.length + r2];
        byte[] r7 = AbstractC1192av.m2297a(r2);
        System.arraycopy(r7, 0, r5, 0, r2);
        r1.m434a(r10, 0, r10.length, r5, r1.f643b, r7, true);
        if (r11 != null) goto L7;
        r11 = new byte[0];
    L7:
        byte[] r102 = AbstractC0295Gu.m612e(new byte[][]{r11, r5, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) r11.length) * 8).array(), 8)});
        return AbstractC0295Gu.m612e(new byte[][]{r5, this.f2495b.mo1743b(r102)});
    L10:
        throw new GeneralSecurityException(AbstractC2374ph.m4812i(r3, "plaintext length can not exceed "));
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] r13, byte[] r14) {
        int r0 = r13.length;
        int r2 = this.f2496c;
        if (r0 < r2) goto L14;
        byte[] r5 = Arrays.copyOfRange(r13, 0, r13.length - r2);
        byte[] r132 = Arrays.copyOfRange(r13, r13.length - r2, r13.length);
        if (r14 != null) goto L7;
        r14 = new byte[0];
    L7:
        byte[] r142 = AbstractC0295Gu.m612e(new byte[][]{r14, r5, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) r14.length) * 8).array(), 8)});
        this.f2495b.mo1742a(r132, r142);
        C0217F1 r4 = (C0217F1) this.f2494a;
        r4.getClass();
        int r133 = r5.length;
        int r143 = r4.f643b;
        if (r133 < r143) goto L12;
        byte[] r10 = new byte[r143];
        System.arraycopy(r5, 0, r10, 0, r143);
        int r134 = r5.length;
        int r6 = r4.f643b;
        byte[] r8 = new byte[r134 - r6];
        r4.m434a(r5, r6, r5.length - r6, r8, 0, r10, false);
        return r8;
    L12:
        throw new GeneralSecurityException("ciphertext too short");
    L14:
        throw new GeneralSecurityException("ciphertext too short");
    }
}
