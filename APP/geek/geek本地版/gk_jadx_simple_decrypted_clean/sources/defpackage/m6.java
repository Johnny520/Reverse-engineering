package defpackage;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m6 {
    public ts a;
    public ts b;
    public vs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m6(int r1, Object r2) {
        this.d = r1;
        this.e = r2;
    }

    public static boolean h(Set r2, Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof Set) == false) goto L13;
        Set r32 = (Set) r3;
        if (r2.size() != r32.size()) goto L19;
        if (r2.containsAll(r32) == false) goto L20;
        return true;
    L20:
        return false;
    L19:
        return false;
    L21:
        return false;
    L13:
        return false;
    }

    public final void a() {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((q6) this.e).clear();
        return;
    L6:
        ((n6) this.e).clear();
    }

    public final Object b(int r2, int r3) {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((q6) this.e).b[r2];
    L7:
        return ((n6) this.e).b[(r2 << 1) + r3];
    }

    public final Map c() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("not a map");
    L7:
        return (n6) this.e;
    }

    public final int d() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((q6) this.e).c;
    L7:
        return ((n6) this.e).c;
    }

    public final int e(Object r3) {
        switch(this.d) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        q6 r0 = (q6) this.e;
        if (r3 != null) goto L8;
        return r0.d();
    L8:
        return r0.c(r3.hashCode(), r3);
    L10:
        return ((n6) this.e).e(r3);
    }

    public final int f(Object r3) {
        switch(this.d) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        q6 r0 = (q6) this.e;
        if (r3 != null) goto L8;
        return r0.d();
    L8:
        return r0.c(r3.hashCode(), r3);
    L10:
        return ((n6) this.e).g(r3);
    }

    public final void g(int r2) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((q6) this.e).e(r2);
        return;
    L6:
        ((n6) this.e).i(r2);
    }

    public final Object[] i(Object[] r4, int r5) {
        int r0 = d();
        if (r4.length >= r0) goto L5;
        r4 = (Object[]) Array.newInstance(r4.getClass().getComponentType(), r0);
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L9;
        r4[r1] = b(r1, r5);
        r1 = r1 + 1;
        goto L6
    L9:
        if (r4.length <= r0) goto L11;
        r4[r0] = null;
    L11:
        return r4;
    }
}
