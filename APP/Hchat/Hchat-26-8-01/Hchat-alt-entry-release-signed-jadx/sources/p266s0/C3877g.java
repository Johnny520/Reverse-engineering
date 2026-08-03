package p266s0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p114hg.InterfaceC1714d;
import p117i0.AbstractC1869p1;
import p117i0.InterfaceC1870p2;
import p223p0.C3274b;
import p223p0.C3277e;
import p223p0.C3279g;
import p223p0.C3282j;
import p252r0.C3642a;
import p252r0.C3643b;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3877g extends AbstractMap implements Map, InterfaceC1714d {

    /* JADX INFO: renamed from: g */
    public C3643b f12727g = new C3643b();

    /* JADX INFO: renamed from: h */
    public C3282j f12728h;

    /* JADX INFO: renamed from: i */
    public Object f12729i;

    /* JADX INFO: renamed from: j */
    public int f12730j;

    /* JADX INFO: renamed from: k */
    public int f12731k;

    /* JADX INFO: renamed from: l */
    public C3878h f12732l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3877g(C3878h c3878h) {
        this.f12728h = c3878h.f10424g;
        this.f12731k = c3878h.f10425h;
        this.f12732l = c3878h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3878h m8061a() {
        C3282j c3282j = this.f12728h;
        C3878h c3878h = this.f12732l;
        if (c3282j != c3878h.f10424g) {
            this.f12727g = new C3643b();
            c3878h = new C3878h(this.f12728h, this.f12731k);
        }
        this.f12732l = c3878h;
        return c3878h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m8062c(Object obj) {
        return this.f12728h.m6947d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f12728h = C3282j.f10439e;
        m8065f(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1869p1) {
            return m8062c((AbstractC1869p1) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1870p2) {
            return super.containsValue((InterfaceC1870p2) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m8063d(Object obj) {
        return this.f12728h.m6950g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m8064e(Object obj) {
        this.f12729i = null;
        C3282j c3282jM6956n = this.f12728h.m6956n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c3282jM6956n == null) {
            c3282jM6956n = C3282j.f10439e;
        }
        this.f12728h = c3282jM6956n;
        return this.f12729i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C3277e(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m8065f(int i9) {
        this.f12731k = i9;
        this.f12730j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1869p1) {
            return (InterfaceC1870p2) m8063d((AbstractC1869p1) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1869p1) ? obj2 : (InterfaceC1870p2) super.getOrDefault((AbstractC1869p1) obj, (InterfaceC1870p2) obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C3277e(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f12729i = null;
        this.f12728h = this.f12728h.m6954l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f12729i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C3274b c3274bM8061a = null;
        C3274b c3274b = map instanceof C3274b ? (C3274b) map : null;
        if (c3274b == null) {
            C3877g c3877g = map instanceof C3877g ? (C3877g) map : null;
            if (c3877g != null) {
                c3274bM8061a = c3877g.m8061a();
            }
        } else {
            c3274bM8061a = c3274b;
        }
        if (c3274bM8061a == null) {
            super.putAll(map);
            return;
        }
        C3642a c3642a = new C3642a();
        c3642a.f11821a = 0;
        int i9 = this.f12731k;
        C3282j c3282j = this.f12728h;
        C3282j c3282j2 = c3274bM8061a.f10424g;
        c3282j2.getClass();
        this.f12728h = c3282j.m6955m(c3282j2, 0, c3642a, this);
        int i10 = (c3274bM8061a.f10425h + i9) - c3642a.f11821a;
        if (i9 != i10) {
            m8065f(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i9 = this.f12731k;
        C3282j c3282jM6957o = this.f12728h.m6957o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c3282jM6957o == null) {
            c3282jM6957o = C3282j.f10439e;
        }
        this.f12728h = c3282jM6957o;
        return i9 != this.f12731k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12731k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C3279g(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC1869p1) {
            return (InterfaceC1870p2) m8064e((AbstractC1869p1) obj);
        }
        return null;
    }
}
