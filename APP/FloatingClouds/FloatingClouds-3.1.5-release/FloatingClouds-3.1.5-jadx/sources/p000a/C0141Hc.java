package p000a;

import java.util.Arrays;
import java.util.Comparator;
import p000a.C0184K1;

/* JADX INFO: renamed from: a.Hc */
/* JADX INFO: loaded from: classes.dex */
public final class C0141Hc extends C0184K1 {

    /* JADX INFO: renamed from: f */
    public C0693le[] f489f;

    /* JADX INFO: renamed from: g */
    public C0693le[] f490g;

    /* JADX INFO: renamed from: h */
    public int f491h;

    /* JADX INFO: renamed from: i */
    public b f492i;

    /* JADX INFO: renamed from: a.Hc$a */
    public class a implements Comparator<C0693le> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final int compare(C0693le c0693le, C0693le c0693le2) {
            return c0693le.f2581b - c0693le2.f2581b;
        }
    }

    /* JADX INFO: renamed from: a.Hc$b */
    public class b implements Comparable {

        /* JADX INFO: renamed from: a */
        public C0693le f493a;

        public b() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f493a.f2581b - ((C0693le) obj).f2581b;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f493a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f493a.f2587h[i] + " ";
                }
            }
            return str + "] " + this.f493a;
        }
    }

    @Override // p000a.C0184K1, p000a.C0029B9.a
    /* JADX INFO: renamed from: a */
    public final C0693le mo87a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f491h; i2++) {
            C0693le[] c0693leArr = this.f489f;
            C0693le c0693le = c0693leArr[i2];
            if (!zArr[c0693le.f2581b]) {
                b bVar = this.f492i;
                bVar.f493a = c0693le;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = bVar.f493a.f2587h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0693le c0693le2 = c0693leArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c0693le2.f2587h[i3];
                            float f3 = bVar.f493a.f2587h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f489f[i];
    }

    @Override // p000a.C0184K1
    /* JADX INFO: renamed from: h */
    public final void mo367h(C0184K1 c0184k1, boolean z) {
        C0693le c0693le = c0184k1.f633a;
        if (c0693le == null) {
            return;
        }
        C0184K1.a aVar = c0184k1.f636d;
        int iMo351k = aVar.mo351k();
        for (int i = 0; i < iMo351k; i++) {
            C0693le c0693leMo346f = aVar.mo346f(i);
            float fMo341a = aVar.mo341a(i);
            b bVar = this.f492i;
            bVar.f493a = c0693leMo346f;
            boolean z2 = c0693leMo346f.f2580a;
            float[] fArr = c0693le.f2587h;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = bVar.f493a.f2587h;
                    float f = (fArr[i2] * fMo341a) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar.f493a.f2587h[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    C0141Hc.this.m369j(bVar.f493a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo341a;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar.f493a.f2587h[i3] = f3;
                    } else {
                        bVar.f493a.f2587h[i3] = 0.0f;
                    }
                }
                m368i(c0693leMo346f);
            }
            this.f634b = (c0184k1.f634b * fMo341a) + this.f634b;
        }
        m369j(c0693le);
    }

    /* JADX INFO: renamed from: i */
    public final void m368i(C0693le c0693le) {
        int i;
        int i2 = this.f491h + 1;
        C0693le[] c0693leArr = this.f489f;
        if (i2 > c0693leArr.length) {
            C0693le[] c0693leArr2 = (C0693le[]) Arrays.copyOf(c0693leArr, c0693leArr.length * 2);
            this.f489f = c0693leArr2;
            this.f490g = (C0693le[]) Arrays.copyOf(c0693leArr2, c0693leArr2.length * 2);
        }
        C0693le[] c0693leArr3 = this.f489f;
        int i3 = this.f491h;
        c0693leArr3[i3] = c0693le;
        int i4 = i3 + 1;
        this.f491h = i4;
        if (i4 > 1 && c0693leArr3[i3].f2581b > c0693le.f2581b) {
            int i5 = 0;
            while (true) {
                i = this.f491h;
                if (i5 >= i) {
                    break;
                }
                this.f490g[i5] = this.f489f[i5];
                i5++;
            }
            Arrays.sort(this.f490g, 0, i, new a());
            for (int i6 = 0; i6 < this.f491h; i6++) {
                this.f489f[i6] = this.f490g[i6];
            }
        }
        c0693le.f2580a = true;
        c0693le.m1559a(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m369j(C0693le c0693le) {
        int i = 0;
        while (i < this.f491h) {
            if (this.f489f[i] == c0693le) {
                while (true) {
                    int i2 = this.f491h;
                    if (i >= i2 - 1) {
                        this.f491h = i2 - 1;
                        c0693le.f2580a = false;
                        return;
                    } else {
                        C0693le[] c0693leArr = this.f489f;
                        int i3 = i + 1;
                        c0693leArr[i] = c0693leArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000a.C0184K1
    public final String toString() {
        String str = " goal -> (" + this.f634b + ") : ";
        for (int i = 0; i < this.f491h; i++) {
            C0693le c0693le = this.f489f[i];
            b bVar = this.f492i;
            bVar.f493a = c0693le;
            str = str + bVar + " ";
        }
        return str;
    }
}
