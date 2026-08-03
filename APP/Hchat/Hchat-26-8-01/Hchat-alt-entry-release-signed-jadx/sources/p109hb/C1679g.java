package p109hb;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: hb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1679g {

    /* JADX INFO: renamed from: a */
    public final Constructor f5559a;

    /* JADX INFO: renamed from: b */
    public final Constructor f5560b;

    /* JADX INFO: renamed from: c */
    public final Method f5561c;

    /* JADX INFO: renamed from: d */
    public final Object f5562d;

    /* JADX INFO: renamed from: e */
    public final Method f5563e;

    /* JADX INFO: renamed from: f */
    public final String f5564f;

    /* JADX INFO: renamed from: g */
    public final Method f5565g;

    /* JADX INFO: renamed from: h */
    public final Method f5566h;

    /* JADX INFO: renamed from: i */
    public final C1677f f5567i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1679g(Constructor constructor, Constructor constructor2, Method method, Object obj, Method method2, String str, Method method3, Method method4, C1677f c1677f) {
        this.f5559a = constructor;
        this.f5560b = constructor2;
        this.f5561c = method;
        this.f5562d = obj;
        this.f5563e = method2;
        this.f5564f = str;
        this.f5565g = method3;
        this.f5566h = method4;
        this.f5567i = c1677f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679g)) {
            return false;
        }
        C1679g c1679g = (C1679g) obj;
        return this.f5559a.equals(c1679g.f5559a) && this.f5560b.equals(c1679g.f5560b) && this.f5561c.equals(c1679g.f5561c) && AbstractC1416l.m3825a(this.f5562d, c1679g.f5562d) && AbstractC1416l.m3825a(this.f5563e, c1679g.f5563e) && this.f5564f.equals(c1679g.f5564f) && AbstractC1416l.m3825a(this.f5565g, c1679g.f5565g) && AbstractC1416l.m3825a(this.f5566h, c1679g.f5566h) && AbstractC1416l.m3825a(this.f5567i, c1679g.f5567i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f5561c.hashCode() + ((this.f5560b.hashCode() + (this.f5559a.hashCode() * 31)) * 31)) * 31;
        Object obj = this.f5562d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Method method = this.f5563e;
        int iM2244g = AbstractC0921a.m2244g((iHashCode2 + (method == null ? 0 : method.hashCode())) * 31, 31, this.f5564f);
        Method method2 = this.f5565g;
        int iHashCode3 = (iM2244g + (method2 == null ? 0 : method2.hashCode())) * 31;
        Method method3 = this.f5566h;
        int iHashCode4 = (iHashCode3 + (method3 == null ? 0 : method3.hashCode())) * 31;
        C1677f c1677f = this.f5567i;
        return iHashCode4 + (c1677f != null ? c1677f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MassSendRuntime(sceneConstructor=" + this.f5559a + ", infoConstructor=" + this.f5560b + ", sceneEndMethod=" + this.f5561c + ", storage=" + this.f5562d + ", imageBuilder=" + this.f5563e + ", contactField=" + this.f5564f + ", limitServiceGetter=" + this.f5565g + ", limitMethod=" + this.f5566h + ", emojiRuntime=" + this.f5567i + ")";
    }
}
