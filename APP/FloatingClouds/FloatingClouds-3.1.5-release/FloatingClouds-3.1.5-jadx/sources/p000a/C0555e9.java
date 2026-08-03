package p000a;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.e9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0555e9 extends AbstractC0517c9 {

    /* JADX INFO: renamed from: a */
    public final int f2093a;

    /* JADX INFO: renamed from: b */
    public final int f2094b;

    /* JADX INFO: renamed from: c */
    public boolean f2095c;

    /* JADX INFO: renamed from: d */
    public int f2096d;

    public C0555e9(int i, int i2, int i3) {
        this.f2093a = i3;
        this.f2094b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f2095c = z;
        this.f2096d = z ? i : i2;
    }

    @Override // p000a.AbstractC0517c9
    /* JADX INFO: renamed from: a */
    public final int mo1278a() {
        int i = this.f2096d;
        if (i != this.f2094b) {
            this.f2096d = this.f2093a + i;
            return i;
        }
        if (!this.f2095c) {
            throw new NoSuchElementException();
        }
        this.f2095c = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2095c;
    }
}
