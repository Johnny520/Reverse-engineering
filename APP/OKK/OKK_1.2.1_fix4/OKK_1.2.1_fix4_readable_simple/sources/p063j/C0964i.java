package p063j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0964i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f3421a;

    /* JADX INFO: renamed from: b */
    public int f3422b;

    /* JADX INFO: renamed from: c */
    public boolean f3423c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0956a f3424d;

    public C0964i(C0956a r2) {
        this.f3424d = r2;
        this.f3423c = false;
        this.f3421a = r2.m2292d() - 1;
        this.f3422b = -1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (this.f3423c == false) goto L20;
        if ((r5 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        Map.Entry r52 = (Map.Entry) r5;
        Object r02 = r52.getKey();
        int r2 = this.f3422b;
        C0956a r3 = this.f3424d;
        Object r22 = r3.m2290b(r2, 0);
        if (r02 == r22) goto L12;
        if (r02 != null) goto L11;
        return false;
    L11:
        if (r02.equals(r22) == true) goto L12;
        return false;
    L12:
        Object r53 = r52.getValue();
        Object r03 = r3.m2290b(this.f3422b, 1);
        if (r53 == r03) goto L18;
        if (r53 != null) goto L16;
        return false;
    L16:
        if (r53.equals(r03) == true) goto L18;
        return false;
    L18:
        return true;
    L20:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f3423c == false) goto L7;
        int r02 = this.f3422b;
        return this.f3424d.m2290b(r02, 0);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f3423c == false) goto L7;
        int r02 = this.f3422b;
        return this.f3424d.m2290b(r02, 1);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3422b >= this.f3421a) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.f3423c == false) goto L14;
        int r02 = this.f3422b;
        C0956a r1 = this.f3424d;
        int r2 = 0;
        Object r03 = r1.m2290b(r02, 0);
        Object r12 = r1.m2290b(this.f3422b, 1);
        if (r03 != null) goto L7;
        int r04 = 0;
    L8:
        if (r12 == null) goto L12;
        r2 = r12.hashCode();
    L12:
        return r04 ^ r2;
    L7:
        r04 = r03.hashCode();
        goto L8
    L14:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.f3422b++;
        this.f3423c = true;
        return this;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3423c == false) goto L7;
        this.f3424d.m2296h(this.f3422b);
        this.f3422b--;
        this.f3421a--;
        this.f3423c = false;
        return;
    L7:
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r3) {
        if (this.f3423c == false) goto L7;
        return this.f3424d.m2297i(this.f3422b, r3);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
