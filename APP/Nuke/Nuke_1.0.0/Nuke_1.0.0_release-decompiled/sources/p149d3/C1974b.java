package p149d3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: d3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1974b implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final CharSequence f6667d;

    /* JADX INFO: renamed from: e */
    public int f6668e;

    /* JADX INFO: renamed from: f */
    public int f6669f;

    /* JADX INFO: renamed from: g */
    public int f6670g;

    /* JADX INFO: renamed from: h */
    public int f6671h;

    public C1974b(CharSequence charSequence) {
        AbstractC1665j.m2985e(charSequence, "string");
        this.f6667d = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        int i6;
        int i7 = this.f6668e;
        if (i7 != 0) {
            return i7 == 1;
        }
        if (this.f6671h < 0) {
            this.f6668e = 2;
            return false;
        }
        CharSequence charSequence = this.f6667d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i8 = this.f6669f; i8 < length2; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i5 = (cCharAt == '\r' && (i6 = i8 + 1) < charSequence.length() && charSequence.charAt(i6) == '\n') ? 2 : 1;
                length = i8;
                this.f6668e = 1;
                this.f6671h = i5;
                this.f6670g = length;
                return true;
            }
        }
        i5 = -1;
        this.f6668e = 1;
        this.f6671h = i5;
        this.f6670g = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6668e = 0;
        int i5 = this.f6670g;
        int i6 = this.f6669f;
        this.f6669f = this.f6671h + i5;
        return this.f6667d.subSequence(i6, i5).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
