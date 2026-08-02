package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: qq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0628qq extends c32 {

    /* JADX INFO: renamed from: a */
    public char[] f9085a;

    /* JADX INFO: renamed from: b */
    public int f9086b;

    @Override // p000.c32
    /* JADX INFO: renamed from: a */
    public final Object mo628a() {
        return Arrays.copyOf(this.f9085a, this.f9086b);
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: b */
    public final void mo629b(int i) {
        char[] cArr = this.f9085a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f9085a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: d */
    public final int mo630d() {
        return this.f9086b;
    }
}
