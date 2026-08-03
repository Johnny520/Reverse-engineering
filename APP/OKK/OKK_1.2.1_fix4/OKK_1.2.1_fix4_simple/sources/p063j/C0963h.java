package p063j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: j.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0963h implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0956a f3420b;

    public /* synthetic */ C0963h(C0956a r1, int r2) {
        this.f3419a = r2;
        this.f3420b = r1;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r2) {
        switch(this.f3419a) {
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
    public final boolean addAll(Collection r5) {
        switch(this.f3419a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C0956a r02 = this.f3420b;
        int r1 = r02.m2292d();
        Iterator r52 = r5.iterator();
    L8:
        if (r52.hasNext() == false) goto L11;
        Map.Entry r2 = (Map.Entry) r52.next();
        r02.m2295g(r2.getKey(), r2.getValue());
        goto L8
    L11:
        if (r1 == r02.m2292d()) goto L13;
        return true;
    L13:
        return false;
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch(this.f3419a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f3420b.m2289a();
        return;
    L6:
        this.f3420b.m2289a();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r5) {
        switch(this.f3419a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.f3420b.m2293e(r5) < 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        if ((r5 instanceof Map.Entry) == false) goto L25;
        Map.Entry r52 = (Map.Entry) r5;
        Object r02 = r52.getKey();
        C0956a r2 = this.f3420b;
        int r03 = r2.m2293e(r02);
        if (r03 < 0) goto L26;
        Object r04 = r2.m2290b(r03, 1);
        Object r53 = r52.getValue();
        if (r04 == r53) goto L21;
        if (r04 != null) goto L19;
        return false;
    L19:
        if (r04.equals(r53) == true) goto L21;
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
        switch(this.f3419a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        Map r02 = this.f3420b.m2291c();
        Iterator r32 = r3.iterator();
    L6:
        if (r32.hasNext() == false) goto L10;
        if (r02.containsKey(r32.next()) == true) goto L6;
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
        switch(this.f3419a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return C0956a.m2288j(this, r2);
    L7:
        return C0956a.m2288j(this, r2);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch(this.f3419a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        C0956a r02 = this.f3420b;
        int r1 = r02.m2292d() - 1;
        int r3 = 0;
    L5:
        if (r1 < 0) goto L11;
        Object r4 = r02.m2290b(r1, 0);
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
        C0956a r03 = this.f3420b;
        int r12 = r03.m2292d() - 1;
        int r43 = 0;
    L13:
        if (r12 < 0) goto L22;
        Object r5 = r03.m2290b(r12, 0);
        Object r6 = r03.m2290b(r12, 1);
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
        switch(this.f3419a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.f3420b.m2292d() != 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.f3420b.m2292d() != 0) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch(this.f3419a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0962g(this.f3420b, 0);
    L7:
        return new C0964i(this.f3420b);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r2) {
        switch(this.f3419a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        C0956a r02 = this.f3420b;
        int r22 = r02.m2293e(r2);
        if (r22 < 0) goto L7;
        r02.m2296h(r22);
        return true;
    L7:
        return false;
    L10:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r4) {
        switch(this.f3419a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        Map r02 = this.f3420b.m2291c();
        int r1 = r02.size();
        Iterator r42 = r4.iterator();
    L6:
        if (r42.hasNext() == false) goto L9;
        r02.remove(r42.next());
        goto L6
    L9:
        if (r1 == r02.size()) goto L11;
        return true;
    L11:
        return false;
    L14:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r5) {
        switch(this.f3419a) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        Map r02 = this.f3420b.m2291c();
        int r1 = r02.size();
        Iterator r2 = r02.keySet().iterator();
    L6:
        if (r2.hasNext() == false) goto L11;
        if (r5.contains(r2.next()) == true) goto L6;
        r2.remove();
        goto L6
    L11:
        if (r1 == r02.size()) goto L13;
        return true;
    L13:
        return false;
    L16:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch(this.f3419a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f3420b.m2292d();
    L7:
        return this.f3420b.m2292d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r3) {
        switch(this.f3419a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f3420b.m2298k(0, r3);
    L7:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch(this.f3419a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C0956a r02 = this.f3420b;
        int r1 = r02.m2292d();
        Object[] r2 = new Object[r1];
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L7;
        r2[r4] = r02.m2290b(r4, 0);
        r4 = r4 + 1;
        goto L5
    L7:
        return r2;
    L9:
        throw new UnsupportedOperationException();
    }
}
