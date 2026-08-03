package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.widget.C1038a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C1033f;
import p000a.C0181Jg;
import p000a.C0726n9;
import p000a.C0751of;
import p000a.C0794r1;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.InterfaceC0241N4;
import p000a.ViewOnClickListenerC0903wf;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1041d implements InterfaceC0241N4 {

    /* JADX INFO: renamed from: a */
    public final Toolbar f4123a;

    /* JADX INFO: renamed from: b */
    public int f4124b;

    /* JADX INFO: renamed from: c */
    public final View f4125c;

    /* JADX INFO: renamed from: d */
    public Drawable f4126d;

    /* JADX INFO: renamed from: e */
    public Drawable f4127e;

    /* JADX INFO: renamed from: f */
    public final Drawable f4128f;

    /* JADX INFO: renamed from: g */
    public final boolean f4129g;

    /* JADX INFO: renamed from: h */
    public CharSequence f4130h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f4131i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f4132j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f4133k;

    /* JADX INFO: renamed from: l */
    public boolean f4134l;

    /* JADX INFO: renamed from: m */
    public C1038a f4135m;

    /* JADX INFO: renamed from: n */
    public final int f4136n;

    /* JADX INFO: renamed from: o */
    public final Drawable f4137o;

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$a */
    public class a extends C0726n9 {

        /* JADX INFO: renamed from: b */
        public boolean f4138b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f4139c;

        public a(int i) {
            this.f4139c = i;
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: a */
        public final void mo553a() {
            if (this.f4138b) {
                return;
            }
            C1041d.this.f4123a.setVisibility(this.f4139c);
        }

        @Override // p000a.C0726n9, p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: b */
        public final void mo595b() {
            this.f4138b = true;
        }

        @Override // p000a.C0726n9, p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: c */
        public final void mo554c() {
            C1041d.this.f4123a.setVisibility(0);
        }
    }

    public C1041d(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = C0983R.string.abc_action_bar_up_description;
        this.f4136n = 0;
        this.f4123a = toolbar;
        this.f4130h = toolbar.getTitle();
        this.f4131i = toolbar.getSubtitle();
        this.f4129g = this.f4130h != null;
        this.f4128f = toolbar.getNavigationIcon();
        C0751of c0751ofM1768e = C0751of.m1768e(toolbar.getContext(), null, C0983R.styleable.ActionBar, C0983R.attr.actionBarStyle);
        this.f4137o = c0751ofM1768e.m1770b(C0983R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            int i3 = C0983R.styleable.ActionBar_title;
            TypedArray typedArray = c0751ofM1768e.f2960b;
            CharSequence text = typedArray.getText(i3);
            if (!TextUtils.isEmpty(text)) {
                this.f4129g = true;
                this.f4130h = text;
                if ((this.f4124b & 8) != 0) {
                    Toolbar toolbar2 = this.f4123a;
                    toolbar2.setTitle(text);
                    if (this.f4129g) {
                        C0866ug.m2004k(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(C0983R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.f4131i = text2;
                if ((this.f4124b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM1770b = c0751ofM1768e.m1770b(C0983R.styleable.ActionBar_logo);
            if (drawableM1770b != null) {
                this.f4127e = drawableM1770b;
                m2405u();
            }
            Drawable drawableM1770b2 = c0751ofM1768e.m1770b(C0983R.styleable.ActionBar_icon);
            if (drawableM1770b2 != null) {
                setIcon(drawableM1770b2);
            }
            if (this.f4128f == null && (drawable = this.f4137o) != null) {
                this.f4128f = drawable;
                int i4 = this.f4124b & 4;
                Toolbar toolbar3 = this.f4123a;
                if (i4 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            mo681s(typedArray.getInt(C0983R.styleable.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(C0983R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f4125c;
                if (view != null && (this.f4124b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f4125c = viewInflate;
                if (viewInflate != null && (this.f4124b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                mo681s(this.f4124b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(C0983R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(C0983R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(C0983R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.m2377d();
                toolbar.f4064t.m93a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(C0983R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f4056l = resourceId2;
                C0794r1 c0794r1 = toolbar.f4046b;
                if (c0794r1 != null) {
                    c0794r1.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(C0983R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f4057m = resourceId3;
                C0794r1 c0794r12 = toolbar.f4047c;
                if (c0794r12 != null) {
                    c0794r12.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(C0983R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f4137o = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.f4124b = i;
        }
        c0751ofM1768e.m1773f();
        if (i2 != this.f4136n) {
            this.f4136n = i2;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i5 = this.f4136n;
                this.f4132j = i5 != 0 ? toolbar.getContext().getString(i5) : null;
                m2404t();
            }
        }
        this.f4132j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0903wf(this));
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: a */
    public final boolean mo663a() {
        C1038a c1038a;
        ActionMenuView actionMenuView = this.f4123a.f4045a;
        if (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null) {
            return false;
        }
        return c1038a.f4097u != null || c1038a.m2399k();
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: b */
    public final boolean mo664b() {
        C1038a c1038a;
        ActionMenuView actionMenuView = this.f4123a.f4045a;
        return (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null || !c1038a.m2399k()) ? false : true;
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: c */
    public final Context mo665c() {
        return this.f4123a.getContext();
    }

    @Override // p000a.InterfaceC0241N4
    public final void collapseActionView() {
        Toolbar.C1033f c1033f = this.f4123a.f4037M;
        C1000h c1000h = c1033f == null ? null : c1033f.f4076b;
        if (c1000h != null) {
            c1000h.collapseActionView();
        }
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: d */
    public final boolean mo666d() {
        C1038a c1038a;
        ActionMenuView actionMenuView = this.f4123a.f4045a;
        return (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null || !c1038a.m2398f()) ? false : true;
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: e */
    public final void mo667e(C0998f c0998f, InterfaceC1002j.a aVar) {
        C1038a c1038a = this.f4135m;
        Toolbar toolbar = this.f4123a;
        if (c1038a == null) {
            this.f4135m = new C1038a(toolbar.getContext());
        }
        C1038a c1038a2 = this.f4135m;
        c1038a2.f3728e = aVar;
        if (c0998f == null && toolbar.f4045a == null) {
            return;
        }
        toolbar.m2379f();
        C0998f c0998f2 = toolbar.f4045a.f3935p;
        if (c0998f2 == c0998f) {
            return;
        }
        if (c0998f2 != null) {
            c0998f2.m2333r(toolbar.f4036L);
            c0998f2.m2333r(toolbar.f4037M);
        }
        if (toolbar.f4037M == null) {
            toolbar.f4037M = toolbar.new C1033f();
        }
        c1038a2.f4093q = true;
        if (c0998f != null) {
            c0998f.m2317b(c1038a2, toolbar.f4054j);
            c0998f.m2317b(toolbar.f4037M, toolbar.f4054j);
        } else {
            c1038a2.mo1397e(toolbar.f4054j, null);
            toolbar.f4037M.mo1397e(toolbar.f4054j, null);
            c1038a2.mo2308g();
            toolbar.f4037M.mo2308g();
        }
        toolbar.f4045a.setPopupTheme(toolbar.f4055k);
        toolbar.f4045a.setPresenter(c1038a2);
        toolbar.f4036L = c1038a2;
        toolbar.m2391v();
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: f */
    public final boolean mo668f() {
        return this.f4123a.m2390u();
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: g */
    public final void mo669g() {
        this.f4134l = true;
    }

    @Override // p000a.InterfaceC0241N4
    public final CharSequence getTitle() {
        return this.f4123a.getTitle();
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: h */
    public final boolean mo670h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f4123a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4045a) != null && actionMenuView.f3938s;
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: i */
    public final void mo671i() {
        C1038a c1038a;
        ActionMenuView actionMenuView = this.f4123a.f4045a;
        if (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null) {
            return;
        }
        c1038a.m2398f();
        C1038a.a aVar = c1038a.f4096t;
        if (aVar == null || !aVar.m2344b()) {
            return;
        }
        aVar.f3849i.dismiss();
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: j */
    public final void mo672j() {
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: k */
    public final C0181Jg mo673k(long j, int i) {
        C0181Jg c0181JgM1994a = C0866ug.m1994a(this.f4123a);
        c0181JgM1994a.m488a(i == 0 ? 1.0f : 0.0f);
        c0181JgM1994a.m490c(j);
        c0181JgM1994a.m491d(new a(i));
        return c0181JgM1994a;
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: l */
    public final int mo674l() {
        return this.f4124b;
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: m */
    public final void mo675m(int i) {
        this.f4123a.setVisibility(i);
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: n */
    public final void mo676n(int i) {
        this.f4127e = i != 0 ? C0889w1.m2115A(this.f4123a.getContext(), i) : null;
        m2405u();
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: o */
    public final void mo677o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: p */
    public final boolean mo678p() {
        Toolbar.C1033f c1033f = this.f4123a.f4037M;
        return (c1033f == null || c1033f.f4076b == null) ? false : true;
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: q */
    public final void mo679q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: r */
    public final void mo680r(boolean z) {
        this.f4123a.setCollapsible(z);
    }

    @Override // p000a.InterfaceC0241N4
    /* JADX INFO: renamed from: s */
    public final void mo681s(int i) {
        View view;
        int i2 = this.f4124b ^ i;
        this.f4124b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2404t();
                }
                int i3 = this.f4124b & 4;
                Toolbar toolbar = this.f4123a;
                if (i3 != 0) {
                    Drawable drawable = this.f4128f;
                    if (drawable == null) {
                        drawable = this.f4137o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m2405u();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f4123a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f4130h);
                    toolbar2.setSubtitle(this.f4131i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f4125c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.InterfaceC0241N4
    public final void setIcon(int i) {
        setIcon(i != 0 ? C0889w1.m2115A(this.f4123a.getContext(), i) : null);
    }

    @Override // p000a.InterfaceC0241N4
    public final void setWindowCallback(Window.Callback callback) {
        this.f4133k = callback;
    }

    @Override // p000a.InterfaceC0241N4
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f4129g) {
            return;
        }
        this.f4130h = charSequence;
        if ((this.f4124b & 8) != 0) {
            Toolbar toolbar = this.f4123a;
            toolbar.setTitle(charSequence);
            if (this.f4129g) {
                C0866ug.m2004k(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2404t() {
        if ((this.f4124b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f4132j);
            Toolbar toolbar = this.f4123a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f4136n);
            } else {
                toolbar.setNavigationContentDescription(this.f4132j);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2405u() {
        Drawable drawable;
        int i = this.f4124b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f4127e) == null) {
            drawable = this.f4126d;
        }
        this.f4123a.setLogo(drawable);
    }

    @Override // p000a.InterfaceC0241N4
    public final void setIcon(Drawable drawable) {
        this.f4126d = drawable;
        m2405u();
    }
}
