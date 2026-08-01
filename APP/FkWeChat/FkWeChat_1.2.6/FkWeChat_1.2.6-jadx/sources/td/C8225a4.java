package td;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: td.a4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8225a4 {

    /* JADX INFO: renamed from: a */
    public final String f27535a;

    /* JADX INFO: renamed from: b */
    public final double f27536b;

    /* JADX INFO: renamed from: c */
    public final double f27537c;

    public C8225a4(String str, double d10, double d11) {
        str.getClass();
        this.f27535a = str;
        this.f27536b = d10;
        this.f27537c = d11;
    }

    /* JADX INFO: renamed from: a */
    public final double m31920a() {
        return this.f27536b;
    }

    /* JADX INFO: renamed from: b */
    public final double m31921b() {
        return this.f27537c;
    }

    /* JADX INFO: renamed from: c */
    public final String m31922c() {
        return this.f27535a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8225a4)) {
            return false;
        }
        C8225a4 c8225a4 = (C8225a4) obj;
        return AbstractC1061t.m3842c(this.f27535a, c8225a4.f27535a) && Double.compare(this.f27536b, c8225a4.f27536b) == 0 && Double.compare(this.f27537c, c8225a4.f27537c) == 0;
    }

    public int hashCode() {
        return (((this.f27535a.hashCode() * 31) + Double.hashCode(this.f27536b)) * 31) + Double.hashCode(this.f27537c);
    }

    public String toString() {
        return "OsmPlace(name=" + this.f27535a + ", lat=" + this.f27536b + ", lng=" + this.f27537c + ")";
    }
}
