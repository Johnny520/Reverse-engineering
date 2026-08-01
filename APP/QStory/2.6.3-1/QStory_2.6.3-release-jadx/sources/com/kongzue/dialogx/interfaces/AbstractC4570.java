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
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.C3165;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.util.AbstractC4606;
import com.kongzue.dialogx.util.C4603;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.RunnableC4604;
import com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p158.C8371;
import p273.C9027;
import p273.C9041;
import p274.C9070;
import p274.C9072;
import p277.AbstractC9077;
import p321.C9452;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4570 implements InterfaceC3221 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static WeakReference f11920;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static WeakReference f11921;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static Thread f11922;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static HashMap f11923;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static CopyOnWriteArrayList f11924;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f11925;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f11926;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public DialogX$THEME f11927;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC5754 f11928;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f11929;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11930;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f11931;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f11932;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int[] f11933;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f11934;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11935;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f11936;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public WeakReference f11937;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f11939;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f11940;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC4584 f11942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f11943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public WeakReference f11944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f11945;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final DialogX$IMPL_MODE f11938 = AbstractC9077.f23166;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3219 f11941 = new C3219(this, true);

    public AbstractC4570() {
        this.f11939 = true;
        new HashMap();
        this.f11940 = new int[2];
        this.f11930 = true;
        this.f11925 = -1L;
        this.f11936 = -1L;
        this.f11933 = new int[4];
        this.f11930 = AbstractC9077.f23164;
        this.f11928 = AbstractC9077.f23168;
        this.f11927 = AbstractC9077.f23167;
        this.f11925 = AbstractC9077.f23163;
        this.f11936 = AbstractC9077.f23175;
        this.f11926 = AbstractC9077.f23165;
        this.f11939 = AbstractC9077.f23171;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8582(TextView textView, C4603 c4603) {
        int i;
        if (c4603 == null || textView == null) {
            return;
        }
        if (c4603.f12090 > 0) {
            TextInfo$FONT_SIZE_UNIT textInfo$FONT_SIZE_UNIT = c4603.f12089;
            if (textInfo$FONT_SIZE_UNIT != null) {
                int i2 = AbstractC4606.f12099[textInfo$FONT_SIZE_UNIT.ordinal()];
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                textView.setTextSize(i, c4603.f12090);
            }
        }
        int i3 = c4603.f12087;
        if (i3 != 1) {
            textView.setTextColor(i3);
        }
        int i4 = c4603.f12088;
        if (i4 != -1) {
            textView.setGravity(i4);
        }
        if (c4603.f12091) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setEllipsize(null);
        }
        int i5 = c4603.f12085;
        if (i5 != -1) {
            textView.setMaxLines(i5);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        textView.getPaint().setFakeBoldText(c4603.f12086);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m8583(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m8586(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m8584() {
        if (f11924 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f11924);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC4570 abstractC4570 = (AbstractC4570) copyOnWriteArrayList.get(size);
                if (abstractC4570.m8617() == m8591() && abstractC4570.f11929 && abstractC4570.m8614() != null) {
                    View viewFindViewById = abstractC4570.m8614().findViewById(C0328R.id.box_root);
                    if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f11978) {
                        viewFindViewById.requestFocus();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m8585(Activity activity) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i = AbstractC4571.f11946[AbstractC9077.f23166.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && f11924 != null) {
                    for (AbstractC4570 abstractC4570 : new CopyOnWriteArrayList(f11924)) {
                        if (abstractC4570.m8617() == activity) {
                            abstractC4570.mo8611();
                            f11924.remove(abstractC4570);
                            if (abstractC4570 instanceof C9027) {
                                ((C9027) abstractC4570).m14273();
                            }
                        }
                    }
                }
            } else if (f11924 != null) {
                for (AbstractC4570 abstractC45702 : new CopyOnWriteArrayList(f11924)) {
                    if (abstractC45702.m8617() == activity && (weakReference2 = abstractC45702.f11944) != null && weakReference2.get() != null) {
                        ((C9070) abstractC45702.f11944.get()).m5026(true, false);
                        if (abstractC45702 instanceof C9027) {
                            ((C9027) abstractC45702).m14273();
                        }
                        f11924.remove(abstractC45702);
                    }
                }
            }
        } else if (f11924 != null) {
            for (AbstractC4570 abstractC45703 : new CopyOnWriteArrayList(f11924)) {
                if (abstractC45703.m8617() == activity && (weakReference = abstractC45703.f11943) != null) {
                    AbstractC7173.m12440((View) weakReference.get());
                    if (abstractC45703 instanceof C9027) {
                        ((C9027) abstractC45703).m14273();
                    }
                    f11924.remove(abstractC45703);
                }
            }
        }
        if (activity == m8591()) {
            WeakReference weakReference3 = f11921;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            f11921 = null;
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m8586(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m8587(View view) {
        AbstractC4570 abstractC4570;
        if (view == null || (abstractC4570 = (AbstractC4570) view.getTag()) == null) {
            return;
        }
        if (abstractC4570.f11929) {
            if (abstractC4570.m8614() != null) {
                abstractC4570.m8614().setVisibility(0);
                return;
            } else {
                m8599(((AbstractC4570) view.getTag()).mo8609().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                return;
            }
        }
        abstractC4570.f11943 = new WeakReference(view);
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC4570.mo8609());
        sb.append(".show on ");
        sb.append(abstractC4570.m8604() ? abstractC4570.m8617() : "window");
        String string = sb.toString();
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        Log.i(">>>", string.toString());
        if (f11924 == null) {
            f11924 = new CopyOnWriteArrayList();
        }
        f11924.add(abstractC4570);
        int i = AbstractC4571.f11946[abstractC4570.f11938.ordinal()];
        if (i == 1) {
            Activity activityM8617 = abstractC4570.m8617();
            boolean z = !(abstractC4570 instanceof C9041);
            try {
                if (activityM8617.getWindow().getDecorView().isAttachedToWindow()) {
                    AbstractC7173.m12427(activityM8617, view, z);
                    return;
                } else {
                    activityM8617.getWindow().getDecorView().post(new RunnableC4604(activityM8617, view, z));
                    return;
                }
            } catch (Exception unused) {
                if (activityM8617 == null || activityM8617.isDestroyed()) {
                    return;
                }
                AbstractC7173.m12427(activityM8617, view, z);
                return;
            }
        }
        if (i == 2) {
            C9070 c9070 = new C9070();
            c9070.f23121 = null;
            c9070.f23122 = view;
            c9070.f23123 = abstractC4570;
            c9070.f23121 = new WeakReference(abstractC4570.m8617());
            Activity activityM86172 = abstractC4570.m8617();
            AbstractC3146 supportFragmentManager = activityM86172 instanceof AppCompatActivity ? ((AppCompatActivity) activityM86172).getSupportFragmentManager() : null;
            if (supportFragmentManager == null) {
                Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            } else {
                C3165 c3165 = new C3165(supportFragmentManager);
                c3165.m4987(0, c9070, "DialogX", 1);
                c3165.m4988(true);
            }
            abstractC4570.f11944 = new WeakReference(c9070);
            return;
        }
        if (i != 3) {
            if (abstractC4570.m8616() == null) {
                return;
            }
            m8589(new RunnableC4572(view, abstractC4570, 0));
            return;
        }
        if (f11923 == null) {
            f11923 = new HashMap();
        }
        f11923.put(abstractC4570.mo8609(), new C4573(abstractC4570, view));
        DialogXFloatingWindowActivity dialogXFloatingWindowActivity = DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity();
        if (dialogXFloatingWindowActivity != null && dialogXFloatingWindowActivity.isSameFrom(abstractC4570.m8617().hashCode())) {
            dialogXFloatingWindowActivity.showDialogX(abstractC4570.mo8609());
            return;
        }
        Intent intent = new Intent(m8597(), (Class<?>) DialogXFloatingWindowActivity.class);
        if (abstractC4570.m8617() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", abstractC4570.mo8609());
        intent.putExtra("fromActivityUiStatus", (abstractC4570.m8617() == null || m8600(abstractC4570.m8617()) == null) ? 0 : m8600(abstractC4570.m8617()).getSystemUiVisibility());
        intent.putExtra("from", m8597().hashCode());
        m8597().startActivity(intent);
        if (abstractC4570.m8617() != null) {
            abstractC4570.m8617().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m8588(long j, Runnable runnable) {
        if (j < 0) {
            return;
        }
        if (!AbstractC9077.f23174) {
            runnable.run();
        }
        m8596().postDelayed(runnable, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0 == com.kongzue.dialogx.interfaces.AbstractC4570.f11922) goto L17;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8589(Runnable runnable) {
        if (AbstractC9077.f23174) {
            if (f11922 == null) {
                f11922 = Looper.getMainLooper().getThread();
            }
            if (f11922 != null) {
                Thread threadCurrentThread = Thread.currentThread();
                if (f11922 == null) {
                    f11922 = Looper.getMainLooper().getThread();
                }
            }
            m8596().post(runnable);
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m8590(View view) {
        if (view == null) {
            return;
        }
        AbstractC4570 abstractC4570 = (AbstractC4570) view.getTag();
        String strConcat = abstractC4570.mo8609().concat(".dismiss");
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        Log.i(">>>", strConcat.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f11924;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(abstractC4570);
        }
        WeakReference weakReference = abstractC4570.f11943;
        if (weakReference != null) {
            weakReference.clear();
        }
        int i = AbstractC4571.f11946[abstractC4570.f11938.ordinal()];
        if (i == 1) {
            AbstractC7173.m12440(view);
            return;
        }
        if (i == 2) {
            WeakReference weakReference2 = abstractC4570.f11944;
            if (weakReference2 == null || weakReference2.get() == null) {
                return;
            }
            ((C9070) abstractC4570.f11944.get()).m5026(true, false);
            return;
        }
        if (i != 3) {
            m8596().post(new RunnableC4572(view, abstractC4570, 1));
            return;
        }
        WeakReference weakReference3 = abstractC4570.f11937;
        if (weakReference3 == null || weakReference3.get() == null) {
            return;
        }
        FrameLayout frameLayoutM8600 = m8600((Activity) abstractC4570.f11937.get());
        if (frameLayoutM8600 != null) {
            frameLayoutM8600.removeView(view);
        }
        ((DialogXFloatingWindowActivity) abstractC4570.f11937.get()).finish(abstractC4570.mo8609());
        m8584();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Activity m8591() {
        WeakReference weakReference = f11921;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f11921.get();
        }
        m8593(null);
        WeakReference weakReference2 = f11921;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f11921.get();
        }
        Activity activityM14325 = C9072.m14325();
        m8593(activityM14325);
        return activityM14325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static List m8592() {
        return f11924 == null ? new ArrayList() : new CopyOnWriteArrayList(f11924);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m8593(Context context) {
        if (context == null) {
            context = C9072.m14325();
        }
        if (context instanceof Activity) {
            m8594((Activity) context);
        }
        C9072.m14324(context, new C9452(19));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m8594(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC9077.f23176) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f11922 = Looper.getMainLooper().getThread();
            f11921 = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m8599("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m8595(View view) {
        if (view == null || !AbstractC9077.f23178) {
            return;
        }
        view.performHapticFeedback(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Handler m8596() {
        WeakReference weakReference = f11920;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f11920.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f11920 = weakReference2;
        return (Handler) weakReference2.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static ContextWrapper m8597() {
        Activity activityM8591 = m8591();
        if (activityM8591 != null) {
            return activityM8591;
        }
        Application applicationM8601 = m8601();
        if (applicationM8601 != null) {
            return applicationM8601;
        }
        m8599("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m8598(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM8598 = m8598(viewGroup.getChildAt(i));
                if (arrayListM8598 != null) {
                    arrayList.addAll(arrayListM8598);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m8599(String str) {
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        Log.e(">>>", str.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static FrameLayout m8600(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Application m8601() {
        Application application;
        Application application2 = C9072.f23126;
        if (application2 != null) {
            return application2;
        }
        try {
            try {
                try {
                    return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                } catch (Exception unused) {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    application = (Application) cls.getDeclaredMethod("getApplication", null).invoke(cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null), null);
                    return application;
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            return application;
        }
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        return this.f11941;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo8602() {
        InterfaceC4584 interfaceC4584 = this.f11942;
        if (interfaceC4584 != null) {
            interfaceC4584.mo8627(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean mo8603() {
        DialogX$THEME dialogX$THEME = this.f11927;
        return dialogX$THEME == DialogX$THEME.AUTO ? m8601() == null ? this.f11927 == DialogX$THEME.LIGHT : (m8615().getConfiguration().uiMode & 48) == 16 : dialogX$THEME == DialogX$THEME.LIGHT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m8604() {
        DialogX$IMPL_MODE dialogX$IMPL_MODE = DialogX$IMPL_MODE.VIEW;
        DialogX$IMPL_MODE dialogX$IMPL_MODE2 = this.f11938;
        return dialogX$IMPL_MODE2 == dialogX$IMPL_MODE || dialogX$IMPL_MODE2 == DialogX$IMPL_MODE.FLOATING_ACTIVITY || dialogX$IMPL_MODE2 == DialogX$IMPL_MODE.DIALOG_FRAGMENT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m8605(Lifecycle$State lifecycle$State) {
        C3219 c3219 = this.f11941;
        if (c3219 == null || lifecycle$State == null) {
            return;
        }
        try {
            c3219.m5065(lifecycle$State);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m8606(View view) {
        this.f11943 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract void mo8607();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m8608(float f) {
        return (int) ((f * m8615().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract String mo8609();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m8610(int i) {
        if (!m8604()) {
            return AbstractC7082.m12309(m8601()).inflate(i, (ViewGroup) null);
        }
        if (m8617() != null) {
            return AbstractC7082.m12309(m8617()).inflate(i, (ViewGroup) null);
        }
        m8599("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo8611() {
        WeakReference weakReference = this.f11945;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11943 = null;
        this.f11945 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8612() {
        View currentFocus;
        this.f11931 = true;
        this.f11932 = false;
        this.f11945 = new WeakReference(m8591());
        if (m8617() == null && m8604()) {
            m8593(null);
            if (m8617() == null) {
                m8599("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        int i = 2;
        if (this.f11938 != DialogX$IMPL_MODE.VIEW && (m8617() instanceof InterfaceC3221)) {
            ((InterfaceC3221) m8617()).getLifecycle().mo5063(new C8371(this, i));
        }
        if ((this instanceof C9041) || (currentFocus = m8617().getCurrentFocus()) == null) {
            return;
        }
        ((InputMethodManager) m8617().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8613(EditText editText, boolean z) {
        if (m8617() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m8617().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View m8614() {
        WeakReference weakReference = this.f11943;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources m8615() {
        return m8617() != null ? m8617().getResources() : m8601() == null ? Resources.getSystem() : m8601().getResources();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final FrameLayout m8616() {
        FrameLayout frameLayoutM8600;
        Activity activityM8617 = m8617();
        if (m8604()) {
            if (activityM8617 == null) {
                activityM8617 = m8591();
                if (activityM8617 == null) {
                    m8599("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f11945 = new WeakReference(activityM8617);
            }
            frameLayoutM8600 = m8600(activityM8617);
        } else {
            frameLayoutM8600 = (FrameLayout) m8614().getParent();
        }
        if (frameLayoutM8600 != null) {
            return (FrameLayout) new WeakReference(frameLayoutM8600).get();
        }
        m8599("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM8617 + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Activity m8617() {
        WeakReference weakReference = this.f11945;
        if (weakReference == null || weakReference.get() == null) {
            this.f11945 = new WeakReference(m8591());
        }
        return (Activity) this.f11945.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m8618(boolean z) {
        return this.f11940[!z ? 1 : 0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m8619(int i) {
        if (m8601() != null) {
            return m8615().getColor(i);
        }
        m8599("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return -16777216;
    }
}
