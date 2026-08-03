package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import io.github.libxposed.api.XposedInterface;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import p000a.C0186K3;
import p000a.C0251Ne;
import p000a.C0518ca;
import p000a.C0816s4;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.Ue */
/* JADX INFO: loaded from: classes.dex */
public final class C0376Ue implements IPlugin {

    /* JADX INFO: renamed from: t */
    public static volatile C0376Ue f1410t;

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f1411a;

    /* JADX INFO: renamed from: b */
    public View f1412b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Activity> f1413c;

    /* JADX INFO: renamed from: d */
    public Class<?> f1414d;

    /* JADX INFO: renamed from: e */
    public boolean f1415e;

    /* JADX INFO: renamed from: f */
    public int f1416f;

    /* JADX INFO: renamed from: g */
    public long f1417g;

    /* JADX INFO: renamed from: h */
    public boolean f1418h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f1419i;

    /* JADX INFO: renamed from: j */
    public float f1420j;

    /* JADX INFO: renamed from: k */
    public float f1421k;

    /* JADX INFO: renamed from: n */
    public int f1424n;

    /* JADX INFO: renamed from: o */
    public a f1425o;

    /* JADX INFO: renamed from: q */
    public boolean f1427q;

    /* JADX INFO: renamed from: s */
    public int f1429s;

    /* JADX INFO: renamed from: l */
    public final Handler f1422l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    public final RunnableC0221M2 f1423m = new RunnableC0221M2(16, this);

    /* JADX INFO: renamed from: p */
    public final Handler f1426p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r */
    public final b f1428r = new b();

    /* JADX INFO: renamed from: a.Ue$a */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f1431b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Activity f1432c;

