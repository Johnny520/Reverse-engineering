package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import io.ktor.util.C4220;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4343;
import kotlin.sequences.C5120;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2207 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Iterator f6485;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6487;

    public C2207(C4220 c4220) {
        this.f6487 = 1;
        this.f6486 = c4220;
        this.f6485 = c4220.f12712.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6487) {
        }
        return this.f6485.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6487;
        Object obj = this.f6486;
        switch (i) {
            case 0:
                Object next = this.f6485.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C2268 c2268 = viewGroup != null ? new C2268(viewGroup, 0) : null;
                if (c2268 == null || !c2268.hasNext()) {
                    while (!this.f6485.hasNext() && !arrayList.isEmpty()) {
                        this.f6485 = (Iterator) AbstractC4343.m8811(arrayList);
                        AbstractC4343.m8823(arrayList);
                    }
                } else {
                    arrayList.add(this.f6485);
                    this.f6485 = c2268;
                }
                return next;
            case 1:
                return ((C4220) obj).f12710.invoke(this.f6485.next());
            default:
                return ((C5120) obj).f14656.invoke(this.f6485.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6487) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                this.f6485.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2207(C2268 c2268) {
        this.f6487 = 0;
        this.f6486 = new ArrayList();
        this.f6485 = c2268;
    }

    public C2207(C5120 c5120) {
        this.f6487 = 2;
        this.f6486 = c5120;
        this.f6485 = c5120.f14657.iterator();
    }
}
