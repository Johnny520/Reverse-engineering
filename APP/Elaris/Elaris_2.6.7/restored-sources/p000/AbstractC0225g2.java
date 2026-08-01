package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: g2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225g2 {

    /* JADX INFO: renamed from: a */
    public static final Set f291a = Collections.synchronizedSet(Collections.newSetFromMap(new HashMap()));

    /* JADX INFO: renamed from: b */
    public static final Set f292b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: c */
    public static final ExecutorService f293c = Executors.newFixedThreadPool(3, new ThreadFactoryC0339n1(0));

    /* JADX INFO: renamed from: d */
    public static final Handler f294d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public static final Map f295e = Collections.synchronizedMap(new C0542y1(24, 0.75f, true));

    /* JADX INFO: renamed from: f */
    public static volatile boolean f296f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f297g;

    /* JADX INFO: renamed from: h */
    public static volatile C0209f2 f298h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Bitmap m415a(int i, byte[] bArr) {
        if (bArr == null || bArr.length == 0 || i <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = 1;
        int iMax = Math.max(options.outWidth, options.outHeight);
        while (true) {
            int i2 = options2.inSampleSize * 2;
            if (iMax / i2 < i * 2) {
                break;
            }
            options2.inSampleSize = i2;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
        if (bitmapDecodeByteArray == null) {
            return null;
        }
        return ThumbnailUtils.extractThumbnail(bitmapDecodeByteArray, i, i, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0540y m416b(Activity activity, String str, String str2) {
        Dialog dialog = new Dialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m421g(activity, 20.0f), m421g(activity, 18.0f), m421g(activity, 20.0f), m421g(activity, 18.0f));
        linearLayout.setBackground(m428n(-1, m421g(activity, 16.0f), 0, 0));
        TextView textViewM431q = m431q(activity, str, 21, Color.rgb(23, 25, 30));
        textViewM431q.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(textViewM431q, new LinearLayout.LayoutParams(-1, -2));
        TextView textViewM431q2 = m431q(activity, str2, 14, Color.rgb(93, 99, 112));
        textViewM431q2.setLineSpacing(m421g(activity, 3.0f), 1.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m421g(activity, 8.0f);
        linearLayout.addView(textViewM431q2, layoutParams);
        dialog.setContentView(linearLayout);
        return new C0540y(dialog, linearLayout, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static LinearLayout.LayoutParams m417c(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, m421g(context, 42.0f));
        layoutParams.topMargin = m421g(context, 16.0f);
        return layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m418d(C0193e2 c0193e2, String str, String str2) {
        int i;
        int i2;
        int i3;
        boolean zEquals = str2.equals(c0193e2.f222i);
        Activity activity = c0193e2.f215b;
        if (zEquals) {
            i = 125;
            i2 = 232;
            i3 = 45;
        } else {
            i = 89;
            i2 = 100;
            i3 = 83;
        }
        TextView textViewM431q = m431q(activity, str, 13, Color.rgb(i3, i, i2));
        textViewM431q.setGravity(17);
        textViewM431q.setSingleLine(true);
        int i4 = 0;
        textViewM431q.setPadding(m421g(activity, 12.0f), 0, m421g(activity, 12.0f), 0);
        textViewM431q.setBackground(m428n(zEquals ? Color.rgb(236, 245, 255) : Color.rgb(245, 246, 249), m421g(activity, 9.0f), zEquals ? Color.rgb(184, 214, 250) : 0, zEquals ? m421g(activity, 1.0f) : 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, m421g(activity, 32.0f));
        layoutParams.rightMargin = m421g(activity, 7.0f);
        c0193e2.f219f.addView(textViewM431q, layoutParams);
        textViewM431q.setOnClickListener(new ViewOnClickListenerC0478u1(str2, c0193e2, i4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m419e(View view, int i) {
        if (view == null || i > 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            sb.append(contentDescription);
        }
        if (view instanceof TextView) {
            sb.append(' ');
            sb.append(((TextView) view).getText());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 12);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(' ');
                sb.append(m419e(viewGroup.getChildAt(i2), i + 1));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static TextView m420f(Context context, String str) {
        TextView textViewM431q = m431q(context, str, 14, Color.rgb(42, 116, 232));
        textViewM431q.setGravity(17);
        textViewM431q.setTypeface(Typeface.DEFAULT_BOLD);
        textViewM431q.setBackground(m428n(Color.rgb(241, 247, 255), m421g(context, 9.0f), Color.rgb(217, 229, 247), m421g(context, 1.0f)));
        return textViewM431q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m421g(Context context, float f) {
        return Math.max(1, Math.round(f * context.getResources().getDisplayMetrics().density));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static ArrayList m422h(Class cls) {
        ArrayList arrayList = new ArrayList();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Class<?>[] parameterTypes = declaredMethods[i].getParameterTypes();
            if (declaredMethods[i].getReturnType() == Void.TYPE && !Modifier.isAbstract(declaredMethods[i].getModifiers()) && parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && !parameterTypes[2].isPrimitive()) {
                arrayList.add(declaredMethods[i]);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static synchronized void m423i(ClassLoader classLoader) {
        if (classLoader == null) {
            return;
        }
        synchronized (AbstractC0225g2.class) {
            boolean z = true;
            char c = 1;
            if (!f297g) {
                f297g = AbstractC0174d.m337a(8279, new C0289k(c == true ? 1 : 0)) >= 0;
            }
            if (f296f) {
                return;
            }
            try {
                Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout", classLoader);
                if (clsFindClassIfExists == null) {
                    HookEntry.log("cloud sticker panel unavailable: shortcut bar missing");
                    return;
                }
                ArrayList arrayListM422h = m422h(clsFindClassIfExists);
                int i = 0;
                for (int i2 = 0; i2 < arrayListM422h.size(); i2++) {
                    Method method = (Method) arrayListM422h.get(i2);
                    String strM426l = m426l(method);
                    if (f291a.add(strM426l)) {
                        try {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0558z1(classLoader));
                            i++;
                        } catch (Throwable th) {
                            f291a.remove(strM426l);
                            AbstractC0198e7.m343a("cloud-sticker", "hook-shortcut-bind", th);
                        }
                    }
                }
                if (i <= 0) {
                    z = false;
                }
                f296f = z;
                if (f296f) {
                    HookEntry.logAlways("cloud sticker precise shortcut hook installed count=" + i);
                }
            } catch (Throwable th2) {
                AbstractC0198e7.m343a("cloud-sticker", "install", th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m424j(C0193e2 c0193e2, String str) {
        String strTrim;
        if (c0193e2.f214a.isShowing()) {
            if (str == null) {
                strTrim = "";
            } else {
                strTrim = str.trim();
                if (strTrim.length() > 40) {
                    strTrim = strTrim.substring(0, 40);
                }
            }
            c0193e2.f221h = strTrim;
            String str2 = c0193e2.f222i;
            int i = c0193e2.f223j + 1;
            c0193e2.f223j = i;
            c0193e2.f220g.setText("正在加载");
            c0193e2.f218e.removeAllViews();
            f293c.execute(new RunnableC0177d2(strTrim, str2, c0193e2, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m425k(Throwable th) {
        String message = th.getMessage();
        return (message == null || message.trim().length() == 0) ? "云端表情服务暂时不可用" : message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m426l(Method method) {
        StringBuilder sb = new StringBuilder(method.getDeclaringClass().getName());
        sb.append('#');
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append("):");
        sb.append(method.getReturnType().getName());
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m427m(C0193e2 c0193e2, String str) {
        f294d.post(new RunnableC0412q(c0193e2, str, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static GradientDrawable m428n(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        if (i4 > 0) {
            gradientDrawable.setStroke(i4, i3);
        }
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m429o(C0193e2 c0193e2, C0307l1 c0307l1) {
        String strConcat;
        String str = c0307l1.f508b;
        C0410pd c0410pd = c0193e2.f217d;
        TextView textView = c0193e2.f220g;
        if (c0410pd == null) {
            textView.setText("未识别当前会话，请返回聊天页重试");
            return;
        }
        if (str.isEmpty()) {
            strConcat = "正在发送表情";
        } else {
            Locale locale = Locale.CHINA;
            strConcat = "正在发送 ".concat(str);
        }
        textView.setText(strConcat);
        f293c.execute(new RunnableC0412q(c0193e2, c0307l1, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m430p(Dialog dialog, Activity activity) {
        dialog.show();
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = Math.min(m421g(activity, 390.0f), activity.getResources().getDisplayMetrics().widthPixels - m421g(activity, 32.0f));
        attributes.height = -2;
        attributes.gravity = 17;
        attributes.dimAmount = 0.42f;
        window.setAttributes(attributes);
        window.addFlags(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static TextView m431q(Context context, String str, int i, int i2) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(i);
        textView.setTextColor(i2);
        return textView;
    }
}
