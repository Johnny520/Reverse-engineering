package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cb1 implements Iterator, q41 {
    public final CharSequence h;
    public int i;
    public int j;
    public int k;
    public int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cb1(CharSequence charSequence) {
        charSequence.getClass();
        this.h = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.i;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.l < 0) {
            this.i = 2;
            return false;
        }
        CharSequence charSequence = this.h;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.j; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.i = 1;
                this.l = i;
                this.k = length;
                return true;
            }
        }
        i = -1;
        this.i = 1;
        this.l = i;
        this.k = length;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.b();
            return null;
        }
        this.i = 0;
        int i = this.k;
        int i2 = this.j;
        this.j = this.l + i;
        return this.h.subSequence(i2, i).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
