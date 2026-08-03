package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: hC */
/* JADX INFO: loaded from: classes.dex */
public final class C1490hC extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public int[] f5261a;

    /* JADX INFO: renamed from: b */
    public int f5262b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return new C1446gC(Arrays.copyOf(this.f5261a, this.f5262b));
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        int[] iArr = this.f5261a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5261a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f5262b;
    }
}
