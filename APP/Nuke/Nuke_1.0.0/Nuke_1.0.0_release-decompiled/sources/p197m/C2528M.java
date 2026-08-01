package p197m;

import java.util.LinkedHashMap;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: m.M */
/* JADX INFO: loaded from: classes.dex */
public final class C2528M {

    /* JADX INFO: renamed from: b */
    public static final C2528M f8088b = new C2528M(new C2540Z((C2530O) null, (C2538X) null, (AbstractC2563w) null, (C2535U) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a */
    public final C2540Z f8089a;

    public C2528M(C2540Z c2540z) {
        this.f8089a = c2540z;
    }

    /* JADX INFO: renamed from: a */
    public final C2528M m4468a(C2528M c2528m) {
        C2540Z c2540z = c2528m.f8089a;
        C2530O c2530o = c2540z.f8107a;
        C2540Z c2540z2 = this.f8089a;
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
        return new C2528M(new C2540Z(c2530o, c2538x, (AbstractC2563w) null, c2535u, AbstractC0984x.m2036H(c2540z2.f8111e, c2540z.f8111e), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2528M) && AbstractC1665j.m2981a(((C2528M) obj).f8089a, this.f8089a);
    }

    public final int hashCode() {
        return this.f8089a.hashCode();
    }

    public final String toString() {
        if (equals(f8088b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C2540Z c2540z = this.f8089a;
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
        return sb.toString();
    }
}
