package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.C9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0048C9 implements Iterator<String>, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public final String f176a;

    /* JADX INFO: renamed from: b */
    public int f177b;

    /* JADX INFO: renamed from: c */
    public int f178c;

    /* JADX INFO: renamed from: d */
    public int f179d;

    /* JADX INFO: renamed from: e */
    public int f180e;

    public C0048C9(String str) {
        this.f176a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f177b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f180e < 0) {
            this.f177b = 2;
            return false;
        }
        String str = this.f176a;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f178c; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f177b = 1;
                this.f180e = i;
                this.f179d = length;
                return true;
            }
        }
        i = -1;
        this.f177b = 1;
        this.f180e = i;
        this.f179d = length;
        return true;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f177b = 0;
        int i = this.f179d;
        int i2 = this.f178c;
        this.f178c = this.f180e + i;
        return this.f176a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
