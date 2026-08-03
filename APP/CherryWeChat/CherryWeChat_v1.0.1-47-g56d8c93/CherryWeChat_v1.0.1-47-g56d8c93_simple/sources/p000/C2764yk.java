package p000;

/* JADX INFO: renamed from: yk */
/* JADX INFO: loaded from: classes.dex */
public final class C2764yk {

    /* JADX INFO: renamed from: c */
    public static final C2764yk f9401c = null;

    /* JADX INFO: renamed from: a */
    public final C2678wk f9402a;

    /* JADX INFO: renamed from: b */
    public final C2721xk f9403b;

    static {
        f9401c = new C2764yk(C2678wk.f9238a, C2721xk.f9301b);
    }

    public C2764yk(C2678wk r1, C2721xk r2) {
        this.f9402a = r1;
        this.f9403b = r2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.f9402a.m5248a(r0, "        ");
        r0.append('\n');
        r0.append("    ),");
        r0.append('\n');
        r0.append("    number = NumberHexFormat(");
        r0.append('\n');
        this.f9403b.m5287a(r0, "        ");
        r0.append('\n');
        r0.append("    )");
        r0.append('\n');
        r0.append(")");
        return r0.toString();
    }
}
