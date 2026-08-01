package p000;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0877x1 {

    /* JADX INFO: renamed from: a */
    public int f5152a;

    /* JADX INFO: renamed from: b */
    public int f5153b;

    /* JADX INFO: renamed from: c */
    public int f5154c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0877x1.class != obj.getClass()) {
                return false;
            }
            C0877x1 c0877x1 = (C0877x1) obj;
            int i = this.f5152a;
            if (i != c0877x1.f5152a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f5154c - this.f5153b) != 1 || this.f5154c != c0877x1.f5153b || this.f5153b != c0877x1.f5154c) {
                return this.f5154c == c0877x1.f5154c && this.f5153b == c0877x1.f5153b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5152a * 31) + this.f5153b) * 31) + this.f5154c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f5152a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f5153b);
        sb.append("c:");
        sb.append(this.f5154c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
