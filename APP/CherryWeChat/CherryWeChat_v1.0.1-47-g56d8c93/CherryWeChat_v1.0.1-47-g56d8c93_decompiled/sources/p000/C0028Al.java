package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: Al */
/* JADX INFO: loaded from: classes.dex */
public final class C0028Al extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public int[] f61a;

    /* JADX INFO: renamed from: b */
    public int f62b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f61a, this.f62b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        int[] iArr = this.f61a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f61a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f62b;
    }
}
