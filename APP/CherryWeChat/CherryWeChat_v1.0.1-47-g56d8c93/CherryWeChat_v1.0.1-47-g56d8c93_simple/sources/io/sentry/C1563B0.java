package io.sentry;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import io.sentry.android.core.AbstractC1671N;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1676T;
import io.sentry.android.replay.util.InterfaceC1809i;
import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1869a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1969s;
import io.sentry.protocol.C1975y;
import io.sentry.transport.C2022q;
import io.sentry.util.AbstractC2030b;
import io.sentry.util.C2032d;
import io.sentry.vendor.gson.stream.C2051c;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p000.C0307H5;

/* JADX INFO: renamed from: io.sentry.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1563B0 implements InterfaceC1809i {

    /* JADX INFO: renamed from: a */
    public final Object f5600a;

    public /* synthetic */ C1563B0(Object r1) {
        this.f5600a = r1;
    }

    /* JADX INFO: renamed from: k */
    public static C1969s m3589k(Throwable r5, C1961k r6, Long r7, List r8, boolean r9) {
        Package r0 = r5.getClass().getPackage();
        String r1 = r5.getClass().getName();
        C1969s r2 = new C1969s();
        String r52 = r5.getMessage();
        if (r0 == null) goto L5;
        r1 = r1.replace(r0.getName() + ".", "");
    L5:
        if (r0 == null) goto L7;
        String r02 = r0.getName();
    L8:
        if (r8 != null) goto L10;
    L15:
        r2.f7007d = r7;
        r2.f7004a = r1;
        r2.f7009f = r6;
        r2.f7006c = r02;
        r2.f7005b = r52;
        return r2;
    L10:
        if (r8.isEmpty() == true) goto L15;
        C1975y r3 = new C1975y(r8);
        if (r9 == false) goto L14;
        r3.f7057c = Boolean.TRUE;
    L14:
        r2.f7008e = r3;
        goto L15
    L7:
        r02 = null;
        goto L8
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: a */
    public int mo3590a(int r2) {
        return ((Layout) this.f5600a).getLineStart(r2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: b */
    public int mo3591b() {
        return ((Layout) this.f5600a).getLineCount();
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: c */
    public Integer mo3592c() {
        Layout r0 = (Layout) this.f5600a;
        if ((r0.getText() instanceof Spanned) == true) goto L5;
        return null;
    L5:
        int r5 = 0;
        ForegroundColorSpan[] r1 = (ForegroundColorSpan[]) ((Spanned) r0.getText()).getSpans(0, r0.getText().length(), ForegroundColorSpan.class);
        int r3 = r1.length;
        int r4 = Integer.MIN_VALUE;
        Integer r6 = null;
    L6:
        if (r5 >= r3) goto L15;
        ForegroundColorSpan r7 = r1[r5];
        int r8 = ((Spanned) r0.getText()).getSpanStart(r7);
        int r9 = ((Spanned) r0.getText()).getSpanEnd(r7);
        if (r8 == (-1)) goto L14;
        if (r9 == (-1)) goto L14;
        int r92 = r9 - r8;
        if (r92 <= r4) goto L14;
        r6 = Integer.valueOf(r7.getForegroundColor());
        r4 = r92;
    L14:
        r5 = r5 + 1;
        goto L6
    L15:
        if (r6 != null) goto L17;
        return null;
    L17:
        return Integer.valueOf(r6.intValue() | (-16777216));
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: d */
    public int mo3593d(int r2) {
        return ((Layout) this.f5600a).getLineVisibleEnd(r2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: e */
    public int mo3594e(int r2) {
        return ((Layout) this.f5600a).getLineTop(r2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: f */
    public float mo3595f(int r1, int r2) {
        return ((Layout) this.f5600a).getPrimaryHorizontal(r2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: g */
    public int mo3596g(int r2) {
        return ((Layout) this.f5600a).getEllipsisCount(r2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: h */
    public int mo3597h(int r2) {
        return ((Layout) this.f5600a).getLineBottom(r2);
    }

    /* JADX INFO: renamed from: i */
    public void m3598i(AbstractC1671N r3) {
        ((C1666I) this.f5600a).getClass();
        if (Build.VERSION.SDK_INT > 28) goto L11;
        String r0 = r3.getCallingPackage();
        String r32 = r3.getContext().getPackageName();
        if (r0 == null) goto L10;
        if (r0.equals(r32) == false) goto L10;
        return;
    L10:
        throw new SecurityException("Provider does not allow for granting of Uri permissions");
    }

    /* JADX INFO: renamed from: j */
    public void m3599j(Throwable r11, AtomicInteger r12, HashSet r13, ArrayDeque r14, String r15) {
        int r0 = r12.get();
    L3:
        if (r11 == null) goto L26;
        if (r13.add(r11) == false) goto L32;
        if (r15 != null) goto L8;
        r15 = "chained";
    L8:
        int r2 = 0;
        if ((r11 instanceof C1869a) == false) goto L11;
        C1869a r112 = (C1869a) r11;
        C1961k r1 = r112.f6704a;
        Throwable r3 = r112.f6705b;
        Thread r4 = r112.f6706c;
        boolean r16 = r112.f6707d;
        r11 = r3;
        C1961k r32 = r1;
    L12:
        r14.addFirst(m3589k(r11, r32, Long.valueOf(r4.getId()), ((C2002t) this.f5600a).m4155b(r11.getStackTrace(), Boolean.FALSE.equals(r32.f6957d)), r16));
        if (r32.f6954a != null) goto L16;
        r32.f6954a = r15;
    L16:
        if (r12.get() < 0) goto L18;
        r32.f6962i = Integer.valueOf(r0);
    L18:
        r0 = r12.incrementAndGet();
        r32.f6961h = Integer.valueOf(r0);
        Throwable[] r152 = r11.getSuppressed();
        if (r152 == null) goto L25;
        if (r152.length <= 0) goto L25;
        int r17 = r152.length;
    L23:
        if (r2 >= r17) goto L25;
        m3599j(r152[r2], r12, r13, r14, "suppressed");
        r2 = r2 + 1;
    L25:
        r11 = r11.getCause();
        r15 = null;
        r12 = r12;
        r13 = r13;
        r14 = r14;
        goto L3
    L11:
        C1961k r18 = new C1961k();
        r4 = Thread.currentThread();
        r32 = r18;
        r16 = false;
        goto L12
    L32:
        return;
    }

    /* JADX INFO: renamed from: l */
    public void m3600l(C1901c r5, ILogger r6, Object r7) {
        C2051c r0 = (C2051c) r5.f6781b;
        if (r7 != null) goto L7;
        r0.m4220l();
        return;
    L7:
        if ((r7 instanceof Character) == false) goto L11;
        r5.m4115z(Character.toString(((Character) r7).charValue()));
        return;
    L11:
        if ((r7 instanceof String) == false) goto L15;
        r5.m4115z((String) r7);
        return;
    L15:
        if ((r7 instanceof Boolean) == false) goto L19;
        r5.m4100A(((Boolean) r7).booleanValue());
        return;
    L19:
        if ((r7 instanceof Number) == false) goto L23;
        r5.m4114y((Number) r7);
        return;
    L23:
        if ((r7 instanceof Date) == false) goto L30;
        r5.m4115z(AbstractC1856a.m4073t((Date) r7));     // Catch: Exception -> L27
        return;
    L27:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.ERROR, "Error when serializing Date", e);
        r0.m4220l();
        return;
    L30:
        if ((r7 instanceof TimeZone) == false) goto L37;
        r5.m4115z(((TimeZone) r7).getID());     // Catch: Exception -> L34
        return;
    L34:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.ERROR, "Error when serializing TimeZone", e);
        r0.m4220l();
        return;
    L37:
        if ((r7 instanceof InterfaceC1567C0) == false) goto L41;
        ((InterfaceC1567C0) r7).serialize(r5, r6);
        return;
    L41:
        if ((r7 instanceof Collection) == false) goto L45;
        m3601m(r5, r6, (Collection) r7);
        return;
    L45:
        if (r7.getClass().isArray() == false) goto L49;
        m3601m(r5, r6, Arrays.asList((Object[]) r7));
        return;
    L49:
        if ((r7 instanceof Map) == false) goto L53;
        m3602n(r5, r6, (Map) r7);
        return;
    L53:
        if ((r7 instanceof Locale) == false) goto L57;
        r5.m4115z(r7.toString());
        return;
    L57:
        if ((r7 instanceof AtomicIntegerArray) == false) goto L64;
        AtomicIntegerArray r72 = (AtomicIntegerArray) r7;
        Charset r02 = AbstractC2030b.f7215a;
        int r03 = r72.length();
        ArrayList r1 = new ArrayList(r03);
        int r2 = 0;
    L59:
        if (r2 >= r03) goto L61;
        r1.add(Integer.valueOf(r72.get(r2)));
        r2 = r2 + 1;
        goto L59
    L61:
        m3601m(r5, r6, r1);
        return;
    L64:
        if ((r7 instanceof AtomicBoolean) == false) goto L68;
        r5.m4100A(((AtomicBoolean) r7).get());
        return;
    L68:
        if ((r7 instanceof URI) == false) goto L72;
        r5.m4115z(r7.toString());
        return;
    L72:
        if ((r7 instanceof InetAddress) == false) goto L76;
        r5.m4115z(r7.toString());
        return;
    L76:
        if ((r7 instanceof UUID) == false) goto L80;
        r5.m4115z(r7.toString());
        return;
    L80:
        if ((r7 instanceof Currency) == false) goto L84;
        r5.m4115z(r7.toString());
        return;
    L84:
        if ((r7 instanceof Calendar) == false) goto L88;
        m3602n(r5, r6, AbstractC2030b.m4174a((Calendar) r7));
        return;
    L88:
        if (r7.getClass().isEnum() == false) goto L100;
        r5.m4115z(r7.toString());
        return;
    L100:
        m3600l(r5, r6, ((C0307H5) this.f5600a).m658b(r6, r7));     // Catch: Exception -> L93
        return;
    L93:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.ERROR, "Failed serializing unknown object.", e);
        r5.m4115z("[OBJECT]");
    }

    /* JADX INFO: renamed from: m */
    public void m3601m(C1901c r6, ILogger r7, Collection r8) {
        C2051c r0 = (C2051c) r6.f6781b;
        r0.m4223p();
        r0.m4217d();
        int r1 = r0.f7265c;
        int[] r2 = r0.f7264b;
        if (r1 != r2.length) goto L5;
        r0.f7264b = Arrays.copyOf(r2, r1 * 2);
    L5:
        int[] r12 = r0.f7264b;
        int r22 = r0.f7265c;
        r0.f7265c = r22 + 1;
        r12[r22] = 1;
        r0.f7263a.write(91);
        Iterator r82 = r8.iterator();
    L7:
        if (r82.hasNext() == false) goto L9;
        m3600l(r6, r7, r82.next());
        goto L7
    L9:
        r0.m4218f(1, 2, ']');
    }

    /* JADX INFO: renamed from: n */
    public void m3602n(C1901c r4, ILogger r5, Map r6) {
        r4.m4101h();
        Iterator r0 = r6.keySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if ((r1 instanceof String) == false) goto L4;
        r4.m4106p((String) r1);
        m3600l(r4, r5, r6.get(r1));
        goto L4
    L8:
        r4.m4102k();
    }

    public C1563B0(int r2, boolean r3) {
        switch(r2) {
            case 4: goto L9;
            case 5: goto L3;
            case 6: goto L7;
            case 7: goto L5;
            default: goto L3;
        };
    L3:
        this.f5600a = new C1666I(C1611N0.f5797a);
        return;
    L5:
        this.f5600a = new C2022q();
        return;
    L7:
        this.f5600a = new C2032d(new C1676T(3));
        return;
    L9:
        this.f5600a = new Handler(Looper.getMainLooper());
    }

    public C1563B0(int r2) {
        this.f5600a = new C0307H5(r2);
    }
}
