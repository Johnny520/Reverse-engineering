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
    public static final boolean f8362e;

    /* JADX INFO: renamed from: f */
    public static final boolean f8363f;

    /* JADX INFO: renamed from: g */
    public static final File f8364g;

    /* JADX INFO: renamed from: h */
    public static volatile C2377pk f8365h;

    /* JADX INFO: renamed from: b */
    public int f8367b;

    /* JADX INFO: renamed from: c */
    public boolean f8368c = true;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f8369d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final int f8366a = 20000;

    static {
        f8362e = Build.VERSION.SDK_INT < 29;
        f8363f = true;
        f8364g = new File("/proc/self/fd");
    }

    /* JADX INFO: renamed from: a */
    public static C2377pk m4818a() {
        if (f8365h == null) {
            synchronized (C2377pk.class) {
                try {
                    if (f8365h == null) {
                        f8365h = new C2377pk();
                    }
                } finally {
                }
            }
        }
        return f8365h;
    }

    /* JADX INFO: renamed from: b */
    public final int m4819b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f8366a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4820c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z && f8363f && ((!f8362e || this.f8369d.get()) && !z2 && i >= 0 && i2 >= 0)) {
            synchronized (this) {
                try {
                    int i3 = this.f8367b + 1;
                    this.f8367b = i3;
                    if (i3 >= 50) {
                        this.f8367b = 0;
                        this.f8368c = ((long) f8364g.list().length) < ((long) m4819b());
                    }
                    z3 = this.f8368c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }
}
