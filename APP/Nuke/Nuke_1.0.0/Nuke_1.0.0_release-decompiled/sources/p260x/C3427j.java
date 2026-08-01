package p260x;

import p237s4.AbstractC3202a;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: x.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3427j {

    /* JADX INFO: renamed from: a */
    public final int f10709a;

    /* JADX INFO: renamed from: b */
    public final int f10710b;

    public C3427j(int i5, int i6) {
        this.f10709a = i5;
        this.f10710b = i6;
        if (!(i5 >= 0)) {
            AbstractC3204b.m5475a("negative start index");
        }
        if (i6 >= i5) {
            return;
        }
        AbstractC3204b.m5475a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3427j)) {
            return false;
        }
        C3427j c3427j = (C3427j) obj;
        return this.f10709a == c3427j.f10709a && this.f10710b == c3427j.f10710b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10710b) + (Integer.hashCode(this.f10709a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f10709a);
        sb.append(", end=");
        return AbstractC3202a.m5466a(sb, this.f10710b, ')');
    }
}
