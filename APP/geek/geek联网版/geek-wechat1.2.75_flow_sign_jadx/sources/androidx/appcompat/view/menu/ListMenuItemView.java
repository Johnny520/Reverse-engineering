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
import p000.AbstractC0205ez;
import p000.C0658r5;
import p000.C0869wu;
import p000.InterfaceC0499mv;
import p000.MenuC0646qu;
import p000.oa0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0499mv, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public C0869wu f170a;

    /* JADX INFO: renamed from: b */
    public ImageView f171b;

    /* JADX INFO: renamed from: c */
    public RadioButton f172c;

    /* JADX INFO: renamed from: d */
    public TextView f173d;

    /* JADX INFO: renamed from: e */
    public CheckBox f174e;

    /* JADX INFO: renamed from: f */
    public TextView f175f;

    /* JADX INFO: renamed from: g */
    public ImageView f176g;

    /* JADX INFO: renamed from: h */
    public ImageView f177h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f178i;

    /* JADX INFO: renamed from: j */
    public final Drawable f179j;

    /* JADX INFO: renamed from: k */
    public final int f180k;

    /* JADX INFO: renamed from: l */
    public final Context f181l;

    /* JADX INFO: renamed from: m */
    public boolean f182m;

    /* JADX INFO: renamed from: n */
    public final Drawable f183n;

    /* JADX INFO: renamed from: o */
    public final boolean f184o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f185p;

    /* JADX INFO: renamed from: q */
    public boolean f186q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0658r5 c0658r5M2226y = C0658r5.m2226y(getContext(), attributeSet, AbstractC0205ez.f1694r, R.attr.listMenuViewStyle);
        this.f179j = c0658r5M2226y.m2241m(5);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        this.f180k = typedArray.getResourceId(1, -1);
        this.f182m = typedArray.getBoolean(7, false);
        this.f181l = context;
        this.f183n = c0658r5M2226y.m2241m(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f184o = typedArrayObtainStyledAttributes.hasValue(0);
        c0658r5M2226y.m2252z();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f185p == null) {
            this.f185p = LayoutInflater.from(getContext());
        }
        return this.f185p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f176g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f177h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f177h.getLayoutParams();
        rect.top = this.f177h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // p000.InterfaceC0499mv
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo119c(p000.C0869wu r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo119c(wu):void");
    }

    @Override // p000.InterfaceC0499mv
    public C0869wu getItemData() {
        return this.f170a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2669q(this, this.f179j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f173d = textView;
        int i = this.f180k;
        if (i != -1) {
            textView.setTextAppearance(this.f181l, i);
        }
        this.f175f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f176g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f183n);
        }
        this.f177h = (ImageView) findViewById(R.id.group_divider);
        this.f178i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f171b != null && this.f182m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f171b.getLayoutParams();
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
        if (!z && this.f172c == null && this.f174e == null) {
            return;
        }
        if ((this.f170a.f5135x & 4) != 0) {
            if (this.f172c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f172c = radioButton;
                LinearLayout linearLayout = this.f178i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f172c;
            view = this.f174e;
        } else {
            if (this.f174e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f174e = checkBox;
                LinearLayout linearLayout2 = this.f178i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f174e;
            view = this.f172c;
        }
        if (z) {
            compoundButton.setChecked(this.f170a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f174e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f172c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f170a.f5135x & 4) != 0) {
            if (this.f172c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f172c = radioButton;
                LinearLayout linearLayout = this.f178i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f172c;
        } else {
            if (this.f174e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f174e = checkBox;
                LinearLayout linearLayout2 = this.f178i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f174e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f186q = z;
        this.f182m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f177h;
        if (imageView != null) {
            imageView.setVisibility((this.f184o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC0646qu menuC0646qu = this.f170a.f5125n;
        boolean z = this.f186q;
        if (z || this.f182m) {
            ImageView imageView = this.f171b;
            if (imageView == null && drawable == null && !this.f182m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f171b = imageView2;
                LinearLayout linearLayout = this.f178i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f182m) {
                this.f171b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f171b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f171b.getVisibility() != 0) {
                this.f171b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f173d.getVisibility() != 8) {
                this.f173d.setVisibility(8);
            }
        } else {
            this.f173d.setText(charSequence);
            if (this.f173d.getVisibility() != 0) {
                this.f173d.setVisibility(0);
            }
        }
    }
}
