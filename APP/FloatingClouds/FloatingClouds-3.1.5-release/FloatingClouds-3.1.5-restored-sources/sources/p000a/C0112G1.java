package p000a;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0112G1 implements Iterator, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f376a = 1;

    /* JADX INFO: renamed from: b */
    public int f377b;

    /* JADX INFO: renamed from: c */
    public final Object f378c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0112G1(Object[] objArr) {
        C0631i9.m1482e(objArr, "array");
        this.f378c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f376a) {
            case 0:
                if (this.f377b < ((Object[]) this.f378c).length) {
                }
                break;
            default:
                if (this.f377b < ((ViewGroup) this.f378c).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f376a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f378c;
                    int i = this.f377b;
                    this.f377b = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f377b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                int i2 = this.f377b;
                this.f377b = i2 + 1;
                View childAt = ((ViewGroup) this.f378c).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f376a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f377b - 1;
                this.f377b = i;
                ((ViewGroup) this.f378c).removeViewAt(i);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0112G1(ViewGroup viewGroup) {
        this.f378c = viewGroup;
    }
}
