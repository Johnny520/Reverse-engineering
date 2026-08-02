package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yk2 {

    /* JADX INFO: renamed from: a */
    public final String f13502a;

    /* JADX INFO: renamed from: b */
    public final String f13503b;

    public yk2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13502a = str;
        this.f13503b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk2)) {
            return false;
        }
        yk2 yk2Var = (yk2) obj;
        return t11.m5086l(this.f13502a, yk2Var.f13502a) && t11.m5086l(this.f13503b, yk2Var.f13503b);
    }

    public final int hashCode() {
        return this.f13503b.hashCode() + (this.f13502a.hashCode() * 31);
    }

    public final String toString() {
        return vi0.m5692k("ScriptUiContext(scriptId=", this.f13502a, ", scriptName=", this.f13503b, ")");
    }
}
