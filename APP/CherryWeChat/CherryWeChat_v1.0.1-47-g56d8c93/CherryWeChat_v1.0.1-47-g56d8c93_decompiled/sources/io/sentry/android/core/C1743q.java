package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1872f0;

/* JADX INFO: renamed from: io.sentry.android.core.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1743q implements InterfaceC1872f0, InterfaceC1674Q, ILogger {

    /* JADX INFO: renamed from: b */
    public static final C1743q f6325b = new C1743q(0);

    /* JADX INFO: renamed from: c */
    public static final C1743q f6326c = new C1743q(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6327a;

    public /* synthetic */ C1743q(int i) {
        this.f6327a = i;
    }

    @Override // io.sentry.InterfaceC1872f0
    /* JADX INFO: renamed from: a */
    public void mo3745a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC1872f0
    /* JADX INFO: renamed from: b */
    public void mo3746b() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: e */
    public void mo3680e(EnumC1657a2 enumC1657a2, String str, Object... objArr) {
        switch (this.f6327a) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                int i = 5;
                if (objArr.length != 0) {
                    int i2 = AbstractC1728j.f6270a[enumC1657a2.ordinal()];
                    if (i2 == 1) {
                        i = 4;
                    } else if (i2 != 2) {
                        i = i2 != 4 ? 3 : 7;
                    }
                    Log.println(i, "Sentry", String.format(str, objArr));
                } else {
                    int i3 = AbstractC1728j.f6270a[enumC1657a2.ordinal()];
                    if (i3 == 1) {
                        i = 4;
                    } else if (i3 != 2) {
                        i = i3 != 4 ? 3 : 7;
                    }
                    Log.println(i, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: i */
    public boolean mo3681i(EnumC1657a2 enumC1657a2) {
        switch (this.f6327a) {
        }
        return true;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: n */
    public void mo3682n(EnumC1657a2 enumC1657a2, Throwable th, String str, Object... objArr) {
        switch (this.f6327a) {
            case 2:
                if (objArr.length != 0) {
                    mo3683r(enumC1657a2, String.format(str, objArr), th);
                } else {
                    mo3683r(enumC1657a2, str, th);
                }
                break;
            default:
                if (objArr.length != 0) {
                    mo3683r(enumC1657a2, String.format(str, objArr), th);
                } else {
                    mo3683r(enumC1657a2, str, th);
                }
                break;
        }
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: r */
    public void mo3683r(EnumC1657a2 enumC1657a2, String str, Throwable th) {
        switch (this.f6327a) {
            case 2:
                Log.wtf("Sentry", str, th);
                break;
            default:
                if (AbstractC1728j.f6270a[enumC1657a2.ordinal()] == 4) {
                    Log.wtf("Sentry", str, th);
                    break;
                }
                break;
        }
    }
}
