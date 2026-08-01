package p000;

import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0474m6 {

    /* JADX INFO: renamed from: a */
    public C0756ts f3146a;

    /* JADX INFO: renamed from: b */
    public C0756ts f3147b;

    /* JADX INFO: renamed from: c */
    public C0830vs f3148c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3149d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3150e;

    public /* synthetic */ C0474m6(int i, Object obj) {
        this.f3149d = i;
        this.f3150e = obj;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1785h(Set set, Object obj) {
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

    /* JADX INFO: renamed from: a */
    public final void m1786a() {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                ((C0511n6) this.f3150e).clear();
                break;
            default:
                ((C0623q6) this.f3150e).clear();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m1787b(int i, int i2) {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3150e).f4661b[(i << 1) + i2];
            default:
                return ((C0623q6) this.f3150e).f4034b[i];
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map m1788c() {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                return (C0511n6) this.f3150e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1789d() {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3150e).f4662c;
            default:
                return ((C0623q6) this.f3150e).f4035c;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m1790e(Object obj) {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3150e).m2413e(obj);
            default:
                C0623q6 c0623q6 = (C0623q6) this.f3150e;
                return obj == null ? c0623q6.m2154d() : c0623q6.m2153c(obj.hashCode(), obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m1791f(Object obj) {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3150e).m2415g(obj);
            default:
                C0623q6 c0623q6 = (C0623q6) this.f3150e;
                return obj == null ? c0623q6.m2154d() : c0623q6.m2153c(obj.hashCode(), obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1792g(int i) {
        switch (this.f3149d) {
            case Base64.DEFAULT /* 0 */:
                ((C0511n6) this.f3150e).m2417i(i);
                break;
            default:
                ((C0623q6) this.f3150e).m2155e(i);
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m1793i(Object[] objArr, int i) {
        int iM1789d = m1789d();
        if (objArr.length < iM1789d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iM1789d);
        }
        for (int i2 = 0; i2 < iM1789d; i2++) {
            objArr[i2] = m1787b(i2, i);
        }
        if (objArr.length > iM1789d) {
            objArr[iM1789d] = null;
        }
        return objArr;
    }
}
