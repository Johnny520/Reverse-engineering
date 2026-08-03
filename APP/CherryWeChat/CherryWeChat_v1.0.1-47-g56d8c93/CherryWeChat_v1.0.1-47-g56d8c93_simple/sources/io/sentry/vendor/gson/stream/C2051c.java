package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2051c implements Closeable, Flushable {

    /* JADX INFO: renamed from: i */
    public static final String[] f7262i = null;

    /* JADX INFO: renamed from: a */
    public final Writer f7263a;

    /* JADX INFO: renamed from: b */
    public int[] f7264b;

    /* JADX INFO: renamed from: c */
    public int f7265c;

    /* JADX INFO: renamed from: d */
    public String f7266d;

    /* JADX INFO: renamed from: e */
    public String f7267e;

    /* JADX INFO: renamed from: f */
    public boolean f7268f;

    /* JADX INFO: renamed from: g */
    public String f7269g;

    /* JADX INFO: renamed from: h */
    public final boolean f7270h;

    static {
        f7262i = new String[128];
        int r0 = 0;
    L4:
        if (r0 > 31) goto L6;
        f7262i[r0] = String.format("\\u%04x", new Object[]{Integer.valueOf(r0)});
        r0 = r0 + 1;
        goto L4
    L6:
        String[] r02 = f7262i;
        r02[34] = "\\\"";
        r02[92] = "\\\\";
        r02[9] = "\\t";
        r02[8] = "\\b";
        r02[10] = "\\n";
        r02[13] = "\\r";
        r02[12] = "\\f";
        String[] r03 = (String[]) r02.clone();
        r03[60] = "\\u003c";
        r03[62] = "\\u003e";
        r03[38] = "\\u0026";
        r03[61] = "\\u003d";
        r03[39] = "\\u0027";
    }

    public C2051c(Writer r4) {
        int[] r0 = new int[32];
        this.f7264b = r0;
        this.f7265c = 0;
        if (r0.length != 0) goto L5;
        this.f7264b = Arrays.copyOf(r0, 0);
    L5:
        int[] r02 = this.f7264b;
        int r1 = this.f7265c;
        this.f7265c = r1 + 1;
        r02[r1] = 6;
        this.f7267e = ":";
        this.f7270h = true;
        this.f7263a = r4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7263a.close();
        int r0 = this.f7265c;
        if (r0 > 1) goto L10;
        if (r0 == 1) goto L6;
    L7:
        this.f7265c = 0;
        return;
    L6:
        if (this.f7264b[r0 - 1] == 7) goto L7;
    L10:
        throw new IOException("Incomplete document");
    }

    /* JADX INFO: renamed from: d */
    public final void m4217d() {
        int r0 = m4221m();
        if (r0 == 1) goto L24;
        Writer r3 = this.f7263a;
        if (r0 != 2) goto L7;
        r3.append(',');
        m4219i();
        return;
    L7:
        if (r0 != 4) goto L9;
        r3.append(this.f7267e);
        this.f7264b[this.f7265c - 1] = 5;
        return;
    L9:
        if (r0 == 6) goto L18;
        if (r0 != 7) goto L17;
        if (this.f7268f == true) goto L18;
        throw new IllegalStateException("JSON must have only one top-level value.");
    L17:
        throw new IllegalStateException("Nesting problem.");
    L18:
        this.f7264b[this.f7265c - 1] = 7;
        return;
    L24:
        this.f7264b[this.f7265c - 1] = 2;
        m4219i();
    }

    /* JADX INFO: renamed from: f */
    public final void m4218f(int r2, int r3, char r4) {
        int r0 = m4221m();
        if (r0 == r3) goto L9;
        if (r0 == r2) goto L9;
        throw new IllegalStateException("Nesting problem.");
    L9:
        if (this.f7269g != null) goto L16;
        this.f7265c--;
        if (r0 != r3) goto L13;
        m4219i();
    L13:
        this.f7263a.write(r4);
        return;
    L16:
        throw new IllegalStateException("Dangling name: " + this.f7269g);
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f7265c == 0) goto L7;
        this.f7263a.flush();
        return;
    L7:
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: i */
    public final void m4219i() {
        if (this.f7266d == null) goto L8;
        Writer r1 = this.f7263a;
        r1.write(10);
        int r0 = this.f7265c;
        int r2 = 1;
    L6:
        if (r2 >= r0) goto L10;
        r1.write(this.f7266d);
        r2 = r2 + 1;
        goto L6
    L10:
        return;
    }

    /* JADX INFO: renamed from: l */
    public final void m4220l() {
        if (this.f7269g != null) goto L5;
    L9:
        m4217d();
        this.f7263a.write("null");
        return;
    L5:
        if (this.f7270h == false) goto L7;
        m4223p();
        goto L9
    L7:
        this.f7269g = null;
    }

    /* JADX INFO: renamed from: m */
    public final int m4221m() {
        int r0 = this.f7265c;
        if (r0 == 0) goto L7;
        return this.f7264b[r0 - 1];
    L7:
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: o */
    public final void m4222o(String r8) {
        Writer r0 = this.f7263a;
        r0.write(34);
        int r2 = r8.length();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L19;
        char r5 = r8.charAt(r3);
        if (r5 >= 128) goto L10;
        String r52 = f7262i[r5];
        if (r52 == null) goto L18;
    L15:
        if (r4 >= r3) goto L17;
        r0.write(r8, r4, r3 - r4);
    L17:
        r0.write(r52);
        r4 = r3 + 1;
    L18:
        r3 = r3 + 1;
        goto L3
    L10:
        if (r5 != 8232) goto L13;
        r52 = "\\u2028";
        goto L15
    L13:
        if (r5 != 8233) goto L18;
        r52 = "\\u2029";
        goto L15
    L19:
        if (r4 >= r2) goto L21;
        r0.write(r8, r4, r2 - r4);
    L21:
        r0.write(34);
    }

    /* JADX INFO: renamed from: p */
    public final void m4223p() {
        if (this.f7269g == null) goto L13;
        int r0 = m4221m();
        if (r0 != 5) goto L8;
        this.f7263a.write(44);
    L9:
        m4219i();
        this.f7264b[this.f7265c - 1] = 4;
        m4222o(this.f7269g);
        this.f7269g = null;
        return;
    L8:
        if (r0 == 3) goto L9;
        throw new IllegalStateException("Nesting problem.");
    }
}
