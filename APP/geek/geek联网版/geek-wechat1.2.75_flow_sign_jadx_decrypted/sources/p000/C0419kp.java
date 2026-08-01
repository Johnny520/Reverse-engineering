package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kp */
/* JADX INFO: loaded from: classes.dex */
public final class C0419kp implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f2866a;

    /* JADX INFO: renamed from: b */
    public final int f2867b;

    /* JADX INFO: renamed from: c */
    public boolean f2868c;

    /* JADX INFO: renamed from: d */
    public int f2869d;

    public C0419kp(int i, int i2, int i3) {
        this.f2866a = i3;
        this.f2867b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f2868c = z;
        this.f2869d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2868c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2869d;
        if (i != this.f2867b) {
            this.f2869d = this.f2866a + i;
        } else {
            if (!this.f2868c) {
                throw new NoSuchElementException();
            }
            this.f2868c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
