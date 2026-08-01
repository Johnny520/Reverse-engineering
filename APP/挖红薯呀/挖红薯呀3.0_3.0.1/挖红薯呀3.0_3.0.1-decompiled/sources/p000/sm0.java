package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 extends u50 {

    /* JADX INFO: renamed from: b */
    public int f5784b;

    /* JADX INFO: renamed from: d */
    public int f5786d;

    /* JADX INFO: renamed from: f */
    public int f5788f;

    /* JADX INFO: renamed from: a */
    public pm0[] f5783a = new pm0[16];

    /* JADX INFO: renamed from: c */
    public int[] f5785c = new int[16];

    /* JADX INFO: renamed from: e */
    public Object[] f5787e = new Object[16];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m4089E() {
        this.f5784b = 0;
        this.f5786d = 0;
        Arrays.fill(this.f5787e, 0, this.f5788f, (Object) null);
        this.f5788f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: F */
    public final void m4090F(InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        if (m4092H()) {
            rm0 rm0Var = new rm0(this);
            while (true) {
                sm0 sm0Var = rm0Var.f5432d;
                pm0 pm0Var = sm0Var.f5783a[rm0Var.f5429a];
                C0788u2 c0788u2Mo3143b = pm0Var.mo3143b(rm0Var);
                InterfaceC0643q8 interfaceC0643q82 = interfaceC0643q8;
                z11 z11Var2 = z11Var;
                iu0 iu0Var2 = iu0Var;
                qm0 qm0Var2 = qm0Var;
                try {
                    pm0Var.mo186a(rm0Var, interfaceC0643q82, z11Var2, iu0Var2, qm0Var2);
                    int i = rm0Var.f5429a;
                    int i2 = sm0Var.f5784b;
                    if (i < i2) {
                        pm0 pm0Var2 = sm0Var.f5783a[i];
                        rm0Var.f5430b += pm0Var2.f4928a;
                        rm0Var.f5431c += pm0Var2.f4929b;
                        int i3 = i + 1;
                        rm0Var.f5429a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC0643q8 = interfaceC0643q82;
                        z11Var = z11Var2;
                        iu0Var = iu0Var2;
                        qm0Var = qm0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m4089E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final boolean m4091G() {
        return this.f5784b == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m4092H() {
        return this.f5784b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m4093I(pm0 pm0Var) {
        int i = this.f5784b;
        pm0[] pm0VarArr = this.f5783a;
        if (i == pm0VarArr.length) {
            pm0[] pm0VarArr2 = new pm0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(pm0VarArr, 0, pm0VarArr2, 0, i);
            this.f5783a = pm0VarArr2;
        }
        int i2 = this.f5786d;
        int i3 = pm0Var.f4928a;
        int i4 = pm0Var.f4929b;
        int i5 = i2 + i3;
        int[] iArr = this.f5785c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC0201f9.m1055a0(iArr, iArr2, 0, 0, length);
            this.f5785c = iArr2;
        }
        int i7 = this.f5788f + i4;
        Object[] objArr = this.f5787e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f5787e = objArr2;
        }
        pm0[] pm0VarArr3 = this.f5783a;
        int i9 = this.f5784b;
        this.f5784b = i9 + 1;
        pm0VarArr3[i9] = pm0Var;
        this.f5786d += pm0Var.f4928a;
        this.f5788f += i4;
    }
}
