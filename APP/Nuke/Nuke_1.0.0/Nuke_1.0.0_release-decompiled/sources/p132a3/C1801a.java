package p132a3;

/* JADX INFO: renamed from: a3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1801a {

    /* JADX INFO: renamed from: a */
    public final float f6139a;

    public C1801a(float f2) {
        this.f6139a = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1801a)) {
            return false;
        }
        float f2 = this.f6139a;
        return (0.0f > f2 && 0.0f > ((C1801a) obj).f6139a) || f2 == ((C1801a) obj).f6139a;
    }

    public final int hashCode() {
        float f2 = this.f6139a;
        if (0.0f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.f6139a;
    }
}
