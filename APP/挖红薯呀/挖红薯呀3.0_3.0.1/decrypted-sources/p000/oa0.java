package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final String f4494d;

    /* JADX INFO: renamed from: e */
    public int f4495e;

    /* JADX INFO: renamed from: f */
    public int f4496f;

    /* JADX INFO: renamed from: g */
    public int f4497g;

    /* JADX INFO: renamed from: h */
    public int f4498h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oa0(String str) {
        this.f4494d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f4495e;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f4498h < 0) {
            this.f4495e = 2;
            return false;
        }
        String str = this.f4494d;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f4496f; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f4495e = 1;
                this.f4498h = i;
                this.f4497g = length;
                return true;
            }
        }
        i = -1;
        this.f4495e = 1;
        this.f4498h = i;
        this.f4497g = length;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        this.f4495e = 0;
        int i = this.f4497g;
        int i2 = this.f4496f;
        this.f4496f = this.f4498h + i;
        return this.f4494d.subSequence(i2, i).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
