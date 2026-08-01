package p000;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0877x1 {

    /* JADX INFO: renamed from: a */
    public int f5080a;

    /* JADX INFO: renamed from: b */
    public int f5081b;

    /* JADX INFO: renamed from: c */
    public int f5082c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0877x1.class != obj.getClass()) {
                return false;
            }
            C0877x1 c0877x1 = (C0877x1) obj;
            int i = this.f5080a;
            if (i != c0877x1.f5080a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f5082c - this.f5081b) != 1 || this.f5082c != c0877x1.f5081b || this.f5081b != c0877x1.f5082c) {
                return this.f5082c == c0877x1.f5082c && this.f5081b == c0877x1.f5081b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5080a * 31) + this.f5081b) * 31) + this.f5082c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f5080a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f5081b);
        sb.append("c:");
        sb.append(this.f5082c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
