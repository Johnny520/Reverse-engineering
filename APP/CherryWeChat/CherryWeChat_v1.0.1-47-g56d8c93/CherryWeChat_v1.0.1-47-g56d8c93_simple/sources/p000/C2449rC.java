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
    public final void mo40b(int r3) {
        short[] r0 = this.f8576a;
        if (r0.length >= r3) goto L9;
        int r1 = r0.length * 2;
        if (r3 >= r1) goto L7;
        r3 = r1;
    L7:
        this.f8576a = Arrays.copyOf(r0, r3);
        return;
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f8577b;
    }
}
