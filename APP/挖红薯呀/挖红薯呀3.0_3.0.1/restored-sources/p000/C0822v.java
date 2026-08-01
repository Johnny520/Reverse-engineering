package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class C0822v implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6359d = 0;

    /* JADX INFO: renamed from: e */
    public int f6360e;

    /* JADX INFO: renamed from: f */
    public final Object f6361f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0822v(Object[] objArr) {
        objArr.getClass();
        this.f6361f = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6359d;
        Object obj = this.f6361f;
        switch (i) {
            case 0:
                if (this.f6360e < ((AbstractC0945y) obj).mo6a()) {
                }
                break;
            default:
                if (this.f6360e < ((Object[]) obj).length) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6359d;
        Object obj = this.f6361f;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C0921xc.m5132m();
                    return null;
                }
                int i2 = this.f6360e;
                this.f6360e = i2 + 1;
                return ((AbstractC0945y) obj).get(i2);
            default:
                try {
                    int i3 = this.f6360e;
                    this.f6360e = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f6360e--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6359d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0822v(AbstractC0945y abstractC0945y) {
        this.f6361f = abstractC0945y;
    }
}
