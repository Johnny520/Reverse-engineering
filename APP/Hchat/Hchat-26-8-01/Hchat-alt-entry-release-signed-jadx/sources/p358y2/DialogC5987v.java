package p358y2;

import ac.AbstractC0063p;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0098d0;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0106k;
import androidx.lifecycle.EnumC0107l;
import androidx.lifecycle.InterfaceC0112q;
import java.util.UUID;
import okhttp3.HttpUrl;
import okio.C3193a;
import p002a1.RunnableC0003a;
import p014b.C0122a;
import p014b.C0124c;
import p014b.C0125d;
import p014b.C0127f;
import p014b.C0128g;
import p017b2.AbstractC0170b;
import p085fg.InterfaceC1220a;
import p099h.Hchat.R;
import p116i.C1746e0;
import p118i1.C1912l;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p174m.C2571a;
import p227p4.C3315t;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p294u3.InterfaceC4250c;
import pa.C3377c;
import tf.C4164k;

/* JADX INFO: renamed from: y2.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC5987v extends Dialog implements InterfaceC0112q, InterfaceC4250c {

    /* JADX INFO: renamed from: g */
    public C0114s f24310g;

    /* JADX INFO: renamed from: h */
    public final C3315t f24311h;

    /* JADX INFO: renamed from: i */
    public final C0127f f24312i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1220a f24313j;

    /* JADX INFO: renamed from: k */
    public C5986u f24314k;

    /* JADX INFO: renamed from: l */
    public final View f24315l;

    /* JADX INFO: renamed from: m */
    public final C5985t f24316m;

    /* JADX INFO: renamed from: n */
    public boolean f24317n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogC5987v(InterfaceC1220a interfaceC1220a, C5986u c5986u, View view, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c5986u.f24309c ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f24311h = new C3315t(new C3377c(this, new C1746e0(this, 28)));
        RunnableC0003a runnableC0003a = new RunnableC0003a(this, 2);
        C0127f c0127f = new C0127f();
        c0127f.f335b = runnableC0003a;
        c0127f.f336c = new C4164k();
        if (Build.VERSION.SDK_INT >= 33) {
            new C0122a(c0127f, 0);
            c0127f.f337d = C0124c.f325a.m618a(new C0122a(c0127f, 1));
        }
        this.f24312i = c0127f;
        this.f24313j = interfaceC1220a;
        this.f24314k = c5986u;
        this.f24315l = view;
        float f3 = 8;
        Window window = getWindow();
        if (window == null) {
            C2104o.m5276A("Dialog has no window");
            throw null;
        }
        C5986u c5986u2 = this.f24314k;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            c5986u2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        boolean z9 = this.f24314k.f24309c;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 35) {
            AbstractC0170b.m761d(window, z9);
        } else if (i9 >= 30) {
            AbstractC0170b.m760c(window, z9);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z9 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
        window.setGravity(17);
        if (!this.f24314k.f24309c) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (i9 >= 28) {
                C5980o.f24294a.m10715a(attributes2);
            }
            if (i9 >= 30) {
                C5981p c5981p = C5981p.f24295a;
                c5981p.m10717b(attributes2, 0);
                c5981p.m10718c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        C5985t c5985t = new C5985t(getContext(), window);
        this.f24314k.getClass();
        setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        c5985t.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c5985t.setClipChildren(false);
        c5985t.setElevation(interfaceC4233c.mo1601x0(f3));
        c5985t.setOutlineProvider(new C1912l(2));
        this.f24316m = c5985t;
        View decorView2 = window.getDecorView();
        ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
        if (viewGroup != null) {
            m10720c(viewGroup);
        }
        setContentView(c5985t);
        c5985t.setTag(R.id.view_tree_lifecycle_owner, AbstractC0098d0.m543a(view));
        c5985t.setTag(R.id.view_tree_view_model_store_owner, AbstractC0098d0.m544b(view));
        c5985t.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC0063p.m427t(view));
        m10723g(this.f24313j, this.f24314k, enumC4243m);
        C0128g c0128g = new C0128g(new C5962a(this, 1));
        C0114s c0114sM10721d = m10721d();
        if (c0114sM10721d.f300c == EnumC0107l.f289g) {
            return;
        }
        c0128g.f339a.add(new C0125d(c0127f, c0114sM10721d, c0128g));
        if (i9 >= 33) {
            c0127f.m652d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10719a(DialogC5987v dialogC5987v) {
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m10720c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C5985t) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m10720c(viewGroup2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m10722e();
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p294u3.InterfaceC4250c
    /* JADX INFO: renamed from: b */
    public final C2571a mo1402b() {
        return (C2571a) this.f24311h.f10678i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0114s m10721d() {
        C0114s c0114s = this.f24310g;
        if (c0114s != null) {
            return c0114s;
        }
        C0114s c0114s2 = new C0114s(this, true);
        this.f24310g = c0114s2;
        return c0114s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10722e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0112q
    /* JADX INFO: renamed from: f */
    public final C0114s mo550f() {
        return m10721d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10723g(InterfaceC1220a interfaceC1220a, C5986u c5986u, EnumC4243m enumC4243m) {
        int i9;
        this.f24313j = interfaceC1220a;
        this.f24314k = c5986u;
        c5986u.getClass();
        boolean zM10713b = AbstractC5978m.m10713b(this.f24315l);
        Window window = getWindow();
        window.getClass();
        window.setFlags(zM10713b ? 8192 : -8193, 8192);
        int iOrdinal = enumC4243m.ordinal();
        if (iOrdinal == 0) {
            i9 = 0;
        } else {
            if (iOrdinal != 1) {
                C3193a.m6822k();
                return;
            }
            i9 = 1;
        }
        C5985t c5985t = this.f24316m;
        c5985t.setLayoutDirection(i9);
        boolean z9 = c5986u.f24309c;
        boolean z10 = c5986u.f24308b;
        Window window2 = c5985t.f24301p;
        boolean z11 = (c5985t.f24305t && z10 == c5985t.f24303r && z9 == c5985t.f24304s) ? false : true;
        c5985t.f24303r = z10;
        c5985t.f24304s = z9;
        if (z11) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i10 = z10 ? -2 : -1;
            if (i10 != attributes.width || !c5985t.f24305t) {
                window2.setLayout(i10, -2);
                c5985t.f24305t = true;
            }
        }
        setCanceledOnTouchOutside(true);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z9 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f24312i.m649a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            C0127f c0127f = this.f24312i;
            c0127f.getClass();
            c0127f.f338e = onBackInvokedDispatcher;
            c0127f.m652d();
        }
        this.f24311h.m7017F(bundle);
        m10721d().m555d(EnumC0106k.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (!this.f24314k.f24307a || !keyEvent.isTracking() || keyEvent.isCanceled() || i9 != 111) {
            return super.onKeyUp(i9, keyEvent);
        }
        this.f24313j.invoke();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f24311h.m7018G(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m10721d().m555d(EnumC0106k.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStop() {
        m10721d().m555d(EnumC0106k.ON_DESTROY);
        this.f24310g = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iM5018X;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        this.f24314k.getClass();
        C5985t c5985t = this.f24316m;
        c5985t.getClass();
        if (Math.abs(motionEvent.getX()) > Float.MAX_VALUE || Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = c5985t.getChildAt(0)) == null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f24317n = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f24317n = false;
                    return zOnTouchEvent;
                }
            } else if (this.f24317n) {
                this.f24313j.invoke();
                this.f24317n = false;
                return true;
            }
        } else {
            int left = childAt.getLeft() + c5985t.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + c5985t.getTop();
            int height = childAt.getHeight() + top;
            int iM5018X2 = AbstractC2043a.m5018X(motionEvent.getX());
            if (left <= iM5018X2 && iM5018X2 <= width && top <= (iM5018X = AbstractC2043a.m5018X(motionEvent.getY())) && iM5018X <= height) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
                    this.f24317n = false;
                    return zOnTouchEvent;
                }
            }
        }
        return zOnTouchEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        m10722e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i9) {
        m10722e();
        super.setContentView(i9);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m10722e();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
