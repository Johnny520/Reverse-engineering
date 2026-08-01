package p061L2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p143c3.C1900b;

/* JADX INFO: renamed from: L2.b */
/* JADX INFO: loaded from: classes.dex */
public class C0962b implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3031d = 0;

    /* JADX INFO: renamed from: e */
    public int f3032e;

    /* JADX INFO: renamed from: f */
    public final Object f3033f;

    public C0962b(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        this.f3033f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3031d) {
            case 0:
                return this.f3032e < ((AbstractC0965e) this.f3033f).mo1974a();
            case BuildConfig.VERSION_CODE /* 1 */:
                return this.f3032e < ((Object[]) this.f3033f).length;
            default:
                Iterator it = (Iterator) this.f3033f;
                while (this.f3032e > 0 && it.hasNext()) {
                    it.next();
                    this.f3032e--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3031d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0965e abstractC0965e = (AbstractC0965e) this.f3033f;
                int i5 = this.f3032e;
                this.f3032e = i5 + 1;
                return abstractC0965e.get(i5);
            case BuildConfig.VERSION_CODE /* 1 */:
                try {
                    Object[] objArr = (Object[]) this.f3033f;
                    int i6 = this.f3032e;
                    this.f3032e = i6 + 1;
                    return objArr[i6];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    this.f3032e--;
                    throw new NoSuchElementException(e5.getMessage());
                }
            default:
                Iterator it = (Iterator) this.f3033f;
                while (this.f3032e > 0 && it.hasNext()) {
                    it.next();
                    this.f3032e--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3031d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case BuildConfig.VERSION_CODE /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0962b(AbstractC0965e abstractC0965e) {
        this.f3033f = abstractC0965e;
    }

    public C0962b(C1900b c1900b) {
        this.f3033f = c1900b.f6466a.iterator();
        this.f3032e = c1900b.f6467b;
    }
}
