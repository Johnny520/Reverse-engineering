package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: cC */
/* JADX INFO: loaded from: classes.dex */
public final class C1253cC extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public byte[] f4253a;

    /* JADX INFO: renamed from: b */
    public int f4254b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return new C1210bC(Arrays.copyOf(this.f4253a, this.f4254b));
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int r3) {
        byte[] r0 = this.f4253a;
        if (r0.length >= r3) goto L9;
        int r1 = r0.length * 2;
        if (r3 >= r1) goto L7;
        r3 = r1;
    L7:
        this.f4253a = Arrays.copyOf(r0, r3);
        return;
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f4254b;
    }
}
