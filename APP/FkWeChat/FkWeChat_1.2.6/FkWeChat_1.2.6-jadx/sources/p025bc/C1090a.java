package p025bc;

import p052dc.C1945c;

/* JADX INFO: renamed from: bc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1090a {

    /* JADX INFO: renamed from: a */
    public final Object f3294a;

    /* JADX INFO: renamed from: b */
    public final Object f3295b;

    /* JADX INFO: renamed from: c */
    public final Object f3296c;

    public C1090a(Object obj, Object obj2, Object obj3) {
        this.f3294a = obj;
        this.f3295b = obj2;
        this.f3296c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3966a() {
        return this.f3296c != C1945c.f5421a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3967b() {
        return this.f3295b != C1945c.f5421a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m3968c() {
        return this.f3296c;
    }

    /* JADX INFO: renamed from: d */
    public final Object m3969d() {
        return this.f3295b;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3970e() {
        return this.f3294a;
    }

    /* JADX INFO: renamed from: f */
    public final C1090a m3971f(Object obj) {
        return new C1090a(this.f3294a, this.f3295b, obj);
    }

    /* JADX INFO: renamed from: g */
    public final C1090a m3972g(Object obj) {
        return new C1090a(this.f3294a, obj, this.f3296c);
    }

    /* JADX INFO: renamed from: h */
    public final C1090a m3973h(Object obj) {
        return new C1090a(obj, this.f3295b, this.f3296c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1090a(Object obj) {
        C1945c c1945c = C1945c.f5421a;
        this(obj, c1945c, c1945c);
    }

    public C1090a(Object obj, Object obj2) {
        this(obj, obj2, C1945c.f5421a);
    }
}
