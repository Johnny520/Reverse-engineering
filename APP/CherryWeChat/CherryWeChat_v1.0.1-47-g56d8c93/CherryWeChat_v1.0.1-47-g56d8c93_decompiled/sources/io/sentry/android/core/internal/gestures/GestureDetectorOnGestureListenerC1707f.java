package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C1586H;
import io.sentry.C1621P2;
import io.sentry.C1625Q2;
import io.sentry.C1871f;
import io.sentry.C2054w1;
import io.sentry.EnumC1605L2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1651Z;
import io.sentry.InterfaceC1895i0;
import io.sentry.android.core.C1676T;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.gestures.C1903b;
import io.sentry.internal.gestures.EnumC1902a;
import io.sentry.protocol.EnumC1946C;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import p000.AbstractC2374ph;
import p000.C0698Q9;
import p000.C2464rl;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.f */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC1707f implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f6171a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1651Z f6172b;

    /* JADX INFO: renamed from: c */
    public final SentryAndroidOptions f6173c;

    /* JADX INFO: renamed from: d */
    public C1903b f6174d = null;

    /* JADX INFO: renamed from: e */
    public InterfaceC1895i0 f6175e = null;

    /* JADX INFO: renamed from: f */
    public EnumC1705d f6176f;

    /* JADX INFO: renamed from: g */
    public final C1706e f6177g;

    public GestureDetectorOnGestureListenerC1707f(Activity activity, C2054w1 c2054w1, SentryAndroidOptions sentryAndroidOptions) {
        EnumC1705d enumC1705d = EnumC1705d.Unknown;
        this.f6176f = enumC1705d;
        C1706e c1706e = new C1706e();
        c1706e.f6167a = enumC1705d;
        c1706e.f6169c = 0.0f;
        c1706e.f6170d = 0.0f;
        this.f6177g = c1706e;
        this.f6171a = new WeakReference(activity);
        this.f6172b = c2054w1;
        this.f6173c = sentryAndroidOptions;
    }

    /* JADX INFO: renamed from: a */
    public final void m3879a(C1903b c1903b, EnumC1705d enumC1705d, Map map, MotionEvent motionEvent) {
        if (this.f6173c.isEnableUserInteractionBreadcrumbs()) {
            int i = AbstractC1704c.f6166a[enumC1705d.ordinal()];
            String str = i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click";
            C1586H c1586h = new C1586H();
            c1586h.m3668c("android:motionEvent", motionEvent);
            c1586h.m3668c("android:view", c1903b.f6783a.get());
            String str2 = c1903b.f6785c;
            String str3 = c1903b.f6784b;
            C1871f c1871f = new C1871f();
            c1871f.f6712e = "user";
            c1871f.f6714g = "ui.".concat(str);
            if (str2 != null) {
                c1871f.m4093b("view.id", str2);
            }
            if (str3 != null) {
                c1871f.m4093b("view.class", str3);
            }
            for (Map.Entry entry : map.entrySet()) {
                c1871f.f6713f.put((String) entry.getKey(), entry.getValue());
            }
            c1871f.f6716i = EnumC1657a2.INFO;
            this.f6172b.mo3712f(c1871f, c1586h);
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m3880b(String str) {
        Activity activity = (Activity) this.f6171a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f6173c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3881c(C1903b c1903b, EnumC1705d enumC1705d) {
        boolean z = enumC1705d == EnumC1705d.Click || !(enumC1705d == this.f6176f && c1903b.equals(this.f6174d));
        SentryAndroidOptions sentryAndroidOptions = this.f6173c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        InterfaceC1651Z interfaceC1651Z = this.f6172b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    interfaceC1651Z.mo3719m(new C1676T(5));
                }
                this.f6174d = c1903b;
                this.f6176f = enumC1705d;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f6171a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = c1903b.f6785c;
        if (str == null) {
            AbstractC1856a.m4048D("UiElement.tag can't be null", null);
            str = null;
        }
        InterfaceC1895i0 interfaceC1895i0 = this.f6175e;
        if (interfaceC1895i0 != null) {
            if (!z && !interfaceC1895i0.mo3620f()) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f6175e.mo3625k();
                    return;
                }
                return;
            }
            m3882d(EnumC1605L2.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + str;
        int i = AbstractC1704c.f6166a[enumC1705d.ordinal()];
        String strConcat = "ui.action.".concat(i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click");
        C1625Q2 c1625q2 = new C1625Q2();
        c1625q2.f5840f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        c1625q2.f5842h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        c1625q2.f5841g = sentryAndroidOptions.getIdleTimeout();
        c1625q2.f3477a = true;
        c1625q2.f3480d = "auto.ui.gesture_listener." + c1903b.f6786d;
        InterfaceC1895i0 interfaceC1895i0Mo3717k = interfaceC1651Z.mo3717k(new C1621P2(str2, EnumC1946C.COMPONENT, strConcat, null), c1625q2);
        interfaceC1651Z.mo3719m(new C0698Q9(10, this, interfaceC1895i0Mo3717k));
        this.f6175e = interfaceC1895i0Mo3717k;
        this.f6174d = c1903b;
        this.f6176f = enumC1705d;
    }

    /* JADX INFO: renamed from: d */
    public final void m3882d(EnumC1605L2 enumC1605L2) {
        InterfaceC1895i0 interfaceC1895i0 = this.f6175e;
        if (interfaceC1895i0 != null) {
            if (interfaceC1895i0.mo3629o() == null) {
                this.f6175e.mo3628n(enumC1605L2);
            } else {
                this.f6175e.mo3632r();
            }
        }
        this.f6172b.mo3719m(new C2464rl(10, this));
        this.f6175e = null;
        if (this.f6174d != null) {
            this.f6174d = null;
        }
        this.f6176f = EnumC1705d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C1706e c1706e = this.f6177g;
        c1706e.f6168b = null;
        c1706e.f6167a = EnumC1705d.Unknown;
        c1706e.f6169c = 0.0f;
        c1706e.f6170d = 0.0f;
        c1706e.f6169c = motionEvent.getX();
        c1706e.f6170d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f6177g.f6167a = EnumC1705d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewM3880b = m3880b("onScroll");
        if (viewM3880b != null && motionEvent != null) {
            C1706e c1706e = this.f6177g;
            if (c1706e.f6167a == EnumC1705d.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                EnumC1902a enumC1902a = EnumC1902a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f6173c;
                C1903b c1903bM3884a = AbstractC1709h.m3884a(sentryAndroidOptions, viewM3880b, x, y, enumC1902a);
                if (c1903bM3884a == null) {
                    sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    c1706e.f6167a = EnumC1705d.Scroll;
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
                StringBuilder sb = new StringBuilder("Scroll target found: ");
                String str = c1903bM3884a.f6785c;
                if (str == null) {
                    AbstractC1856a.m4048D("UiElement.tag can't be null", null);
                    str = null;
                }
                sb.append(str);
                logger.mo3680e(enumC1657a2, sb.toString(), new Object[0]);
                c1706e.f6168b = c1903bM3884a;
                c1706e.f6167a = EnumC1705d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewM3880b = m3880b("onSingleTapUp");
        if (viewM3880b != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            EnumC1902a enumC1902a = EnumC1902a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f6173c;
            C1903b c1903bM3884a = AbstractC1709h.m3884a(sentryAndroidOptions, viewM3880b, x, y, enumC1902a);
            if (c1903bM3884a == null) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            EnumC1705d enumC1705d = EnumC1705d.Click;
            m3879a(c1903bM3884a, enumC1705d, Collections.EMPTY_MAP, motionEvent);
            m3881c(c1903bM3884a, enumC1705d);
        }
        return false;
    }
}
