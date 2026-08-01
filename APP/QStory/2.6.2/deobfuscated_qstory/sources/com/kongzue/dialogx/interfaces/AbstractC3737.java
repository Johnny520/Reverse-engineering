package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.C2332;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import com.kongzue.dialogx.util.RunnableC3771;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p033.AbstractC6325;
import p053.AbstractC6560;
import p142.C7541;
import p175.AbstractC7738;
import p257.C8197;
import p257.C8211;
import p258.C8240;
import p258.C8242;
import p261.AbstractC8247;
import p305.C8631;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3737 implements InterfaceC2388 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static WeakReference f11570;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static WeakReference f11571;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static Thread f11572;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static HashMap f11573;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static CopyOnWriteArrayList f11574;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f11575;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f11576;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public DialogX$THEME f11577;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC6325 f11578;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f11579;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11580;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f11581;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f11582;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int[] f11583;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f11584;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11585;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f11586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public WeakReference f11587;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f11589;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f11590;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC3751 f11592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f11593;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public WeakReference f11594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f11595;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final DialogX$IMPL_MODE f11588 = AbstractC8247.f22822;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2386 f11591 = new C2386(this, true);

    public AbstractC3737() {
        this.f11589 = true;
        new HashMap();
        this.f11590 = new int[2];
        this.f11580 = true;
        this.f11575 = -1L;
        this.f11586 = -1L;
        this.f11583 = new int[4];
        this.f11580 = AbstractC8247.f22820;
        this.f11578 = AbstractC8247.f22824;
        this.f11577 = AbstractC8247.f22823;
        this.f11575 = AbstractC8247.f22819;
        this.f11586 = AbstractC8247.f22831;
        this.f11576 = AbstractC8247.f22821;
        this.f11589 = AbstractC8247.f22827;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8036(android.widget.TextView r3, com.kongzue.dialogx.util.C3770 r4) {
        /*
            if (r4 != 0) goto L3
            goto L5
        L3:
            if (r3 != 0) goto L6
        L5:
            return
        L6:
            int r0 = r4.f11740
            r1 = 1
            if (r0 <= 0) goto L26
            com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r0 = r4.f11739
            if (r0 != 0) goto L11
        Lf:
            r2 = r1
            goto L20
        L11:
            int[] r2 = com.kongzue.dialogx.util.AbstractC3773.f11749
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L1f
            r2 = 2
            if (r0 == r2) goto L20
            goto Lf
        L1f:
            r2 = 0
        L20:
            int r0 = r4.f11740
            float r0 = (float) r0
            r3.setTextSize(r2, r0)
        L26:
            int r0 = r4.f11737
            if (r0 == r1) goto L2d
            r3.setTextColor(r0)
        L2d:
            int r0 = r4.f11738
            r1 = -1
            if (r0 == r1) goto L35
            r3.setGravity(r0)
        L35:
            boolean r0 = r4.f11741
            if (r0 == 0) goto L3f
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
            goto L43
        L3f:
            r0 = 0
            r3.setEllipsize(r0)
        L43:
            int r0 = r4.f11735
            if (r0 == r1) goto L4b
            r3.setMaxLines(r0)
            goto L51
        L4b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.setMaxLines(r0)
        L51:
            android.text.TextPaint r3 = r3.getPaint()
            boolean r4 = r4.f11736
            r3.setFakeBoldText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.interfaces.AbstractC3737.m8036(android.widget.TextView, com.kongzue.dialogx.util.飘花落叶言子楪苏兰世哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m8037(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m8040(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m8038() {
        if (f11574 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f11574);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC3737 abstractC3737 = (AbstractC3737) copyOnWriteArrayList.get(size);
                if (abstractC3737.m8071() == m8045() && abstractC3737.f11579 && abstractC3737.m8068() != null) {
                    View viewFindViewById = abstractC3737.m8068().findViewById(R.id.box_root);
                    if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f11628) {
                        viewFindViewById.requestFocus();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m8039(Activity activity) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i = AbstractC3738.f11596[AbstractC8247.f22822.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && f11574 != null) {
                    for (AbstractC3737 abstractC3737 : new CopyOnWriteArrayList(f11574)) {
                        if (abstractC3737.m8071() == activity) {
                            abstractC3737.mo8065();
                            f11574.remove(abstractC3737);
                            if (abstractC3737 instanceof C8197) {
                                ((C8197) abstractC3737).m13697();
                            }
                        }
                    }
                }
            } else if (f11574 != null) {
                for (AbstractC3737 abstractC37372 : new CopyOnWriteArrayList(f11574)) {
                    if (abstractC37372.m8071() == activity && (weakReference2 = abstractC37372.f11594) != null && weakReference2.get() != null) {
                        ((C8240) abstractC37372.f11594.get()).m4456(true, false);
                        if (abstractC37372 instanceof C8197) {
                            ((C8197) abstractC37372).m13697();
                        }
                        f11574.remove(abstractC37372);
                    }
                }
            }
        } else if (f11574 != null) {
            for (AbstractC3737 abstractC37373 : new CopyOnWriteArrayList(f11574)) {
                if (abstractC37373.m8071() == activity && (weakReference = abstractC37373.f11593) != null) {
                    AbstractC7738.m13058((View) weakReference.get());
                    if (abstractC37373 instanceof C8197) {
                        ((C8197) abstractC37373).m13697();
                    }
                    f11574.remove(abstractC37373);
                }
            }
        }
        if (activity == m8045()) {
            WeakReference weakReference3 = f11571;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            f11571 = null;
            AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m8040(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m8041(View view) {
        AbstractC3737 abstractC3737;
        if (view == null || (abstractC3737 = (AbstractC3737) view.getTag()) == null) {
            return;
        }
        if (abstractC3737.f11579) {
            if (abstractC3737.m8068() != null) {
                abstractC3737.m8068().setVisibility(0);
                return;
            } else {
                m8053(((AbstractC3737) view.getTag()).mo8063().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                return;
            }
        }
        abstractC3737.f11593 = new WeakReference(view);
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC3737.mo8063());
        sb.append(".show on ");
        sb.append(abstractC3737.m8058() ? abstractC3737.m8071() : "window");
        String string = sb.toString();
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        Log.i(">>>", string.toString());
        if (f11574 == null) {
            f11574 = new CopyOnWriteArrayList();
        }
        f11574.add(abstractC3737);
        int i = AbstractC3738.f11596[abstractC3737.f11588.ordinal()];
        if (i == 1) {
            Activity activityM8071 = abstractC3737.m8071();
            boolean z = !(abstractC3737 instanceof C8211);
            try {
                if (activityM8071.getWindow().getDecorView().isAttachedToWindow()) {
                    AbstractC7738.m13020(activityM8071, view, z);
                    return;
                } else {
                    activityM8071.getWindow().getDecorView().post(new RunnableC3771(activityM8071, view, z));
                    return;
                }
            } catch (Exception unused) {
                if (activityM8071 == null || activityM8071.isDestroyed()) {
                    return;
                }
                AbstractC7738.m13020(activityM8071, view, z);
                return;
            }
        }
        if (i == 2) {
            C8240 c8240 = new C8240();
            c8240.f22777 = null;
            c8240.f22778 = view;
            c8240.f22779 = abstractC3737;
            c8240.f22777 = new WeakReference(abstractC3737.m8071());
            Activity activityM80712 = abstractC3737.m8071();
            AbstractC2313 supportFragmentManager = activityM80712 instanceof AppCompatActivity ? ((AppCompatActivity) activityM80712).getSupportFragmentManager() : null;
            if (supportFragmentManager == null) {
                Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            } else {
                C2332 c2332 = new C2332(supportFragmentManager);
                c2332.m4417(0, c8240, "DialogX", 1);
                c2332.m4418(true);
            }
            abstractC3737.f11594 = new WeakReference(c8240);
            return;
        }
        if (i != 3) {
            if (abstractC3737.m8070() == null) {
                return;
            }
            m8043(new RunnableC3739(view, abstractC3737, 0));
            return;
        }
        if (f11573 == null) {
            f11573 = new HashMap();
        }
        f11573.put(abstractC3737.mo8063(), new C3740(abstractC3737, view));
        DialogXFloatingWindowActivity dialogXFloatingWindowActivity = DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity();
        if (dialogXFloatingWindowActivity != null && dialogXFloatingWindowActivity.isSameFrom(abstractC3737.m8071().hashCode())) {
            dialogXFloatingWindowActivity.showDialogX(abstractC3737.mo8063());
            return;
        }
        Intent intent = new Intent(m8051(), (Class<?>) DialogXFloatingWindowActivity.class);
        if (abstractC3737.m8071() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", abstractC3737.mo8063());
        intent.putExtra("fromActivityUiStatus", (abstractC3737.m8071() == null || m8054(abstractC3737.m8071()) == null) ? 0 : m8054(abstractC3737.m8071()).getSystemUiVisibility());
        intent.putExtra("from", m8051().hashCode());
        m8051().startActivity(intent);
        if (abstractC3737.m8071() != null) {
            abstractC3737.m8071().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m8042(long j, Runnable runnable) {
        if (j < 0) {
            return;
        }
        if (!AbstractC8247.f22830) {
            runnable.run();
        }
        m8050().postDelayed(runnable, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0 == com.kongzue.dialogx.interfaces.AbstractC3737.f11572) goto L17;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8043(java.lang.Runnable r2) {
        /*
            boolean r0 = p261.AbstractC8247.f22830
            if (r0 == 0) goto L35
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.AbstractC3737.f11572
            if (r0 != 0) goto L12
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            com.kongzue.dialogx.interfaces.AbstractC3737.f11572 = r0
        L12:
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.AbstractC3737.f11572
            if (r0 == 0) goto L2d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = com.kongzue.dialogx.interfaces.AbstractC3737.f11572
            if (r1 != 0) goto L28
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            com.kongzue.dialogx.interfaces.AbstractC3737.f11572 = r1
        L28:
            java.lang.Thread r1 = com.kongzue.dialogx.interfaces.AbstractC3737.f11572
            if (r0 != r1) goto L2d
            goto L35
        L2d:
            android.os.Handler r0 = m8050()
            r0.post(r2)
            return
        L35:
            r2.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.interfaces.AbstractC3737.m8043(java.lang.Runnable):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m8044(View view) {
        if (view == null) {
            return;
        }
        AbstractC3737 abstractC3737 = (AbstractC3737) view.getTag();
        String strConcat = abstractC3737.mo8063().concat(".dismiss");
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        Log.i(">>>", strConcat.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f11574;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(abstractC3737);
        }
        WeakReference weakReference = abstractC3737.f11593;
        if (weakReference != null) {
            weakReference.clear();
        }
        int i = AbstractC3738.f11596[abstractC3737.f11588.ordinal()];
        if (i == 1) {
            AbstractC7738.m13058(view);
            return;
        }
        if (i == 2) {
            WeakReference weakReference2 = abstractC3737.f11594;
            if (weakReference2 == null || weakReference2.get() == null) {
                return;
            }
            ((C8240) abstractC3737.f11594.get()).m4456(true, false);
            return;
        }
        if (i != 3) {
            m8050().post(new RunnableC3739(view, abstractC3737, 1));
            return;
        }
        WeakReference weakReference3 = abstractC3737.f11587;
        if (weakReference3 == null || weakReference3.get() == null) {
            return;
        }
        FrameLayout frameLayoutM8054 = m8054((Activity) abstractC3737.f11587.get());
        if (frameLayoutM8054 != null) {
            frameLayoutM8054.removeView(view);
        }
        ((DialogXFloatingWindowActivity) abstractC3737.f11587.get()).finish(abstractC3737.mo8063());
        m8038();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Activity m8045() {
        WeakReference weakReference = f11571;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f11571.get();
        }
        m8047(null);
        WeakReference weakReference2 = f11571;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f11571.get();
        }
        Activity activityM13749 = C8242.m13749();
        m8047(activityM13749);
        return activityM13749;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static List m8046() {
        return f11574 == null ? new ArrayList() : new CopyOnWriteArrayList(f11574);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m8047(Context context) {
        if (context == null) {
            context = C8242.m13749();
        }
        if (context instanceof Activity) {
            m8048((Activity) context);
        }
        C8242.m13748(context, new C8631(19));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m8048(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC8247.f22832) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f11572 = Looper.getMainLooper().getThread();
            f11571 = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m8053("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m8049(View view) {
        if (view == null || !AbstractC8247.f22834) {
            return;
        }
        view.performHapticFeedback(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Handler m8050() {
        WeakReference weakReference = f11570;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f11570.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f11570 = weakReference2;
        return (Handler) weakReference2.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static ContextWrapper m8051() {
        Activity activityM8045 = m8045();
        if (activityM8045 != null) {
            return activityM8045;
        }
        Application applicationM8055 = m8055();
        if (applicationM8055 != null) {
            return applicationM8055;
        }
        m8053("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m8052(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM8052 = m8052(viewGroup.getChildAt(i));
                if (arrayListM8052 != null) {
                    arrayList.addAll(arrayListM8052);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m8053(String str) {
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        Log.e(">>>", str.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static FrameLayout m8054(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Application m8055() {
        Application application;
        Application application2 = C8242.f22782;
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

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f11591;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo8056() {
        InterfaceC3751 interfaceC3751 = this.f11592;
        if (interfaceC3751 != null) {
            interfaceC3751.mo8081(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean mo8057() {
        DialogX$THEME dialogX$THEME = this.f11577;
        return dialogX$THEME == DialogX$THEME.AUTO ? m8055() == null ? this.f11577 == DialogX$THEME.LIGHT : (m8069().getConfiguration().uiMode & 48) == 16 : dialogX$THEME == DialogX$THEME.LIGHT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m8058() {
        DialogX$IMPL_MODE dialogX$IMPL_MODE = DialogX$IMPL_MODE.VIEW;
        DialogX$IMPL_MODE dialogX$IMPL_MODE2 = this.f11588;
        return dialogX$IMPL_MODE2 == dialogX$IMPL_MODE || dialogX$IMPL_MODE2 == DialogX$IMPL_MODE.FLOATING_ACTIVITY || dialogX$IMPL_MODE2 == DialogX$IMPL_MODE.DIALOG_FRAGMENT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m8059(Lifecycle$State lifecycle$State) {
        C2386 c2386 = this.f11591;
        if (c2386 == null || lifecycle$State == null) {
            return;
        }
        try {
            c2386.m4495(lifecycle$State);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m8060(View view) {
        this.f11593 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract void mo8061();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m8062(float f) {
        return (int) ((f * m8069().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract String mo8063();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m8064(int i) {
        if (!m8058()) {
            return AbstractC6560.m12028(m8055()).inflate(i, (ViewGroup) null);
        }
        if (m8071() != null) {
            return AbstractC6560.m12028(m8071()).inflate(i, (ViewGroup) null);
        }
        m8053("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo8065() {
        WeakReference weakReference = this.f11595;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11593 = null;
        this.f11595 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8066() {
        View currentFocus;
        this.f11581 = true;
        this.f11582 = false;
        this.f11595 = new WeakReference(m8045());
        if (m8071() == null && m8058()) {
            m8047(null);
            if (m8071() == null) {
                m8053("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        int i = 2;
        if (this.f11588 != DialogX$IMPL_MODE.VIEW && (m8071() instanceof InterfaceC2388)) {
            ((InterfaceC2388) m8071()).getLifecycle().mo4493(new C7541(this, i));
        }
        if ((this instanceof C8211) || (currentFocus = m8071().getCurrentFocus()) == null) {
            return;
        }
        ((InputMethodManager) m8071().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8067(EditText editText, boolean z) {
        if (m8071() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m8071().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View m8068() {
        WeakReference weakReference = this.f11593;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources m8069() {
        return m8071() != null ? m8071().getResources() : m8055() == null ? Resources.getSystem() : m8055().getResources();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final FrameLayout m8070() {
        FrameLayout frameLayoutM8054;
        Activity activityM8071 = m8071();
        if (m8058()) {
            if (activityM8071 == null) {
                activityM8071 = m8045();
                if (activityM8071 == null) {
                    m8053("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f11595 = new WeakReference(activityM8071);
            }
            frameLayoutM8054 = m8054(activityM8071);
        } else {
            frameLayoutM8054 = (FrameLayout) m8068().getParent();
        }
        if (frameLayoutM8054 != null) {
            return (FrameLayout) new WeakReference(frameLayoutM8054).get();
        }
        m8053("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM8071 + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Activity m8071() {
        WeakReference weakReference = this.f11595;
        if (weakReference == null || weakReference.get() == null) {
            this.f11595 = new WeakReference(m8045());
        }
        return (Activity) this.f11595.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m8072(boolean z) {
        return this.f11590[!z ? 1 : 0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m8073(int i) {
        if (m8055() != null) {
            return m8069().getColor(i);
        }
        m8053("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return -16777216;
    }
}
