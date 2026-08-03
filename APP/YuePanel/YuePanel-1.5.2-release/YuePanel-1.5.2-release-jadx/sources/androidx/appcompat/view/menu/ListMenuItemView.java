package androidx.appcompat.view.menu;

import Yue.C6898;
import Yue.C7837;
import Yue.InterfaceC7144;
import android.R;
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
import androidx.appcompat.view.menu.InterfaceC8700;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements InterfaceC8700.InterfaceC1608, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final String f25943 = "ListMenuItemView";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8697 f25944;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ImageView f25945;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public RadioButton f25946;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public TextView f25947;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public CheckBox f25948;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public TextView f25949;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ImageView f25950;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public ImageView f25951;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public LinearLayout f25952;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Drawable f25953;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f25954;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Context f25955;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f25956;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Drawable f25957;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f25958;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public LayoutInflater f25959;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f25960;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18504);
    }

    private LayoutInflater getInflater() {
        if (this.f25959 == null) {
            this.f25959 = LayoutInflater.from(getContext());
        }
        return this.f25959;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f25950;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f25951;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25951.getLayoutParams();
        rect.top += this.f25951.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public C8697 getItemData() {
        return this.f25944;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void initialize(C8697 c8697, int i) {
        this.f25944 = c8697;
        setVisibility(c8697.isVisible() ? 0 : 8);
        setTitle(c8697.m29033(this));
        setCheckable(c8697.isCheckable());
        setShortcut(c8697.m29051(), c8697.m29031());
        setIcon(c8697.getIcon());
        setEnabled(c8697.isEnabled());
        setSubMenuArrowVisible(c8697.hasSubMenu());
        setContentDescription(c8697.getContentDescription());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f25953);
        TextView textView = (TextView) findViewById(C6898.C6903.f18955);
        this.f25947 = textView;
        int i = this.f25954;
        if (i != -1) {
            textView.setTextAppearance(this.f25955, i);
        }
        this.f25949 = (TextView) findViewById(C6898.C6903.f18944);
        ImageView imageView = (ImageView) findViewById(C6898.C6903.f18950);
        this.f25950 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f25957);
        }
        this.f25951 = (ImageView) findViewById(C6898.C6903.f18913);
        this.f25952 = (LinearLayout) findViewById(C6898.C6903.f18904);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f25945 != null && this.f25956) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f25945.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f25946 == null && this.f25948 == null) {
            return;
        }
        if (this.f25944.m29037()) {
            if (this.f25946 == null) {
                m28994();
            }
            compoundButton = this.f25946;
            view = this.f25948;
        } else {
            if (this.f25948 == null) {
                m28992();
            }
            compoundButton = this.f25948;
            view = this.f25946;
        }
        if (z) {
            compoundButton.setChecked(this.f25944.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f25948;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f25946;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f25944.m29037()) {
            if (this.f25946 == null) {
                m28994();
            }
            compoundButton = this.f25946;
        } else {
            if (this.f25948 == null) {
                m28992();
            }
            compoundButton = this.f25948;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f25960 = z;
        this.f25956 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f25951;
        if (imageView != null) {
            imageView.setVisibility((this.f25958 || !z) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setIcon(Drawable drawable) {
        boolean z = this.f25944.m29050() || this.f25960;
        if (z || this.f25956) {
            ImageView imageView = this.f25945;
            if (imageView == null && drawable == null && !this.f25956) {
                return;
            }
            if (imageView == null) {
                m28993();
            }
            if (drawable == null && !this.f25956) {
                this.f25945.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f25945;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f25945.getVisibility() != 0) {
                this.f25945.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setShortcut(boolean z, char c) {
        int i = (z && this.f25944.m29051()) ? 0 : 8;
        if (i == 0) {
            this.f25949.setText(this.f25944.m29032());
        }
        if (this.f25949.getVisibility() != i) {
            this.f25949.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f25947.getVisibility() != 8) {
                this.f25947.setVisibility(8);
            }
        } else {
            this.f25947.setText(charSequence);
            if (this.f25947.getVisibility() != 0) {
                this.f25947.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public boolean showsIcon() {
        return this.f25960;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4639(View view) {
        m4640(view, -1);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4640(View view, int i) {
        LinearLayout linearLayout = this.f25952;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28992() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C6898.C6906.f18982, (ViewGroup) this, false);
        this.f25948 = checkBox;
        m4639(checkBox);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28993() {
        ImageView imageView = (ImageView) getInflater().inflate(C6898.C6906.f18983, (ViewGroup) this, false);
        this.f25945 = imageView;
        m4640(imageView, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28994() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C6898.C6906.f18985, (ViewGroup) this, false);
        this.f25946 = radioButton;
        m4639(radioButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C7837 c7837M24869 = C7837.m24869(getContext(), attributeSet, C6898.C6909.f19659, i, 0);
        this.f25953 = c7837M24869.m24875(C6898.C6909.f19665);
        this.f25954 = c7837M24869.m24888(C6898.C6909.f19661, -1);
        this.f25956 = c7837M24869.m3933(C6898.C6909.f19667, false);
        this.f25955 = context;
        this.f25957 = c7837M24869.m24875(C6898.C6909.f19668);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C6898.C1110.f18469, 0);
        this.f25958 = typedArrayObtainStyledAttributes.hasValue(0);
        c7837M24869.m24899();
        typedArrayObtainStyledAttributes.recycle();
    }
}
