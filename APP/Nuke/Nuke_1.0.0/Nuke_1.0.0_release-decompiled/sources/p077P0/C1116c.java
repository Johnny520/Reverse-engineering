package p077P0;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: P0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1116c {

    /* JADX INFO: renamed from: a */
    public final int f3637a;

    /* JADX INFO: renamed from: b */
    public final int f3638b;

    public C1116c(int i5, int i6) {
        this.f3637a = i5;
        this.f3638b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1116c)) {
            return false;
        }
        C1116c c1116c = (C1116c) obj;
        return this.f3637a == c1116c.f3637a && this.f3638b == c1116c.f3638b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3638b) + (Integer.hashCode(this.f3637a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f3637a);
        sb.append(", columnCount=");
        return AbstractC3202a.m5466a(sb, this.f3638b, ')');
    }
}
