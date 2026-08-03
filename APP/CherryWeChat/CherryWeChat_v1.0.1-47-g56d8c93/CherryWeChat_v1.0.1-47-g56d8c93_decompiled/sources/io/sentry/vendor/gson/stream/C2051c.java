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
    public static final String[] f7262i = new String[128];

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
        for (int i = 0; i <= 31; i++) {
            f7262i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f7262i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C2051c(Writer writer) {
        int[] iArr = new int[32];
        this.f7264b = iArr;
        this.f7265c = 0;
        if (iArr.length == 0) {
            this.f7264b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f7264b;
        int i = this.f7265c;
        this.f7265c = i + 1;
        iArr2[i] = 6;
        this.f7267e = ":";
        this.f7270h = true;
        this.f7263a = writer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7263a.close();
        int i = this.f7265c;
        if (i > 1 || (i == 1 && this.f7264b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7265c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4217d() throws IOException {
        int iM4221m = m4221m();
        if (iM4221m == 1) {
            this.f7264b[this.f7265c - 1] = 2;
            m4219i();
            return;
        }
        Writer writer = this.f7263a;
        if (iM4221m == 2) {
            writer.append(',');
            m4219i();
        } else {
            if (iM4221m == 4) {
                writer.append((CharSequence) this.f7267e);
                this.f7264b[this.f7265c - 1] = 5;
                return;
            }
            if (iM4221m != 6) {
                if (iM4221m != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f7268f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f7264b[this.f7265c - 1] = 7;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4218f(int i, int i2, char c) throws IOException {
        int iM4221m = m4221m();
        if (iM4221m != i2 && iM4221m != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f7269g != null) {
            throw new IllegalStateException("Dangling name: " + this.f7269g);
        }
        this.f7265c--;
        if (iM4221m == i2) {
            m4219i();
        }
        this.f7263a.write(c);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f7265c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7263a.flush();
    }

    /* JADX INFO: renamed from: i */
    public final void m4219i() throws IOException {
        if (this.f7266d == null) {
            return;
        }
        Writer writer = this.f7263a;
        writer.write(10);
        int i = this.f7265c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f7266d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4220l() throws IOException {
        if (this.f7269g != null) {
            if (!this.f7270h) {
                this.f7269g = null;
                return;
            }
            m4223p();
        }
        m4217d();
        this.f7263a.write("null");
    }

    /* JADX INFO: renamed from: m */
    public final int m4221m() {
        int i = this.f7265c;
        if (i != 0) {
            return this.f7264b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4222o(String str) throws IOException {
        String str2;
        Writer writer = this.f7263a;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = f7262i[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: p */
    public final void m4223p() throws IOException {
        if (this.f7269g != null) {
            int iM4221m = m4221m();
            if (iM4221m == 5) {
                this.f7263a.write(44);
            } else if (iM4221m != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m4219i();
            this.f7264b[this.f7265c - 1] = 4;
            m4222o(this.f7269g);
            this.f7269g = null;
        }
    }
}
