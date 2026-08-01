package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes.dex */
public class C0317i implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2320a = 0;

    /* JADX INFO: renamed from: b */
    public int f2321b;

    /* JADX INFO: renamed from: c */
    public final Object f2322c;

    public C0317i(Object[] objArr) {
        AbstractC0346ip.m1503o("array", objArr);
        this.f2322c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2320a) {
            case Base64.DEFAULT /* 0 */:
                if (this.f2321b < ((AbstractC0430l) this.f2322c).mo1236a()) {
                }
                break;
            default:
                if (this.f2321b < ((Object[]) this.f2322c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2320a) {
            case Base64.DEFAULT /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0430l abstractC0430l = (AbstractC0430l) this.f2322c;
                int i = this.f2321b;
                this.f2321b = i + 1;
                return abstractC0430l.get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2322c;
                    int i2 = this.f2321b;
                    this.f2321b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f2321b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2320a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0317i(AbstractC0430l abstractC0430l) {
        this.f2322c = abstractC0430l;
    }
}
