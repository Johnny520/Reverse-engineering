package p000a;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.Callable;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.eh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0563eh implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IPlugin f2106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0173J8 f2107c;

    public /* synthetic */ CallableC0563eh(IPlugin iPlugin, C0173J8 c0173j8, int i) {
        this.f2105a = i;
        this.f2106b = iPlugin;
        this.f2107c = c0173j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objM2206a;
        Object objM2206a2;
        Object objM2206a3;
        Context context;
        Object objM2206a4;
        Object objM2206a5;
        Object objM2206a6;
        Object objM2206a7;
        switch (this.f2105a) {
            case 0:
                C0582fh c0582fh = (C0582fh) this.f2106b;
                C0173J8 c0173j8 = this.f2107c;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart START (separate thread)"}, 1));
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    c0582fh.f2165j.handleHook(c0173j8);
                    objM2206a = C0413Wf.f1577a;
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                if (!(objM2206a instanceof C0901wd.a)) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart DONE (" + jCurrentTimeMillis2 + "ms)"}, 1));
                    C0723n6.m1656d("ignoreVoipCallPluginPart", "OK", jCurrentTimeMillis2, null);
                }
                Throwable thM2189a = C0901wd.m2189a(objM2206a);
                if (thM2189a != null) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart FAIL (separate thread) (" + jCurrentTimeMillis3 + "ms)", thM2189a}, 2));
                    boolean z = C0723n6.f2804a;
                    C0723n6.m1656d("ignoreVoipCallPluginPart", "FAIL", jCurrentTimeMillis3, thM2189a.getMessage());
                }
                break;
            case 1:
                C0582fh c0582fh2 = (C0582fh) this.f2106b;
                C0173J8 c0173j82 = this.f2107c;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> muteNotificationPluginPart START (separate thread)"}, 1));
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                try {
                    c0582fh2.f2154E.handleHook(c0173j82);
                    objM2206a2 = C0413Wf.f1577a;
                } catch (Throwable th2) {
                    objM2206a2 = C0920xd.m2206a(th2);
                }
                if (!(objM2206a2 instanceof C0901wd.a)) {
                    long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis4;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> muteNotificationPluginPart DONE (" + jCurrentTimeMillis5 + "ms)"}, 1));
                    C0723n6.m1656d("muteNotificationPluginPart", "OK", jCurrentTimeMillis5, null);
                }
                Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
                if (thM2189a2 != null) {
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis4;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> muteNotificationPluginPart FAIL (" + jCurrentTimeMillis6 + "ms)", thM2189a2}, 2));
                    boolean z2 = C0723n6.f2804a;
                    C0723n6.m1656d("muteNotificationPluginPart", "FAIL", jCurrentTimeMillis6, thM2189a2.getMessage());
                }
                break;
            case 2:
                C0582fh c0582fh3 = (C0582fh) this.f2106b;
                C0173J8 c0173j83 = this.f2107c;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideStorageParts START (separate thread)"}, 1));
                long jCurrentTimeMillis7 = System.currentTimeMillis();
                try {
                    if (C0889w1.f3484l == null && (context = C0889w1.f3488p) != null && C0631i9.m1478a(c0173j83.f609b, "com.tencent.mm")) {
                        try {
                            objM2206a4 = context.getPackageManager().getApplicationInfo("com.tencent.mm", 0).sourceDir;
                        } catch (Throwable th3) {
                            objM2206a4 = C0920xd.m2206a(th3);
                        }
                        if (objM2206a4 instanceof C0901wd.a) {
                            objM2206a4 = null;
                        }
                        String str = (String) objM2206a4;
                        if (str != null) {
                            C0889w1.f3483k.m2167E(str);
                            C0637if.f2311a.getClass();
                            C0637if.m1489c();
                        }
                    }
                    c0582fh3.f2166k.handleHook(c0173j83);
                    c0582fh3.f2153D.handleHook(c0173j83);
                    objM2206a3 = C0413Wf.f1577a;
                } catch (Throwable th4) {
                    objM2206a3 = C0920xd.m2206a(th4);
                }
                if (!(objM2206a3 instanceof C0901wd.a)) {
                    long jCurrentTimeMillis8 = System.currentTimeMillis() - jCurrentTimeMillis7;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideStorageParts DONE (" + jCurrentTimeMillis8 + "ms)"}, 1));
                    C0723n6.m1656d("hideStorageParts", "OK", jCurrentTimeMillis8, null);
                }
                Throwable thM2189a3 = C0901wd.m2189a(objM2206a3);
                if (thM2189a3 != null) {
                    long jCurrentTimeMillis9 = System.currentTimeMillis() - jCurrentTimeMillis7;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideStorageParts FAIL (separate thread) (" + jCurrentTimeMillis9 + "ms)", thM2189a3}, 2));
                    boolean z3 = C0723n6.f2804a;
                    C0723n6.m1656d("hideStorageParts", "FAIL", jCurrentTimeMillis9, thM2189a3.getMessage());
                }
                break;
            case 3:
                C0582fh c0582fh4 = (C0582fh) this.f2106b;
                C0173J8 c0173j84 = this.f2107c;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> boldBottomTab START (separate thread)"}, 1));
                long jCurrentTimeMillis10 = System.currentTimeMillis();
                try {
                    c0582fh4.f2168m.handleHook(c0173j84);
                    objM2206a5 = C0413Wf.f1577a;
                } catch (Throwable th5) {
                    objM2206a5 = C0920xd.m2206a(th5);
                }
                if (!(objM2206a5 instanceof C0901wd.a)) {
                    long jCurrentTimeMillis11 = System.currentTimeMillis() - jCurrentTimeMillis10;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> boldBottomTab DONE (" + jCurrentTimeMillis11 + "ms)"}, 1));
                    C0723n6.m1656d("boldBottomTab", "OK", jCurrentTimeMillis11, null);
                }
                Throwable thM2189a4 = C0901wd.m2189a(objM2206a5);
                if (thM2189a4 != null) {
                    long jCurrentTimeMillis12 = System.currentTimeMillis() - jCurrentTimeMillis10;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> boldBottomTab FAIL (separate thread) (" + jCurrentTimeMillis12 + "ms)", thM2189a4}, 2));
                    boolean z4 = C0723n6.f2804a;
                    C0723n6.m1656d("boldBottomTab", "FAIL", jCurrentTimeMillis12, thM2189a4.getMessage());
                }
                break;
            case 4:
                C0582fh c0582fh5 = (C0582fh) this.f2106b;
                C0173J8 c0173j85 = this.f2107c;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> dotIndicator START (separate thread)"}, 1));
                long jCurrentTimeMillis13 = System.currentTimeMillis();
                try {
                    c0582fh5.f2169n.handleHook(c0173j85);
                    objM2206a6 = C0413Wf.f1577a;
                } catch (Throwable th6) {
                    objM2206a6 = C0920xd.m2206a(th6);
                }
                if (!(objM2206a6 instanceof C0901wd.a)) {
                    long jCurrentTimeMillis14 = System.currentTimeMillis() - jCurrentTimeMillis13;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> dotIndicator DONE (" + jCurrentTimeMillis14 + "ms)"}, 1));
                    C0723n6.m1656d("dotIndicator", "OK", jCurrentTimeMillis14, null);
                }
                Throwable thM2189a5 = C0901wd.m2189a(objM2206a6);
                if (thM2189a5 != null) {
                    long jCurrentTimeMillis15 = System.currentTimeMillis() - jCurrentTimeMillis13;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> dotIndicator FAIL (separate thread) (" + jCurrentTimeMillis15 + "ms)", thM2189a5}, 2));
                    boolean z5 = C0723n6.f2804a;
                    C0723n6.m1656d("dotIndicator", "FAIL", jCurrentTimeMillis15, thM2189a5.getMessage());
                }
                break;
            case 5:
                C0582fh c0582fh6 = (C0582fh) this.f2106b;
                C0173J8 c0173j86 = this.f2107c;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideRecentForwardPluginPart START (separate thread)"}, 1));
                long jCurrentTimeMillis16 = System.currentTimeMillis();
                try {
                    c0582fh6.f2171p.handleHook(c0173j86);
                    objM2206a7 = C0413Wf.f1577a;
                } catch (Throwable th7) {
                    objM2206a7 = C0920xd.m2206a(th7);
                }
                if (!(objM2206a7 instanceof C0901wd.a)) {
                    long jCurrentTimeMillis17 = System.currentTimeMillis() - jCurrentTimeMillis16;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideRecentForwardPluginPart DONE (" + jCurrentTimeMillis17 + "ms)"}, 1));
                    C0723n6.m1656d("hideRecentForwardPluginPart", "OK", jCurrentTimeMillis17, null);
                }
                Throwable thM2189a6 = C0901wd.m2189a(objM2206a7);
                if (thM2189a6 != null) {
                    long jCurrentTimeMillis18 = System.currentTimeMillis() - jCurrentTimeMillis16;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideRecentForwardPluginPart FAIL (separate thread) (" + jCurrentTimeMillis18 + "ms)", thM2189a6}, 2));
                    boolean z6 = C0723n6.f2804a;
                    C0723n6.m1656d("hideRecentForwardPluginPart", "FAIL", jCurrentTimeMillis18, thM2189a6.getMessage());
                }
                break;
            default:
                this.f2106b.handleHook(this.f2107c);
                break;
        }
        return C0413Wf.f1577a;
    }
}
