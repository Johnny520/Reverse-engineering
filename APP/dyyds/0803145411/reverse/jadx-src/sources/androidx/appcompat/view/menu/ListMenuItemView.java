package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;
import yyds.AbstractC1592;
import yyds.AbstractC1640;
import yyds.C0644;
import yyds.C1148;
import yyds.InterfaceC2468;
import yyds.MenuC0836;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC2468, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final Context f59;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public TextView f60;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final int f61;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ImageView f62;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public RadioButton f63;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f64;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public LayoutInflater f65;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean f66;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public CheckBox f67;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public LinearLayout f68;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Drawable f69;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public ImageView f70;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f71;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C1148 f72;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final Drawable f73;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public TextView f74;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ImageView f75;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0644 c0644M1535 = C0644.m1535(getContext(), attributeSet, AbstractC1592.f8097, R.attr.listMenuViewStyle);
        this.f69 = c0644M1535.m1554(5);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        this.f61 = typedArray.getResourceId(1, -1);
        this.f64 = typedArray.getBoolean(7, false);
        this.f59 = context;
        this.f73 = c0644M1535.m1554(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f66 = typedArrayObtainStyledAttributes.hasValue(0);
        c0644M1535.m1568();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.f65;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.f65 = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f62;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f70;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f70.getLayoutParams();
        rect.top = this.f70.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // yyds.InterfaceC2468
    public C1148 getItemData() {
        return this.f72;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        setBackground(this.f69);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f74 = textView;
        int i = this.f61;
        if (i != -1) {
            textView.setTextAppearance(this.f59, i);
        }
        this.f60 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f62 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f73);
        }
        this.f70 = (ImageView) findViewById(R.id.group_divider);
        this.f68 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f75 != null && this.f64) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f75.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.f63 == null && this.f67 == null) {
            return;
        }
        if ((this.f72.f5262 & 4) != 0) {
            if (this.f63 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f63 = radioButton;
                LinearLayout linearLayout = this.f68;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f63;
            compoundButton2 = this.f67;
            compoundButton3 = compoundButton2;
        } else {
            if (this.f67 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f67 = checkBox;
                LinearLayout linearLayout2 = this.f68;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f67;
            compoundButton2 = this.f63;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.f63;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.f72.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f72.f5262 & 4) != 0) {
            if (this.f63 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f63 = radioButton;
                LinearLayout linearLayout = this.f68;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f63;
        } else {
            if (this.f67 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f67 = checkBox;
                LinearLayout linearLayout2 = this.f68;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f67;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f71 = z;
        this.f64 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f70;
        if (imageView != null) {
            imageView.setVisibility((this.f66 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC0836 menuC0836 = this.f72.f5276;
        boolean z = this.f71;
        if (z || this.f64) {
            ImageView imageView = this.f75;
            if (imageView == null && drawable == null && !this.f64) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f75 = imageView2;
                LinearLayout linearLayout = this.f68;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f64) {
                this.f75.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f75;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f75.getVisibility() != 0) {
                this.f75.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f74;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f74.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f74.getVisibility() != 0) {
                this.f74.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // yyds.InterfaceC2468
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo26(C1148 c1148) {
        boolean z;
        String string;
        this.f72 = c1148;
        boolean zIsVisible = c1148.isVisible();
        MenuC0836 menuC0836 = c1148.f5276;
        int i = 0;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c1148.f5265);
        setCheckable(c1148.isCheckable());
        if (menuC0836.mo1902()) {
            if ((menuC0836.mo1895() ? c1148.f5269 : c1148.f5271) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        menuC0836.mo1895();
        if (z) {
            C1148 c11482 = this.f72;
            MenuC0836 menuC08362 = c11482.f5276;
            if (menuC08362.mo1902()) {
                if ((menuC08362.mo1895() ? c11482.f5269 : c11482.f5271) == 0) {
                }
            } else {
                i = 8;
            }
        }
        if (i == 0) {
            TextView textView = this.f60;
            C1148 c11483 = this.f72;
            MenuC0836 menuC08363 = c11483.f5276;
            Context context = menuC08363.f3841;
            char c = menuC08363.mo1895() ? c11483.f5269 : c11483.f5271;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC08363.mo1895() ? c11483.f5254 : c11483.f5268;
                C1148.m2336(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                C1148.m2336(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                C1148.m2336(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                C1148.m2336(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                C1148.m2336(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                C1148.m2336(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f60.getVisibility() != i) {
            this.f60.setVisibility(i);
        }
        setIcon(c1148.getIcon());
        setEnabled(c1148.isEnabled());
        setSubMenuArrowVisible(c1148.hasSubMenu());
        setContentDescription(c1148.f5274);
    }
}
