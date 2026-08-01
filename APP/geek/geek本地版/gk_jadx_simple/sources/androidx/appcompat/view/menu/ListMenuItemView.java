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
import com.ljx.wechatmod.R;
import defpackage.ev;
import defpackage.ja0;
import defpackage.ku;
import defpackage.ou;
import defpackage.r5;
import defpackage.s90;
import defpackage.xy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements ev, AbsListView.SelectionBoundsAdjuster {
    public ou a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public final Drawable j;
    public final int k;
    public final Context l;
    public boolean m;
    public final Drawable n;
    public final boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context r5, AttributeSet r6) {
        super(r5, r6);
        r5 r62 = r5.y(getContext(), r6, xy.r, R.attr.listMenuViewStyle);
        this.j = r62.m(5);
        TypedArray r0 = (TypedArray) r62.b;
        this.k = r0.getResourceId(1, -1);
        this.m = r0.getBoolean(7, false);
        this.l = r5;
        this.n = r62.m(8);
        TypedArray r52 = r5.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.o = r52.hasValue(0);
        r62.z();
        r52.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.p != null) goto L6;
        this.p = LayoutInflater.from(getContext());
    L6:
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean r2) {
        ImageView r0 = this.g;
        if (r0 == null) goto L9;
        if (r2 == false) goto L6;
        int r22 = 0;
    L7:
        r0.setVisibility(r22);
        return;
    L6:
        r22 = 8;
        goto L7
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect r5) {
        ImageView r0 = this.h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getVisibility() != 0) goto L9;
        LinearLayout.LayoutParams r02 = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        int r1 = r5.top;
        r5.top = ((this.h.getHeight() + r02.topMargin) + r02.bottomMargin) + r1;
        return;
    }

    @Override // defpackage.ev
    public final void c(ou r11) {
        this.a = r11;
        boolean r0 = r11.isVisible();
        ku r1 = r11.n;
        int r3 = 0;
        if (r0 == false) goto L5;
        int r02 = 0;
    L6:
        setVisibility(r02);
        setTitle(r11.e);
        setCheckable(r11.isCheckable());
        if (r1.o() == true) goto L9;
    L14:
        boolean r03 = false;
    L15:
        r1.n();
        if (r03 == false) goto L28;
        ou r04 = this.a;
        ku r12 = r04.n;
        if (r12.o() == true) goto L20;
    L25:
        boolean r05 = false;
    L26:
        if (r05 == false) goto L28;
    L29:
        if (r3 != 0) goto L56;
        TextView r06 = this.f;
        ou r13 = this.a;
        ku r5 = r13.n;
        Context r6 = r5.a;
        if (r5.n() == false) goto L33;
        char r7 = r13.j;
    L34:
        if (r7 != 0) goto L36;
        String r14 = "";
    L54:
        r06.setText(r14);
        goto L56
    L36:
        Resources r8 = r6.getResources();
        StringBuilder r9 = new StringBuilder();
        if (ViewConfiguration.get(r6).hasPermanentMenuKey() == false) goto L40;
        r9.append(r8.getString(R.string.abc_prepend_shortcut_label));
    L40:
        if (r5.n() == false) goto L42;
        int r15 = r13.k;
    L43:
        ou.c(r9, r15, 65536, r8.getString(R.string.abc_menu_meta_shortcut_label));
        ou.c(r9, r15, 4096, r8.getString(R.string.abc_menu_ctrl_shortcut_label));
        ou.c(r9, r15, 2, r8.getString(R.string.abc_menu_alt_shortcut_label));
        ou.c(r9, r15, 1, r8.getString(R.string.abc_menu_shift_shortcut_label));
        ou.c(r9, r15, 4, r8.getString(R.string.abc_menu_sym_shortcut_label));
        ou.c(r9, r15, 8, r8.getString(R.string.abc_menu_function_shortcut_label));
        if (r7 != '\b') goto L46;
        r9.append(r8.getString(R.string.abc_menu_delete_shortcut_label));
    L53:
        r14 = r9.toString();
        goto L54
    L46:
        if (r7 != '\n') goto L48;
        r9.append(r8.getString(R.string.abc_menu_enter_shortcut_label));
        goto L53
    L48:
        if (r7 == ' ') goto L50;
        r9.append(r7);
        goto L53
    L50:
        r9.append(r8.getString(R.string.abc_menu_space_shortcut_label));
        goto L53
    L42:
        r15 = r13.i;
        goto L43
    L33:
        r7 = r13.h;
    L56:
        if (this.f.getVisibility() == r3) goto L58;
        this.f.setVisibility(r3);
    L58:
        setIcon(r11.getIcon());
        setEnabled(r11.isEnabled());
        setSubMenuArrowVisible(r11.hasSubMenu());
        setContentDescription(r11.q);
        return;
    L20:
        if (r12.n() == false) goto L22;
        char r07 = r04.j;
    L23:
        if (r07 == 0) goto L25;
        r05 = true;
        goto L26
    L22:
        r07 = r04.h;
    L28:
        r3 = 8;
        goto L29
    L9:
        if (r1.n() == false) goto L11;
        char r08 = r11.j;
    L12:
        if (r08 == 0) goto L14;
        r03 = true;
        goto L15
    L11:
        r08 = r11.h;
        goto L12
    L5:
        r02 = 8;
        goto L6
    }

    @Override // defpackage.ev
    public ou getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap r0 = ja0.a;
        s90.q(this, this.j);
        TextView r02 = (TextView) findViewById(R.id.title);
        this.d = r02;
        int r2 = this.k;
        if (r2 == (-1)) goto L5;
        r02.setTextAppearance(this.l, r2);
    L5:
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView r03 = (ImageView) findViewById(R.id.submenuarrow);
        this.g = r03;
        if (r03 == null) goto L8;
        r03.setImageDrawable(this.n);
    L8:
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
        if (this.b != null) goto L5;
    L11:
        super.onMeasure(r4, r5);
        return;
    L5:
        if (this.m == false) goto L11;
        ViewGroup.LayoutParams r0 = getLayoutParams();
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        int r02 = r0.height;
        if (r02 <= 0) goto L11;
        if (r1.width > 0) goto L11;
        r1.width = r02;
        goto L11
    }

    public void setCheckable(boolean r5) {
        if (r5 == true) goto L9;
        if (this.c != null) goto L9;
        if (this.e != null) goto L9;
        return;
    L9:
        if ((this.a.x & 4) == 0) goto L18;
        if (this.c != null) goto L16;
        RadioButton r0 = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.c = r0;
        LinearLayout r3 = this.i;
        if (r3 == null) goto L15;
        r3.addView(r0, -1);
        goto L16
    L15:
        addView(r0, -1);
    L16:
        CompoundButton r02 = this.c;
        View r1 = this.e;
    L25:
        if (r5 == false) goto L34;
        r02.setChecked(this.a.isChecked());
        if (r02.getVisibility() == 0) goto L29;
        r02.setVisibility(0);
    L29:
        if (r1 != null) goto L31;
        return;
    L31:
        if (r1.getVisibility() == 8) goto L42;
        r1.setVisibility(8);
        return;
    L42:
        return;
    L34:
        CheckBox r52 = this.e;
        if (r52 == null) goto L37;
        r52.setVisibility(8);
    L37:
        RadioButton r53 = this.c;
        if (r53 == null) goto L43;
        r53.setVisibility(8);
        return;
    L43:
        return;
    L18:
        if (this.e != null) goto L23;
        CheckBox r03 = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.e = r03;
        LinearLayout r32 = this.i;
        if (r32 == null) goto L22;
        r32.addView(r03, -1);
        goto L23
    L22:
        addView(r03, -1);
    L23:
        r02 = this.e;
        r1 = this.c;
        goto L25
    }

    public void setChecked(boolean r5) {
        if ((this.a.x & 4) == 0) goto L12;
        if (this.c != null) goto L10;
        RadioButton r0 = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.c = r0;
        LinearLayout r2 = this.i;
        if (r2 == null) goto L9;
        r2.addView(r0, -1);
        goto L10
    L9:
        addView(r0, -1);
    L10:
        CompoundButton r02 = this.c;
    L18:
        r02.setChecked(r5);
        return;
    L12:
        if (this.e != null) goto L17;
        CheckBox r03 = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.e = r03;
        LinearLayout r22 = this.i;
        if (r22 == null) goto L16;
        r22.addView(r03, -1);
        goto L17
    L16:
        addView(r03, -1);
    L17:
        r02 = this.e;
        goto L18
    }

    public void setForceShowIcon(boolean r1) {
        this.q = r1;
        this.m = r1;
    }

    public void setGroupDividerEnabled(boolean r3) {
        ImageView r0 = this.h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.o == true) goto L8;
        if (r3 == false) goto L8;
        int r32 = 0;
    L9:
        r0.setVisibility(r32);
        return;
    L8:
        r32 = 8;
        goto L9
    }

    public void setIcon(Drawable r5) {
        ku r0 = this.a.n;
        boolean r02 = this.q;
        if (r02 == false) goto L5;
    L7:
        ImageView r1 = this.b;
        if (r1 != null) goto L14;
        if (r5 != null) goto L14;
        if (this.m == true) goto L14;
        return;
    L14:
        if (r1 != null) goto L19;
        ImageView r12 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
        this.b = r12;
        LinearLayout r3 = this.i;
        if (r3 == null) goto L18;
        r3.addView(r12, 0);
        goto L19
    L18:
        addView(r12, 0);
    L19:
        if (r5 == null) goto L21;
    L25:
        ImageView r13 = this.b;
        if (r02 == true) goto L29;
        r5 = null;
    L29:
        r13.setImageDrawable(r5);
        if (this.b.getVisibility() == 0) goto L33;
        this.b.setVisibility(0);
        return;
    L33:
        return;
    L21:
        if (this.m == true) goto L25;
        this.b.setVisibility(8);
        return;
    L5:
        if (this.m == true) goto L7;
    }

    public void setTitle(CharSequence r2) {
        if (r2 == null) goto L8;
        this.d.setText(r2);
        if (this.d.getVisibility() == 0) goto L11;
        this.d.setVisibility(0);
        return;
    L11:
        return;
    L8:
        if (this.d.getVisibility() == 8) goto L12;
        this.d.setVisibility(8);
        return;
    }
}
