package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qf2 {

    /* JADX INFO: renamed from: a */
    public final String f8953a;

    /* JADX INFO: renamed from: b */
    public final String f8954b;

    /* JADX INFO: renamed from: c */
    public final List f8955c;

    public qf2(String str, String str2, List list) {
        str.getClass();
        this.f8953a = str;
        this.f8954b = str2;
        this.f8955c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf2)) {
            return false;
        }
        qf2 qf2Var = (qf2) obj;
        return t11.m5086l(this.f8953a, qf2Var.f8953a) && this.f8954b.equals(qf2Var.f8954b) && this.f8955c.equals(qf2Var.f8955c);
    }

    public final int hashCode() {
        return this.f8955c.hashCode() + hk1.m2207f(this.f8954b, this.f8953a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ScriptConfigSection(id=", this.f8953a, ", title=", this.f8954b, ", properties=");
        sbM5696o.append(this.f8955c);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
