package p336x3;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p055e.AbstractC1960a;
import p206o3.AbstractC5632b;
import p336x3.C9371a;
import p336x3.C9436y;

/* JADX INFO: renamed from: x3.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9428u {

    /* JADX INFO: renamed from: a */
    public static Field f32018a;

    /* JADX INFO: renamed from: b */
    public static boolean f32019b;

    /* JADX INFO: renamed from: c */
    public static final int[] f32020c = {AbstractC5632b.f17661b, AbstractC5632b.f17662c, AbstractC5632b.f17673n, AbstractC5632b.f17684y, AbstractC5632b.f17643B, AbstractC5632b.f17644C, AbstractC5632b.f17645D, AbstractC5632b.f17646E, AbstractC5632b.f17647F, AbstractC5632b.f17648G, AbstractC5632b.f17663d, AbstractC5632b.f17664e, AbstractC5632b.f17665f, AbstractC5632b.f17666g, AbstractC5632b.f17667h, AbstractC5632b.f17668i, AbstractC5632b.f17669j, AbstractC5632b.f17670k, AbstractC5632b.f17671l, AbstractC5632b.f17672m, AbstractC5632b.f17674o, AbstractC5632b.f17675p, AbstractC5632b.f17676q, AbstractC5632b.f17677r, AbstractC5632b.f17678s, AbstractC5632b.f17679t, AbstractC5632b.f17680u, AbstractC5632b.f17681v, AbstractC5632b.f17682w, AbstractC5632b.f17683x, AbstractC5632b.f17685z, AbstractC5632b.f17642A};

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9395i f32021d = new InterfaceC9395i() { // from class: x3.t
    };

    /* JADX INFO: renamed from: e */
    public static final e f32022e = new e();

    /* JADX INFO: renamed from: x3.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends f {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // p336x3.AbstractC9428u.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo36671b(View view) {
            return Boolean.valueOf(j.m36686c(view));
        }
    }

    /* JADX INFO: renamed from: x3.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b extends f {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // p336x3.AbstractC9428u.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence mo36671b(View view) {
            return j.m36684a(view);
        }
    }

    /* JADX INFO: renamed from: x3.u$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c extends f {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // p336x3.AbstractC9428u.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence mo36671b(View view) {
            return l.m36688a(view);
        }
    }

    /* JADX INFO: renamed from: x3.u$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d extends f {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // p336x3.AbstractC9428u.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo36671b(View view) {
            return Boolean.valueOf(j.m36685b(view));
        }
    }

    /* JADX INFO: renamed from: x3.u$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static void m36680a(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: x3.u$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class h {

        /* JADX INFO: renamed from: x3.u$h$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public C9408m0 f32028a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f32029b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC9392h f32030c;

            public a(View view, InterfaceC9392h interfaceC9392h) {
                this.f32029b = view;
                this.f32030c = interfaceC9392h;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C9408m0 c9408m0M36552t = C9408m0.m36552t(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.m36681a(windowInsets, this.f32029b);
                    if (c9408m0M36552t.equals(this.f32028a)) {
                        return this.f32030c.mo13332a(view, c9408m0M36552t).m36569r();
                    }
                }
                this.f32028a = c9408m0M36552t;
                C9408m0 c9408m0Mo13332a = this.f32030c.mo13332a(view, c9408m0M36552t);
                if (i10 >= 30) {
                    return c9408m0Mo13332a.m36569r();
                }
                AbstractC9428u.m36664n(view);
                return c9408m0Mo13332a.m36569r();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m36681a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC5632b.f17659R);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m36682b(View view, InterfaceC9392h interfaceC9392h) {
            a aVar = interfaceC9392h != null ? new a(view, interfaceC9392h) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC5632b.f17654M, aVar);
            }
            if (view.getTag(AbstractC5632b.f17653L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC5632b.f17659R));
            }
        }
    }

    /* JADX INFO: renamed from: x3.u$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class i {
        /* JADX INFO: renamed from: a */
        public static C9408m0 m36683a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C9408m0 c9408m0M36551s = C9408m0.m36551s(rootWindowInsets);
            c9408m0M36551s.m36566o(c9408m0M36551s);
            c9408m0M36551s.m36556d(view.getRootView());
            return c9408m0M36551s;
        }
    }

    /* JADX INFO: renamed from: x3.u$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class j {
        /* JADX INFO: renamed from: a */
        public static CharSequence m36684a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m36685b(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m36686c(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    /* JADX INFO: renamed from: x3.u$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class k {
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m36687a(View view) {
            return view.getAccessibilityDelegate();
        }
    }

    /* JADX INFO: renamed from: x3.u$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class l {
        /* JADX INFO: renamed from: a */
        public static CharSequence m36688a(View view) {
            return view.getStateDescription();
        }
    }

    /* JADX INFO: renamed from: x3.u$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class m {

        /* JADX INFO: renamed from: d */
        public static final ArrayList f32031d = new ArrayList();

        /* JADX INFO: renamed from: a */
        public WeakHashMap f32032a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray f32033b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference f32034c = null;

        /* JADX INFO: renamed from: a */
        public static m m36689a(View view) {
            m mVar = (m) view.getTag(AbstractC5632b.f17657P);
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = new m();
            view.setTag(AbstractC5632b.f17657P, mVar2);
            return mVar2;
        }

        /* JADX INFO: renamed from: b */
        public boolean m36690b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m36695g();
            }
            View viewM36691c = m36691c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM36691c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m36692d().put(keyCode, new WeakReference(viewM36691c));
                }
            }
            return viewM36691c != null;
        }

        /* JADX INFO: renamed from: c */
        public final View m36691c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f32032a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM36691c = m36691c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM36691c != null) {
                            return viewM36691c;
                        }
                    }
                }
                if (m36693e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final SparseArray m36692d() {
            if (this.f32033b == null) {
                this.f32033b = new SparseArray();
            }
            return this.f32033b;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m36693e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC5632b.f17658Q);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC1960a.m7104a(arrayList.get(size));
            throw null;
        }

        /* JADX INFO: renamed from: f */
        public boolean m36694f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f32034c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f32034c = new WeakReference(keyEvent);
            SparseArray sparseArrayM36692d = m36692d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM36692d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayM36692d.valueAt(iIndexOfKey);
                sparseArrayM36692d.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayM36692d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                m36693e(view, keyEvent);
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final void m36695g() {
            WeakHashMap weakHashMap = this.f32032a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f32031d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f32032a == null) {
                        this.f32032a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f32031d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f32032a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f32032a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static f m36651a() {
        return new d(AbstractC5632b.f17651J, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m36652b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return m.m36689a(view).m36690b(view, keyEvent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m36653c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return m.m36689a(view).m36694f(keyEvent);
    }

    /* JADX INFO: renamed from: d */
    public static View.AccessibilityDelegate m36654d(View view) {
        return Build.VERSION.SDK_INT >= 29 ? k.m36687a(view) : m36655e(view);
    }

    /* JADX INFO: renamed from: e */
    public static View.AccessibilityDelegate m36655e(View view) {
        if (f32019b) {
            return null;
        }
        if (f32018a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f32018a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f32019b = true;
                return null;
            }
        }
        try {
            Object obj = f32018a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f32019b = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m36656f(View view) {
        return (CharSequence) m36662l().m36679c(view);
    }

    /* JADX INFO: renamed from: g */
    public static C9408m0 m36657g(View view) {
        return i.m36683a(view);
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m36658h(View view) {
        return (CharSequence) m36670t().m36679c(view);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m36659i(View view) {
        Boolean bool = (Boolean) m36651a().m36679c(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m36660j(View view) {
        Boolean bool = (Boolean) m36665o().m36679c(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m36661k(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m36656f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(m36656f(view));
                    m36667q(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m36656f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static f m36662l() {
        return new b(AbstractC5632b.f17652K, CharSequence.class, 8, 28);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m36663m(View view, int i10) {
        int iM36511a = AbstractC9380d.m36511a(i10);
        if (iM36511a == -1) {
            return false;
        }
        return view.performHapticFeedback(iM36511a);
    }

    /* JADX INFO: renamed from: n */
    public static void m36664n(View view) {
        g.m36680a(view);
    }

    /* JADX INFO: renamed from: o */
    public static f m36665o() {
        return new a(AbstractC5632b.f17655N, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: p */
    public static void m36666p(View view, C9371a c9371a) {
        if (c9371a == null && (m36654d(view) instanceof C9371a.a)) {
            c9371a = new C9371a();
        }
        m36667q(view);
        view.setAccessibilityDelegate(c9371a == null ? null : c9371a.m36482d());
    }

    /* JADX INFO: renamed from: q */
    public static void m36667q(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m36668r(View view, InterfaceC9392h interfaceC9392h) {
        h.m36682b(view, interfaceC9392h);
    }

    /* JADX INFO: renamed from: s */
    public static void m36669s(View view, C9436y.b bVar) {
        C9436y.m36710e(view, bVar);
    }

    /* JADX INFO: renamed from: t */
    public static f m36670t() {
        return new c(AbstractC5632b.f17656O, CharSequence.class, 64, 30);
    }

    /* JADX INFO: renamed from: x3.u$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public final int f32024a;

        /* JADX INFO: renamed from: b */
        public final Class f32025b;

        /* JADX INFO: renamed from: c */
        public final int f32026c;

        /* JADX INFO: renamed from: d */
        public final int f32027d;

        public f(int i10, Class cls, int i11, int i12) {
            this.f32024a = i10;
            this.f32025b = cls;
            this.f32027d = i11;
            this.f32026c = i12;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m36678a() {
            return Build.VERSION.SDK_INT >= this.f32026c;
        }

        /* JADX INFO: renamed from: b */
        public abstract Object mo36671b(View view);

        /* JADX INFO: renamed from: c */
        public Object m36679c(View view) {
            if (m36678a()) {
                return mo36671b(view);
            }
            Object tag = view.getTag(this.f32024a);
            if (this.f32025b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }
    }

    /* JADX INFO: renamed from: x3.u$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q */
        public final WeakHashMap f32023q = new WeakHashMap();

        /* JADX INFO: renamed from: a */
        public final void m36676a(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                AbstractC9428u.m36661k(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m36677b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f32023q.entrySet().iterator();
                while (it.hasNext()) {
                    m36676a((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m36677b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
