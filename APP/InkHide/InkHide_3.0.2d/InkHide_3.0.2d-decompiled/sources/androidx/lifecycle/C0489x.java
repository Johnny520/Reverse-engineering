package androidx.lifecycle;

import android.os.Looper;
import p071j.C0732a;
import p073k.C0738d;
import p073k.C0740f;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public class C0489x {

    /* JADX INFO: renamed from: g */
    public static final Object f1536g = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f1537a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0740f f1538b = new C0740f();

    /* JADX INFO: renamed from: c */
    public volatile Object f1539c;

    /* JADX INFO: renamed from: d */
    public volatile Object f1540d;

    /* JADX INFO: renamed from: e */
    public boolean f1541e;

    /* JADX INFO: renamed from: f */
    public boolean f1542f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0489x() {
        Object obj = f1536g;
        this.f1540d = obj;
        this.f1539c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m937a(Object obj) {
        ((C0732a) C0732a.m1388Q().f2486p).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke setValue on a background thread");
        }
        this.f1539c = obj;
        if (this.f1541e) {
            this.f1542f = true;
            return;
        }
        this.f1541e = true;
        do {
            this.f1542f = false;
            C0740f c0740f = this.f1538b;
            c0740f.getClass();
            C0738d c0738d = new C0738d(c0740f);
            c0740f.f2503c.put(c0738d, Boolean.FALSE);
            if (c0738d.hasNext()) {
                throw null;
            }
        } while (this.f1542f);
        this.f1541e = false;
    }
}
