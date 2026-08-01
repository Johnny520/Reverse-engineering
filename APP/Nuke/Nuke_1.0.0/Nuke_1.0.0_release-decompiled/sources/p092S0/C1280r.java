package p092S0;

import p011B4.AbstractC0231b;
import p130a1.C1791d;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: S0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1280r {

    /* JADX INFO: renamed from: a */
    public final C1791d f4602a;

    /* JADX INFO: renamed from: b */
    public final int f4603b;

    /* JADX INFO: renamed from: c */
    public final int f4604c;

    public C1280r(C1791d c1791d, int i5, int i6) {
        this.f4602a = c1791d;
        this.f4603b = i5;
        this.f4604c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1280r)) {
            return false;
        }
        C1280r c1280r = (C1280r) obj;
        return this.f4602a.equals(c1280r.f4602a) && this.f4603b == c1280r.f4603b && this.f4604c == c1280r.f4604c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4604c) + AbstractC0231b.m391b(this.f4603b, this.f4602a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f4602a);
        sb.append(", startIndex=");
        sb.append(this.f4603b);
        sb.append(", endIndex=");
        return AbstractC3202a.m5466a(sb, this.f4604c, ')');
    }
}
