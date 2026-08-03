package com.abc.core.features;

import android.os.Handler;
import android.os.Looper;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0181l;
import p009E0.C0177h;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: c0.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617P1 {

    /* JADX INFO: renamed from: a */
    public static final C0617P1 f1903a = new C0617P1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1904b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1905c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final Handler f1906d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public static final Pattern f1907e = Pattern.compile("lat\\s*([-+]?\\d*\\.?\\d+)\\s*;\\s*lng\\s*([-+]?\\d*\\.?\\d+)\\s*;", 2);

    /* JADX INFO: renamed from: a */
    public static C0139e m1513a(Object obj) {
        ArrayList arrayList = new ArrayList(new C0177h(new String[]{obj.toString()}, true));
        Method[] methods = obj.getClass().getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0 && AbstractC0307g.m699a(method.getReturnType(), String.class) && !AbstractC0307g.m699a(method.getName(), "toString")) {
                arrayList2.add(method);
            }
        }
        Iterator it = AbstractC0181l.m549u0(16, arrayList2).iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Method method2 = (Method) it.next();
            try {
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(obj, null);
                String str2 = objInvoke instanceof String ? (String) objInvoke : null;
                if (str2 != null) {
                    int length = str2.length();
                    if (5 <= length && length < 501) {
                        str = str2;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0139e c0139eM1514b = m1514b((String) it2.next());
            if (c0139eM1514b != null) {
                return c0139eM1514b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0139e m1514b(String str) {
        AbstractC0307g.m703e(str, "text");
        Matcher matcher = f1907e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            Double dM1024y0 = strGroup != null ? AbstractC0431p.m1024y0(strGroup) : null;
            String strGroup2 = matcher.group(2);
            Double dM1024y02 = strGroup2 != null ? AbstractC0431p.m1024y0(strGroup2) : null;
            if (dM1024y0 != null && dM1024y02 != null) {
                double dDoubleValue = dM1024y0.doubleValue();
                if (dDoubleValue >= -90.0d && dDoubleValue <= 90.0d) {
                    double dDoubleValue2 = dM1024y02.doubleValue();
                    if (dDoubleValue2 >= -180.0d && dDoubleValue2 <= 180.0d) {
                        return new C0139e(dM1024y0, dM1024y02);
                    }
                }
            }
        }
        Matcher matcher2 = Pattern.compile("lat(?:itude)?[=:\\s]+([-+]?\\d+\\.?\\d*)", 2).matcher(str);
        Matcher matcher3 = Pattern.compile("(?:lng|lon|longitude)[=:\\s]+([-+]?\\d+\\.?\\d*)", 2).matcher(str);
        if (matcher2.find() && matcher3.find()) {
            String strGroup3 = matcher2.group(1);
            Double dM1024y03 = strGroup3 != null ? AbstractC0431p.m1024y0(strGroup3) : null;
            String strGroup4 = matcher3.group(1);
            Double dM1024y04 = strGroup4 != null ? AbstractC0431p.m1024y0(strGroup4) : null;
            if (dM1024y03 != null && dM1024y04 != null) {
                double dDoubleValue3 = dM1024y03.doubleValue();
                if (dDoubleValue3 >= -90.0d && dDoubleValue3 <= 90.0d) {
                    double dDoubleValue4 = dM1024y04.doubleValue();
                    if (dDoubleValue4 >= -180.0d && dDoubleValue4 <= 180.0d) {
                        return new C0139e(dM1024y03, dM1024y04);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m1515c(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-MapPick] " + str);
        } catch (Throwable unused) {
        }
    }
}
