package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: mC */
/* JADX INFO: loaded from: classes.dex */
public final class C2226mC extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public long[] f7744a;

    /* JADX INFO: renamed from: b */
    public int f7745b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return new C2183lC(Arrays.copyOf(this.f7744a, this.f7745b));
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int r3) {
        long[] r0 = this.f7744a;
        if (r0.length >= r3) goto L9;
        int r1 = r0.length * 2;
        if (r3 >= r1) goto L7;
        r3 = r1;
    L7:
        this.f7744a = Arrays.copyOf(r0, r3);
        return;
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f7745b;
    }
}
