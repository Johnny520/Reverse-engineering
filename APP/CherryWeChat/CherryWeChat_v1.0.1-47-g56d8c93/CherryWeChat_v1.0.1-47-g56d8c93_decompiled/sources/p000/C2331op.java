package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: op */
/* JADX INFO: loaded from: classes.dex */
public final class C2331op extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public long[] f8178a;

    /* JADX INFO: renamed from: b */
    public int f8179b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f8178a, this.f8179b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        long[] jArr = this.f8178a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f8178a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f8179b;
    }
}
