package de.robv.android.xposed;

import java.lang.reflect.Executable;

/* JADX INFO: renamed from: de.robv.android.xposed.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0760b {

    /* JADX INFO: renamed from: a */
    public Executable f2668a;

    /* JADX INFO: renamed from: b */
    public Object f2669b;

    /* JADX INFO: renamed from: c */
    public Object[] f2670c;

    /* JADX INFO: renamed from: d */
    public boolean f2671d;

    /* JADX INFO: renamed from: e */
    public Object f2672e;

    /* JADX INFO: renamed from: f */
    public Throwable f2673f;

    /* JADX INFO: renamed from: a */
    public final Object m1944a() {
        return this.f2672e;
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m1945b() {
        return this.f2673f;
    }

    /* JADX INFO: renamed from: c */
    public final void m1946c(Object obj) {
        this.f2672e = obj;
        this.f2673f = null;
        this.f2671d = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m1947d(Object obj) {
        this.f2672e = obj;
        this.f2673f = null;
        this.f2671d = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m1948e(Throwable th) {
        this.f2673f = th;
        this.f2672e = null;
        this.f2671d = false;
    }
}
