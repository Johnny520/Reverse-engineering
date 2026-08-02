package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ox */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0559ox implements qm1 {

    /* JADX INFO: renamed from: h */
    public boolean f7865h;

    /* JADX INFO: renamed from: i */
    public final Object f7866i;

    public C0559ox() {
        this.f7866i = new Handler(Looper.getMainLooper(), new m92());
    }

    @Override // p000.qm1
    /* JADX INFO: renamed from: N */
    public long mo3646N(int i, long j, long j2) {
        if (!this.f7865h) {
            return 0L;
        }
        im2 im2Var = (im2) this.f7866i;
        if (im2Var.f4687a.mo568b()) {
            return 0L;
        }
        return im2Var.m2371h(im2Var.m2367d(im2Var.f4687a.mo571e(im2Var.m2367d(im2Var.m2370g(j2)))));
    }

    /* JADX INFO: renamed from: a */
    public void mo3647a() {
        this.f7865h = true;
    }

    /* JADX INFO: renamed from: b */
    public void mo3648b() {
        this.f7865h = false;
    }

    /* JADX INFO: renamed from: c */
    public void mo3649c() {
        this.f7865h = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo3650d(byte b) {
        ((C0133dk) this.f7866i).m1045w(String.valueOf(b));
    }

    /* JADX INFO: renamed from: e */
    public void m3651e(char c) {
        C0133dk c0133dk = (C0133dk) this.f7866i;
        c0133dk.m1037j(c0133dk.f2081i, 1);
        char[] cArr = (char[]) c0133dk.f2082j;
        int i = c0133dk.f2081i;
        c0133dk.f2081i = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: f */
    public void mo3652f(int i) {
        ((C0133dk) this.f7866i).m1045w(String.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void mo3653g(long j) {
        ((C0133dk) this.f7866i).m1045w(String.valueOf(j));
    }

    /* JADX INFO: renamed from: h */
    public void mo3654h(short s) {
        ((C0133dk) this.f7866i).m1045w(String.valueOf(s));
    }

    /* JADX INFO: renamed from: i */
    public void mo3655i(String str) {
        byte b;
        str.getClass();
        C0133dk c0133dk = (C0133dk) this.f7866i;
        c0133dk.m1037j(c0133dk.f2081i, str.length() + 2);
        char[] cArr = (char[]) c0133dk.f2082j;
        int i = c0133dk.f2081i;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = mv2.f6901b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c0133dk.m1037j(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = mv2.f6901b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c0133dk.f2082j)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = mv2.f6900a[cCharAt];
                            str2.getClass();
                            c0133dk.m1037j(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) c0133dk.f2082j, i4);
                            int length3 = str2.length() + i4;
                            c0133dk.f2081i = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) c0133dk.f2082j;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            c0133dk.f2081i = i4;
                        }
                    }
                }
                c0133dk.m1037j(i4, 1);
                ((char[]) c0133dk.f2082j)[i4] = '\"';
                c0133dk.f2081i = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c0133dk.f2081i = i3 + 1;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m3656j(d92 d92Var, boolean z) {
        try {
            if (this.f7865h || z) {
                ((Handler) this.f7866i).obtainMessage(1, d92Var).sendToTarget();
            } else {
                this.f7865h = true;
                d92Var.mo192e();
                this.f7865h = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.qm1
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3658k0(long j, long j2, t00 t00Var) {
        vl2 vl2Var;
        long jM987d;
        if (t00Var instanceof vl2) {
            vl2Var = (vl2) t00Var;
            int i = vl2Var.f12013n;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl2Var.f12013n = i - Integer.MIN_VALUE;
            } else {
                vl2Var = new vl2(this, (u00) t00Var);
            }
        }
        Object objM2364a = vl2Var.f12011l;
        int i2 = vl2Var.f12013n;
        if (i2 == 0) {
            fg1.m1627T(objM2364a);
            jM987d = 0;
            if (this.f7865h) {
                im2 im2Var = (im2) this.f7866i;
                if (!im2Var.f4695i) {
                    vl2Var.f12010k = j2;
                    vl2Var.f12013n = 1;
                    objM2364a = im2Var.m2364a(j2, vl2Var);
                    k20 k20Var = k20.f5323h;
                    if (objM2364a == k20Var) {
                        return k20Var;
                    }
                }
                jM987d = da3.m987d(j2, jM987d);
            }
            return new da3(jM987d);
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = vl2Var.f12010k;
        fg1.m1627T(objM2364a);
        jM987d = ((da3) objM2364a).f1950a;
        jM987d = da3.m987d(j2, jM987d);
        return new da3(jM987d);
    }

    public C0559ox(C0133dk c0133dk) {
        this.f7866i = c0133dk;
        this.f7865h = true;
    }

    public C0559ox(im2 im2Var, boolean z) {
        this.f7866i = im2Var;
        this.f7865h = z;
    }

    /* JADX INFO: renamed from: k */
    public void mo3657k() {
    }

    /* JADX INFO: renamed from: m */
    public void mo3659m() {
    }
}
