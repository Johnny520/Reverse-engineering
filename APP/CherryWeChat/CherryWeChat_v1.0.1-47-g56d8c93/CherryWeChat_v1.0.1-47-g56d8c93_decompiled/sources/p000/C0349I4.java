package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: I4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349I4 implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f1170a;

    /* JADX INFO: renamed from: b */
    public int f1171b;

    /* JADX INFO: renamed from: c */
    public boolean f1172c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1173d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1174e;

    public C0349I4(int i) {
        this.f1170a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1171b < this.f1170a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM5002f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f1171b;
        switch (this.f1173d) {
            case 0:
                objM5002f = ((C0521M4) this.f1174e).m5002f(i);
                break;
            case 1:
                objM5002f = ((C0521M4) this.f1174e).m5003j(i);
                break;
            default:
                objM5002f = ((C0607O4) this.f1174e).f1946b[i];
                break;
        }
        this.f1171b++;
        this.f1172c = true;
        return objM5002f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1172c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f1171b - 1;
        this.f1171b = i;
        switch (this.f1173d) {
            case 0:
                ((C0521M4) this.f1174e).mo4h(i);
                break;
            case 1:
                ((C0521M4) this.f1174e).mo4h(i);
                break;
            default:
                ((C0607O4) this.f1174e).m1186a(i);
                break;
        }
        this.f1170a--;
        this.f1172c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0349I4(C0607O4 c0607o4) {
        this(c0607o4.f1947c);
        this.f1173d = 2;
        this.f1174e = c0607o4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0349I4(C0521M4 c0521m4, int i) {
        this(c0521m4.f8818c);
        this.f1173d = i;
        switch (i) {
            case 1:
                this.f1174e = c0521m4;
                this(c0521m4.f8818c);
                break;
            default:
                this.f1174e = c0521m4;
                break;
        }
    }
}
