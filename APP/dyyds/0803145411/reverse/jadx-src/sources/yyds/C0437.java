package yyds;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛲᲀᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0437 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f2227;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2228;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f2229;

    public /* synthetic */ C0437(int i, Object obj) {
        this.f2228 = i;
        this.f2227 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2228;
        Object obj = this.f2227;
        switch (i) {
            case 0:
                if (this.f2229 < ((AbstractC1311) obj).mo927()) {
                }
                break;
            case 1:
                if (this.f2229 < ((Object[]) obj).length) {
                }
                break;
            default:
                if (this.f2229 < ((ViewGroup) obj).getChildCount()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2228;
        Object obj = this.f2227;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f2229;
                this.f2229 = i2 + 1;
                return ((AbstractC1311) obj).get(i2);
            case 1:
                try {
                    int i3 = this.f2229;
                    this.f2229 = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f2229--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                int i4 = this.f2229;
                this.f2229 = i4 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2228) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f2227;
                int i = this.f2229 - 1;
                this.f2229 = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
