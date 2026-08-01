package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.AbstractC0910xy;
import p000.C0572ou;
import p000.C0659r5;
import p000.InterfaceC0201ev;
import p000.MenuC0424ku;
import p000.ja0;
import p000.s90;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0201ev, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public C0572ou f207a;

    /* JADX INFO: renamed from: b */
    public ImageView f208b;

    /* JADX INFO: renamed from: c */
    public RadioButton f209c;

    /* JADX INFO: renamed from: d */
    public TextView f210d;

    /* JADX INFO: renamed from: e */
    public CheckBox f211e;

    /* JADX INFO: renamed from: f */
    public TextView f212f;

    /* JADX INFO: renamed from: g */
    public ImageView f213g;

    /* JADX INFO: renamed from: h */
    public ImageView f214h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f215i;

    /* JADX INFO: renamed from: j */
    public final Drawable f216j;

    /* JADX INFO: renamed from: k */
    public final int f217k;

    /* JADX INFO: renamed from: l */
    public final Context f218l;

    /* JADX INFO: renamed from: m */
    public boolean f219m;

    /* JADX INFO: renamed from: n */
    public final Drawable f220n;

    /* JADX INFO: renamed from: o */
    public final boolean f221o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f222p;

    /* JADX INFO: renamed from: q */
    public boolean f223q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0659r5 c0659r5M2219y = C0659r5.m2219y(getContext(), attributeSet, AbstractC0910xy.f5234r, R.attr.listMenuViewStyle);
        this.f216j = c0659r5M2219y.m2234m(5);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        this.f217k = typedArray.getResourceId(1, -1);
        this.f219m = typedArray.getBoolean(7, false);
        this.f218l = context;
        this.f220n = c0659r5M2219y.m2234m(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f221o = typedArrayObtainStyledAttributes.hasValue(0);
        c0659r5M2219y.m2245z();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f222p == null) {
            this.f222p = LayoutInflater.from(getContext());
        }
        return this.f222p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f213g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f214h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f214h.getLayoutParams();
        rect.top = this.f214h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // p000.InterfaceC0201ev
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo134c(p000.C0572ou r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo134c(ou):void");
    }

    @Override // p000.InterfaceC0201ev
    public C0572ou getItemData() {
        return this.f207a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2325q(this, this.f216j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f210d = textView;
        int i = this.f217k;
        if (i != -1) {
            textView.setTextAppearance(this.f218l, i);
        }
        this.f212f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f213g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f220n);
        }
        this.f214h = (ImageView) findViewById(R.id.group_divider);
        this.f215i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f208b != null && this.f219m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f208b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f209c == null && this.f211e == null) {
            return;
        }
        if ((this.f207a.f3609x & 4) != 0) {
            if (this.f209c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f209c = radioButton;
                LinearLayout linearLayout = this.f215i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f209c;
            view = this.f211e;
        } else {
            if (this.f211e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f211e = checkBox;
                LinearLayout linearLayout2 = this.f215i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f211e;
            view = this.f209c;
        }
        if (z) {
            compoundButton.setChecked(this.f207a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f211e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f209c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f207a.f3609x & 4) != 0) {
            if (this.f209c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f209c = radioButton;
                LinearLayout linearLayout = this.f215i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f209c;
        } else {
            if (this.f211e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f211e = checkBox;
                LinearLayout linearLayout2 = this.f215i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f211e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f223q = z;
        this.f219m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f214h;
        if (imageView != null) {
            imageView.setVisibility((this.f221o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC0424ku menuC0424ku = this.f207a.f3599n;
        boolean z = this.f223q;
        if (z || this.f219m) {
            ImageView imageView = this.f208b;
            if (imageView == null && drawable == null && !this.f219m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f208b = imageView2;
                LinearLayout linearLayout = this.f215i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f219m) {
                this.f208b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f208b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f208b.getVisibility() != 0) {
                this.f208b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f210d.getVisibility() != 8) {
                this.f210d.setVisibility(8);
            }
        } else {
            this.f210d.setText(charSequence);
            if (this.f210d.getVisibility() != 0) {
                this.f210d.setVisibility(0);
            }
        }
    }
}
