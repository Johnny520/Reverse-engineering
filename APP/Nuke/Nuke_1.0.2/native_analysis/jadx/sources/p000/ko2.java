package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements oo2 {

    /* JADX INFO: renamed from: a */
    public final String f5694a;

    /* JADX INFO: renamed from: b */
    public final String f5695b;

    /* JADX INFO: renamed from: c */
    public final String f5696c;

    public ko2(String str, String str2, String str3) {
        this.f5694a = str;
        this.f5695b = str2;
        this.f5696c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko2)) {
            return false;
        }
        ko2 ko2Var = (ko2) obj;
        return this.f5694a.equals(ko2Var.f5694a) && this.f5695b.equals(ko2Var.f5695b) && this.f5696c.equals(ko2Var.f5696c);
    }

    public final int hashCode() {
        return this.f5696c.hashCode() + hk1.m2207f(this.f5695b, this.f5694a.hashCode() * 31, 31);
    }

    public final String toString() {
        return hk1.m2211j(vi0.m5696o("Image(talker=", this.f5694a, ", imagePath=", this.f5695b, ", taskClassName="), this.f5696c, ")");
    }
}
