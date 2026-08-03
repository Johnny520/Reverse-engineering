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
    public static final StackTraceElement[] f2682f = new StackTraceElement[0];

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

    public C0842Tj(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    public static void m1666a(Throwable th, ArrayList arrayList) {
        if (th instanceof C0842Tj) {
            Iterator it = ((C0842Tj) th).f2683a.iterator();
            while (it.hasNext()) {
                m1666a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1667b(List list, C0799Sj c0799Sj) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c0799Sj.append("Cause (");
            int i2 = i + 1;
            c0799Sj.append(String.valueOf(i2));
            c0799Sj.append(" of ");
            c0799Sj.append(String.valueOf(size));
            c0799Sj.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C0842Tj) {
                ((C0842Tj) th).m1669d(c0799Sj);
            } else {
                m1668c(th, c0799Sj);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1668c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1669d(Appendable appendable) {
        m1668c(this, appendable);
        try {
            m1667b(this.f2683a, new C0799Sj(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f2687e);
        sb.append(this.f2686d != null ? ", " + this.f2686d : "");
        int i = this.f2685c;
        sb.append(i != 0 ? ", ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL") : "");
        sb.append(this.f2684b != null ? ", " + this.f2684b : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m1666a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m1669d(System.err);
    }

    public C0842Tj(String str, List list) {
        this.f2687e = str;
        setStackTrace(f2682f);
        this.f2683a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m1669d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m1669d(printWriter);
    }
}
