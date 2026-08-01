package p086r0;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import p001A0.RunnableC0045r;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p061e.C0542r;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0858M1 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public boolean f2948a;

    /* JADX INFO: renamed from: b */
    public boolean f2949b;

    /* JADX INFO: renamed from: c */
    public boolean f2950c;

    /* JADX INFO: renamed from: d */
    public long f2951d;

    /* JADX INFO: renamed from: e */
    public int f2952e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f2953f;

    /* JADX INFO: renamed from: g */
    public WeakReference f2954g;

    /* JADX INFO: renamed from: h */
    public Typeface f2955h;

    /* JADX INFO: renamed from: i */
    public boolean f2956i;

    /* JADX INFO: renamed from: j */
    public final IdentityHashMap f2957j = new IdentityHashMap();

    /* JADX INFO: renamed from: k */
    public final Handler f2958k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public final RunnableC0834E1 f2959l;

    /* JADX INFO: renamed from: m */
    public final RunnableC0834E1 f2960m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [r0.E1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [r0.E1] */
    public C0858M1() {
        final int i2 = 0;
        this.f2959l = new Runnable(this) { // from class: r0.E1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0858M1 f2794b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2794b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView;
                TextView textView2;
                switch (i2) {
                    case 0:
                        C0858M1 c0858m1 = this.f2794b;
                        WeakReference weakReference = c0858m1.f2954g;
                        if (weakReference != null && (textView = (TextView) weakReference.get()) != null) {
                            c0858m1.m1762b(textView);
                            break;
                        }
                        break;
                    default:
                        C0858M1 c0858m12 = this.f2794b;
                        WeakReference weakReference2 = c0858m12.f2954g;
                        if (weakReference2 != null && (textView2 = (TextView) weakReference2.get()) != null) {
                            c0858m12.m1762b(textView2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f2960m = new Runnable(this) { // from class: r0.E1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0858M1 f2794b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2794b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView;
                TextView textView2;
                switch (i3) {
                    case 0:
                        C0858M1 c0858m1 = this.f2794b;
                        WeakReference weakReference = c0858m1.f2954g;
                        if (weakReference != null && (textView = (TextView) weakReference.get()) != null) {
                            c0858m1.m1762b(textView);
                            break;
                        }
                        break;
                    default:
                        C0858M1 c0858m12 = this.f2794b;
                        WeakReference weakReference2 = c0858m12.f2954g;
                        if (weakReference2 != null && (textView2 = (TextView) weakReference2.get()) != null) {
                            c0858m12.m1762b(textView2);
                            break;
                        }
                        break;
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1756a(final C0858M1 c0858m1, final Activity activity) {
        TextView textViewM1759e;
        String string;
        Object objM1760f;
        c0858m1.getClass();
        Iterator it = AbstractC0120h.m253a0(new String[]{"chattingTabUI", "chattingTabUl"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                textViewM1759e = null;
                break;
            }
            Object objM1760f2 = m1760f(activity, (String) it.next());
            textViewM1759e = (objM1760f2 == null || (objM1760f = m1760f(objM1760f2, "b")) == null) ? null : (TextView) m1760f(objM1760f, "e");
            if (textViewM1759e != null) {
                break;
            }
        }
        if (textViewM1759e == null) {
            textViewM1759e = m1759e(activity, 0, new IdentityHashMap());
        } else {
            CharSequence text = textViewM1759e.getText();
            if (!AbstractC0223g.m414a((text == null || (string = text.toString()) == null) ? null : AbstractC0299i.m507C0(string).toString(), "微信")) {
            }
        }
        if (textViewM1759e == null) {
            return;
        }
        WeakReference weakReference = c0858m1.f2954g;
        if ((weakReference != null ? (TextView) weakReference.get() : null) != textViewM1759e) {
            c0858m1.f2954g = new WeakReference(textViewM1759e);
            c0858m1.f2955h = textViewM1759e.getTypeface();
            c0858m1.f2956i = textViewM1759e.getPaint().isFakeBoldText();
        }
        c0858m1.m1763g(textViewM1759e);
        AbstractC1135r.m2473A(textViewM1759e, new C0925n1(11), 800, new ViewOnClickListenerC0837F1(c0858m1, activity, 0));
        IdentityHashMap identityHashMap = c0858m1.f2957j;
        Object c0846i1 = identityHashMap.get(textViewM1759e);
        if (c0846i1 == null) {
            c0846i1 = new C0846I1();
            identityHashMap.put(textViewM1759e, c0846i1);
        }
        final C0846I1 c0846i12 = (C0846I1) c0846i1;
        textViewM1759e.setOnTouchListener(new View.OnTouchListener() { // from class: r0.H1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                C0846I1 c0846i13 = c0846i12;
                if (actionMasked != 0) {
                    if (actionMasked != 1 && actionMasked != 3) {
                        return false;
                    }
                    Runnable runnable = c0846i13.f2896a;
                    if (runnable != null) {
                        view.removeCallbacks(runnable);
                    }
                    c0846i13.f2896a = null;
                    return c0846i13.f2897b;
                }
                c0846i13.f2897b = false;
                Runnable runnable2 = c0846i13.f2896a;
                if (runnable2 != null) {
                    view.removeCallbacks(runnable2);
                }
                RunnableC0045r runnableC0045r = new RunnableC0045r(activity, c0846i13, c0858m1);
                c0846i13.f2896a = runnableC0045r;
                boolean z2 = AbstractC1126i.f3786a;
                view.postDelayed(runnableC0045r, AbstractC0079h.m183g(C1124g.m2435k().getQuickDisplayLongPressMs(), 200, 3000));
                return false;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1757c() {
        boolean z2 = AbstractC1126i.f3786a;
        return C1124g.m2444t() && C1124g.m2443s() && C1124g.m2435k().isHideFriendEnabled() && !C1124g.m2433i().isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1758d(Context context) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2440p()) {
            AbstractC0731a.m1384a("temporary unhide clear", context.getClass().getName());
            C1124g.m2427c();
            try {
                ((C0808h) AbstractC0503h.m988u(C0808h.class)).mo1472a();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static TextView m1759e(Object obj, int i2, IdentityHashMap identityHashMap) {
        TextView textViewM1759e;
        String string;
        if (obj != null && i2 <= 3 && !identityHashMap.containsKey(obj)) {
            identityHashMap.put(obj, Boolean.TRUE);
            if (obj instanceof TextView) {
                TextView textView = (TextView) obj;
                CharSequence text = textView.getText();
                String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0299i.m507C0(string).toString();
                if (string2 == null) {
                    string2 = "";
                }
                if (string2.equals("微信")) {
                    return textView;
                }
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    TextView textViewM1759e2 = m1759e(it.next(), i2 + 1, identityHashMap);
                    if (textViewM1759e2 != null) {
                        return textViewM1759e2;
                    }
                }
            } else {
                for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null && (textViewM1759e = m1759e(obj2, i2 + 1, identityHashMap)) != null) {
                                return textViewM1759e;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m1760f(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            } catch (NoSuchFieldException unused) {
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m1761j(Activity activity) {
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2444t()) {
            AbstractC0731a.m1384a("temporary unhide clear", "quick display disabled");
            m1758d(activity);
            return;
        }
        if (C1124g.m2440p()) {
            AbstractC0731a.m1384a("temporary unhide clear", "toggle off");
            m1758d(activity);
            return;
        }
        AbstractC0731a.m1384a("temporary unhide show", "toggle on");
        if (C1124g.m2444t()) {
            ArrayList arrayListM2433i = C1124g.m2433i();
            ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(arrayListM2433i));
            Iterator it = arrayListM2433i.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0299i.m507C0(((MaskItemBean) it.next()).getMaskId()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            Set<String> setM264A0 = AbstractC0123k.m264A0(arrayList2);
            SharedPreferences.Editor editorEdit = C1124g.m2438n().edit();
            boolean z3 = AbstractC1126i.f3786a;
            if (editorEdit.putStringSet("temp_unhide_close_friends", setM264A0).commit()) {
                AbstractC1126i.f3789d = AbstractC0123k.m265B0(setM264A0);
                C1124g.m2418I();
            } else {
                AbstractC0731a.m1387d("addAllTemporaryUnhideCloseFriends fail");
            }
        } else {
            C1124g.m2427c();
        }
        try {
            ((C0808h) AbstractC0503h.m988u(C0808h.class)).mo1472a();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[PHI: r1
  0x0059: PHI (r1v5 boolean) = (r1v3 boolean), (r1v7 boolean) binds: [B:43:0x0090, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1762b(TextView textView) {
        Typeface typeface;
        if (!AbstractC0223g.m414a(Looper.myLooper(), Looper.getMainLooper())) {
            m1763g(textView);
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if (this.f2953f) {
            boolean z4 = AbstractC1126i.f3786a;
            if (C1124g.m2443s() && C1124g.m2435k().getHideTopBarUnreadBold()) {
                Typeface typeface2 = textView.getTypeface();
                if (typeface2 == null || typeface2.getStyle() != 1) {
                    Typeface typeface3 = this.f2955h;
                    if (typeface3 == null && (typeface3 = textView.getTypeface()) == null) {
                        typeface3 = Typeface.DEFAULT;
                    }
                    textView.setTypeface(typeface3, 1);
                    z2 = true;
                }
                if (!textView.getPaint().isFakeBoldText()) {
                    textView.getPaint().setFakeBoldText(true);
                }
            } else {
                Typeface typeface4 = this.f2955h;
                Typeface typeface5 = typeface4 == null ? Typeface.DEFAULT : typeface4;
                int style = typeface4 != null ? typeface4.getStyle() : 0;
                if (!AbstractC0223g.m414a(textView.getTypeface(), typeface5) || (typeface = textView.getTypeface()) == null || typeface.getStyle() != style) {
                    textView.setTypeface(typeface5, style);
                    z2 = true;
                }
                if (textView.getPaint().isFakeBoldText() != this.f2956i) {
                    textView.getPaint().setFakeBoldText(this.f2956i);
                } else {
                    z3 = z2;
                }
            }
        }
        if (z3) {
            textView.invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1763g(TextView textView) {
        WeakReference weakReference = this.f2954g;
        if ((weakReference != null ? (TextView) weakReference.get() : null) != textView) {
            return;
        }
        Handler handler = this.f2958k;
        RunnableC0834E1 runnableC0834E1 = this.f2959l;
        handler.removeCallbacks(runnableC0834E1);
        RunnableC0834E1 runnableC0834E12 = this.f2960m;
        handler.removeCallbacks(runnableC0834E12);
        handler.post(runnableC0834E1);
        handler.postDelayed(runnableC0834E12, 160L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1764h(boolean z2) {
        TextView textView;
        this.f2953f = z2;
        WeakReference weakReference = this.f2954g;
        if (weakReference == null || (textView = (TextView) weakReference.get()) == null) {
            return;
        }
        m1763g(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[PHI: r0
  0x0038: PHI (r0v14 android.app.Application) = (r0v13 android.app.Application), (r0v17 android.app.Application) binds: [B:13:0x002a, B:18:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Sensor defaultSensor;
        if (!this.f2948a) {
            context.registerReceiver(new C0542r(2, this), new IntentFilter("android.intent.action.SCREEN_OFF"));
            this.f2948a = true;
        }
        if (!this.f2949b) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new C0911j(this, 6));
                this.f2949b = true;
            } else {
                application = context instanceof Application ? (Application) context : null;
                if (application != null) {
                }
            }
        }
        if (AbstractC0223g.m414a(loadPackageParam.packageName, loadPackageParam.processName) && !this.f2950c) {
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                context = applicationContext2;
            }
            Object systemService = context.getSystemService("sensor");
            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
            if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(1)) != null && sensorManager.registerListener(new C0855L1(this, context), defaultSensor, 2)) {
                this.f2950c = true;
            }
        }
        ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader, "classLoader");
        AbstractC0514f.m1025b(AbstractC0514f.f1622b.mo1021l(classLoader, "android.app.Activity"), "onResume", new C0852K1(this, 0));
        ClassLoader classLoader2 = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader2, "classLoader");
        AbstractC0514f.m1025b(AbstractC0514f.f1622b.mo1021l(classLoader2, "android.app.Activity"), "onWindowFocusChanged", Boolean.TYPE, new C0852K1(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1765i(final Activity activity) {
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2444t()) {
            m1758d(activity);
            return;
        }
        if (C1124g.m2440p()) {
            m1758d(activity);
            return;
        }
        if (AbstractC0307q.m534d0(AbstractC0299i.m507C0(C1124g.m2435k().getTripleTapPassword()).toString())) {
            m1761j(activity);
            return;
        }
        final EditText editText = new EditText(activity);
        editText.setInputType(129);
        editText.setHint("请输入密码");
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle("验证").setView(editText).setPositiveButton("确定", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: r0.G1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = alertDialogCreate;
                alertDialog.getButton(-1).setOnClickListener(new ViewOnClickListenerC0853L(editText, activity, this, alertDialog, 1));
            }
        });
        alertDialogCreate.show();
    }
}
