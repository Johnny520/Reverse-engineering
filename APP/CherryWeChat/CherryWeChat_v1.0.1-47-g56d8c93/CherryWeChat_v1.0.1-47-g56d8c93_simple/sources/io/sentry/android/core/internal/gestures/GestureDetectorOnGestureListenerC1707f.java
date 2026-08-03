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
import java.util.Iterator;
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
    public C1903b f6174d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1895i0 f6175e;

    /* JADX INFO: renamed from: f */
    public EnumC1705d f6176f;

    /* JADX INFO: renamed from: g */
    public final C1706e f6177g;

    public GestureDetectorOnGestureListenerC1707f(Activity r3, C2054w1 r4, SentryAndroidOptions r5) {
        this.f6174d = null;
        this.f6175e = null;
        EnumC1705d r0 = EnumC1705d.Unknown;
        this.f6176f = r0;
        C1706e r1 = new C1706e();
        r1.f6167a = r0;
        r1.f6169c = 0.0f;
        r1.f6170d = 0.0f;
        this.f6177g = r1;
        this.f6171a = new WeakReference(r3);
        this.f6172b = r4;
        this.f6173c = r5;
    }

    /* JADX INFO: renamed from: a */
    public final void m3879a(C1903b r4, EnumC1705d r5, Map r6, MotionEvent r7) {
        if (this.f6173c.isEnableUserInteractionBreadcrumbs() == true) goto L5;
        return;
    L5:
        int r52 = AbstractC1704c.f6166a[r5.ordinal()];
        if (r52 != 1) goto L8;
        String r53 = "click";
    L15:
        C1586H r0 = new C1586H();
        r0.m3668c("android:motionEvent", r7);
        r0.m3668c("android:view", r4.f6783a.get());
        String r72 = r4.f6785c;
        String r42 = r4.f6784b;
        C1871f r1 = new C1871f();
        r1.f6712e = "user";
        r1.f6714g = "ui.".concat(r53);
        if (r72 == null) goto L18;
        r1.m4093b("view.id", r72);
    L18:
        if (r42 == null) goto L20;
        r1.m4093b("view.class", r42);
    L20:
        Iterator r43 = r6.entrySet().iterator();
    L22:
        if (r43.hasNext() == false) goto L24;
        Map.Entry r54 = (Map.Entry) r43.next();
        r1.f6713f.put((String) r54.getKey(), r54.getValue());
        goto L22
    L24:
        r1.f6716i = EnumC1657a2.INFO;
        this.f6172b.mo3712f(r1, r0);
        return;
    L8:
        if (r52 != 2) goto L10;
        r53 = "scroll";
        goto L15
    L10:
        if (r52 == 3) goto L12;
        r53 = "unknown";
        goto L15
    L12:
        r53 = "swipe";
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public final View m3880b(String r7) {
        Activity r0 = (Activity) this.f6171a.get();
        SentryAndroidOptions r4 = this.f6173c;
        if (r0 != null) goto L6;
        r4.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("Activity is null in ", r7, ". No breadcrumb captured."), new Object[0]);
        return null;
    L6:
        Window r02 = r0.getWindow();
        if (r02 != null) goto L10;
        r4.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("Window is null in ", r7, ". No breadcrumb captured."), new Object[0]);
        return null;
    L10:
        View r03 = r02.getDecorView();
        if (r03 != null) goto L14;
        r4.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("DecorView is null in ", r7, ". No breadcrumb captured."), new Object[0]);
        return null;
    L14:
        return r03;
    }

    /* JADX INFO: renamed from: c */
    public final void m3881c(C1903b r13, EnumC1705d r14) {
        if (r14 == this.f6176f) goto L5;
    L7:
        boolean r0 = false;
    L9:
        if (r14 == EnumC1705d.Click) goto L12;
        if (r0 == false) goto L12;
        boolean r02 = false;
    L14:
        SentryAndroidOptions r3 = this.f6173c;
        boolean r4 = r3.isTracingEnabled();
        InterfaceC1651Z r5 = this.f6172b;
        if (r4 == true) goto L17;
    L53:
        if (r02 == true) goto L55;
        return;
    L55:
        if (r3.isEnableAutoTraceIdGeneration() == false) goto L57;
        r5.mo3719m(new C1676T(5));
    L57:
        this.f6174d = r13;
        this.f6176f = r14;
        return;
    L17:
        if (r3.isEnableUserInteractionTracing() == false) goto L53;
        Activity r42 = (Activity) this.f6171a.get();
        if (r42 != null) goto L23;
        r3.getLogger().mo3680e(EnumC1657a2.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
        return;
    L23:
        String r6 = r13.f6785c;
        if (r6 != null) goto L27;
        AbstractC1856a.m4048D("UiElement.tag can't be null", null);
        r6 = null;
    L27:
        InterfaceC1895i0 r8 = this.f6175e;
        if (r8 == null) goto L37;
        if (r02 == false) goto L31;
    L36:
        m3882d(EnumC1605L2.f5786OK);
        goto L37
    L31:
        if (r8.mo3620f() == true) goto L36;
        r3.getLogger().mo3680e(EnumC1657a2.DEBUG, AbstractC2374ph.m4814k("The view with id: ", r6, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
        if (r3.getIdleTimeout() == null) goto L59;
        this.f6175e.mo3625k();
        return;
    L59:
        return;
    L37:
        String r03 = r42.getClass().getSimpleName() + "." + r6;
        int r1 = AbstractC1704c.f6166a[r14.ordinal()];
        if (r1 != 1) goto L40;
        String r12 = "click";
    L47:
        String r15 = "ui.action.".concat(r12);
        C1625Q2 r43 = new C1625Q2();
        r43.f5840f = true;
        long r82 = r3.getDeadlineTimeout();
        if (r82 > 0) goto L50;
        Long r62 = null;
    L51:
        r43.f5842h = r62;
        r43.f5841g = r3.getIdleTimeout();
        r43.f3477a = true;
        r43.f3480d = "auto.ui.gesture_listener." + r13.f6786d;
        InterfaceC1895i0 r04 = r5.mo3717k(new C1621P2(r03, EnumC1946C.COMPONENT, r15, null), r43);
        r5.mo3719m(new C0698Q9(10, this, r04));
        this.f6175e = r04;
        this.f6174d = r13;
        this.f6176f = r14;
        return;
    L50:
        r62 = Long.valueOf(r82);
        goto L51
    L40:
        if (r1 != 2) goto L42;
        r12 = "scroll";
        goto L47
    L42:
        if (r1 == 3) goto L44;
        r12 = "unknown";
        goto L47
    L44:
        r12 = "swipe";
    L12:
        r02 = true;
        goto L14
    L5:
        if (r13.equals(this.f6174d) == false) goto L7;
        r0 = true;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final void m3882d(EnumC1605L2 r2) {
        InterfaceC1895i0 r0 = this.f6175e;
        if (r0 != null) goto L5;
    L8:
        C2464rl r22 = new C2464rl(10, this);
        this.f6172b.mo3719m(r22);
        this.f6175e = null;
        if (this.f6174d == null) goto L11;
        this.f6174d = null;
    L11:
        this.f6176f = EnumC1705d.Unknown;
        return;
    L5:
        if (r0.mo3629o() != null) goto L7;
        this.f6175e.mo3628n(r2);
        goto L8
    L7:
        this.f6175e.mo3632r();
        goto L8
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        C1706e r2 = this.f6177g;
        r2.f6168b = null;
        r2.f6167a = EnumC1705d.Unknown;
        r2.f6169c = 0.0f;
        r2.f6170d = 0.0f;
        r2.f6169c = r4.getX();
        r2.f6170d = r4.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent r1, MotionEvent r2, float r3, float r4) {
        C1706e r12 = this.f6177g;
        r12.f6167a = EnumC1705d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent r1) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent r5, MotionEvent r6, float r7, float r8) {
        View r62 = m3880b("onScroll");
        if (r62 == null) goto L17;
        if (r5 == null) goto L17;
        C1706e r82 = this.f6177g;
        if (r82.f6167a != EnumC1705d.Unknown) goto L17;
        float r0 = r5.getX();
        float r52 = r5.getY();
        EnumC1902a r1 = EnumC1902a.SCROLLABLE;
        SentryAndroidOptions r2 = this.f6173c;
        C1903b r53 = AbstractC1709h.m3884a(r2, r62, r0, r52, r1);
        if (r53 != null) goto L12;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
        r82.f6167a = EnumC1705d.Scroll;
        return false;
    L12:
        ILogger r63 = r2.getLogger();
        EnumC1657a2 r02 = EnumC1657a2.DEBUG;
        StringBuilder r12 = new StringBuilder("Scroll target found: ");
        String r22 = r53.f6785c;
        if (r22 != null) goto L16;
        AbstractC1856a.m4048D("UiElement.tag can't be null", null);
        r22 = null;
    L16:
        r12.append(r22);
        r63.mo3680e(r02, r12.toString(), new Object[0]);
        r82.f6168b = r53;
        r82.f6167a = EnumC1705d.Scroll;
    L17:
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent r1) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent r7) {
        View r0 = m3880b("onSingleTapUp");
        if (r0 == null) goto L11;
        if (r7 == null) goto L11;
        float r2 = r7.getX();
        float r3 = r7.getY();
        EnumC1902a r4 = EnumC1902a.CLICKABLE;
        SentryAndroidOptions r5 = this.f6173c;
        C1903b r02 = AbstractC1709h.m3884a(r5, r0, r2, r3, r4);
        if (r02 != null) goto L10;
        r5.getLogger().mo3680e(EnumC1657a2.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
        return false;
    L10:
        EnumC1705d r22 = EnumC1705d.Click;
        m3879a(r02, r22, Collections.EMPTY_MAP, r7);
        m3881c(r02, r22);
    L11:
        return false;
    }
}
