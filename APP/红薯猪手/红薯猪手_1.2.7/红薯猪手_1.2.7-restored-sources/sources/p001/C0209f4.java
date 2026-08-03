package p001;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ۟.f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209f4 extends AbstractC0181d4 {

    /* JADX INFO: renamed from: ۥ */
    public final int f779;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f780;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1443;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public int f1444;

    public C0209f4(int i, int i2, int i3) {
        this.f779 = i3;
        this.f780 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f1443 = z;
        this.f1444 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1443;
    }

    @Override // p001.AbstractC0181d4
    public final int nextInt() {
        int i = this.f1444;
        if (i != this.f780) {
            this.f1444 = this.f779 + i;
        } else {
            if (!this.f1443) {
                throw new NoSuchElementException();
            }
            this.f1443 = false;
        }
        return i;
    }
}
