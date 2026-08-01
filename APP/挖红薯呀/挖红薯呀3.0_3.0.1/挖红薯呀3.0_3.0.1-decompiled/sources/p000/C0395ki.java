package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ki */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0395ki {

    /* JADX INFO: renamed from: a */
    public final C0616pi f3155a;

    /* JADX INFO: renamed from: b */
    public C0351jd f3156b;

    /* JADX INFO: renamed from: c */
    public boolean f3157c;

    /* JADX INFO: renamed from: f */
    public int f3160f;

    /* JADX INFO: renamed from: g */
    public int f3161g;

    /* JADX INFO: renamed from: l */
    public int f3166l;

    /* JADX INFO: renamed from: d */
    public final e30 f3158d = new e30();

    /* JADX INFO: renamed from: e */
    public boolean f3159e = true;

    /* JADX INFO: renamed from: h */
    public final ArrayList f3162h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f3163i = -1;

    /* JADX INFO: renamed from: j */
    public int f3164j = -1;

    /* JADX INFO: renamed from: k */
    public int f3165k = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0395ki(C0616pi c0616pi, C0351jd c0351jd) {
        this.f3155a = c0616pi;
        this.f3156b = c0351jd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1903a() {
        m1905c();
        ArrayList arrayList = this.f3162h;
        if (arrayList.isEmpty()) {
            this.f3161g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1904b() {
        int i = this.f3161g;
        if (i > 0) {
            sm0 sm0Var = this.f3156b.f2797a;
            sm0Var.m4093I(nm0.f4297c);
            sm0Var.f5785c[sm0Var.f5786d - sm0Var.f5783a[sm0Var.f5784b - 1].f4928a] = i;
            this.f3161g = 0;
        }
        ArrayList arrayList = this.f3162h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0351jd c0351jd = this.f3156b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c0351jd.getClass();
        if (size != 0) {
            sm0 sm0Var2 = c0351jd.f2797a;
            sm0Var2.m4093I(ql0.f5199c);
            j50.m1671u(sm0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1905c() {
        int i = this.f3166l;
        if (i > 0) {
            int i2 = this.f3163i;
            if (i2 >= 0) {
                m1904b();
                sm0 sm0Var = this.f3156b.f2797a;
                sm0Var.m4093I(fm0.f1769c);
                int i3 = sm0Var.f5786d - sm0Var.f5783a[sm0Var.f5784b - 1].f4928a;
                int[] iArr = sm0Var.f5785c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f3163i = -1;
            } else {
                int i4 = this.f3165k;
                int i5 = this.f3164j;
                m1904b();
                sm0 sm0Var2 = this.f3156b.f2797a;
                sm0Var2.m4093I(bm0.f547c);
                int i6 = sm0Var2.f5786d - sm0Var2.f5783a[sm0Var2.f5784b - 1].f4928a;
                int[] iArr2 = sm0Var2.f5785c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f3164j = -1;
                this.f3165k = -1;
            }
            this.f3166l = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1906d(boolean z) {
        v11 v11Var = this.f3155a.f4865G;
        int i = z ? v11Var.f6382i : v11Var.f6380g;
        int i2 = i - this.f3160f;
        if (i2 < 0) {
            AbstractC0653qi.m3252a("Tried to seek backward");
        }
        if (i2 > 0) {
            sm0 sm0Var = this.f3156b.f2797a;
            sm0Var.m4093I(jl0.f2911c);
            sm0Var.f5785c[sm0Var.f5786d - sm0Var.f5783a[sm0Var.f5784b - 1].f4928a] = i2;
            this.f3160f = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1907e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC0653qi.m3252a("Invalid remove index " + i);
            }
            if (this.f3163i == i) {
                this.f3166l += i2;
                return;
            }
            m1905c();
            this.f3163i = i;
            this.f3166l = i2;
        }
    }
}
