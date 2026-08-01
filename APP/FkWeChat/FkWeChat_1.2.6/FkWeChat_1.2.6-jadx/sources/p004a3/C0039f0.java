package p004a3;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: a3.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0039f0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0042h f64a;

    /* JADX INFO: renamed from: b */
    public final C0054r f65b;

    /* JADX INFO: renamed from: c */
    public final int f66c;

    /* JADX INFO: renamed from: d */
    public final int f67d;

    /* JADX INFO: renamed from: e */
    public final Object f68e;

    public C0039f0(AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11, Object obj) {
        this.f64a = abstractC0042h;
        this.f65b = c0054r;
        this.f66c = i10;
        this.f67d = i11;
        this.f68e = obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0039f0 m144b(C0039f0 c0039f0, AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC0042h = c0039f0.f64a;
        }
        if ((i12 & 2) != 0) {
            c0054r = c0039f0.f65b;
        }
        if ((i12 & 4) != 0) {
            i10 = c0039f0.f66c;
        }
        if ((i12 & 8) != 0) {
            i11 = c0039f0.f67d;
        }
        if ((i12 & 16) != 0) {
            obj = c0039f0.f68e;
        }
        Object obj3 = obj;
        int i13 = i10;
        return c0039f0.m145a(abstractC0042h, c0054r, i13, i11, obj3);
    }

    /* JADX INFO: renamed from: a */
    public final C0039f0 m145a(AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11, Object obj) {
        return new C0039f0(abstractC0042h, c0054r, i10, i11, obj, null);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0042h m146c() {
        return this.f64a;
    }

    /* JADX INFO: renamed from: d */
    public final int m147d() {
        return this.f66c;
    }

    /* JADX INFO: renamed from: e */
    public final C0054r m148e() {
        return this.f65b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039f0)) {
            return false;
        }
        C0039f0 c0039f0 = (C0039f0) obj;
        return AbstractC1061t.m3842c(this.f64a, c0039f0.f64a) && AbstractC1061t.m3842c(this.f65b, c0039f0.f65b) && C0052p.m173f(this.f66c, c0039f0.f66c) && C0053q.m186h(this.f67d, c0039f0.f67d) && AbstractC1061t.m3842c(this.f68e, c0039f0.f68e);
    }

    public int hashCode() {
        AbstractC0042h abstractC0042h = this.f64a;
        int iHashCode = (((((((abstractC0042h == null ? 0 : abstractC0042h.hashCode()) * 31) + this.f65b.hashCode()) * 31) + C0052p.m174g(this.f66c)) * 31) + C0053q.m187i(this.f67d)) * 31;
        Object obj = this.f68e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f64a + ", fontWeight=" + this.f65b + ", fontStyle=" + ((Object) C0052p.m175h(this.f66c)) + ", fontSynthesis=" + ((Object) C0053q.m188j(this.f67d)) + ", resourceLoaderCacheKey=" + this.f68e + ')';
    }

    public /* synthetic */ C0039f0(AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11, Object obj, AbstractC1043k abstractC1043k) {
        this(abstractC0042h, c0054r, i10, i11, obj);
    }
}
