package p202o0;

import bsh.C0353j;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: o0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3036h extends AbstractC3029a {

    /* JADX INFO: renamed from: i */
    public final C3034f f9853i;

    /* JADX INFO: renamed from: j */
    public int f9854j;

    /* JADX INFO: renamed from: k */
    public C3038j f9855k;

    /* JADX INFO: renamed from: l */
    public int f9856l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3036h(C3034f c3034f, int i9) {
        super(i9, c3034f.f9850n);
        this.f9853i = c3034f;
        this.f9854j = c3034f.m6460f();
        this.f9856l = -1;
        m6482c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6481a() {
        if (this.f9854j != this.f9853i.m6460f()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3029a, java.util.ListIterator
    public final void add(Object obj) {
        m6481a();
        int i9 = this.f9833g;
        C3034f c3034f = this.f9853i;
        c3034f.add(i9, obj);
        this.f9833g++;
        this.f9834h = c3034f.mo6457a();
        this.f9854j = c3034f.m6460f();
        this.f9856l = -1;
        m6482c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: c */
    public final void m6482c() {
        C3034f c3034f = this.f9853i;
        Object[] objArr = c3034f.f9848l;
        if (objArr == null) {
            this.f9855k = null;
            return;
        }
        int i9 = (c3034f.f9850n - 1) & (-32);
        int i10 = this.f9833g;
        if (i10 > i9) {
            i10 = i9;
        }
        int i11 = (c3034f.f9846j / 5) + 1;
        C3038j c3038j = this.f9855k;
        if (c3038j == null) {
            this.f9855k = new C3038j(objArr, i10, i9, i11);
            return;
        }
        c3038j.f9833g = i10;
        c3038j.f9834h = i9;
        c3038j.f9859i = i11;
        if (c3038j.f9860j.length < i11) {
            c3038j.f9860j = new Object[i11];
        }
        c3038j.f9860j[0] = objArr;
        ?? r62 = i10 == i9 ? 1 : 0;
        c3038j.f9861k = r62;
        c3038j.m6484c(i10 - r62, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m6481a();
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f9833g;
        this.f9856l = i9;
        C3038j c3038j = this.f9855k;
        C3034f c3034f = this.f9853i;
        if (c3038j == null) {
            Object[] objArr = c3034f.f9849m;
            this.f9833g = i9 + 1;
            return objArr[i9];
        }
        if (c3038j.hasNext()) {
            this.f9833g++;
            return c3038j.next();
        }
        Object[] objArr2 = c3034f.f9849m;
        int i10 = this.f9833g;
        this.f9833g = i10 + 1;
        return objArr2[i10 - c3038j.f9834h];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        m6481a();
        if (!hasPrevious()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f9833g;
        this.f9856l = i9 - 1;
        C3038j c3038j = this.f9855k;
        C3034f c3034f = this.f9853i;
        if (c3038j == null) {
            Object[] objArr = c3034f.f9849m;
            int i10 = i9 - 1;
            this.f9833g = i10;
            return objArr[i10];
        }
        int i11 = c3038j.f9834h;
        if (i9 <= i11) {
            this.f9833g = i9 - 1;
            return c3038j.previous();
        }
        Object[] objArr2 = c3034f.f9849m;
        int i12 = i9 - 1;
        this.f9833g = i12;
        return objArr2[i12 - i11];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3029a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m6481a();
        int i9 = this.f9856l;
        if (i9 == -1) {
            throw new IllegalStateException();
        }
        C3034f c3034f = this.f9853i;
        c3034f.mo6458c(i9);
        int i10 = this.f9856l;
        if (i10 < this.f9833g) {
            this.f9833g = i10;
        }
        this.f9834h = c3034f.mo6457a();
        this.f9854j = c3034f.m6460f();
        this.f9856l = -1;
        m6482c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3029a, java.util.ListIterator
    public final void set(Object obj) {
        m6481a();
        int i9 = this.f9856l;
        if (i9 == -1) {
            throw new IllegalStateException();
        }
        C3034f c3034f = this.f9853i;
        c3034f.set(i9, obj);
        this.f9854j = c3034f.m6460f();
        m6482c();
    }
}
