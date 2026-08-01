package p065M2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: M2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1000c implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C1002e f3091d;

    /* JADX INFO: renamed from: e */
    public int f3092e;

    /* JADX INFO: renamed from: f */
    public int f3093f;

    /* JADX INFO: renamed from: g */
    public int f3094g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3095h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1000c(C1002e c1002e, int i5) {
        this.f3095h = i5;
        AbstractC1665j.m2985e(c1002e, "map");
        this.f3091d = c1002e;
        this.f3093f = -1;
        this.f3094g = c1002e.f3107k;
        m2066b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2065a() {
        if (this.f3091d.f3107k != this.f3094g) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2066b() {
        while (true) {
            int i5 = this.f3092e;
            C1002e c1002e = this.f3091d;
            if (i5 >= c1002e.f3105i || c1002e.f3102f[i5] >= 0) {
                return;
            } else {
                this.f3092e = i5 + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3092e < this.f3091d.f3105i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3095h) {
            case 0:
                m2065a();
                int i5 = this.f3092e;
                C1002e c1002e = this.f3091d;
                if (i5 >= c1002e.f3105i) {
                    throw new NoSuchElementException();
                }
                this.f3092e = i5 + 1;
                this.f3093f = i5;
                C1001d c1001d = new C1001d(c1002e, i5);
                m2066b();
                return c1001d;
            case BuildConfig.VERSION_CODE /* 1 */:
                m2065a();
                int i6 = this.f3092e;
                C1002e c1002e2 = this.f3091d;
                if (i6 >= c1002e2.f3105i) {
                    throw new NoSuchElementException();
                }
                this.f3092e = i6 + 1;
                this.f3093f = i6;
                Object obj = c1002e2.f3100d[i6];
                m2066b();
                return obj;
            default:
                m2065a();
                int i7 = this.f3092e;
                C1002e c1002e3 = this.f3091d;
                if (i7 >= c1002e3.f3105i) {
                    throw new NoSuchElementException();
                }
                this.f3092e = i7 + 1;
                this.f3093f = i7;
                Object[] objArr = c1002e3.f3101e;
                AbstractC1665j.m2982b(objArr);
                Object obj2 = objArr[this.f3093f];
                m2066b();
                return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        m2065a();
        if (this.f3093f == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C1002e c1002e = this.f3091d;
        c1002e.m2069b();
        c1002e.m2078k(this.f3093f);
        this.f3093f = -1;
        this.f3094g = c1002e.f3107k;
    }
}
