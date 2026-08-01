package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class us implements Iterator, Map.Entry {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ m6 d;

    public us(m6 r2) {
        this.d = r2;
        this.c = false;
        this.a = r2.d() - 1;
        this.b = -1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (this.c == false) goto L23;
        if ((r5 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        Map.Entry r52 = (Map.Entry) r5;
        Object r0 = r52.getKey();
        int r2 = this.b;
        m6 r3 = this.d;
        Object r22 = r3.b(r2, 0);
        if (r0 == r22) goto L14;
        if (r0 != null) goto L11;
    L13:
        return false;
    L11:
        if (r0.equals(r22) == false) goto L13;
    L14:
        Object r53 = r52.getValue();
        Object r02 = r3.b(this.b, 1);
        if (r53 == r02) goto L21;
        if (r53 != null) goto L18;
    L20:
        return false;
    L18:
        if (r53.equals(r02) == false) goto L20;
    L21:
        return true;
    L23:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c == false) goto L7;
        int r0 = this.b;
        return this.d.b(r0, 0);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c == false) goto L7;
        int r0 = this.b;
        return this.d.b(r0, 1);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b >= this.a) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.c == false) goto L14;
        int r0 = this.b;
        m6 r1 = this.d;
        int r2 = 0;
        Object r02 = r1.b(r0, 0);
        Object r12 = r1.b(this.b, 1);
        if (r02 != null) goto L7;
        int r03 = 0;
    L8:
        if (r12 == null) goto L12;
        r2 = r12.hashCode();
    L12:
        return r03 ^ r2;
    L7:
        r03 = r02.hashCode();
        goto L8
    L14:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.b++;
        this.c = true;
        return this;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c == false) goto L7;
        this.d.g(this.b);
        this.b--;
        this.a--;
        this.c = false;
        return;
    L7:
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r4) {
        if (this.c == false) goto L11;
        int r0 = this.b;
        m6 r1 = this.d;
        switch(r1.d) {
            case 0: goto L8;
            default: goto L7;
        };
    L8:
        int r02 = (r0 << 1) + 1;
        Object[] r12 = ((n6) r1.e).b;
        Object r2 = r12[r02];
        r12[r02] = r4;
        return r2;
    L7:
        throw new UnsupportedOperationException("not a map");
    L11:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
