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
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreate() {
        boolean z;
        Bundle bundle;
        C1743q c1743q = new C1743q(3);
        Context context = getContext();
        if (context == null) {
            c1743q.mo3680e(EnumC1657a2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC1665H.f5971d.m97b(context) : (ApplicationInfo) AbstractC1665H.f5972e.m97b(context);
            bundle = applicationInfo != null ? applicationInfo.metaData : null;
        } catch (Throwable th) {
            c1743q.mo3683r(EnumC1657a2.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        boolean zM3827e = bundle != null ? AbstractC1665H.m3827e(bundle, c1743q, "io.sentry.auto-init", true) : true;
        if (zM3827e) {
            if (context.getPackageName().endsWith(".test")) {
                try {
                    Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                    while (it.hasNext()) {
                        ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                        if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                            z = true;
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
                z = false;
                if (!z) {
                    C1676T c1676t = new C1676T(1);
                    try {
                        C1981r c1981rM4173a = AbstractC1686b0.f6090b.m4173a();
                        try {
                            AbstractC2066z1.m4234c(new C1599K0(), new C0698Q9(c1743q, context, c1676t));
                            InterfaceC1651Z interfaceC1651ZM4233b = AbstractC2066z1.m4233b();
                            if (AbstractC1665H.m3826d()) {
                                if (interfaceC1651ZM4233b.mo3718l().isEnableAutoSessionTracking()) {
                                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                    interfaceC1651ZM4233b.mo3719m(new C2464rl(9, atomicBoolean));
                                    if (!atomicBoolean.get()) {
                                        interfaceC1651ZM4233b.mo3716j();
                                    }
                                }
                                interfaceC1651ZM4233b.mo3718l().getReplayController().mo3701o();
                            }
                            c1981rM4173a.close();
                            C1650Y1.m3790d().m3791a("AutoInit");
                        } catch (Throwable th2) {
                            try {
                                c1981rM4173a.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IllegalAccessException e) {
                        c1743q.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                    } catch (InstantiationException e2) {
                        c1743q.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                    } catch (NoSuchMethodException e3) {
                        c1743q.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
                    } catch (InvocationTargetException e4) {
                        c1743q.mo3683r(EnumC1657a2.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
                    }
                }
            } else {
                z = false;
                if (!z) {
                }
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        AbstractC2066z1.m4232a();
    }
}
