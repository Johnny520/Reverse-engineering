package androidx.appcompat.view.menu;

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
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p004C.C0064h;
import p058d.AbstractC0515a;
import p068h.C0596o;
import p068h.InterfaceC0576A;
import p068h.MenuC0594m;
import p099y.AbstractC1048L;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0576A, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b */
    public C0596o f928b;

    /* JADX INFO: renamed from: c */
    public ImageView f929c;

    /* JADX INFO: renamed from: d */
    public RadioButton f930d;

    /* JADX INFO: renamed from: e */
    public TextView f931e;

    /* JADX INFO: renamed from: f */
    public CheckBox f932f;

    /* JADX INFO: renamed from: g */
    public TextView f933g;

    /* JADX INFO: renamed from: h */
    public ImageView f934h;

    /* JADX INFO: renamed from: i */
    public ImageView f935i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f936j;

    /* JADX INFO: renamed from: k */
    public final Drawable f937k;

    /* JADX INFO: renamed from: l */
    public final int f938l;

    /* JADX INFO: renamed from: m */
    public final Context f939m;

    /* JADX INFO: renamed from: n */
    public boolean f940n;

    /* JADX INFO: renamed from: o */
    public final Drawable f941o;

    /* JADX INFO: renamed from: p */
    public final boolean f942p;

    /* JADX INFO: renamed from: q */
    public LayoutInflater f943q;

    /* JADX INFO: renamed from: r */
    public boolean f944r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0064h c0064hM114t = C0064h.m114t(getContext(), attributeSet, AbstractC0515a.f1654r, R.attr.listMenuViewStyle);
        this.f937k = c0064hM114t.m123m(5);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        this.f938l = typedArray.getResourceId(1, -1);
        this.f940n = typedArray.getBoolean(7, false);
        this.f939m = context;
        this.f941o = c0064hM114t.m123m(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f942p = typedArrayObtainStyledAttributes.hasValue(0);
        c0064hM114t.m130v();
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private LayoutInflater getInflater() {
        if (this.f943q == null) {
            this.f943q = LayoutInflater.from(getContext());
        }
        return this.f943q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f934h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f935i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f935i.getLayoutParams();
        rect.top = this.f935i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p068h.InterfaceC0576A
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo645c(C0596o c0596o) {
        boolean z2;
        int i2;
        String string;
        boolean z3;
        this.f928b = c0596o;
        setVisibility(c0596o.isVisible() ? 0 : 8);
        setTitle(c0596o.f2064e);
        setCheckable(c0596o.isCheckable());
        if (c0596o.f2073n.mo1167o()) {
            if ((c0596o.f2073n.mo1166n() ? c0596o.f2069j : c0596o.f2067h) != 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        c0596o.f2073n.mo1166n();
        if (z2) {
            C0596o c0596o2 = this.f928b;
            if (c0596o2.f2073n.mo1167o()) {
                if ((c0596o2.f2073n.mo1166n() ? c0596o2.f2069j : c0596o2.f2067h) != 0) {
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
            TextView textView = this.f933g;
            C0596o c0596o3 = this.f928b;
            char c2 = c0596o3.f2073n.mo1166n() ? c0596o3.f2069j : c0596o3.f2067h;
            if (c2 == 0) {
                string = "";
            } else {
                MenuC0594m menuC0594m = c0596o3.f2073n;
                Resources resources = menuC0594m.f2030a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuC0594m.f2030a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = menuC0594m.mo1166n() ? c0596o3.f2070k : c0596o3.f2068i;
                C0596o.m1197c(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0596o.m1197c(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0596o.m1197c(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0596o.m1197c(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0596o.m1197c(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0596o.m1197c(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c2 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f933g.getVisibility() != i2) {
            this.f933g.setVisibility(i2);
        }
        setIcon(c0596o.getIcon());
        setEnabled(c0596o.isEnabled());
        setSubMenuArrowVisible(c0596o.hasSubMenu());
        setContentDescription(c0596o.f2076q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0576A
    public C0596o getItemData() {
        return this.f928b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        setBackground(this.f937k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f931e = textView;
        int i2 = this.f938l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f939m, i2);
        }
        this.f933g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f934h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f941o);
        }
        this.f935i = (ImageView) findViewById(R.id.group_divider);
        this.f936j = (LinearLayout) findViewById(R.id.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f929c != null && this.f940n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f929c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f930d == null && this.f932f == null) {
            return;
        }
        if ((this.f928b.f2083x & 4) != 0) {
            if (this.f930d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f930d = radioButton;
                LinearLayout linearLayout = this.f936j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f930d;
            view = this.f932f;
        } else {
            if (this.f932f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f932f = checkBox;
                LinearLayout linearLayout2 = this.f936j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f932f;
            view = this.f930d;
        }
        if (z2) {
            compoundButton.setChecked(this.f928b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f932f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f930d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f928b.f2083x & 4) != 0) {
            if (this.f930d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f930d = radioButton;
                LinearLayout linearLayout = this.f936j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f930d;
        } else {
            if (this.f932f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f932f = checkBox;
                LinearLayout linearLayout2 = this.f936j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f932f;
        }
        compoundButton.setChecked(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setForceShowIcon(boolean z2) {
        this.f944r = z2;
        this.f940n = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f935i;
        if (imageView != null) {
            imageView.setVisibility((this.f942p || !z2) ? 8 : 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        this.f928b.f2073n.getClass();
        boolean z2 = this.f944r;
        if (z2 || this.f940n) {
            ImageView imageView = this.f929c;
            if (imageView == null && drawable == null && !this.f940n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f929c = imageView2;
                LinearLayout linearLayout = this.f936j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f940n) {
                this.f929c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f929c;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f929c.getVisibility() != 0) {
                this.f929c.setVisibility(0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f931e.getVisibility() != 8) {
                this.f931e.setVisibility(8);
            }
        } else {
            this.f931e.setText(charSequence);
            if (this.f931e.getVisibility() != 0) {
                this.f931e.setVisibility(0);
            }
        }
    }
}
