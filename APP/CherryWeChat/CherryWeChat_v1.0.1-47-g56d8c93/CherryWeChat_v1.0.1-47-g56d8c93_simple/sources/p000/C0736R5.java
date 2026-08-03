package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: R5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736R5 extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public boolean[] f2348a;

    /* JADX INFO: renamed from: b */
    public int f2349b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f2348a, this.f2349b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int r3) {
        boolean[] r0 = this.f2348a;
        if (r0.length >= r3) goto L9;
        int r1 = r0.length * 2;
        if (r3 >= r1) goto L7;
        r3 = r1;
    L7:
        this.f2348a = Arrays.copyOf(r0, r3);
        return;
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f2349b;
    }
}
