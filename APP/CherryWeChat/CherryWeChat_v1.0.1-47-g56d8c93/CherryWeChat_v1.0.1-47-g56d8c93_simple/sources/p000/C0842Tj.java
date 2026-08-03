package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Tj */
/* JADX INFO: loaded from: classes.dex */
public final class C0842Tj extends Exception {

    /* JADX INFO: renamed from: f */
    public static final StackTraceElement[] f2682f = null;

    /* JADX INFO: renamed from: a */
    public final List f2683a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0802Sm f2684b;

    /* JADX INFO: renamed from: c */
    public int f2685c;

    /* JADX INFO: renamed from: d */
    public Class f2686d;

    /* JADX INFO: renamed from: e */
    public final String f2687e;

    static {
        f2682f = new StackTraceElement[0];
    }

    public C0842Tj(String r2) {
        this(r2, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    public static void m1666a(Throwable r1, ArrayList r2) {
        if ((r1 instanceof C0842Tj) == false) goto L8;
        Iterator r12 = ((C0842Tj) r1).f2683a.iterator();
    L6:
        if (r12.hasNext() == false) goto L13;
        m1666a((Throwable) r12.next(), r2);
        goto L6
    L13:
        return;
    L8:
        if (r1 == null) goto L12;
        r2.add(r1);
        return;
    }

    /* JADX INFO: renamed from: b */
    public static void m1667b(List r4, C0799Sj r5) {
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        r5.append("Cause (");
        int r2 = r1 + 1;
        r5.append(String.valueOf(r2));
        r5.append(" of ");
        r5.append(String.valueOf(r0));
        r5.append("): ");
        Throwable r12 = (Throwable) r4.get(r1);
        if ((r12 instanceof C0842Tj) == false) goto L7;
        ((C0842Tj) r12).m1669d(r5);
    L8:
        r1 = r2;
        goto L3
    L7:
        m1668c(r12, r5);
        goto L8
    }

    /* JADX INFO: renamed from: c */
    public static void m1668c(Throwable r1, Appendable r2) {
        r2.append(r1.getClass().toString()).append(": ").append(r1.getMessage()).append('\n');     // Catch: IOException -> L4
        return;
    L5:
        throw new RuntimeException(r1);
    }

    /* JADX INFO: renamed from: d */
    public final void m1669d(Appendable r3) {
        m1668c(this, r3);
        m1667b(this.f2683a, new C0799Sj(r3));     // Catch: IOException -> L5
        return;
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder r0 = new StringBuilder(71);
        r0.append(this.f2687e);
        String r2 = "";
        if (this.f2686d == null) goto L5;
        String r1 = ", " + this.f2686d;
    L6:
        r0.append(r1);
        int r12 = this.f2685c;
        if (r12 != 0) goto L9;
        String r13 = "";
    L26:
        r0.append(r13);
        if (this.f2684b == null) goto L29;
        r2 = ", " + this.f2684b;
    L29:
        r0.append(r2);
        ArrayList r14 = new ArrayList();
        m1666a(this, r14);
        if (r14.isEmpty() == false) goto L34;
        return r0.toString();
    L34:
        if (r14.size() != 1) goto L36;
        r0.append("\nThere was 1 root cause:");
    L37:
        Iterator r15 = r14.iterator();
    L39:
        if (r15.hasNext() == false) goto L41;
        Throwable r22 = (Throwable) r15.next();
        r0.append('\n');
        r0.append(r22.getClass().getName());
        r0.append('(');
        r0.append(r22.getMessage());
        r0.append(')');
        goto L39
    L41:
        r0.append("\n call GlideException#logRootCauses(String) for more detail");
        return r0.toString();
    L36:
        r0.append("\nThere were ");
        r0.append(r14.size());
        r0.append(" root causes:");
        goto L37
    L9:
        if (r12 != 1) goto L11;
        String r16 = "LOCAL";
    L24:
        r13 = ", ".concat(r16);
        goto L26
    L11:
        if (r12 != 2) goto L13;
        r16 = "REMOTE";
        goto L24
    L13:
        if (r12 != 3) goto L15;
        r16 = "DATA_DISK_CACHE";
        goto L24
    L15:
        if (r12 != 4) goto L17;
        r16 = "RESOURCE_DISK_CACHE";
        goto L24
    L17:
        if (r12 == 5) goto L19;
        r16 = "null";
        goto L24
    L19:
        r16 = "MEMORY_CACHE";
        goto L24
    L5:
        r1 = "";
        goto L6
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m1669d(System.err);
    }

    public C0842Tj(String r1, List r2) {
        this.f2687e = r1;
        setStackTrace(f2682f);
        this.f2683a = r2;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream r1) {
        m1669d(r1);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter r1) {
        m1669d(r1);
    }
}
