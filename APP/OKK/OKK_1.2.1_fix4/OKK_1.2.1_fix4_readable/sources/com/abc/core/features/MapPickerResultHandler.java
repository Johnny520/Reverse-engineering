package com.abc.core.features;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class MapPickerResultHandler extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0617P1 f1895c;

    public MapPickerResultHandler(int i2) {
        this.f1894b = i2;
        switch (i2) {
            case 1:
                this.f1895c = C0617P1.f1903a;
                break;
            default:
                this.f1895c = C0617P1.f1903a;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0148 A[PHI: r0
  0x0148: PHI (r0v47 D0.e) = (r0v34 D0.e), (r0v43 D0.e), (r0v48 D0.e) binds: [B:111:0x0194, B:137:0x0148, B:82:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1385a(C0760b c0760b) {
        String dataString;
        C0139e c0139eM1514b;
        Set<String> setKeySet;
        Object objM116u;
        Object objM116u2;
        Long lM1027B0;
        C0617P1 c0617p1 = this.f1895c;
        C0139e c0139e = null;
        String str = null;
        c0139e = null;
        c0139e = null;
        switch (this.f1894b) {
            case 0:
                Object obj = c0760b.f2669b;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null && AbstractC0307g.m699a(activity.getPackageName(), ModernHookEntry.WECHAT_PACKAGE)) {
                    Object obj2 = c0760b.f2670c[0];
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Object obj3 = c0760b.f2670c[1];
                        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            Object obj4 = c0760b.f2670c[2];
                            Intent intent = obj4 instanceof Intent ? (Intent) obj4 : null;
                            if (iIntValue == 44039) {
                                C0617P1.f1905c.set(false);
                                if (iIntValue2 != -1) {
                                    VirtualLocationHook virtualLocationHook = VirtualLocationHook.f1854a;
                                    VirtualLocationHook.m1487a();
                                    c0617p1.getClass();
                                    C0617P1.m1515c("map pick canceled");
                                } else {
                                    c0617p1.getClass();
                                    if (intent != null) {
                                        Parcelable parcelableExtra = intent.getParcelableExtra("KLocationIntent");
                                        if (parcelableExtra == null || (c0139eM1514b = C0617P1.m1513a(parcelableExtra)) == null) {
                                            Bundle extras = intent.getExtras();
                                            C0617P1 c0617p12 = C0617P1.f1903a;
                                            if (extras == null || (setKeySet = extras.keySet()) == null) {
                                                dataString = intent.getDataString();
                                                if (dataString != null && (c0139eM1514b = C0617P1.m1514b(dataString)) != null) {
                                                    c0139e = c0139eM1514b;
                                                }
                                            } else {
                                                for (String str2 : setKeySet) {
                                                    try {
                                                        Bundle extras2 = intent.getExtras();
                                                        objM116u = extras2 != null ? extras2.get(str2) : null;
                                                    } catch (Throwable th) {
                                                        objM116u = AbstractC0040p.m116u(th);
                                                    }
                                                    if (objM116u instanceof C0140f) {
                                                        objM116u = null;
                                                    }
                                                    if (objM116u != null && (c0139eM1514b = C0617P1.m1513a(objM116u)) != null) {
                                                        c0139e = c0139eM1514b;
                                                    }
                                                }
                                                dataString = intent.getDataString();
                                                if (dataString != null) {
                                                    c0139e = c0139eM1514b;
                                                }
                                            }
                                        }
                                    }
                                    if (c0139e == null) {
                                        VirtualLocationHook virtualLocationHook2 = VirtualLocationHook.f1854a;
                                        VirtualLocationHook.m1487a();
                                        Toast.makeText(activity, "OKK：解析地图结果失败", 0).show();
                                        C0617P1.m1515c("parse result failed data=" + intent);
                                    } else {
                                        double dDoubleValue = ((Number) c0139e.f328a).doubleValue();
                                        double dDoubleValue2 = ((Number) c0139e.f329b).doubleValue();
                                        VirtualLocationHook virtualLocationHook3 = VirtualLocationHook.f1854a;
                                        File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_result");
                                        try {
                                            File parentFile = file.getParentFile();
                                            if (parentFile != null) {
                                                parentFile.mkdirs();
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            Locale locale = Locale.US;
                                            sb.append("lat=".concat(String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1))));
                                            sb.append('\n');
                                            sb.append("lon=".concat(String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2)}, 1))));
                                            sb.append('\n');
                                            sb.append("ts=" + System.currentTimeMillis());
                                            sb.append('\n');
                                            String string = sb.toString();
                                            AbstractC0307g.m702d(string, "toString(...)");
                                            AbstractC0270k.m693j0(file, string, AbstractC0416a.f921a);
                                        } catch (Throwable th2) {
                                            AbstractC0040p.m116u(th2);
                                        }
                                        VirtualLocationHook.m1487a();
                                        VirtualLocationHook.m1494i(true, dDoubleValue, dDoubleValue2, null, false);
                                        Toast.makeText(activity, String.format("OKK：已选点 %.5f, %.5f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2)}, 2)), 1).show();
                                        C0617P1.m1515c("map pick ok lat=" + dDoubleValue + " lon=" + dDoubleValue2);
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                Object obj5 = c0760b.f2669b;
                Activity activity2 = obj5 instanceof Activity ? (Activity) obj5 : null;
                if (activity2 != null && AbstractC0307g.m699a(activity2.getPackageName(), ModernHookEntry.WECHAT_PACKAGE) && !AbstractC0425j.m1005J0(activity2.getClass().getName(), "RedirectUI", false)) {
                    c0617p1.getClass();
                    VirtualLocationHook virtualLocationHook4 = VirtualLocationHook.f1854a;
                    File file2 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_request");
                    if (file2.isFile()) {
                        try {
                            objM116u2 = AbstractC0270k.m692i0(file2, AbstractC0416a.f921a);
                        } catch (Throwable th3) {
                            objM116u2 = AbstractC0040p.m116u(th3);
                        }
                        boolean z2 = objM116u2 instanceof C0140f;
                        Object obj6 = objM116u2;
                        if (z2) {
                            obj6 = null;
                        }
                        String str3 = (String) obj6;
                        if (str3 != null) {
                            Iterator it = AbstractC0425j.m1014S0(str3).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str4 = (String) it.next();
                                    AbstractC0307g.m703e(str4, "it");
                                    String string2 = AbstractC0425j.m1022a1(str4).toString();
                                    if (AbstractC0433r.m1033H0(string2, "ts=", false)) {
                                        str = string2;
                                    }
                                }
                            }
                            if (System.currentTimeMillis() - ((str == null || (lM1027B0 = AbstractC0432q.m1027B0(AbstractC0425j.m1016U0(str, "ts="))) == null) ? file2.lastModified() : lM1027B0.longValue()) <= 120000 && C0617P1.f1905c.compareAndSet(false, true)) {
                                C0617P1.f1906d.post(new RunnableC0701v(activity2, 8));
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
