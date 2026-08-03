package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: kb */
/* JADX INFO: loaded from: classes.dex */
public final class C2141kb {

    /* JADX INFO: renamed from: a */
    public int[] f7487a;

    /* JADX INFO: renamed from: b */
    public int[] f7488b;

    /* JADX INFO: renamed from: c */
    public int f7489c;

    /* JADX INFO: renamed from: d */
    public int[] f7490d;

    /* JADX INFO: renamed from: e */
    public float[] f7491e;

    /* JADX INFO: renamed from: f */
    public int f7492f;

    /* JADX INFO: renamed from: g */
    public int[] f7493g;

    /* JADX INFO: renamed from: h */
    public String[] f7494h;

    /* JADX INFO: renamed from: i */
    public int f7495i;

    /* JADX INFO: renamed from: j */
    public int[] f7496j;

    /* JADX INFO: renamed from: k */
    public boolean[] f7497k;

    /* JADX INFO: renamed from: l */
    public int f7498l;

    /* JADX INFO: renamed from: a */
    public final void m4328a(int i, float f) {
        int i2 = this.f7492f;
        int[] iArr = this.f7490d;
        if (i2 >= iArr.length) {
            this.f7490d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f7491e;
            this.f7491e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f7490d;
        int i3 = this.f7492f;
        iArr2[i3] = i;
        float[] fArr2 = this.f7491e;
        this.f7492f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m4329b(int i, int i2) {
        int i3 = this.f7489c;
        int[] iArr = this.f7487a;
        if (i3 >= iArr.length) {
            this.f7487a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f7488b;
            this.f7488b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7487a;
        int i4 = this.f7489c;
        iArr3[i4] = i;
        int[] iArr4 = this.f7488b;
        this.f7489c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m4330c(int i, String str) {
        int i2 = this.f7495i;
        int[] iArr = this.f7493g;
        if (i2 >= iArr.length) {
            this.f7493g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7494h;
            this.f7494h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f7493g;
        int i3 = this.f7495i;
        iArr2[i3] = i;
        String[] strArr2 = this.f7494h;
        this.f7495i = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m4331d(int i, boolean z) {
        int i2 = this.f7498l;
        int[] iArr = this.f7496j;
        if (i2 >= iArr.length) {
            this.f7496j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f7497k;
            this.f7497k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f7496j;
        int i3 = this.f7498l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f7497k;
        this.f7498l = i3 + 1;
        zArr2[i3] = z;
    }
}
