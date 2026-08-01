package p088R1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p011B4.AbstractC0231b;
import p078P1.InterfaceC1144f;

/* JADX INFO: renamed from: R1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1224y extends Exception {

    /* JADX INFO: renamed from: i */
    public static final StackTraceElement[] f4088i = new StackTraceElement[0];

    /* JADX INFO: renamed from: d */
    public final List f4089d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1144f f4090e;

    /* JADX INFO: renamed from: f */
    public int f4091f;

    /* JADX INFO: renamed from: g */
    public Class f4092g;

    /* JADX INFO: renamed from: h */
    public final String f4093h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1224y(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2305a(Throwable th, ArrayList arrayList) {
        if (th instanceof C1224y) {
            Iterator it = ((C1224y) th).f4089d.iterator();
            while (it.hasNext()) {
                m2305a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2306b(List list, C1223x c1223x) throws IOException {
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            c1223x.append("Cause (");
            int i6 = i5 + 1;
            c1223x.append(String.valueOf(i6));
            c1223x.append(" of ");
            c1223x.append(String.valueOf(size));
            c1223x.append("): ");
            Throwable th = (Throwable) list.get(i5);
            if (th instanceof C1224y) {
                ((C1224y) th).m2309e(c1223x);
            } else {
                m2307c(th, c1223x);
            }
            i5 = i6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2307c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2308d() {
        ArrayList arrayList = new ArrayList();
        m2305a(this, arrayList);
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i6 = i5 + 1;
            sb.append(i6);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i5));
            i5 = i6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2309e(Appendable appendable) {
        m2307c(this, appendable);
        try {
            m2306b(this.f4089d, new C1223x(appendable));
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4093h);
        sb.append(this.f4092g != null ? ", " + this.f4092g : "");
        int i5 = this.f4091f;
        sb.append(i5 != 0 ? ", ".concat(AbstractC0231b.m410u(i5)) : "");
        sb.append(this.f4090e != null ? ", " + this.f4090e : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m2305a(this, arrayList);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m2309e(System.err);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1224y(String str, List list) {
        this.f4093h = str;
        setStackTrace(f4088i);
        this.f4089d = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m2309e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m2309e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
