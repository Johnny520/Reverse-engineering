package p049I2;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: I2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0799q implements Comparable {

    /* JADX INFO: renamed from: d */
    public int f2575d;

    /* JADX INFO: renamed from: e */
    public int f2576e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2575d - ((C0799q) obj).f2575d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{start=");
        sb.append(this.f2575d);
        sb.append(", end=");
        return AbstractC3202a.m5466a(sb, this.f2576e, '}');
    }
}
