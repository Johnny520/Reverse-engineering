package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import io.ktor.util.C4221;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.sequences.C5121;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2207 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Iterator f6486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6487;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6488;

    public C2207(C4221 c4221) {
        this.f6488 = 1;
        this.f6487 = c4221;
        this.f6486 = c4221.f12716.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6488) {
        }
        return this.f6486.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6488;
        Object obj = this.f6487;
        switch (i) {
            case 0:
                Object next = this.f6486.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C2268 c2268 = viewGroup != null ? new C2268(viewGroup, 0) : null;
                if (c2268 == null || !c2268.hasNext()) {
                    while (!this.f6486.hasNext() && !arrayList.isEmpty()) {
                        this.f6486 = (Iterator) AbstractC4344.m8808(arrayList);
                        AbstractC4344.m8792(arrayList);
                    }
                } else {
                    arrayList.add(this.f6486);
                    this.f6486 = c2268;
                }
                return next;
            case 1:
                return ((C4221) obj).f12714.invoke(this.f6486.next());
            default:
                return ((C5121) obj).f14656.invoke(this.f6486.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6488) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                this.f6486.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2207(C2268 c2268) {
        this.f6488 = 0;
        this.f6487 = new ArrayList();
        this.f6486 = c2268;
    }

    public C2207(C5121 c5121) {
        this.f6488 = 2;
        this.f6487 = c5121;
        this.f6486 = c5121.f14657.iterator();
    }
}
