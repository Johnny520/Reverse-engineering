package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: Hy */
/* JADX INFO: loaded from: classes.dex */
public final class C0342Hy implements InterfaceC2627vc, InterfaceC2584uc {

    /* JADX INFO: renamed from: a */
    public final C0234Fc f1149a;

    /* JADX INFO: renamed from: b */
    public final RunnableC0320Hc f1150b;

    /* JADX INFO: renamed from: c */
    public volatile int f1151c;

    /* JADX INFO: renamed from: d */
    public volatile C2412qc f1152d;

    /* JADX INFO: renamed from: e */
    public volatile Object f1153e;

    /* JADX INFO: renamed from: f */
    public volatile C1108Zr f1154f;

    /* JADX INFO: renamed from: g */
    public volatile C2455rc f1155g;

    public C0342Hy(C0234Fc c0234Fc, RunnableC0320Hc runnableC0320Hc) {
        this.f1149a = c0234Fc;
        this.f1150b = runnableC0320Hc;
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: a */
    public final void mo670a(InterfaceC0802Sm interfaceC0802Sm, Exception exc, InterfaceC2541tc interfaceC2541tc, int i) {
        this.f1150b.mo670a(interfaceC0802Sm, exc, interfaceC2541tc, this.f1154f.f3503c.mo916f());
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: b */
    public final void mo671b(InterfaceC0802Sm interfaceC0802Sm, Object obj, InterfaceC2541tc interfaceC2541tc, int i, InterfaceC0802Sm interfaceC0802Sm2) {
        this.f1150b.mo671b(interfaceC0802Sm, obj, interfaceC2541tc, this.f1154f.f3503c.mo916f(), interfaceC0802Sm);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    @Override // p000.InterfaceC2627vc
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo727c() {
        if (this.f1153e != null) {
            Object obj = this.f1153e;
            this.f1153e = null;
            if (m728d(obj)) {
                if (this.f1152d == null || !this.f1152d.mo727c()) {
                    this.f1152d = null;
                    this.f1154f = null;
                    boolean z = false;
                    while (!z && this.f1151c < this.f1149a.m474b().size()) {
                        ArrayList arrayListM474b = this.f1149a.m474b();
                        int i = this.f1151c;
                        this.f1151c = i + 1;
                        this.f1154f = (C1108Zr) arrayListM474b.get(i);
                        if (this.f1154f != null && (this.f1149a.f748p.m1782a(this.f1154f.f3503c.mo916f()) || this.f1149a.m475c(this.f1154f.f3503c.mo912a()) != null)) {
                            this.f1154f.f3503c.mo915d(this.f1149a.f747o, new C0299Gy(this, this.f1154f));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return true;
    }

    @Override // p000.InterfaceC2627vc
    public final void cancel() {
        C1108Zr c1108Zr = this.f1154f;
        if (c1108Zr != null) {
            c1108Zr.f3503c.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m728d(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC2713xc interfaceC2713xcM1379g = this.f1149a.f735c.m1544a().m1379g(obj);
            Object objMo237j = interfaceC2713xcM1379g.mo237j();
            InterfaceC0667Pf interfaceC0667PfM476d = this.f1149a.m476d(objMo237j);
            C2656w4 c2656w4 = new C2656w4(interfaceC0667PfM476d, objMo237j, this.f1149a.f741i, 8);
            InterfaceC0802Sm interfaceC0802Sm = this.f1154f.f3501a;
            C0234Fc c0234Fc = this.f1149a;
            C2455rc c2455rc = new C2455rc(interfaceC0802Sm, c0234Fc.f746n);
            InterfaceC0879Ud interfaceC0879UdM96a = c0234Fc.f740h.m96a();
            interfaceC0879UdM96a.mo1726d(c2455rc, c2656w4);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c2455rc.toString();
                obj.toString();
                interfaceC0667PfM476d.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (interfaceC0879UdM96a.mo1725b(c2455rc) != null) {
                this.f1155g = c2455rc;
                this.f1152d = new C2412qc(Collections.singletonList(this.f1154f.f3501a), this.f1149a, this);
                this.f1154f.f3503c.mo914c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f1155g);
                obj.toString();
            }
            try {
                this.f1150b.mo671b(this.f1154f.f3501a, interfaceC2713xcM1379g.mo237j(), this.f1154f.f3503c, this.f1154f.f3503c.mo916f(), this.f1154f.f3501a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f1154f.f3503c.mo914c();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
