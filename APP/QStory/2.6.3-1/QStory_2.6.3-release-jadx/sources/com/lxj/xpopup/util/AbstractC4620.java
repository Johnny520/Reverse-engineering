package com.lxj.xpopup.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.appcompat.app.C0923;
import com.lxj.xpopup.core.AbstractC4608;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

/* JADX INFO: renamed from: com.lxj.xpopup.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int f12179;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static int f12181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f12176 = {"huawei"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] f12175 = {"vivo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f12174 = {"xiaomi"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] f12173 = {"oppo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String[] f12172 = {"leeco", "letv"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final String[] f12171 = {"360", "qiku"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String[] f12189 = {"zte"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String[] f12188 = {"oneplus"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String[] f12192 = {"nubia"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String[] f12193 = {"coolpad", "yulong"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String[] f12190 = {"lg", "lge"};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String[] f12191 = {"google"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String[] f12183 = {"samsung"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String[] f12182 = {"meizu"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String[] f12186 = {"lenovo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final String[] f12187 = {"smartisan"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String[] f12184 = {"htc"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String[] f12185 = {"sony"};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f12178 = {"gionee", "amigo"};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String[] f12177 = {"motorola"};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C0923 f12180 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m8661(Context context) {
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
    */
    public static String m8662(String str) throws Throwable {
        String str2;
        String property;
        BufferedReader bufferedReader;
        String lowerCase = "";
        if (!TextUtils.isEmpty(str)) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()), 1024);
                } catch (IOException unused) {
                }
                try {
                    property = bufferedReader.readLine();
                } catch (IOException unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    property = "";
                    if (TextUtils.isEmpty(property)) {
                    }
                    if (!TextUtils.isEmpty(lowerCase)) {
                        try {
                            str2 = Build.DISPLAY;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                    if (!TextUtils.isEmpty(lowerCase)) {
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
            if (property != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused6) {
                }
                if (TextUtils.isEmpty(property)) {
                    try {
                        Properties properties = new Properties();
                        properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
                        property = properties.getProperty(str, "");
                    } catch (Exception unused7) {
                        property = "";
                    }
                    if (TextUtils.isEmpty(property) && Build.VERSION.SDK_INT < 28) {
                        try {
                            Class<?> cls = Class.forName("android.os.SystemProperties");
                            lowerCase = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
                        } catch (Exception unused8) {
                        }
                    }
                } else {
                    lowerCase = property;
                }
            } else {
                bufferedReader.close();
                property = "";
                if (TextUtils.isEmpty(property)) {
                }
            }
        }
        if (!TextUtils.isEmpty(lowerCase) || lowerCase.equals("unknown")) {
            str2 = Build.DISPLAY;
            if (!TextUtils.isEmpty(str2)) {
                lowerCase = str2.toLowerCase();
            }
        }
        return !TextUtils.isEmpty(lowerCase) ? "unknown" : lowerCase;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m8663(Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (iAbs > (identifier != 0 ? system.getDimensionPixelSize(identifier) : 0)) {
            return iAbs - f12181;
        }
        f12181 = iAbs;
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8664(ArrayList arrayList, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof EditText) && childAt.getVisibility() == 0) {
                arrayList.add((EditText) childAt);
            } else if (childAt instanceof ViewGroup) {
                m8664(arrayList, (ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m8665(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Activity m8666(AbstractC4608 abstractC4608) {
        for (Context context = abstractC4608.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m8667(float f, float f2, Rect rect) {
        return f >= ((float) rect.left) && f <= ((float) rect.right) && f2 >= ((float) rect.top) && f2 <= ((float) rect.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m8668(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m8669(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m8670(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
