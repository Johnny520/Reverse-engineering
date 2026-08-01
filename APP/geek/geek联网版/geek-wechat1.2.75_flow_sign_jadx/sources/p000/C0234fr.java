package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: fr */
/* JADX INFO: loaded from: classes.dex */
public final class C0234fr implements Iterator {

    /* JADX INFO: renamed from: a */
    public final String f1818a;

    /* JADX INFO: renamed from: b */
    public int f1819b;

    /* JADX INFO: renamed from: c */
    public int f1820c;

    /* JADX INFO: renamed from: d */
    public int f1821d;

    /* JADX INFO: renamed from: e */
    public int f1822e;

    public C0234fr(String str) {
        this.f1818a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f1819b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f1822e < 0) {
            this.f1819b = 2;
            return false;
        }
        String str = this.f1818a;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f1820c; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f1819b = 1;
                this.f1822e = i;
                this.f1821d = length;
                return true;
            }
        }
        i = -1;
        this.f1819b = 1;
        this.f1822e = i;
        this.f1821d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1819b = 0;
        int i = this.f1821d;
        int i2 = this.f1820c;
        this.f1820c = this.f1822e + i;
        return this.f1818a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
