package io.sentry;

import io.sentry.android.core.C1672O;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.InterfaceC1888f;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.hints.InterfaceC1892j;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1656a1 extends AbstractC2052w {

    /* JADX INFO: renamed from: i */
    public static final Charset f5905i = null;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1651Z f5906e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1622Q f5907f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1866e0 f5908g;

    /* JADX INFO: renamed from: h */
    public final ILogger f5909h;

    static {
        f5905i = Charset.forName("UTF-8");
    }

    public C1656a1(InterfaceC1651Z r7, InterfaceC1622Q r8, InterfaceC1866e0 r9, ILogger r10, long r11, int r13) {
        super(r7, r10, r11, r13);
        AbstractC1856a.m4048D("Scopes are required.", r7);
        this.f5906e = r7;
        AbstractC1856a.m4048D("Envelope reader is required.", r8);
        this.f5907f = r8;
        AbstractC1856a.m4048D("Serializer is required.", r9);
        this.f5908g = r9;
        AbstractC1856a.m4048D("Logger is required.", r10);
        this.f5909h = r10;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3794c(C1656a1 r2, File r3, InterfaceC1889g r4) {
        ILogger r22 = r2.f5909h;
        if (r4.mo3846a() == true) goto L13;
    L8:
        e = move-exception;
        r22.mo3682n(EnumC1657a2.ERROR, e, "Failed to delete: %s", new Object[]{r3.getAbsolutePath()});
        return;
    L5:
        if (r3.delete() == true) goto L14;
        r22.mo3680e(EnumC1657a2.ERROR, "Failed to delete: %s", new Object[]{r3.getAbsolutePath()});     // Catch: RuntimeException -> L8
        return;
    L14:
        return;
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: a */
    public final boolean mo3587a(String r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (r2.startsWith("session") == false) goto L6;
        return false;
    L6:
        if (r2.startsWith("previous_session") == false) goto L8;
        return false;
    L8:
        if (r2.startsWith("startup_crash") == true) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: b */
    public final void mo3588b(File r7, C1586H r8) {
        boolean r1 = mo3587a(r7.getName());
        ILogger r2 = this.f5909h;
        if (r1 == true) goto L45;
        r2.mo3680e(EnumC1657a2.DEBUG, "File '%s' should be ignored.", new Object[]{r7.getAbsolutePath()});
        return;
    L45:
        BufferedInputStream r12 = new BufferedInputStream(new FileInputStream(r7));     // Catch: Throwable -> L21 IOException -> L23
        C1901c r3 = this.f5907f.mo3556a(r12);     // Catch: Throwable -> L10
        if (r3 != null) goto L12;
        r2.mo3680e(EnumC1657a2.ERROR, "Stream from path %s resulted in a null envelope.", new Object[]{r7.getAbsolutePath()});     // Catch: Throwable -> L10
    L13:
        r12.close();     // Catch: Throwable -> L21 IOException -> L23
        Object r13 = AbstractC1856a.m4072s(r8);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r8)) == false) goto L19;
        if (r13 == null) goto L19;
        m3794c(this, r7, (InterfaceC1889g) r13);
        return;
    L19:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r13, r2);
        return;
    L12:
        m3796e(r3, r8);     // Catch: Throwable -> L10
        r2.mo3680e(EnumC1657a2.DEBUG, "File '%s' is done.", new Object[]{r7.getAbsolutePath()});     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r12.close();     // Catch: Throwable -> L27
    L29:
        throw th;     // Catch: Throwable -> L21 IOException -> L23
    L27:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L21 IOException -> L23
    L23:
        e = move-exception;
        r2.mo3683r(EnumC1657a2.ERROR, "Error processing envelope.", e);     // Catch: Throwable -> L21
        Object r14 = AbstractC1856a.m4072s(r8);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r8)) == false) goto L35;
        if (r14 == null) goto L35;
        m3794c(this, r7, (InterfaceC1889g) r14);
        return;
    L35:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r14, r2);
        return;
    L21:
        th = move-exception;
        Object r32 = AbstractC1856a.m4072s(r8);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r8)) == false) goto L41;
        if (r32 == null) goto L41;
        m3794c(this, r7, (InterfaceC1889g) r32);
    L42:
        throw th;
    L41:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r32, r2);
        goto L42
    }

    /* JADX INFO: renamed from: d */
    public final C2648vx m3795d(C1613N2 r11) {
        ILogger r0 = this.f5909h;
        if (r11 == null) goto L19;
        String r1 = r11.f5807g;
        if (r1 == null) goto L19;
        Double r6 = Double.valueOf(Double.parseDouble(r1));     // Catch: Exception -> L17
        if (AbstractC1856a.m4077y(r6, false) == true) goto L9;
        r0.mo3680e(EnumC1657a2.ERROR, "Invalid sample rate parsed from TraceContext: %s", new Object[]{r1});     // Catch: Exception -> L17
        goto L19
    L9:
        String r112 = r11.f5808h;     // Catch: Exception -> L17
        if (r112 == null) goto L16;
        Double r7 = Double.valueOf(Double.parseDouble(r112));     // Catch: Exception -> L17
        if (AbstractC1856a.m4077y(r7, false) == false) goto L16;
        return new C2648vx(Boolean.TRUE, r6, r7, Boolean.FALSE, null);
    L16:
        return AbstractC1856a.m4056b(new C2648vx(Boolean.TRUE, r6));
    L17:
        r0.mo3680e(EnumC1657a2.ERROR, "Unable to parse sample rate from TraceContext: %s", new Object[]{r1});
    L19:
        return new C2648vx(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m3796e(C1901c r21, C1586H r22) {
        EnumC1657a2 r3 = EnumC1657a2.DEBUG;
        Iterable r4 = (Iterable) r21.f6782c;
        C1596J1 r5 = (C1596J1) r21.f6781b;
        if ((r4 instanceof Collection) == false) goto L5;
        int r0 = ((Collection) r4).size();
    L10:
        Object[] r02 = {Integer.valueOf(r0)};
        ILogger r7 = this.f5909h;
        r7.mo3680e(r3, "Processing Envelope with %d item(s)", r02);
        Iterator r32 = r4.iterator();
        int r03 = 0;
    L12:
        if (r32.hasNext() == false) goto L140;
        C1620P1 r42 = (C1620P1) r32.next();
        int r9 = r03 + 1;
        C1624Q1 r04 = r42.f5822a;
        C1624Q1 r10 = r42.f5822a;
        if (r04 != null) goto L17;
        r7.mo3680e(EnumC1657a2.ERROR, "Item %d has no header", new Object[]{Integer.valueOf(r9)});
        Iterator r16 = r32;
        int r17 = r9;
    L109:
        r32 = r16;
        r03 = r17;
        goto L12
    L17:
        boolean r11 = EnumC1653Z1.Event.equals(r04.f5834e);
        InterfaceC1866e0 r8 = this.f5908g;
        r16 = r32;
        Charset r33 = f5905i;
        r17 = r9;
        InterfaceC1651Z r92 = this.f5906e;
        if (r11 == true) goto L113;
        EnumC1653Z1 r6 = EnumC1653Z1.Transaction;
        EnumC1653Z1 r112 = r04.f5834e;
        EnumC1653Z1 r05 = r04.f5834e;
        if (r6.equals(r112) == true) goto L122;
        r92.mo3713g(new C1901c(r5.f5755a, r5.f5756b, r42), r22);
        r7.mo3680e(EnumC1657a2.DEBUG, "%s item %d is being captured.", new Object[]{r05.getItemType(), Integer.valueOf(r17)});
        if (m3797f(r22) == false) goto L99;
    L100:
        Object r06 = AbstractC1856a.m4072s(r22);
        if ((r06 instanceof InterfaceC1892j) == true) goto L103;
    L105:
        Object r07 = AbstractC1856a.m4072s(r22);
        if (C1672O.class.isInstance(AbstractC1856a.m4072s(r22)) == false) goto L109;
        if (r07 == null) goto L109;
        C1672O r08 = (C1672O) r07;
        r08.f5999c = new CountDownLatch(1);
        r08.f5997a = false;
        r08.f5998b = false;
        goto L109
    L103:
        if (((InterfaceC1892j) r06).mo3848c() == true) goto L105;
        r7.mo3680e(EnumC1657a2.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", new Object[]{Integer.valueOf(r17)});
        return;
    L99:
        r7.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for item type submission: %s", new Object[]{r05.getItemType()});
        return;
    L122:
        String r19 = "Item failed to process.";
        BufferedReader r62 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r42.m3733f()), r33));     // Catch: Throwable -> L76
        C1944A r09 = (C1944A) r8.mo3607a(r62, C1944A.class);     // Catch: Throwable -> L78
        if (r09 != null) goto L69;
        r7.mo3680e(EnumC1657a2.ERROR, "Item %d of type %s returned null by the parser.", new Object[]{Integer.valueOf(r17), r10.f5834e});     // Catch: Throwable -> L78
    L87:
        r62.close();     // Catch: Throwable -> L76
        goto L100
    L69:
        C1970t r34 = r5.f5755a;     // Catch: Throwable -> L78
        if (r34 != null) goto L72;
    L80:
        C1613N2 r35 = r5.f5757c;     // Catch: Throwable -> L78
        if (r09.f5605b.mo4126h() == null) goto L83;
        r09.f5605b.mo4126h().m3673a(m3795d(r35));     // Catch: Throwable -> L78
    L83:
        r92.mo3720o(r09, r35, r22, null);     // Catch: Throwable -> L78
        r7.mo3680e(EnumC1657a2.DEBUG, "Item %d is being captured.", new Object[]{Integer.valueOf(r17)});     // Catch: Throwable -> L78
        if (m3797f(r22) == true) goto L87;
        C1970t r010 = r09.f5604a;     // Catch: Throwable -> L78
        r7.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for event id submission: %s", new Object[]{r010});     // Catch: Throwable -> L78
    L86:
        r62.close();     // Catch: Throwable -> L76
        return;
    L72:
        if (r34.equals(r09.f5604a) == true) goto L80;
        C1970t r011 = r09.f5604a;     // Catch: Throwable -> L78
        r7.mo3680e(EnumC1657a2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", new Object[]{Integer.valueOf(r17), r5.f5755a, r011});     // Catch: Throwable -> L78
        r62.close();     // Catch: Throwable -> L76
    L78:
        th = move-exception;
        r62.close();     // Catch: Throwable -> L91
    L136:
        throw th;     // Catch: Throwable -> L76
    L91:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L76
        throw th;     // Catch: Throwable -> L76
    L76:
        th = th;
    L96:
        r7.mo3683r(EnumC1657a2.ERROR, r19, th);
    L94:
        th = th;
        r19 = "Item failed to process.";
        goto L96
    L113:
        String r192 = "Item failed to process.";
        BufferedReader r113 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r42.m3733f()), r33));     // Catch: Throwable -> L44
        C1627R1 r012 = (C1627R1) r8.mo3607a(r113, C1627R1.class);     // Catch: Throwable -> L35
        if (r012 != null) goto L26;
        r7.mo3680e(EnumC1657a2.ERROR, "Item %d of type %s returned null by the parser.", new Object[]{Integer.valueOf(r17), r10.f5834e});     // Catch: Throwable -> L35
    L50:
        r113.close();     // Catch: Throwable -> L44
        goto L100
    L26:
        C1968r r36 = r012.f5606c;     // Catch: Throwable -> L35
        if (r36 == null) goto L37;
        String r37 = r36.f6999a;     // Catch: Throwable -> L35
        if (r37.startsWith("sentry.javascript") == false) goto L31;
    L34:
        r22.m3668c("sentry:isFromHybridSdk", Boolean.TRUE);     // Catch: Throwable -> L35
        goto L37
    L31:
        if (r37.startsWith("sentry.dart") == true) goto L34;
        if (r37.startsWith("sentry.dotnet") == true) goto L34;
    L37:
        C1970t r38 = r5.f5755a;     // Catch: Throwable -> L35
        if (r38 != null) goto L40;
    L46:
        r92.mo3723r(r012, r22);     // Catch: Throwable -> L35
        r7.mo3680e(EnumC1657a2.DEBUG, "Item %d is being captured.", new Object[]{Integer.valueOf(r17)});     // Catch: Throwable -> L35
        if (m3797f(r22) == true) goto L50;
        C1970t r013 = r012.f5604a;     // Catch: Throwable -> L35
        r7.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for event id submission: %s", new Object[]{r013});     // Catch: Throwable -> L35
    L49:
        r113.close();     // Catch: Throwable -> L44
        return;
    L40:
        if (r38.equals(r012.f5604a) == true) goto L46;
        C1970t r014 = r012.f5604a;     // Catch: Throwable -> L35
        r7.mo3680e(EnumC1657a2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", new Object[]{Integer.valueOf(r17), r5.f5755a, r014});     // Catch: Throwable -> L35
        r113.close();     // Catch: Throwable -> L44
    L35:
        th = move-exception;
        r113.close();     // Catch: Throwable -> L54
    L135:
        throw th;     // Catch: Throwable -> L44
    L54:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L44
        throw th;     // Catch: Throwable -> L44
    L44:
        th = th;
    L59:
        r7.mo3683r(EnumC1657a2.ERROR, r192, th);
    L57:
        th = th;
        r192 = "Item failed to process.";
        goto L59
    L140:
        return;
    L5:
        Iterator r015 = r4.iterator();
        int r72 = 0;
    L7:
        if (r015.hasNext() == false) goto L9;
        r015.next();
        r72 = r72 + 1;
        goto L7
    L9:
        r0 = r72;
        goto L10
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3797f(C1586H r3) {
        Object r32 = AbstractC1856a.m4072s(r3);
        if ((r32 instanceof InterfaceC1888f) == true) goto L5;
        AbstractC1856a.m4078z(InterfaceC1888f.class, r32, this.f5909h);
        return true;
    L5:
        return ((InterfaceC1888f) r32).mo3849d();
    }
}
