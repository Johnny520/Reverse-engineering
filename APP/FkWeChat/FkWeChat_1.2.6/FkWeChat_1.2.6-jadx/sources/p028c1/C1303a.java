package p028c1;

import p041d1.C1853c;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303a {

    /* JADX INFO: renamed from: a */
    public final Object f3905a;

    /* JADX INFO: renamed from: b */
    public final Object f3906b;

    public C1303a(Object obj, Object obj2) {
        this.f3905a = obj;
        this.f3906b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5249a() {
        return this.f3906b != C1853c.f4896a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5250b() {
        return this.f3905a != C1853c.f4896a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m5251c() {
        return this.f3906b;
    }

    /* JADX INFO: renamed from: d */
    public final Object m5252d() {
        return this.f3905a;
    }

    /* JADX INFO: renamed from: e */
    public final C1303a m5253e(Object obj) {
        return new C1303a(this.f3905a, obj);
    }

    /* JADX INFO: renamed from: f */
    public final C1303a m5254f(Object obj) {
        return new C1303a(obj, this.f3906b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1303a() {
        C1853c c1853c = C1853c.f4896a;
        this(c1853c, c1853c);
    }

    public C1303a(Object obj) {
        this(obj, C1853c.f4896a);
    }
}
