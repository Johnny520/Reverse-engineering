package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n6 extends u30 implements Map {
    public m6 h;

    public n6(u30 r5) {
        int r0 = r5.c;
        b(r0);
        int r2 = 0;
        if (this.c != 0) goto L7;
        if (r0 <= 0) goto L9;
        System.arraycopy(r5.a, 0, this.a, 0, r0);
        System.arraycopy(r5.b, 0, this.b, 0, r0 << 1);
        this.c = r0;
        return;
    L9:
        return;
    L7:
        if (r2 >= r0) goto L11;
        put(r5.h(r2), r5.j(r2));
        r2 = r2 + 1;
        goto L7
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h != null) goto L5;
        this.h = new m6(0, this);
    L5:
        m6 r0 = this.h;
        if (r0.a != null) goto L9;
        r0.a = new ts(r0, 0);
    L9:
        return r0.a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h != null) goto L5;
        this.h = new m6(0, this);
    L5:
        m6 r0 = this.h;
        if (r0.b != null) goto L9;
        r0.b = new ts(r0, 1);
    L9:
        return r0.b;
    }

    @Override // java.util.Map
    public final void putAll(Map r3) {
        int r0 = this.c;
        b(r3.size() + r0);
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry r02 = (Map.Entry) r32.next();
        put(r02.getKey(), r02.getValue());
        goto L4
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h != null) goto L5;
        this.h = new m6(0, this);
    L5:
        m6 r0 = this.h;
        if (r0.c != null) goto L9;
        r0.c = new vs(r0);
    L9:
        return r0.c;
    }
}
