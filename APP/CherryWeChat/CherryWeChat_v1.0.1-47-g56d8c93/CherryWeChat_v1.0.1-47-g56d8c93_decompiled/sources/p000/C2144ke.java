package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ke */
/* JADX INFO: loaded from: classes.dex */
public final class C2144ke extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public double[] f7499a;

    /* JADX INFO: renamed from: b */
    public int f7500b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f7499a, this.f7500b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        double[] dArr = this.f7499a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f7499a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f7500b;
    }
}
