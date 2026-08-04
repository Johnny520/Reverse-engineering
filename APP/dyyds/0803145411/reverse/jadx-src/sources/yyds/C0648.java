package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛳᛷᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0648 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f3127;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f3128;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final CharSequence f3129;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f3130;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f3131;

    public C0648(CharSequence charSequence) {
        this.f3129 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f3131;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f3128 < 0) {
            this.f3131 = 2;
            return false;
        }
        CharSequence charSequence = this.f3129;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f3127; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f3131 = 1;
                this.f3128 = i;
                this.f3130 = length;
                return true;
            }
        }
        i = -1;
        this.f3131 = 1;
        this.f3128 = i;
        this.f3130 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3131 = 0;
        int i = this.f3130;
        int i2 = this.f3127;
        this.f3127 = this.f3128 + i;
        return this.f3129.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
