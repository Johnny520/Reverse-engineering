package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import io.sentry.AbstractC2066z1;
import io.sentry.C1599K0;
import io.sentry.C1650Y1;
import io.sentry.C1981r;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1651Z;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0698Q9;
import p000.C2464rl;

/* JADX INFO: loaded from: classes.dex */
public final class SentryInitProvider extends AbstractC1671N {
    public SentryInitProvider() {
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context r3, ProviderInfo r4) {
        if (SentryInitProvider.class.getName().equals(r4.authority) == true) goto L7;
        super.attachInfo(r3, r4);
        return;
    L7:
        throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r1) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C1743q r0 = new C1743q(3);
        Context r1 = getContext();
        if (r1 != null) goto L77;
        r0.mo3680e(EnumC1657a2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        return false;
    L77:
    L17:
        th = move-exception;
        r0.mo3683r(EnumC1657a2.ERROR, "Failed to read auto-init from android manifest metadata.", th);
    L19:
        boolean r4 = true;
    L21:
        if (r4 == true) goto L23;
    L69:
        return true;
    L23:
        if (r1.getPackageName().endsWith(".test") == true) goto L71;
    L32:
        boolean r42 = false;
    L33:
        if (r42 == true) goto L69;
        C1676T r43 = new C1676T(1);
        C1981r r7 = AbstractC1686b0.f6090b.m4173a();     // Catch: InvocationTargetException -> L48 NoSuchMethodException -> L50 InstantiationException -> L52 IllegalAccessException -> L54
        AbstractC2066z1.m4234c(new C1599K0(), new C0698Q9(r0, r1, r43));     // Catch: Throwable -> L43
        InterfaceC1651Z r12 = AbstractC2066z1.m4233b();     // Catch: Throwable -> L43
        if (AbstractC1665H.m3826d() == true) goto L39;
    L46:
        r7.close();     // Catch: InvocationTargetException -> L48 NoSuchMethodException -> L50 InstantiationException -> L52 IllegalAccessException -> L54
        C1650Y1.m3790d().m3791a("AutoInit");
        goto L69
    L39:
        if (r12.mo3718l().isEnableAutoSessionTracking() == false) goto L45;
        AtomicBoolean r44 = new AtomicBoolean(false);     // Catch: Throwable -> L43
        r12.mo3719m(new C2464rl(9, r44));     // Catch: Throwable -> L43
        if (r44.get() == true) goto L45;
        r12.mo3716j();     // Catch: Throwable -> L43
    L45:
        r12.mo3718l().getReplayController().mo3701o();     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        r7.close();     // Catch: Throwable -> L58
    L60:
        throw th;     // Catch: InvocationTargetException -> L48 NoSuchMethodException -> L50 InstantiationException -> L52 IllegalAccessException -> L54
    L58:
        th = move-exception;
        th.addSuppressed(th);     // Catch: InvocationTargetException -> L48 NoSuchMethodException -> L50 InstantiationException -> L52 IllegalAccessException -> L54
    L54:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e);
        throw new RuntimeException("Failed to initialize Sentry's SDK", e);
    L52:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e);
        throw new RuntimeException("Failed to initialize Sentry's SDK", e);
    L50:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e);
        throw new RuntimeException("Failed to initialize Sentry's SDK", e);
    L48:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e);
        throw new RuntimeException("Failed to initialize Sentry's SDK", e);
    L71:
        Iterator<ActivityManager.AppTask> r45 = ((ActivityManager) r1.getSystemService("activity")).getAppTasks().iterator();     // Catch: Throwable -> L70
    L25:
        if (r45.hasNext() == false) goto L32;
        ComponentName r5 = AbstractC1663F.m3816b(r45.next().getTaskInfo()).getComponent();     // Catch: Throwable -> L70
        if (r5 == null) goto L25;
        if (r5.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity") == false) goto L25;
        r42 = true;
        goto L33
    L8:
        if (Build.VERSION.SDK_INT < 33) goto L10;
        ApplicationInfo r46 = (ApplicationInfo) AbstractC1665H.f5971d.m97b(r1);     // Catch: Throwable -> L17
    L11:
        if (r46 == null) goto L13;
        Bundle r47 = r46.metaData;     // Catch: Throwable -> L17
    L14:
        if (r47 == null) goto L19;
        r4 = AbstractC1665H.m3827e(r47, r0, "io.sentry.auto-init", true);     // Catch: Throwable -> L17
        goto L21
    L13:
        r47 = null;
        goto L14
    L10:
        r46 = (ApplicationInfo) AbstractC1665H.f5972e.m97b(r1);     // Catch: Throwable -> L17
        goto L11
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        AbstractC2066z1.m4232a();
    }
}
