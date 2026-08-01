package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 extends AbstractMap implements Map, s40 {

    /* JADX INFO: renamed from: d */
    public C0675r3 f1504d = new C0675r3(27);

    /* JADX INFO: renamed from: e */
    public l91 f1505e;

    /* JADX INFO: renamed from: f */
    public Object f1506f;

    /* JADX INFO: renamed from: g */
    public int f1507g;

    /* JADX INFO: renamed from: h */
    public int f1508h;

    /* JADX INFO: renamed from: i */
    public fq0 f1509i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eq0(fq0 fq0Var) {
        this.f1505e = fq0Var.f2037d;
        this.f1508h = fq0Var.f2038e;
        this.f1509i = fq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final fq0 m954a() {
        l91 l91Var = this.f1505e;
        fq0 fq0Var = this.f1509i;
        if (l91Var != fq0Var.f2037d) {
            this.f1504d = new C0675r3(27);
            fq0Var = new fq0(this.f1505e, this.f1508h);
        }
        this.f1509i = fq0Var;
        return fq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m955b(Object obj) {
        return this.f1505e.m1988d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m956c(Object obj) {
        return this.f1505e.m1991g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1505e = l91.f3393e;
        m958e(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof at0) {
            return m955b((at0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof cb1) {
            return super.containsValue((cb1) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m957d(Object obj) {
        this.f1506f = null;
        l91 l91VarM1997n = this.f1505e.m1997n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (l91VarM1997n == null) {
            l91VarM1997n = l91.f3393e;
        }
        this.f1505e = l91VarM1997n;
        return this.f1506f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m958e(int i) {
        this.f1508h = i;
        this.f1507g++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new jq0(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof at0) {
            return (cb1) m956c((at0) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof at0) ? obj2 : (cb1) super.getOrDefault((at0) obj, (cb1) obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new jq0(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f1506f = null;
        this.f1505e = this.f1505e.m1995l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f1506f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        gq0 gq0VarM954a = null;
        gq0 gq0Var = map instanceof gq0 ? (gq0) map : null;
        if (gq0Var == null) {
            eq0 eq0Var = map instanceof eq0 ? (eq0) map : null;
            if (eq0Var != null) {
                gq0VarM954a = eq0Var.m954a();
            }
        } else {
            gq0VarM954a = gq0Var;
        }
        if (gq0VarM954a == null) {
            super.putAll(map);
            return;
        }
        C0931xm c0931xm = new C0931xm();
        c0931xm.f7374a = 0;
        int i = this.f1508h;
        l91 l91Var = this.f1505e;
        l91 l91Var2 = gq0VarM954a.f2037d;
        l91Var2.getClass();
        this.f1505e = l91Var.m1996m(l91Var2, 0, c0931xm, this);
        int i2 = (gq0VarM954a.f2038e + i) - c0931xm.f7374a;
        if (i != i2) {
            m958e(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f1508h;
        l91 l91VarM1998o = this.f1505e.m1998o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (l91VarM1998o == null) {
            l91VarM1998o = l91.f3393e;
        }
        this.f1505e = l91VarM1998o;
        return i != this.f1508h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1508h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new hd0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof at0) {
            return (cb1) m957d((at0) obj);
        }
        return null;
    }
}
