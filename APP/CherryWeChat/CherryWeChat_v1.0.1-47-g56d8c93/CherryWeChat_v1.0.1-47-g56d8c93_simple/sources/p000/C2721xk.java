package p000;

/* JADX INFO: renamed from: xk */
/* JADX INFO: loaded from: classes.dex */
public final class C2721xk {

    /* JADX INFO: renamed from: b */
    public static final C2721xk f9301b = null;

    /* JADX INFO: renamed from: a */
    public final boolean f9302a;

    static {
        f9301b = new C2721xk();
    }

    public C2721xk() {
        this.f9302a = true;
        if (AbstractC0628Oj.m1237a("") == true) goto L6;
        AbstractC0628Oj.m1237a("");
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m5287a(StringBuilder r5, String r6) {
        r5.append(r6);
        r5.append("prefix = \"");
        r5.append("");
        r5.append("\",");
        r5.append('\n');
        r5.append(r6);
        r5.append("suffix = \"");
        r5.append("");
        r5.append("\",");
        r5.append('\n');
        r5.append(r6);
        r5.append("removeLeadingZeros = ");
        r5.append(false);
        r5.append(',');
        r5.append('\n');
        r5.append(r6);
        r5.append("minLength = ");
        r5.append(1);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("NumberHexFormat(\n");
        m5287a(r0, "    ");
        r0.append('\n');
        r0.append(")");
        return r0.toString();
    }
}
