package p028c1;

import java.util.Collection;
import java.util.Iterator;
import p016b1.C0908d;
import p024b9.AbstractC1043k;
import p041d1.C1853c;
import p185m8.AbstractC5092m;
import p364z0.InterfaceC9829g;

/* JADX INFO: renamed from: c1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1304b extends AbstractC5092m implements InterfaceC9829g {

    /* JADX INFO: renamed from: u */
    public static final a f3907u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final int f3908v = 8;

    /* JADX INFO: renamed from: w */
    public static final C1304b f3909w;

    /* JADX INFO: renamed from: r */
    public final Object f3910r;

    /* JADX INFO: renamed from: s */
    public final Object f3911s;

    /* JADX INFO: renamed from: t */
    public final C0908d f3912t;

    static {
        C1853c c1853c = C1853c.f4896a;
        f3909w = new C1304b(c1853c, c1853c, C0908d.f2856t.m3331a());
    }

    public C1304b(Object obj, Object obj2, C0908d c0908d) {
        this.f3910r = obj;
        this.f3911s = obj2;
        this.f3912t = c0908d;
    }

    @Override // java.util.Collection, java.util.Set, p364z0.InterfaceC9829g
    public InterfaceC9829g add(Object obj) {
        if (this.f3912t.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C1304b(obj, obj, this.f3912t.m3329v(obj, new C1303a()));
        }
        Object obj2 = this.f3911s;
        Object obj3 = this.f3912t.get(obj2);
        obj3.getClass();
        return new C1304b(this.f3910r, obj, this.f3912t.m3329v(obj2, ((C1303a) obj3).m5253e(obj)).m3329v(obj, new C1303a(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, p364z0.InterfaceC9829g
    public InterfaceC9829g addAll(Collection collection) {
        InterfaceC9829g.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // p364z0.InterfaceC9829g
    public InterfaceC9829g.a builder() {
        return new C1305c(this);
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f3912t.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f3912t.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1306d(this.f3910r, this.f3912t);
    }

    /* JADX INFO: renamed from: l */
    public final Object m5256l() {
        return this.f3910r;
    }

    /* JADX INFO: renamed from: o */
    public final C0908d m5257o() {
        return this.f3912t;
    }

    /* JADX INFO: renamed from: p */
    public final Object m5258p() {
        return this.f3911s;
    }

    @Override // java.util.Collection, java.util.Set, p364z0.InterfaceC9829g
    public InterfaceC9829g remove(Object obj) {
        C1303a c1303a = (C1303a) this.f3912t.get(obj);
        if (c1303a == null) {
            return this;
        }
        C0908d c0908dM3330w = this.f3912t.m3330w(obj);
        if (c1303a.m5250b()) {
            Object obj2 = c0908dM3330w.get(c1303a.m5252d());
            obj2.getClass();
            c0908dM3330w = c0908dM3330w.m3329v(c1303a.m5252d(), ((C1303a) obj2).m5253e(c1303a.m5251c()));
        }
        if (c1303a.m5249a()) {
            Object obj3 = c0908dM3330w.get(c1303a.m5251c());
            obj3.getClass();
            c0908dM3330w = c0908dM3330w.m3329v(c1303a.m5251c(), ((C1303a) obj3).m5254f(c1303a.m5252d()));
        }
        return new C1304b(!c1303a.m5250b() ? c1303a.m5251c() : this.f3910r, !c1303a.m5249a() ? c1303a.m5252d() : this.f3911s, c0908dM3330w);
    }

    @Override // java.util.Collection, java.util.Set, p364z0.InterfaceC9829g
    public InterfaceC9829g removeAll(Collection collection) {
        InterfaceC9829g.a aVarBuilder = builder();
        aVarBuilder.removeAll(collection);
        return aVarBuilder.build();
    }

    /* JADX INFO: renamed from: c1.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC9829g m5259a() {
            return C1304b.f3909w;
        }

        public a() {
        }
    }
}
