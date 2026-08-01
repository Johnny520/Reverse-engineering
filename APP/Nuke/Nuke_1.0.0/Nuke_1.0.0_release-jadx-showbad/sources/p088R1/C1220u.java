package p088R1;

import java.security.MessageDigest;
import java.util.Map;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: R1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1220u implements InterfaceC1144f {

    /* JADX INFO: renamed from: b */
    public final Object f4070b;

    /* JADX INFO: renamed from: c */
    public final int f4071c;

    /* JADX INFO: renamed from: d */
    public final int f4072d;

    /* JADX INFO: renamed from: e */
    public final Class f4073e;

    /* JADX INFO: renamed from: f */
    public final Class f4074f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1144f f4075g;

    /* JADX INFO: renamed from: h */
    public final Map f4076h;

    /* JADX INFO: renamed from: i */
    public final C1147i f4077i;

    /* JADX INFO: renamed from: j */
    public int f4078j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1220u(Object obj, InterfaceC1144f interfaceC1144f, int i5, int i6, Map map, Class cls, Class cls2, C1147i c1147i) {
        AbstractC2503g.m4445c(obj, "Argument must not be null");
        this.f4070b = obj;
        this.f4075g = interfaceC1144f;
        this.f4071c = i5;
        this.f4072d = i6;
        AbstractC2503g.m4445c(map, "Argument must not be null");
        this.f4076h = map;
        AbstractC2503g.m4445c(cls, "Resource class must not be null");
        this.f4073e = cls;
        AbstractC2503g.m4445c(cls2, "Transcode class must not be null");
        this.f4074f = cls2;
        AbstractC2503g.m4445c(c1147i, "Argument must not be null");
        this.f4077i = c1147i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1220u) {
            C1220u c1220u = (C1220u) obj;
            if (this.f4070b.equals(c1220u.f4070b) && this.f4075g.equals(c1220u.f4075g) && this.f4072d == c1220u.f4072d && this.f4071c == c1220u.f4071c && this.f4076h.equals(c1220u.f4076h) && this.f4073e.equals(c1220u.f4073e) && this.f4074f.equals(c1220u.f4074f) && this.f4077i.equals(c1220u.f4077i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        if (this.f4078j == 0) {
            int iHashCode = this.f4070b.hashCode();
            this.f4078j = iHashCode;
            int iHashCode2 = ((((this.f4075g.hashCode() + (iHashCode * 31)) * 31) + this.f4071c) * 31) + this.f4072d;
            this.f4078j = iHashCode2;
            int iHashCode3 = this.f4076h.hashCode() + (iHashCode2 * 31);
            this.f4078j = iHashCode3;
            int iHashCode4 = this.f4073e.hashCode() + (iHashCode3 * 31);
            this.f4078j = iHashCode4;
            int iHashCode5 = this.f4074f.hashCode() + (iHashCode4 * 31);
            this.f4078j = iHashCode5;
            this.f4078j = this.f4077i.f3785b.hashCode() + (iHashCode5 * 31);
        }
        return this.f4078j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "EngineKey{model=" + this.f4070b + ", width=" + this.f4071c + ", height=" + this.f4072d + ", resourceClass=" + this.f4073e + ", transcodeClass=" + this.f4074f + ", signature=" + this.f4075g + ", hashCode=" + this.f4078j + ", transformations=" + this.f4076h + ", options=" + this.f4077i + '}';
    }
}
