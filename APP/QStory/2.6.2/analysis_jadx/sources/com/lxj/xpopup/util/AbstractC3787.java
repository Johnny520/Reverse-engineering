package com.lxj.xpopup.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.appcompat.app.C0076;
import com.lxj.xpopup.core.AbstractC3775;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.lxj.xpopup.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int f11829;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static int f11831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f11826 = {"huawei"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] f11825 = {"vivo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f11824 = {"xiaomi"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] f11823 = {"oppo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String[] f11822 = {"leeco", "letv"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final String[] f11821 = {"360", "qiku"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String[] f11839 = {"zte"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String[] f11838 = {"oneplus"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String[] f11842 = {"nubia"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String[] f11843 = {"coolpad", "yulong"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String[] f11840 = {"lg", "lge"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String[] f11841 = {"google"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String[] f11833 = {"samsung"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String[] f11832 = {"meizu"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String[] f11836 = {"lenovo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final String[] f11837 = {"smartisan"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String[] f11834 = {"htc"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String[] f11835 = {"sony"};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f11828 = {"gionee", "amigo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String[] f11827 = {"motorola"};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C0076 f11830 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m8115(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r0
  0x004d: PHI (r0v10 java.lang.String) = (r0v2 java.lang.String), (r0v4 java.lang.String), (r0v4 java.lang.String) binds: [B:23:0x004b, B:29:0x0071, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:40:0x00a5, B:42:0x00ad), top: B:53:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m8116(java.lang.String r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "getprop "
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 != 0) goto L97
            r1 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.Process r0 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            r0 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L38
            if (r0 == 0) goto L31
            r3.close()     // Catch: java.io.IOException -> L47
            goto L47
        L31:
            r3.close()     // Catch: java.io.IOException -> L46
            goto L46
        L35:
            r6 = move-exception
            r1 = r3
            goto L3b
        L38:
            r1 = r3
            goto L41
        L3a:
            r6 = move-exception
        L3b:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.io.IOException -> L40
        L40:
            throw r6
        L41:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L46
        L46:
            r0 = r2
        L47:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4f
        L4d:
            r2 = r0
            goto L97
        L4f:
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Exception -> L6c
            r0.<init>()     // Catch: java.lang.Exception -> L6c
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L6c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L6c
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Exception -> L6c
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L6c
            r1.<init>(r3)     // Catch: java.lang.Exception -> L6c
            r0.load(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = r0.getProperty(r6, r2)     // Catch: java.lang.Exception -> L6c
            goto L6d
        L6c:
            r0 = r2
        L6d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L74
            goto L4d
        L74:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 >= r3) goto L4d
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = "get"
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}     // Catch: java.lang.Exception -> L97
            java.lang.reflect.Method r0 = r1.getMethod(r3, r0)     // Catch: java.lang.Exception -> L97
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r2}     // Catch: java.lang.Exception -> L97
            java.lang.Object r6 = r0.invoke(r1, r6)     // Catch: java.lang.Exception -> L97
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L97
            r2 = r6
        L97:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r0 = "unknown"
            if (r6 != 0) goto La5
            boolean r6 = r2.equals(r0)
            if (r6 == 0) goto Lb1
        La5:
            java.lang.String r6 = android.os.Build.DISPLAY     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb1
            if (r1 != 0) goto Lb1
            java.lang.String r2 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto Lb8
            return r0
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.util.AbstractC3787.m8116(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m8117(Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (iAbs > (identifier != 0 ? system.getDimensionPixelSize(identifier) : 0)) {
            return iAbs - f11831;
        }
        f11831 = iAbs;
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8118(ArrayList arrayList, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof EditText) && childAt.getVisibility() == 0) {
                arrayList.add((EditText) childAt);
            } else if (childAt instanceof ViewGroup) {
                m8118(arrayList, (ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m8119(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m8120(AbstractC3775 abstractC3775) {
        for (Context context = abstractC3775.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m8121(float f, float f2, Rect rect) {
        return f >= ((float) rect.left) && f <= ((float) rect.right) && f2 >= ((float) rect.top) && f2 <= ((float) rect.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m8122(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m8123(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m8124(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
