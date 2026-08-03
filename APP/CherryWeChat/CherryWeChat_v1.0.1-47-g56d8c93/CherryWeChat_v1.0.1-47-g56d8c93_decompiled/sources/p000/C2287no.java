package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: no */
/* JADX INFO: loaded from: classes.dex */
public final class C2287no implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final CharSequence f8023a;

    /* JADX INFO: renamed from: b */
    public int f8024b;

    /* JADX INFO: renamed from: c */
    public int f8025c;

    /* JADX INFO: renamed from: d */
    public int f8026d;

    /* JADX INFO: renamed from: e */
    public int f8027e;

    public C2287no(String str) {
        this.f8023a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f8024b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f8027e < 0) {
            this.f8024b = 2;
            return false;
        }
        CharSequence charSequence = this.f8023a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f8025c; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f8024b = 1;
                this.f8027e = i;
                this.f8026d = length;
                return true;
            }
        }
        i = -1;
        this.f8024b = 1;
        this.f8027e = i;
        this.f8026d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8024b = 0;
        int i = this.f8026d;
        int i2 = this.f8025c;
        this.f8025c = this.f8027e + i;
        return this.f8023a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
