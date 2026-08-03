package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.C1563B0;
import io.sentry.C1599K0;
import io.sentry.C1650Y1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.C2067z2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.EnumC2063y2;
import io.sentry.InterfaceC1610N;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1912j1;
import io.sentry.InterfaceC1916k1;
import io.sentry.InterfaceC1935o0;
import io.sentry.RunnableC1631S1;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1779q;
import io.sentry.android.replay.capture.InterfaceC1776n;
import io.sentry.android.replay.gestures.C1785b;
import io.sentry.android.replay.util.RunnableC1803c;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2009d;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2020o;
import io.sentry.util.C2029a;
import io.sentry.util.C2035g;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0148Dc;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.C0382Iv;
import p000.C1251cA;
import p000.C1514ht;
import p000.RunnableC2069iq;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class ReplayIntegration implements InterfaceC1935o0, Closeable, InterfaceC1916k1, InterfaceC1610N, InterfaceC2020o {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f6381q = 0;

    /* JADX INFO: renamed from: a */
    public final Context f6382a;

    /* JADX INFO: renamed from: b */
    public final C2009d f6383b;

    /* JADX INFO: renamed from: c */
    public C2046v2 f6384c;

    /* JADX INFO: renamed from: d */
    public C2054w1 f6385d;

    /* JADX INFO: renamed from: e */
    public C1758C f6386e;

    /* JADX INFO: renamed from: f */
    public C1785b f6387f;

    /* JADX INFO: renamed from: g */
    public final C1251cA f6388g;

    /* JADX INFO: renamed from: h */
    public final C1251cA f6389h;

    /* JADX INFO: renamed from: i */
    public final C1251cA f6390i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f6391j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f6392k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1776n f6393l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1912j1 f6394m;

    /* JADX INFO: renamed from: n */
    public final C1563B0 f6395n;

    /* JADX INFO: renamed from: o */
    public final C2029a f6396o;

    /* JADX INFO: renamed from: p */
    public final C1795p f6397p;

    static {
        C1650Y1.m3790d().m3792b("maven:io.sentry:sentry-android-replay", "8.21.1");
    }

    public ReplayIntegration(Context r3) {
        C2009d r0 = C2009d.f7188a;
        Context r1 = r3.getApplicationContext();
        if (r1 == null) goto L6;
        r3 = r1;
    L6:
        this.f6382a = r3;
        this.f6383b = r0;
        this.f6388g = new C1251cA(C1760a.f6399d);
        this.f6389h = new C1251cA(C1760a.f6401f);
        this.f6390i = new C1251cA(C1760a.f6400e);
        this.f6391j = new AtomicBoolean(false);
        this.f6392k = new AtomicBoolean(false);
        this.f6394m = C1599K0.f5773b;
        this.f6395n = new C1563B0(4, false);
        this.f6396o = new C2029a();
        C1795p r32 = new C1795p();
        r32.f6517a = EnumC1796q.INITIAL;
        this.f6397p = r32;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
            	at java.base/java.util.Objects.checkIndex(Unknown Source)
            	at java.base/java.util.ArrayList.get(Unknown Source)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:368)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:330)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:293)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            this = this;
            io.sentry.util.a r0 = r6.f6396o
            io.sentry.r r0 = r0.m4173a()
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f6391j     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r1 == 0) goto L91
            io.sentry.android.replay.p r1 = r6.f6397p     // Catch: java.lang.Throwable -> L37
            io.sentry.android.replay.q r3 = io.sentry.android.replay.EnumC1796q.CLOSED     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.m3974a(r3)     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L1b
            goto L91
        L1b:
            io.sentry.v2 r1 = r6.f6384c     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L20
            r1 = r2
        L20:
            io.sentry.O r1 = r1.getConnectionStatusProvider()     // Catch: java.lang.Throwable -> L37
            r1.mo3687n(r6)     // Catch: java.lang.Throwable -> L37
            io.sentry.w1 r1 = r6.f6385d     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            io.sentry.transport.p r1 = r1.mo3709c()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f7207d     // Catch: java.lang.Throwable -> L37
            r1.remove(r6)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r1 = move-exception
            goto L95
        L39:
            r6.stop()     // Catch: java.lang.Throwable -> L37
            io.sentry.android.replay.C r1 = r6.f6386e     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Throwable -> L37
        L43:
            r6.f6386e = r2     // Catch: java.lang.Throwable -> L37
            cA r1 = r6.f6389h     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L37
            io.sentry.android.replay.s r1 = (io.sentry.android.replay.C1798s) r1     // Catch: java.lang.Throwable -> L37
            r1.close()     // Catch: java.lang.Throwable -> L37
            cA r1 = r6.f6390i     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch: java.lang.Throwable -> L37
            io.sentry.v2 r3 = r6.f6384c     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L5d
            r3 = r2
        L5d:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L37
            boolean r4 = r1.isShutdown()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            r1.shutdown()     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r2 = move-exception
            goto L8f
        L6a:
            long r3 = r3.getShutdownTimeoutMillis()     // Catch: java.lang.Throwable -> L68 java.lang.InterruptedException -> L7a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L68 java.lang.InterruptedException -> L7a
            boolean r3 = r1.awaitTermination(r3, r5)     // Catch: java.lang.Throwable -> L68 java.lang.InterruptedException -> L7a
            if (r3 != 0) goto L84
            r1.shutdownNow()     // Catch: java.lang.Throwable -> L68 java.lang.InterruptedException -> L7a
            goto L84
        L7a:
            r1.shutdownNow()     // Catch: java.lang.Throwable -> L68
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L68
            r3.interrupt()     // Catch: java.lang.Throwable -> L68
        L84:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            io.sentry.android.replay.p r1 = r6.f6397p     // Catch: java.lang.Throwable -> L37
            io.sentry.android.replay.q r3 = io.sentry.android.replay.EnumC1796q.CLOSED     // Catch: java.lang.Throwable -> L37
            r1.f6517a = r3     // Catch: java.lang.Throwable -> L37
            p000.AbstractC0714Qj.m1489k(r0, r2)
            return
        L8f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r2     // Catch: java.lang.Throwable -> L37
        L91:
            p000.AbstractC0714Qj.m1489k(r0, r2)
            return
        L95:
            throw r1     // Catch: java.lang.Throwable -> L96
        L96:
            r2 = move-exception
            p000.AbstractC0714Qj.m1489k(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.ReplayIntegration.close():void");
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: d */
    public final void mo3693d() {
        this.f6392k.set(true);
        m3949v();
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: f */
    public final void mo3694f(Boolean r5) {
        if (this.f6391j.get() == true) goto L5;
        return;
    L5:
        if (m3946r() == false) goto L28;
        C1970t r0 = C1970t.f7011b;
        InterfaceC1776n r1 = this.f6393l;
        InterfaceC1776n r2 = null;
        C2046v2 r22 = null;
        if (r1 == null) goto L10;
        C1970t r12 = ((AbstractC1767e) r1).m3954i();
    L12:
        if (r0.equals(r12) == false) goto L19;
        C2046v2 r52 = this.f6384c;
        if (r52 == null) goto L17;
        r22 = r52;
    L17:
        r22.getLogger().mo3680e(EnumC1657a2.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
        return;
    L19:
        InterfaceC1776n r02 = this.f6393l;
        if (r02 == null) goto L22;
        r02.mo3959b(r5.equals(Boolean.TRUE), new C1514ht(2, this));
    L22:
        InterfaceC1776n r53 = this.f6393l;
        if (r53 == null) goto L25;
        r2 = r53.mo3962e();
    L25:
        this.f6393l = r2;
        return;
    L10:
        r12 = null;
        goto L12
    }

    @Override // io.sentry.InterfaceC1610N
    /* JADX INFO: renamed from: i */
    public final void mo3725i(EnumC1606M r2) {
        if ((this.f6393l instanceof C1779q) == true) goto L6;
        return;
    L6:
        if (r2 != EnumC1606M.DISCONNECTED) goto L9;
        m3949v();
        return;
    L9:
        m3950w();
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: l */
    public final void mo3699l() {
        this.f6392k.set(false);
        m3950w();
    }

    @Override // io.sentry.transport.InterfaceC2020o
    /* JADX INFO: renamed from: m */
    public final void mo3877m(C2021p r2) {
        if ((this.f6393l instanceof C1779q) == true) goto L6;
        return;
    L6:
        if (r2.m4170f(EnumC1929n.All) == false) goto L8;
    L12:
        m3949v();
        return;
    L8:
        if (r2.m4170f(EnumC1929n.Replay) == true) goto L12;
        m3950w();
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: o */
    public final void mo3701o() {
        C1981r r1 = this.f6396o.m4173a();
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L68
    L68:
        th = move-exception;
        AbstractC0714Qj.m1489k(r1, th);
        throw th;
    L5:
        if (this.f6391j.get() == true) goto L8;
        AbstractC0714Qj.m1489k(r1, null);
        return;
    L8:
        C1795p r0 = this.f6397p;     // Catch: Throwable -> L16
        EnumC1796q r3 = EnumC1796q.STARTED;     // Catch: Throwable -> L16
        if (r0.m3974a(r3) == true) goto L18;
        C2046v2 r02 = this.f6384c;     // Catch: Throwable -> L16
        if (r02 != null) goto L13;
        r02 = null;
    L13:
        r02.getLogger().mo3680e(EnumC1657a2.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);     // Catch: Throwable -> L16
        AbstractC0714Qj.m1489k(r1, null);
        return;
    L18:
        C2035g r03 = (C2035g) this.f6388g.getValue();     // Catch: Throwable -> L16
        C2046v2 r5 = this.f6384c;     // Catch: Throwable -> L16
        if (r5 != null) goto L21;
        r5 = null;
    L21:
        Double r52 = r5.getSessionReplay().f7305a;     // Catch: Throwable -> L16
        if (r52 != null) goto L24;
    L26:
        boolean r04 = false;
    L27:
        if (r04 == true) goto L44;
        C2046v2 r53 = this.f6384c;     // Catch: Throwable -> L16
        if (r53 != null) goto L31;
        r53 = null;
    L31:
        Double r54 = r53.getSessionReplay().f7306b;     // Catch: Throwable -> L16
        if (r54 != null) goto L34;
    L36:
        boolean r55 = false;
    L37:
        if (r55 == true) goto L44;
        C2046v2 r05 = this.f6384c;     // Catch: Throwable -> L16
        if (r05 != null) goto L41;
        r05 = null;
    L41:
        r05.getLogger().mo3680e(EnumC1657a2.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);     // Catch: Throwable -> L16
        AbstractC0714Qj.m1489k(r1, null);
        return;
    L34:
        if (r54.doubleValue() <= 0.0d) goto L36;
        r55 = true;
    L44:
        this.f6397p.f6517a = r3;     // Catch: Throwable -> L16
        if (r04 == false) goto L50;
        C2046v2 r32 = this.f6384c;     // Catch: Throwable -> L16
        if (r32 != null) goto L49;
        r32 = null;
    L49:
        InterfaceC1776n r06 = new C1779q(r32, this.f6385d, this.f6383b, (ScheduledExecutorService) this.f6390i.getValue());     // Catch: Throwable -> L16
    L55:
        this.f6393l = r06;     // Catch: Throwable -> L16
        C1758C r07 = this.f6386e;     // Catch: Throwable -> L16
        if (r07 == null) goto L58;
        r07.f6373f.getAndSet(true);     // Catch: Throwable -> L16
    L58:
        InterfaceC1776n r08 = this.f6393l;     // Catch: Throwable -> L16
        if (r08 == null) goto L62;
        r08.mo3953f(0, new C1970t(), null);     // Catch: Throwable -> L16
    L62:
        if (this.f6386e == null) goto L64;
        ((C1798s) this.f6389h.getValue()).f6521c.add(this.f6386e);     // Catch: Throwable -> L16
    L64:
        ((C1798s) this.f6389h.getValue()).f6521c.add(this.f6387f);     // Catch: Throwable -> L16
        AbstractC0714Qj.m1489k(r1, null);
        return;
    L50:
        C2046v2 r09 = this.f6384c;     // Catch: Throwable -> L16
        if (r09 != null) goto L53;
        C2046v2 r8 = null;
    L54:
        r06 = new C1770h(r8, this.f6385d, this.f6383b, (C2035g) this.f6388g.getValue(), (ScheduledExecutorService) this.f6390i.getValue());     // Catch: Throwable -> L16
        goto L55
    L53:
        r8 = r09;
        goto L54
    L24:
        if (r52.doubleValue() < r03.m4179c()) goto L26;
        r04 = true;
        goto L27
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r8) {
        this.f6384c = r8;
        Double r0 = r8.getSessionReplay().f7305a;
        if (r0 != null) goto L5;
    L7:
        Double r02 = r8.getSessionReplay().f7306b;
        if (r02 != null) goto L10;
    L26:
        r8.getLogger().mo3680e(EnumC1657a2.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
        return;
    L10:
        if (r02.doubleValue() <= 0.0d) goto L26;
    L11:
        C2054w1 r03 = C2054w1.f7276a;
        this.f6385d = r03;
        this.f6386e = new C1758C(r8, this, this, this.f6395n, (ScheduledExecutorService) this.f6390i.getValue());
        this.f6387f = new C1785b(r8, this);
        this.f6391j.set(true);
        r8.getConnectionStatusProvider().mo3685h(this);
        C2021p r82 = r03.mo3709c();
        if (r82 == null) goto L14;
        r82.f7207d.add(this);
    L14:
        AbstractC1856a.m4055a("Replay");
        C2046v2 r83 = this.f6384c;
        if (r83 != null) goto L17;
        r83 = null;
    L17:
        InterfaceC1833c0 r84 = r83.getExecutorService();
        C2046v2 r1 = this.f6384c;
        if (r1 != null) goto L28;
        r1 = null;
    L28:
        r84.submit(new RunnableC1803c(0, new RunnableC1631S1(8, this), r1));     // Catch: Throwable -> L23
        return;
    L23:
        th = move-exception;
        r1.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        return;
    L5:
        if (r0.doubleValue() <= 0.0d) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: q */
    public final void m3945q(String r8) {
        C2046v2 r0 = this.f6384c;
        if (r0 != null) goto L5;
        r0 = null;
    L5:
        String r02 = r0.getCacheDirPath();
        if (r02 == null) goto L26;
        File[] r03 = new File(r02).listFiles();
        if (r03 == null) goto L32;
        int r1 = r03.length;
        int r3 = 0;
    L10:
        if (r3 >= r1) goto L33;
        File r4 = r03[r3];
        String r5 = r4.getName();
        if (r5.startsWith("replay_") == false) goto L25;
        InterfaceC1776n r6 = this.f6393l;
        if (r6 == null) goto L17;
        C1970t r62 = ((AbstractC1767e) r6).m3954i();
        if (r62 == null) goto L17;
    L19:
        if (AbstractC2564tz.m5051L(r5, r62.toString(), false) == true) goto L25;
        if (AbstractC2564tz.m5059T(r8) == false) goto L23;
    L24:
        AbstractC1856a.m4060f(r4);
        goto L25
    L23:
        if (AbstractC2564tz.m5051L(r5, r8, false) == true) goto L25;
    L17:
        r62 = C1970t.f7011b;
    L25:
        r3 = r3 + 1;
        goto L10
    L33:
        return;
    L32:
        return;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3946r() {
        if (this.f6397p.f6517a.compareTo(EnumC1796q.STARTED) >= 0) goto L5;
        return false;
    L5:
        if (this.f6397p.f6517a.compareTo(EnumC1796q.STOPPED) >= 0) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m3947s(Bitmap r5) {
        C0382Iv r0 = new C0382Iv();
        C2054w1 r1 = this.f6385d;
        if (r1 == null) goto L5;
        r1.mo3719m(new C1791l(r0, 0));
    L5:
        InterfaceC1776n r12 = this.f6393l;
        if (r12 == null) goto L9;
        r12.mo3963g(new C1793n(r5, r0, this));
        return;
    }

    @Override // io.sentry.InterfaceC1916k1
    public final void stop() {
        C1981r r0 = this.f6396o.m4173a();
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    L4:
        if (this.f6391j.get() == false) goto L28;
        C1795p r1 = this.f6397p;     // Catch: Throwable -> L14
        EnumC1796q r3 = EnumC1796q.STOPPED;     // Catch: Throwable -> L14
        if (r1.m3974a(r3) == false) goto L28;
        if (this.f6386e == null) goto L11;
        ((C1798s) this.f6389h.getValue()).f6521c.remove(this.f6386e);     // Catch: Throwable -> L14
    L11:
        ((C1798s) this.f6389h.getValue()).f6521c.remove(this.f6387f);     // Catch: Throwable -> L14
        C1758C r12 = this.f6386e;     // Catch: Throwable -> L14
        if (r12 == null) goto L16;
        r12.m3942l();     // Catch: Throwable -> L14
    L16:
        C1758C r13 = this.f6386e;     // Catch: Throwable -> L14
        if (r13 == null) goto L19;
        r13.m3944o();     // Catch: Throwable -> L14
    L19:
        C1785b r14 = this.f6387f;     // Catch: Throwable -> L14
        if (r14 == null) goto L22;
        r14.m3969a();     // Catch: Throwable -> L14
    L22:
        InterfaceC1776n r15 = this.f6393l;     // Catch: Throwable -> L14
        if (r15 == null) goto L25;
        r15.stop();     // Catch: Throwable -> L14
    L25:
        this.f6393l = null;     // Catch: Throwable -> L14
        this.f6397p.f6517a = r3;     // Catch: Throwable -> L14
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L28:
        AbstractC0714Qj.m1489k(r0, null);
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: t */
    public final InterfaceC1912j1 mo3705t() {
        return this.f6394m;
    }

    /* JADX INFO: renamed from: u */
    public final void m3948u(int r19, int r20) {
        if (this.f6391j.get() == true) goto L5;
        return;
    L5:
        if (m3946r() == false) goto L94;
        C2046v2 r0 = this.f6384c;
        View r2 = null;
        if (r0 != null) goto L11;
        r0 = null;
    L11:
        if (r0.getSessionReplay().f7314j == false) goto L90;
        Context r02 = this.f6382a;
        C2046v2 r3 = this.f6384c;
        if (r3 != null) goto L15;
        r3 = null;
    L15:
        C2067z2 r32 = r3.getSessionReplay();
        float r4 = r20;
        float r5 = r4 / r02.getResources().getDisplayMetrics().density;
        EnumC2063y2 r6 = r32.f7309e;
        int r52 = AbstractC0148Dc.m283q(r5 * r6.sizeScale);
        int r7 = r52 % 16;
        if (r7 > 8) goto L19;
        int r53 = r52 - r7;
    L18:
        int r11 = r53;
        float r54 = r19;
        int r03 = AbstractC0148Dc.m283q((r54 / r02.getResources().getDisplayMetrics().density) * r6.sizeScale);
        int r72 = r03 % 16;
        if (r72 > 8) goto L24;
        int r04 = r03 - r72;
    L23:
        int r10 = r04;
        C1821w r13 = new C1821w(r10, r11, r10 / r54, r11 / r4, r32.f7310f, r6.bitRate);
        if (this.f6391j.get() == true) goto L28;
        return;
    L28:
        if (m3946r() == false) goto L95;
        InterfaceC1776n r05 = this.f6393l;
        if (r05 == null) goto L33;
        r05.mo3960c(r13);
    L33:
        C1758C r06 = this.f6386e;
        if (r06 == null) goto L80;
        if (r06.f6373f.get() == false) goto L80;
        if (r06.f6378k != null) goto L52;
        C1981r r33 = r06.f6377j.m4173a();
    L45:
        th = move-exception;
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        AbstractC0714Qj.m1489k(r33, th);
        throw th;
    L42:
        if (r06.f6378k != null) goto L47;
        r06.f6378k = new RunnableC2069iq(r06.f6368a, r06.f6371d);     // Catch: Throwable -> L45
    L47:
        AbstractC0714Qj.m1489k(r33, null);
    L52:
        RunnableC2069iq r34 = r06.f6378k;
        if (r34 == null) goto L56;
        r34.f7322e = r13;
    L56:
        RunnableC2069iq r35 = r06.f6378k;
        if (r35 == null) goto L60;
        r35.f7321d = new ViewTreeObserverOnDrawListenerC1810v(r13, r06.f6368a, r06.f6371d, r06.f6372e, r06.f6369b);
    L60:
        WeakReference r36 = (WeakReference) AbstractC2453ra.m4903m0(r06.f6374g);
        if (r36 == null) goto L63;
        r2 = (View) r36.get();
    L63:
        if (r2 == null) goto L69;
        RunnableC2069iq r37 = r06.f6378k;
        if (r37 == null) goto L69;
        ViewTreeObserverOnDrawListenerC1810v r38 = (ViewTreeObserverOnDrawListenerC1810v) r37.f7321d;
        if (r38 == null) goto L69;
        r38.m3979a(r2);
    L69:
        C1563B0 r22 = r06.f6371d;
        RunnableC2069iq r39 = r06.f6378k;
        Handler r23 = (Handler) r22.f5600a;
        if (r39 == null) goto L73;
        r23.removeCallbacks(r39);
    L73:
        C1563B0 r24 = r06.f6371d;
        RunnableC2069iq r310 = r06.f6378k;
        Handler r25 = (Handler) r24.f5600a;
        if (r310 != null) goto L76;
        boolean r26 = false;
    L77:
        if (r26 == true) goto L80;
        r06.f6368a.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        goto L80
    L76:
        r26 = r25.postDelayed(r310, 100);
    L80:
        if (this.f6397p.f6517a != EnumC1796q.PAUSED) goto L92;
        C1758C r07 = this.f6386e;
        if (r07 == null) goto L93;
        r07.m3941i();
        return;
    L93:
        return;
    L92:
        return;
    L95:
        return;
    L24:
        r04 = r03 + (16 - r72);
        goto L23
    L19:
        r53 = r52 + (16 - r7);
        goto L18
    L90:
        return;
    }

    /* JADX INFO: renamed from: v */
    public final void m3949v() {
        C1981r r0 = this.f6396o.m4173a();
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    L4:
        if (this.f6391j.get() == false) goto L19;
        C1795p r1 = this.f6397p;     // Catch: Throwable -> L11
        EnumC1796q r3 = EnumC1796q.PAUSED;     // Catch: Throwable -> L11
        if (r1.m3974a(r3) == false) goto L19;
        C1758C r12 = this.f6386e;     // Catch: Throwable -> L11
        if (r12 == null) goto L13;
        r12.m3941i();     // Catch: Throwable -> L11
    L13:
        InterfaceC1776n r13 = this.f6393l;     // Catch: Throwable -> L11
        if (r13 == null) goto L16;
        r13.mo3961d();     // Catch: Throwable -> L11
    L16:
        this.f6397p.f6517a = r3;     // Catch: Throwable -> L11
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L19:
        AbstractC0714Qj.m1489k(r0, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m3950w() {
        C1981r r0 = this.f6396o.m4173a();
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    L4:
        if (this.f6391j.get() == false) goto L41;
        C1795p r1 = this.f6397p;     // Catch: Throwable -> L22
        EnumC1796q r3 = EnumC1796q.RESUMED;     // Catch: Throwable -> L22
        if (r1.m3974a(r3) == false) goto L41;
        if (this.f6392k.get() == true) goto L39;
        C2046v2 r12 = this.f6384c;     // Catch: Throwable -> L22
        if (r12 != null) goto L14;
        r12 = null;
    L14:
        if (r12.getConnectionStatusProvider().mo3684g() == EnumC1606M.DISCONNECTED) goto L39;
        C2054w1 r13 = this.f6385d;     // Catch: Throwable -> L22
        if (r13 == null) goto L24;
        C2021p r14 = r13.mo3709c();     // Catch: Throwable -> L22
        if (r14 == null) goto L24;
        if (r14.m4170f(EnumC1929n.All) == true) goto L39;
    L24:
        C2054w1 r15 = this.f6385d;     // Catch: Throwable -> L22
        if (r15 == null) goto L31;
        C2021p r16 = r15.mo3709c();     // Catch: Throwable -> L22
        if (r16 == null) goto L31;
        if (r16.m4170f(EnumC1929n.Replay) == true) goto L39;
    L31:
        this.f6397p.f6517a = r3;     // Catch: Throwable -> L22
        InterfaceC1776n r17 = this.f6393l;     // Catch: Throwable -> L22
        if (r17 == null) goto L34;
        ((AbstractC1767e) r17).m3958m(AbstractC1856a.m4067m());     // Catch: Throwable -> L22
    L34:
        C1758C r18 = this.f6386e;     // Catch: Throwable -> L22
        if (r18 == null) goto L37;
        r18.m3943m();     // Catch: Throwable -> L22
    L37:
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L39:
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L41:
        AbstractC0714Qj.m1489k(r0, null);
    }
}
