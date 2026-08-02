package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class ox implements qm1 {
    public boolean h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ox() {
        this.i = new Handler(Looper.getMainLooper(), new m92());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qm1
    public long N(int i, long j, long j2) {
        if (!this.h) {
            return 0L;
        }
        im2 im2Var = (im2) this.i;
        if (im2Var.a.b()) {
            return 0L;
        }
        return im2Var.h(im2Var.d(im2Var.a.e(im2Var.d(im2Var.g(j2)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        this.h = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        this.h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        this.h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(byte b) {
        ((dk) this.i).w(String.valueOf(b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(char c) {
        dk dkVar = (dk) this.i;
        dkVar.j(dkVar.i, 1);
        char[] cArr = (char[]) dkVar.j;
        int i = dkVar.i;
        dkVar.i = i + 1;
        cArr[i] = c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(int i) {
        ((dk) this.i).w(String.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(long j) {
        ((dk) this.i).w(String.valueOf(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(short s) {
        ((dk) this.i).w(String.valueOf(s));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(String str) {
        byte b;
        str.getClass();
        dk dkVar = (dk) this.i;
        dkVar.j(dkVar.i, str.length() + 2);
        char[] cArr = (char[]) dkVar.j;
        int i = dkVar.i;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = mv2.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    dkVar.j(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = mv2.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) dkVar.j)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = mv2.a[cCharAt];
                            str2.getClass();
                            dkVar.j(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) dkVar.j, i4);
                            int length3 = str2.length() + i4;
                            dkVar.i = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) dkVar.j;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            dkVar.i = i4;
                        }
                    }
                }
                dkVar.j(i4, 1);
                ((char[]) dkVar.j)[i4] = '\"';
                dkVar.i = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        dkVar.i = i3 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void j(d92 d92Var, boolean z) {
        try {
            if (this.h || z) {
                ((Handler) this.i).obtainMessage(1, d92Var).sendToTarget();
            } else {
                this.h = true;
                d92Var.e();
                this.h = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k0(long j, long j2, t00 t00Var) {
        vl2 vl2Var;
        long jD;
        if (t00Var instanceof vl2) {
            vl2Var = (vl2) t00Var;
            int i = vl2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl2Var.n = i - Integer.MIN_VALUE;
            } else {
                vl2Var = new vl2(this, (u00) t00Var);
            }
        }
        Object objA = vl2Var.l;
        int i2 = vl2Var.n;
        if (i2 == 0) {
            fg1.T(objA);
            jD = 0;
            if (this.h) {
                im2 im2Var = (im2) this.i;
                if (!im2Var.i) {
                    vl2Var.k = j2;
                    vl2Var.n = 1;
                    objA = im2Var.a(j2, vl2Var);
                    k20 k20Var = k20.h;
                    if (objA == k20Var) {
                        return k20Var;
                    }
                }
                jD = da3.d(j2, jD);
            }
            return new da3(jD);
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = vl2Var.k;
        fg1.T(objA);
        jD = ((da3) objA).a;
        jD = da3.d(j2, jD);
        return new da3(jD);
    }

    public ox(dk dkVar) {
        this.i = dkVar;
        this.h = true;
    }

    public ox(im2 im2Var, boolean z) {
        this.i = im2Var;
        this.h = z;
    }

    public void k() {
    }

    public void m() {
    }
}
