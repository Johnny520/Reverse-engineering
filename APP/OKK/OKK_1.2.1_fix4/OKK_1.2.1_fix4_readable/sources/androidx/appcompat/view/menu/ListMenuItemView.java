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
import org.luckypray.dexkit.C1031R;
import p018J0.C0234d;
import p048b.AbstractC0550a;
import p055f.InterfaceC0786q;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0786q, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public MenuItemC0780k f1075a;

    /* JADX INFO: renamed from: b */
    public ImageView f1076b;

    /* JADX INFO: renamed from: c */
    public RadioButton f1077c;

    /* JADX INFO: renamed from: d */
    public TextView f1078d;

    /* JADX INFO: renamed from: e */
    public CheckBox f1079e;

    /* JADX INFO: renamed from: f */
    public TextView f1080f;

    /* JADX INFO: renamed from: g */
    public ImageView f1081g;

    /* JADX INFO: renamed from: h */
    public ImageView f1082h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1083i;

    /* JADX INFO: renamed from: j */
    public final Drawable f1084j;

    /* JADX INFO: renamed from: k */
    public final int f1085k;

    /* JADX INFO: renamed from: l */
    public final Context f1086l;

    /* JADX INFO: renamed from: m */
    public boolean f1087m;

    /* JADX INFO: renamed from: n */
    public final Drawable f1088n;

    /* JADX INFO: renamed from: o */
    public final boolean f1089o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f1090p;

    /* JADX INFO: renamed from: q */
    public boolean f1091q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0234d c0234dM638s = C0234d.m638s(getContext(), attributeSet, AbstractC0550a.f1630o, C1031R.attr.listMenuViewStyle, 0);
        this.f1084j = c0234dM638s.m646i(5);
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        this.f1085k = typedArray.getResourceId(1, -1);
        this.f1087m = typedArray.getBoolean(7, false);
        this.f1086l = context;
        this.f1088n = c0234dM638s.m646i(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C1031R.attr.dropDownListViewStyle, 0);
        this.f1089o = typedArrayObtainStyledAttributes.hasValue(0);
        c0234dM638s.m657u();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1090p == null) {
            this.f1090p = LayoutInflater.from(getContext());
        }
        return this.f1090p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1081g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1082h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1082h.getLayoutParams();
        rect.top = this.f1082h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p055f.InterfaceC0786q
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1113c(MenuItemC0780k menuItemC0780k) {
        boolean z2;
        int i2;
        String string;
        boolean z3;
        this.f1075a = menuItemC0780k;
        setVisibility(menuItemC0780k.isVisible() ? 0 : 8);
        setTitle(menuItemC0780k.f2811e);
        setCheckable(menuItemC0780k.isCheckable());
        if (menuItemC0780k.f2820n.mo2008n()) {
            if ((menuItemC0780k.f2820n.mo2007m() ? menuItemC0780k.f2816j : menuItemC0780k.f2814h) != 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        menuItemC0780k.f2820n.mo2007m();
        if (z2) {
            MenuItemC0780k menuItemC0780k2 = this.f1075a;
            if (menuItemC0780k2.f2820n.mo2008n()) {
                if ((menuItemC0780k2.f2820n.mo2007m() ? menuItemC0780k2.f2816j : menuItemC0780k2.f2814h) != 0) {
                    z3 = true;
                }
                if (z3) {
                }
            } else {
                z3 = false;
                i2 = z3 ? 0 : 8;
            }
        }
        if (i2 == 0) {
            TextView textView = this.f1080f;
            MenuItemC0780k menuItemC0780k3 = this.f1075a;
            char c = menuItemC0780k3.f2820n.mo2007m() ? menuItemC0780k3.f2816j : menuItemC0780k3.f2814h;
            if (c == 0) {
                string = "";
            } else {
                MenuC0779j menuC0779j = menuItemC0780k3.f2820n;
                Resources resources = menuC0779j.f2785a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuC0779j.f2785a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C1031R.string.abc_prepend_shortcut_label));
                }
                int i3 = menuC0779j.mo2007m() ? menuItemC0780k3.f2817k : menuItemC0780k3.f2815i;
                MenuItemC0780k.m2014a(sb, i3, 65536, resources.getString(C1031R.string.abc_menu_meta_shortcut_label));
                MenuItemC0780k.m2014a(sb, i3, 4096, resources.getString(C1031R.string.abc_menu_ctrl_shortcut_label));
                MenuItemC0780k.m2014a(sb, i3, 2, resources.getString(C1031R.string.abc_menu_alt_shortcut_label));
                MenuItemC0780k.m2014a(sb, i3, 1, resources.getString(C1031R.string.abc_menu_shift_shortcut_label));
                MenuItemC0780k.m2014a(sb, i3, 4, resources.getString(C1031R.string.abc_menu_sym_shortcut_label));
                MenuItemC0780k.m2014a(sb, i3, 8, resources.getString(C1031R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(C1031R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(C1031R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(C1031R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1080f.getVisibility() != i2) {
            this.f1080f.setVisibility(i2);
        }
        setIcon(menuItemC0780k.getIcon());
        setEnabled(menuItemC0780k.isEnabled());
        setSubMenuArrowVisible(menuItemC0780k.hasSubMenu());
        setContentDescription(menuItemC0780k.f2823q);
    }

    @Override // p055f.InterfaceC0786q
    public MenuItemC0780k getItemData() {
        return this.f1075a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1084j);
        TextView textView = (TextView) findViewById(C1031R.id.title);
        this.f1078d = textView;
        int i2 = this.f1085k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1086l, i2);
        }
        this.f1080f = (TextView) findViewById(C1031R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C1031R.id.submenuarrow);
        this.f1081g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1088n);
        }
        this.f1082h = (ImageView) findViewById(C1031R.id.group_divider);
        this.f1083i = (LinearLayout) findViewById(C1031R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1076b != null && this.f1087m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1076b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1077c == null && this.f1079e == null) {
            return;
        }
        if ((this.f1075a.f2830x & 4) != 0) {
            if (this.f1077c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C1031R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1077c = radioButton;
                LinearLayout linearLayout = this.f1083i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1077c;
            view = this.f1079e;
        } else {
            if (this.f1079e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C1031R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1079e = checkBox;
                LinearLayout linearLayout2 = this.f1083i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1079e;
            view = this.f1077c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1075a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1079e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1077c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1075a.f2830x & 4) != 0) {
            if (this.f1077c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C1031R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1077c = radioButton;
                LinearLayout linearLayout = this.f1083i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1077c;
        } else {
            if (this.f1079e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C1031R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1079e = checkBox;
                LinearLayout linearLayout2 = this.f1083i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1079e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1091q = z2;
        this.f1087m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1082h;
        if (imageView != null) {
            imageView.setVisibility((this.f1089o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1075a.f2820n.getClass();
        boolean z2 = this.f1091q;
        if (z2 || this.f1087m) {
            ImageView imageView = this.f1076b;
            if (imageView == null && drawable == null && !this.f1087m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C1031R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1076b = imageView2;
                LinearLayout linearLayout = this.f1083i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1087m) {
                this.f1076b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1076b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1076b.getVisibility() != 0) {
                this.f1076b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1078d.getVisibility() != 8) {
                this.f1078d.setVisibility(8);
            }
        } else {
            this.f1078d.setText(charSequence);
            if (this.f1078d.getVisibility() != 0) {
                this.f1078d.setVisibility(0);
            }
        }
    }
}
