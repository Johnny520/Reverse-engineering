package p000a;

import android.util.Log;
import java.util.Arrays;
import top.mmjz.floatingclouds.XposedEntry;

/* JADX INFO: renamed from: a.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0908x1 {
    /* JADX INFO: renamed from: a */
    public static final void m2193a(Object... objArr) {
        C0631i9.m1482e(objArr, "args");
        m2195c(6, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: b */
    public static final void m2194b(Object... objArr) {
        C0631i9.m1482e(objArr, "args");
        m2195c(4, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: c */
    public static void m2195c(int i, Object... objArr) {
        String string;
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            if (obj instanceof Throwable) {
                sb.append(Log.getStackTraceString((Throwable) obj));
            } else {
                if (obj == null || (string = obj.toString()) == null) {
                    string = "null";
                }
                sb.append(string);
            }
        }
        String string2 = sb.toString();
        XposedEntry.INSTANCE.getClass();
        XposedEntry xposedEntry = XposedEntry.self;
        if (xposedEntry == null) {
            Log.println(i, "Floatingclouds", string2);
            return;
        }
        try {
            xposedEntry.log(i, "Floatingclouds", string2);
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable unused) {
            Log.println(i, "Floatingclouds", string2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2196d(int i, String str, Exception exc) {
        String str2;
        C0631i9.m1482e(str, "msg");
        XposedEntry.INSTANCE.getClass();
        XposedEntry xposedEntry = XposedEntry.self;
        if (xposedEntry == null) {
            if (exc == null) {
                Log.println(i, "Floatingclouds_Config", str);
                return;
            }
            Log.println(i, "Floatingclouds_Config", str + "\n" + Log.getStackTraceString(exc));
            return;
        }
        if (exc != null) {
            try {
                str2 = str + "\n" + Log.getStackTraceString(exc);
            } catch (Throwable unused) {
                if (exc == null) {
                    Log.println(i, "Floatingclouds_Config", str);
                    return;
                }
                Log.println(i, "Floatingclouds_Config", str + "\n" + Log.getStackTraceString(exc));
                return;
            }
        } else {
            str2 = str;
        }
        xposedEntry.log(i, "Floatingclouds_Config", str2);
        C0413Wf c0413Wf = C0413Wf.f1577a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m2197e(Object... objArr) {
        C0631i9.m1482e(objArr, "args");
        m2195c(5, Arrays.copyOf(objArr, objArr.length));
    }
}
