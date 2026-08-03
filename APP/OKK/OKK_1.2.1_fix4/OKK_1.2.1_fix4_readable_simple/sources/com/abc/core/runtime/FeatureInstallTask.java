package com.abc.core.runtime;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0488m;
import com.abc.core.features.BottomTabConfig;
import com.abc.core.features.C0581D1;
import com.abc.core.features.C0589G0;
import com.abc.core.features.C0593H1;
import com.abc.core.features.C0594I;
import com.abc.core.features.C0596I1;
import com.abc.core.features.C0599J1;
import com.abc.core.features.C0646c1;
import com.abc.core.features.C0648d0;
import com.abc.core.features.C0655f1;
import com.abc.core.features.C0684p0;
import com.abc.core.features.C0692s;
import com.abc.core.features.C0693s0;
import com.abc.core.features.C0695t;
import com.abc.core.features.C0698u;
import com.abc.core.features.C0704w;
import com.abc.core.features.C0707x;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.DownloadRedirector;
import com.abc.core.features.FoldBannerPinHook;
import com.abc.core.features.HotUpdateBlocker;
import com.abc.core.features.InputStatsDatabase;
import com.abc.core.features.InputStatsMessageHook;
import com.abc.core.features.MessageActionDispatcher;
import com.abc.core.features.MomentsAdsBlocker;
import com.abc.core.features.PcAutoLoginConfig;
import com.abc.core.features.RunnableC0713z;
import com.abc.core.features.ThemeWallpaperConfig;
import com.abc.core.features.WallpaperOverlayHook;
import com.abc.core.hooks.ModuleLog;
import com.abc.core.status.FeatureStatusRegistry;
import com.abc.internal.probe.C0565o;
import com.abc.internal.probe.CompatibilityReport;
import com.abc.internal.probe.DexKitManager;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p009E0.C0180k;
import p009E0.C0190u;
import p026N0.C0266g;
import p026N0.C0268i;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: f0.W */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FeatureInstallTask implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f2950c;

    public /* synthetic */ FeatureInstallTask(Context r1, ClassLoader r2, int r3) {
        this.f2948a = r3;
        this.f2949b = r1;
        this.f2950c = r2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m2107a() {
        int r3 = 0;
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader r5 = this.f2950c;
        AbstractC0307g.m703e(r5, "$cl");
        DownloadRedirector r02 = DownloadRedirector.f2022a;
        C0146l r6 = C0146l.f339a;
        if (DownloadRedirector.f2023b.compareAndSet(false, true) == false) goto L87;
        DownloadRedirector.m1636e("installing...");
        Class<?> r10 = Class.forName("com.tencent.mm.sdk.platformtools.u6", false, r5);     // Catch: Throwable -> L15
        Method[] r11 = r10.getDeclaredMethods();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r11, "getDeclaredMethods(...)");     // Catch: Throwable -> L15
        int r12 = r11.length;     // Catch: Throwable -> L15
        int r13 = 0;
    L7:
        if (r13 >= r12) goto L34;
        Method r14 = r11[r13];     // Catch: Throwable -> L15
        if (AbstractC0307g.m699a(r14.getReturnType(), Boolean.TYPE) == false) goto L33;
        if (r14.getParameterCount() != 5) goto L33;
        Class<?>[] r9 = r14.getParameterTypes();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");     // Catch: Throwable -> L15
        Class r92 = (Class) AbstractC0179j.m537n0(0, r9);     // Catch: Throwable -> L15
        if (r92 == null) goto L17;
        String r93 = r92.getName();     // Catch: Throwable -> L15
    L19:
        if (AbstractC0307g.m699a(r93, "android.content.Context") == false) goto L33;
        Class<?>[] r94 = r14.getParameterTypes();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r94, "getParameterTypes(...)");     // Catch: Throwable -> L15
        Class r95 = (Class) AbstractC0179j.m537n0(1, r94);     // Catch: Throwable -> L15
        if (r95 == null) goto L23;
        String r96 = r95.getName();     // Catch: Throwable -> L15
    L25:
        if (AbstractC0307g.m699a(r96, "java.lang.String") == false) goto L33;
        Class<?>[] r97 = r14.getParameterTypes();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r97, "getParameterTypes(...)");     // Catch: Throwable -> L15
        Class r98 = (Class) AbstractC0179j.m537n0(2, r97);     // Catch: Throwable -> L15
        if (r98 == null) goto L29;
        String r99 = r98.getName();     // Catch: Throwable -> L15
    L31:
        if (AbstractC0307g.m699a(r99, "java.lang.String") == false) goto L33;
    L35:
        if (r14 != null) goto L37;
        DownloadRedirector.m1636e("ScopedStorageUtil.c not found");     // Catch: Throwable -> L15
    L90:
        Method[] r03 = Class.forName("com.tencent.mm.platformtools.ExportFileUtil", false, r5).getDeclaredMethods();     // Catch: Throwable -> L54
        AbstractC0307g.m702d(r03, "getDeclaredMethods(...)");     // Catch: Throwable -> L54
        int r52 = r03.length;     // Catch: Throwable -> L54
        int r8 = 0;
    L44:
        if (r8 >= r52) goto L57;
        Method r910 = r03[r8];     // Catch: Throwable -> L54
        if (AbstractC0307g.m699a(r910.getName(), "m") == false) goto L56;
        if (r910.getParameterCount() != 2) goto L56;
        if (AbstractC0307g.m699a(r910.getParameterTypes()[0], Context.class) == false) goto L56;
        if (AbstractC0307g.m699a(r910.getParameterTypes()[1], String.class) == false) goto L56;
    L58:
        if (r910 == null) goto L60;
        AbstractC0762d.m1952b(r910, new C0648d0(1));     // Catch: Throwable -> L54
        DownloadRedirector.m1636e("hooked ExportFileUtil.m");     // Catch: Throwable -> L54
    L60:
        Object r04 = r6;
    L62:
        Throwable r05 = AbstractC0141g.m465a(r04);
        if (r05 == null) goto L88;
        DownloadRedirector.m1636e("locate ExportFileUtil fail: " + r05.getMessage());
    L88:
        Method[] r06 = Toast.class.getDeclaredMethods();     // Catch: Throwable -> L74
        AbstractC0307g.m702d(r06, "getDeclaredMethods(...)");     // Catch: Throwable -> L74
        ArrayList r53 = new ArrayList();     // Catch: Throwable -> L74
        int r7 = r06.length;     // Catch: Throwable -> L74
    L66:
        if (r3 >= r7) goto L77;
        Method r82 = r06[r3];     // Catch: Throwable -> L74
        if (AbstractC0307g.m699a(r82.getName(), "makeText") == false) goto L76;
        if (r82.getParameterTypes().length < 2) goto L76;
        if (AbstractC0307g.m699a(r82.getParameterTypes()[1], CharSequence.class) == false) goto L76;
        r53.add(r82);     // Catch: Throwable -> L74
    L76:
        r3 = r3 + 1;     // Catch: Throwable -> L74
        goto L66
    L77:
        Iterator r07 = r53.iterator();     // Catch: Throwable -> L74
    L79:
        if (r07.hasNext() == false) goto L81;
        Method r32 = (Method) r07.next();     // Catch: Throwable -> L74
        AbstractC0307g.m700b(r32);     // Catch: Throwable -> L74
        AbstractC0762d.m1952b(r32, new C0648d0(2));     // Catch: Throwable -> L74
        goto L79
    L81:
        DownloadRedirector.m1636e("hooked Toast.makeText");     // Catch: Throwable -> L74
        Object r08 = r6;
    L84:
        Throwable r09 = AbstractC0141g.m465a(r08);
        if (r09 == null) goto L87;
        DownloadRedirector.m1636e("locate Toast.makeText fail: " + r09.getMessage());
    L74:
        th = move-exception;
        r08 = AbstractC0040p.m116u(th);
    L56:
        r8 = r8 + 1;     // Catch: Throwable -> L54
        goto L44
    L57:
        r910 = null;
    L54:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
        goto L62
    L37:
        AbstractC0762d.m1952b(r14, new C0648d0(0));     // Catch: Throwable -> L15
        DownloadRedirector.m1636e("hooked ScopedStorageUtil.c " + r10.getName() + "." + r14.getName());     // Catch: Throwable -> L15
        Object r010 = r6;
    L40:
        Throwable r011 = AbstractC0141g.m465a(r010);
        if (r011 == null) goto L90;
        DownloadRedirector.m1636e("locate ScopedStorageUtil fail: " + r011.getMessage());
        goto L90
    L29:
        r99 = null;
        goto L31
    L23:
        r96 = null;
        goto L25
    L17:
        r93 = null;
    L33:
        r13 = r13 + 1;     // Catch: Throwable -> L15
        goto L7
    L34:
        r14 = null;
    L15:
        th = move-exception;
        r010 = AbstractC0040p.m116u(th);
    L87:
        return r6;
    }

    /* JADX INFO: renamed from: c */
    private final Object m2108c() {
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader r1 = this.f2950c;
        AbstractC0307g.m703e(r1, "$cl");
        C0594I r2 = C0594I.f1812a;
        int r3 = 0;
        if (C0594I.f1813b.compareAndSet(false, true) == false) goto L37;
        C0594I.m1472d("install hideTitle=" + BottomTabConfig.m1809d());
        Object r12 = AbstractC0358S.m906r(r1, "com.tencent.mm.ui.LauncherUIBottomTabView");     // Catch: Throwable -> L8
    L11:
        if ((r12 instanceof C0140f) == false) goto L13;
        r12 = null;
    L13:
        Class r13 = (Class) r12;
        if (r13 != null) goto L16;
        C0594I.m1472d("class not found: com.tencent.mm.ui.LauncherUIBottomTabView");
        goto L37
    L16:
        Constructor<?>[] r4 = r13.getDeclaredConstructors();
        AbstractC0307g.m702d(r4, "getDeclaredConstructors(...)");
        int r5 = r4.length;
    L17:
        C0594I r6 = C0594I.f1812a;
        if (r3 >= r5) goto L38;
        Constructor<?> r62 = r4[r3];
        AbstractC0307g.m700b(r62);     // Catch: Throwable -> L22
        AbstractC0762d.m1952b(r62, new InputStatsMessageHook(13));     // Catch: Throwable -> L22
    L24:
        r3 = r3 + 1;
    L22:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L24
    L38:
        Object r02 = AbstractC0358S.m904q(r13, "onAttachedToWindow", new Object[]{new InputStatsMessageHook(14)});     // Catch: Throwable -> L27
    L30:
        if (AbstractC0141g.m465a(r02) != null) goto L44;
    L35:
        C0594I.m1472d("hooked com.tencent.mm.ui.LauncherUIBottomTabView constructors/attach");
        goto L37
    L44:
        AbstractC0358S.m904q(View.class, "onAttachedToWindow", new Object[]{new InputStatsMessageHook(15)});     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L27:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
    L8:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
    L37:
        return C0146l.f339a;
    }

    /* JADX INFO: renamed from: d */
    private final Object m2109d() {
        int r2 = 0;
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader r3 = this.f2950c;
        AbstractC0307g.m703e(r3, "$cl");
        C0599J1 r4 = C0599J1.f1831a;
        C0146l r5 = C0146l.f339a;
        if (C0599J1.f1832b.compareAndSet(false, true) == false) goto L29;
        Object r9 = WallpaperOverlayHook.f1792a;
        ThemeWallpaperConfig.f1702b.addIfAbsent(new C0581D1(r2));
        ThemeWallpaperConfig r92 = ThemeWallpaperConfig.f1701a;
        ThemeWallpaperConfig.m1390g(true);
        boolean r10 = r92.m1393e();
        float r93 = r92.m1391a();
        ThemeWallpaperConfig.m1390g(false);
        C0599J1.m1485c("install wekit-style en=" + r10 + " a=" + r93 + " path=" + ThemeWallpaperConfig.f1706f);
        AbstractC0358S.m904q(Activity.class, "onResume", new Object[]{new C0593H1(1)});     // Catch: Throwable -> L8
        C0599J1.m1485c("hooked Activity.onResume");     // Catch: Throwable -> L8
        Object r94 = r5;
    L10:
        Throwable r95 = AbstractC0141g.m465a(r94);
        if (r95 == null) goto L30;
        C0599J1 r102 = C0599J1.f1831a;
        C0599J1.m1485c("onResume fail: " + r95.getMessage());
    L30:
        Class r96 = AbstractC0358S.m906r(r3, "com.tencent.mm.ui.LauncherUI");     // Catch: Throwable -> L22
        AbstractC0358S.m904q(r96, "onCreate", new Object[]{Bundle.class, new C0596I1(0, false)});     // Catch: Throwable -> L22
        C0599J1.m1485c("hooked LauncherUI.onCreate");     // Catch: Throwable -> L22
        Class r11 = Boolean.TYPE;     // Catch: Throwable -> L22
        AbstractC0358S.m904q(r96, "closeChatting", new Object[]{r11, new C0596I1(1, false)});     // Catch: Throwable -> L22
        C0599J1.m1485c("hooked LauncherUI.closeChatting");     // Catch: Throwable -> L22
        AbstractC0358S.m904q(r96, "startChatting", new Object[]{String.class, Bundle.class, r11, new C0593H1(2)});     // Catch: Throwable -> L22
        C0599J1.m1485c("hooked LauncherUI.startChatting");     // Catch: Throwable -> L22
        Class r1 = AbstractC0358S.m906r(r3, "com.tencent.mm.ui.NewChattingTabUI");     // Catch: Throwable -> L16
        AbstractC0358S.m904q(r1, "r", new Object[]{String.class, Bundle.class, r11, new C0593H1(3)});     // Catch: Throwable -> L16
        C0599J1.m1485c("hooked NewChattingTabUI.r");     // Catch: Throwable -> L16
        AbstractC0358S.m904q(r1, "q", new Object[]{Integer.TYPE, new C0593H1(4)});     // Catch: Throwable -> L16
        C0599J1.m1485c("hooked NewChattingTabUI.q");     // Catch: Throwable -> L16
        AbstractC0358S.m904q(r1, "f", new Object[]{r11, new C0593H1(5)});     // Catch: Throwable -> L16
        C0599J1.m1485c("hooked NewChattingTabUI.f");     // Catch: Throwable -> L16
        Object r12 = r5;
    L18:
        Throwable r13 = AbstractC0141g.m465a(r12);     // Catch: Throwable -> L22
        if (r13 == null) goto L34;
        C0599J1.m1485c("NewChattingTabUI.f fail: " + r13.getMessage());     // Catch: Throwable -> L22
    L34:
        Class r32 = Integer.TYPE;     // Catch: Throwable -> L26
        AbstractC0358S.m904q(Activity.class, "onActivityResult", new Object[]{r32, r32, Intent.class, new C0593H1(0)});     // Catch: Throwable -> L26
    L28:
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0713z(3), 1800);
    L26:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L28
    L16:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L8:
        th = move-exception;
        r94 = AbstractC0040p.m116u(th);
    L29:
        return r5;
    }

    /* JADX INFO: renamed from: e */
    private final Object m2110e() {
        int r02 = 0;
        Context r2 = this.f2949b;
        ClassLoader r3 = this.f2950c;
        AbstractC0307g.m703e(r2, "$ctx");
        AbstractC0307g.m703e(r3, "$cl");
        InputStatsDatabase r4 = InputStatsDatabase.f1818a;
        C0146l r5 = C0146l.f339a;
        Context r6 = r2.getApplicationContext();
        if (r6 == null) goto L6;
        r2 = r6;
    L6:
        InputStatsDatabase.f1824g = r2;
        if (InputStatsDatabase.f1819b.compareAndSet(false, true) == true) goto L66;
    L61:
        return r5;
    L66:
        Class r22 = AbstractC0358S.m906r(r3, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter");     // Catch: Throwable -> L12
        Constructor<?>[] r62 = r22.getDeclaredConstructors();     // Catch: Throwable -> L12
        AbstractC0307g.m702d(r62, "getDeclaredConstructors(...)");     // Catch: Throwable -> L12
        int r7 = r62.length;     // Catch: Throwable -> L12
        int r8 = 0;
    L10:
        if (r8 >= r7) goto L14;
        Constructor<?> r9 = r62[r8];     // Catch: Throwable -> L12
        AbstractC0307g.m700b(r9);     // Catch: Throwable -> L12
        AbstractC0762d.m1952b(r9, new C0589G0(0));     // Catch: Throwable -> L12
        r8 = r8 + 1;     // Catch: Throwable -> L12
        goto L10
    L14:
        InputStatsDatabase.m1482j("hooked ChatFooter constructors: " + r22.getDeclaredConstructors().length);     // Catch: Throwable -> L12
        Object r23 = r5;
    L17:
        Throwable r24 = AbstractC0141g.m465a(r23);
        InputStatsDatabase r63 = InputStatsDatabase.f1818a;
        if (r24 == null) goto L62;
        InputStatsDatabase.m1482j("ChatFooter hook skipped: " + r24.getMessage());
    L62:
        Class r25 = AbstractC0358S.m906r(r3, "com.tencent.mm.ui.widget.cedit.api.MMFlexEditText");     // Catch: Throwable -> L23
        Constructor<?>[] r64 = r25.getDeclaredConstructors();     // Catch: Throwable -> L23
        AbstractC0307g.m702d(r64, "getDeclaredConstructors(...)");     // Catch: Throwable -> L23
        int r42 = r64.length;     // Catch: Throwable -> L23
    L21:
        if (r02 >= r42) goto L25;
        Constructor<?> r72 = r64[r02];     // Catch: Throwable -> L23
        AbstractC0307g.m700b(r72);     // Catch: Throwable -> L23
        AbstractC0762d.m1952b(r72, new C0589G0(1));     // Catch: Throwable -> L23
        r02 = r02 + 1;     // Catch: Throwable -> L23
        goto L21
    L25:
        InputStatsDatabase.m1482j("hooked MMFlexEditText constructors: " + r25.getDeclaredConstructors().length);     // Catch: Throwable -> L23
        Object r03 = r5;
    L28:
        Throwable r04 = AbstractC0141g.m465a(r03);
        if (r04 == null) goto L68;
        InputStatsDatabase.m1482j("MMFlexEditText hook skipped: " + r04.getMessage());
    L68:
        AbstractC0358S.m904q(TextView.class, "setHint", new Object[]{CharSequence.class, new C0589G0(2)});     // Catch: Throwable -> L33
        InputStatsDatabase.m1482j("hooked TextView.setHint(CharSequence)");     // Catch: Throwable -> L33
        Object r05 = r5;
    L35:
        Throwable r06 = AbstractC0141g.m465a(r05);
        if (r06 == null) goto L38;
        InputStatsDatabase.m1482j("TextView.setHint hook skipped: " + r06.getMessage());
    L38:
        AtomicBoolean r07 = InputStatsDatabase.f1820c;
        if (r07.get() == true) goto L60;
        Iterator r26 = AbstractC0182m.m556h0(new String[]{"com.tencent.wcdb.database.SQLiteDatabase", "android.database.sqlite.SQLiteDatabase"}).iterator();
    L42:
        Class r65 = null;
        Object r66 = null;
        if (r26.hasNext() == false) goto L55;
        Object r43 = AbstractC0358S.m906r(r3, (String) r26.next());     // Catch: Throwable -> L47
    L50:
        if ((r43 instanceof C0140f) == true) goto L53;
        r66 = r43;
    L53:
        r65 = (Class) r66;
        if (r65 == null) goto L42;
    L47:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
    L55:
        if (r65 != null) goto L57;
        InputStatsDatabase.m1482j("database class not ready");
        goto L60
    L57:
        int r44 = InputStatsDatabase.m1477e(r65, "insert", new Class[]{String.class, String.class, ContentValues.class}) + InputStatsDatabase.m1477e(r65, "insertOrThrow", new Class[]{String.class, String.class, ContentValues.class});
        Class r73 = Integer.TYPE;
        AbstractC0307g.m700b(r73);
        int r45 = r44 + InputStatsDatabase.m1477e(r65, "insertWithOnConflict", new Class[]{String.class, String.class, ContentValues.class, r73});
        if (r45 <= 0) goto L60;
        r07.set(true);
        InputStatsDatabase.m1482j("hooked " + r45 + " DB insert methods on " + r65.getName());
    L60:
        InputStatsDatabase.m1482j("installed");
    L33:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
    L23:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
    L12:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: f */
    private final Object m2111f() {
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader r2 = this.f2950c;
        AbstractC0307g.m703e(r2, "$cl");
        MomentsAdsBlocker r3 = MomentsAdsBlocker.f2016a;
        boolean r32 = MomentsAdsBlocker.f2017b.compareAndSet(false, true);
        C0146l r4 = C0146l.f339a;
        if (r32 == false) goto L31;
        MomentsAdsBlocker.m1631b("install enabled=" + MomentsAdsBlocker.m1630a());
        Class r22 = AbstractC0358S.m906r(r2, "com.tencent.mm.plugin.sns.storage.ADInfo");     // Catch: Throwable -> L10
        C0172c r33 = AbstractC0317q.m714c(r22.getDeclaredConstructors());     // Catch: Throwable -> L10
        int r5 = 0;
    L8:
        if (r33.hasNext() == false) goto L12;
        Constructor r6 = (Constructor) r33.next();     // Catch: Throwable -> L10
        AbstractC0307g.m700b(r6);     // Catch: Throwable -> L10
        AbstractC0762d.m1952b(r6, new C0646c1(0));     // Catch: Throwable -> L10
        r5 = r5 + 1;     // Catch: Throwable -> L10
        goto L8
    L12:
        C0172c r23 = AbstractC0317q.m714c(r22.getDeclaredMethods());     // Catch: Throwable -> L10
    L14:
        if (r23.hasNext() == false) goto L25;
        Method r34 = (Method) r23.next();     // Catch: Throwable -> L10
        if (AbstractC0307g.m699a(r34.getReturnType(), Boolean.TYPE) == true) goto L20;
        if (AbstractC0307g.m699a(r34.getReturnType(), Boolean.class) == false) goto L14;
    L20:
        String r62 = r34.getName();     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r62, "getName(...)");     // Catch: Throwable -> L10
        String r63 = r62.toLowerCase(Locale.ROOT);     // Catch: Throwable -> L10
        AbstractC0307g.m702d(r63, "toLowerCase(...)");     // Catch: Throwable -> L10
        if (AbstractC0425j.m1005J0(r63, "ad", false) == true) goto L24;
        if (AbstractC0425j.m1005J0(r63, "advert", false) == false) goto L14;
    L24:
        AbstractC0762d.m1952b(r34, new C0646c1(1));     // Catch: Throwable -> L10
        r5 = r5 + 1;     // Catch: Throwable -> L10
        goto L14
    L25:
        MomentsAdsBlocker.m1631b("hooked ADInfo paths count=" + r5);     // Catch: Throwable -> L10
        Object r02 = r4;
    L28:
        Throwable r03 = AbstractC0141g.m465a(r02);
        if (r03 == null) goto L31;
        MomentsAdsBlocker r1 = MomentsAdsBlocker.f2016a;
        MomentsAdsBlocker.m1631b("ADInfo hook fail: " + r03.getMessage());
    L10:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
    L31:
        return r4;
    }

    /* JADX INFO: renamed from: g */
    private final Object m2112g() {
        Context r2 = this.f2949b;
        AbstractC0307g.m703e(r2, "$ctx");
        ClassLoader r3 = this.f2950c;
        AbstractC0307g.m703e(r3, "$cl");
        HotUpdateBlocker r4 = HotUpdateBlocker.f2005a;
        C0146l r42 = C0146l.f339a;
        if (HotUpdateBlocker.f2007c.compareAndSet(false, true) == false) goto L76;
        HotUpdateBlocker.m1629b("install enabled=" + HotUpdateBlocker.m1628a());
        C0172c r7 = AbstractC0317q.m714c(AbstractC0358S.m906r(r3, "com.tencent.tinker.loader.shareutil.ShareTinkerInternals").getDeclaredMethods());     // Catch: Throwable -> L16
        int r8 = 0;
    L8:
        if (r7.hasNext() == false) goto L19;
        Method r9 = (Method) r7.next();     // Catch: Throwable -> L16
        String r10 = r9.getName();     // Catch: Throwable -> L16
        AbstractC0307g.m702d(r10, "getName(...)");     // Catch: Throwable -> L16
        if (AbstractC0433r.m1033H0(r10, "isTinkerEnabled", false) == false) goto L8;
        if (AbstractC0307g.m699a(r9.getReturnType(), Boolean.TYPE) == true) goto L18;
        if (AbstractC0307g.m699a(r9.getReturnType(), Boolean.class) == false) goto L8;
    L18:
        AbstractC0762d.m1952b(r9, new MessageActionDispatcher(2));     // Catch: Throwable -> L16
        r8 = r8 + 1;     // Catch: Throwable -> L16
        HotUpdateBlocker.m1629b("hooked " + r9.getName());     // Catch: Throwable -> L16
        goto L8
    L19:
        HotUpdateBlocker.m1629b("ShareTinkerInternals hooks=" + r8);     // Catch: Throwable -> L16
        Object r72 = r42;
    L22:
        Throwable r73 = AbstractC0141g.m465a(r72);
        HotUpdateBlocker r82 = HotUpdateBlocker.f2005a;
        if (r73 == null) goto L83;
        HotUpdateBlocker.m1629b("TinkerInternals fail: " + r73.getMessage());
    L83:
        C0172c r32 = AbstractC0317q.m714c(AbstractC0358S.m906r(r3, "com.tencent.tinker.loader.TinkerLoader").getDeclaredMethods());     // Catch: Throwable -> L32
    L26:
        if (r32.hasNext() == false) goto L35;
        Method r74 = (Method) r32.next();     // Catch: Throwable -> L32
        String r83 = r74.getName();     // Catch: Throwable -> L32
        AbstractC0307g.m702d(r83, "getName(...)");     // Catch: Throwable -> L32
        if (AbstractC0425j.m1005J0(r83, "tryLoad", true) == true) goto L26;
        String r75 = r74.getName();     // Catch: Throwable -> L32
        AbstractC0307g.m702d(r75, "getName(...)");     // Catch: Throwable -> L32
        AbstractC0425j.m1005J0(r75, "load", true);     // Catch: Throwable -> L32
    L35:
        if (HotUpdateBlocker.m1628a() == false) goto L76;
        File r33 = new File("/data/data/com.tencent.mm/tinker");
        ApplicationInfo r76 = r2.getApplicationInfo();
        if (r76 == null) goto L40;
        String r77 = r76.dataDir;
        if (r77 == null) goto L40;
    L41:
        Iterator r34 = AbstractC0182m.m556h0(new File[]{r33, new File(r77, "tinker"), new File("/data/user/0/com.tencent.mm/tinker")}).iterator();
    L43:
        if (r34.hasNext() == false) goto L62;
        File r5 = (File) r34.next();
        if (r5.exists() == false) goto L43;
        C0266g r84 = new C0266g(new C0268i(r5));     // Catch: Throwable -> L60
    L48:
        boolean r78 = true;
    L50:
        if (r84.hasNext() == false) goto L58;
        File r92 = (File) r84.next();     // Catch: Throwable -> L60
        if (r92.delete() == false) goto L54;
    L55:
        if (r78 == true) goto L48;
    L57:
        r78 = false;
        goto L50
    L54:
        if (r92.exists() == true) goto L57;
    L58:
        HotUpdateBlocker.m1629b("wiped " + r5.getAbsolutePath());     // Catch: Throwable -> L60
    L60:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L43
    L62:
        PackageManager r22 = r2.getPackageManager();
        if (r22 == null) goto L76;
        Iterator r52 = HotUpdateBlocker.f2006b.iterator();
    L67:
        if (r52.hasNext() == false) goto L76;
        String r79 = (String) r52.next();
        r22.setComponentEnabledSetting(new ComponentName(ModernHookEntry.WECHAT_PACKAGE, r79), 2, 1);     // Catch: Throwable -> L71
        HotUpdateBlocker.m1629b("component " + r79 + " enabled=false");     // Catch: Throwable -> L71
        Object r85 = r42;
    L73:
        Throwable r86 = AbstractC0141g.m465a(r85);
        if (r86 == null) goto L67;
        HotUpdateBlocker.m1629b("component " + r79 + " fail: " + r86.getMessage());
    L71:
        th = move-exception;
        r85 = AbstractC0040p.m116u(th);
    L40:
        r77 = "";
    L32:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L16:
        th = move-exception;
        r72 = AbstractC0040p.m116u(th);
    L76:
        return r42;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Member, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v188, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Member, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v44, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: h */
    private final Object m2113h() {
        int r4 = 2;
        ?? r5 = 0;
        boolean r7 = true;
        ClassLoader r8 = this.f2950c;
        Context r9 = this.f2949b;
        AbstractC0307g.m703e(r8, "$classLoader");
        AbstractC0307g.m703e(r9, "$appContext");
        SettingsEntryInjector r02 = SettingsEntryInjector.f2992a;
        boolean r03 = SettingsEntryInjector.f2993b.compareAndSet(false, true);
        C0146l r10 = C0146l.f339a;
        if (r03 == true) goto L315;
    L312:
        return r10;
    L315:
        Object r04 = AbstractC0358S.m882d0(r9);     // Catch: Throwable -> L7
    L10:
        if ((r04 instanceof C0140f) == false) goto L12;
        r04 = null;
    L12:
        CompatibilityReport r05 = (CompatibilityReport) r04;
        if (r05 == null) goto L16;
        String r06 = r05.m1383a();
        if (r06 == null) goto L16;
    L17:
        SettingsEntryInjector.m2146l("install begin ver=".concat(r06));
        boolean r07 = SettingsEntryInjector.f2994c.compareAndSet(false, true);
        SettingsEntryInjector r11 = SettingsEntryInjector.f2992a;
        if (r07 == true) goto L345;
    L19:
        int r42 = 0;
    L74:
        SettingsEntryInjector.m2146l("legacy settings list injection disabled");
        AtomicBoolean r08 = DexKitManager.f1646a;
        List r17 = DexKitManager.m1363b(r9, r8, AbstractC0805P.f2920a, new String[]{"MicroMsg.PlusSubMenuHelper"});
        Iterator r09 = r17.iterator();
    L76:
        if (r09.hasNext() == false) goto L109;
        Class r112 = (Class) r09.next();
        if (Activity.class.isAssignableFrom(r112) == true) goto L76;
        if (r112.isInterface() == true) goto L76;
        if (r112.isAnnotation() == true) goto L76;
        if (r112.isEnum() == true) goto L76;
        boolean r19 = false;
        boolean r20 = false;
        boolean r21 = false;
        Class r18 = r112;
    L88:
        if (r18 == null) goto L103;
        C0172c r22 = AbstractC0317q.m714c(r18.getDeclaredFields());
    L91:
        if (r22.hasNext() == false) goto L102;
        Class<?> r2 = ((Field) r22.next()).getType();
        if (SparseArray.class.isAssignableFrom(r2) == false) goto L96;
        r19 = true;
    L96:
        if (BaseAdapter.class.isAssignableFrom(r2) == false) goto L99;
        r20 = true;
    L99:
        if (LayoutInflater.class.isAssignableFrom(r2) == false) goto L91;
        r21 = true;
        goto L91
    L102:
        r18 = r18.getSuperclass();
        goto L88
    L103:
        if (r19 == false) goto L76;
        if (r20 == false) goto L76;
        if (r21 == false) goto L76;
        SettingsEntryInjector.m2146l("plus helper resolved via DexKit: ".concat(r112.getName()));
    L120:
        if (r112 != null) goto L122;
        SettingsEntryInjector.m2146l("plus helper class not resolved (DexKit + fallback both failed)");
    L293:
        int r43 = r42 + r5;
        if (r5 <= 0) goto L296;
        String r010 = "OK";
    L297:
        SettingsEntryInjector.m2146l("settings entry hooks installed count=" + r43 + " plusMenu=" + r010);
        if (r5 != 0) goto L304;
        SettingsEntryInjector.m2146l("FATAL: plus menu entry unavailable on this build; OKK has no visible entry");
        ModuleLog.INSTANCE.m1813i("严重：加号菜单入口注入失败，模块将没有可见入口");     // Catch: Throwable -> L302
    L302:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L304:
        ConcurrentHashMap r011 = FeatureStatusRegistry.f2728a;
        if (r5 > 0) goto L308;
        r7 = false;
    L308:
        if (r5 <= 0) goto L310;
        String r012 = "加号菜单入口已注入";
    L311:
        FeatureStatusRegistry.m1967g("SettingsEntry", r012, r7);
        goto L312
    L310:
        r012 = "加号菜单入口注入失败，模块无可见入口";
        goto L311
    L296:
        r010 = "FAIL";
        goto L297
    L122:
        SettingsEntryInjector.m2146l("plus helper class resolved=".concat(r112.getName()));
        C0401d r23 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r112, null)), new C0813Y(5)), true, new C0813Y(16)));
        int r3 = 0;
    L124:
        if (r23.hasNext() == false) goto L139;
        Method r52 = (Method) r23.next();
        r52.setAccessible(r7);     // Catch: Throwable -> L132
        AbstractC0762d.m1952b(r52, new C0824e0(r112, r8, 0));     // Catch: Throwable -> L132
        r3 = r3 + 1;     // Catch: Throwable -> L132
        String r013 = r52.getDeclaringClass().getName();     // Catch: Throwable -> L132
        String r72 = r52.getName();     // Catch: Throwable -> L132
        StringBuilder r1 = new StringBuilder();     // Catch: Throwable -> L132
        C0401d r212 = r23;
        r1.append("plus menu display hooked ");     // Catch: Throwable -> L130
        r1.append(r013);     // Catch: Throwable -> L130
        r1.append(".");     // Catch: Throwable -> L130
        r1.append(r72);     // Catch: Throwable -> L130
        SettingsEntryInjector.m2146l(r1.toString());     // Catch: Throwable -> L130
        Object r014 = r10;
    L135:
        Throwable r015 = AbstractC0141g.m465a(r014);
        if (r015 == null) goto L138;
        SettingsEntryInjector.m2146l("plus display hook fail " + r52.getDeclaringClass().getName() + "." + r52.getName() + ": " + r015.getMessage());
    L138:
        r23 = r212;
        r7 = true;
    L130:
        th = th;
    L134:
        r014 = AbstractC0040p.m116u(th);
    L132:
        th = th;
        r212 = r23;
        goto L134
    L139:
        ?? r53 = 1;
        C0401d r12 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r112, null)), new C0813Y(20)), true, new C0813Y(21)));
    L141:
        if (r12.hasNext() == false) goto L151;
        ?? r016 = (Method) r12.next();
        r016.setAccessible(r53);     // Catch: Throwable -> L145
        AbstractC0762d.m1952b(r016, new C0824e0(r112, r8, r53));     // Catch: Throwable -> L145
        r3 = r3 + r53;     // Catch: Throwable -> L145
        SettingsEntryInjector.m2146l("plus adapter factory hooked " + r016.getDeclaringClass().getName() + "." + r016.getName());     // Catch: Throwable -> L145
        Object r017 = r10;
    L147:
        Throwable r018 = AbstractC0141g.m465a(r017);
        if (r018 == null) goto L150;
        SettingsEntryInjector.m2146l("plus adapter factory hook fail: " + r018.getMessage());
    L150:
        r53 = 1;
    L145:
        th = move-exception;
        r017 = AbstractC0040p.m116u(th);
        goto L147
    L151:
        C0172c r13 = AbstractC0317q.m714c(r112.getDeclaredMethods());
    L153:
        if (r13.hasNext() == false) goto L170;
        Method r019 = (Method) r13.next();
        if (AbstractC0307g.m699a(r019.getName(), "onItemClick") == false) goto L153;
        if (r019.getParameterTypes().length != 4) goto L153;
        AbstractC0762d.m1952b(r019, new MessageActionDispatcher(9));     // Catch: Throwable -> L165
        int r73 = r3 + 1;
        Object r020 = Integer.valueOf(r3);     // Catch: Throwable -> L163
        r3 = r73;
    L167:
        Throwable r021 = AbstractC0141g.m465a(r020);
        if (r021 == null) goto L153;
        SettingsEntryInjector.m2146l("plus click hook fail: " + r021.getMessage());
    L163:
        th = th;
        r3 = r73;
    L166:
        r020 = AbstractC0040p.m116u(th);
    L165:
        th = th;
        goto L166
    L170:
        if (r3 <= 0) goto L172;
        SettingsEntryInjector.m2146l("home plus menu hooked count=" + r3);
    L172:
        C0401d r14 = new C0401d(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r112, null)), new C0813Y(18)));
    L174:
        if (r14.hasNext() == false) goto L182;
        Object r022 = r14.next();
        Method r24 = (Method) r022;
        Class<?>[] r54 = r24.getParameterTypes();
        AbstractC0307g.m702d(r54, "getParameterTypes(...)");
        if (r54.length != 0) goto L174;
        if (BaseAdapter.class.isAssignableFrom(r24.getReturnType()) == false) goto L174;
        if (AbstractC0307g.m699a(r24.getReturnType(), BaseAdapter.class) == true) goto L174;
    L183:
        Method r023 = (Method) r022;
        if (r023 == null) goto L188;
        Class<?> r024 = r023.getReturnType();
        if (r024 == null) goto L188;
        Class<?> r15 = r024;
        int r74 = 0;
    L197:
        if (r15 != null) goto L199;
        SettingsEntryInjector.m2146l("plus adapter class not resolved");
    L226:
        int r32 = r3 + r74;
        AtomicBoolean r025 = DexKitManager.f1646a;     // Catch: Throwable -> L244
        Iterator r026 = DexKitManager.m1363b(r9, r8, AbstractC0805P.f2920a, new String[]{"MicroMsg.PlusMenaDataManager"}).iterator();     // Catch: Throwable -> L244
    L229:
        if (r026.hasNext() == false) goto L249;
        Object r25 = r026.next();     // Catch: Throwable -> L244
        Class r55 = (Class) r25;     // Catch: Throwable -> L244
        if (Activity.class.isAssignableFrom(r55) == false) goto L233;
    L247:
        Iterator r213 = r026;
    L248:
        r026 = r213;
        goto L229
    L233:
        if (r55.isInterface() == true) goto L247;
        Field[] r75 = r55.getDeclaredFields();     // Catch: Throwable -> L244
        AbstractC0307g.m702d(r75, "getDeclaredFields(...)");     // Catch: Throwable -> L244
        int r92 = r75.length;     // Catch: Throwable -> L244
        int r132 = 0;
    L235:
        if (r132 >= r92) goto L247;
        r213 = r026;
        if (SparseArray.class.isAssignableFrom(r75[r132].getType()) == true) goto L238;
        r132 = r132 + 1;     // Catch: Throwable -> L244
        r026 = r213;
        goto L235
    L238:
        Field[] r027 = r55.getDeclaredFields();     // Catch: Throwable -> L244
        AbstractC0307g.m702d(r027, "getDeclaredFields(...)");     // Catch: Throwable -> L244
        int r56 = r027.length;     // Catch: Throwable -> L244
        int r76 = 0;
    L239:
        if (r76 >= r56) goto L248;
        if (AbstractC0307g.m699a(r027[r76].getType(), ArrayList.class) == true) goto L250;
        r76 = r76 + 1;     // Catch: Throwable -> L244
    L250:
        Class<?> r26 = (Class) r25;     // Catch: Throwable -> L244
        if (r26 != null) goto L273;
    L254:
        C0401d r27 = new C0401d(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r112, null)), new C0813Y(19)));
    L256:
        if (r27.hasNext() == false) goto L267;
        Object r028 = r27.next();
        Field r57 = (Field) r028;
        if (r57.getType().isPrimitive() == true) goto L256;
        if (AbstractC0307g.m699a(r57.getType(), String.class) == true) goto L256;
        Field[] r58 = r57.getType().getDeclaredFields();
        AbstractC0307g.m702d(r58, "getDeclaredFields(...)");
        int r77 = r58.length;
        int r93 = 0;
    L262:
        if (r93 >= r77) goto L256;
        if (SparseArray.class.isAssignableFrom(r58[r93].getType()) == true) goto L265;
        r93 = r93 + 1;
        goto L262
    L265:
        Object r16 = r028;
    L268:
        Field r110 = (Field) r16;
        if (r110 == null) goto L271;
        Class<?> r111 = r110.getType();
    L272:
        r26 = r111;
        goto L273
    L271:
        r111 = null;
        goto L272
    L267:
        r16 = null;
    L273:
        if (r26 != null) goto L275;
        int r28 = 0;
        r7 = true;
    L289:
        if ((r32 + r28) <= 0) goto L291;
        boolean r029 = r7;
    L292:
        r5 = r029;
        goto L293
    L291:
        r029 = false;
        goto L292
    L275:
        SettingsEntryInjector.m2146l("plus data manager resolved=".concat(r26.getName()));
        r7 = true;
        C0401d r113 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r26, null)), new C0813Y(8)), true, new C0813Y(9)));
        r28 = 0;
    L277:
        if (r113.hasNext() == false) goto L286;
        Method r59 = (Method) r113.next();
        r59.setAccessible(true);     // Catch: Throwable -> L281
        AbstractC0762d.m1952b(r59, new C0596I1(r8));     // Catch: Throwable -> L281
        r28 = r28 + 1;     // Catch: Throwable -> L281
        SettingsEntryInjector.m2146l("plus data manager rebuild hooked " + r59.getDeclaringClass().getName() + "." + r59.getName());     // Catch: Throwable -> L281
        Object r030 = r10;
    L283:
        Throwable r031 = AbstractC0141g.m465a(r030);
        if (r031 == null) goto L277;
        SettingsEntryInjector.m2146l("plus data manager hook fail " + r59.getDeclaringClass().getName() + "." + r59.getName() + ": " + r031.getMessage());
    L281:
        th = move-exception;
        r030 = AbstractC0040p.m116u(th);
        goto L283
    L286:
        if (r28 <= 0) goto L289;
        SettingsEntryInjector.m2146l("plus data manager hooked count=" + r28);
        goto L289
    L249:
        r25 = null;
    L244:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L254
    L199:
        SettingsEntryInjector.m2146l("plus adapter class resolved=".concat(r15.getName()));
        boolean r133 = true;
        C0401d r29 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r15, null)), new C0813Y(24)), true, new C0813Y(25)));
        int r510 = r74;
    L201:
        if (r29.hasNext() == false) goto L211;
        Method r032 = (Method) r29.next();
        r032.setAccessible(r133);     // Catch: Throwable -> L205
        AbstractC0762d.m1952b(r032, new C0824e0(r112, r8, 2));     // Catch: Throwable -> L205
        r510 = r510 + 1;     // Catch: Throwable -> L205
        SettingsEntryInjector.m2146l("plus adapter count hooked " + r032.getDeclaringClass().getName());     // Catch: Throwable -> L205
        Object r033 = r10;
    L207:
        Throwable r034 = AbstractC0141g.m465a(r033);
        if (r034 == null) goto L210;
        SettingsEntryInjector.m2146l("plus adapter count hook fail: " + r034.getMessage());
    L210:
        r133 = true;
    L205:
        th = move-exception;
        r033 = AbstractC0040p.m116u(th);
        goto L207
    L211:
        ?? r78 = 1;
        C0401d r114 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(r15, null)), new C0813Y(26)), true, new C0813Y(6)));
    L213:
        if (r114.hasNext() == false) goto L223;
        ?? r035 = (Method) r114.next();
        r035.setAccessible(r78);     // Catch: Throwable -> L217
        AbstractC0762d.m1952b(r035, new C0824e0(r112, r8, 3));     // Catch: Throwable -> L217
        r510 = r510 + r78;     // Catch: Throwable -> L217
        SettingsEntryInjector.m2146l("plus adapter view hooked " + r035.getDeclaringClass().getName());     // Catch: Throwable -> L217
        Object r036 = r10;
    L219:
        Throwable r037 = AbstractC0141g.m465a(r036);
        if (r037 == null) goto L222;
        SettingsEntryInjector.m2146l("plus adapter view hook fail: " + r037.getMessage());
    L222:
        r78 = 1;
    L217:
        th = move-exception;
        r036 = AbstractC0040p.m116u(th);
        goto L219
    L223:
        if (r510 <= 0) goto L225;
        SettingsEntryInjector.m2146l("home plus adapter hooked count=" + r510);
    L225:
        r74 = r510;
    L188:
        r74 = 0;
        Object r038 = Class.forName("com.tencent.mm.ui.mg", false, r8);     // Catch: Throwable -> L191
    L194:
        if ((r038 instanceof C0140f) == false) goto L196;
        r038 = null;
    L196:
        r15 = (Class) r038;
    L191:
        th = move-exception;
        r038 = AbstractC0040p.m116u(th);
        goto L194
    L182:
        r022 = null;
        goto L183
    L109:
        if ((!r17.isEmpty()) == false) goto L337;
        SettingsEntryInjector.m2146l("plus helper DexKit candidates rejected: ".concat(AbstractC0181l.m546r0(r17, null, null, null, new C0813Y(23), 31)));
    L337:
        Object r039 = Class.forName("com.tencent.mm.ui.rg", false, r8);     // Catch: Throwable -> L114
    L117:
        if ((r039 instanceof C0140f) == false) goto L119;
        r039 = null;
    L119:
        r112 = (Class) r039;
    L114:
        th = move-exception;
        r039 = AbstractC0040p.m116u(th);
        goto L117
    L345:
        Object r040 = Class.forName("hy3.d", false, r8);     // Catch: Throwable -> L23
    L26:
        if ((r040 instanceof C0140f) == false) goto L28;
        r040 = null;
    L28:
        Class r041 = (Class) r040;
        if (r041 == null) goto L31;
    L30:
        Class r115 = r041;
    L37:
        if (r115 != null) goto L323;
        SettingsEntryInjector.m2146l("modern settings list injection disabled; dataSource missing");
        goto L19
    L323:
        AbstractC0358S.m904q(r115, "onCreate", new Object[]{new C0596I1(4)});     // Catch: Throwable -> L44
        Object r042 = 0;     // Catch: Throwable -> L42
        int r134 = 1;
    L47:
        Throwable r043 = AbstractC0141g.m465a(r042);
        if (r043 == null) goto L50;
        SettingsEntryInjector.m2146l("modern cleanup onCreate hook fail: " + r043.getMessage());
    L50:
        C0172c r142 = AbstractC0317q.m714c(r115.getDeclaredMethods());
    L52:
        if (r142.hasNext() == false) goto L69;
        Method r044 = (Method) r142.next();
        int r152 = r044.getParameterCount();
        if (r152 < 0) goto L66;
        if (r152 >= 4) goto L66;
        if (r044.getName().length() > r4) goto L59;
    L313:
        AbstractC0762d.m1952b(r044, new C0596I1(5));     // Catch: Throwable -> L67
        r134 = r134 + 1;
    L67:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L66
    L59:
        if (AbstractC0307g.m699a(r044.getName(), "a") == true) goto L313;
        if (AbstractC0307g.m699a(r044.getName(), "c") == true) goto L313;
        if (AbstractC0307g.m699a(r044.getName(), "getData") == true) goto L313;
    L66:
        r4 = 2;
        goto L52
    L69:
        SettingsEntryInjector.m2146l("modern settings list injection disabled; cleanup hooks=" + r134 + " dataSource=" + r115.getName());
        if (r134 <= 0) goto L72;
        int r045 = 1;
    L73:
        r42 = r045;
        goto L74
    L72:
        r045 = 0;
    L42:
        th = th;
        r134 = 1;
    L46:
        r042 = AbstractC0040p.m116u(th);
    L44:
        th = th;
        r134 = 0;
        goto L46
    L31:
        AtomicBoolean r046 = DexKitManager.f1646a;
        r041 = DexKitManager.m1362a(r9, r8, AbstractC0805P.f2920a, new String[]{"MicroMsg.SettingDataSource", "get data, size : "});
        if (r041 != null) goto L34;
        r041 = DexKitManager.m1362a(r9, r8, AbstractC0805P.f2920a, new String[]{"MicroMsg.SettingDataSource"});
    L34:
        if (r041 != null) goto L30;
        r115 = null;
    L23:
        th = move-exception;
        r040 = AbstractC0040p.m116u(th);
    L16:
        r06 = "n/a";
    L7:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.reflect.Field[]] */
    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        Application r7 = null;
        boolean r13 = false;
        int r14 = 1;
        switch(this.f2948a) {
            case 0: goto L253;
            case 1: goto L145;
            case 2: goto L58;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L53;
            case 6: goto L51;
            case 7: goto L49;
            case 8: goto L42;
            case 9: goto L41;
            case 10: goto L39;
            default: goto L4;
        };
    L4:
        Context r2 = this.f2949b;
        ClassLoader r02 = this.f2950c;
        AbstractC0307g.m703e(r2, "$appContext");
        AbstractC0307g.m703e(r02, "$classLoader");
        HookDiagnostics r3 = HookDiagnostics.f3000a;
        boolean r32 = HookDiagnostics.f3002c.compareAndSet(false, true);
        Context r4 = r2.getApplicationContext();
        if (r4 != null) goto L7;
        r4 = r2;
    L7:
        HookDiagnostics.f3007h = r4;
        HookDiagnostics.f3008i = r02;
        if (AbstractC0358S.f729i == false) goto L10;
        HookDiagnostics.f3003d.set(false);
        HookDiagnostics.f3004e.set(false);
    L10:
        HookDiagnostics.m2157g("install first=" + r32 + " interactive=" + AbstractC0358S.f729i + " pendingDialog=" + AbstractC0358S.f728h);
        if (r32 == true) goto L350;
    L36:
        HookDiagnostics.f3005f.set(0);
        RunnableC0488m r03 = new RunnableC0488m(1);
        Handler r22 = HookDiagnostics.f3001b;
        r22.postDelayed(r03, 600);
        r22.postDelayed(new RunnableC0713z(4), 1200);
        r22.postDelayed(new RunnableC0713z(5), 3000);
        r22.postDelayed(new RunnableC0713z(6), 6000);
        return C0146l.f339a;
    L350:
        AbstractC0358S.m904q(Activity.class, "onResume", new Object[]{new C0596I1(3, false)});     // Catch: Throwable -> L15
    L376:
        AbstractC0358S.m904q(Activity.class, "onWindowFocusChanged", new Object[]{Boolean.TYPE, new C0596I1(2)});     // Catch: Throwable -> L19
    L22:
        if ((r2 instanceof Application) == false) goto L24;
        Application r04 = (Application) r2;
    L25:
        if (r04 != null) goto L346;
        Context r05 = r2.getApplicationContext();
        if ((r05 instanceof Application) == false) goto L29;
        r7 = (Application) r05;
    L29:
        if (r7 == null) goto L36;
        r04 = r7;
    L346:
        HookDiagnostics r33 = HookDiagnostics.f3000a;     // Catch: Throwable -> L34
        r04.registerActivityLifecycleCallbacks(new C0829h());     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L36
    L24:
        r04 = null;
    L19:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L15:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L376
    L42:
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader r23 = this.f2950c;
        AbstractC0307g.m703e(r23, "$cl");
        C0655f1 r06 = C0655f1.f2038a;
        if (C0655f1.f2039b.compareAndSet(false, true) == false) goto L47;
        C0655f1.m1639d("install enabled=" + C0655f1.m1637b());
        r06.m1640a(r23, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        r06.m1640a(r23, "com.tencent.mm.chatroom.ui.ChatroomInfoUI");
    L47:
        return C0146l.f339a;
    L58:
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader r24 = this.f2950c;
        AbstractC0307g.m703e(r24, "$cl");
        AtomicBoolean r07 = C0704w.f2213a;
        if (C0704w.f2213a.compareAndSet(false, true) == false) goto L144;
        C0707x r08 = PcAutoLoginConfig.m1785a();
        C0704w.m1796d("install enabled=" + r08.f2222a + " sync=" + r08.f2223b + " showDev=" + r08.f2224c + " autoDev=" + r08.f2225d + " click=" + r08.f2226e);
        Object r09 = AbstractC0358S.m906r(r24, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");     // Catch: Throwable -> L64
    L66:
        Throwable r25 = AbstractC0141g.m465a(r09);
        AtomicBoolean r34 = C0704w.f2213a;
        if (r25 != null) goto L142;
        Class r010 = (Class) r09;
        Method[] r26 = r010.getDeclaredMethods();
        AbstractC0307g.m702d(r26, "getDeclaredMethods(...)");
        ArrayList r35 = new ArrayList();
        int r42 = r26.length;
        int r6 = 0;
    L70:
        if (r6 >= r42) goto L80;
        Method r9 = r26[r6];
        if (AbstractC0307g.m699a(r9.getName(), "onCreate") == false) goto L78;
        if (r9.getParameterTypes().length != 1) goto L78;
        if (Bundle.class.isAssignableFrom(r9.getParameterTypes()[0]) == false) goto L78;
        r35.add(r9);
    L78:
        r6 = r6 + 1;
        goto L70
    L80:
        if (r35.isEmpty() == false) goto L93;
        Method[] r27 = r010.getMethods();
        AbstractC0307g.m702d(r27, "getMethods(...)");
        r35 = new ArrayList();
        int r43 = r27.length;
        int r62 = 0;
    L82:
        if (r62 >= r43) goto L93;
        Method r92 = r27[r62];
        if (r92.getParameterTypes().length != 1) goto L92;
        if (Bundle.class.isAssignableFrom(r92.getParameterTypes()[0]) == false) goto L92;
        if (AbstractC0307g.m699a(r92.getName(), "onCreate") == false) goto L90;
    L91:
        r35.add(r92);
        goto L92
    L90:
        if (AbstractC0307g.m699a(r92.getDeclaringClass(), r010) == true) goto L91;
    L92:
        r62 = r62 + 1;
    L93:
        Iterator r28 = r35.iterator();
    L94:
        boolean r44 = r28.hasNext();
        ConcurrentHashMap.KeySetView r63 = C0704w.f2214b;
        if (r44 == false) goto L100;
        Method r45 = (Method) r28.next();
        AbstractC0307g.m700b(r45);
        if (r63.add(C0704w.m1795c(r45)) == false) goto L94;
        AbstractC0762d.m1952b(r45, new C0698u(r45, r14, r13));
        C0704w.m1796d("hooked " + r45.getDeclaringClass().getSimpleName() + "." + r45.getName());
        goto L94
    L100:
        if (r35.isEmpty() == false) goto L102;
        C0704w.m1796d("no onCreate method found on com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");
    L102:
        Method[] r011 = r010.getDeclaredMethods();
        AbstractC0307g.m702d(r011, "getDeclaredMethods(...)");
        ArrayList r29 = new ArrayList();
        int r36 = r011.length;
        int r46 = 0;
    L104:
        if (r46 >= r36) goto L121;
        Method r10 = r011[r46];
        Class<?>[] r11 = r10.getParameterTypes();
        AbstractC0307g.m702d(r11, "getParameterTypes(...)");
        if (r11.length != 0) goto L120;
        if (AbstractC0307g.m699a(r10.getReturnType(), Void.TYPE) == true) goto L112;
        if (AbstractC0307g.m699a(r10.getReturnType(), Void.class) == false) goto L120;
    L112:
        if (AbstractC0307g.m699a(r10.getName(), "initView") == false) goto L114;
    L119:
        r29.add(r10);
        goto L120
    L114:
        if (AbstractC0307g.m699a(r10.getName(), "init") == true) goto L119;
        if (AbstractC0433r.m1029D0(r10.getName(), "a", false) == true) goto L119;
        if (r10.getName().length() <= 2) goto L119;
    L120:
        r46 = r46 + 1;
        goto L104
    L121:
        List r012 = AbstractC0181l.m548t0(r29, new C0695t(0, new C0695t(1, new C0692s(false ? 1 : 0))));
        ArrayList r210 = new ArrayList();
        Iterator r013 = r012.iterator();
    L123:
        if (r013.hasNext() == false) goto L129;
        Object r37 = r013.next();
        Method r47 = (Method) r37;
        if (AbstractC0307g.m699a(r47.getName(), "initView") == true) goto L128;
        if (AbstractC0307g.m699a(r47.getName(), "init") == false) goto L123;
    L128:
        r210.add(r37);
        goto L123
    L129:
        boolean r014 = r210.isEmpty();
        List r211 = r210;
        if (r014 == false) goto L132;
        r211 = C0190u.f401a;
    L132:
        Iterator r015 = r211.iterator();
    L134:
        if (r015.hasNext() == false) goto L139;
        Method r38 = (Method) r015.next();
        AbstractC0307g.m700b(r38);
        if (r63.add(C0704w.m1795c(r38)) == false) goto L134;
        AbstractC0762d.m1952b(r38, new C0698u(r38, false ? 1 : 0, false ? 1 : 0));
        C0704w.m1796d("hooked " + r38.getDeclaringClass().getSimpleName() + "." + r38.getName() + "()");
        goto L134
    L139:
        if (r211.isEmpty() == false) goto L141;
        C0704w.m1796d("initView not found; rely on onCreate post click");
    L141:
        C0704w.m1796d("hooks ready for com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");
        goto L144
    L142:
        C0704w.m1796d("class not found: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI (" + r25.getMessage() + ")");
    L64:
        th = move-exception;
        r09 = AbstractC0040p.m116u(th);
    L144:
        return C0146l.f339a;
    L145:
        Context r72 = this.f2949b;
        ClassLoader r8 = this.f2950c;
        AbstractC0307g.m703e(r72, "$ctx");
        AbstractC0307g.m703e(r8, "$cl");
        FoldBannerPinHook r016 = FoldBannerPinHook.f2154a;
        C0146l r15 = C0146l.f339a;
        if (FoldBannerPinHook.f2155b.compareAndSet(false, true) == false) goto L252;
        FoldBannerPinHook.m1763j(true);
        FoldBannerPinHook.m1765l("install enabled=" + FoldBannerPinHook.f2156c + " (HIDE sticky overlay, keep list item)");
        AbstractC0358S.m904q(AbstractC0358S.m906r(r8, "com.tencent.mm.ui.conversation.ConversationListView"), "setFoldBanner", new Object[]{View.class, new C0684p0(0)});     // Catch: Throwable -> L151
        FoldBannerPinHook.m1765l("hooked ConversationListView.setFoldBanner");     // Catch: Throwable -> L151
        Object r017 = r15;
    L153:
        Throwable r018 = AbstractC0141g.m465a(r017);
        FoldBannerPinHook r93 = FoldBannerPinHook.f2154a;
        if (r018 == null) goto L354;
        FoldBannerPinHook.m1765l("setFoldBanner: " + r018.getMessage());
    L354:
        AbstractC0358S.m904q(View.class, "setVisibility", new Object[]{Integer.TYPE, new InputStatsMessageHook(21)});     // Catch: Throwable -> L158
        FoldBannerPinHook.m1765l("hooked View.setVisibility");     // Catch: Throwable -> L158
        Object r019 = r15;
    L160:
        Throwable r020 = AbstractC0141g.m465a(r019);
        if (r020 == null) goto L378;
        FoldBannerPinHook.m1765l("setVisibility: " + r020.getMessage());
    L378:
        AbstractC0358S.m904q(View.class, "setTranslationY", new Object[]{Float.TYPE, new C0684p0(4)});     // Catch: Throwable -> L165
        FoldBannerPinHook.m1765l("hooked View.setTranslationY");     // Catch: Throwable -> L165
        Object r021 = r15;
    L167:
        Throwable r022 = AbstractC0141g.m465a(r021);
        if (r022 == null) goto L372;
        FoldBannerPinHook.m1765l("setTranslationY: " + r022.getMessage());
    L372:
        AbstractC0358S.m904q(View.class, "setAlpha", new Object[]{Float.TYPE, new InputStatsMessageHook(22)});     // Catch: Throwable -> L172
        FoldBannerPinHook.m1765l("hooked View.setAlpha");     // Catch: Throwable -> L172
        Object r023 = r15;
    L174:
        Throwable r024 = AbstractC0141g.m465a(r023);
        if (r024 == null) goto L348;
        FoldBannerPinHook.m1765l("setAlpha: " + r024.getMessage());
    L348:
        Class r025 = AbstractC0358S.m906r(r8, "com.tencent.mm.ui.conversation.ConversationListView");     // Catch: Throwable -> L179
        Class r64 = Integer.TYPE;     // Catch: Throwable -> L179
        AbstractC0358S.m904q(r025, "onScroll", new Object[]{AbsListView.class, r64, r64, r64, new InputStatsMessageHook(23)});     // Catch: Throwable -> L179
        AbstractC0358S.m904q(r025, "layoutChildren", new Object[]{new InputStatsMessageHook(24)});     // Catch: Throwable -> L179
        FoldBannerPinHook.m1765l("hooked ConversationListView.onScroll/layoutChildren");     // Catch: Throwable -> L179
        Object r026 = r15;
    L181:
        Throwable r027 = AbstractC0141g.m465a(r026);
        if (r027 == null) goto L358;
        FoldBannerPinHook.m1765l("list hooks: " + r027.getMessage());
    L358:
        Class r028 = AbstractC0358S.m906r(r8, "com.tencent.mm.ui.conversation.l5");     // Catch: Throwable -> L194
        C0172c r39 = AbstractC0317q.m714c(r028.getDeclaredMethods());     // Catch: Throwable -> L194
        int r48 = 0;
    L186:
        if (r39.hasNext() == false) goto L196;
        Method r65 = (Method) r39.next();     // Catch: Throwable -> L194
        if (r65.getParameterTypes().length != 2) goto L186;
        if (AbstractC0307g.m699a(r65.getParameterTypes()[0], Integer.TYPE) == false) goto L186;
        if (AbstractC0307g.m699a(r65.getParameterTypes()[1], Boolean.TYPE) == false) goto L186;
        AbstractC0762d.m1952b(r65, new C0684p0(1));     // Catch: Throwable -> L194
        r48 = r48 + 1;     // Catch: Throwable -> L194
        FoldBannerPinHook.m1765l("hooked FolderHelper." + r65.getName() + "(int,boolean)");     // Catch: Throwable -> L194
        goto L186
    L196:
        C0172c r029 = AbstractC0317q.m714c(r028.getDeclaredFields());     // Catch: Throwable -> L194
    L198:
        if (r029.hasNext() == false) goto L216;
        Field r310 = (Field) r029.next();     // Catch: Throwable -> L194
        if (LinearLayout.class.isAssignableFrom(r310.getType()) == true) goto L203;
        if (View.class.isAssignableFrom(r310.getType()) == false) goto L198;
    L203:
        String r66 = r310.getName();     // Catch: Throwable -> L194
        if (AbstractC0307g.m699a(r66, "f200744h") == true) goto L214;
        if (AbstractC0307g.m699a(r66, "h") == true) goto L214;
        AbstractC0307g.m700b(r66);     // Catch: Throwable -> L194
        if (AbstractC0425j.m1005J0(r66, "banner", true) == true) goto L214;
        if (AbstractC0425j.m1005J0(r66, "fold", true) == true) goto L214;
        if (AbstractC0433r.m1028C0(r66, "h") == false) goto L198;
    L214:
        if (FoldBannerPinHook.f2160g != null) goto L198;
        FoldBannerPinHook.f2160g = r66;     // Catch: Throwable -> L194
        FoldBannerPinHook.m1765l("pre-resolve banner field=" + r66 + " type=" + r310.getType().getSimpleName());     // Catch: Throwable -> L194
        goto L198
    L216:
        if (r48 != 0) goto L218;
        FoldBannerPinHook.m1765l("FolderHelper: no g(int,boolean) found");     // Catch: Throwable -> L194
    L218:
        Object r030 = r15;
    L220:
        Throwable r031 = AbstractC0141g.m465a(r030);
        if (r031 == null) goto L380;
        FoldBannerPinHook.m1765l("FolderHelper g: " + r031.getMessage());
    L380:
        Class r032 = AbstractC0358S.m906r(r8, "com.tencent.mm.ui.conversation.MainUI");     // Catch: Throwable -> L232
        Iterator r212 = AbstractC0182m.m556h0(new String[]{"onTabCreate", "onResume", "onActivityCreated", "onShow", "onEnter", "onHiddenChanged"}).iterator();     // Catch: Throwable -> L232
    L225:
        if (r212.hasNext() == false) goto L239;
        String r311 = (String) r212.next();     // Catch: Throwable -> L232
        Method[] r49 = r032.getDeclaredMethods();     // Catch: Throwable -> L232
        AbstractC0307g.m702d(r49, "getDeclaredMethods(...)");     // Catch: Throwable -> L232
        ArrayList r67 = new ArrayList();     // Catch: Throwable -> L232
        int r73 = r49.length;     // Catch: Throwable -> L232
        int r82 = 0;
    L227:
        if (r82 >= r73) goto L235;
        Method r94 = r49[r82];     // Catch: Throwable -> L232
        if (AbstractC0307g.m699a(r94.getName(), r311) == false) goto L234;
        r67.add(r94);     // Catch: Throwable -> L232
    L234:
        r82 = r82 + 1;     // Catch: Throwable -> L232
        goto L227
    L235:
        Iterator r312 = r67.iterator();     // Catch: Throwable -> L232
    L237:
        if (r312.hasNext() == false) goto L225;
        Method r410 = (Method) r312.next();     // Catch: Throwable -> L232
        AbstractC0307g.m700b(r410);     // Catch: Throwable -> L232
        AbstractC0762d.m1952b(r410, new C0684p0(2));     // Catch: Throwable -> L232
        goto L237
    L239:
        FoldBannerPinHook.m1765l("hooked MainUI lifecycle for lt5");     // Catch: Throwable -> L232
        Object r033 = r15;
    L242:
        Throwable r034 = AbstractC0141g.m465a(r033);
        if (r034 == null) goto L382;
        FoldBannerPinHook.m1765l("MainUI: " + r034.getMessage());
    L382:
        AbstractC0358S.m904q(ViewGroup.class, "addView", new Object[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class, new C0684p0(3)});     // Catch: Throwable -> L247
        FoldBannerPinHook.m1765l("hooked ViewGroup.addView for lt5");     // Catch: Throwable -> L247
        Object r035 = r15;
    L249:
        Throwable r036 = AbstractC0141g.m465a(r035);
        if (r036 == null) goto L252;
        FoldBannerPinHook.m1765l("addView: " + r036.getMessage());
    L247:
        th = move-exception;
        r035 = AbstractC0040p.m116u(th);
    L232:
        th = move-exception;
        r033 = AbstractC0040p.m116u(th);
    L194:
        th = move-exception;
        r030 = AbstractC0040p.m116u(th);
    L179:
        th = move-exception;
        r026 = AbstractC0040p.m116u(th);
    L172:
        th = move-exception;
        r023 = AbstractC0040p.m116u(th);
    L165:
        th = move-exception;
        r021 = AbstractC0040p.m116u(th);
    L158:
        th = move-exception;
        r019 = AbstractC0040p.m116u(th);
    L151:
        th = move-exception;
        r017 = AbstractC0040p.m116u(th);
    L252:
        return r15;
    L253:
        Context r5 = this.f2949b;
        ClassLoader r68 = this.f2950c;
        AbstractC0307g.m703e(r5, "$ctx");
        AbstractC0307g.m703e(r68, "$cl");
        C0693s0 r037 = C0693s0.f2187a;
        boolean r038 = C0693s0.f2189c.compareAndSet(false, true);
        C0146l r12 = C0146l.f339a;
        if (r038 == true) goto L366;
    L345:
        return r12;
    L366:
        ConfigStore r039 = ConfigStore.f2048a;     // Catch: Throwable -> L258
        Object r040 = Boolean.valueOf(ConfigStore.m1661c("hide_home_divider", false));     // Catch: Throwable -> L258
    L260:
        Boolean r142 = Boolean.FALSE;
        boolean r152 = r040 instanceof C0140f;
        Object r041 = r040;
        if (r152 == false) goto L263;
        r041 = r142;
    L263:
        C0693s0.f2192f = ((Boolean) r041).booleanValue();
        Field r042 = AbstractC0358S.m906r(r68, "com.tencent.mm.R$id").getDeclaredField("dz8");     // Catch: Throwable -> L266
        r042.setAccessible(true);     // Catch: Throwable -> L266
        Object r043 = Integer.valueOf(r042.getInt(null));     // Catch: Throwable -> L266
    L268:
        boolean r143 = r043 instanceof C0140f;
        Object r044 = r043;
        if (r143 == false) goto L271;
        r044 = 0;
    L271:
        int r045 = ((Number) r044).intValue();
        Integer r144 = Integer.valueOf(r045);
        if (r045 != 0) goto L275;
        r144 = null;
    L275:
        if (r144 == null) goto L356;
        int r046 = r144.intValue();
    L286:
        C0693s0.f2191e = r046;
        Class r95 = AbstractC0358S.m906r(r68, "com.tencent.mm.ui.conversation.MainUI");     // Catch: Throwable -> L308
        Object r047 = AbstractC0358S.m906r(r68, "com.tencent.mm.ui.conversation.ConversationListView");     // Catch: Throwable -> L290
    L293:
        boolean r411 = r047 instanceof C0140f;     // Catch: Throwable -> L308
        Object r048 = r047;
        if (r411 == false) goto L296;
        r048 = null;
    L296:
        Class r049 = (Class) r048;     // Catch: Throwable -> L308
        ?? r412 = r95.getDeclaredFields();     // Catch: Throwable -> L308
        AbstractC0307g.m702d(r412, "getDeclaredFields(...)");     // Catch: Throwable -> L308
        int r112 = r412.length;     // Catch: Throwable -> L308
        int r145 = 0;
    L297:
        if (r145 >= r112) goto L310;
        ?? r153 = r412[r145];     // Catch: Throwable -> L308
        if (r049 != null) goto L368;
        int r132 = 1;
    L307:
        r145 = r145 + r132;
        goto L297
    L368:
        r132 = 1;
        if (r049.isAssignableFrom(r153.getType()) != true) goto L307;
    L311:
        if (r153 != 0) goto L323;
        Field[] r050 = r95.getDeclaredFields();     // Catch: Throwable -> L308
        AbstractC0307g.m702d(r050, "getDeclaredFields(...)");     // Catch: Throwable -> L308
        int r413 = r050.length;     // Catch: Throwable -> L308
        int r133 = 0;
    L313:
        if (r133 >= r413) goto L321;
        Field r52 = r050[r133];     // Catch: Throwable -> L308
        if (ListView.class.isAssignableFrom(r52.getType()) == true) goto L320;
        if (AbsListView.class.isAssignableFrom(r52.getType()) == true) goto L320;
        r133 = r133 + 1;
    L320:
        r153 = r52;
        goto L323
    L321:
        r153 = 0;
    L323:
        boolean r051 = r153 instanceof C0140f;
        ?? r154 = r153;
        if (r051 == false) goto L326;
        r154 = 0;
    L326:
        Field r155 = (Field) r154;
        if (r155 == null) goto L329;
        r155.setAccessible(true);
        Field r74 = r155;
    L330:
        C0693s0.f2188b = r74;
        boolean r052 = C0693s0.f2192f;
        String r313 = Integer.toHexString(C0693s0.f2191e);
        Field r414 = C0693s0.f2188b;
        if (r414 == null) goto L334;
        String r415 = r414.getName();
        if (r415 == null) goto L334;
    L335:
        C0693s0.m1790c("install enabled=" + r052 + " dz8=0x" + r313 + " listField=" + r415);
        if (C0693s0.f2192f == false) goto L345;
        AbstractC0358S.m904q(AbstractC0358S.m906r(r68, "com.tencent.mm.ui.conversation.MainUI"), "onResume", new Object[]{new MessageActionDispatcher(3)});     // Catch: Throwable -> L340
        C0693s0.m1790c("hooked com.tencent.mm.ui.conversation.MainUI.onResume only");     // Catch: Throwable -> L340
        Object r053 = r12;
    L342:
        Throwable r054 = AbstractC0141g.m465a(r053);
        if (r054 == null) goto L345;
        C0693s0 r213 = C0693s0.f2187a;
        C0693s0.m1790c("MainUI.onResume hook failed: " + r054.getMessage());
    L340:
        th = move-exception;
        r053 = AbstractC0040p.m116u(th);
    L334:
        r415 = "none";
        goto L335
    L329:
        r74 = null;
    L304:
        th = th;
    L322:
        r153 = AbstractC0040p.m116u(th);
        goto L323
    L310:
        r153 = 0;
        goto L311
    L290:
        th = move-exception;
        r047 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L308
    L308:
        th = th;
        goto L322
    L356:
        Object r055 = Integer.valueOf(r5.getResources().getIdentifier("dz8", "id", ModernHookEntry.WECHAT_PACKAGE));     // Catch: Throwable -> L279
    L281:
        Object r113 = 0;
        if ((r055 instanceof C0140f) == true) goto L285;
        r113 = r055;
    L285:
        r046 = ((Number) r113).intValue();
    L279:
        th = move-exception;
        r055 = AbstractC0040p.m116u(th);
    L266:
        th = move-exception;
        r043 = AbstractC0040p.m116u(th);
    L258:
        th = move-exception;
        r040 = AbstractC0040p.m116u(th);
        goto L260
    L39:
        return m2113h();
    L41:
        return m2112g();
    L49:
        return m2111f();
    L51:
        return m2110e();
    L53:
        return m2109d();
    L55:
        return m2108c();
    L57:
        return m2107a();
    }

    public /* synthetic */ FeatureInstallTask(Context r1, ClassLoader r2, String r3, int r4) {
        this.f2948a = r4;
        this.f2949b = r1;
        this.f2950c = r2;
    }

    public /* synthetic */ FeatureInstallTask(ClassLoader r2, Context r3) {
        this.f2948a = 10;
        this.f2950c = r2;
        this.f2949b = r3;
    }
}
