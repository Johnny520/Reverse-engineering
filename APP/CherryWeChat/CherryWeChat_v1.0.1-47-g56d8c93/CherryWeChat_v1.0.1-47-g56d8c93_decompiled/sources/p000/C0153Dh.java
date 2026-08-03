package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: Dh */
/* JADX INFO: loaded from: classes.dex */
public final class C0153Dh extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public float[] f410a;

    /* JADX INFO: renamed from: b */
    public int f411b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f410a, this.f411b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        float[] fArr = this.f410a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f410a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f411b;
    }
}
