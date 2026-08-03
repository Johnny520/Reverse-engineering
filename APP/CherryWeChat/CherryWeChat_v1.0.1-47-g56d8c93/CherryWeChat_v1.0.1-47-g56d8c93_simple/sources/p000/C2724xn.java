package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xn */
/* JADX INFO: loaded from: classes.dex */
public final class C2724xn implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f9306c = null;

    /* JADX INFO: renamed from: a */
    public final C1376en f9307a;

    /* JADX INFO: renamed from: b */
    public final C0947W1 f9308b;

    static {
        f9306c = new byte[0];
    }

    public C2724xn(C1376en r1, C0947W1 r2) {
        this.f9307a = r1;
        this.f9308b = r2;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] r7, byte[] r8) {
        C1376en r0 = this.f9307a;
        AtomicReference r1 = AbstractC0640Ov.f2045a;
        monitor-enter(AbstractC0640Ov.class);
        AbstractC1551in r3 = ((C1103Zm) AbstractC0640Ov.f2045a.get()).m2025a(r0.m2666B()).f3368a;     // Catch: Throwable -> L21
        Class r4 = r3.f5510c;     // Catch: Throwable -> L21
        if (r3.f5509b.keySet().contains(r4) == true) goto L12;
        if (Void.class.equals(r4) == true) goto L12;
        throw new IllegalArgumentException("Given internalKeyMananger " + r3.toString() + " does not support primitive class " + r4.getName());     // Catch: Throwable -> L21
    L12:
        if (((Boolean) AbstractC0640Ov.f2047c.get(r0.m2666B())).booleanValue() == false) goto L24;
        AbstractC2744y6 r02 = r0.m2667C();     // Catch: Throwable -> L21
        AbstractC2614v5 r12 = r3.mo2972d();     // Catch: C0673Pl -> L18 Throwable -> L21
        AbstractC0043B r03 = r12.mo5007e(r02);     // Catch: C0673Pl -> L18 Throwable -> L21
        r12.mo5008f(r03);     // Catch: C0673Pl -> L18 Throwable -> L21
        AbstractC0043B r04 = r12.mo5005a(r03);     // Catch: C0673Pl -> L18 Throwable -> L21
        monitor-exit(AbstractC0640Ov.class);
        byte[] r05 = r04.m66e();
        byte[] r13 = this.f9308b.mo1002a(r05, f9306c);
        byte[] r72 = ((InterfaceC1435g1) AbstractC0640Ov.m1258d(this.f9307a.m2666B(), r05)).mo1002a(r7, r8);
        return ByteBuffer.allocate((r13.length + 4) + r72.length).putInt(r13.length).put(r13).put(r72).array();
    L18:
        e = move-exception;
        throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) r3.mo2972d().f9067a).getName()), e);     // Catch: Throwable -> L21
    L24:
        throw new GeneralSecurityException("newKey-operation not permitted for key type " + r0.m2666B());     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] r6, byte[] r7) {
        ByteBuffer r1 = ByteBuffer.wrap(r6);     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
        int r2 = r1.getInt();     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
        if (r2 <= 0) goto L16;
        if (r2 > (r6.length - 4)) goto L16;
        byte[] r62 = new byte[r2];     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
        r1.get(r62, 0, r2);     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
        byte[] r22 = new byte[r1.remaining()];     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
        r1.get(r22, 0, r1.remaining());     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
        return ((InterfaceC1435g1) AbstractC0640Ov.m1258d(this.f9307a.m2666B(), this.f9308b.mo1003b(r62, f9306c))).mo1003b(r22, r7);
    L16:
        throw new GeneralSecurityException("invalid ciphertext");     // Catch: NegativeArraySizeException -> L9 BufferUnderflowException -> L11 IndexOutOfBoundsException -> L13
    L13:
        e = e;
    L18:
        throw new GeneralSecurityException("invalid ciphertext", e);
    L9:
        e = e;
    L11:
        e = e;
        goto L18
    }
}
