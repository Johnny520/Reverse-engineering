package p063j;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0956a {

    /* JADX INFO: renamed from: a */
    public C0963h f3386a;

    /* JADX INFO: renamed from: b */
    public C0963h f3387b;

    /* JADX INFO: renamed from: c */
    public C0965j f3388c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3389d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3390e;

    public /* synthetic */ C0956a(int r1, Object r2) {
        this.f3389d = r1;
        this.f3390e = r2;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2288j(Set r4, Object r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Set) == false) goto L15;
        Set r52 = (Set) r5;
        if (r4.size() != r52.size()) goto L14;
        if (r4.containsAll(r52) == false) goto L14;
        return true;
    L14:
        return false;
    L15:
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m2289a() {
        switch(this.f3389d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0958c) this.f3390e).clear();
        return;
    L6:
        ((C0957b) this.f3390e).clear();
    }

    /* JADX INFO: renamed from: b */
    public final Object m2290b(int r2, int r3) {
        switch(this.f3389d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0958c) this.f3390e).f3399b[r2];
    L7:
        return ((C0957b) this.f3390e).f3431b[(r2 << 1) + r3];
    }

    /* JADX INFO: renamed from: c */
    public final Map m2291c() {
        switch(this.f3389d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("not a map");
    L7:
        return (C0957b) this.f3390e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2292d() {
        switch(this.f3389d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0958c) this.f3390e).f3400c;
    L7:
        return ((C0957b) this.f3390e).f3432c;
    }

    /* JADX INFO: renamed from: e */
    public final int m2293e(Object r2) {
        switch(this.f3389d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0958c) this.f3390e).indexOf(r2);
    L7:
        return ((C0957b) this.f3390e).m2319e(r2);
    }

    /* JADX INFO: renamed from: f */
    public final int m2294f(Object r2) {
        switch(this.f3389d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0958c) this.f3390e).indexOf(r2);
    L7:
        return ((C0957b) this.f3390e).m2321g(r2);
    }

    /* JADX INFO: renamed from: g */
    public final void m2295g(Object r2, Object r3) {
        switch(this.f3389d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0958c) this.f3390e).add(r2);
        return;
    L6:
        ((C0957b) this.f3390e).put(r2, r3);
    }

    /* JADX INFO: renamed from: h */
    public final void m2296h(int r2) {
        switch(this.f3389d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0958c) this.f3390e).m2303e(r2);
        return;
    L6:
        ((C0957b) this.f3390e).m2323i(r2);
    }

    /* JADX INFO: renamed from: i */
    public final Object m2297i(int r3, Object r4) {
        switch(this.f3389d) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        int r32 = (r3 << 1) + 1;
        Object[] r02 = ((C0957b) this.f3390e).f3431b;
        Object r1 = r02[r32];
        r02[r32] = r4;
        return r1;
    L5:
        throw new UnsupportedOperationException("not a map");
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m2298k(int r4, Object[] r5) {
        int r02 = m2292d();
        if (r5.length >= r02) goto L5;
        r5 = (Object[]) Array.newInstance(r5.getClass().getComponentType(), r02);
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r02) goto L9;
        r5[r1] = m2290b(r1, r4);
        r1 = r1 + 1;
        goto L6
    L9:
        if (r5.length <= r02) goto L11;
        r5[r02] = null;
    L11:
        return r5;
    }
}
