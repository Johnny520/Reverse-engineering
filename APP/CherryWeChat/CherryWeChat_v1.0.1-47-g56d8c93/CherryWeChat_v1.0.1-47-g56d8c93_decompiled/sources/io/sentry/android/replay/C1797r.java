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

    public C1797r(C1798s c1798s) {
        this.f6518a = c1798s;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        Iterator it = this.f6518a.f6521c.iterator();
        while (it.hasNext()) {
            ((InterfaceC1781e) it.next()).mo3939d(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        for (InterfaceC1781e interfaceC1781e : this.f6518a.f6521c) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                interfaceC1781e.mo3939d((View) it.next(), true);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        View view = (View) super.remove(i);
        Iterator it = this.f6518a.f6521c.iterator();
        while (it.hasNext()) {
            ((InterfaceC1781e) it.next()).mo3939d(view, false);
        }
        return view;
    }
}
