package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: hy */
/* JADX INFO: loaded from: classes.dex */
public final class C1519hy extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public short[] f5375a;

    /* JADX INFO: renamed from: b */
    public int f5376b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f5375a, this.f5376b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        short[] sArr = this.f5375a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5375a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f5376b;
    }
}
