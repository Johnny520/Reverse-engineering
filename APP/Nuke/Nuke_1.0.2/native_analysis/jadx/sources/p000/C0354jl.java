package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: jl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0354jl extends c32 {

    /* JADX INFO: renamed from: a */
    public boolean[] f5093a;

    /* JADX INFO: renamed from: b */
    public int f5094b;

    @Override // p000.c32
    /* JADX INFO: renamed from: a */
    public final Object mo628a() {
        return Arrays.copyOf(this.f5093a, this.f5094b);
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: b */
    public final void mo629b(int i) {
        boolean[] zArr = this.f5093a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5093a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: d */
    public final int mo630d() {
        return this.f5094b;
    }
}
