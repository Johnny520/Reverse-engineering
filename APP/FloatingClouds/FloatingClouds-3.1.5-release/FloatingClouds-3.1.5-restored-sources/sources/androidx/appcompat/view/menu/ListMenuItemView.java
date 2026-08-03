package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.InterfaceC1003k;
import p000a.C0751of;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1003k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public C1000h f3707a;

    /* JADX INFO: renamed from: b */
    public ImageView f3708b;

    /* JADX INFO: renamed from: c */
    public RadioButton f3709c;

    /* JADX INFO: renamed from: d */
    public TextView f3710d;

    /* JADX INFO: renamed from: e */
    public CheckBox f3711e;

    /* JADX INFO: renamed from: f */
    public TextView f3712f;

    /* JADX INFO: renamed from: g */
    public ImageView f3713g;

    /* JADX INFO: renamed from: h */
    public ImageView f3714h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f3715i;

    /* JADX INFO: renamed from: j */
    public final Drawable f3716j;

    /* JADX INFO: renamed from: k */
    public final int f3717k;

    /* JADX INFO: renamed from: l */
    public final Context f3718l;

    /* JADX INFO: renamed from: m */
    public boolean f3719m;

    /* JADX INFO: renamed from: n */
    public final Drawable f3720n;

    /* JADX INFO: renamed from: o */
    public final boolean f3721o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f3722p;

    /* JADX INFO: renamed from: q */
    public boolean f3723q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = C0983R.attr.listMenuViewStyle;
        C0751of c0751ofM1768e = C0751of.m1768e(getContext(), attributeSet, C0983R.styleable.MenuView, i);
        this.f3716j = c0751ofM1768e.m1770b(C0983R.styleable.MenuView_android_itemBackground);
        int i2 = C0983R.styleable.MenuView_android_itemTextAppearance;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        this.f3717k = typedArray.getResourceId(i2, -1);
        this.f3719m = typedArray.getBoolean(C0983R.styleable.MenuView_preserveIconSpacing, false);
        this.f3718l = context;
        this.f3720n = c0751ofM1768e.m1770b(C0983R.styleable.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0983R.attr.dropDownListViewStyle, 0);
        this.f3721o = typedArrayObtainStyledAttributes.hasValue(0);
        c0751ofM1768e.m1773f();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3722p == null) {
            this.f3722p = LayoutInflater.from(getContext());
        }
        return this.f3722p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f3713g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3714h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3714h.getLayoutParams();
        rect.top = this.f3714h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // androidx.appcompat.view.menu.InterfaceC1003k.a
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2300b(C1000h c1000h) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f3707a = c1000h;
        setVisibility(c1000h.isVisible() ? 0 : 8);
        setTitle(c1000h.f3818e);
        setCheckable(c1000h.isCheckable());
        if (c1000h.f3827n.mo2330o()) {
            if ((c1000h.f3827n.mo2329n() ? c1000h.f3823j : c1000h.f3821h) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        c1000h.f3827n.mo2329n();
        if (z) {
            C1000h c1000h2 = this.f3707a;
            if (c1000h2.f3827n.mo2330o()) {
                if ((c1000h2.f3827n.mo2329n() ? c1000h2.f3823j : c1000h2.f3821h) != 0) {
                    z2 = true;
                }
                if (z2) {
                }
            } else {
                z2 = false;
                i = z2 ? 0 : 8;
            }
        }
        if (i == 0) {
            TextView textView = this.f3712f;
            C1000h c1000h3 = this.f3707a;
            char c = c1000h3.f3827n.mo2329n() ? c1000h3.f3823j : c1000h3.f3821h;
            if (c == 0) {
                string = "";
            } else {
                C0998f c0998f = c1000h3.f3827n;
                Resources resources = c0998f.f3784a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(c0998f.f3784a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C0983R.string.abc_prepend_shortcut_label));
                }
                int i2 = c0998f.mo2329n() ? c1000h3.f3824k : c1000h3.f3822i;
                C1000h.m2339c(sb, i2, 65536, resources.getString(C0983R.string.abc_menu_meta_shortcut_label));
                C1000h.m2339c(sb, i2, 4096, resources.getString(C0983R.string.abc_menu_ctrl_shortcut_label));
                C1000h.m2339c(sb, i2, 2, resources.getString(C0983R.string.abc_menu_alt_shortcut_label));
                C1000h.m2339c(sb, i2, 1, resources.getString(C0983R.string.abc_menu_shift_shortcut_label));
                C1000h.m2339c(sb, i2, 4, resources.getString(C0983R.string.abc_menu_sym_shortcut_label));
                C1000h.m2339c(sb, i2, 8, resources.getString(C0983R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(C0983R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(C0983R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(C0983R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f3712f.getVisibility() != i) {
            this.f3712f.setVisibility(i);
        }
        setIcon(c1000h.getIcon());
        setEnabled(c1000h.isEnabled());
        setSubMenuArrowVisible(c1000h.hasSubMenu());
        setContentDescription(c1000h.f3830q);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k.a
    public C1000h getItemData() {
        return this.f3707a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f3716j);
        TextView textView = (TextView) findViewById(C0983R.id.title);
        this.f3710d = textView;
        int i = this.f3717k;
        if (i != -1) {
            textView.setTextAppearance(this.f3718l, i);
        }
        this.f3712f = (TextView) findViewById(C0983R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C0983R.id.submenuarrow);
        this.f3713g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3720n);
        }
        this.f3714h = (ImageView) findViewById(C0983R.id.group_divider);
        this.f3715i = (LinearLayout) findViewById(C0983R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f3708b != null && this.f3719m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3708b.getLayoutParams();
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
        if (!z && this.f3709c == null && this.f3711e == null) {
            return;
        }
        if ((this.f3707a.f3837x & 4) != 0) {
            if (this.f3709c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C0983R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3709c = radioButton;
                LinearLayout linearLayout = this.f3715i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3709c;
            view = this.f3711e;
        } else {
            if (this.f3711e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C0983R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3711e = checkBox;
                LinearLayout linearLayout2 = this.f3715i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3711e;
            view = this.f3709c;
        }
        if (z) {
            compoundButton.setChecked(this.f3707a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3711e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3709c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f3707a.f3837x & 4) != 0) {
            if (this.f3709c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C0983R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3709c = radioButton;
                LinearLayout linearLayout = this.f3715i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3709c;
        } else {
            if (this.f3711e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C0983R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3711e = checkBox;
                LinearLayout linearLayout2 = this.f3715i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3711e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f3723q = z;
        this.f3719m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f3714h;
        if (imageView != null) {
            imageView.setVisibility((this.f3721o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3707a.f3827n.getClass();
        boolean z = this.f3723q;
        if (z || this.f3719m) {
            ImageView imageView = this.f3708b;
            if (imageView == null && drawable == null && !this.f3719m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C0983R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3708b = imageView2;
                LinearLayout linearLayout = this.f3715i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3719m) {
                this.f3708b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3708b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3708b.getVisibility() != 0) {
                this.f3708b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3710d.getVisibility() != 8) {
                this.f3710d.setVisibility(8);
            }
        } else {
            this.f3710d.setText(charSequence);
            if (this.f3710d.getVisibility() != 0) {
                this.f3710d.setVisibility(0);
            }
        }
    }
}
