package p117X2;

import java.io.Serializable;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: X2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1656a implements InterfaceC1662g, Serializable {

    /* JADX INFO: renamed from: d */
    public final Object f5684d;

    /* JADX INFO: renamed from: e */
    public final Class f5685e;

    /* JADX INFO: renamed from: f */
    public final String f5686f;

    /* JADX INFO: renamed from: g */
    public final String f5687g;

    /* JADX INFO: renamed from: h */
    public final boolean f5688h = false;

    /* JADX INFO: renamed from: i */
    public final int f5689i;

    /* JADX INFO: renamed from: j */
    public final int f5690j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1656a(int i5, int i6, Class cls, Object obj, String str, String str2) {
        this.f5684d = obj;
        this.f5685e = cls;
        this.f5686f = str;
        this.f5687g = str2;
        this.f5689i = i5;
        this.f5690j = i6 >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117X2.InterfaceC1662g
    /* JADX INFO: renamed from: b */
    public final int mo2234b() {
        return this.f5689i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1656a)) {
            return false;
        }
        AbstractC1656a abstractC1656a = (AbstractC1656a) obj;
        return this.f5688h == abstractC1656a.f5688h && this.f5689i == abstractC1656a.f5689i && this.f5690j == abstractC1656a.f5690j && this.f5684d.equals(abstractC1656a.f5684d) && this.f5685e.equals(abstractC1656a.f5685e) && this.f5686f.equals(abstractC1656a.f5686f) && this.f5687g.equals(abstractC1656a.f5687g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((AbstractC0231b.m394e(AbstractC0231b.m394e((this.f5685e.hashCode() + (this.f5684d.hashCode() * 31)) * 31, 31, this.f5686f), 31, this.f5687g) + (this.f5688h ? 1231 : 1237)) * 31) + this.f5689i) * 31) + this.f5690j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        AbstractC1676u.f5711a.getClass();
        return C1677v.m2996a(this);
    }
}
