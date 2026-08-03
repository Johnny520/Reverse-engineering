package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: pq */
/* JADX INFO: loaded from: classes.dex */
public final class C2383pq extends AbstractSet implements Set, InterfaceC0588Nm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8381a;

    /* JADX INFO: renamed from: b */
    public final C2332oq f8382b;

    public /* synthetic */ C2383pq(C2332oq r1, int r2) {
        this.f8381a = r2;
        this.f8382b = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r2) {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Map.Entry r22 = (Map.Entry) r2;
        throw new UnsupportedOperationException();
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r1) {
        switch(this.f8381a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException();
    L7:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f8382b.clear();
        return;
    L6:
        this.f8382b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r4) {
        switch(this.f8381a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f8382b.containsKey(r4);
    L7:
        if ((r4 instanceof Map.Entry) == false) goto L14;
        Map.Entry r42 = (Map.Entry) r4;
        C2332oq r0 = this.f8382b;
        r0.getClass();
        int r2 = r0.m4732e(r42.getKey());
        if (r2 >= 0) goto L13;
        return false;
    L13:
        return AbstractC0585Nj.m1134a(r0.f8182b[r2], r42.getValue());
    L14:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection r6) {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C2332oq r0 = this.f8382b;
        r0.getClass();
        Iterator r62 = r6.iterator();
    L8:
        if (r62.hasNext() == false) goto L17;
        Object r1 = r62.next();
        if (r1 == null) goto L29;
        Map.Entry r12 = (Map.Entry) r1;     // Catch: ClassCastException -> L19
        int r3 = r0.m4732e(r12.getKey());     // Catch: ClassCastException -> L19
        if (r3 >= 0) goto L14;
        boolean r13 = false;
    L15:
        if (r13 == true) goto L8;
        return false;
    L14:
        r13 = AbstractC0585Nj.m1134a(r0.f8182b[r3], r12.getValue());     // Catch: ClassCastException -> L19
    L28:
        return false;
    L29:
        return false;
    L17:
        return true;
    L5:
        return super.containsAll(r6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch(this.f8381a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f8382b.isEmpty();
    L7:
        return this.f8382b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C2332oq r0 = this.f8382b;
        r0.getClass();
        return new C2203lq(r0, 1);
    L6:
        C2332oq r02 = this.f8382b;
        r02.getClass();
        return new C2203lq(r02, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r5) {
        switch(this.f8381a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        C2332oq r0 = this.f8382b;
        r0.m4729b();
        int r52 = r0.m4732e(r5);
        if (r52 >= 0) goto L7;
        return false;
    L7:
        r0.m4735h(r52);
        return true;
    L10:
        if ((r5 instanceof Map.Entry) == false) goto L21;
        Map.Entry r53 = (Map.Entry) r5;
        C2332oq r02 = this.f8382b;
        r02.m4729b();
        int r2 = r02.m4732e(r53.getKey());
        if (r2 >= 0) goto L16;
        return false;
    L16:
        if (AbstractC0585Nj.m1134a(r02.f8182b[r2], r53.getValue()) == false) goto L23;
        r02.m4735h(r2);
        return true;
    L23:
        return false;
    L21:
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r2) {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f8382b.m4729b();
        return super.removeAll(r2);
    L6:
        this.f8382b.m4729b();
        return super.removeAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r2) {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f8382b.m4729b();
        return super.retainAll(r2);
    L6:
        this.f8382b.m4729b();
        return super.retainAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch(this.f8381a) {
            case 0: goto L6;
            default: goto L7;
        };
    L7:
        return this.f8382b.f8189i;
    L6:
        return this.f8382b.f8189i;
    }
}
