package p041W;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0016B;
import p007D0.C0137c;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0414a {

    /* JADX INFO: renamed from: d */
    public static volatile C0414a f916d;

    /* JADX INFO: renamed from: e */
    public static final Object f917e = null;

    /* JADX INFO: renamed from: a */
    public final HashMap f918a;

    /* JADX INFO: renamed from: b */
    public final HashSet f919b;

    /* JADX INFO: renamed from: c */
    public final Context f920c;

    static {
        f917e = new Object();
    }

    public C0414a(Context r1) {
        this.f920c = r1.getApplicationContext();
        this.f919b = new HashSet();
        this.f918a = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static C0414a m996c(Context r2) {
        if (f916d != null) goto L16;
        Object r02 = f917e;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f916d != null) goto L11;
        f916d = new C0414a(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    L16:
        return f916d;
    }

    /* JADX INFO: renamed from: a */
    public final void m997a(Bundle r7) {
        String r02 = this.f920c.getString(C1031R.string.androidx_startup);
        if (r7 != null) goto L23;
        return;
    L23:
        HashSet r1 = new HashSet();     // Catch: ClassNotFoundException -> L13
        Iterator<String> r2 = r7.keySet().iterator();     // Catch: ClassNotFoundException -> L13
    L5:
        boolean r3 = r2.hasNext();     // Catch: ClassNotFoundException -> L13
        HashSet r4 = this.f919b;
        if (r3 == false) goto L15;
        String r32 = r2.next();     // Catch: ClassNotFoundException -> L13
        if (r02.equals(r7.getString(r32, null)) == false) goto L5;
        Class<?> r33 = Class.forName(r32);     // Catch: ClassNotFoundException -> L13
        if (InterfaceC0415b.class.isAssignableFrom(r33) == false) goto L5;
        r4.add(r33);     // Catch: ClassNotFoundException -> L13
        goto L5
    L15:
        Iterator r72 = r4.iterator();     // Catch: ClassNotFoundException -> L13
    L16:
        if (r72.hasNext() == false) goto L33;
        m998b((Class) r72.next(), r1);     // Catch: ClassNotFoundException -> L13
        goto L16
    L33:
        return;
    L13:
        e = move-exception;
        throw new C0137c(e);
    }

    /* JADX INFO: renamed from: b */
    public final Object m998b(Class r6, HashSet r7) {
        if (AbstractC0358S.f722b != null) goto L56;
        boolean r2 = AbstractC0016B.m45r();     // Catch: Throwable -> L55
    L24:
        if (r2 == false) goto L29;
        Trace.beginSection(r6.getSimpleName());     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        Trace.endSection();
        throw th;
    L29:
        if (r7.contains(r6) == true) goto L52;
        HashMap r02 = this.f918a;
        if (r02.containsKey(r6) == true) goto L48;
        r7.add(r6);     // Catch: Throwable -> L26
        InterfaceC0415b r1 = (InterfaceC0415b) r6.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L42
        List r22 = r1.mo999a();     // Catch: Throwable -> L42
        if (r22.isEmpty() == true) goto L44;
        Iterator r23 = r22.iterator();     // Catch: Throwable -> L42
    L38:
        if (r23.hasNext() == false) goto L44;
        Class r3 = (Class) r23.next();     // Catch: Throwable -> L42
        if (r02.containsKey(r3) == true) goto L38;
        m998b(r3, r7);     // Catch: Throwable -> L42
    L44:
        Object r12 = r1.mo1000b(this.f920c);     // Catch: Throwable -> L42
        r7.remove(r6);     // Catch: Throwable -> L42
        r02.put(r6, r12);     // Catch: Throwable -> L42
    L49:
        Trace.endSection();
        return r12;
    L42:
        th = move-exception;
        throw new C0137c(th);     // Catch: Throwable -> L26
    L48:
        r12 = r02.get(r6);     // Catch: Throwable -> L26
        goto L49
    L52:
        throw new IllegalStateException("Cannot initialize " + r6.getName() + ". Cycle detected.");     // Catch: Throwable -> L26
    L56:
    L11:
        e = move-exception;
        if ((e instanceof InvocationTargetException) == false) goto L23;
        Throwable r62 = e.getCause();
        if ((r62 instanceof RuntimeException) == false) goto L22;
        throw ((RuntimeException) r62);
    L22:
        throw new RuntimeException(r62);
    L23:
        r2 = false;
        goto L24
    L9:
        if (AbstractC0358S.f722b != null) goto L13;
        AbstractC0358S.f721a = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L11
        AbstractC0358S.f722b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L11
    L13:
        r2 = ((Boolean) AbstractC0358S.f722b.invoke(null, new Object[]{Long.valueOf(AbstractC0358S.f721a)})).booleanValue();     // Catch: Exception -> L11
        goto L24
    }
}
