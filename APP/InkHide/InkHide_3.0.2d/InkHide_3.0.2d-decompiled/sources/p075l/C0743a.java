package p075l;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0743a {

    /* JADX INFO: renamed from: a */
    public C0750h f2510a;

    /* JADX INFO: renamed from: b */
    public C0750h f2511b;

    /* JADX INFO: renamed from: c */
    public C0752j f2512c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2513d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2514e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0743a(int i2, Object obj) {
        this.f2513d = i2;
        this.f2514e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m1392h(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1393a() {
        switch (this.f2513d) {
            case 0:
                ((C0744b) this.f2514e).clear();
                break;
            default:
                ((C0745c) this.f2514e).clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m1394b(int i2, int i3) {
        switch (this.f2513d) {
            case 0:
                return ((C0744b) this.f2514e).f2555b[(i2 << 1) + i3];
            default:
                return ((C0745c) this.f2514e).f2523b[i2];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Map m1395c() {
        switch (this.f2513d) {
            case 0:
                return (C0744b) this.f2514e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m1396d() {
        switch (this.f2513d) {
            case 0:
                return ((C0744b) this.f2514e).f2556c;
            default:
                return ((C0745c) this.f2514e).f2524c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m1397e(Object obj) {
        switch (this.f2513d) {
            case 0:
                return ((C0744b) this.f2514e).m1415d(obj);
            default:
                C0745c c0745c = (C0745c) this.f2514e;
                return obj == null ? c0745c.m1404d() : c0745c.m1403c(obj.hashCode(), obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1398f(Object obj) {
        switch (this.f2513d) {
            case 0:
                return ((C0744b) this.f2514e).m1417f(obj);
            default:
                C0745c c0745c = (C0745c) this.f2514e;
                return obj == null ? c0745c.m1404d() : c0745c.m1403c(obj.hashCode(), obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1399g(int i2) {
        switch (this.f2513d) {
            case 0:
                ((C0744b) this.f2514e).m1419h(i2);
                break;
            default:
                ((C0745c) this.f2514e).m1405e(i2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object[] m1400i(int i2, Object[] objArr) {
        int iM1396d = m1396d();
        if (objArr.length < iM1396d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iM1396d);
        }
        for (int i3 = 0; i3 < iM1396d; i3++) {
            objArr[i3] = m1394b(i3, i2);
        }
        if (objArr.length > iM1396d) {
            objArr[iM1396d] = null;
        }
        return objArr;
    }
}
