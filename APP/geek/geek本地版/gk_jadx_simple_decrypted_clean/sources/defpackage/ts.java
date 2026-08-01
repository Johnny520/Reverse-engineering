package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ts implements Set {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ ts(m6 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Map.Entry r22 = (Map.Entry) r2;
        throw new UnsupportedOperationException();
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r6) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        m6 r0 = this.b;
        int r1 = r0.d();
        Iterator r62 = r6.iterator();
    L8:
        if (r62.hasNext() == false) goto L14;
        Map.Entry r2 = (Map.Entry) r62.next();
        Object r3 = r2.getKey();
        Object r22 = r2.getValue();
        switch(r0.d) {
            case 0: goto L12;
            default: goto L11;
        };
    L12:
        ((n6) r0.e).put(r3, r22);
        goto L8
    L11:
        ((q6) r0.e).add(r3);
        goto L8
    L14:
        if (r1 == r0.d()) goto L16;
        return true;
    L16:
        return false;
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.b.a();
        return;
    L6:
        this.b.a();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r5) {
        switch(this.a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.b.e(r5) < 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        if ((r5 instanceof Map.Entry) == false) goto L25;
        Map.Entry r52 = (Map.Entry) r5;
        Object r0 = r52.getKey();
        m6 r2 = this.b;
        int r02 = r2.e(r0);
        if (r02 < 0) goto L26;
        Object r03 = r2.b(r02, 1);
        Object r53 = r52.getValue();
        if (r03 == r53) goto L21;
        if (r03 != null) goto L19;
        return false;
    L19:
        if (r03.equals(r53) == true) goto L21;
        return false;
    L21:
        return true;
    L26:
        return false;
    L25:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r3) {
        switch(this.a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        Map r0 = this.b.c();
        Iterator r32 = r3.iterator();
    L6:
        if (r32.hasNext() == false) goto L10;
        if (r0.containsKey(r32.next()) == true) goto L6;
        return false;
    L10:
        return true;
    L12:
        Iterator r33 = r3.iterator();
    L14:
        if (r33.hasNext() == false) goto L18;
        if (contains(r33.next()) == true) goto L14;
        return false;
    L18:
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r2) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return m6.h(this, r2);
    L7:
        return m6.h(this, r2);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch(this.a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        m6 r0 = this.b;
        int r1 = r0.d() - 1;
        int r3 = 0;
    L5:
        if (r1 < 0) goto L11;
        Object r4 = r0.b(r1, 0);
        if (r4 != null) goto L9;
        int r42 = 0;
    L10:
        r3 = r3 + r42;
        r1 = r1 - 1;
        goto L5
    L9:
        r42 = r4.hashCode();
        goto L10
    L11:
        return r3;
    L12:
        m6 r02 = this.b;
        int r12 = r02.d() - 1;
        int r43 = 0;
    L13:
        if (r12 < 0) goto L22;
        Object r5 = r02.b(r12, 0);
        Object r6 = r02.b(r12, 1);
        if (r5 != null) goto L17;
        int r52 = 0;
    L18:
        if (r6 != null) goto L20;
        int r62 = 0;
    L21:
        r43 = r43 + (r52 ^ r62);
        r12 = r12 - 1;
        goto L13
    L20:
        r62 = r6.hashCode();
        goto L21
    L17:
        r52 = r5.hashCode();
        goto L18
    L22:
        return r43;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch(this.a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.b.d() != 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.b.d() != 0) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new ss(this.b, 0);
    L7:
        return new us(this.b);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r2) {
        switch(this.a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        m6 r0 = this.b;
        int r22 = r0.e(r2);
        if (r22 < 0) goto L7;
        r0.g(r22);
        return true;
    L7:
        return false;
    L10:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r4) {
        switch(this.a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        Map r0 = this.b.c();
        int r1 = r0.size();
        Iterator r42 = r4.iterator();
    L6:
        if (r42.hasNext() == false) goto L9;
        r0.remove(r42.next());
        goto L6
    L9:
        if (r1 == r0.size()) goto L11;
        return true;
    L11:
        return false;
    L14:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r5) {
        switch(this.a) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        Map r0 = this.b.c();
        int r1 = r0.size();
        Iterator r2 = r0.keySet().iterator();
    L6:
        if (r2.hasNext() == false) goto L11;
        if (r5.contains(r2.next()) == true) goto L6;
        r2.remove();
        goto L6
    L11:
        if (r1 == r0.size()) goto L13;
        return true;
    L13:
        return false;
    L16:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.d();
    L7:
        return this.b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.i(r3, 0);
    L7:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch(this.a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        m6 r0 = this.b;
        int r1 = r0.d();
        Object[] r2 = new Object[r1];
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L7;
        r2[r4] = r0.b(r4, 0);
        r4 = r4 + 1;
        goto L5
    L7:
        return r2;
    L9:
        throw new UnsupportedOperationException();
    }
}
