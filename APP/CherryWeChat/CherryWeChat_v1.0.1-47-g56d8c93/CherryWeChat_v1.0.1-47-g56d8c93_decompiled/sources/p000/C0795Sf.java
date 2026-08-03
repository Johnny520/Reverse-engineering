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

    public C0795Sf(InterfaceC1506hl interfaceC1506hl, InterfaceC0891Up interfaceC0891Up, int i) {
        this.f2494a = interfaceC1506hl;
        this.f2495b = interfaceC0891Up;
        this.f2496c = i;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C0217F1 c0217f1 = (C0217F1) this.f2494a;
        c0217f1.getClass();
        int length = bArr.length;
        int i = c0217f1.f643b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(AbstractC2374ph.m4812i(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrM2297a = AbstractC1192av.m2297a(i);
        System.arraycopy(bArrM2297a, 0, bArr3, 0, i);
        c0217f1.m434a(bArr, 0, bArr.length, bArr3, c0217f1.f643b, bArrM2297a, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC0295Gu.m612e(bArr3, this.f2495b.mo1743b(AbstractC0295Gu.m612e(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f2496c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f2495b.mo1742a(bArrCopyOfRange2, AbstractC0295Gu.m612e(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        C0217F1 c0217f1 = (C0217F1) this.f2494a;
        c0217f1.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = c0217f1.f643b;
        if (length2 < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = c0217f1.f643b;
        byte[] bArr4 = new byte[length3 - i3];
        c0217f1.m434a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
