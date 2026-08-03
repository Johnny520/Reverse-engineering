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

    public C0342Hy(C0234Fc r1, RunnableC0320Hc r2) {
        this.f1149a = r1;
        this.f1150b = r2;
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: a */
    public final void mo670a(InterfaceC0802Sm r2, Exception r3, InterfaceC2541tc r4, int r5) {
        this.f1150b.mo670a(r2, r3, r4, this.f1154f.f3503c.mo916f());
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: b */
    public final void mo671b(InterfaceC0802Sm r7, Object r8, InterfaceC2541tc r9, int r10, InterfaceC0802Sm r11) {
        this.f1150b.mo671b(r7, r8, r9, this.f1154f.f3503c.mo916f(), r7);
    }

    @Override // p000.InterfaceC2627vc
    /* JADX INFO: renamed from: c */
    public final boolean mo727c() {
        if (this.f1153e == null) goto L9;
        Object r0 = this.f1153e;
        this.f1153e = null;
        if (m728d(r0) == true) goto L9;
    L12:
        return true;
    L9:
        if (this.f1152d != null) goto L11;
    L13:
        this.f1152d = null;
        this.f1154f = null;
        boolean r02 = false;
    L14:
        if (r02 == true) goto L24;
        if (this.f1151c >= this.f1149a.m474b().size()) goto L24;
        ArrayList r1 = this.f1149a.m474b();
        int r3 = this.f1151c;
        this.f1151c = r3 + 1;
        this.f1154f = (C1108Zr) r1.get(r3);
        if (this.f1154f == null) goto L14;
        if (this.f1149a.f748p.m1782a(this.f1154f.f3503c.mo916f()) == true) goto L23;
        if (this.f1149a.m475c(this.f1154f.f3503c.mo912a()) == null) goto L14;
    L23:
        this.f1154f.f3503c.mo915d(this.f1149a.f747o, new C0299Gy(this, this.f1154f));
        r02 = true;
    L24:
        return r02;
    L11:
        if (this.f1152d.mo727c() == false) goto L13;
        goto L12
    }

    @Override // p000.InterfaceC2627vc
    public final void cancel() {
        C1108Zr r0 = this.f1154f;
        if (r0 == null) goto L6;
        r0.f3503c.cancel();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m728d(Object r13) {
        int r1 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        boolean r12 = false;
        InterfaceC2713xc r2 = this.f1149a.f735c.m1544a().m1379g(r13);     // Catch: Throwable -> L6
        Object r3 = r2.mo237j();     // Catch: Throwable -> L6
        InterfaceC0667Pf r4 = this.f1149a.m476d(r3);     // Catch: Throwable -> L6
        C2656w4 r5 = new C2656w4(r4, r3, this.f1149a.f741i, 8);     // Catch: Throwable -> L6
        InterfaceC0802Sm r6 = this.f1154f.f3501a;     // Catch: Throwable -> L6
        C0234Fc r7 = this.f1149a;     // Catch: Throwable -> L6
        C2455rc r32 = new C2455rc(r6, r7.f746n);     // Catch: Throwable -> L6
        InterfaceC0879Ud r62 = r7.f740h.m96a();     // Catch: Throwable -> L6
        r62.mo1726d(r32, r5);     // Catch: Throwable -> L6
        if (Log.isLoggable("SourceGenerator", 2) == false) goto L9;
        r32.toString();     // Catch: Throwable -> L6
        r13.toString();     // Catch: Throwable -> L6
        r4.toString();     // Catch: Throwable -> L6
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L6
    L9:
        if (r62.mo1725b(r32) == null) goto L15;
        this.f1155g = r32;     // Catch: Throwable -> L6
        this.f1152d = new C2412qc(Collections.singletonList(this.f1154f.f3501a), this.f1149a, this);     // Catch: Throwable -> L6
        this.f1154f.f3503c.mo914c();
        return true;
    L15:
        if (Log.isLoggable("SourceGenerator", 3) == false) goto L25;
        Objects.toString(this.f1155g);     // Catch: Throwable -> L6
        r13.toString();     // Catch: Throwable -> L6
    L25:
        this.f1150b.mo671b(this.f1154f.f3501a, r2.mo237j(), this.f1154f.f3503c, this.f1154f.f3503c.mo916f(), this.f1154f.f3501a);     // Catch: Throwable -> L19
        return false;
    L19:
        th = move-exception;
        Throwable r132 = th;
        r12 = true;
    L21:
        if (r12 == true) goto L27;
        this.f1154f.f3503c.mo914c();
        throw r132;
    L27:
        throw r132;
    L6:
        th = move-exception;
        r132 = th;
        goto L21
    }
}
