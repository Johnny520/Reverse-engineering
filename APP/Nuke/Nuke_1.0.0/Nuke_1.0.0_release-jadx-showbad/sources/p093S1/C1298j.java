package p093S1;

import android.graphics.Bitmap;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: S1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1298j implements InterfaceC1296h {

    /* JADX INFO: renamed from: a */
    public final C1293e f4648a;

    /* JADX INFO: renamed from: b */
    public int f4649b;

    /* JADX INFO: renamed from: c */
    public Bitmap.Config f4650c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1298j(C1293e c1293e) {
        this.f4648a = c1293e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p093S1.InterfaceC1296h
    /* JADX INFO: renamed from: a */
    public final void mo2380a() {
        this.f4648a.m741d(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1298j) {
            C1298j c1298j = (C1298j) obj;
            if (this.f4649b == c1298j.f4649b && AbstractC2511o.m4453b(this.f4650c, c1298j.f4650c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i5 = this.f4649b * 31;
        Bitmap.Config config = this.f4650c;
        return i5 + (config != null ? config.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C1299k.m2392c(this.f4649b, this.f4650c);
    }
}
