package androidx.compose.p001ui.graphics.vector;

import androidx.core.view.C3101;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import p070.InterfaceC7396;
import p139.AbstractC8237;
import p139.C8227;
import p139.C8228;
import p139.C8232;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2376 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4826 = 0;

    public C2376(C8228 c8228) {
        AbstractC8237[] abstractC8237Arr = new AbstractC8237[8];
        for (int i = 0; i < 8; i++) {
            abstractC8237Arr[i] = new C8232(this);
        }
        this.f4825 = new C8227(c8228, abstractC8237Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4826;
        Object obj = this.f4825;
        switch (i) {
            case 0:
                return ((Iterator) obj).hasNext();
            case 1:
                return ((Enumeration) obj).hasMoreElements();
            case 2:
                return ((C3101) obj).hasNext();
            default:
                return ((C8227) obj).f20411;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4826;
        Object obj = this.f4825;
        switch (i) {
            case 0:
                return (AbstractC2373) ((Iterator) obj).next();
            case 1:
                return ((Enumeration) obj).nextElement();
            case 2:
                return ((C3101) obj).next();
            default:
                return (Map.Entry) ((C8227) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4826) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException();
            default:
                ((C8227) this.f4825).remove();
                return;
        }
    }

    public C2376(Object[] objArr) {
        objArr.getClass();
        this.f4825 = new C3101(objArr);
    }

    public C2376(Enumeration enumeration) {
        this.f4825 = enumeration;
    }

    public C2376(C2375 c2375) {
        this.f4825 = c2375.f4815.iterator();
    }
}
