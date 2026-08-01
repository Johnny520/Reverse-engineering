package p197m;

import java.util.LinkedHashMap;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: m.N */
/* JADX INFO: loaded from: classes.dex */
public final class C2529N {

    /* JADX INFO: renamed from: b */
    public static final C2529N f8090b;

    /* JADX INFO: renamed from: c */
    public static final C2529N f8091c;

    /* JADX INFO: renamed from: a */
    public final C2540Z f8092a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        LinkedHashMap linkedHashMap = null;
        C2530O c2530o = null;
        C2538X c2538x = null;
        AbstractC2563w abstractC2563w = null;
        C2535U c2535u = null;
        f8090b = new C2529N(new C2540Z(c2530o, c2538x, abstractC2563w, c2535u, linkedHashMap, 127));
        f8091c = new C2529N(new C2540Z(c2530o, c2538x, abstractC2563w, c2535u, linkedHashMap, 95));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2529N(C2540Z c2540z) {
        this.f8092a = c2540z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2529N m4469a(C2529N c2529n) {
        C2540Z c2540z = c2529n.f8092a;
        C2530O c2530o = c2540z.f8107a;
        C2540Z c2540z2 = this.f8092a;
        if (c2530o == null) {
            c2530o = c2540z2.f8107a;
        }
        C2538X c2538x = c2540z.f8108b;
        if (c2538x == null) {
            c2538x = c2540z2.f8108b;
        }
        C2535U c2535u = c2540z.f8109c;
        if (c2535u == null) {
            c2535u = c2540z2.f8109c;
        }
        return new C2529N(new C2540Z(c2530o, c2538x, (AbstractC2563w) null, c2535u, c2540z.f8110d || c2540z2.f8110d, AbstractC0984x.m2036H(c2540z2.f8111e, c2540z.f8111e)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C2529N) && AbstractC1665j.m2981a(((C2529N) obj).f8092a, this.f8092a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8092a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f8090b)) {
            return "ExitTransition.None";
        }
        if (equals(f8091c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        C2540Z c2540z = this.f8092a;
        C2530O c2530o = c2540z.f8107a;
        sb.append(c2530o != null ? c2530o.toString() : null);
        sb.append(",\nSlide - ");
        C2538X c2538x = c2540z.f8108b;
        sb.append(c2538x != null ? c2538x.toString() : null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        C2535U c2535u = c2540z.f8109c;
        sb.append(c2535u != null ? c2535u.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c2540z.f8110d);
        return sb.toString();
    }
}
