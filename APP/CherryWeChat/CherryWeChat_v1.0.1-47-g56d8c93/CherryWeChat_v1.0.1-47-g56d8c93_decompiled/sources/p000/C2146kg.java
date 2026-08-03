package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: kg */
/* JADX INFO: loaded from: classes.dex */
public final class C2146kg implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final Object f7502b;

    /* JADX INFO: renamed from: c */
    public final int f7503c;

    /* JADX INFO: renamed from: d */
    public final int f7504d;

    /* JADX INFO: renamed from: e */
    public final Class f7505e;

    /* JADX INFO: renamed from: f */
    public final Class f7506f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0802Sm f7507g;

    /* JADX INFO: renamed from: h */
    public final Map f7508h;

    /* JADX INFO: renamed from: i */
    public final C2644vt f7509i;

    /* JADX INFO: renamed from: j */
    public int f7510j;

    public C2146kg(Object obj, InterfaceC0802Sm interfaceC0802Sm, int i, int i2, Map map, Class cls, Class cls2, C2644vt c2644vt) {
        AbstractC0714Qj.m1488j("Argument must not be null", obj);
        this.f7502b = obj;
        this.f7507g = interfaceC0802Sm;
        this.f7503c = i;
        this.f7504d = i2;
        AbstractC0714Qj.m1488j("Argument must not be null", map);
        this.f7508h = map;
        AbstractC0714Qj.m1488j("Resource class must not be null", cls);
        this.f7505e = cls;
        AbstractC0714Qj.m1488j("Transcode class must not be null", cls2);
        this.f7506f = cls2;
        AbstractC0714Qj.m1488j("Argument must not be null", c2644vt);
        this.f7509i = c2644vt;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C2146kg) {
            C2146kg c2146kg = (C2146kg) obj;
            if (this.f7502b.equals(c2146kg.f7502b) && this.f7507g.equals(c2146kg.f7507g) && this.f7504d == c2146kg.f7504d && this.f7503c == c2146kg.f7503c && this.f7508h.equals(c2146kg.f7508h) && this.f7505e.equals(c2146kg.f7505e) && this.f7506f.equals(c2146kg.f7506f) && this.f7509i.equals(c2146kg.f7509i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        if (this.f7510j == 0) {
            int iHashCode = this.f7502b.hashCode();
            this.f7510j = iHashCode;
            int iHashCode2 = ((((this.f7507g.hashCode() + (iHashCode * 31)) * 31) + this.f7503c) * 31) + this.f7504d;
            this.f7510j = iHashCode2;
            int iHashCode3 = this.f7508h.hashCode() + (iHashCode2 * 31);
            this.f7510j = iHashCode3;
            int iHashCode4 = this.f7505e.hashCode() + (iHashCode3 * 31);
            this.f7510j = iHashCode4;
            int iHashCode5 = this.f7506f.hashCode() + (iHashCode4 * 31);
            this.f7510j = iHashCode5;
            this.f7510j = this.f7509i.f9156b.hashCode() + (iHashCode5 * 31);
        }
        return this.f7510j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f7502b + ", width=" + this.f7503c + ", height=" + this.f7504d + ", resourceClass=" + this.f7505e + ", transcodeClass=" + this.f7506f + ", signature=" + this.f7507g + ", hashCode=" + this.f7510j + ", transformations=" + this.f7508h + ", options=" + this.f7509i + '}';
    }
}
