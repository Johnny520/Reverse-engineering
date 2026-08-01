package p088R1;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC1934d;
import com.bumptech.glide.load.data.InterfaceC1936f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p000A.C0038T0;
import p000A.C0072l0;
import p078P1.InterfaceC1140b;
import p078P1.InterfaceC1144f;
import p097T1.InterfaceC1412a;
import p107V1.C1517p;
import p195l2.AbstractC2505i;

/* JADX INFO: renamed from: R1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1199I implements InterfaceC1206g, InterfaceC1205f {

    /* JADX INFO: renamed from: d */
    public final C1207h f3939d;

    /* JADX INFO: renamed from: e */
    public final RunnableC1209j f3940e;

    /* JADX INFO: renamed from: f */
    public volatile int f3941f;

    /* JADX INFO: renamed from: g */
    public volatile C1203d f3942g;

    /* JADX INFO: renamed from: h */
    public volatile Object f3943h;

    /* JADX INFO: renamed from: i */
    public volatile C1517p f3944i;

    /* JADX INFO: renamed from: j */
    public volatile C1204e f3945j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1199I(C1207h c1207h, RunnableC1209j runnableC1209j) {
        this.f3939d = c1207h;
        this.f3940e = runnableC1209j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1205f
    /* JADX INFO: renamed from: a */
    public final void mo2263a(InterfaceC1144f interfaceC1144f, Exception exc, InterfaceC1934d interfaceC1934d, int i5) {
        this.f3940e.mo2263a(interfaceC1144f, exc, interfaceC1934d, this.f3944i.f5271c.mo2224c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // p088R1.InterfaceC1206g
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2257b() {
        if (this.f3943h != null) {
            Object obj = this.f3943h;
            this.f3943h = null;
            try {
            } catch (IOException e5) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e5);
                }
            }
            if (m2265d(obj)) {
                if (this.f3942g == null || !this.f3942g.mo2257b()) {
                    this.f3942g = null;
                    this.f3944i = null;
                    boolean z5 = false;
                    while (!z5 && this.f3941f < this.f3939d.m2267b().size()) {
                        ArrayList arrayListM2267b = this.f3939d.m2267b();
                        int i5 = this.f3941f;
                        this.f3941f = i5 + 1;
                        this.f3944i = (C1517p) arrayListM2267b.get(i5);
                        if (this.f3944i != null && (this.f3939d.f3975p.m2287a(this.f3944i.f5271c.mo2224c()) || this.f3939d.m2268c(this.f3944i.f5271c.mo2222a()) != null)) {
                            this.f3944i.f5271c.mo2225d(this.f3939d.f3974o, new C0038T0(11, this, this.f3944i, false));
                            z5 = true;
                        }
                    }
                    return z5;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1205f
    /* JADX INFO: renamed from: c */
    public final void mo2264c(InterfaceC1144f interfaceC1144f, Object obj, InterfaceC1934d interfaceC1934d, int i5, InterfaceC1144f interfaceC1144f2) {
        this.f3940e.mo2264c(interfaceC1144f, obj, interfaceC1934d, this.f3944i.f5271c.mo2224c(), interfaceC1144f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1206g
    public final void cancel() {
        C1517p c1517p = this.f3944i;
        if (c1517p != null) {
            c1517p.f5271c.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m2265d(Object obj) throws Throwable {
        Throwable th;
        int i5 = AbstractC2505i.f8018b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z5 = false;
        try {
            InterfaceC1936f interfaceC1936fM3593g = this.f3939d.f3962c.m3586a().m3593g(obj);
            Object objMo3102c = interfaceC1936fM3593g.mo3102c();
            InterfaceC1140b interfaceC1140bM2269d = this.f3939d.m2269d(objMo3102c);
            C0072l0 c0072l0 = new C0072l0(interfaceC1140bM2269d, objMo3102c, this.f3939d.f3968i, 4);
            InterfaceC1144f interfaceC1144f = this.f3944i.f5269a;
            C1207h c1207h = this.f3939d;
            C1204e c1204e = new C1204e(interfaceC1144f, c1207h.f3973n);
            InterfaceC1412a interfaceC1412aM2288a = c1207h.f3967h.m2288a();
            interfaceC1412aM2288a.mo156h(c1204e, c0072l0);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c1204e + ", data: " + obj + ", encoder: " + interfaceC1140bM2269d + ", duration: " + AbstractC2505i.m4446a(jElapsedRealtimeNanos));
            }
            if (interfaceC1412aM2288a.mo152c(c1204e) != null) {
                this.f3945j = c1204e;
                this.f3942g = new C1203d(Collections.singletonList(this.f3944i.f5269a), this.f3939d, this);
                this.f3944i.f5271c.mo2223b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f3945j + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f3940e.mo2264c(this.f3944i.f5269a, interfaceC1936fM3593g.mo3102c(), this.f3944i.f5271c, this.f3944i.f5271c.mo2224c(), this.f3944i.f5269a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z5 = true;
                if (z5) {
                    throw th;
                }
                this.f3944i.f5271c.mo2223b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
