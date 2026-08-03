package fun.box001.internal.error;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes.dex */
public class DexGenerationException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private StringBuffer f0a;

    public DexGenerationException(String r3, Exception r4) {
        if (r3 != null) goto L7;
        if (r4 == null) goto L6;
        r3 = r4.getMessage();
        goto L7
    L6:
        r3 = null;
    L7:
        super(r3, r4);
        if ((r4 instanceof DexGenerationException) == false) goto L10;
        String r32 = ((DexGenerationException) r4).f0a.toString();
        StringBuffer r42 = new StringBuffer(r32.length() + 200);
        this.f0a = r42;
        r42.append(r32);
        return;
    L10:
        this.f0a = new StringBuffer(200);
    }

    /* JADX INFO: renamed from: b */
    public static DexGenerationException m22b(String r2, Exception r3) {
        if ((r3 instanceof DexGenerationException) == false) goto L5;
        DexGenerationException r32 = (DexGenerationException) r3;
    L6:
        r32.m23a(r2);
        return r32;
    L5:
        r32 = new DexGenerationException(null, r3);
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final void m23a(String r2) {
        if (r2 == null) goto L8;
        this.f0a.append(r2);
        if (r2.endsWith("\n") == true) goto L9;
        this.f0a.append('\n');
        return;
    L9:
        return;
    L8:
        throw new NullPointerException("str == null");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream r2) {
        super.printStackTrace(r2);
        r2.println(this.f0a);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter r2) {
        super.printStackTrace(r2);
        r2.println(this.f0a);
    }
}
