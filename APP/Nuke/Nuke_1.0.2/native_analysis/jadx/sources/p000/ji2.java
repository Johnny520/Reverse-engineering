package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ji2 {

    /* JADX INFO: renamed from: a */
    public final List f5052a;

    /* JADX INFO: renamed from: b */
    public final boolean f5053b;

    /* JADX INFO: renamed from: c */
    public final boolean f5054c;

    public ji2(List list, boolean z, boolean z2) {
        list.getClass();
        this.f5052a = list;
        this.f5053b = z;
        this.f5054c = z2;
        if (!z2 && list.isEmpty()) {
            C0676s.m4651j("Network permission must set any=true or declare at least one origin.");
            throw null;
        }
        if (list.size() > 128) {
            C0676s.m4651j("Network permission contains too many origins.");
            throw null;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (pv2.m4006s0((String) it.next())) {
                    C0676s.m4651j("Network origins must not be blank.");
                    throw null;
                }
            }
        }
        if (AbstractC0142du.m1158n0(this.f5052a).size() != this.f5052a.size()) {
            C0676s.m4651j("Network origins must not repeat.");
            throw null;
        }
        Iterator it2 = this.f5052a.iterator();
        while (it2.hasNext()) {
            xe1.m6116d0((String) it2.next());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        return t11.m5086l(this.f5052a, ji2Var.f5052a) && this.f5053b == ji2Var.f5053b && this.f5054c == ji2Var.f5054c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5054c) + hk1.m2205d(this.f5052a.hashCode() * 31, 31, this.f5053b);
    }

    public final String toString() {
        return "ScriptNetworkPermission(origins=" + this.f5052a + ", privateNetwork=" + this.f5053b + ", any=" + this.f5054c + ")";
    }
}
