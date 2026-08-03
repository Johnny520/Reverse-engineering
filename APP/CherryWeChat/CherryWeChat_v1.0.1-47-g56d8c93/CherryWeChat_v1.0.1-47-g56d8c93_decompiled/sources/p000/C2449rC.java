package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: rC */
/* JADX INFO: loaded from: classes.dex */
public final class C2449rC extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public short[] f8576a;

    /* JADX INFO: renamed from: b */
    public int f8577b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return new C2406qC(Arrays.copyOf(this.f8576a, this.f8577b));
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        short[] sArr = this.f8576a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f8576a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f8577b;
    }
}
