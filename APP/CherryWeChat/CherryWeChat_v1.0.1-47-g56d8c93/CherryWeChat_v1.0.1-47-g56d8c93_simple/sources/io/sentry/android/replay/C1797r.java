package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.replay.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1797r extends ArrayList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1798s f6518a;

    public C1797r(C1798s r1) {
        this.f6518a = r1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r4) {
        View r42 = (View) r4;
        Iterator r0 = this.f6518a.f6521c.iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        ((InterfaceC1781e) r0.next()).mo3939d(r42, true);
        goto L4
    L7:
        return super.add(r42);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r6) {
        Iterator r0 = this.f6518a.f6521c.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        InterfaceC1781e r1 = (InterfaceC1781e) r0.next();
        Iterator r2 = r6.iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        r1.mo3939d((View) r2.next(), true);
        goto L7
    L10:
        return super.addAll(r6);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof View) == true) goto L7;
        return false;
    L7:
        return super.contains((View) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof View) == true) goto L7;
        return -1;
    L7:
        return super.indexOf((View) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof View) == true) goto L7;
        return -1;
    L7:
        return super.lastIndexOf((View) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof View) == true) goto L7;
        return false;
    L7:
        return super.remove((View) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int r4) {
        View r42 = (View) super.remove(r4);
        Iterator r0 = this.f6518a.f6521c.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC1781e) r0.next()).mo3939d(r42, false);
        goto L4
    L6:
        return r42;
    }
}
