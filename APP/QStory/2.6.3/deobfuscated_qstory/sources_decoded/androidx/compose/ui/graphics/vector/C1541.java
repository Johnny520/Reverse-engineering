package androidx.compose.ui.graphics.vector;

import androidx.core.view.C2268;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import p054.InterfaceC6567;
import p123.AbstractC7408;
import p123.C7398;
import p123.C7399;
import p123.C7403;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1541 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4481 = 0;

    public C1541(C7399 c7399) {
        AbstractC7408[] abstractC7408Arr = new AbstractC7408[8];
        for (int i = 0; i < 8; i++) {
            abstractC7408Arr[i] = new C7403(this);
        }
        this.f4480 = new C7398(c7399, abstractC7408Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4481;
        Object obj = this.f4480;
        switch (i) {
            case 0:
                return ((Iterator) obj).hasNext();
            case 1:
                return ((Enumeration) obj).hasMoreElements();
            case 2:
                return ((C2268) obj).hasNext();
            default:
                return ((C7398) obj).f20066;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4481;
        Object obj = this.f4480;
        switch (i) {
            case 0:
                return (AbstractC1538) ((Iterator) obj).next();
            case 1:
                return ((Enumeration) obj).nextElement();
            case 2:
                return ((C2268) obj).next();
            default:
                return (Map.Entry) ((C7398) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4481) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException();
            default:
                ((C7398) this.f4480).remove();
                return;
        }
    }

    public C1541(Object[] objArr) {
        objArr.getClass();
        this.f4480 = new C2268(objArr);
    }

    public C1541(Enumeration enumeration) {
        this.f4480 = enumeration;
    }

    public C1541(C1540 c1540) {
        this.f4480 = c1540.f4470.iterator();
    }
}
