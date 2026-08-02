package p000;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class he2 implements InterfaceC0772ug {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v20 f3975b;

    public /* synthetic */ he2(v20 v20Var, int i) {
        this.f3974a = i;
        this.f3975b = v20Var;
    }

    @Override // p000.InterfaceC0772ug
    /* JADX INFO: renamed from: a */
    public final Object mo2148a(Object[] objArr, t00 t00Var) {
        int i = this.f3974a;
        v20 v20Var = this.f3975b;
        switch (i) {
            case 0:
                try {
                    sp0.m4929a0(2, objArr);
                    String strM4941g0 = sp0.m4941g0("algorithm", objArr[0]);
                    byte[] bArrM4926Y = sp0.m4926Y("data", objArr[1]);
                    v20Var.m5610h(bArrM4926Y.length);
                    byte[] bArrDigest = MessageDigest.getInstance(v20.m5602b(strM4941g0)).digest(bArrM4926Y);
                    bArrDigest.getClass();
                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrDigest, bArrDigest.length)));
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return AbstractC0179eu.m1471u(th);
                }
            case 1:
                try {
                    sp0.m4929a0(3, objArr);
                    byte[] bArrM5607d = v20Var.m5607d(sp0.m4941g0("algorithm", objArr[0]), sp0.m4926Y("key", objArr[1]), sp0.m4926Y("data", objArr[2]));
                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5607d, bArrM5607d.length)));
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return AbstractC0179eu.m1471u(th2);
                }
            case 2:
                v20 v20Var2 = this.f3975b;
                try {
                    sp0.m4929a0(4, objArr);
                    byte[] bArrM4926Y2 = sp0.m4926Y("key", objArr[0]);
                    byte[] bArrM4926Y3 = sp0.m4926Y("iv", objArr[1]);
                    byte[] bArrM4926Y4 = sp0.m4926Y("plaintext", objArr[2]);
                    Object obj = objArr[3];
                    byte[] bArrM5605a = v20Var2.m5605a(1, bArrM4926Y2, bArrM4926Y3, bArrM4926Y4, obj != null ? sp0.m4926Y("additionalData", obj) : null);
                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5605a, bArrM5605a.length)));
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    return AbstractC0179eu.m1471u(th3);
                }
            case 3:
                v20 v20Var3 = this.f3975b;
                try {
                    sp0.m4929a0(4, objArr);
                    byte[] bArrM4926Y5 = sp0.m4926Y("key", objArr[0]);
                    byte[] bArrM4926Y6 = sp0.m4926Y("iv", objArr[1]);
                    byte[] bArrM4926Y7 = sp0.m4926Y("ciphertext", objArr[2]);
                    Object obj2 = objArr[3];
                    try {
                        byte[] bArrM5605a2 = v20Var3.m5605a(2, bArrM4926Y5, bArrM4926Y6, bArrM4926Y7, obj2 != null ? sp0.m4926Y("additionalData", obj2) : null);
                        return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5605a2, bArrM5605a2.length)));
                    } catch (sd2 e4) {
                        throw e4;
                    } catch (Throwable th4) {
                        throw new sd2("AUTHENTICATION_FAILED", "AES-GCM authentication failed.", false, null, th4, 12);
                    }
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th5) {
                    return AbstractC0179eu.m1471u(th5);
                }
            case 4:
                v20 v20Var4 = this.f3975b;
                try {
                    sp0.m4929a0(5, objArr);
                    byte[] bArrM5608f = v20Var4.m5608f(sp0.m4926Y("password", objArr[0]), sp0.m4926Y("salt", objArr[1]), (int) sp0.m4935d0(objArr[2], "iterations", 1L, 2147483647L), (int) sp0.m4935d0(objArr[3], "length", 1L, 2147483647L), sp0.m4941g0("algorithm", objArr[4]));
                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5608f, bArrM5608f.length)));
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th6) {
                    return AbstractC0179eu.m1471u(th6);
                }
            default:
                v20 v20Var5 = this.f3975b;
                try {
                    sp0.m4929a0(5, objArr);
                    byte[] bArrM4926Y8 = sp0.m4926Y("keyMaterial", objArr[0]);
                    Object obj3 = objArr[1];
                    byte[] bArrM4926Y9 = obj3 != null ? sp0.m4926Y("salt", obj3) : null;
                    Object obj4 = objArr[2];
                    byte[] bArrM5606c = v20Var5.m5606c(bArrM4926Y8, bArrM4926Y9, obj4 != null ? sp0.m4926Y("info", obj4) : null, (int) sp0.m4935d0(objArr[3], "length", 1L, 2147483647L), sp0.m4941g0("algorithm", objArr[4]));
                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5606c, bArrM5606c.length)));
                } catch (CancellationException e7) {
                    throw e7;
                } catch (Throwable th7) {
                    return AbstractC0179eu.m1471u(th7);
                }
        }
    }
}
