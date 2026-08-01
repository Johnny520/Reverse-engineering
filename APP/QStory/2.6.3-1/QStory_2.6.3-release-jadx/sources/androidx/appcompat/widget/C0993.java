package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0955;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import p204.AbstractC8602;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0993 implements InterfaceC1067 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Drawable f952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Drawable f953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Drawable f954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Toolbar f957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C1044 f959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Drawable f960;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public CharSequence f961;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f962;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Window.Callback f963;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f964;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final CharSequence f965;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final CharSequence f966;

    public C0993(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f958 = 0;
        this.f957 = toolbar;
        this.f961 = toolbar.getTitle();
        this.f965 = toolbar.getSubtitle();
        this.f962 = this.f961 != null;
        this.f952 = toolbar.getNavigationIcon();
        C0955 c0955M914 = C0955.m914(C0328R.attr.actionBarStyle, 0, toolbar.getContext(), null, AbstractC8602.f21434);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        int i = 15;
        this.f960 = c0955M914.m950(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f962 = true;
                this.f961 = text;
                if ((this.f956 & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f962) {
                        AbstractC3103.m4801(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f965 = text2;
                if ((this.f956 & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM950 = c0955M914.m950(20);
            if (drawableM950 != null) {
                this.f953 = drawableM950;
                m1158();
            }
            Drawable drawableM9502 = c0955M914.m950(17);
            if (drawableM9502 != null) {
                this.f954 = drawableM9502;
                m1158();
            }
            if (this.f952 == null && (drawable = this.f960) != null) {
                this.f952 = drawable;
                if ((this.f956 & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            m1160(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f955;
                if (view != null && (this.f956 & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f955 = viewInflate;
                if (viewInflate != null && (this.f956 & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                m1160(this.f956 | 16);
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
                toolbar.m1055();
                toolbar.f843.m1163(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f839 = resourceId2;
                C1072 c1072 = toolbar.f854;
                if (c1072 != null) {
                    c1072.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f838 = resourceId3;
                C1072 c10722 = toolbar.f855;
                if (c10722 != null) {
                    c10722.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f960 = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f956 = i;
        }
        c0955M914.m923();
        if (C0328R.string.abc_action_bar_up_description != this.f958) {
            this.f958 = C0328R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f958;
                this.f966 = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                m1159();
            }
        }
        this.f966 = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC1005(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1158() {
        Drawable drawable;
        int i = this.f956;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f953) == null) {
            drawable = this.f954;
        }
        this.f957.setLogo(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1159() {
        if ((this.f956 & 4) != 0) {
            CharSequence charSequence = this.f966;
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.f957;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f958);
            } else {
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1160(int i) {
        View view;
        int i2 = this.f956 ^ i;
        this.f956 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f957;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m1159();
                }
                if ((this.f956 & 4) != 0) {
                    Drawable drawable = this.f952;
                    if (drawable == null) {
                        drawable = this.f960;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m1158();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f961);
                    toolbar.setSubtitle(this.f965);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f955) == null) {
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
