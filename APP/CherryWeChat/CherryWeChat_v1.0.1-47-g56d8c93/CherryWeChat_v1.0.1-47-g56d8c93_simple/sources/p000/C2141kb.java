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
    public final void m4328a(int r4, float r5) {
        int r0 = this.f7492f;
        int[] r1 = this.f7490d;
        if (r0 < r1.length) goto L5;
        this.f7490d = Arrays.copyOf(r1, r1.length * 2);
        float[] r02 = this.f7491e;
        this.f7491e = Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7490d;
        int r12 = this.f7492f;
        r03[r12] = r4;
        float[] r42 = this.f7491e;
        this.f7492f = r12 + 1;
        r42[r12] = r5;
    }

    /* JADX INFO: renamed from: b */
    public final void m4329b(int r4, int r5) {
        int r0 = this.f7489c;
        int[] r1 = this.f7487a;
        if (r0 < r1.length) goto L5;
        this.f7487a = Arrays.copyOf(r1, r1.length * 2);
        int[] r02 = this.f7488b;
        this.f7488b = Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7487a;
        int r12 = this.f7489c;
        r03[r12] = r4;
        int[] r42 = this.f7488b;
        this.f7489c = r12 + 1;
        r42[r12] = r5;
    }

    /* JADX INFO: renamed from: c */
    public final void m4330c(int r4, String r5) {
        int r0 = this.f7495i;
        int[] r1 = this.f7493g;
        if (r0 < r1.length) goto L5;
        this.f7493g = Arrays.copyOf(r1, r1.length * 2);
        String[] r02 = this.f7494h;
        this.f7494h = (String[]) Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7493g;
        int r12 = this.f7495i;
        r03[r12] = r4;
        String[] r42 = this.f7494h;
        this.f7495i = r12 + 1;
        r42[r12] = r5;
    }

    /* JADX INFO: renamed from: d */
    public final void m4331d(int r4, boolean r5) {
        int r0 = this.f7498l;
        int[] r1 = this.f7496j;
        if (r0 < r1.length) goto L5;
        this.f7496j = Arrays.copyOf(r1, r1.length * 2);
        boolean[] r02 = this.f7497k;
        this.f7497k = Arrays.copyOf(r02, r02.length * 2);
    L5:
        int[] r03 = this.f7496j;
        int r12 = this.f7498l;
        r03[r12] = r4;
        boolean[] r42 = this.f7497k;
        this.f7498l = r12 + 1;
        r42[r12] = r5;
    }
}
