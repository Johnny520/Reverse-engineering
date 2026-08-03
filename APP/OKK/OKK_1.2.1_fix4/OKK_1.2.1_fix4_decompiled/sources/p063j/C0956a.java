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

    public /* synthetic */ C0956a(int i2, Object obj) {
        this.f3389d = i2;
        this.f3390e = obj;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2288j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m2289a() {
        switch (this.f3389d) {
            case 0:
                ((C0957b) this.f3390e).clear();
                break;
            default:
                ((C0958c) this.f3390e).clear();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2290b(int i2, int i3) {
        switch (this.f3389d) {
            case 0:
                return ((C0957b) this.f3390e).f3431b[(i2 << 1) + i3];
            default:
                return ((C0958c) this.f3390e).f3399b[i2];
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map m2291c() {
        switch (this.f3389d) {
            case 0:
                return (C0957b) this.f3390e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2292d() {
        switch (this.f3389d) {
            case 0:
                return ((C0957b) this.f3390e).f3432c;
            default:
                return ((C0958c) this.f3390e).f3400c;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2293e(Object obj) {
        switch (this.f3389d) {
            case 0:
                return ((C0957b) this.f3390e).m2319e(obj);
            default:
                return ((C0958c) this.f3390e).indexOf(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m2294f(Object obj) {
        switch (this.f3389d) {
            case 0:
                return ((C0957b) this.f3390e).m2321g(obj);
            default:
                return ((C0958c) this.f3390e).indexOf(obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2295g(Object obj, Object obj2) {
        switch (this.f3389d) {
            case 0:
                ((C0957b) this.f3390e).put(obj, obj2);
                break;
            default:
                ((C0958c) this.f3390e).add(obj);
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2296h(int i2) {
        switch (this.f3389d) {
            case 0:
                ((C0957b) this.f3390e).m2323i(i2);
                break;
            default:
                ((C0958c) this.f3390e).m2303e(i2);
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object m2297i(int i2, Object obj) {
        switch (this.f3389d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C0957b) this.f3390e).f3431b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m2298k(int i2, Object[] objArr) {
        int iM2292d = m2292d();
        if (objArr.length < iM2292d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iM2292d);
        }
        for (int i3 = 0; i3 < iM2292d; i3++) {
            objArr[i3] = m2290b(i3, i2);
        }
        if (objArr.length > iM2292d) {
            objArr[iM2292d] = null;
        }
        return objArr;
    }
}
