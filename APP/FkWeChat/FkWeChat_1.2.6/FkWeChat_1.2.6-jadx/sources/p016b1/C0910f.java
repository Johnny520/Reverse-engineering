package p016b1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p041d1.C1852b;
import p041d1.C1855e;
import p185m8.AbstractC5088k;
import p364z0.InterfaceC9828f;

/* JADX INFO: renamed from: b1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0910f extends AbstractC5088k implements InterfaceC9828f.a {

    /* JADX INFO: renamed from: q */
    public C0908d f2864q;

    /* JADX INFO: renamed from: r */
    public C1855e f2865r = new C1855e();

    /* JADX INFO: renamed from: s */
    public C0924t f2866s;

    /* JADX INFO: renamed from: t */
    public Object f2867t;

    /* JADX INFO: renamed from: u */
    public int f2868u;

    /* JADX INFO: renamed from: v */
    public int f2869v;

    public C0910f(C0908d c0908d) {
        this.f2864q = c0908d;
        this.f2866s = this.f2864q.m3327t();
        this.f2869v = this.f2864q.size();
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: a */
    public Set mo478a() {
        return new C0912h(this);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: c */
    public Set mo479c() {
        return new C0914j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        C0924t c0924tM3403a = C0924t.f2881e.m3403a();
        c0924tM3403a.getClass();
        this.f2866s = c0924tM3403a;
        m3345r(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f2866s.m3387k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: e */
    public int mo480e() {
        return this.f2869v;
    }

    @Override // p185m8.AbstractC5088k
    /* JADX INFO: renamed from: g */
    public Collection mo481g() {
        return new C0916l(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f2866s.m3391o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p364z0.InterfaceC9828f.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0908d build() {
        C0908d c0908d;
        if (this.f2866s == this.f2864q.m3327t()) {
            c0908d = this.f2864q;
        } else {
            this.f2865r = new C1855e();
            c0908d = new C0908d(this.f2866s, size());
        }
        this.f2864q = c0908d;
        return c0908d;
    }

    /* JADX INFO: renamed from: l */
    public final int m3339l() {
        return this.f2868u;
    }

    /* JADX INFO: renamed from: m */
    public final C0924t m3340m() {
        return this.f2866s;
    }

    /* JADX INFO: renamed from: n */
    public final C1855e m3341n() {
        return this.f2865r;
    }

    /* JADX INFO: renamed from: o */
    public final void m3342o(int i10) {
        this.f2868u = i10;
    }

    /* JADX INFO: renamed from: p */
    public final void m3343p(Object obj) {
        this.f2867t = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f2867t = null;
        this.f2866s = this.f2866s.m3358D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f2867t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        C0908d c0908dBuild = map instanceof C0908d ? (C0908d) map : null;
        if (c0908dBuild == null) {
            C0910f c0910f = map instanceof C0910f ? (C0910f) map : null;
            c0908dBuild = c0910f != null ? c0910f.build() : null;
        }
        if (c0908dBuild == null) {
            super.putAll(map);
            return;
        }
        C1852b c1852b = new C1852b(0, 1, null);
        int size = size();
        C0924t c0924t = this.f2866s;
        C0924t c0924tM3327t = c0908dBuild.m3327t();
        c0924tM3327t.getClass();
        this.f2866s = c0924t.m3359E(c0924tM3327t, 0, c1852b, this);
        int size2 = (c0908dBuild.size() + size) - c1852b.m6549a();
        if (size != size2) {
            m3345r(size2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3344q(C1855e c1855e) {
        this.f2865r = c1855e;
    }

    /* JADX INFO: renamed from: r */
    public void m3345r(int i10) {
        this.f2869v = i10;
        this.f2868u++;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C0924t c0924tM3362H = this.f2866s.m3362H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c0924tM3362H == null) {
            c0924tM3362H = C0924t.f2881e.m3403a();
            c0924tM3362H.getClass();
        }
        this.f2866s = c0924tM3362H;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f2867t = null;
        C0924t c0924tM3361G = this.f2866s.m3361G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c0924tM3361G == null) {
            c0924tM3361G = C0924t.f2881e.m3403a();
            c0924tM3361G.getClass();
        }
        this.f2866s = c0924tM3361G;
        return this.f2867t;
    }
}
