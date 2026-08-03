package com.abc.core.hooks;

import com.abc.core.features.C0681o0;
import com.abc.core.features.ConfigStore;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.C0190u;
import p009E0.C0195z;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;

/* JADX INFO: loaded from: classes.dex */
public final class ModuleLog {
    public static final ModuleLog INSTANCE = null;

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f2250a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2251b = null;

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f2252c = null;

    static {
        INSTANCE = new ModuleLog();
        f2250a = new CopyOnWriteArrayList();
        f2251b = new AtomicBoolean(true);
        f2252c = ThreadLocal.withInitial(new C0681o0(2));
    }

    /* JADX INFO: renamed from: a */
    public static void m1810a(String r6, String r7) {
        if (f2251b.get() == false) goto L5;
    L7:
        Object r02 = f2252c.get();
        AbstractC0307g.m700b(r02);
        String r03 = ((SimpleDateFormat) r02).format(new Date());
        if (1 > r6.length()) goto L10;
        CharSequence r62 = r6.subSequence(0, r6.length());
    L17:
        String r63 = r62.toString() + "  " + r03 + "  " + r7;
        CopyOnWriteArrayList r04 = f2250a;
        r04.add(0, r63);
    L19:
        if (r04.size() <= 400) goto L45;
        r04.remove(r04.size() - 1);
        goto L19
    L45:
        AbstractC0762d.m1954d("[OKK-Log] " + r7);     // Catch: Throwable -> L23
    L44:
        File r72 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "module_runtime.log");     // Catch: Throwable -> L28
        File r05 = r72.getParentFile();     // Catch: Throwable -> L28
        if (r05 == null) goto L30;
        r05.mkdirs();     // Catch: Throwable -> L28
    L30:
        String r64 = r63 + "\n";     // Catch: Throwable -> L28
        Charset r06 = AbstractC0416a.f921a;     // Catch: Throwable -> L28
        AbstractC0307g.m703e(r64, "text");     // Catch: Throwable -> L28
        AbstractC0307g.m703e(r06, "charset");     // Catch: Throwable -> L28
        FileOutputStream r1 = new FileOutputStream(r72, true);     // Catch: Throwable -> L28
        AbstractC0270k.m695l0(r1, r64, r06);     // Catch: Throwable -> L35
    L33:
        AbstractC0040p.m108m(r1, null);     // Catch: Throwable -> L28
        return;
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        AbstractC0040p.m108m(r1, th);     // Catch: Throwable -> L28
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L23:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L44
    L10:
        StringBuilder r2 = new StringBuilder(1);
        r2.append(r6);
        int r65 = 1 - r6.length();
        if (1 > r65) goto L16;
        int r4 = 1;
    L13:
        r2.append(' ');
        if (r4 == r65) goto L16;
        r4 = r4 + 1;
    L16:
        r62 = r2;
        goto L17
    L5:
        if (AbstractC0425j.m1005J0(r7, "日志记录", false) == true) goto L7;
    }

    public static /* synthetic */ List snapshot$default(ModuleLog r02, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 200;
    L6:
        return r02.snapshot(r1);
    }

    public static /* synthetic */ String text$default(ModuleLog r02, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 200;
    L6:
        return r02.text(r1);
    }

    public final void bootstrap() {
        loadEnabledFromConfig();
        if (f2251b.get() == false) goto L5;
        String r02 = "开";
    L6:
        m1813i("OKK 日志区已就绪 · 记录=".concat(r02));
        return;
    L5:
        r02 = "关";
        goto L6
    }

    public final void clear() {
        f2250a.clear();
        AbstractC0270k.m694k0(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "module_runtime.log"), "");     // Catch: Throwable -> L5
    L7:
        m1813i("日志已清空");
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public final void m1811d(String r2) {
        AbstractC0307g.m703e(r2, "msg");
        m1810a("D", r2);
    }

    /* JADX INFO: renamed from: e */
    public final void m1812e(String r2) {
        AbstractC0307g.m703e(r2, "msg");
        m1810a("E", r2);
    }

    /* JADX INFO: renamed from: i */
    public final void m1813i(String r2) {
        AbstractC0307g.m703e(r2, "msg");
        m1810a("I", r2);
    }

    public final boolean isEnabled() {
        return f2251b.get();
    }

    public final void loadEnabledFromConfig() {
        AtomicBoolean r02 = f2251b;
        ConfigStore r1 = ConfigStore.f2048a;
        r02.set(ConfigStore.m1661c("module_log_enabled", false));
    }

    public final void setEnabled(boolean r4) {
        f2251b.set(r4);
        if (r4 == false) goto L5;
        String r02 = "开启";
    L6:
        m1813i("日志记录已".concat(r02));
        ConfigStore.f2048a.m1667g("module_log_enabled", r4, true);
        return;
    L5:
        r02 = "关闭";
        goto L6
    }

    public final List<String> snapshot(int r3) {
        CopyOnWriteArrayList r02 = f2250a;
        if (r3 >= 1) goto L6;
        r3 = 1;
    L6:
        return AbstractC0181l.m549u0(r3, r02);
    }

    public final String text(int r8) {
        Object r02 = C0190u.f401a;
        List<String> r1 = snapshot(r8);
        if (r1.isEmpty() == false) goto L22;
        File r12 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "module_runtime.log");     // Catch: Throwable -> L9
        if (r12.isFile() == true) goto L7;
        Object r13 = r02;
    L12:
        if ((r13 instanceof C0140f) == true) goto L15;
        r02 = r13;
    L15:
        List r14 = (List) r02;
        if (r14.isEmpty() == false) goto L20;
        return "（暂无日志，打开开关后模块运行会写入）";
    L20:
        return AbstractC0181l.m546r0(r14, "\n", null, null, null, 62);
    L7:
        r13 = new C0195z(AbstractC0181l.m550v0(AbstractC0270k.m691h0(r12, AbstractC0416a.f921a), r8));     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L12
    L22:
        return AbstractC0181l.m546r0(r1, "\n", null, null, null, 62);
    }

    /* JADX INFO: renamed from: w */
    public final void m1814w(String r2) {
        AbstractC0307g.m703e(r2, "msg");
        m1810a("W", r2);
    }
}
