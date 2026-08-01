package p088R1;

import android.os.Handler;
import android.os.Looper;
import p001A0.InterfaceC0101a;
import p013C0.C0236c;
import p227r.C2940A0;

/* JADX INFO: renamed from: R1.H */
/* JADX INFO: loaded from: classes.dex */
public class C1198H implements InterfaceC0101a {

    /* JADX INFO: renamed from: d */
    public boolean f3937d;

    /* JADX INFO: renamed from: e */
    public final Object f3938e;

    public C1198H() {
        this.f3938e = new Handler(Looper.getMainLooper(), new C1197G());
    }

    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: Q */
    public long mo134Q(int i5, long j5, long j6) {
        if (!this.f3937d) {
            return 0L;
        }
        C2940A0 c2940a0 = (C2940A0) this.f3938e;
        if (c2940a0.f9270a.mo11b()) {
            return 0L;
        }
        return c2940a0.m5148h(c2940a0.m5144d(c2940a0.f9270a.mo14e(c2940a0.m5144d(c2940a0.m5147g(j6)))));
    }

    /* JADX INFO: renamed from: a */
    public void m2258a() {
        this.f3937d = false;
    }

    /* JADX INFO: renamed from: b */
    public void m2259b(char c5) {
        C0236c c0236c = (C0236c) this.f3938e;
        c0236c.m416e(c0236c.f793e, 1);
        char[] cArr = (char[]) c0236c.f794f;
        int i5 = c0236c.f793e;
        c0236c.f793e = i5 + 1;
        cArr[i5] = c5;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m2260c(InterfaceC1194D interfaceC1194D, boolean z5) {
        try {
            if (this.f3937d || z5) {
                ((Handler) this.f3938e).obtainMessage(1, interfaceC1194D).sendToTarget();
            } else {
                this.f3937d = true;
                interfaceC1194D.mo2256e();
                this.f3937d = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo135i0(long r4, long r6, p074O2.InterfaceC1046d r8) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r8 instanceof p227r.C3007p0
            if (r4 == 0) goto L13
            r4 = r8
            r.p0 r4 = (p227r.C3007p0) r4
            int r5 = r4.f9518j
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f9518j = r5
            goto L1a
        L13:
            r.p0 r4 = new r.p0
            Q2.c r8 = (p084Q2.AbstractC1178c) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f9516h
            int r8 = r4.f9518j
            r0 = 1
            if (r8 == 0) goto L31
            if (r8 != r0) goto L29
            long r6 = r4.f9515g
            p127Z2.AbstractC1784a.m3205S(r5)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p127Z2.AbstractC1784a.m3205S(r5)
            boolean r5 = r3.f3937d
            r1 = 0
            if (r5 == 0) goto L58
            java.lang.Object r5 = r3.f3938e
            r.A0 r5 = (p227r.C2940A0) r5
            boolean r8 = r5.f9278i
            if (r8 == 0) goto L43
            goto L54
        L43:
            r4.f9515g = r6
            r4.f9518j = r0
            java.lang.Object r5 = r5.m5141a(r6, r4)
            P2.a r4 = p079P2.EnumC1152a.f3788d
            if (r5 != r4) goto L50
            return r4
        L50:
            e1.q r5 = (p153e1.C2021q) r5
            long r1 = r5.f6750a
        L54:
            long r1 = p153e1.C2021q.m3716d(r6, r1)
        L58:
            e1.q r4 = new e1.q
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p088R1.C1198H.mo135i0(long, long, O2.d):java.lang.Object");
    }

    public C1198H(C0236c c0236c) {
        this.f3938e = c0236c;
        this.f3937d = true;
    }

    public C1198H(C2940A0 c2940a0, boolean z5) {
        this.f3938e = c2940a0;
        this.f3937d = z5;
    }

    /* JADX INFO: renamed from: d */
    public void m2261d() {
    }

    /* JADX INFO: renamed from: e */
    public void m2262e() {
    }
}
