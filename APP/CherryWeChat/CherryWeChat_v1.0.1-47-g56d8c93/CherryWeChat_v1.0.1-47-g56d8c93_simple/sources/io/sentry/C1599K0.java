package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import io.sentry.rrweb.AbstractC1986b;
import io.sentry.transport.C2008c;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2012g;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.sentry.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1599K0 implements InterfaceC1618P, InterfaceC1912j1, InterfaceC1916k1, InterfaceC1833c0, InterfaceC1911j0, InterfaceC1915k0, ILogger {

    /* JADX INFO: renamed from: a */
    public static final C1599K0 f5772a = null;

    /* JADX INFO: renamed from: b */
    public static final C1599K0 f5773b = null;

    /* JADX INFO: renamed from: c */
    public static final C1599K0 f5774c = null;

    /* JADX INFO: renamed from: d */
    public static final C1599K0 f5775d = null;

    /* JADX INFO: renamed from: e */
    public static final C1599K0 f5776e = null;

    static {
        f5772a = new C1599K0();
        f5773b = new C1599K0();
        f5774c = new C1599K0();
        f5775d = new C1599K0();
        f5776e = new C1599K0();
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: a */
    public void mo3690a(boolean r1) {
    }

    @Override // io.sentry.InterfaceC1911j0
    /* JADX INFO: renamed from: b */
    public C1881h1 mo3691b(C1573D2 r1, List r2, C2046v2 r3) {
        return null;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: c */
    public void mo3692c(EnumC1877g1 r1) {
    }

    @Override // io.sentry.InterfaceC1911j0
    public void close() {
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: d */
    public void mo3693d() {
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: e */
    public void mo3680e(EnumC1657a2 r2, String r3, Object... r4) {
        System.out.println(r2 + ": " + String.format(r3, r4));
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: f */
    public void mo3694f(Boolean r1) {
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: g */
    public void mo3695g(long r1) {
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: h */
    public void mo3696h(EnumC1877g1 r1, C1617O2 r2) {
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: i */
    public boolean mo3681i(EnumC1657a2 r1) {
        return true;
    }

    @Override // io.sentry.InterfaceC1833c0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC1911j0
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.InterfaceC1912j1
    /* JADX INFO: renamed from: j */
    public AbstractC1986b mo3697j(C1871f r1) {
        return null;
    }

    @Override // io.sentry.InterfaceC1915k0
    /* JADX INFO: renamed from: k */
    public InterfaceC2012g mo3698k(C2046v2 r4, C1901c r5) {
        return new C2008c(r4, new C2021p(r4), r4.getTransportGate(), r5);
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: l */
    public void mo3699l() {
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: m */
    public void mo3700m() {
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: n */
    public void mo3682n(EnumC1657a2 r4, Throwable r5, String r6, Object... r7) {
        PrintStream r0 = System.out;
        String r62 = String.format(r6, r7);
        String r72 = r5.toString();
        StringWriter r1 = new StringWriter();
        r5.printStackTrace(new PrintWriter(r1));
        r0.println(r4 + ": " + r62 + " \n " + r72 + "\n" + r1.toString());
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: o */
    public void mo3701o() {
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: p */
    public void mo3702p() {
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: q */
    public Future mo3703q(Runnable r1, long r2) {
        return new FutureTask(new CallableC1590I(1));
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: r */
    public void mo3683r(EnumC1657a2 r4, String r5, Throwable r6) {
        if (r6 != null) goto L5;
        mo3680e(r4, r5, new Object[0]);
        return;
    L5:
        PrintStream r0 = System.out;
        String r52 = String.format(r5, new Object[]{r6.toString()});
        StringWriter r1 = new StringWriter();
        r6.printStackTrace(new PrintWriter(r1));
        r0.println(r4 + ": " + r52 + "\n" + r1.toString());
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: s */
    public C1970t mo3704s() {
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1911j0
    public void start() {
    }

    @Override // io.sentry.InterfaceC1916k1
    public void stop() {
    }

    @Override // io.sentry.InterfaceC1833c0
    public Future submit(Runnable r3) {
        return new FutureTask(new CallableC1590I(1));
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: t */
    public InterfaceC1912j1 mo3705t() {
        return f5773b;
    }

    @Override // io.sentry.InterfaceC1911j0
    /* JADX INFO: renamed from: u */
    public void mo3706u(InterfaceC1895i0 r1) {
    }
}
