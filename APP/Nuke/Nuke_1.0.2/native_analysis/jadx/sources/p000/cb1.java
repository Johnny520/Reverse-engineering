package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cb1 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final CharSequence f1297h;

    /* JADX INFO: renamed from: i */
    public int f1298i;

    /* JADX INFO: renamed from: j */
    public int f1299j;

    /* JADX INFO: renamed from: k */
    public int f1300k;

    /* JADX INFO: renamed from: l */
    public int f1301l;

    public cb1(CharSequence charSequence) {
        charSequence.getClass();
        this.f1297h = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f1298i;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f1301l < 0) {
            this.f1298i = 2;
            return false;
        }
        CharSequence charSequence = this.f1297h;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f1299j; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f1298i = 1;
                this.f1301l = i;
                this.f1300k = length;
                return true;
            }
        }
        i = -1;
        this.f1298i = 1;
        this.f1301l = i;
        this.f1300k = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.m5513b();
            return null;
        }
        this.f1298i = 0;
        int i = this.f1300k;
        int i2 = this.f1299j;
        this.f1299j = this.f1301l + i;
        return this.f1297h.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
