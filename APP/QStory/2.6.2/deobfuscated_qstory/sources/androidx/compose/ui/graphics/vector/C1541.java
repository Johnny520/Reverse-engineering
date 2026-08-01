package androidx.compose.ui.graphics.vector;

import androidx.core.view.C2268;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import p054.InterfaceC6566;
import p123.AbstractC7407;
import p123.C7397;
import p123.C7398;
import p123.C7402;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1541 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4480 = 0;

    public C1541(C7398 c7398) {
        AbstractC7407[] abstractC7407Arr = new AbstractC7407[8];
        for (int i = 0; i < 8; i++) {
            abstractC7407Arr[i] = new C7402(this);
        }
        this.f4479 = new C7397(c7398, abstractC7407Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4480;
        Object obj = this.f4479;
        switch (i) {
            case 0:
                return ((Iterator) obj).hasNext();
            case 1:
                return ((Enumeration) obj).hasMoreElements();
            case 2:
                return ((C2268) obj).hasNext();
            default:
                return ((C7397) obj).f20071;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4480;
        Object obj = this.f4479;
        switch (i) {
            case 0:
                return (AbstractC1538) ((Iterator) obj).next();
            case 1:
                return ((Enumeration) obj).nextElement();
            case 2:
                return ((C2268) obj).next();
            default:
                return (Map.Entry) ((C7397) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4480) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException();
            default:
                ((C7397) this.f4479).remove();
                return;
        }
    }

    public C1541(Object[] objArr) {
        objArr.getClass();
        this.f4479 = new C2268(objArr);
    }

    public C1541(Enumeration enumeration) {
        this.f4479 = enumeration;
    }

    public C1541(C1540 c1540) {
        this.f4479 = c1540.f4469.iterator();
    }
}
