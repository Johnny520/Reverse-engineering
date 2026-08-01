package p000;

import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0474m6 {

    /* JADX INFO: renamed from: a */
    public C0978zs f3076a;

    /* JADX INFO: renamed from: b */
    public C0978zs f3077b;

    /* JADX INFO: renamed from: c */
    public C0080bt f3078c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3079d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3080e;

    public /* synthetic */ C0474m6(int i, Object obj) {
        this.f3079d = i;
        this.f3080e = obj;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1807h(Set set, Object obj) {
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
    public final void m1808a() {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                ((C0511n6) this.f3080e).clear();
                break;
            default:
                ((C0622q6) this.f3080e).clear();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m1809b(int i, int i2) {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3080e).f680b[(i << 1) + i2];
            default:
                return ((C0622q6) this.f3080e).f3846b[i];
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map m1810c() {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                return (C0511n6) this.f3080e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1811d() {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3080e).f681c;
            default:
                return ((C0622q6) this.f3080e).f3847c;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m1812e(Object obj) {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3080e).m482e(obj);
            default:
                C0622q6 c0622q6 = (C0622q6) this.f3080e;
                return obj == null ? c0622q6.m2119d() : c0622q6.m2118c(obj.hashCode(), obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m1813f(Object obj) {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                return ((C0511n6) this.f3080e).m484g(obj);
            default:
                C0622q6 c0622q6 = (C0622q6) this.f3080e;
                return obj == null ? c0622q6.m2119d() : c0622q6.m2118c(obj.hashCode(), obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1814g(int i) {
        switch (this.f3079d) {
            case Base64.DEFAULT /* 0 */:
                ((C0511n6) this.f3080e).m486i(i);
                break;
            default:
                ((C0622q6) this.f3080e).m2120e(i);
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m1815i(Object[] objArr, int i) {
        int iM1811d = m1811d();
        if (objArr.length < iM1811d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iM1811d);
        }
        for (int i2 = 0; i2 < iM1811d; i2++) {
            objArr[i2] = m1809b(i2, i);
        }
        if (objArr.length > iM1811d) {
            objArr[iM1811d] = null;
        }
        return objArr;
    }
}
