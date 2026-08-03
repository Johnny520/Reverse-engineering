package p000;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1347e1 {

    /* JADX INFO: renamed from: a */
    public int f4841a;

    /* JADX INFO: renamed from: b */
    public int f4842b;

    /* JADX INFO: renamed from: c */
    public Object f4843c;

    /* JADX INFO: renamed from: d */
    public int f4844d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1347e1)) {
                return false;
            }
            C1347e1 c1347e1 = (C1347e1) obj;
            int i = this.f4841a;
            if (i != c1347e1.f4841a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f4844d - this.f4842b) != 1 || this.f4844d != c1347e1.f4842b || this.f4842b != c1347e1.f4844d) {
                if (this.f4844d != c1347e1.f4844d || this.f4842b != c1347e1.f4842b) {
                    return false;
                }
                Object obj2 = this.f4843c;
                if (obj2 != null) {
                    if (!obj2.equals(c1347e1.f4843c)) {
                        return false;
                    }
                } else if (c1347e1.f4843c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f4841a * 31) + this.f4842b) * 31) + this.f4844d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f4841a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f4842b);
        sb.append("c:");
        sb.append(this.f4844d);
        sb.append(",p:");
        sb.append(this.f4843c);
        sb.append("]");
        return sb.toString();
    }
}
