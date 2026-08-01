package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0108;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;
import p188.AbstractC7773;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0146 implements InterfaceC0220 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Drawable f607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Drawable f608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Drawable f609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Toolbar f612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C0197 f614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Drawable f615;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public CharSequence f616;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f617;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Window.Callback f618;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f619;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final CharSequence f620;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final CharSequence f621;

    public C0146(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f613 = 0;
        this.f612 = toolbar;
        this.f616 = toolbar.getTitle();
        this.f620 = toolbar.getSubtitle();
        this.f617 = this.f616 != null;
        this.f607 = toolbar.getNavigationIcon();
        C0108 c0108M354 = C0108.m354(R.attr.actionBarStyle, 0, toolbar.getContext(), null, AbstractC7773.f21089);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        int i = 15;
        this.f615 = c0108M354.m390(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f617 = true;
                this.f616 = text;
                if ((this.f611 & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f617) {
                        AbstractC2270.m4241(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f620 = text2;
                if ((this.f611 & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM390 = c0108M354.m390(20);
            if (drawableM390 != null) {
                this.f608 = drawableM390;
                m598();
            }
            Drawable drawableM3902 = c0108M354.m390(17);
            if (drawableM3902 != null) {
                this.f609 = drawableM3902;
                m598();
            }
            if (this.f607 == null && (drawable = this.f615) != null) {
                this.f607 = drawable;
                if ((this.f611 & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            m600(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f610;
                if (view != null && (this.f611 & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f610 = viewInflate;
                if (viewInflate != null && (this.f611 & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                m600(this.f611 | 16);
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
                toolbar.m495();
                toolbar.f498.m603(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f494 = resourceId2;
                C0225 c0225 = toolbar.f509;
                if (c0225 != null) {
                    c0225.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f493 = resourceId3;
                C0225 c02252 = toolbar.f510;
                if (c02252 != null) {
                    c02252.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f615 = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f611 = i;
        }
        c0108M354.m363();
        if (R.string.abc_action_bar_up_description != this.f613) {
            this.f613 = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f613;
                this.f621 = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                m599();
            }
        }
        this.f621 = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0158(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m598() {
        Drawable drawable;
        int i = this.f611;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f608) == null) {
            drawable = this.f609;
        }
        this.f612.setLogo(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m599() {
        if ((this.f611 & 4) != 0) {
            CharSequence charSequence = this.f621;
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.f612;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f613);
            } else {
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m600(int i) {
        View view;
        int i2 = this.f611 ^ i;
        this.f611 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f612;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m599();
                }
                if ((this.f611 & 4) != 0) {
                    Drawable drawable = this.f607;
                    if (drawable == null) {
                        drawable = this.f615;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m598();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f616);
                    toolbar.setSubtitle(this.f620);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f610) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }
}
