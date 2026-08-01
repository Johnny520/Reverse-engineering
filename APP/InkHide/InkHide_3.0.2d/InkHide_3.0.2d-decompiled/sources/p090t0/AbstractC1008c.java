package p090t0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p001A0.RunnableC0040m;
import p003B0.AbstractC0055a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p099y.AbstractC1041E;
import p099y.AbstractC1048L;
import p099y.C1047K;
import p099y.InterfaceC1046J;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: t0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1008c extends FrameLayout implements InterfaceC1046J {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f3601g = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3602b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0204l f3603c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0204l f3604d;

    /* JADX INFO: renamed from: e */
    public C1007b f3605e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f3606f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1008c(Context context, int i2) {
        super(context, null, 0, 0);
        AbstractC0223g.m418e(context, "context");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    /* JADX INFO: renamed from: b */
    public static AbstractC1008c m2204b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View viewM989v = AbstractC0503h.m989v(viewGroup, childCount);
            if (viewM989v instanceof AbstractC1008c) {
                AbstractC1008c abstractC1008c = (AbstractC1008c) viewM989v;
                if (abstractC1008c.m2206c()) {
                    return abstractC1008c;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [t0.b] */
    /* JADX INFO: renamed from: h */
    public static void m2205h(ViewGroup viewGroup) {
        Activity activity;
        AbstractC1008c abstractC1008cM2204b = m2204b(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewM989v = AbstractC0503h.m989v(viewGroup, i2);
            if (viewM989v instanceof AbstractC1008c) {
                if (viewM989v == abstractC1008cM2204b) {
                    final AbstractC1008c abstractC1008c = (AbstractC1008c) viewM989v;
                    if (Build.VERSION.SDK_INT >= 33 && abstractC1008c.f3605e == null && (activity = abstractC1008c.getActivity()) != null) {
                        ?? r5 = new OnBackInvokedCallback() { // from class: t0.b
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.window.OnBackInvokedCallback
                            public final void onBackInvoked() {
                                AbstractC1008c abstractC1008c2 = this.f3600a;
                                if (abstractC1008c2.m2207d()) {
                                    abstractC1008c2.mo2182a();
                                }
                            }
                        };
                        activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1, r5);
                        abstractC1008c.f3605e = r5;
                    }
                } else {
                    ((AbstractC1008c) viewM989v).m2210i();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void mo2182a() {
        if (m2206c()) {
            m2210i();
            InputMethodManager inputMethodManager = (InputMethodManager) AbstractC0503h.m991x().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
            if (viewGroup != null) {
                viewGroup.post(new RunnableC0040m(this, viewGroup, 13));
            }
            InterfaceC0204l interfaceC0204l = this.f3604d;
            if (interfaceC0204l != null) {
                interfaceC0204l.mo8c(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m2206c() {
        return getParent() != null && getVisibility() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m2207d() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return viewGroup != null && m2204b(viewGroup) == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || !m2207d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            mo2182a();
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract View mo2152e(AbstractC1008c abstractC1008c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m2208f(View view, KeyEvent keyEvent) {
        AbstractC0223g.m418e(view, "v");
        AbstractC0223g.m418e(keyEvent, "event");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || !m2207d()) {
            return false;
        }
        mo2182a();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2209g() {
        ViewGroup rootContainer;
        if (m2206c()) {
            return;
        }
        Activity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            View currentFocus = window.getCurrentFocus();
            if (currentFocus == null) {
                View decorView = window.getDecorView();
                View viewFindViewWithTag = decorView.findViewWithTag("keyboardTagView");
                if (viewFindViewWithTag == null) {
                    viewFindViewWithTag = new EditText(window.getContext());
                    viewFindViewWithTag.setTag("keyboardTagView");
                    ((ViewGroup) decorView).addView(viewFindViewWithTag, 0, 0);
                }
                currentFocus = viewFindViewWithTag;
                currentFocus.requestFocus();
            }
            InputMethodManager inputMethodManager = (InputMethodManager) AbstractC0503h.m991x().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        mo2211j();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        if (getParent() == null && (rootContainer = getRootContainer()) != null) {
            rootContainer.addView(this, layoutParams);
        }
        bringToFront();
        requestFocus();
        ViewGroup rootContainer2 = getRootContainer();
        if (rootContainer2 != null) {
            m2205h(rootContainer2);
        }
        InterfaceC0204l interfaceC0204l = this.f3603c;
        if (interfaceC0204l != null) {
            interfaceC0204l.mo8c(this);
        }
        setZ(99.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0204l getOnDismissListener() {
        return this.f3604d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0204l getOnShowListener() {
        return this.f3603c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewGroup getRootContainer() {
        Window window;
        if (this.f3606f == null) {
            Activity activity = getActivity();
            this.f3606f = (ViewGroup) ((activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView());
        }
        return this.f3606f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewGroup get_rootContainer() {
        return this.f3606f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2210i() {
        C1007b c1007b;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (c1007b = this.f3605e) != null) {
            Activity activity = getActivity();
            if (activity != null && (onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(c1007b);
            }
            this.f3605e = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public boolean mo2211j() {
        boolean z2 = AbstractC1126i.f3786a;
        return C1124g.m2446v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClickable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            AbstractC1048L.m2288g(this, this);
            if (i2 >= 28) {
                AbstractC1041E.m2256a(this, this);
            } else {
                ArrayList arrayList = (ArrayList) getTag(R.id.tag_unhandled_key_listeners);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    setTag(R.id.tag_unhandled_key_listeners, arrayList);
                }
                arrayList.add(this);
                if (arrayList.size() == 1) {
                    ArrayList arrayList2 = C1047K.f3658d;
                    synchronized (arrayList2) {
                        try {
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    C1047K.f3658d.add(new WeakReference(this));
                                    break;
                                } else if (((WeakReference) it.next()).get() == this) {
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        if (mo2211j()) {
            setPadding(getPaddingLeft(), AbstractC0055a.m101b(44), getPaddingRight(), getPaddingBottom());
        } else {
            setPadding(0, 0, 0, 0);
        }
        if (!this.f3602b) {
            addView(mo2152e(this));
        }
        this.f3602b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m2210i();
        AbstractC1048L.m2288g(this, this);
        this.f3606f = null;
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent == null || keyEvent.getAction() != 1) {
            return super.onKeyUp(i2, keyEvent);
        }
        if (!m2207d()) {
            return false;
        }
        mo2182a();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnDismissListener(InterfaceC0204l interfaceC0204l) {
        this.f3604d = interfaceC0204l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnShowListener(InterfaceC0204l interfaceC0204l) {
        this.f3603c = interfaceC0204l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setViewCreated(boolean z2) {
        this.f3602b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void set_rootContainer(ViewGroup viewGroup) {
        this.f3606f = viewGroup;
    }

    public final void setRootContainer(ViewGroup viewGroup) {
    }
}
