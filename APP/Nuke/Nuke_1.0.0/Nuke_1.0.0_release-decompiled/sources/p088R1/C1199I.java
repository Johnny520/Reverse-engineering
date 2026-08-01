package p088R1;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC1934d;
import com.bumptech.glide.load.data.InterfaceC1936f;
import java.util.Collections;
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

    public C1199I(C1207h c1207h, RunnableC1209j runnableC1209j) {
        this.f3939d = c1207h;
        this.f3940e = runnableC1209j;
    }

    @Override // p088R1.InterfaceC1205f
    /* JADX INFO: renamed from: a */
    public final void mo2263a(InterfaceC1144f interfaceC1144f, Exception exc, InterfaceC1934d interfaceC1934d, int i5) {
        this.f3940e.mo2263a(interfaceC1144f, exc, interfaceC1934d, this.f3944i.f5271c.mo2224c());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // p088R1.InterfaceC1206g
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2257b() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3943h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r7.f3943h
            r7.f3943h = r1
            boolean r0 = r7.m2265d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            R1.d r0 = r7.f3942g
            if (r0 == 0) goto L2d
            R1.d r0 = r7.f3942g
            boolean r0 = r0.mo2257b()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r7.f3942g = r1
            r7.f3944i = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L93
            int r1 = r7.f3941f
            R1.h r3 = r7.f3939d
            java.util.ArrayList r3 = r3.m2267b()
            int r3 = r3.size()
            if (r1 >= r3) goto L93
            R1.h r1 = r7.f3939d
            java.util.ArrayList r1 = r1.m2267b()
            int r3 = r7.f3941f
            int r4 = r3 + 1
            r7.f3941f = r4
            java.lang.Object r1 = r1.get(r3)
            V1.p r1 = (p107V1.C1517p) r1
            r7.f3944i = r1
            V1.p r1 = r7.f3944i
            if (r1 == 0) goto L32
            R1.h r1 = r7.f3939d
            R1.l r1 = r1.f3975p
            V1.p r3 = r7.f3944i
            com.bumptech.glide.load.data.d r3 = r3.f5271c
            int r3 = r3.mo2224c()
            boolean r1 = r1.m2287a(r3)
            if (r1 != 0) goto L7c
            R1.h r1 = r7.f3939d
            V1.p r3 = r7.f3944i
            com.bumptech.glide.load.data.d r3 = r3.f5271c
            java.lang.Class r3 = r3.mo2222a()
            R1.B r1 = r1.m2268c(r3)
            if (r1 == 0) goto L32
        L7c:
            V1.p r0 = r7.f3944i
            V1.p r1 = r7.f3944i
            com.bumptech.glide.load.data.d r1 = r1.f5271c
            R1.h r3 = r7.f3939d
            com.bumptech.glide.j r3 = r3.f3974o
            A.T0 r4 = new A.T0
            r5 = 11
            r6 = 0
            r4.<init>(r5, r7, r0, r6)
            r1.mo2225d(r3, r4)
            r0 = r2
            goto L32
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p088R1.C1199I.mo2257b():boolean");
    }

    @Override // p088R1.InterfaceC1205f
    /* JADX INFO: renamed from: c */
    public final void mo2264c(InterfaceC1144f interfaceC1144f, Object obj, InterfaceC1934d interfaceC1934d, int i5, InterfaceC1144f interfaceC1144f2) {
        this.f3940e.mo2264c(interfaceC1144f, obj, interfaceC1934d, this.f3944i.f5271c.mo2224c(), interfaceC1144f);
    }

    @Override // p088R1.InterfaceC1206g
    public final void cancel() {
        C1517p c1517p = this.f3944i;
        if (c1517p != null) {
            c1517p.f5271c.cancel();
        }
    }

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
