package p067N0;

import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;
import p245u0.C3309f;

/* JADX INFO: renamed from: N0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1007a {

    /* JADX INFO: renamed from: a */
    public final C3309f f3121a;

    /* JADX INFO: renamed from: b */
    public final int f3122b;

    public C1007a(C3309f c3309f, int i5) {
        this.f3121a = c3309f;
        this.f3122b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1007a)) {
            return false;
        }
        C1007a c1007a = (C1007a) obj;
        return AbstractC1665j.m2981a(this.f3121a, c1007a.f3121a) && this.f3122b == c1007a.f3122b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3122b) + (this.f3121a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f3121a);
        sb.append(", configFlags=");
        return AbstractC3202a.m5466a(sb, this.f3122b, ')');
    }
}
