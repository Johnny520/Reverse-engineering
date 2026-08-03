package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xn */
/* JADX INFO: loaded from: classes.dex */
public final class C2724xn implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f9306c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final C1376en f9307a;

    /* JADX INFO: renamed from: b */
    public final C0947W1 f9308b;

    public C2724xn(C1376en c1376en, C0947W1 c0947w1) {
        this.f9307a = c1376en;
        this.f9308b = c0947w1;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AbstractC0043B abstractC0043BMo5005a;
        C1376en c1376en = this.f9307a;
        AtomicReference atomicReference = AbstractC0640Ov.f2045a;
        synchronized (AbstractC0640Ov.class) {
            try {
                AbstractC1551in abstractC1551in = ((C1103Zm) AbstractC0640Ov.f2045a.get()).m2025a(c1376en.m2666B()).f3368a;
                Class cls = abstractC1551in.f5510c;
                if (!abstractC1551in.f5509b.keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1551in.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) AbstractC0640Ov.f2047c.get(c1376en.m2666B())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + c1376en.m2666B());
                }
                AbstractC2744y6 abstractC2744y6M2667C = c1376en.m2667C();
                try {
                    AbstractC2614v5 abstractC2614v5Mo2972d = abstractC1551in.mo2972d();
                    AbstractC0043B abstractC0043BMo5007e = abstractC2614v5Mo2972d.mo5007e(abstractC2744y6M2667C);
                    abstractC2614v5Mo2972d.mo5008f(abstractC0043BMo5007e);
                    abstractC0043BMo5005a = abstractC2614v5Mo2972d.mo5005a(abstractC0043BMo5007e);
                } catch (C0673Pl e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC1551in.mo2972d().f9067a).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrM66e = abstractC0043BMo5005a.m66e();
        byte[] bArrMo1002a = this.f9308b.mo1002a(bArrM66e, f9306c);
        byte[] bArrMo1002a2 = ((InterfaceC1435g1) AbstractC0640Ov.m1258d(this.f9307a.m2666B(), bArrM66e)).mo1002a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo1002a.length + 4 + bArrMo1002a2.length).putInt(bArrMo1002a.length).put(bArrMo1002a).put(bArrMo1002a2).array();
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC1435g1) AbstractC0640Ov.m1258d(this.f9307a.m2666B(), this.f9308b.mo1003b(bArr3, f9306c))).mo1003b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
