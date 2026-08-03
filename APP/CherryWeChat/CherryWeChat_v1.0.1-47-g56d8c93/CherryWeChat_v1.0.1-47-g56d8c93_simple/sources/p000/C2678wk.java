package p000;

/* JADX INFO: renamed from: wk */
/* JADX INFO: loaded from: classes.dex */
public final class C2678wk {

    /* JADX INFO: renamed from: a */
    public static final C2678wk f9238a = null;

    static {
        C2678wk r0 = new C2678wk();
        if (AbstractC0628Oj.m1237a("  ") == false) goto L5;
    L9:
        f9238a = r0;
        return;
    L5:
        if (AbstractC0628Oj.m1237a("") == true) goto L9;
        if (AbstractC0628Oj.m1237a("") == true) goto L9;
        AbstractC0628Oj.m1237a("");
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public final void m5248a(StringBuilder r5, String r6) {
        r5.append(r6);
        r5.append("bytesPerLine = ");
        r5.append(Integer.MAX_VALUE);
        r5.append(",");
        r5.append('\n');
        r5.append(r6);
        r5.append("bytesPerGroup = ");
        r5.append(Integer.MAX_VALUE);
        r5.append(",");
        r5.append('\n');
        r5.append(r6);
        r5.append("groupSeparator = \"");
        r5.append("  ");
        r5.append("\",");
        r5.append('\n');
        r5.append(r6);
        r5.append("byteSeparator = \"");
        r5.append("");
        r5.append("\",");
        r5.append('\n');
        r5.append(r6);
        r5.append("bytePrefix = \"");
        r5.append("");
        r5.append("\",");
        r5.append('\n');
        r5.append(r6);
        r5.append("byteSuffix = \"");
        r5.append("");
        r5.append("\"");
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BytesHexFormat(\n");
        m5248a(r0, "    ");
        r0.append('\n');
        r0.append(")");
        return r0.toString();
    }
}
