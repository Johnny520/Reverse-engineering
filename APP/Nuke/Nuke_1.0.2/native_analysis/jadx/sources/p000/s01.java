package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s01 extends c32 {

    /* JADX INFO: renamed from: a */
    public int[] f9851a;

    /* JADX INFO: renamed from: b */
    public int f9852b;

    @Override // p000.c32
    /* JADX INFO: renamed from: a */
    public final Object mo628a() {
        return Arrays.copyOf(this.f9851a, this.f9852b);
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: b */
    public final void mo629b(int i) {
        int[] iArr = this.f9851a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f9851a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.c32
    /* JADX INFO: renamed from: d */
    public final int mo630d() {
        return this.f9852b;
    }
}
