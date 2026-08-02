package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ad3 implements bd3 {

    /* JADX INFO: renamed from: a */
    public final Object f163a;

    public ad3(Object obj) {
        this.f163a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad3) && t11.m5086l(this.f163a, ((ad3) obj).f163a);
    }

    public final int hashCode() {
        Object obj = this.f163a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Ok(data=" + this.f163a + ")";
    }
}
