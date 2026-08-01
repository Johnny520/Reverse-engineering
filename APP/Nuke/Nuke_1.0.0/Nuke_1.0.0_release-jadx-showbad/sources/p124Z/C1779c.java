package p124Z;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p128a.AbstractC1785a;
import p143c3.C1904f;
import p143c3.C1906h;
import p186k.C2406C;
import p186k.C2407D;
import p186k.C2410G;
import p186k.C2411H;

/* JADX INFO: renamed from: Z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1779c implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6084d;

    /* JADX INFO: renamed from: e */
    public Object f6085e;

    /* JADX INFO: renamed from: f */
    public int f6086f;

    /* JADX INFO: renamed from: g */
    public final Object f6087g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1779c(Object obj, Map map) {
        this.f6084d = 0;
        this.f6085e = obj;
        this.f6087g = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m3184a() {
        Object objMo1h;
        C1904f c1904f = (C1904f) this.f6087g;
        if (this.f6086f == -2) {
            objMo1h = ((InterfaceC1599a) c1904f.f6474b).mo6a();
        } else {
            InterfaceC1601c interfaceC1601c = (InterfaceC1601c) c1904f.f6475c;
            Object obj = this.f6085e;
            AbstractC1665j.m2982b(obj);
            objMo1h = interfaceC1601c.mo1h(obj);
        }
        this.f6085e = objMo1h;
        this.f6086f = objMo1h == null ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6084d) {
            case 0:
                if (this.f6086f < ((Map) this.f6087g).size()) {
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (this.f6086f < 0) {
                    m3184a();
                }
                if (this.f6086f == 1) {
                }
                break;
        }
        return ((C1906h) this.f6085e).hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6084d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f6085e;
                this.f6086f++;
                Object obj2 = ((Map) this.f6087g).get(obj);
                if (obj2 != null) {
                    this.f6085e = ((C1777a) obj2).f6079b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case BuildConfig.VERSION_CODE /* 1 */:
                if (this.f6086f < 0) {
                    m3184a();
                }
                if (this.f6086f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f6085e;
                AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f6086f = -1;
                return obj3;
            case 2:
                return ((C1906h) this.f6085e).next();
            default:
                return ((C1906h) this.f6085e).next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6084d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case BuildConfig.VERSION_CODE /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i5 = this.f6086f;
                if (i5 != -1) {
                    ((C2407D) this.f6087g).f7786e.m4264h(i5);
                    this.f6086f = -1;
                    return;
                }
                return;
            default:
                int i6 = this.f6086f;
                if (i6 != -1) {
                    ((C2411H) this.f6087g).f7811e.m4291m(i6);
                    this.f6086f = -1;
                    return;
                }
                return;
        }
    }

    public C1779c(C1904f c1904f) {
        this.f6084d = 1;
        this.f6087g = c1904f;
        this.f6086f = -2;
    }

    public C1779c(C2411H c2411h) {
        this.f6084d = 3;
        this.f6087g = c2411h;
        this.f6086f = -1;
        this.f6085e = AbstractC1785a.m3252m(new C2410G(c2411h, this, null));
    }

    public C1779c(C2407D c2407d) {
        this.f6084d = 2;
        this.f6087g = c2407d;
        this.f6086f = -1;
        this.f6085e = AbstractC1785a.m3252m(new C2406C(c2407d, this, null));
    }
}
