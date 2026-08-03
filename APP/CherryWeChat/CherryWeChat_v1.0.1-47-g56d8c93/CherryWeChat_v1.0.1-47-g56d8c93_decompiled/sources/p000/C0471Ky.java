package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: Ky */
/* JADX INFO: loaded from: classes.dex */
public final class C0471Ky implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int[] f1529a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object[] f1530b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f1531c;

    public C0471Ky() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f1529a = new int[i4];
        this.f1530b = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m918a(int i, Object obj) {
        int i2 = this.f1531c;
        if (i2 != 0 && i <= this.f1529a[i2 - 1]) {
            m920c(i, obj);
            return;
        }
        if (i2 >= this.f1529a.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.f1529a = Arrays.copyOf(this.f1529a, i6);
            this.f1530b = Arrays.copyOf(this.f1530b, i6);
        }
        this.f1529a[i2] = i;
        this.f1530b[i2] = obj;
        this.f1531c = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m919b(int i) {
        Object obj;
        int iM1482d = AbstractC0714Qj.m1482d(this.f1531c, i, this.f1529a);
        if (iM1482d < 0 || (obj = this.f1530b[iM1482d]) == AbstractC0714Qj.f2298e) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m920c(int i, Object obj) {
        int iM1482d = AbstractC0714Qj.m1482d(this.f1531c, i, this.f1529a);
        if (iM1482d >= 0) {
            this.f1530b[iM1482d] = obj;
            return;
        }
        int i2 = ~iM1482d;
        int i3 = this.f1531c;
        if (i2 < i3) {
            Object[] objArr = this.f1530b;
            if (objArr[i2] == AbstractC0714Qj.f2298e) {
                this.f1529a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f1529a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.f1529a = Arrays.copyOf(this.f1529a, i7);
            this.f1530b = Arrays.copyOf(this.f1530b, i7);
        }
        int i8 = this.f1531c;
        if (i8 - i2 != 0) {
            int[] iArr = this.f1529a;
            int i9 = i2 + 1;
            AbstractC0650P4.m1309D(i9, i2, iArr, iArr, i8);
            Object[] objArr2 = this.f1530b;
            AbstractC0650P4.m1310E(objArr2, objArr2, i9, i2, this.f1531c);
        }
        this.f1529a[i2] = i;
        this.f1530b[i2] = obj;
        this.f1531c++;
    }

    public final Object clone() {
        C0471Ky c0471Ky = (C0471Ky) super.clone();
        c0471Ky.f1529a = (int[]) this.f1529a.clone();
        c0471Ky.f1530b = (Object[]) this.f1530b.clone();
        return c0471Ky;
    }

    public final String toString() {
        int i = this.f1531c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f1531c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1529a[i3]);
            sb.append('=');
            Object obj = this.f1530b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
