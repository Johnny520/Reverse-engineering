package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: x */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0908x extends AbstractC0945y implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public final AbstractC0945y f7226d;

    /* JADX INFO: renamed from: e */
    public final int f7227e;

    /* JADX INFO: renamed from: f */
    public final int f7228f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0908x(AbstractC0945y abstractC0945y, int i, int i2) {
        this.f7226d = abstractC0945y;
        this.f7227e = i;
        s91.m4050o(i, i2, abstractC0945y.mo6a());
        this.f7228f = i2 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        return this.f7228f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f7228f;
        if (i < 0 || i >= i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.f7226d.get(this.f7227e + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final List subList(int i, int i2) {
        s91.m4050o(i, i2, this.f7228f);
        int i3 = this.f7227e;
        return new C0908x(this.f7226d, i + i3, i3 + i2);
    }
}
