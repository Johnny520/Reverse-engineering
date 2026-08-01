package p088R1;

import android.os.Handler;
import android.os.Looper;
import p001A0.InterfaceC0101a;
import p013C0.C0236c;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p127Z2.AbstractC1784a;
import p153e1.C2021q;
import p227r.C2940A0;
import p227r.C3007p0;

/* JADX INFO: renamed from: R1.H */
/* JADX INFO: loaded from: classes.dex */
public class C1198H implements InterfaceC0101a {

    /* JADX INFO: renamed from: d */
    public boolean f3937d;

    /* JADX INFO: renamed from: e */
    public final Object f3938e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1198H() {
        this.f3938e = new Handler(Looper.getMainLooper(), new C1197G());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m2258a() {
        this.f3937d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m2259b(char c5) {
        C0236c c0236c = (C0236c) this.f3938e;
        c0236c.m416e(c0236c.f793e, 1);
        char[] cArr = (char[]) c0236c.f794f;
        int i5 = c0236c.f793e;
        c0236c.f793e = i5 + 1;
        cArr[i5] = c5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo135i0(long j5, long j6, InterfaceC1046d interfaceC1046d) throws Throwable {
        C3007p0 c3007p0;
        long jM3716d;
        if (interfaceC1046d instanceof C3007p0) {
            c3007p0 = (C3007p0) interfaceC1046d;
            int i5 = c3007p0.f9518j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3007p0.f9518j = i5 - Integer.MIN_VALUE;
            } else {
                c3007p0 = new C3007p0(this, (AbstractC1178c) interfaceC1046d);
            }
        }
        Object objM5141a = c3007p0.f9516h;
        int i6 = c3007p0.f9518j;
        if (i6 == 0) {
            AbstractC1784a.m3205S(objM5141a);
            jM3716d = 0;
            if (this.f3937d) {
                C2940A0 c2940a0 = (C2940A0) this.f3938e;
                if (!c2940a0.f9278i) {
                    c3007p0.f9515g = j6;
                    c3007p0.f9518j = 1;
                    objM5141a = c2940a0.m5141a(j6, c3007p0);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objM5141a == enumC1152a) {
                        return enumC1152a;
                    }
                }
                jM3716d = C2021q.m3716d(j6, jM3716d);
            }
            return new C2021q(jM3716d);
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j6 = c3007p0.f9515g;
        AbstractC1784a.m3205S(objM5141a);
        jM3716d = ((C2021q) objM5141a).f6750a;
        jM3716d = C2021q.m3716d(j6, jM3716d);
        return new C2021q(jM3716d);
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
