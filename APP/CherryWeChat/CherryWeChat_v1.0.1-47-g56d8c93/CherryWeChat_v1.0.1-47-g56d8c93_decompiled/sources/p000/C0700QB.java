package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: QB */
/* JADX INFO: loaded from: classes.dex */
public final class C0700QB implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2252a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Iterator f2253b;

    public C0700QB(C2694x c2694x) {
        this.f2253b = c2694x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2253b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f2253b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C2694x c2694x = viewGroup != null ? new C2694x(7, viewGroup) : null;
        ArrayList arrayList = this.f2252a;
        if (c2694x != null && c2694x.hasNext()) {
            arrayList.add(this.f2253b);
            this.f2253b = c2694x;
            return next;
        }
        while (!this.f2253b.hasNext() && !arrayList.isEmpty()) {
            this.f2253b = (Iterator) AbstractC2453ra.m4902l0(arrayList);
            AbstractC2711xa.m5284f0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
