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
import io.github.cherrywechat.R;
import p000.AbstractC0982Wu;
import p000.C2427qr;
import p000.C2656w4;
import p000.InterfaceC0249Fr;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0249Fr, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public C2427qr f3699a;

    /* JADX INFO: renamed from: b */
    public ImageView f3700b;

    /* JADX INFO: renamed from: c */
    public RadioButton f3701c;

    /* JADX INFO: renamed from: d */
    public TextView f3702d;

    /* JADX INFO: renamed from: e */
    public CheckBox f3703e;

    /* JADX INFO: renamed from: f */
    public TextView f3704f;

    /* JADX INFO: renamed from: g */
    public ImageView f3705g;

    /* JADX INFO: renamed from: h */
    public ImageView f3706h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f3707i;

    /* JADX INFO: renamed from: j */
    public final Drawable f3708j;

    /* JADX INFO: renamed from: k */
    public final int f3709k;

    /* JADX INFO: renamed from: l */
    public final Context f3710l;

    /* JADX INFO: renamed from: m */
    public boolean f3711m;

    /* JADX INFO: renamed from: n */
    public final Drawable f3712n;

    /* JADX INFO: renamed from: o */
    public final boolean f3713o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f3714p;

    /* JADX INFO: renamed from: q */
    public boolean f3715q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2656w4 c2656w4M5186A = C2656w4.m5186A(getContext(), attributeSet, AbstractC0982Wu.f3083r, R.attr.listMenuViewStyle);
        this.f3708j = c2656w4M5186A.m5210q(5);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        this.f3709k = typedArray.getResourceId(1, -1);
        this.f3711m = typedArray.getBoolean(7, false);
        this.f3710l = context;
        this.f3712n = c2656w4M5186A.m5210q(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3713o = typedArrayObtainStyledAttributes.hasValue(0);
        c2656w4M5186A.m5195E();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3714p == null) {
            this.f3714p = LayoutInflater.from(getContext());
        }
        return this.f3714p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f3705g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3706h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3706h.getLayoutParams();
        rect.top = this.f3706h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // p000.InterfaceC0249Fr
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo521c(C2427qr c2427qr) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f3699a = c2427qr;
        boolean zIsVisible = c2427qr.isVisible();
        MenuC2204lr menuC2204lr = c2427qr.f8505n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c2427qr.f8496e);
        setCheckable(c2427qr.isCheckable());
        if (menuC2204lr.mo433o()) {
            if ((menuC2204lr.mo432n() ? c2427qr.f8501j : c2427qr.f8499h) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        menuC2204lr.mo432n();
        if (z) {
            C2427qr c2427qr2 = this.f3699a;
            MenuC2204lr menuC2204lr2 = c2427qr2.f8505n;
            if (menuC2204lr2.mo433o()) {
                if ((menuC2204lr2.mo432n() ? c2427qr2.f8501j : c2427qr2.f8499h) != 0) {
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
            TextView textView = this.f3704f;
            C2427qr c2427qr3 = this.f3699a;
            MenuC2204lr menuC2204lr3 = c2427qr3.f8505n;
            Context context = menuC2204lr3.f7660a;
            char c = menuC2204lr3.mo432n() ? c2427qr3.f8501j : c2427qr3.f8499h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC2204lr3.mo432n() ? c2427qr3.f8502k : c2427qr3.f8500i;
                C2427qr.m4858c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                C2427qr.m4858c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                C2427qr.m4858c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                C2427qr.m4858c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                C2427qr.m4858c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                C2427qr.m4858c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
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
        if (this.f3704f.getVisibility() != i) {
            this.f3704f.setVisibility(i);
        }
        setIcon(c2427qr.getIcon());
        setEnabled(c2427qr.isEnabled());
        setSubMenuArrowVisible(c2427qr.hasSubMenu());
        setContentDescription(c2427qr.f8508q);
    }

    @Override // p000.InterfaceC0249Fr
    public C2427qr getItemData() {
        return this.f3699a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f3708j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3702d = textView;
        int i = this.f3709k;
        if (i != -1) {
            textView.setTextAppearance(this.f3710l, i);
        }
        this.f3704f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3705g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3712n);
        }
        this.f3706h = (ImageView) findViewById(R.id.group_divider);
        this.f3707i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f3700b != null && this.f3711m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3700b.getLayoutParams();
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
        if (!z && this.f3701c == null && this.f3703e == null) {
            return;
        }
        if ((this.f3699a.f8515x & 4) != 0) {
            if (this.f3701c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3701c = radioButton;
                LinearLayout linearLayout = this.f3707i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3701c;
            view = this.f3703e;
        } else {
            if (this.f3703e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3703e = checkBox;
                LinearLayout linearLayout2 = this.f3707i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3703e;
            view = this.f3701c;
        }
        if (z) {
            compoundButton.setChecked(this.f3699a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3703e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3701c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f3699a.f8515x & 4) != 0) {
            if (this.f3701c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3701c = radioButton;
                LinearLayout linearLayout = this.f3707i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3701c;
        } else {
            if (this.f3703e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3703e = checkBox;
                LinearLayout linearLayout2 = this.f3707i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3703e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f3715q = z;
        this.f3711m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f3706h;
        if (imageView != null) {
            imageView.setVisibility((this.f3713o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC2204lr menuC2204lr = this.f3699a.f8505n;
        boolean z = this.f3715q;
        if (z || this.f3711m) {
            ImageView imageView = this.f3700b;
            if (imageView == null && drawable == null && !this.f3711m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3700b = imageView2;
                LinearLayout linearLayout = this.f3707i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3711m) {
                this.f3700b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3700b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3700b.getVisibility() != 0) {
                this.f3700b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3702d.getVisibility() != 8) {
                this.f3702d.setVisibility(8);
            }
        } else {
            this.f3702d.setText(charSequence);
            if (this.f3702d.getVisibility() != 0) {
                this.f3702d.setVisibility(0);
            }
        }
    }
}
