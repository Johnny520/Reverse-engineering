package p000;

/* JADX INFO: renamed from: rz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2478rz {

    /* JADX INFO: renamed from: a */
    public static final String[] f8711a = null;

    static {
        String[] r1 = new String[93];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 32) goto L6;
        r1[r3] = "\\u" + m4965b(r3 >> 12) + m4965b(r3 >> 8) + m4965b(r3 >> 4) + m4965b(r3);
        r3 = r3 + 1;
        goto L4
    L6:
        r1[34] = "\\\"";
        r1[92] = "\\\\";
        r1[9] = "\\t";
        r1[8] = "\\b";
        r1[10] = "\\n";
        r1[13] = "\\r";
        r1[12] = "\\f";
        f8711a = r1;
        byte[] r0 = new byte[93];
    L7:
        if (r2 >= 32) goto L9;
        r0[r2] = 1;
        r2 = r2 + 1;
        goto L7
    L9:
        r0[34] = 34;
        r0[92] = 92;
        r0[9] = 116;
        r0[8] = 98;
        r0[10] = 110;
        r0[13] = 114;
        r0[12] = 102;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4964a(StringBuilder r7, String r8) {
        r7.append('\"');
        int r1 = r8.length();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L10;
        char r4 = r8.charAt(r2);
        String[] r5 = f8711a;
        if (r4 >= r5.length) goto L9;
        if (r5[r4] == null) goto L9;
        r7.append(r8, r3, r2);
        r7.append(r5[r4]);
        r3 = r2 + 1;
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        if (r3 == 0) goto L12;
        r7.append(r8, r3, r8.length());
    L13:
        r7.append('\"');
        return;
    L12:
        r7.append(r8);
        goto L13
    }

    /* JADX INFO: renamed from: b */
    public static final char m4965b(int r1) {
        int r12 = r1 & 15;
        if (r12 >= 10) goto L7;
        int r13 = r12 + 48;
    L6:
        return (char) r13;
    L7:
        r13 = r12 + 87;
        goto L6
    }
}
