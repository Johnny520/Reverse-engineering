package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends Exception {

    /* JADX INFO: renamed from: m */
    public static final StackTraceElement[] f13098m = new StackTraceElement[0];

    /* JADX INFO: renamed from: h */
    public final List f13099h;

    /* JADX INFO: renamed from: i */
    public a51 f13100i;

    /* JADX INFO: renamed from: j */
    public int f13101j;

    /* JADX INFO: renamed from: k */
    public Class f13102k;

    /* JADX INFO: renamed from: l */
    public final String f13103l;

    public xp0(String str, List list) {
        this.f13103l = str;
        setStackTrace(f13098m);
        this.f13099h = list;
    }

    /* JADX INFO: renamed from: a */
    public static void m6165a(Throwable th, ArrayList arrayList) {
        if (th instanceof xp0) {
            Iterator it = ((xp0) th).f13099h.iterator();
            while (it.hasNext()) {
                m6165a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6166b(List list, wp0 wp0Var) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            wp0Var.append("Cause (");
            int i2 = i + 1;
            wp0Var.append(String.valueOf(i2));
            wp0Var.append(" of ");
            wp0Var.append(String.valueOf(size));
            wp0Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof xp0) {
                ((xp0) th).m6169e(wp0Var);
            } else {
                m6167c(th, wp0Var);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6167c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6168d() {
        ArrayList arrayList = new ArrayList();
        m6165a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6169e(Appendable appendable) {
        m6167c(this, appendable);
        try {
            m6166b(this.f13099h, new wp0(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f13103l);
        sb.append(this.f13102k != null ? ", " + this.f13102k : "");
        int i = this.f13101j;
        sb.append(i != 0 ? ", ".concat(vi0.m5703v(i)) : "");
        sb.append(this.f13100i != null ? ", " + this.f13100i : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m6165a(this, arrayList);
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
        m6169e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m6169e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m6169e(printWriter);
    }

    public xp0(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
