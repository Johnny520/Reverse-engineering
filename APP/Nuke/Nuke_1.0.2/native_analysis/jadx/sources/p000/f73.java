package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f73 extends c32 {

    /* JADX INFO: renamed from: a */
    public int[] f2842a;

    /* JADX INFO: renamed from: b */
    public int f2843b;

    @Override // p000.c32
    /* JADX INFO: renamed from: a */
    public final Object mo628a() {
        return new e73(Arrays.copyOf(this.f2842a, this.f2843b));
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: b */
    public final void mo629b(int i) {
        int[] iArr = this.f2842a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f2842a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: d */
    public final int mo630d() {
        return this.f2843b;
    }
}
