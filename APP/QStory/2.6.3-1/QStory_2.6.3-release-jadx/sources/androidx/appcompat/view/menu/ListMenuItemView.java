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
import androidx.appcompat.app.C0955;
import com.davemorrissey.labs.subscaleview.C0328R;
import p204.AbstractC8602;
import p206.C8629;
import p206.InterfaceC8616;
import p206.MenuC8631;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC8616, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f717;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Drawable f718;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f719;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Context f720;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f721;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Drawable f722;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f723;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public LayoutInflater f724;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public CheckBox f725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TextView f726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ImageView f727;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public LinearLayout f728;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public TextView f729;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ImageView f730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ImageView f731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public RadioButton f732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8629 f733;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0955 c0955M914 = C0955.m914(C0328R.attr.listMenuViewStyle, 0, getContext(), attributeSet, AbstractC8602.f21444);
        this.f722 = c0955M914.m950(5);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        this.f721 = typedArray.getResourceId(1, -1);
        this.f719 = typedArray.getBoolean(7, false);
        this.f720 = context;
        this.f718 = c0955M914.m950(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0328R.attr.dropDownListViewStyle, 0);
        this.f717 = typedArrayObtainStyledAttributes.hasValue(0);
        c0955M914.m923();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f724 == null) {
            this.f724 = LayoutInflater.from(getContext());
        }
        return this.f724;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f730;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f727;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f727.getLayoutParams();
        rect.top = this.f727.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p206.InterfaceC8616
    public C8629 getItemData() {
        return this.f733;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f722);
        TextView textView = (TextView) findViewById(C0328R.id.title);
        this.f726 = textView;
        int i = this.f721;
        if (i != -1) {
            textView.setTextAppearance(this.f720, i);
        }
        this.f729 = (TextView) findViewById(C0328R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C0328R.id.submenuarrow);
        this.f730 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f718);
        }
        this.f727 = (ImageView) findViewById(C0328R.id.group_divider);
        this.f728 = (LinearLayout) findViewById(C0328R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f731 != null && this.f719) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f731.getLayoutParams();
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
        if (!z && this.f732 == null && this.f725 == null) {
            return;
        }
        if ((this.f733.f21568 & 4) != 0) {
            if (this.f732 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C0328R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f732 = radioButton;
                LinearLayout linearLayout = this.f728;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f732;
            view = this.f725;
        } else {
            if (this.f725 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C0328R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f725 = checkBox;
                LinearLayout linearLayout2 = this.f728;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f725;
            view = this.f732;
        }
        if (z) {
            compoundButton.setChecked(this.f733.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f725;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f732;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f733.f21568 & 4) != 0) {
            if (this.f732 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C0328R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f732 = radioButton;
                LinearLayout linearLayout = this.f728;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f732;
        } else {
            if (this.f725 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C0328R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f725 = checkBox;
                LinearLayout linearLayout2 = this.f728;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f725;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f723 = z;
        this.f719 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f727;
        if (imageView != null) {
            imageView.setVisibility((this.f717 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC8631 menuC8631 = this.f733.f21570;
        boolean z = this.f723;
        if (z || this.f719) {
            ImageView imageView = this.f731;
            if (imageView == null && drawable == null && !this.f719) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C0328R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f731 = imageView2;
                LinearLayout linearLayout = this.f728;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f719) {
                this.f731.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f731;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f731.getVisibility() != 0) {
                this.f731.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f726;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f726.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f726.getVisibility() != 0) {
                this.f726.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // p206.InterfaceC8616
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1014(C8629 c8629) {
        boolean z;
        String string;
        this.f733 = c8629;
        boolean zIsVisible = c8629.isVisible();
        MenuC8631 menuC8631 = c8629.f21570;
        int i = 0;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c8629.f21581);
        setCheckable(c8629.isCheckable());
        if (menuC8631.mo13689()) {
            if ((menuC8631.mo13687() ? c8629.f21574 : c8629.f21583) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        menuC8631.mo13687();
        if (z) {
            C8629 c86292 = this.f733;
            MenuC8631 menuC86312 = c86292.f21570;
            if (menuC86312.mo13689()) {
                if ((menuC86312.mo13687() ? c86292.f21574 : c86292.f21583) == 0) {
                }
            } else {
                i = 8;
            }
        }
        if (i == 0) {
            TextView textView = this.f729;
            C8629 c86293 = this.f733;
            MenuC8631 menuC86313 = c86293.f21570;
            Context context = menuC86313.f21614;
            char c = menuC86313.mo13687() ? c86293.f21574 : c86293.f21583;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C0328R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC86313.mo13687() ? c86293.f21573 : c86293.f21584;
                C8629.m13709(i2, 65536, resources.getString(C0328R.string.abc_menu_meta_shortcut_label), sb);
                C8629.m13709(i2, 4096, resources.getString(C0328R.string.abc_menu_ctrl_shortcut_label), sb);
                C8629.m13709(i2, 2, resources.getString(C0328R.string.abc_menu_alt_shortcut_label), sb);
                C8629.m13709(i2, 1, resources.getString(C0328R.string.abc_menu_shift_shortcut_label), sb);
                C8629.m13709(i2, 4, resources.getString(C0328R.string.abc_menu_sym_shortcut_label), sb);
                C8629.m13709(i2, 8, resources.getString(C0328R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(C0328R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(C0328R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(C0328R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f729.getVisibility() != i) {
            this.f729.setVisibility(i);
        }
        setIcon(c8629.getIcon());
        setEnabled(c8629.isEnabled());
        setSubMenuArrowVisible(c8629.hasSubMenu());
        setContentDescription(c8629.f21579);
    }
}
