package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class it2 implements h40, g40 {

    /* JADX INFO: renamed from: h */
    public final t40 f4777h;

    /* JADX INFO: renamed from: i */
    public final w40 f4778i;

    /* JADX INFO: renamed from: j */
    public volatile int f4779j;

    /* JADX INFO: renamed from: k */
    public volatile c40 f4780k;

    /* JADX INFO: renamed from: l */
    public volatile Object f4781l;

    /* JADX INFO: renamed from: m */
    public volatile ih1 f4782m;

    /* JADX INFO: renamed from: n */
    public volatile d40 f4783n;

    public it2(t40 t40Var, w40 w40Var) {
        this.f4777h = t40Var;
        this.f4778i = w40Var;
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: a */
    public final void mo1801a(a51 a51Var, Object obj, f40 f40Var, int i, a51 a51Var2) {
        this.f4778i.mo1801a(a51Var, obj, f40Var, this.f4782m.f4618c.mo1374e(), a51Var);
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: b */
    public final void mo1802b(a51 a51Var, Exception exc, f40 f40Var, int i) {
        this.f4778i.mo1802b(a51Var, exc, f40Var, this.f4782m.f4618c.mo1374e());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // p000.h40
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo634c() {
        if (this.f4781l != null) {
            Object obj = this.f4781l;
            this.f4781l = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
            if (m2392d(obj)) {
                if (this.f4780k == null || !this.f4780k.mo634c()) {
                    this.f4780k = null;
                    this.f4782m = null;
                    boolean z = false;
                    while (!z && this.f4779j < this.f4777h.m5117b().size()) {
                        ArrayList arrayListM5117b = this.f4777h.m5117b();
                        int i = this.f4779j;
                        this.f4779j = i + 1;
                        this.f4782m = (ih1) arrayListM5117b.get(i);
                        if (this.f4782m != null && (this.f4777h.f10552p.m493a(this.f4782m.f4618c.mo1374e()) || this.f4777h.m5118c(this.f4782m.f4618c.mo1371a()) != null)) {
                            this.f4782m.f4618c.mo1373c(this.f4777h.f10551o, new dq1(14, this, this.f4782m, false));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return true;
    }

    @Override // p000.h40
    public final void cancel() {
        ih1 ih1Var = this.f4782m;
        if (ih1Var != null) {
            ih1Var.f4618c.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2392d(Object obj) throws Throwable {
        Throwable th;
        int i = tc1.f10678b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            k40 k40VarM5647g = this.f4777h.f10539c.m5748a().m5647g(obj);
            Object objMo873f = k40VarM5647g.mo873f();
            we0 we0VarM5119d = this.f4777h.m5119d(objMo873f);
            C0043b5 c0043b5 = new C0043b5(we0VarM5119d, objMo873f, this.f4777h.f10545i, 5);
            a51 a51Var = this.f4782m.f4616a;
            t40 t40Var = this.f4777h;
            d40 d40Var = new d40(a51Var, t40Var.f10550n);
            a90 a90VarM145a = t40Var.f10544h.m145a();
            a90VarM145a.mo113j(d40Var, c0043b5);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + d40Var + ", data: " + obj + ", encoder: " + we0VarM5119d + ", duration: " + tc1.m5161a(jElapsedRealtimeNanos));
            }
            if (a90VarM145a.mo112d(d40Var) != null) {
                this.f4783n = d40Var;
                this.f4780k = new c40(Collections.singletonList(this.f4782m.f4616a), this.f4777h, this);
                this.f4782m.f4618c.mo1372b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f4783n + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f4778i.mo1801a(this.f4782m.f4616a, k40VarM5647g.mo873f(), this.f4782m.f4618c, this.f4782m.f4618c.mo1374e(), this.f4782m.f4616a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f4782m.f4618c.mo1372b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
