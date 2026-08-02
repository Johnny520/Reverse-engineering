package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class he2 implements ug {
    public final /* synthetic */ int a;
    public final /* synthetic */ v20 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ he2(v20 v20Var, int i) {
        this.a = i;
        this.b = v20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ug
    public final Object a(Object[] objArr, t00 t00Var) {
        int i = this.a;
        v20 v20Var = this.b;
        switch (i) {
            case 0:
                try {
                    sp0.a0(2, objArr);
                    String strG0 = sp0.g0("algorithm", objArr[0]);
                    byte[] bArrY = sp0.Y("data", objArr[1]);
                    v20Var.h(bArrY.length);
                    byte[] bArrDigest = MessageDigest.getInstance(v20.b(strG0)).digest(bArrY);
                    bArrDigest.getClass();
                    return eu.v(new UByteArray(Arrays.copyOf(bArrDigest, bArrDigest.length)));
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return eu.u(th);
                }
            case 1:
                try {
                    sp0.a0(3, objArr);
                    byte[] bArrD = v20Var.d(sp0.g0("algorithm", objArr[0]), sp0.Y("key", objArr[1]), sp0.Y("data", objArr[2]));
                    return eu.v(new UByteArray(Arrays.copyOf(bArrD, bArrD.length)));
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return eu.u(th2);
                }
            case 2:
                v20 v20Var2 = this.b;
                try {
                    sp0.a0(4, objArr);
                    byte[] bArrY2 = sp0.Y("key", objArr[0]);
                    byte[] bArrY3 = sp0.Y("iv", objArr[1]);
                    byte[] bArrY4 = sp0.Y("plaintext", objArr[2]);
                    Object obj = objArr[3];
                    byte[] bArrA = v20Var2.a(1, bArrY2, bArrY3, bArrY4, obj != null ? sp0.Y("additionalData", obj) : null);
                    return eu.v(new UByteArray(Arrays.copyOf(bArrA, bArrA.length)));
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    return eu.u(th3);
                }
            case 3:
                v20 v20Var3 = this.b;
                try {
                    sp0.a0(4, objArr);
                    byte[] bArrY5 = sp0.Y("key", objArr[0]);
                    byte[] bArrY6 = sp0.Y("iv", objArr[1]);
                    byte[] bArrY7 = sp0.Y("ciphertext", objArr[2]);
                    Object obj2 = objArr[3];
                    try {
                        byte[] bArrA2 = v20Var3.a(2, bArrY5, bArrY6, bArrY7, obj2 != null ? sp0.Y("additionalData", obj2) : null);
                        return eu.v(new UByteArray(Arrays.copyOf(bArrA2, bArrA2.length)));
                    } catch (sd2 e4) {
                        throw e4;
                    } catch (Throwable th4) {
                        throw new sd2("AUTHENTICATION_FAILED", "AES-GCM authentication failed.", false, null, th4, 12);
                    }
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th5) {
                    return eu.u(th5);
                }
            case 4:
                v20 v20Var4 = this.b;
                try {
                    sp0.a0(5, objArr);
                    byte[] bArrF = v20Var4.f(sp0.Y("password", objArr[0]), sp0.Y("salt", objArr[1]), (int) sp0.d0(objArr[2], "iterations", 1L, 2147483647L), (int) sp0.d0(objArr[3], "length", 1L, 2147483647L), sp0.g0("algorithm", objArr[4]));
                    return eu.v(new UByteArray(Arrays.copyOf(bArrF, bArrF.length)));
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th6) {
                    return eu.u(th6);
                }
            default:
                v20 v20Var5 = this.b;
                try {
                    sp0.a0(5, objArr);
                    byte[] bArrY8 = sp0.Y("keyMaterial", objArr[0]);
                    Object obj3 = objArr[1];
                    byte[] bArrY9 = obj3 != null ? sp0.Y("salt", obj3) : null;
                    Object obj4 = objArr[2];
                    byte[] bArrC = v20Var5.c(bArrY8, bArrY9, obj4 != null ? sp0.Y("info", obj4) : null, (int) sp0.d0(objArr[3], "length", 1L, 2147483647L), sp0.g0("algorithm", objArr[4]));
                    return eu.v(new UByteArray(Arrays.copyOf(bArrC, bArrC.length)));
                } catch (CancellationException e7) {
                    throw e7;
                } catch (Throwable th7) {
                    return eu.u(th7);
                }
        }
    }
}
