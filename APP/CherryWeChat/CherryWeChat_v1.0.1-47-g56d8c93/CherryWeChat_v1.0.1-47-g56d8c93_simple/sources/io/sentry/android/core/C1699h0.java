package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.C1586H;
import io.sentry.C1871f;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1651Z;
import io.sentry.android.core.internal.util.C1718f;
import io.sentry.util.AbstractC2038j;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.core.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1699h0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1651Z f6154a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f6155b;

    /* JADX INFO: renamed from: c */
    public final C1718f f6156c;

    /* JADX INFO: renamed from: d */
    public final char[] f6157d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration f6158e;

    public C1699h0(SystemEventsBreadcrumbsIntegration r4, InterfaceC1651Z r5, SentryAndroidOptions r6) {
        this.f6158e = r4;
        this.f6156c = new C1718f(0, 60000);
        this.f6157d = new char[64];
        this.f6154a = r5;
        this.f6155b = r6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r11, Intent r12) {
        String r112 = r12.getAction();
        boolean r0 = "android.intent.action.BATTERY_CHANGED".equals(r112);
        SentryAndroidOptions r1 = this.f6155b;
        String r2 = null;
        if (r0 == true) goto L5;
        C1697g0 r4 = null;
    L16:
        C1871f r02 = new C1871f(System.currentTimeMillis());
        r02.f6712e = "system";
        r02.f6714g = "device.event";
        if (r112 == null) goto L32;
        int r22 = r112.length();
        char[] r3 = this.f6157d;
        int r5 = r3.length;
        int r23 = r22 - 1;
    L20:
        if (r23 < 0) goto L31;
        char r6 = r112.charAt(r23);
        if (r6 == '.') goto L23;
        if (r5 == 0) goto L25;
        r5 = r5 - 1;
        r3[r5] = r6;
        r23 = r23 - 1;
        goto L20
    L25:
        Charset r24 = AbstractC2038j.f7226a;
        int r25 = r112.lastIndexOf(".");
        if (r25 < 0) goto L31;
        int r26 = r25 + 1;
        if (r112.length() <= r26) goto L31;
        r2 = r112.substring(r26);
        goto L32
    L23:
        r2 = new String(r3, r5, r3.length - r5);
    L31:
        r2 = r112;
    L32:
        if (r2 == null) goto L34;
        r02.m4093b("action", r2);
    L34:
        if (r4 == null) goto L42;
        Integer r113 = r4.f6143a;
        if (r113 == null) goto L38;
        r02.m4093b("level", r113);
    L38:
        Boolean r114 = r4.f6144b;
        if (r114 == null) goto L58;
        r02.m4093b("charging", r114);
    L58:
        r02.f6716i = EnumC1657a2.INFO;
        C1586H r115 = new C1586H();
        r115.m3668c("android:intent", r12);
        this.f6154a.mo3712f(r02, r115);
        return;
    L42:
        if (r1.isEnableSystemEventBreadcrumbsExtras() == false) goto L58;
        Bundle r27 = r12.getExtras();
        if (r27 == null) goto L58;
        if (r27.isEmpty() == true) goto L58;
        HashMap r32 = new HashMap(r27.size());
        Iterator<String> r42 = r27.keySet().iterator();
    L49:
        if (r42.hasNext() == false) goto L57;
        String r52 = r42.next();
        Object r62 = r27.get(r52);     // Catch: Throwable -> L55
        if (r62 == null) goto L49;
        r32.put(r52, r62.toString());     // Catch: Throwable -> L55
    L55:
        th = move-exception;
        r1.getLogger().mo3682n(EnumC1657a2.ERROR, th, "%s key of the %s action threw an error.", new Object[]{r52, r112});
        goto L49
    L57:
        r02.m4093b("extras", r32);
        goto L58
    L5:
        if (this.f6156c.m3904a() == true) goto L72;
        Float r03 = C1670M.m3841b(r12, r1);
        if (r03 == null) goto L10;
        Integer r04 = Integer.valueOf(r03.intValue());
    L11:
        r4 = new C1697g0(r04, C1670M.m3843d(r12, r1));
        SystemEventsBreadcrumbsIntegration r05 = this.f6158e;
        if (r4.equals(r05.f6037l) == false) goto L14;
        return;
    L14:
        r05.f6037l = r4;
        goto L16
    L10:
        r04 = null;
        goto L11
    }
}
