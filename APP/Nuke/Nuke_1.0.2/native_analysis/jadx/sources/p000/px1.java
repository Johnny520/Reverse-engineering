package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 {

    /* JADX INFO: renamed from: a */
    public final String f8640a;

    /* JADX INFO: renamed from: b */
    public final String f8641b;

    public px1(String str, String str2) {
        this.f8640a = str;
        this.f8641b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px1)) {
            return false;
        }
        px1 px1Var = (px1) obj;
        return this.f8640a.equals(px1Var.f8640a) && t11.m5086l(this.f8641b, px1Var.f8641b);
    }

    public final int hashCode() {
        int iHashCode = this.f8640a.hashCode() * 31;
        String str = this.f8641b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vi0.m5692k("ParsedMessageContent(content=", this.f8640a, ", sender=", this.f8641b, ")");
    }
}
