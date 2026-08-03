package p000;

import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: pk */
/* JADX INFO: loaded from: classes.dex */
public final class C2377pk {

    /* JADX INFO: renamed from: e */
    public static final boolean f8362e = false;

    /* JADX INFO: renamed from: f */
    public static final boolean f8363f = false;

    /* JADX INFO: renamed from: g */
    public static final File f8364g = null;

    /* JADX INFO: renamed from: h */
    public static volatile C2377pk f8365h;

    /* JADX INFO: renamed from: a */
    public final int f8366a;

    /* JADX INFO: renamed from: b */
    public int f8367b;

    /* JADX INFO: renamed from: c */
    public boolean f8368c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f8369d;

    static {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        boolean r0 = true;
    L6:
        f8362e = r0;
        f8363f = true;
        f8364g = new File("/proc/self/fd");
        return;
    L5:
        r0 = false;
        goto L6
    }

    public C2377pk() {
        this.f8368c = true;
        this.f8369d = new AtomicBoolean(false);
        this.f8366a = 20000;
    }

    /* JADX INFO: renamed from: a */
    public static C2377pk m4818a() {
        if (f8365h != null) goto L16;
        monitor-enter(C2377pk.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f8365h != null) goto L11;
        f8365h = new C2377pk();     // Catch: Throwable -> L9
    L11:
        monitor-exit(C2377pk.class);     // Catch: Throwable -> L9
    L16:
        return f8365h;
    }

    /* JADX INFO: renamed from: b */
    public final int m4819b() {
        if (Build.VERSION.SDK_INT != 28) goto L13;
        Iterator r0 = Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"}).iterator();
    L7:
        if (r0.hasNext() == false) goto L13;
        String r1 = (String) r0.next();
        if (Build.MODEL.startsWith(r1) == false) goto L7;
        return 500;
    L13:
        return this.f8366a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4820c(int r4, int r5, boolean r6, boolean r7) {
        if (r6 == true) goto L6;
    L35:
        return false;
    L6:
        if (f8363f == false) goto L35;
        if (f8362e == true) goto L11;
    L13:
        if (r7 == true) goto L35;
        if (r4 < 0) goto L35;
        if (r5 < 0) goto L35;
        monitor-enter(this);
        int r42 = this.f8367b + 1;     // Catch: Throwable -> L26
        this.f8367b = r42;     // Catch: Throwable -> L26
        if (r42 < 50) goto L28;
        this.f8367b = 0;     // Catch: Throwable -> L26
        if (f8364g.list().length >= m4819b()) goto L24;
        boolean r43 = true;
    L25:
        this.f8368c = r43;     // Catch: Throwable -> L26
        goto L28
    L24:
        r43 = false;
    L28:
        boolean r44 = this.f8368c;     // Catch: Throwable -> L26
        monitor-exit(this);
        if (r44 == false) goto L35;
        return true;
    L26:
        th = move-exception;
        throw th;
    L11:
        if (this.f8369d.get() == true) goto L13;
        goto L13
    }
}
