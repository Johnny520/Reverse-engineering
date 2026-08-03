package com.abc.core.hooks;

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
import p050c0.C0661h1;
import p050c0.C0681o0;

/* JADX INFO: loaded from: classes.dex */
public final class ModuleLog {
    public static final ModuleLog INSTANCE = new ModuleLog();

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f2250a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2251b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f2252c = ThreadLocal.withInitial(new C0681o0(2));

    /* JADX INFO: renamed from: a */
    public static void m1810a(String str, String str2) {
        CharSequence charSequenceSubSequence;
        if (!f2251b.get() && !AbstractC0425j.m1005J0(str2, "日志记录", false)) {
            return;
        }
        Object obj = f2252c.get();
        AbstractC0307g.m700b(obj);
        String str3 = ((SimpleDateFormat) obj).format(new Date());
        if (1 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(1);
            sb.append((CharSequence) str);
            int length = 1 - str.length();
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            charSequenceSubSequence = sb;
        }
        String str4 = charSequenceSubSequence.toString() + "  " + str3 + "  " + str2;
        CopyOnWriteArrayList copyOnWriteArrayList = f2250a;
        copyOnWriteArrayList.add(0, str4);
        while (copyOnWriteArrayList.size() > 400) {
            copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
        }
        try {
            AbstractC0762d.m1954d("[OKK-Log] " + str2);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
        try {
            File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "module_runtime.log");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            String str5 = str4 + "\n";
            Charset charset = AbstractC0416a.f921a;
            AbstractC0307g.m703e(str5, "text");
            AbstractC0307g.m703e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                AbstractC0270k.m695l0(fileOutputStream, str5, charset);
                AbstractC0040p.m108m(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
    }

    public static /* synthetic */ List snapshot$default(ModuleLog moduleLog, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 200;
        }
        return moduleLog.snapshot(i2);
    }

    public static /* synthetic */ String text$default(ModuleLog moduleLog, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 200;
        }
        return moduleLog.text(i2);
    }

    public final void bootstrap() {
        loadEnabledFromConfig();
        m1813i("OKK 日志区已就绪 · 记录=".concat(f2251b.get() ? "开" : "关"));
    }

    public final void clear() {
        f2250a.clear();
        try {
            AbstractC0270k.m693j0(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "module_runtime.log"), "", AbstractC0416a.f921a);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
        m1813i("日志已清空");
    }

    /* JADX INFO: renamed from: d */
    public final void m1811d(String str) {
        AbstractC0307g.m703e(str, "msg");
        m1810a("D", str);
    }

    /* JADX INFO: renamed from: e */
    public final void m1812e(String str) {
        AbstractC0307g.m703e(str, "msg");
        m1810a("E", str);
    }

    /* JADX INFO: renamed from: i */
    public final void m1813i(String str) {
        AbstractC0307g.m703e(str, "msg");
        m1810a("I", str);
    }

    public final boolean isEnabled() {
        return f2251b.get();
    }

    public final void loadEnabledFromConfig() {
        AtomicBoolean atomicBoolean = f2251b;
        C0661h1 c0661h1 = C0661h1.f2048a;
        atomicBoolean.set(C0661h1.m1661c("module_log_enabled", false));
    }

    public final void setEnabled(boolean z2) {
        f2251b.set(z2);
        m1813i("日志记录已".concat(z2 ? "开启" : "关闭"));
        C0661h1.f2048a.m1667g("module_log_enabled", z2, true);
    }

    public final List<String> snapshot(int i2) {
        CopyOnWriteArrayList copyOnWriteArrayList = f2250a;
        if (i2 < 1) {
            i2 = 1;
        }
        return AbstractC0181l.m549u0(i2, copyOnWriteArrayList);
    }

    public final String text(int i2) {
        Object objM116u;
        Object obj = C0190u.f401a;
        List<String> listSnapshot = snapshot(i2);
        if (!listSnapshot.isEmpty()) {
            return AbstractC0181l.m546r0(listSnapshot, "\n", null, null, null, 62);
        }
        try {
            File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "module_runtime.log");
            objM116u = !file.isFile() ? obj : new C0195z(AbstractC0181l.m550v0(AbstractC0270k.m691h0(file, AbstractC0416a.f921a), i2));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (!(objM116u instanceof C0140f)) {
            obj = objM116u;
        }
        List list = (List) obj;
        return list.isEmpty() ? "（暂无日志，打开开关后模块运行会写入）" : AbstractC0181l.m546r0(list, "\n", null, null, null, 62);
    }

    /* JADX INFO: renamed from: w */
    public final void m1814w(String str) {
        AbstractC0307g.m703e(str, "msg");
        m1810a("W", str);
    }
}
