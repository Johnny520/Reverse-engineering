package p000;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf2 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6099a;

    /* JADX INFO: renamed from: b */
    public final List f6100b;

    public lf2(LinkedHashMap linkedHashMap, List list) {
        this.f6099a = linkedHashMap;
        this.f6100b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2)) {
            return false;
        }
        lf2 lf2Var = (lf2) obj;
        return this.f6099a.equals(lf2Var.f6099a) && this.f6100b.equals(lf2Var.f6100b);
    }

    public final int hashCode() {
        return this.f6100b.hashCode() + ((this.f6099a.hashCode() + (Integer.hashCode(1) * 31)) * 31);
    }

    public final String toString() {
        return "ScriptConfigSchema(schemaVersion=1, properties=" + this.f6099a + ", sections=" + this.f6100b + ")";
    }
}
