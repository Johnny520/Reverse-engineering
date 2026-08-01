package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: br */
/* JADX INFO: loaded from: classes.dex */
public final class C0078br implements Iterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f818a;

    /* JADX INFO: renamed from: b */
    public int f819b;

    /* JADX INFO: renamed from: c */
    public int f820c;

    /* JADX INFO: renamed from: d */
    public int f821d;

    /* JADX INFO: renamed from: e */
    public int f822e;

    public C0078br(CharSequence charSequence) {
        AbstractC0346ip.m1503o("string", charSequence);
        this.f818a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f819b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f822e < 0) {
            this.f819b = 2;
            return false;
        }
        CharSequence charSequence = this.f818a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f820c; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f819b = 1;
                this.f822e = i;
                this.f821d = length;
                return true;
            }
        }
        i = -1;
        this.f819b = 1;
        this.f822e = i;
        this.f821d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f819b = 0;
        int i = this.f821d;
        int i2 = this.f820c;
        this.f820c = this.f822e + i;
        return this.f818a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
