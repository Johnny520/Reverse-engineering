package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class it2 implements h40, g40 {
    public final t40 h;
    public final w40 i;
    public volatile int j;
    public volatile c40 k;
    public volatile Object l;
    public volatile ih1 m;
    public volatile d40 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public it2(t40 t40Var, w40 w40Var) {
        this.h = t40Var;
        this.i = w40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g40
    public final void a(a51 a51Var, Object obj, f40 f40Var, int i, a51 a51Var2) {
        this.i.a(a51Var, obj, f40Var, this.m.c.e(), a51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g40
    public final void b(a51 a51Var, Exception exc, f40 f40Var, int i) {
        this.i.b(a51Var, exc, f40Var, this.m.c.e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // defpackage.h40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        if (this.l != null) {
            Object obj = this.l;
            this.l = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
            if (d(obj)) {
                if (this.k == null || !this.k.c()) {
                    this.k = null;
                    this.m = null;
                    boolean z = false;
                    while (!z && this.j < this.h.b().size()) {
                        ArrayList arrayListB = this.h.b();
                        int i = this.j;
                        this.j = i + 1;
                        this.m = (ih1) arrayListB.get(i);
                        if (this.m != null && (this.h.p.a(this.m.c.e()) || this.h.c(this.m.c.a()) != null)) {
                            this.m.c.c(this.h.o, new dq1(14, this, this.m, false));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h40
    public final void cancel() {
        ih1 ih1Var = this.m;
        if (ih1Var != null) {
            ih1Var.c.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = tc1.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            k40 k40VarG = this.h.c.a().g(obj);
            Object objF = k40VarG.f();
            we0 we0VarD = this.h.d(objF);
            b5 b5Var = new b5(we0VarD, objF, this.h.i, 5);
            a51 a51Var = this.m.a;
            t40 t40Var = this.h;
            d40 d40Var = new d40(a51Var, t40Var.n);
            a90 a90VarA = t40Var.h.a();
            a90VarA.j(d40Var, b5Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + d40Var + ", data: " + obj + ", encoder: " + we0VarD + ", duration: " + tc1.a(jElapsedRealtimeNanos));
            }
            if (a90VarA.d(d40Var) != null) {
                this.n = d40Var;
                this.k = new c40(Collections.singletonList(this.m.a), this.h, this);
                this.m.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.n + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.i.a(this.m.a, k40VarG.f(), this.m.c, this.m.c.e(), this.m.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.m.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
