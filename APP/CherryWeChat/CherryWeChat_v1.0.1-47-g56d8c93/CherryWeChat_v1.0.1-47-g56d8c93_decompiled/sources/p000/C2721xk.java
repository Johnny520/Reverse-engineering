package p000;

/* JADX INFO: renamed from: xk */
/* JADX INFO: loaded from: classes.dex */
public final class C2721xk {

    /* JADX INFO: renamed from: b */
    public static final C2721xk f9301b = new C2721xk();

    /* JADX INFO: renamed from: a */
    public final boolean f9302a = true;

    public C2721xk() {
        if (AbstractC0628Oj.m1237a("")) {
            return;
        }
        AbstractC0628Oj.m1237a("");
    }

    /* JADX INFO: renamed from: a */
    public final void m5287a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        m5287a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
