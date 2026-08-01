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
import com.kongzue.dialogx.util.RunnableC3772;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p018.AbstractC6253;
import p034.AbstractC6344;
import p142.C7542;
import p257.C8198;
import p257.C8212;
import p258.C8241;
import p258.C8243;
import p261.AbstractC8248;
import p305.C8623;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3738 implements InterfaceC2388 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static WeakReference f11575;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static WeakReference f11576;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static Thread f11577;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static HashMap f11578;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static CopyOnWriteArrayList f11579;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f11580;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f11581;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public DialogX$THEME f11582;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC4922 f11583;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f11584;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11585;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f11586;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f11587;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int[] f11588;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f11589;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f11590;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f11591;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public WeakReference f11592;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f11594;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f11595;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC3752 f11597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f11598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public WeakReference f11599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f11600;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final DialogX$IMPL_MODE f11593 = AbstractC8248.f22821;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2386 f11596 = new C2386(this, true);

    public AbstractC3738() {
        this.f11594 = true;
        new HashMap();
        this.f11595 = new int[2];
        this.f11585 = true;
        this.f11580 = -1L;
        this.f11591 = -1L;
        this.f11588 = new int[4];
        this.f11585 = AbstractC8248.f22819;
        this.f11583 = AbstractC8248.f22823;
        this.f11582 = AbstractC8248.f22822;
        this.f11580 = AbstractC8248.f22818;
        this.f11591 = AbstractC8248.f22830;
        this.f11581 = AbstractC8248.f22820;
        this.f11594 = AbstractC8248.f22826;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8023(android.widget.TextView r3, com.kongzue.dialogx.util.C3771 r4) {
        /*
            if (r4 != 0) goto L3
            goto L5
        L3:
            if (r3 != 0) goto L6
        L5:
            return
        L6:
            int r0 = r4.f11745
            r1 = 1
            if (r0 <= 0) goto L26
            com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r0 = r4.f11744
            if (r0 != 0) goto L11
        Lf:
            r2 = r1
            goto L20
        L11:
            int[] r2 = com.kongzue.dialogx.util.AbstractC3774.f11754
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L1f
            r2 = 2
            if (r0 == r2) goto L20
            goto Lf
        L1f:
            r2 = 0
        L20:
            int r0 = r4.f11745
            float r0 = (float) r0
            r3.setTextSize(r2, r0)
        L26:
            int r0 = r4.f11742
            if (r0 == r1) goto L2d
            r3.setTextColor(r0)
        L2d:
            int r0 = r4.f11743
            r1 = -1
            if (r0 == r1) goto L35
            r3.setGravity(r0)
        L35:
            boolean r0 = r4.f11746
            if (r0 == 0) goto L3f
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
            goto L43
        L3f:
            r0 = 0
            r3.setEllipsize(r0)
        L43:
            int r0 = r4.f11740
            if (r0 == r1) goto L4b
            r3.setMaxLines(r0)
            goto L51
        L4b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.setMaxLines(r0)
        L51:
            android.text.TextPaint r3 = r3.getPaint()
            boolean r4 = r4.f11741
            r3.setFakeBoldText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.interfaces.AbstractC3738.m8023(android.widget.TextView, com.kongzue.dialogx.util.飘花落叶言子楪苏兰世哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m8024(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m8027(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m8025() {
        if (f11579 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f11579);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC3738 abstractC3738 = (AbstractC3738) copyOnWriteArrayList.get(size);
                if (abstractC3738.m8058() == m8032() && abstractC3738.f11584 && abstractC3738.m8055() != null) {
                    View viewFindViewById = abstractC3738.m8055().findViewById(R.id.box_root);
                    if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f11633) {
                        viewFindViewById.requestFocus();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m8026(Activity activity) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i = AbstractC3739.f11601[AbstractC8248.f22821.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && f11579 != null) {
                    for (AbstractC3738 abstractC3738 : new CopyOnWriteArrayList(f11579)) {
                        if (abstractC3738.m8058() == activity) {
                            abstractC3738.mo8052();
                            f11579.remove(abstractC3738);
                            if (abstractC3738 instanceof C8198) {
                                ((C8198) abstractC3738).m13714();
                            }
                        }
                    }
                }
            } else if (f11579 != null) {
                for (AbstractC3738 abstractC37382 : new CopyOnWriteArrayList(f11579)) {
                    if (abstractC37382.m8058() == activity && (weakReference2 = abstractC37382.f11599) != null && weakReference2.get() != null) {
                        ((C8241) abstractC37382.f11599.get()).m4466(true, false);
                        if (abstractC37382 instanceof C8198) {
                            ((C8198) abstractC37382).m13714();
                        }
                        f11579.remove(abstractC37382);
                    }
                }
            }
        } else if (f11579 != null) {
            for (AbstractC3738 abstractC37383 : new CopyOnWriteArrayList(f11579)) {
                if (abstractC37383.m8058() == activity && (weakReference = abstractC37383.f11598) != null) {
                    AbstractC6344.m11881((View) weakReference.get());
                    if (abstractC37383 instanceof C8198) {
                        ((C8198) abstractC37383).m13714();
                    }
                    f11579.remove(abstractC37383);
                }
            }
        }
        if (activity == m8032()) {
            WeakReference weakReference3 = f11576;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            f11576 = null;
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m8027(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m8028(View view) {
        AbstractC3738 abstractC3738;
        if (view == null || (abstractC3738 = (AbstractC3738) view.getTag()) == null) {
            return;
        }
        if (abstractC3738.f11584) {
            if (abstractC3738.m8055() != null) {
                abstractC3738.m8055().setVisibility(0);
                return;
            } else {
                m8040(((AbstractC3738) view.getTag()).mo8050().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                return;
            }
        }
        abstractC3738.f11598 = new WeakReference(view);
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC3738.mo8050());
        sb.append(".show on ");
        sb.append(abstractC3738.m8045() ? abstractC3738.m8058() : "window");
        String string = sb.toString();
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        Log.i(">>>", string.toString());
        if (f11579 == null) {
            f11579 = new CopyOnWriteArrayList();
        }
        f11579.add(abstractC3738);
        int i = AbstractC3739.f11601[abstractC3738.f11593.ordinal()];
        if (i == 1) {
            Activity activityM8058 = abstractC3738.m8058();
            boolean z = !(abstractC3738 instanceof C8212);
            try {
                if (activityM8058.getWindow().getDecorView().isAttachedToWindow()) {
                    AbstractC6344.m11868(activityM8058, view, z);
                    return;
                } else {
                    activityM8058.getWindow().getDecorView().post(new RunnableC3772(activityM8058, view, z));
                    return;
                }
            } catch (Exception unused) {
                if (activityM8058 == null || activityM8058.isDestroyed()) {
                    return;
                }
                AbstractC6344.m11868(activityM8058, view, z);
                return;
            }
        }
        if (i == 2) {
            C8241 c8241 = new C8241();
            c8241.f22776 = null;
            c8241.f22777 = view;
            c8241.f22778 = abstractC3738;
            c8241.f22776 = new WeakReference(abstractC3738.m8058());
            Activity activityM80582 = abstractC3738.m8058();
            AbstractC2313 supportFragmentManager = activityM80582 instanceof AppCompatActivity ? ((AppCompatActivity) activityM80582).getSupportFragmentManager() : null;
            if (supportFragmentManager == null) {
                Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            } else {
                C2332 c2332 = new C2332(supportFragmentManager);
                c2332.m4427(0, c8241, "DialogX", 1);
                c2332.m4428(true);
            }
            abstractC3738.f11599 = new WeakReference(c8241);
            return;
        }
        if (i != 3) {
            if (abstractC3738.m8057() == null) {
                return;
            }
            m8030(new RunnableC3740(view, abstractC3738, 0));
            return;
        }
        if (f11578 == null) {
            f11578 = new HashMap();
        }
        f11578.put(abstractC3738.mo8050(), new C3741(abstractC3738, view));
        DialogXFloatingWindowActivity dialogXFloatingWindowActivity = DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity();
        if (dialogXFloatingWindowActivity != null && dialogXFloatingWindowActivity.isSameFrom(abstractC3738.m8058().hashCode())) {
            dialogXFloatingWindowActivity.showDialogX(abstractC3738.mo8050());
            return;
        }
        Intent intent = new Intent(m8038(), (Class<?>) DialogXFloatingWindowActivity.class);
        if (abstractC3738.m8058() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", abstractC3738.mo8050());
        intent.putExtra("fromActivityUiStatus", (abstractC3738.m8058() == null || m8041(abstractC3738.m8058()) == null) ? 0 : m8041(abstractC3738.m8058()).getSystemUiVisibility());
        intent.putExtra("from", m8038().hashCode());
        m8038().startActivity(intent);
        if (abstractC3738.m8058() != null) {
            abstractC3738.m8058().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m8029(long j, Runnable runnable) {
        if (j < 0) {
            return;
        }
        if (!AbstractC8248.f22829) {
            runnable.run();
        }
        m8037().postDelayed(runnable, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0 == com.kongzue.dialogx.interfaces.AbstractC3738.f11577) goto L17;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8030(java.lang.Runnable r2) {
        /*
            boolean r0 = p261.AbstractC8248.f22829
            if (r0 == 0) goto L35
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.AbstractC3738.f11577
            if (r0 != 0) goto L12
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            com.kongzue.dialogx.interfaces.AbstractC3738.f11577 = r0
        L12:
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.AbstractC3738.f11577
            if (r0 == 0) goto L2d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = com.kongzue.dialogx.interfaces.AbstractC3738.f11577
            if (r1 != 0) goto L28
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            com.kongzue.dialogx.interfaces.AbstractC3738.f11577 = r1
        L28:
            java.lang.Thread r1 = com.kongzue.dialogx.interfaces.AbstractC3738.f11577
            if (r0 != r1) goto L2d
            goto L35
        L2d:
            android.os.Handler r0 = m8037()
            r0.post(r2)
            return
        L35:
            r2.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.interfaces.AbstractC3738.m8030(java.lang.Runnable):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m8031(View view) {
        if (view == null) {
            return;
        }
        AbstractC3738 abstractC3738 = (AbstractC3738) view.getTag();
        String strConcat = abstractC3738.mo8050().concat(".dismiss");
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        Log.i(">>>", strConcat.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f11579;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(abstractC3738);
        }
        WeakReference weakReference = abstractC3738.f11598;
        if (weakReference != null) {
            weakReference.clear();
        }
        int i = AbstractC3739.f11601[abstractC3738.f11593.ordinal()];
        if (i == 1) {
            AbstractC6344.m11881(view);
            return;
        }
        if (i == 2) {
            WeakReference weakReference2 = abstractC3738.f11599;
            if (weakReference2 == null || weakReference2.get() == null) {
                return;
            }
            ((C8241) abstractC3738.f11599.get()).m4466(true, false);
            return;
        }
        if (i != 3) {
            m8037().post(new RunnableC3740(view, abstractC3738, 1));
            return;
        }
        WeakReference weakReference3 = abstractC3738.f11592;
        if (weakReference3 == null || weakReference3.get() == null) {
            return;
        }
        FrameLayout frameLayoutM8041 = m8041((Activity) abstractC3738.f11592.get());
        if (frameLayoutM8041 != null) {
            frameLayoutM8041.removeView(view);
        }
        ((DialogXFloatingWindowActivity) abstractC3738.f11592.get()).finish(abstractC3738.mo8050());
        m8025();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Activity m8032() {
        WeakReference weakReference = f11576;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f11576.get();
        }
        m8034(null);
        WeakReference weakReference2 = f11576;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f11576.get();
        }
        Activity activityM13766 = C8243.m13766();
        m8034(activityM13766);
        return activityM13766;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static List m8033() {
        return f11579 == null ? new ArrayList() : new CopyOnWriteArrayList(f11579);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m8034(Context context) {
        if (context == null) {
            context = C8243.m13766();
        }
        if (context instanceof Activity) {
            m8035((Activity) context);
        }
        C8243.m13765(context, new C8623(19));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m8035(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC8248.f22831) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f11577 = Looper.getMainLooper().getThread();
            f11576 = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m8040("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m8036(View view) {
        if (view == null || !AbstractC8248.f22833) {
            return;
        }
        view.performHapticFeedback(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Handler m8037() {
        WeakReference weakReference = f11575;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f11575.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f11575 = weakReference2;
        return (Handler) weakReference2.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static ContextWrapper m8038() {
        Activity activityM8032 = m8032();
        if (activityM8032 != null) {
            return activityM8032;
        }
        Application applicationM8042 = m8042();
        if (applicationM8042 != null) {
            return applicationM8042;
        }
        m8040("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m8039(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM8039 = m8039(viewGroup.getChildAt(i));
                if (arrayListM8039 != null) {
                    arrayList.addAll(arrayListM8039);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m8040(String str) {
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        Log.e(">>>", str.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static FrameLayout m8041(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Application m8042() {
        Application application;
        Application application2 = C8243.f22781;
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
        return this.f11596;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo8043() {
        InterfaceC3752 interfaceC3752 = this.f11597;
        if (interfaceC3752 != null) {
            interfaceC3752.mo8068(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean mo8044() {
        DialogX$THEME dialogX$THEME = this.f11582;
        return dialogX$THEME == DialogX$THEME.AUTO ? m8042() == null ? this.f11582 == DialogX$THEME.LIGHT : (m8056().getConfiguration().uiMode & 48) == 16 : dialogX$THEME == DialogX$THEME.LIGHT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m8045() {
        DialogX$IMPL_MODE dialogX$IMPL_MODE = DialogX$IMPL_MODE.VIEW;
        DialogX$IMPL_MODE dialogX$IMPL_MODE2 = this.f11593;
        return dialogX$IMPL_MODE2 == dialogX$IMPL_MODE || dialogX$IMPL_MODE2 == DialogX$IMPL_MODE.FLOATING_ACTIVITY || dialogX$IMPL_MODE2 == DialogX$IMPL_MODE.DIALOG_FRAGMENT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m8046(Lifecycle$State lifecycle$State) {
        C2386 c2386 = this.f11596;
        if (c2386 == null || lifecycle$State == null) {
            return;
        }
        try {
            c2386.m4505(lifecycle$State);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m8047(View view) {
        this.f11598 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract void mo8048();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m8049(float f) {
        return (int) ((f * m8056().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract String mo8050();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m8051(int i) {
        if (!m8045()) {
            return AbstractC6253.m11750(m8042()).inflate(i, (ViewGroup) null);
        }
        if (m8058() != null) {
            return AbstractC6253.m11750(m8058()).inflate(i, (ViewGroup) null);
        }
        m8040("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo8052() {
        WeakReference weakReference = this.f11600;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11598 = null;
        this.f11600 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8053() {
        View currentFocus;
        this.f11586 = true;
        this.f11587 = false;
        this.f11600 = new WeakReference(m8032());
        if (m8058() == null && m8045()) {
            m8034(null);
            if (m8058() == null) {
                m8040("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        int i = 2;
        if (this.f11593 != DialogX$IMPL_MODE.VIEW && (m8058() instanceof InterfaceC2388)) {
            ((InterfaceC2388) m8058()).getLifecycle().mo4503(new C7542(this, i));
        }
        if ((this instanceof C8212) || (currentFocus = m8058().getCurrentFocus()) == null) {
            return;
        }
        ((InputMethodManager) m8058().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8054(EditText editText, boolean z) {
        if (m8058() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m8058().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final View m8055() {
        WeakReference weakReference = this.f11598;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources m8056() {
        return m8058() != null ? m8058().getResources() : m8042() == null ? Resources.getSystem() : m8042().getResources();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final FrameLayout m8057() {
        FrameLayout frameLayoutM8041;
        Activity activityM8058 = m8058();
        if (m8045()) {
            if (activityM8058 == null) {
                activityM8058 = m8032();
                if (activityM8058 == null) {
                    m8040("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f11600 = new WeakReference(activityM8058);
            }
            frameLayoutM8041 = m8041(activityM8058);
        } else {
            frameLayoutM8041 = (FrameLayout) m8055().getParent();
        }
        if (frameLayoutM8041 != null) {
            return (FrameLayout) new WeakReference(frameLayoutM8041).get();
        }
        m8040("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM8058 + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Activity m8058() {
        WeakReference weakReference = this.f11600;
        if (weakReference == null || weakReference.get() == null) {
            this.f11600 = new WeakReference(m8032());
        }
        return (Activity) this.f11600.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m8059(boolean z) {
        return this.f11595[!z ? 1 : 0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m8060(int i) {
        if (m8042() != null) {
            return m8056().getColor(i);
        }
        m8040("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return -16777216;
    }
}
