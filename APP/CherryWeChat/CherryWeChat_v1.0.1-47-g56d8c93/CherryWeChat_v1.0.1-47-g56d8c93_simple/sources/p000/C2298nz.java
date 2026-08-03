package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: nz */
/* JADX INFO: loaded from: classes.dex */
public final class C2298nz implements Closeable {

    /* JADX INFO: renamed from: a */
    public final FileInputStream f8055a;

    /* JADX INFO: renamed from: b */
    public final Charset f8056b;

    /* JADX INFO: renamed from: c */
    public byte[] f8057c;

    /* JADX INFO: renamed from: d */
    public int f8058d;

    /* JADX INFO: renamed from: e */
    public int f8059e;

    public C2298nz(FileInputStream r2, Charset r3) {
        if (r3 == null) goto L11;
        if (r3.equals(AbstractC2794zD.f9462a) == false) goto L9;
        this.f8055a = r2;
        this.f8056b = r3;
        this.f8057c = new byte[8192];
        return;
    L9:
        throw new IllegalArgumentException("Unsupported encoding");
    L11:
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileInputStream r0 = this.f8055a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f8057c == null) goto L9;
        this.f8057c = null;     // Catch: Throwable -> L7
        this.f8055a.close();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    /* JADX INFO: renamed from: d */
    public final String m4673d() {
        FileInputStream r0 = this.f8055a;
        monitor-enter(r0);
        byte[] r1 = this.f8057c;     // Catch: Throwable -> L23
        if (r1 == null) goto L48;
        if (this.f8058d < this.f8059e) goto L13;
        int r12 = this.f8055a.read(r1, 0, r1.length);     // Catch: Throwable -> L23
        if (r12 == (-1)) goto L12;
        this.f8058d = 0;     // Catch: Throwable -> L23
        this.f8059e = r12;     // Catch: Throwable -> L23
        goto L13
    L12:
        throw new EOFException();     // Catch: Throwable -> L23
    L13:
        int r13 = this.f8058d;     // Catch: Throwable -> L23
    L15:
        if (r13 == this.f8059e) goto L30;
        byte[] r2 = this.f8057c;     // Catch: Throwable -> L23
        if (r2[r13] == 10) goto L18;
        r13 = r13 + 1;     // Catch: Throwable -> L23
        goto L15
    L18:
        int r3 = this.f8058d;     // Catch: Throwable -> L23
        if (r13 == r3) goto L25;
        int r4 = r13 - 1;
        if (r2[r4] != 13) goto L25;
    L26:
        String r5 = new String(r2, r3, r4 - r3, this.f8056b.name());     // Catch: Throwable -> L23
        this.f8058d = r13 + 1;     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return r5;
    L25:
        r4 = r13;
        goto L26
    L30:
        C2255mz r14 = new C2255mz(this, (this.f8059e - this.f8058d) + 80);     // Catch: Throwable -> L23
    L31:
        byte[] r22 = this.f8057c;     // Catch: Throwable -> L23
        int r6 = this.f8058d;     // Catch: Throwable -> L23
        r14.write(r22, r6, this.f8059e - r6);     // Catch: Throwable -> L23
        this.f8059e = -1;     // Catch: Throwable -> L23
        FileInputStream r23 = this.f8055a;     // Catch: Throwable -> L23
        byte[] r62 = this.f8057c;     // Catch: Throwable -> L23
        int r24 = r23.read(r62, 0, r62.length);     // Catch: Throwable -> L23
        if (r24 == (-1)) goto L46;
        this.f8058d = 0;     // Catch: Throwable -> L23
        this.f8059e = r24;     // Catch: Throwable -> L23
        int r25 = 0;
    L35:
        if (r25 == this.f8059e) goto L31;
        byte[] r63 = this.f8057c;     // Catch: Throwable -> L23
        if (r63[r25] == 10) goto L38;
        r25 = r25 + 1;     // Catch: Throwable -> L23
        goto L35
    L38:
        int r32 = this.f8058d;     // Catch: Throwable -> L23
        if (r25 == r32) goto L41;
        r14.write(r63, r32, r25 - r32);     // Catch: Throwable -> L23
    L41:
        this.f8058d = r25 + 1;     // Catch: Throwable -> L23
        String r15 = r14.toString();     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return r15;
    L46:
        throw new EOFException();     // Catch: Throwable -> L23
    L48:
        throw new IOException("LineReader is closed");     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }
}
