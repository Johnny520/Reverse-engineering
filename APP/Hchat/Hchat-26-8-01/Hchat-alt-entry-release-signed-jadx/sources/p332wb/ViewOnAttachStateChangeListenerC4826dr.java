package p332wb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p036c9.C0416a1;
import p068eh.AbstractC0921a;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p343x6.AbstractC5700d;
import p357y1.C5868c1;

/* JADX INFO: renamed from: wb.dr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4826dr implements InterfaceC5196p3, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final View f16695g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f16696h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f16697i;

    /* JADX INFO: renamed from: j */
    public final int f16698j;

    /* JADX INFO: renamed from: k */
    public final ViewGroup.LayoutParams f16699k;

    /* JADX INFO: renamed from: l */
    public final Drawable f16700l;

    /* JADX INFO: renamed from: m */
    public final View f16701m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f16702n;

    /* JADX INFO: renamed from: o */
    public final FrameLayout f16703o;

    /* JADX INFO: renamed from: p */
    public final FrameLayout f16704p;

    /* JADX INFO: renamed from: q */
    public final C5868c1 f16705q;

    /* JADX INFO: renamed from: r */
    public final C0416a1 f16706r;

    /* JADX INFO: renamed from: s */
    public final View f16707s;

    /* JADX INFO: renamed from: t */
    public final C5538zh f16708t;

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f16709u = new AtomicBoolean(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC4826dr(View view, ViewGroup viewGroup, ViewGroup viewGroup2, int i9, ViewGroup.LayoutParams layoutParams, Drawable drawable, View view2, ArrayList arrayList, FrameLayout frameLayout, FrameLayout frameLayout2, C5868c1 c5868c1, C0416a1 c0416a1, View view3, C5538zh c5538zh) {
        this.f16695g = view;
        this.f16696h = viewGroup;
        this.f16697i = viewGroup2;
        this.f16698j = i9;
        this.f16699k = layoutParams;
        this.f16700l = drawable;
        this.f16701m = view2;
        this.f16702n = arrayList;
        this.f16703o = frameLayout;
        this.f16704p = frameLayout2;
        this.f16705q = c5868c1;
        this.f16706r = c0416a1;
        this.f16707s = view3;
        this.f16708t = c5538zh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9256a() {
        Object c3959f;
        C5868c1 c5868c1 = this.f16705q;
        if (this.f16709u.compareAndSet(true, false)) {
            View view = this.f16707s;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
            ViewGroup viewGroup = this.f16697i;
            if (viewGroup != view) {
                viewGroup.removeOnAttachStateChangeListener(this);
            }
            try {
                c5868c1.m10555f();
            } catch (Throwable unused) {
            }
            ViewParent parent = c5868c1.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c5868c1);
            }
            try {
                C4892fr c4892fr = C4892fr.f17279a;
                C4892fr.m9275c(this.f16695g, this.f16696h, viewGroup, this.f16698j, this.f16699k, this.f16700l, this.f16701m, this.f16702n, this.f16703o, this.f16704p);
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2261x("[Hchat:Script] 恢复模块悬浮底栏失败: ", thM8182b.getMessage(), thM8182b);
            }
            AbstractC5700d.m10289p(c5868c1);
            C0416a1 c0416a1 = this.f16706r;
            C0114s c0114s = c0416a1.f1194h;
            EnumC0107l enumC0107l = c0114s.f300c;
            EnumC0107l enumC0107l2 = EnumC0107l.f289g;
            if (enumC0107l != enumC0107l2) {
                c0114s.m558g(enumC0107l2);
            }
            c0416a1.f1197k.m7634a();
            c0416a1.f1196j.m545a();
            this.f16708t.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        m9256a();
    }
}
