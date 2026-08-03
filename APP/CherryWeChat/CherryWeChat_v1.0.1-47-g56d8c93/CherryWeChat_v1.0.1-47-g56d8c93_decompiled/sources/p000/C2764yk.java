package p000;

/* JADX INFO: renamed from: yk */
/* JADX INFO: loaded from: classes.dex */
public final class C2764yk {

    /* JADX INFO: renamed from: c */
    public static final C2764yk f9401c = new C2764yk(C2678wk.f9238a, C2721xk.f9301b);

    /* JADX INFO: renamed from: a */
    public final C2678wk f9402a;

    /* JADX INFO: renamed from: b */
    public final C2721xk f9403b;

    public C2764yk(C2678wk c2678wk, C2721xk c2721xk) {
        this.f9402a = c2678wk;
        this.f9403b = c2721xk;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.f9402a.m5248a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f9403b.m5287a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
