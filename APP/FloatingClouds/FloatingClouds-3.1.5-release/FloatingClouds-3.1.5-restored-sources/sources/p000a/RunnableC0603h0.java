package p000a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C1092a;
import androidx.emoji2.text.C1094c;
import androidx.emoji2.text.C1095d;
import androidx.emoji2.text.C1096e;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.fragment.app.C1099a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
import p000a.C0475a5;
import p000a.C0513c5;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.h0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0603h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2231c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2232d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0603h0(C0582fh c0582fh, String str, IPlugin iPlugin, C0173J8 c0173j8) {
        this.f2229a = 4;
        this.f2230b = str;
        this.f2231c = iPlugin;
        this.f2232d = c0173j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01df A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170 A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181 A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193 A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a4 A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01da A[Catch: all -> 0x00d8, TryCatch #6 {all -> 0x00d8, blocks: (B:21:0x00a8, B:23:0x00ae, B:103:0x0202, B:26:0x00db, B:29:0x00e1, B:31:0x00e5, B:33:0x00ef, B:36:0x00f5, B:37:0x00fa, B:39:0x00ff, B:41:0x0103, B:43:0x010b, B:46:0x0111, B:54:0x0120, B:56:0x0126, B:69:0x015c, B:72:0x0161, B:77:0x0179, B:79:0x0181, B:80:0x0183, B:82:0x018d, B:85:0x0193, B:88:0x01a4, B:89:0x01aa, B:91:0x01ba, B:93:0x01c8, B:99:0x01da, B:101:0x01df, B:102:0x01e2, B:96:0x01d5, B:86:0x019a, B:75:0x0166, B:68:0x0158, B:76:0x0170, B:52:0x011c, B:58:0x012a, B:60:0x0148, B:65:0x0150), top: B:197:0x00a8, inners: #9 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean zM2167E;
        Object objM2206a;
        Throwable thM2189a;
        ArrayList arrayListM1462c;
        ArrayList arrayListM1459i;
        List list;
        int length;
        Method method;
        Object objM2206a2;
        Object objM2206a3;
        boolean z = false;
        int i = 0;
        int i2 = 2;
        int i3 = 1;
        switch (this.f2229a) {
            case 0:
                C0513c5 c0513c5 = (C0513c5) this.f2230b;
                ProgressDialog progressDialog = (ProgressDialog) this.f2231c;
                Activity activity = (Activity) this.f2232d;
                C0622i0 c0622i0 = new C0622i0(false ? 1 : 0, progressDialog);
                if (!C0513c5.f1864g) {
                    C0513c5.f1864g = true;
                    C0513c5.f1865h = null;
                    try {
                        c0622i0.mo146e(5, "初始化 DexKit...");
                        try {
                            try {
                                System.loadLibrary("dexkit");
                            } catch (Throwable unused) {
                                zM2167E = false;
                            }
                        } catch (Throwable unused2) {
                            System.loadLibrary("dexkit");
                        }
                        zM2167E = C0889w1.f3483k.m2167E(c0513c5.f1867b);
                        C0908x1.m2194b("DexKit: bridge=".concat(zM2167E ? "OK" : "NULL (fallback to cache)"));
                        boolean z2 = C0723n6.f2804a;
                        C0723n6.m1655c("__bridge__", zM2167E ? "OK" : "SKIP", "");
                        int i4 = 0;
                        for (C0513c5.a aVar : c0513c5.f1869d) {
                            c0622i0.mo146e(Integer.valueOf((i4 * 100) / c0513c5.f1870e), aVar.f1871a);
                            try {
                                JSONObject jSONObjectMo31a = aVar.f1874d.mo31a();
                                if (jSONObjectMo31a != null) {
                                    c0513c5.m1264a(aVar.f1872b, jSONObjectMo31a);
                                    boolean z3 = C0723n6.f2804a;
                                    String str = aVar.f1871a;
                                    Iterator<String> itKeys = jSONObjectMo31a.keys();
                                    int i5 = i3;
                                    C0631i9.m1481d(itKeys, "keys(...)");
                                    C0204L3 c0204l3 = new C0204L3(new C0220M1(i2, itKeys));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((CharSequence) "");
                                    Iterator it = c0204l3.iterator();
                                    int i6 = 0;
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        Iterator it2 = it;
                                        int i7 = i6 + 1;
                                        if (i7 > i5) {
                                            sb.append((CharSequence) ",");
                                        }
                                        C0726n9.m1662e(sb, next, null);
                                        i6 = i7;
                                        it = it2;
                                        i5 = 1;
                                    }
                                    sb.append((CharSequence) "");
                                    C0723n6.m1655c(str, "OK", "keys=" + sb.toString());
                                } else {
                                    boolean z4 = C0723n6.f2804a;
                                    C0723n6.m1655c(aVar.f1871a, zM2167E ? "FAIL" : "SKIP", "no result");
                                }
                            } catch (Exception e) {
                                C0908x1.m2197e("DexKit: " + aVar.f1871a + " scan error", e);
                                boolean z5 = C0723n6.f2804a;
                                String str2 = aVar.f1871a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "unknown";
                                }
                                C0723n6.m1655c(str2, "FAIL", message);
                            }
                            i4 += aVar.f1873c;
                            c0622i0.mo146e(Integer.valueOf((i4 * 100) / c0513c5.f1870e), aVar.f1871a + " 完成");
                            i2 = 2;
                            i3 = 1;
                        }
                        try {
                            c0513c5.f1868c.edit().putInt("last_version_code", c0513c5.f1866a.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode).putLong("scan_status", System.currentTimeMillis()).apply();
                            break;
                        } catch (Exception unused3) {
                        }
                        boolean z6 = C0723n6.f2804a;
                        C0723n6.f2817n = true;
                        C0723n6.f2819p = null;
                        C0513c5.f1864g = false;
                        z = true;
                    } catch (Exception e2) {
                        C0513c5.f1865h = C0944z.m2231k("扫描异常: ", e2.getMessage());
                        C0908x1.m2193a("DexKit: scanAll failed", e2);
                        boolean z7 = C0723n6.f2804a;
                        String message2 = e2.getMessage();
                        C0723n6.f2817n = false;
                        C0723n6.f2819p = message2;
                        C0513c5.f1864g = false;
                        z = false;
                    }
                    break;
                } else {
                    C0513c5.f1865h = "扫描已在运行中";
                }
                C0698m0.f2636b.post(new RunnableC0641j0(z, activity, C0513c5.f1865h, progressDialog));
                return;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f2230b;
                C0631i9.m1482e(viewGroup, "$container");
                C1099a.a aVar2 = (C1099a.a) this.f2232d;
                C0631i9.m1482e(aVar2, "this$0");
                viewGroup.endViewTransition((View) this.f2231c);
                aVar2.f4518c.f4535a.m2575c(aVar2);
                return;
            case 2:
                EmojiCompatInitializer.C1090b c1090b = (EmojiCompatInitializer.C1090b) this.f2230b;
                C1094c.h hVar = (C1094c.h) this.f2231c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f2232d;
                c1090b.getClass();
                try {
                    C1096e c1096eM2502a = C1092a.m2502a(c1090b.f4481a);
                    if (c1096eM2502a == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C1096e.b bVar = (C1096e.b) c1096eM2502a.f4497a;
                    synchronized (bVar.f4508d) {
                        bVar.f4510f = threadPoolExecutor;
                        break;
                    }
                    c1096eM2502a.f4497a.mo2501a(new C1095d(hVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hVar.mo2503a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                C0611h8 c0611h8 = (C0611h8) this.f2230b;
                Object obj = this.f2231c;
                Object obj2 = this.f2232d;
                try {
                } catch (Throwable th2) {
                    objM2206a = C0920xd.m2206a(th2);
                }
                if (c0611h8.m1463e(obj)) {
                    C0475a5.c cVar = c0611h8.f2260b;
                    Object objM1455d = C0611h8.m1455d(obj2, cVar != null ? cVar.f1759a : "");
                    List arrayList = C0198Kf.m549b(objM1455d) ? (List) objM1455d : null;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List list2 = arrayList;
                    C0475a5.c cVar2 = c0611h8.f2260b;
                    Object objM1455d2 = C0611h8.m1455d(obj2, cVar2 != null ? cVar2.f1760b : "");
                    List list3 = objM1455d2 instanceof List ? (List) objM1455d2 : null;
                    if (list3 == null) {
                        list3 = c0611h8.f2264f;
                        if (list3 != null || list3.isEmpty() || c0611h8.f2266h == null) {
                            arrayListM1462c = c0611h8.m1462c(new ArrayList(list2));
                        } else {
                            try {
                                Method method2 = c0611h8.f2266h;
                                C0631i9.m1479b(method2);
                                method2.setAccessible(true);
                                Method method3 = c0611h8.f2266h;
                                C0631i9.m1479b(method3);
                                Object objInvoke = method3.invoke(obj2, new ArrayList(list3));
                                List list4 = objInvoke instanceof List ? (List) objInvoke : null;
                                objM2206a2 = list4 != null ? new ArrayList(list4) : null;
                            } catch (Throwable th3) {
                                objM2206a2 = C0920xd.m2206a(th3);
                            }
                            boolean z8 = objM2206a2 instanceof C0901wd.a;
                            Object obj3 = objM2206a2;
                            if (z8) {
                                obj3 = null;
                            }
                            arrayListM1462c = (ArrayList) obj3;
                            if (arrayListM1462c == null) {
                                arrayListM1462c = c0611h8.m1462c(new ArrayList(list2));
                            }
                        }
                        arrayListM1459i = C0611h8.m1459i(obj);
                        C0475a5.c cVar3 = c0611h8.f2260b;
                        Object objM1455d3 = C0611h8.m1455d(obj2, cVar3 != null ? cVar3.f1759a : "");
                        list = !C0198Kf.m549b(objM1455d3) ? (List) objM1455d3 : null;
                        if (arrayListM1459i == null) {
                            arrayListM1459i.clear();
                            arrayListM1459i.addAll(arrayListM1462c);
                        } else {
                            C0611h8.m1460l(obj, new ArrayList(arrayListM1462c));
                        }
                        if (list != null) {
                            list.clear();
                            list.addAll(arrayListM1462c);
                        }
                        Method[] methods = obj.getClass().getMethods();
                        C0631i9.m1481d(methods, "getMethods(...)");
                        length = methods.length;
                        while (true) {
                            if (i >= length) {
                                method = methods[i];
                                if (C0631i9.m1478a(method.getName(), "notifyDataSetChanged")) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                    if (parameterTypes.length == 0) {
                                    }
                                }
                                i++;
                            } else {
                                method = null;
                            }
                        }
                        if (method != null) {
                            method.setAccessible(true);
                        }
                        if (method != null) {
                            method.invoke(obj, null);
                        }
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: refreshContactList -> e() re-run + notifyDataSetChanged (in-place), newSize=" + arrayListM1462c.size()}, 1));
                        break;
                    } else {
                        if (list3.isEmpty()) {
                            list3 = null;
                        }
                        if (list3 != null) {
                        }
                        if (list3 != null) {
                            arrayListM1462c = c0611h8.m1462c(new ArrayList(list2));
                            arrayListM1459i = C0611h8.m1459i(obj);
                            C0475a5.c cVar32 = c0611h8.f2260b;
                            Object objM1455d32 = C0611h8.m1455d(obj2, cVar32 != null ? cVar32.f1759a : "");
                            if (!C0198Kf.m549b(objM1455d32)) {
                            }
                            if (arrayListM1459i == null) {
                            }
                            if (list != null) {
                            }
                            Method[] methods2 = obj.getClass().getMethods();
                            C0631i9.m1481d(methods2, "getMethods(...)");
                            length = methods2.length;
                            while (true) {
                                if (i >= length) {
                                }
                                i++;
                            }
                            if (method != null) {
                            }
                            if (method != null) {
                            }
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: refreshContactList -> e() re-run + notifyDataSetChanged (in-place), newSize=" + arrayListM1462c.size()}, 1));
                        }
                    }
                    thM2189a = C0901wd.m2189a(objM2206a);
                    if (thM2189a == null) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: refreshContactList failed", thM2189a}, 2));
                        return;
                    }
                    return;
                }
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: refreshContactList BLOCKED in-handler, adapter=" + obj.getClass().getName() + " data not compatible"}, 1));
                c0611h8.f2262d = null;
                c0611h8.f2263e = null;
                objM2206a = C0413Wf.f1577a;
                thM2189a = C0901wd.m2189a(objM2206a);
                if (thM2189a == null) {
                }
                break;
            case 4:
                String str3 = (String) this.f2230b;
                IPlugin iPlugin = (IPlugin) this.f2231c;
                C0173J8 c0173j8 = (C0173J8) this.f2232d;
                try {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: async init -> " + str3 + " START"}, 1));
                    iPlugin.handleHook(c0173j8);
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: async init -> " + str3 + " DONE"}, 1));
                    objM2206a3 = C0413Wf.f1577a;
                    break;
                } catch (Throwable th4) {
                    objM2206a3 = C0920xd.m2206a(th4);
                }
                Throwable thM2189a2 = C0901wd.m2189a(objM2206a3);
                if (thM2189a2 != null) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2227g("WXMaskPlugin: async init -> ", str3, " FAIL"), thM2189a2}, 2));
                    return;
                }
                return;
            default:
                C0582fh c0582fh = (C0582fh) this.f2230b;
                C0173J8 c0173j82 = (C0173J8) this.f2231c;
                C0582fh.m1421b(c0173j82, (List) this.f2232d);
                try {
                    c0582fh.f2158c.handleHook(c0173j82);
                    break;
                } catch (Throwable th5) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> hideSearchListPluginPart FAIL", th5}, 2));
                }
                boolean z9 = C0723n6.f2804a;
                C0723n6.f2820q = true;
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0603h0(Object obj, Object obj2, Object obj3, int i) {
        this.f2229a = i;
        this.f2230b = obj;
        this.f2231c = obj2;
        this.f2232d = obj3;
    }
}
