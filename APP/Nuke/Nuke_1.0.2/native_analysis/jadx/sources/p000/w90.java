package p000;

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

    /* JADX INFO: renamed from: n */
    public static XC_MethodHook.Unhook f12420n;

    /* JADX INFO: renamed from: d */
    public static final w90 f12410d = new w90(false);

    /* JADX INFO: renamed from: e */
    public static final int f12411e = R.string.display_message_details;

    /* JADX INFO: renamed from: f */
    public static final int f12412f = R.string.display_message_details_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f12413g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f12414h = "DisplayMessageDetails";

    /* JADX INFO: renamed from: i */
    public static final Handler f12415i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public static final Set f12416j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k */
    public static final Map f12417k = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: l */
    public static final Map f12418l = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: m */
    public static final AtomicBoolean f12419m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    public static final int f12421o = Color.rgb(17, 18, 17);

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
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5861q(jg3 jg3Var) {
        Object obj;
        String resourceEntryName;
        ViewGroup.MarginLayoutParams layoutParams;
        Object objM3099n0 = AbstractC0460mg.m3099n0(0, jg3Var.m2496a());
        if (objM3099n0 == null) {
            return;
        }
        Object objM3099n02 = AbstractC0460mg.m3099n0(1, jg3Var.m2496a());
        Integer num = objM3099n02 instanceof Integer ? (Integer) objM3099n02 : null;
        if (num == null || (obj = jg3Var.f5028a.thisObject) == null) {
            return;
        }
        sg1 sg1VarM3244v = op0.m3602y(obj).m3244v();
        sg1VarM3244v.m6411b();
        sg1VarM3244v.f13871b = "getItem";
        Class cls = Integer.TYPE;
        cls.getClass();
        sg1VarM3244v.m4864d(cls);
        Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(num);
        if (objM6415g0 == null) {
            return;
        }
        hi0 hi0VarM3241r = op0.m3602y(objM6415g0).m3241r();
        hi0VarM3241r.m6411b();
        hi0VarM3241r.f13871b = "field_createTime";
        Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
        Long l = objM3867g0 instanceof Long ? (Long) objM3867g0 : null;
        if (l != null) {
            long jLongValue = l.longValue();
            C0361js.f5188d.getClass();
            View viewM2556j = C0361js.m2556j(objM3099n0);
            ViewGroup viewGroup = viewM2556j instanceof ViewGroup ? (ViewGroup) viewM2556j : null;
            if (viewGroup == null) {
                return;
            }
            int identifier = viewGroup.getResources().getIdentifier("bk4", "id", viewGroup.getContext().getPackageName());
            if (identifier == 0) {
                if (f12419m.compareAndSet(false, true)) {
                    hg3.m2166d(f12414h, "Message mask layout resource bk4 is unavailable");
                    return;
                }
                return;
            }
            View viewFindViewById = viewGroup.findViewById(identifier);
            ?? r0 = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : 0;
            if (r0 == 0) {
                if (f12419m.compareAndSet(false, true)) {
                    hg3.m2166d(f12414h, "Message mask layout resource bk4 is unavailable");
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
                w90 w90Var = f12410d;
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
                Set set = f12416j;
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
            int i = (int) ((5.0f * context2.getResources().getDisplayMetrics().density) + 0.5f);
            if (viewGroup.getPaddingTop() < i) {
                f12417k.putIfAbsent(viewGroup, new v90(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom()));
                viewGroup.setPadding(viewGroup.getPaddingLeft(), i, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            while (r0 != 0) {
                if (r0 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) r0;
                    f12418l.putIfAbsent(r0, new u90(viewGroup2.getClipChildren(), viewGroup2.getClipToPadding()));
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                if (r0 == viewGroup) {
                    break;
                }
                if (r0.getId() == -1 || r0.getId() == 0) {
                    resourceEntryName = null;
                    if (!t11.m5086l(resourceEntryName, "bn1")) {
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
                    if (!t11.m5086l(resourceEntryName, "bn1")) {
                    }
                }
            }
            textView.setTextColor((viewGroup.getResources().getConfiguration().uiMode & 48) != 32 ? f12421o : -1);
            textView.setText(DateFormat.format("HH:mm:ss", jLongValue));
            textView.setVisibility(0);
            textView.bringToFront();
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f12414h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        C0361js.f5188d.getClass();
        Method method = (Method) C0361js.f5192h.getValue();
        method.getClass();
        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method, new kg3(this, null, new C0251gs(17)));
        unhookHookMethod.getClass();
        f12420n = unhookHookMethod;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        List listM1148F0;
        ArrayList arrayList;
        ArrayList arrayList2;
        XC_MethodHook.Unhook unhook = f12420n;
        Object x92Var = null;
        f12420n = null;
        if (unhook != null) {
            try {
                unhook.unhook();
                x92Var = a83.f116a;
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            f12410d.getClass();
            hg3.m2166d(f12414h, "Unable to remove message details hook: ".concat(fg1.m1624Q(thM6237a)));
        }
        Set set = f12416j;
        set.getClass();
        synchronized (set) {
            listM1148F0 = AbstractC0142du.m1148F0(set);
            set.clear();
        }
        Map map = f12417k;
        map.getClass();
        synchronized (map) {
            try {
                Set<Map.Entry> setEntrySet = map.entrySet();
                arrayList = new ArrayList(AbstractC0179eu.m1421B(setEntrySet, 10));
                for (Map.Entry entry : setEntrySet) {
                    arrayList.add(new ow1(entry.getKey(), entry.getValue()));
                }
                f12417k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Map map2 = f12418l;
        map2.getClass();
        synchronized (map2) {
            try {
                Set<Map.Entry> setEntrySet2 = map2.entrySet();
                arrayList2 = new ArrayList(AbstractC0179eu.m1421B(setEntrySet2, 10));
                for (Map.Entry entry2 : setEntrySet2) {
                    arrayList2.add(new ow1(entry2.getKey(), entry2.getValue()));
                }
                f12418l.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C0678s1 c0678s1 = new C0678s1(listM1148F0, arrayList, arrayList2, 8);
        if (t11.m5086l(Looper.myLooper(), Looper.getMainLooper())) {
            c0678s1.mo6a();
        } else {
            f12415i.post(new RunnableC0446m2(7, c0678s1));
        }
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f12412f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f12411e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f12413g;
    }
}
