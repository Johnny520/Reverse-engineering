package p000;

/* JADX INFO: renamed from: wk */
/* JADX INFO: loaded from: classes.dex */
public final class C2678wk {

    /* JADX INFO: renamed from: a */
    public static final C2678wk f9238a;

    static {
        C2678wk c2678wk = new C2678wk();
        if (!AbstractC0628Oj.m1237a("  ") && !AbstractC0628Oj.m1237a("") && !AbstractC0628Oj.m1237a("")) {
            AbstractC0628Oj.m1237a("");
        }
        f9238a = c2678wk;
    }

    /* JADX INFO: renamed from: a */
    public final void m5248a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytePrefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        m5248a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
