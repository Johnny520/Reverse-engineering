package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: QB */
/* JADX INFO: loaded from: classes.dex */
public final class C0700QB implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2252a;

    /* JADX INFO: renamed from: b */
    public Iterator f2253b;

    public C0700QB(C2694x r2) {
        this.f2252a = new ArrayList();
        this.f2253b = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2253b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object r0 = this.f2253b.next();
        View r1 = (View) r0;
        C2694x r3 = null;
        if ((r1 instanceof ViewGroup) == false) goto L5;
        ViewGroup r12 = (ViewGroup) r1;
    L6:
        if (r12 == null) goto L8;
        r3 = new C2694x(7, r12);
    L8:
        ArrayList r13 = this.f2252a;
        if (r3 == null) goto L15;
        if (r3.hasNext() == false) goto L15;
        r13.add(this.f2253b);
        this.f2253b = r3;
        return r0;
    L15:
        if (this.f2253b.hasNext() == true) goto L19;
        if (r13.isEmpty() == true) goto L19;
        this.f2253b = (Iterator) AbstractC2453ra.m4902l0(r13);
        AbstractC2711xa.m5284f0(r13);
    L19:
        return r0;
    L5:
        r12 = null;
        goto L6
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
