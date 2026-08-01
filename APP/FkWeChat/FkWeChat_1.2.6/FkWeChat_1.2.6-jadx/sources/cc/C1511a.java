package cc;

import p052dc.C1945c;

/* JADX INFO: renamed from: cc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1511a {

    /* JADX INFO: renamed from: a */
    public final Object f4468a;

    /* JADX INFO: renamed from: b */
    public final Object f4469b;

    public C1511a(Object obj, Object obj2) {
        this.f4468a = obj;
        this.f4469b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5921a() {
        return this.f4469b != C1945c.f5421a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5922b() {
        return this.f4468a != C1945c.f5421a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m5923c() {
        return this.f4469b;
    }

    /* JADX INFO: renamed from: d */
    public final Object m5924d() {
        return this.f4468a;
    }

    /* JADX INFO: renamed from: e */
    public final C1511a m5925e(Object obj) {
        return new C1511a(this.f4468a, obj);
    }

    /* JADX INFO: renamed from: f */
    public final C1511a m5926f(Object obj) {
        return new C1511a(obj, this.f4469b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1511a() {
        C1945c c1945c = C1945c.f5421a;
        this(c1945c, c1945c);
    }

    public C1511a(Object obj) {
        this(obj, C1945c.f5421a);
    }
}
