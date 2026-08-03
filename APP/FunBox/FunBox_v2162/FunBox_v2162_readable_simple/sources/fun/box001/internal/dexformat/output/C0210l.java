package fun.box001.internal.dexformat.output;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: n.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0210l {

    /* JADX INFO: renamed from: a */
    private final Writer f812a;

    /* JADX INFO: renamed from: b */
    private final int f813b;

    /* JADX INFO: renamed from: c */
    private final StringBuffer f814c;

    /* JADX INFO: renamed from: d */
    private final StringBuffer f815d;

    /* JADX INFO: renamed from: e */
    private final C0204f f816e;

    /* JADX INFO: renamed from: f */
    private final C0204f f817f;

    public C0210l(StringWriter r4, int r5, int r6, String r7) {
        if (r4 == null) goto L14;
        if (r5 < 1) goto L12;
        if (r6 < 1) goto L10;
        StringWriter r0 = new StringWriter(1000);
        StringWriter r2 = new StringWriter(1000);
        this.f812a = r4;
        this.f813b = r5;
        this.f814c = r0.getBuffer();
        this.f815d = r2.getBuffer();
        this.f816e = new C0204f(r0, r5, "");
        this.f817f = new C0204f(r2, r6, r7);
        return;
    L10:
        throw new IllegalArgumentException("rightWidth < 1");
    L12:
        throw new IllegalArgumentException("leftWidth < 1");
    L14:
        throw new NullPointerException("out == null");
    }

    /* JADX INFO: renamed from: a */
    private static void m539a(StringBuffer r1, C0204f r2) {
        int r0 = r1.length();
        if (r0 != 0) goto L5;
        return;
    L5:
        if (r1.charAt(r0 - 1) == '\n') goto L9;
        r2.write(10);
        return;
    }

    /* JADX INFO: renamed from: c */
    private void m540c() {
    L2:
        StringBuffer r0 = this.f814c;
        int r2 = r0.indexOf("\n");
        if (r2 < 0) goto L4;
        StringBuffer r3 = this.f815d;
        int r1 = r3.indexOf("\n");
        if (r1 < 0) goto L7;
        Writer r5 = this.f812a;
        if (r2 == 0) goto L11;
        r5.write(r0.substring(0, r2));
    L11:
        if (r1 == 0) goto L16;
        int r6 = this.f813b - r2;
    L13:
        if (r6 <= 0) goto L15;
        r5.write(32);
        r6 = r6 - 1;
        goto L13
    L15:
        r5.write(r3.substring(0, r1));
    L16:
        r5.write(10);
        r0.delete(0, r2 + 1);
        r3.delete(0, r1 + 1);
        goto L2
    L7:
        return;
    }

    /* JADX INFO: renamed from: d */
    public static String m541d(String r3, int r4, String r5, int r6) {
        StringWriter r2 = new StringWriter((r3.length() + r5.length()) * 3);
        C0210l r0 = new C0210l(r2, r4, r6, "");
        r0.f816e.write(r3);     // Catch: IOException -> L6
        r0.f817f.write(r5);     // Catch: IOException -> L6
        r0.m542b();
        return r2.toString();
    L6:
        e = move-exception;
        throw new RuntimeException("shouldn't happen", e);
    }

    /* JADX INFO: renamed from: b */
    public final void m542b() {
        StringBuffer r0 = this.f815d;
        StringBuffer r1 = this.f814c;
        C0204f r2 = this.f817f;
        C0204f r3 = this.f816e;
        m539a(r1, r3);     // Catch: IOException -> L13
        m539a(r0, r2);     // Catch: IOException -> L13
        m540c();     // Catch: IOException -> L13
        m539a(r1, r3);     // Catch: IOException -> L13
    L5:
        if (r1.length() == 0) goto L7;
        r2.write(10);     // Catch: IOException -> L13
        m540c();     // Catch: IOException -> L13
        goto L5
    L7:
        m539a(r0, r2);     // Catch: IOException -> L13
    L8:
        if (r0.length() == 0) goto L12;
        r3.write(10);     // Catch: IOException -> L13
        m540c();     // Catch: IOException -> L13
        goto L8
    L12:
        return;
    L13:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
