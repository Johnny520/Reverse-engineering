package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes.dex */
public class C0317i implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2290a = 0;

    /* JADX INFO: renamed from: b */
    public int f2291b;

    /* JADX INFO: renamed from: c */
    public final Object f2292c;

    public C0317i(Object[] objArr) {
        AbstractC0493mp.m1857g("array", objArr);
        this.f2292c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2290a) {
            case Base64.DEFAULT /* 0 */:
                if (this.f2291b < ((AbstractC0430l) this.f2292c).mo1640a()) {
                }
                break;
            default:
                if (this.f2291b < ((Object[]) this.f2292c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2290a) {
            case Base64.DEFAULT /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0430l abstractC0430l = (AbstractC0430l) this.f2292c;
                int i = this.f2291b;
                this.f2291b = i + 1;
                return abstractC0430l.get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2292c;
                    int i2 = this.f2291b;
                    this.f2291b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f2291b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2290a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0317i(AbstractC0430l abstractC0430l) {
        this.f2292c = abstractC0430l;
    }
}
