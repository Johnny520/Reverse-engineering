package p036T0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0339b implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final int f660a;

    /* JADX INFO: renamed from: b */
    public final int f661b;

    /* JADX INFO: renamed from: c */
    public boolean f662c;

    /* JADX INFO: renamed from: d */
    public int f663d;

    public C0339b(int i2, int i3, int i4) {
        this.f660a = i4;
        this.f661b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f662c = z2;
        this.f663d = z2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m757a() {
        int i2 = this.f663d;
        if (i2 != this.f661b) {
            this.f663d = this.f660a + i2;
        } else {
            if (!this.f662c) {
                throw new NoSuchElementException();
            }
            this.f662c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f662c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m757a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
