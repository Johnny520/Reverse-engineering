package fun.box001.internal.dexformat.output;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0204f extends FilterWriter {

    /* JADX INFO: renamed from: a */
    private final String f800a;

    /* JADX INFO: renamed from: b */
    private final int f801b;

    /* JADX INFO: renamed from: c */
    private final int f802c;

    /* JADX INFO: renamed from: d */
    private int f803d;

    /* JADX INFO: renamed from: e */
    private boolean f804e;

    /* JADX INFO: renamed from: f */
    private int f805f;

    public C0204f(StringWriter r2, int r3, String r4) {
        super(r2);
        if (r3 < 0) goto L17;
        if (r3 == 0) goto L6;
        int r22 = r3;
    L7:
        this.f801b = r22;
        boolean r23 = true;
        int r32 = r3 >> 1;
        this.f802c = r32;
        if (r4.length() != 0) goto L10;
        r4 = null;
    L10:
        this.f800a = r4;
        this.f803d = 0;
        if (r32 != 0) goto L14;
        r23 = false;
    L14:
        this.f804e = r23;
        this.f805f = 0;
        return;
    L6:
        r22 = Integer.MAX_VALUE;
        goto L7
    L17:
        throw new IllegalArgumentException("width < 0");
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int r8) {
        Object r0 = ((FilterWriter) this).lock;
        monitor-enter(r0);
        boolean r3 = true;
        if (this.f804e == false) goto L12;
        if (r8 != 32) goto L10;
        int r1 = this.f805f + 1;     // Catch: Throwable -> L37
        this.f805f = r1;     // Catch: Throwable -> L37
        int r5 = this.f802c;     // Catch: Throwable -> L37
        if (r1 < r5) goto L12;
        this.f805f = r5;     // Catch: Throwable -> L37
    L10:
        this.f804e = false;     // Catch: Throwable -> L37
    L12:
        if (this.f803d != this.f801b) goto L16;
        if (r8 == 10) goto L16;
        ((FilterWriter) this).out.write(10);     // Catch: Throwable -> L37
        this.f803d = 0;     // Catch: Throwable -> L37
    L16:
        if (this.f803d != 0) goto L27;
        String r12 = this.f800a;     // Catch: Throwable -> L37
        if (r12 == null) goto L21;
        ((FilterWriter) this).out.write(r12);     // Catch: Throwable -> L37
    L21:
        if (this.f804e == true) goto L27;
        int r13 = 0;
    L23:
        int r52 = this.f805f;     // Catch: Throwable -> L37
        if (r13 >= r52) goto L26;
        ((FilterWriter) this).out.write(32);     // Catch: Throwable -> L37
        r13 = r13 + 1;     // Catch: Throwable -> L37
        goto L23
    L26:
        this.f803d = r52;     // Catch: Throwable -> L37
    L27:
        ((FilterWriter) this).out.write(r8);     // Catch: Throwable -> L37
        if (r8 != 10) goto L34;
        this.f803d = 0;     // Catch: Throwable -> L37
        if (this.f802c != 0) goto L33;
        r3 = false;
    L33:
        this.f804e = r3;     // Catch: Throwable -> L37
        this.f805f = 0;     // Catch: Throwable -> L37
    L35:
        monitor-exit(r0);     // Catch: Throwable -> L37
        return;
    L34:
        this.f803d++;
    L37:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String r3, int r4, int r5) {
        Object r0 = ((FilterWriter) this).lock;
        monitor-enter(r0);
    L4:
        if (r5 <= 0) goto L6;
        write(r3.charAt(r4));     // Catch: Throwable -> L8
        r4 = r4 + 1;     // Catch: Throwable -> L8
        r5 = r5 - 1;
    L8:
        th = move-exception;
        throw th;
    L6:
        monitor-exit(r0);     // Catch: Throwable -> L8
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] r3, int r4, int r5) {
        Object r0 = ((FilterWriter) this).lock;
        monitor-enter(r0);
    L4:
        if (r5 <= 0) goto L6;
        write(r3[r4]);     // Catch: Throwable -> L8
        r4 = r4 + 1;     // Catch: Throwable -> L8
        r5 = r5 - 1;
    L8:
        th = move-exception;
        throw th;
    L6:
        monitor-exit(r0);     // Catch: Throwable -> L8
    }
}
