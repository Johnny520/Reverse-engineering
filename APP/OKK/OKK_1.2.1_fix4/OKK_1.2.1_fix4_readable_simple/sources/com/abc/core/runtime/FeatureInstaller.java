package com.abc.core.runtime;

import android.content.Context;
import com.abc.core.hooks.ModuleLog;
import com.abc.core.status.FeatureInstallResult;
import com.abc.core.status.FeatureInstallStatus;
import com.abc.core.status.FeatureStatusRegistry;
import com.abc.internal.probe.AppFingerprint;
import com.abc.internal.probe.DiagnosticItem;
import com.abc.internal.probe.DiagnosticLevel;
import de.robv.android.xposed.AbstractC0762d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: f0.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class FeatureInstaller {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2956a = null;

    /* JADX INFO: renamed from: b */
    public static volatile Context f2957b;

    /* JADX INFO: renamed from: c */
    public static volatile ClassLoader f2958c;

    /* JADX INFO: renamed from: d */
    public static volatile String f2959d;

    static {
        f2956a = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m2123a(String r14) {
        final int r02 = 9;
        final int r1 = 8;
        final int r2 = 7;
        final int r3 = 6;
        final int r4 = 5;
        final int r5 = 3;
        final int r6 = 2;
        final int r7 = 4;
        final int r9 = 0;
        final int r10 = 1;
        if (f2956a.compareAndSet(false, true) == true) goto L6;
        m2125c("features already installed, skip (" + r14 + ")");
        return;
    L6:
        final Context r8 = f2957b;
        if (r8 != null) goto L9;
        return;
    L9:
        final ClassLoader r11 = f2958c;
        if (r11 != null) goto L12;
        return;
    L12:
        final String r12 = f2959d;
        m2125c("install features via ".concat(r14));
        m2124b("HideHomeDivider", new FeatureInstallTask(r8, r11, r12, r9));
        m2124b("FoldBannerPin", new FeatureInstallTask(r8, r11, r12, r10));
        m2124b("BottomTabIcon", new FeatureInstallTask(r8, r11, r12, r7));
        m2124b("BottomTabFloating", new C0812X(r8, r11, r12, r10));
        m2124b("RoundAvatar", new C0812X(r8, r11, r12, r6));
        m2124b("HomeAvatar", new C0812X(r8, r11, r12, r5));
        m2124b("ThemeWallpaper", new FeatureInstallTask(r8, r11, r12, r4));
        m2124b("AntiRevoke", new C0812X(r8, r11, r12, r4));
        m2124b("ChatEnhance", new C0812X(r8, r11, r12, r3));
        m2124b("QuoteDeleteClear", new C0812X(r8, r11, r12, r2));
        m2124b("EditMessage", new C0812X(r8, r11, r12, r7));
        m2124b("InputStats", new FeatureInstallTask(r8, r11, r3));
        m2124b("AntiMomentsDelete", new C0812X(r8, r11, r12, r1));
        m2124b("AntiMomentsComment", new C0812X(r8, r11, r12, r02));
        m2124b("MomentsAdBlock", new FeatureInstallTask(r8, r11, r12, r2));
        m2124b("ProfileId", new FeatureInstallTask(r8, r11, r12, r1));
        final int r13 = 10;
        m2124b("RealNameTail", new C0812X(r8, r11, r12, r13));
        final int r15 = 11;
        m2124b("MemberTitle", new C0812X(r8, r11, r12, r15));
        m2124b("DisableHotUpdate", new FeatureInstallTask(r8, r11, r12, r02));
        m2124b("VirtualLocation", new C0812X(r8, r11, r12, r9));
        m2124b("AutoLoginWin", new FeatureInstallTask(r8, r11, r12, r6));
        m2124b("MapPickBridge", new C0840s(r10, r11));
        m2124b("DownloadRedirect", new FeatureInstallTask(r8, r11, r12, r5));
        ConcurrentHashMap r142 = FeatureStatusRegistry.f2728a;
        FeatureStatusRegistry.m1966f();
        m2125c("features done " + FeatureStatusRegistry.m1969i());
    }

    /* JADX INFO: renamed from: b */
    public static void m2124b(String r6, InterfaceC0275a r7) {
        AppFingerprint r02 = AbstractC0358S.f727g;
        if (r02 == null) goto L24;
        DiagnosticItem r03 = r02.m1357a(r6);
        if (r03 == null) goto L24;
        if (r03.f1670c != DiagnosticLevel.f1666c) goto L24;
        AppFingerprint r72 = AbstractC0358S.f727g;
        if (r72 == null) goto L16;
        DiagnosticItem r73 = r72.m1357a(r6);
        if (r73 == null) goto L16;
        String r74 = r73.f1671d;
        if (r74 == null) goto L16;
    L17:
        ConcurrentHashMap r04 = FeatureStatusRegistry.f2728a;
        String r05 = "不适配: ".concat(r74);
        AbstractC0307g.m703e(r05, "reason");
        FeatureStatusRegistry.f2728a.put(r6, new FeatureInstallResult(r6, FeatureInstallStatus.f2725c, r05));
        FeatureStatusRegistry.m1970j("SKIP " + r6 + " (" + r05 + ")");
        ModuleLog.INSTANCE.m1814w("功能跳过: " + r6 + " · " + r05);     // Catch: Throwable -> L20
    L22:
        m2125c("skip " + r6 + " (" + r74 + ")");
        return;
    L20:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L16:
        r74 = "compat FAIL";
    L24:
        ConcurrentHashMap r06 = FeatureStatusRegistry.f2728a;
        FeatureStatusRegistry.m1962b(r6, r7);
    }

    /* JADX INFO: renamed from: c */
    public static void m2125c(String r2) {
        AbstractC0762d.m1954d("[OKK-FeatureGate] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
