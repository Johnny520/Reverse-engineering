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

/* JADX INFO: renamed from: io.sentry.android.core.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1699h0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1651Z f6154a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f6155b;

    /* JADX INFO: renamed from: c */
    public final C1718f f6156c = new C1718f(0, 60000);

    /* JADX INFO: renamed from: d */
    public final char[] f6157d = new char[64];

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration f6158e;

    public C1699h0(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC1651Z interfaceC1651Z, SentryAndroidOptions sentryAndroidOptions) {
        this.f6158e = systemEventsBreadcrumbsIntegration;
        this.f6154a = interfaceC1651Z;
        this.f6155b = sentryAndroidOptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        r2 = r11;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        C1697g0 c1697g0;
        Bundle extras;
        int i;
        String action = intent.getAction();
        boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        SentryAndroidOptions sentryAndroidOptions = this.f6155b;
        String str = null;
        if (!zEquals) {
            c1697g0 = null;
        } else {
            if (this.f6156c.m3904a()) {
                return;
            }
            Float fM3841b = C1670M.m3841b(intent, sentryAndroidOptions);
            c1697g0 = new C1697g0(fM3841b != null ? Integer.valueOf(fM3841b.intValue()) : null, C1670M.m3843d(intent, sentryAndroidOptions));
            SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.f6158e;
            if (c1697g0.equals(systemEventsBreadcrumbsIntegration.f6037l)) {
                return;
            } else {
                systemEventsBreadcrumbsIntegration.f6037l = c1697g0;
            }
        }
        C1871f c1871f = new C1871f(System.currentTimeMillis());
        c1871f.f6712e = "system";
        c1871f.f6714g = "device.event";
        if (action != null) {
            int length = action.length();
            char[] cArr = this.f6157d;
            int length2 = cArr.length;
            int i2 = length - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                char cCharAt = action.charAt(i2);
                if (cCharAt == '.') {
                    str = new String(cArr, length2, cArr.length - length2);
                    break;
                }
                if (length2 == 0) {
                    Charset charset = AbstractC2038j.f7226a;
                    int iLastIndexOf = action.lastIndexOf(".");
                    if (iLastIndexOf < 0 || action.length() <= (i = iLastIndexOf + 1)) {
                        break;
                    } else {
                        str = action.substring(i);
                    }
                } else {
                    length2--;
                    cArr[length2] = cCharAt;
                    i2--;
                }
            }
        }
        if (str != null) {
            c1871f.m4093b("action", str);
        }
        if (c1697g0 != null) {
            Integer num = c1697g0.f6143a;
            if (num != null) {
                c1871f.m4093b("level", num);
            }
            Boolean bool = c1697g0.f6144b;
            if (bool != null) {
                c1871f.m4093b("charging", bool);
            }
        } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
            HashMap map = new HashMap(extras.size());
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj != null) {
                        map.put(str2, obj.toString());
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().mo3682n(EnumC1657a2.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                }
            }
            c1871f.m4093b("extras", map);
        }
        c1871f.f6716i = EnumC1657a2.INFO;
        C1586H c1586h = new C1586H();
        c1586h.m3668c("android:intent", intent);
        this.f6154a.mo3712f(c1871f, c1586h);
    }
}