        public a(View view, Activity activity) {
            this.f1431b = view;
            this.f1432c = activity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C0376Ue c0376Ue = C0376Ue.this;
            c0376Ue.f1424n++;
            View view = this.f1431b;
            if (c0376Ue.m1006d(this.f1432c, view) || c0376Ue.f1424n >= 5) {
                c0376Ue.m1007e(view);
                WeakReference<View> weakReference = c0376Ue.f1411a;
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    c0376Ue.m1008f();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.Ue$b */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0376Ue c0376Ue = C0376Ue.this;
            if (c0376Ue.f1427q) {
                View view = c0376Ue.f1412b;
                WeakReference<Activity> weakReference = c0376Ue.f1413c;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (view != null && activity != null && view.getWindowToken() != null) {
                    WeakReference<View> weakReference2 = c0376Ue.f1411a;
                    View view2 = weakReference2 != null ? weakReference2.get() : null;
                    if (view2 == null || !view2.isAttachedToWindow() || view2.getVisibility() != 0) {
                        c0376Ue.m1006d(activity, view);
                    }
                }
                c0376Ue.f1426p.postDelayed(this, 5000L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1003a(Activity activity, View view) {
        this.f1412b = view;
        this.f1413c = new WeakReference<>(activity);
        C0186K3.f638a.getClass();
        C0653jc c0653jcM508i = C0186K3.a.m508i();
        if (C0186K3.a.m511l()) {
            if (c0653jcM508i.f2451u || c0653jcM508i.f2454x) {
                C0908x1.m2194b(C0944z.m2227g("TempUnhideTrigger: attachIfNeeded (rootView=", view.getClass().getSimpleName(), ")"));
                m1005c(activity);
                if (m1006d(activity, view)) {
                    m1008f();
                    return;
                }
                this.f1424n = 0;
                m1007e(view);
                a aVar = new a(view, activity);
                this.f1425o = aVar;
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                view.postDelayed(new RunnableC0273P0(this, 15, view), 3000L);
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:178:0x03bf */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v26, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v27, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v28, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0348 A[PHI: r21
  0x0348: PHI (r21v3 a.jc) = (r21v0 a.jc), (r21v8 a.jc) binds: [B:181:0x0417, B:147:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1004b(MotionEvent motionEvent, Activity activity) {
        C0653jc c0653jc;
        boolean z;
        Object objM2206a;
        int i;
        int i2;
        float f;
        Point point;
        int textSize;
        int i3;
        int i4;
        int lineRight;
        Object objM2206a2;
        int i5;
        int i6;
        int i7;
        int i8;
        C0186K3.f638a.getClass();
        C0653jc c0653jcM508i = C0186K3.a.m508i();
        if (C0186K3.a.m511l()) {
            if (c0653jcM508i.f2451u || c0653jcM508i.f2454x) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3 && this.f1415e) {
                                this.f1418h = false;
                                this.f1422l.removeCallbacks(this.f1423m);
                                this.f1415e = false;
                                return;
                            }
                            return;
                        }
                        if (this.f1415e && this.f1418h) {
                            int scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
                            float x = motionEvent.getX() - this.f1420j;
                            float y = motionEvent.getY() - this.f1421k;
                            if ((y * y) + (x * x) > scaledTouchSlop * scaledTouchSlop) {
                                this.f1418h = false;
                                this.f1422l.removeCallbacks(this.f1423m);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.f1415e) {
                        this.f1429s = 0;
                        this.f1418h = false;
                        this.f1422l.removeCallbacks(this.f1423m);
                        if (c0653jcM508i.f2451u && !this.f1419i) {
                            C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                            if (c0653jcM508i2.f2451u) {
                                int i9 = c0653jcM508i2.f2453w;
                                long jMax = Math.max(i9 > 0 ? i9 : 500L, ViewConfiguration.getDoubleTapTimeout());
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                int i10 = jUptimeMillis - this.f1417g < jMax ? this.f1416f + 1 : 1;
                                this.f1416f = i10;
                                this.f1417g = jUptimeMillis;
                                int i11 = c0653jcM508i2.f2452v;
                                int i12 = i11 > 0 ? i11 : 3;
                                C0908x1.m2194b("TempUnhideTrigger: tap count=" + i10 + "/" + i12 + " (window=" + jMax + "ms)");
                                if (this.f1416f == i12) {
                                    this.f1416f = 0;
                                    C0908x1.m2194b(C0944z.m2223c(i12, "TempUnhideTrigger: multi-click TRIGGERED (", " taps)"));
                                    C0653jc c0653jcM508i3 = C0186K3.a.m508i();
                                    if (C0186K3.a.m511l() && c0653jcM508i3.f2451u) {
                                        C0915x8 c0915x8 = C0915x8.f3530a;
                                        C0518ca.c cVar = C0518ca.c.f1901a;
                                        C0518ca.b bVar = C0518ca.b.f1898b;
                                        Set<? extends C0518ca.b> setSingleton = Collections.singleton(C0518ca.b.f1897a);
                                        C0631i9.m1481d(setSingleton, "singleton(...)");
                                        if (c0915x8.m2205c(bVar, cVar, setSingleton)) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: multi-click unhide triggered"}, 1));
                                            Context context = C0889w1.f3488p;
                                            if (context != null) {
                                                C0653jc c0653jcM508i4 = C0186K3.a.m508i();
                                                if (c0653jcM508i4.f2426R) {
                                                    String str = c0653jcM508i4.f2427S;
                                                    if (C0034Be.m101P(str)) {
                                                        str = "刻舟求剑";
                                                    }
                                                    Toast.makeText(context, str, 0).show();
                                                }
                                            }
                                            C0816s4.a.m1916a();
                                        } else {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: multi-click unhide BLOCKED (state=" + C0915x8.f3531b + ")"}, 1));
                                        }
                                    }
                                }
                            }
                        }
                        this.f1419i = false;
                        this.f1415e = false;
                        return;
                    }
                    return;
                }
                WeakReference<View> weakReference = this.f1411a;
                View view = weakReference != null ? weakReference.get() : null;
                TextView textView = view instanceof TextView ? (TextView) view : null;
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                float f2 = displayMetrics.density;
                int i13 = displayMetrics.widthPixels;
                int i14 = displayMetrics.heightPixels;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (textView != null && textView.getVisibility() == 0 && textView.isAttachedToWindow()) {
                    Layout layout = textView.getLayout();
                    if (layout != null && layout.getLineCount() > 0) {
                        float lineLeft = layout.getLineLeft(0);
                        float lineRight2 = layout.getLineRight(0);
                        int lineTop = layout.getLineTop(0);
                        int lineBottom = layout.getLineBottom(0);
                        if (lineRight2 <= lineLeft || lineBottom <= lineTop) {
                            c0653jc = c0653jcM508i;
                            i2 = 0;
                            f = f2;
                            point = null;
                        } else {
                            i2 = 0;
                            int[] iArr = new int[2];
                            textView.getLocationOnScreen(iArr);
                            int totalPaddingLeft = textView.getTotalPaddingLeft() + iArr[0] + ((int) ((lineLeft + lineRight2) / 2));
                            int totalPaddingTop = ((lineTop + lineBottom) / 2) + textView.getTotalPaddingTop() + iArr[1];
                            if (totalPaddingLeft < 0 || totalPaddingLeft > 20000 || totalPaddingTop < 0 || totalPaddingTop > 20000) {
                                f = f2;
                                c0653jc = c0653jcM508i;
                                C0908x1.m2197e(Arrays.copyOf(new Object[]{"TempUnhideTrigger: suspicious geometry loc=(" + iArr[0] + "," + iArr[1] + ") lineLR=(" + lineLeft + "," + lineRight2 + ")"}, 1));
                            } else {
                                c0653jc = c0653jcM508i;
                                f = f2;
                            }
                            point = new Point(totalPaddingLeft, totalPaddingTop);
                        }
                        if (point != null && ((i7 = point.x) < 0 || i7 > i13 || (i8 = point.y) < 0 || i8 > i14)) {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"TempUnhideTrigger: center(" + i7 + "," + point.y + ") out of screen(" + i13 + "x" + i14 + "), fallback"}, 1));
                            point = null;
                        }
                        if (point == null) {
                            int[] iArr2 = new int[2];
                            try {
                                textView.getLocationOnScreen(iArr2);
                                objM2206a2 = Boolean.TRUE;
                            } catch (Throwable th) {
                                objM2206a2 = C0920xd.m2206a(th);
                            }
                            Object obj = Boolean.FALSE;
                            if (objM2206a2 instanceof C0901wd.a) {
                                objM2206a2 = obj;
                            }
                            if (!((Boolean) objM2206a2).booleanValue() || (i5 = iArr2[i2]) < 0 || i5 > i13 || (i6 = iArr2[1]) < 0 || i6 > i14 || textView.getWidth() <= 0 || textView.getHeight() <= 0) {
                                Rect rect = new Rect();
                                if (textView.getGlobalVisibleRect(rect) && rect.width() > 0 && rect.height() > 0) {
                                    point = new Point(rect.centerX(), rect.centerY());
                                }
                            } else {
                                point = new Point((textView.getWidth() / 2) + iArr2[i2], (textView.getHeight() / 2) + iArr2[1]);
                            }
                        }
                        if (point == null) {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"TempUnhideTrigger: title center unresolvable, fallback to top-band"}, 1));
                            C0789qf c0789qf = C0789qf.f3115a;
                            float rawY2 = motionEvent.getRawY();
                            c0789qf.getClass();
                            if (rawY2 > ((int) (80 * activity.getResources().getDisplayMetrics().density))) {
                                i = i2;
                            }
                            z = i;
                        } else {
                            Layout layout2 = textView.getLayout();
                            if (layout2 == null) {
                                textSize = (int) (textView.getTextSize() * (textView.getText() != null ? r3.length() : 2));
                                int iM748C = C0267Oc.m748C((((int) (8 * f)) * 2) + textSize, (int) (48 * f), (int) (160 * f));
                                i3 = iM748C / 2;
                                i4 = point.x;
                                if (rawX >= i4 - i3 || rawX > i4 + i3) {
                                    z = 0;
                                    if (z == 0) {
                                        C0908x1.m2194b("TempUnhideTrigger: square center=(" + i4 + "," + point.y + ") side=" + iM748C + " touch(" + rawX + "," + rawY + ") outside");
                                    }
                                } else {
                                    int i15 = point.y;
                                    if (rawY >= i15 - i3 && rawY <= i15 + i3) {
                                        z = 1;
                                    }
                                    if (z == 0) {
                                    }
                                }
                            } else {
                                if (layout2.getLineCount() > 0) {
                                    int i16 = i2;
                                    lineRight = (int) (layout2.getLineRight(i16) - layout2.getLineLeft(i16));
                                } else {
                                    lineRight = 0;
                                }
                                Integer numValueOf = lineRight > 0 ? Integer.valueOf(lineRight) : null;
                                if (numValueOf != null) {
                                    textSize = numValueOf.intValue();
                                }
                                int iM748C2 = C0267Oc.m748C((((int) (8 * f)) * 2) + textSize, (int) (48 * f), (int) (160 * f));
                                i3 = iM748C2 / 2;
                                i4 = point.x;
                                if (rawX >= i4 - i3) {
                                    z = 0;
                                    if (z == 0) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    c0653jc = c0653jcM508i;
                    C0789qf c0789qf2 = C0789qf.f3115a;
                    float rawY3 = motionEvent.getRawY();
                    c0789qf2.getClass();
                    i = rawY3 <= ((float) ((int) (((float) 80) * activity.getResources().getDisplayMetrics().density))) ? 1 : 0;
                    z = i;
                }
                C0251Ne c0251Ne = C0251Ne.f857a;
                View view2 = this.f1412b;
                Class<?> cls = this.f1414d;
                c0251Ne.getClass();
                StringBuilder sb = new StringBuilder();
                int i17 = 0;
                int i18 = 0;
                for (InterfaceC0269Oe interfaceC0269Oe : C0251Ne.f858b) {
                    try {
                        objM2206a = interfaceC0269Oe.mo750a(activity, view2, cls);
                    } catch (Throwable th2) {
                        objM2206a = C0920xd.m2206a(th2);
                    }
                    Object obj2 = C0251Ne.a.f861c;
                    if (objM2206a instanceof C0901wd.a) {
                        objM2206a = obj2;
                    }
                    C0251Ne.a aVar = (C0251Ne.a) objM2206a;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        i17++;
                    } else if (iOrdinal == 1) {
                        i18++;
                    } else if (iOrdinal != 2) {
                        throw new C0266Ob();
                    }
                    sb.append(interfaceC0269Oe.mo751b() + "=" + aVar + " ");
                }
                boolean z2 = (i17 > 0 && i18 == 0) || i17 > i18;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"TabDetector: " + ((Object) sb) + "→ " + z2 + " (yes=" + i17 + " no=" + i18 + ")"}, 1));
                StringBuilder sb2 = new StringBuilder("TempUnhideTrigger: DOWN areaHit=");
                sb2.append(z);
                sb2.append(" tabHit=");
                sb2.append(z2);
                C0908x1.m2194b(Arrays.copyOf(new Object[]{sb2.toString()}, 1));
                boolean z3 = z != 0 && z2;
                this.f1415e = z3;
                if (z3) {
                    int i19 = this.f1429s + 1;
                    this.f1429s = i19;
                    if (i19 >= 5) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2223c(i19, "TempUnhideTrigger: ", " consecutive DOWN without UP — touch may be intercepted by system")}, 1));
                        this.f1429s = 0;
                    }
                    C0908x1.m2194b("TempUnhideTrigger: DOWN on WeChat title (x=" + ((int) motionEvent.getRawX()) + ",y=" + ((int) motionEvent.getRawY()) + ")");
                    this.f1419i = false;
                    C0653jc c0653jc2 = c0653jc;
                    if (c0653jc2.f2454x) {
                        this.f1418h = true;
                        this.f1420j = motionEvent.getX();
                        this.f1421k = motionEvent.getY();
                        this.f1422l.removeCallbacks(this.f1423m);
                        int i20 = c0653jc2.f2455y;
                        this.f1422l.postDelayed(this.f1423m, i20 > 0 ? i20 : 800L);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1005c(Activity activity) {
        Window.Callback callback;
        Window window = activity.getWindow();
        if (window == null || (callback = window.getCallback()) == null || (callback instanceof WindowCallbackC0941yf)) {
            return;
        }
        window.setCallback(new WindowCallbackC0941yf(callback, this, activity));
        this.f1413c = new WeakReference<>(activity);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: TouchInterceptingCallback installed"}, 1));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1006d(Activity activity, View view) {
        C0789qf.f3115a.getClass();
        TextView textViewM1844a = C0789qf.m1844a(activity, view);
        if (textViewM1844a == null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: Title view not found this pass"}, 1));
            return false;
        }
        this.f1411a = new WeakReference<>(textViewM1844a);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: Title resolved: " + textViewM1844a.getClass().getName() + " text='" + ((Object) textViewM1844a.getText()) + "'"}, 1));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m1007e(View view) {
        a aVar = this.f1425o;
        if (aVar != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                C0920xd.m2206a(th);
            }
            this.f1425o = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1008f() {
        if (this.f1427q) {
            return;
        }
        this.f1427q = true;
        Handler handler = this.f1426p;
        b bVar = this.f1428r;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, 5000L);
        C0908x1.m2194b("TempUnhideTrigger: watchdog started (5s interval)");
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        Class<?> clsM13b;
        C0631i9.m1482e(c0173j8, "session");
        f1410t = this;
        try {
            clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.LauncherUI");
            this.f1414d = clsM13b;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (clsM13b == null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"TempUnhideTrigger: LauncherUI class NOT FOUND — touch interception disabled (no fallback to Activity)"}, 1));
            return;
        }
        final int i = 0;
        C0173J8.m466d(c0173j8, "F_tempUnhide", clsM13b.getName(), "onPostResume", new Class[0], new InterfaceC0064D7(this) { // from class: a.Te

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0376Ue f1354b;

            {
                this.f1354b = this;
            }

            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                switch (i) {
                    case 0:
                        C0631i9.m1482e(chain, "chain");
                        chain.proceed();
                        Object thisObject = chain.getThisObject();
                        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            this.f1354b.m1005c(activity);
                        }
                        break;
                    default:
                        C0631i9.m1482e(chain, "chain");
                        chain.proceed();
                        C0376Ue c0376Ue = this.f1354b;
                        c0376Ue.getClass();
                        C0726n9.m1677t("TempUnhideTrigger: onConfigurationChanged — resetting cached state");
                        c0376Ue.f1411a = null;
                        c0376Ue.f1416f = 0;
                        c0376Ue.f1417g = 0L;
                        View view = c0376Ue.f1412b;
                        WeakReference<Activity> weakReference = c0376Ue.f1413c;
                        Activity activity2 = weakReference != null ? weakReference.get() : null;
                        if (view != null && activity2 != null) {
                            c0376Ue.m1006d(activity2, view);
                        }
                        break;
                }
                return null;
            }
        });
        Class<?> cls = this.f1414d;
        C0631i9.m1479b(cls);
        final int i2 = 1;
        C0173J8.m466d(c0173j8, "F_tempUnhide", cls.getName(), "onConfigurationChanged", new Class[]{Configuration.class}, new InterfaceC0064D7(this) { // from class: a.Te

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0376Ue f1354b;

            {
                this.f1354b = this;
            }

            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj) {
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                switch (i2) {
                    case 0:
                        C0631i9.m1482e(chain, "chain");
                        chain.proceed();
                        Object thisObject = chain.getThisObject();
                        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            this.f1354b.m1005c(activity);
                        }
                        break;
                    default:
                        C0631i9.m1482e(chain, "chain");
                        chain.proceed();
                        C0376Ue c0376Ue = this.f1354b;
                        c0376Ue.getClass();
                        C0726n9.m1677t("TempUnhideTrigger: onConfigurationChanged — resetting cached state");
                        c0376Ue.f1411a = null;
                        c0376Ue.f1416f = 0;
                        c0376Ue.f1417g = 0L;
                        View view = c0376Ue.f1412b;
                        WeakReference<Activity> weakReference = c0376Ue.f1413c;
                        Activity activity2 = weakReference != null ? weakReference.get() : null;
                        if (view != null && activity2 != null) {
                            c0376Ue.m1006d(activity2, view);
                        }
                        break;
                }
                return null;
            }
        });
        Class<?> cls2 = this.f1414d;
        C0631i9.m1479b(cls2);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: Window.Callback approach installed on ".concat(cls2.getName())}, 1));
        objM2206a = C0413Wf.f1577a;
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"TempUnhideTrigger: hook FAILED", thM2189a}, 2));
        }
    }
}
