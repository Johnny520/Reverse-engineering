package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: wB */
/* JADX INFO: loaded from: classes.dex */
public final class C2663wB implements InterfaceC0492Lc {

    /* JADX INFO: renamed from: a */
    public final Toolbar f9213a;

    /* JADX INFO: renamed from: b */
    public int f9214b;

    /* JADX INFO: renamed from: c */
    public final View f9215c;

    /* JADX INFO: renamed from: d */
    public Drawable f9216d;

    /* JADX INFO: renamed from: e */
    public Drawable f9217e;

    /* JADX INFO: renamed from: f */
    public final Drawable f9218f;

    /* JADX INFO: renamed from: g */
    public final boolean f9219g;

    /* JADX INFO: renamed from: h */
    public CharSequence f9220h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f9221i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f9222j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f9223k;

    /* JADX INFO: renamed from: l */
    public boolean f9224l;

    /* JADX INFO: renamed from: m */
    public C0130D0 f9225m;

    /* JADX INFO: renamed from: n */
    public final int f9226n;

    /* JADX INFO: renamed from: o */
    public final Drawable f9227o;

    public C2663wB(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f9226n = 0;
        this.f9213a = toolbar;
        this.f9220h = toolbar.getTitle();
        this.f9221i = toolbar.getSubtitle();
        this.f9219g = this.f9220h != null;
        this.f9218f = toolbar.getNavigationIcon();
        C2656w4 c2656w4M5186A = C2656w4.m5186A(toolbar.getContext(), null, AbstractC0982Wu.f3066a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        int i = 15;
        this.f9227o = c2656w4M5186A.m5210q(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f9219g = true;
                this.f9220h = text;
                if ((this.f9214b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f9219g) {
                        AbstractC2185lE.m4400m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f9221i = text2;
                if ((this.f9214b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM5210q = c2656w4M5186A.m5210q(20);
            if (drawableM5210q != null) {
                this.f9217e = drawableM5210q;
                m5230c();
            }
            Drawable drawableM5210q2 = c2656w4M5186A.m5210q(17);
            if (drawableM5210q2 != null) {
                this.f9216d = drawableM5210q2;
                m5230c();
            }
            if (this.f9218f == null && (drawable = this.f9227o) != null) {
                this.f9218f = drawable;
                if ((this.f9214b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            m5228a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f9215c;
                if (view != null && (this.f9214b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f9215c = viewInflate;
                if (viewInflate != null && (this.f9214b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                m5228a(this.f9214b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.m2104d();
                toolbar.f3842t.m1510a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f3834l = resourceId2;
                C2304o4 c2304o4 = toolbar.f3824b;
                if (c2304o4 != null) {
                    c2304o4.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f3835m = resourceId3;
                C2304o4 c2304o42 = toolbar.f3825c;
                if (c2304o42 != null) {
                    c2304o42.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f9227o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f9214b = i;
        }
        c2656w4M5186A.m5195E();
        if (R.string.abc_action_bar_up_description != this.f9226n) {
            this.f9226n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f9226n;
                this.f9222j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                m5229b();
            }
        }
        this.f9222j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0334Hq(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m5228a(int i) {
        View view;
        int i2 = this.f9214b ^ i;
        this.f9214b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f9213a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m5229b();
                }
                if ((this.f9214b & 4) != 0) {
                    Drawable drawable = this.f9218f;
                    if (drawable == null) {
                        drawable = this.f9227o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m5230c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f9220h);
                    toolbar.setSubtitle(this.f9221i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f9215c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5229b() {
        if ((this.f9214b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f9222j);
            Toolbar toolbar = this.f9213a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f9226n);
            } else {
                toolbar.setNavigationContentDescription(this.f9222j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5230c() {
        Drawable drawable;
        int i = this.f9214b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f9217e) == null) {
            drawable = this.f9216d;
        }
        this.f9213a.setLogo(drawable);
    }
}
