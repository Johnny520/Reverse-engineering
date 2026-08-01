package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w00 extends AbstractC0945y {

    /* JADX INFO: renamed from: d */
    public final AbstractC0112d0 f6885d;

    /* JADX INFO: renamed from: e */
    public final int f6886e;

    /* JADX INFO: renamed from: f */
    public final int f6887f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w00(AbstractC0112d0 abstractC0112d0, int i, int i2) {
        this.f6885d = abstractC0112d0;
        this.f6886e = i;
        z60.m5445o(i, i2, abstractC0112d0.mo6a());
        this.f6887f = i2 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        return this.f6887f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        z60.m5443m(i, this.f6887f);
        return this.f6885d.get(this.f6886e + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final List subList(int i, int i2) {
        z60.m5445o(i, i2, this.f6887f);
        int i3 = this.f6886e;
        return new w00(this.f6885d, i + i3, i3 + i2);
    }
}
