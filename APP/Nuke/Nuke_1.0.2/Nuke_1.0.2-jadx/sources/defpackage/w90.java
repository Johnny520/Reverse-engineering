package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w90 extends gx2 {
    public static XC_MethodHook.Unhook n;
    public static final w90 d = new w90(false);
    public static final int e = R.string.display_message_details;
    public static final int f = R.string.display_message_details_description;
    public static final wm0 g = wm0.i;
    public static final String h = "DisplayMessageDetails";
    public static final Handler i = new Handler(Looper.getMainLooper());
    public static final Set j = Collections.newSetFromMap(new WeakHashMap());
    public static final Map k = Collections.synchronizedMap(new WeakHashMap());
    public static final Map l = Collections.synchronizedMap(new WeakHashMap());
    public static final AtomicBoolean m = new AtomicBoolean(false);
    public static final int o = Color.rgb(17, 18, 17);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x01b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0209 A[EDGE_INSN: B:108:0x0209->B:95:0x0209 BREAK  A[LOOP:0: B:75:0x01b5->B:111:0x01b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fc  */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(jg3 jg3Var) {
        Object obj;
        String resourceEntryName;
        ViewGroup.MarginLayoutParams layoutParams;
        Object objN0 = mg.n0(0, jg3Var.a());
        if (objN0 == null) {
            return;
        }
        Object objN02 = mg.n0(1, jg3Var.a());
        Integer num = objN02 instanceof Integer ? (Integer) objN02 : null;
        if (num == null || (obj = jg3Var.a.thisObject) == null) {
            return;
        }
        sg1 sg1VarV = op0.y(obj).v();
        sg1VarV.b();
        sg1VarV.b = "getItem";
        Class cls = Integer.TYPE;
        cls.getClass();
        sg1VarV.d(cls);
        Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(num);
        if (objG0 == null) {
            return;
        }
        hi0 hi0VarR = op0.y(objG0).r();
        hi0VarR.b();
        hi0VarR.b = "field_createTime";
        Object objG02 = ((pi0) du.o0(hi0VarR.c())).g0();
        Long l2 = objG02 instanceof Long ? (Long) objG02 : null;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            js.d.getClass();
            View viewJ = js.j(objN0);
            ViewGroup viewGroup = viewJ instanceof ViewGroup ? (ViewGroup) viewJ : null;
            if (viewGroup == null) {
                return;
            }
            int identifier = viewGroup.getResources().getIdentifier("bk4", "id", viewGroup.getContext().getPackageName());
            if (identifier == 0) {
                if (m.compareAndSet(false, true)) {
                    hg3.d(h, "Message mask layout resource bk4 is unavailable");
                    return;
                }
                return;
            }
            View viewFindViewById = viewGroup.findViewById(identifier);
            ?? r0 = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : 0;
            if (r0 == 0) {
                if (m.compareAndSet(false, true)) {
                    hg3.d(h, "Message mask layout resource bk4 is unavailable");
                    return;
                }
                return;
            }
            Object tag = r0.getTag(R.id.display_message_details_time_view);
            TextView textView = tag instanceof TextView ? (TextView) tag : null;
            if ((textView != null ? textView.getParent() : null) != r0) {
                if (textView != null) {
                    r0.setTag(R.id.display_message_details_time_view, null);
                }
                if (r0 instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(14);
                    layoutParams = layoutParams2;
                } else if (r0 instanceof FrameLayout) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2, 49);
                } else {
                    textView = null;
                }
                w90 w90Var = d;
                Context context = r0.getContext();
                context.getClass();
                w90Var.getClass();
                layoutParams.topMargin = -((int) ((context.getResources().getDisplayMetrics().density * 5.0f) + 0.5f));
                TextView textView2 = new TextView(r0.getContext());
                textView2.setTextSize(11.0f);
                textView2.setGravity(17);
                textView2.setIncludeFontPadding(false);
                r0.addView(textView2, layoutParams);
                r0.setTag(R.id.display_message_details_time_view, textView2);
                Set set = j;
                set.getClass();
                synchronized (set) {
                    set.add(textView2);
                }
                textView = textView2;
            }
            if (textView == null) {
                return;
            }
            Context context2 = viewGroup.getContext();
            context2.getClass();
            int i2 = (int) ((5.0f * context2.getResources().getDisplayMetrics().density) + 0.5f);
            if (viewGroup.getPaddingTop() < i2) {
                k.putIfAbsent(viewGroup, new v90(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom()));
                viewGroup.setPadding(viewGroup.getPaddingLeft(), i2, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            while (r0 != 0) {
                if (r0 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) r0;
                    l.putIfAbsent(r0, new u90(viewGroup2.getClipChildren(), viewGroup2.getClipToPadding()));
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                if (r0 == viewGroup) {
                    break;
                }
                if (r0.getId() == -1 || r0.getId() == 0) {
                    resourceEntryName = null;
                    if (!t11.l(resourceEntryName, "bn1")) {
                        break;
                    }
                    Object parent = r0.getParent();
                    r0 = parent instanceof View ? (View) parent : 0;
                } else {
                    try {
                        resourceEntryName = r0.getResources().getResourceEntryName(r0.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (!t11.l(resourceEntryName, "bn1")) {
                    }
                }
            }
            textView.setTextColor((viewGroup.getResources().getConfiguration().uiMode & 48) != 32 ? o : -1);
            textView.setText(DateFormat.format("HH:mm:ss", jLongValue));
            textView.setVisibility(0);
            textView.bringToFront();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        js.d.getClass();
        Method method = (Method) js.h.getValue();
        method.getClass();
        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method, new kg3(this, null, new gs(17)));
        unhookHookMethod.getClass();
        n = unhookHookMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void i() {
        List listF0;
        ArrayList arrayList;
        ArrayList arrayList2;
        XC_MethodHook.Unhook unhook = n;
        Object x92Var = null;
        n = null;
        if (unhook != null) {
            try {
                unhook.unhook();
                x92Var = a83.a;
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            d.getClass();
            hg3.d(h, "Unable to remove message details hook: ".concat(fg1.Q(thA)));
        }
        Set set = j;
        set.getClass();
        synchronized (set) {
            listF0 = du.F0(set);
            set.clear();
        }
        Map map = k;
        map.getClass();
        synchronized (map) {
            try {
                Set<Map.Entry> setEntrySet = map.entrySet();
                arrayList = new ArrayList(eu.B(setEntrySet, 10));
                for (Map.Entry entry : setEntrySet) {
                    arrayList.add(new ow1(entry.getKey(), entry.getValue()));
                }
                k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Map map2 = l;
        map2.getClass();
        synchronized (map2) {
            try {
                Set<Map.Entry> setEntrySet2 = map2.entrySet();
                arrayList2 = new ArrayList(eu.B(setEntrySet2, 10));
                for (Map.Entry entry2 : setEntrySet2) {
                    arrayList2.add(new ow1(entry2.getKey(), entry2.getValue()));
                }
                l.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        s1 s1Var = new s1(listF0, arrayList, arrayList2, 8);
        if (t11.l(Looper.myLooper(), Looper.getMainLooper())) {
            s1Var.a();
        } else {
            i.post(new m2(7, s1Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }
}
