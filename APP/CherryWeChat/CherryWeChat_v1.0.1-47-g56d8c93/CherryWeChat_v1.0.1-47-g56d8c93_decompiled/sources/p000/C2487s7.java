package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: s7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2487s7 extends AbstractC2072iu {

    /* JADX INFO: renamed from: a */
    public char[] f8747a;

    /* JADX INFO: renamed from: b */
    public int f8748b;

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: a */
    public final Object mo39a() {
        return Arrays.copyOf(this.f8747a, this.f8748b);
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: b */
    public final void mo40b(int i) {
        char[] cArr = this.f8747a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f8747a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p000.AbstractC2072iu
    /* JADX INFO: renamed from: d */
    public final int mo41d() {
        return this.f8748b;
    }
}
