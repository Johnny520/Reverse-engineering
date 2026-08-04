package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0038;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import yyds.AbstractC0427;
import yyds.AbstractC0879;
import yyds.AbstractC1655;
import yyds.AbstractC2104;
import yyds.C0135;
import yyds.C0373;
import yyds.C0469;
import yyds.C0796;
import yyds.C0805;
import yyds.C1586;
import yyds.C1624;
import yyds.C2544;
import yyds.EnumC0637;
import yyds.EnumC1464;
import yyds.InterfaceC0251;
import yyds.InterfaceC0657;
import yyds.InterfaceC2345;
import yyds.RunnableC0057;
import yyds.RunnableC1304;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.ᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0041 implements InterfaceC2345 {

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static HashMap f391;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static CopyOnWriteArrayList f392;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static WeakReference f393;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static Thread f394;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static WeakReference f395;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final boolean f396;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f397;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0469 f398;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int[] f399;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public WeakReference f400;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final int f401;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public long f402;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f403;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final int[] f404;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC0251 f405;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f406;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f407;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Context f408;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final int f409;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public WeakReference f410;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final long f411;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0038 f412;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public WeakReference f413;

    public AbstractC0041() {
        WeakReference weakReference = AbstractC1655.f8450;
        this.f409 = 1;
        this.f412 = new C0038(this);
        this.f397 = true;
        new HashMap();
        this.f399 = new int[2];
        this.f402 = -1L;
        this.f411 = -1L;
        this.f404 = new int[4];
        this.f406 = true;
        this.f398 = AbstractC1655.f8451;
        this.f401 = AbstractC1655.f8453;
        this.f402 = -1L;
        this.f411 = -1L;
        this.f396 = true;
        this.f397 = AbstractC1655.f8448;
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static void m256(String str) {
        WeakReference weakReference = AbstractC1655.f8450;
        Log.i(">>>", str.toString());
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static FrameLayout m257(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static void m258(View view) {
        AbstractC0041 abstractC0041;
        if (view == null || (abstractC0041 = (AbstractC0041) view.getTag()) == null) {
            return;
        }
        int i = 0;
        if (abstractC0041.f407) {
            if (abstractC0041.m279() != null) {
                abstractC0041.m279().setVisibility(0);
                return;
            } else {
                m269(((AbstractC0041) view.getTag()).mo283().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                return;
            }
        }
        abstractC0041.f413 = new WeakReference(view);
        StringBuilder sb = new StringBuilder(abstractC0041.mo283());
        sb.append(".show on ");
        sb.append(abstractC0041.m280() ? abstractC0041.m282() : "window");
        m256(sb.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f392;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            f392 = copyOnWriteArrayList;
        }
        copyOnWriteArrayList.add(abstractC0041);
        int iM4012 = AbstractC2104.m4012(abstractC0041.f409);
        if (iM4012 == 1) {
            AbstractC0427.m1195(abstractC0041.m282(), view);
            return;
        }
        if (iM4012 == 2) {
            C0796 c0796 = new C0796(abstractC0041, view);
            if (abstractC0041.m282() instanceof AppCompatActivity) {
                throw null;
            }
            WeakReference weakReference = AbstractC1655.f8450;
            Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            abstractC0041.f400 = new WeakReference(c0796);
            return;
        }
        if (iM4012 != 3) {
            if (abstractC0041.m278() == null) {
                return;
            }
            m266(new RunnableC1304(view, abstractC0041, i));
            return;
        }
        HashMap map = f391;
        if (map == null) {
            map = new HashMap();
            f391 = map;
        }
        map.put(abstractC0041.mo283(), new C1586());
        WeakReference weakReference2 = DialogXFloatingWindowActivity.f414;
        if ((weakReference2 == null ? null : (DialogXFloatingWindowActivity) weakReference2.get()) != null) {
            abstractC0041.m282().hashCode();
            throw null;
        }
        Intent intent = new Intent(m262(), (Class<?>) DialogXFloatingWindowActivity.class);
        if (abstractC0041.m282() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", abstractC0041.mo283());
        intent.putExtra("fromActivityUiStatus", (abstractC0041.m282() == null || m257(abstractC0041.m282()) == null) ? 0 : m257(abstractC0041.m282()).getSystemUiVisibility());
        intent.putExtra("from", m262().hashCode());
        m262().startActivity(intent);
        if (abstractC0041.m282() != null) {
            abstractC0041.m282().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static void m259(Activity activity, View view) {
        if (activity == null || view == null) {
            return;
        }
        WeakReference weakReference = f393;
        if (weakReference == null || weakReference.get() == null || C0373.m1072() == null) {
            m261(activity.getApplicationContext());
        }
        AbstractC0041 abstractC0041 = (AbstractC0041) view.getTag();
        if (abstractC0041 != null) {
            abstractC0041.f410 = new WeakReference(activity);
            int i = 0;
            if (abstractC0041.m279() != null) {
                abstractC0041.m279().setVisibility(0);
            }
            if (abstractC0041.f407) {
                m269(((AbstractC0041) view.getTag()).mo283().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                return;
            }
            if (activity.isDestroyed()) {
                m269(((AbstractC0041) view.getTag()).mo283().concat(".show ERROR: activity is Destroyed."));
                return;
            }
            abstractC0041.f413 = new WeakReference(view);
            m256(abstractC0041 + ".show on " + activity);
            CopyOnWriteArrayList copyOnWriteArrayList = f392;
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                f392 = copyOnWriteArrayList;
            }
            copyOnWriteArrayList.add(abstractC0041);
            int iM4012 = AbstractC2104.m4012(abstractC0041.f409);
            if (iM4012 == 1) {
                AbstractC0427.m1195(activity, view);
                return;
            }
            if (iM4012 == 2) {
                C0796 c0796 = new C0796(abstractC0041, view);
                if (activity instanceof AppCompatActivity) {
                    throw null;
                }
                WeakReference weakReference2 = AbstractC1655.f8450;
                Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
                abstractC0041.f400 = new WeakReference(c0796);
                return;
            }
            if (iM4012 != 3) {
                FrameLayout frameLayoutM257 = m257(activity);
                if (frameLayoutM257 == null) {
                    return;
                }
                m266(new RunnableC0057(view, abstractC0041, frameLayoutM257, i));
                return;
            }
            HashMap map = f391;
            if (map == null) {
                map = new HashMap();
                f391 = map;
            }
            map.put(abstractC0041.mo283(), new C0135(8));
            WeakReference weakReference3 = DialogXFloatingWindowActivity.f414;
            if ((weakReference3 == null ? null : (DialogXFloatingWindowActivity) weakReference3.get()) != null) {
                activity.hashCode();
                throw null;
            }
            Intent intent = new Intent(activity, (Class<?>) DialogXFloatingWindowActivity.class);
            intent.putExtra("dialogXKey", abstractC0041.mo283());
            intent.putExtra("from", activity.hashCode());
            intent.putExtra("fromActivityUiStatus", m257(activity) == null ? 0 : m257(activity).getSystemUiVisibility());
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static void m260(View view) {
        if (view == null) {
            return;
        }
        AbstractC0041 abstractC0041 = (AbstractC0041) view.getTag();
        m256(abstractC0041.mo283().concat(".dismiss"));
        CopyOnWriteArrayList copyOnWriteArrayList = f392;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(abstractC0041);
        }
        WeakReference weakReference = abstractC0041.f413;
        if (weakReference != null) {
            weakReference.clear();
        }
        InterfaceC0251 interfaceC0251 = abstractC0041.f405;
        if (interfaceC0251 != null) {
            interfaceC0251.mo901(abstractC0041);
        }
        int iM4012 = AbstractC2104.m4012(abstractC0041.f409);
        int i = 1;
        if (iM4012 == 1) {
            AbstractC0041 abstractC00412 = (AbstractC0041) view.getTag();
            if (abstractC00412 == null || abstractC00412.m282() == null) {
                return;
            }
            ((WindowManager) abstractC00412.m282().getSystemService("window")).removeViewImmediate((View) view.getParent());
            return;
        }
        if (iM4012 != 2) {
            if (iM4012 != 3) {
                m273().post(new RunnableC1304(view, abstractC0041, i));
                return;
            }
            return;
        }
        WeakReference weakReference2 = abstractC0041.f400;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        ((C0796) abstractC0041.f400.get()).m4238();
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static void m261(Context context) {
        if (context == null) {
            context = C0373.m1073();
        }
        if (context instanceof Activity) {
            m274((Activity) context);
        }
        C0373.m1074(context, new C0805(7));
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static ContextWrapper m262() {
        Activity activityM264 = m264();
        if (activityM264 != null) {
            return activityM264;
        }
        Application applicationM1072 = C0373.m1072();
        if (applicationM1072 != null) {
            return applicationM1072;
        }
        m269("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static void m263(View view) {
        if (view == null || !AbstractC1655.f8454) {
            return;
        }
        view.performHapticFeedback(3);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static Activity m264() {
        WeakReference weakReference = f393;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f393.get();
        }
        m261(null);
        WeakReference weakReference2 = f393;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f393.get();
        }
        Activity activityM1073 = C0373.m1073();
        m261(activityM1073);
        return activityM1073;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static ArrayList m265(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM265 = m265(viewGroup.getChildAt(i));
                if (arrayListM265 != null) {
                    arrayList.addAll(arrayListM265);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static void m266(Runnable runnable) {
        WeakReference weakReference = AbstractC1655.f8450;
        Thread thread = f394;
        if (thread == null) {
            thread = Looper.getMainLooper().getThread();
            f394 = thread;
        }
        if (thread != null) {
            Thread threadCurrentThread = Thread.currentThread();
            Thread thread2 = f394;
            if (thread2 == null) {
                thread2 = Looper.getMainLooper().getThread();
                f394 = thread2;
            }
            if (threadCurrentThread == thread2) {
                runnable.run();
                return;
            }
        }
        m273().post(runnable);
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static boolean m267(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static void m268(Runnable runnable, long j) {
        if (j < 0) {
            return;
        }
        WeakReference weakReference = AbstractC1655.f8450;
        m273().postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static void m269(String str) {
        WeakReference weakReference = AbstractC1655.f8450;
        Log.e(">>>", str.toString());
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static void m270(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m267(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static void m271(Activity activity) {
        WeakReference weakReference = AbstractC1655.f8450;
        if (f392 != null) {
            for (AbstractC0041 abstractC0041 : new CopyOnWriteArrayList(f392)) {
                if (abstractC0041.m282() == activity) {
                    WeakReference weakReference2 = abstractC0041.f410;
                    if (weakReference2 != null) {
                        weakReference2.clear();
                    }
                    abstractC0041.f413 = null;
                    abstractC0041.f410 = null;
                    f392.remove(abstractC0041);
                    if (abstractC0041 instanceof C1624) {
                        ((C1624) abstractC0041).m3326();
                    }
                }
            }
        }
        if (activity == m264()) {
            WeakReference weakReference3 = f393;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            f393 = null;
            WeakReference weakReference4 = AbstractC1655.f8450;
        }
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static void m272(TextView textView, C2544 c2544) {
        if (c2544 == null || textView == null) {
            return;
        }
        int i = c2544.f12535;
        if (i > 0) {
            textView.setTextSize(1, i);
        }
        int i2 = c2544.f12537;
        if (i2 != 1) {
            textView.setTextColor(i2);
        }
        int i3 = c2544.f12536;
        if (i3 != -1) {
            textView.setGravity(i3);
        }
        if (c2544.f12538) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setEllipsize(null);
        }
        int i4 = c2544.f12534;
        if (i4 != -1) {
            textView.setMaxLines(i4);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        textView.getPaint().setFakeBoldText(c2544.f12539);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static Handler m273() {
        WeakReference weakReference = f395;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f395.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f395 = weakReference2;
        return (Handler) weakReference2.get();
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static void m274(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC1655.f8449) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f394 = Looper.getMainLooper().getThread();
            f393 = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m269("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int m275(float f) {
        return (int) ((f * m286().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final int m276(boolean z) {
        return this.f399[!z ? 1 : 0];
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public boolean mo277() {
        int i = this.f401;
        if (i == 3) {
            if (C0373.m1072() == null) {
                if (i != 1) {
                    return false;
                }
            } else if ((m286().getConfiguration().uiMode & 48) != 16) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }

    @Override // yyds.InterfaceC2345
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final C0038 mo14() {
        return this.f412;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final FrameLayout m278() {
        FrameLayout frameLayoutM257;
        Activity activityM282 = m282();
        if (m280()) {
            if (activityM282 == null) {
                activityM282 = m264();
                if (activityM282 == null) {
                    m269("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f410 = new WeakReference(activityM282);
            }
            frameLayoutM257 = m257(activityM282);
        } else {
            frameLayoutM257 = (FrameLayout) m279().getParent();
        }
        if (frameLayoutM257 != null) {
            return (FrameLayout) new WeakReference(frameLayoutM257).get();
        }
        m269("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM282 + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final View m279() {
        WeakReference weakReference = this.f413;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final boolean m280() {
        int i = this.f409;
        return i == 1 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m281(EditText editText, boolean z) {
        if (m282() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m282().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final Activity m282() {
        WeakReference weakReference = this.f410;
        if (weakReference == null || weakReference.get() == null) {
            this.f410 = new WeakReference(m264());
        }
        return (Activity) this.f410.get();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public abstract String mo283();

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int m284(int i) {
        if (C0373.m1072() != null) {
            return m286().getColor(i);
        }
        m269("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return -16777216;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public void mo285() {
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final Resources m286() {
        Context contextM3376 = AbstractC1655.m3376();
        if (contextM3376 != null) {
            return contextM3376.getResources();
        }
        Context context = this.f408;
        if (context != null) {
            return context.getResources();
        }
        View viewM279 = m279();
        return viewM279 != null ? viewM279.getContext().getResources() : m282() != null ? m282().getResources() : C0373.m1072() == null ? Resources.getSystem() : C0373.m1072().getResources();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m287() {
        this.f403 = false;
        this.f410 = new WeakReference(m264());
        if (m282() == null && m280()) {
            m261(null);
            if (m282() == null) {
                m269("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        if (this.f409 != 1 && (m282() instanceof InterfaceC2345)) {
            ((InterfaceC2345) m282()).mo14().m122(new InterfaceC0657() { // from class: com.kongzue.dialogx.interfaces.BaseDialog$7
                @Override // yyds.InterfaceC0657
                /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
                public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
                    if (enumC0637 == EnumC0637.ON_DESTROY) {
                        AbstractC0041.m271(this.f390.m282());
                    }
                }
            });
        }
        View currentFocus = m282().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) m282().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public abstract void mo288();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final View m289(Context context, int i) {
        if (!m280()) {
            Context context2 = this.f408;
            if (context2 != null) {
                context = context2;
            }
            return AbstractC0879.m1961(context).inflate(i, (ViewGroup) null);
        }
        if (m282() == null) {
            m269("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return null;
        }
        Context context3 = this.f408;
        if (context3 != null) {
            context = context3;
        }
        return AbstractC0879.m1961(context).inflate(i, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final View m290(int i) {
        if (!m280()) {
            Context contextM1072 = this.f408;
            if (contextM1072 == null) {
                contextM1072 = C0373.m1072();
            }
            return AbstractC0879.m1961(contextM1072).inflate(i, (ViewGroup) null);
        }
        if (m282() == null) {
            m269("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return null;
        }
        Context contextM282 = this.f408;
        if (contextM282 == null) {
            contextM282 = m282();
        }
        return AbstractC0879.m1961(contextM282).inflate(i, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final void m291(EnumC1464 enumC1464) {
        C0038 c0038 = this.f412;
        if (c0038 != null) {
            try {
                c0038.m124(enumC1464);
            } catch (Exception unused) {
            }
        }
    }
}
