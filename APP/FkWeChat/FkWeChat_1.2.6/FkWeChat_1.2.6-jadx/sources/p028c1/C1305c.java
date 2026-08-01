package p028c1;

import java.util.Iterator;
import p016b1.C0908d;
import p016b1.C0910f;
import p041d1.AbstractC1851a;
import p041d1.C1853c;
import p185m8.AbstractC5090l;
import p364z0.InterfaceC9829g;

/* JADX INFO: renamed from: c1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1305c extends AbstractC5090l implements InterfaceC9829g.a {

    /* JADX INFO: renamed from: q */
    public C1304b f3913q;

    /* JADX INFO: renamed from: r */
    public Object f3914r;

    /* JADX INFO: renamed from: s */
    public Object f3915s;

    /* JADX INFO: renamed from: t */
    public final C0910f f3916t;

    public C1305c(C1304b c1304b) {
        this.f3913q = c1304b;
        this.f3914r = c1304b.m5256l();
        this.f3915s = this.f3913q.m5258p();
        this.f3916t = this.f3913q.m5257o().builder();
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f3916t.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f3916t.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f3914r = obj;
            this.f3915s = obj;
            this.f3916t.put(obj, new C1303a());
            return true;
        }
        V v10 = this.f3916t.get(this.f3915s);
        v10.getClass();
        this.f3916t.put(this.f3915s, ((C1303a) v10).m5253e(obj));
        this.f3916t.put(obj, new C1303a(this.f3915s));
        this.f3915s = obj;
        return true;
    }

    @Override // p364z0.InterfaceC9829g.a
    public InterfaceC9829g build() {
        C1304b c1304b;
        C0908d c0908dBuild = this.f3916t.build();
        if (c0908dBuild == this.f3913q.m5257o()) {
            AbstractC1851a.m6548a(this.f3914r == this.f3913q.m5256l());
            AbstractC1851a.m6548a(this.f3915s == this.f3913q.m5258p());
            c1304b = this.f3913q;
        } else {
            c1304b = new C1304b(this.f3914r, this.f3915s, c0908dBuild);
        }
        this.f3913q = c1304b;
        return c1304b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m5260c() {
        return this.f3914r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f3916t.clear();
        C1853c c1853c = C1853c.f4896a;
        this.f3914r = c1853c;
        this.f3915s = c1853c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f3916t.containsKey(obj);
    }

    /* JADX INFO: renamed from: e */
    public final C0910f m5261e() {
        return this.f3916t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1307e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        C1303a c1303a = (C1303a) this.f3916t.remove(obj);
        if (c1303a == null) {
            return false;
        }
        if (c1303a.m5250b()) {
            V v10 = this.f3916t.get(c1303a.m5252d());
            v10.getClass();
            this.f3916t.put(c1303a.m5252d(), ((C1303a) v10).m5253e(c1303a.m5251c()));
        } else {
            this.f3914r = c1303a.m5251c();
        }
        if (!c1303a.m5249a()) {
            this.f3915s = c1303a.m5252d();
            return true;
        }
        V v11 = this.f3916t.get(c1303a.m5251c());
        v11.getClass();
        this.f3916t.put(c1303a.m5251c(), ((C1303a) v11).m5254f(c1303a.m5252d()));
        return true;
    }
}
