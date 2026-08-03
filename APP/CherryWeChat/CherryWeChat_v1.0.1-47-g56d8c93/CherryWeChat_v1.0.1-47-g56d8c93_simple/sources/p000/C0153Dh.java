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
    public final void mo40b(int r3) {
        float[] r0 = this.f410a;
        if (r0.length >= r3) goto L9;
        int r1 = r0.length * 2;
        if (r3 >= r1) goto L7;
        r3 = r1;
    L7:
        this.f410a = Arrays.copyOf(r0, r3);
        return;
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f411b;
    }
}
