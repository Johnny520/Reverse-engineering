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

    public ListMenuItemView(Context r5, AttributeSet r6) {
        super(r5, r6);
        C0234d r62 = C0234d.m638s(getContext(), r6, AbstractC0550a.f1630o, C1031R.attr.listMenuViewStyle, 0);
        this.f1084j = r62.m646i(5);
        TypedArray r2 = (TypedArray) r62.f475c;
        this.f1085k = r2.getResourceId(1, -1);
        this.f1087m = r2.getBoolean(7, false);
        this.f1086l = r5;
        this.f1088n = r62.m646i(8);
        TypedArray r52 = r5.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C1031R.attr.dropDownListViewStyle, 0);
        this.f1089o = r52.hasValue(0);
        r62.m657u();
        r52.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1090p != null) goto L6;
        this.f1090p = LayoutInflater.from(getContext());
    L6:
        return this.f1090p;
    }

    private void setSubMenuArrowVisible(boolean r2) {
        ImageView r02 = this.f1081g;
        if (r02 == null) goto L9;
        if (r2 == false) goto L6;
        int r22 = 0;
    L7:
        r02.setVisibility(r22);
        return;
    L6:
        r22 = 8;
        goto L7
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect r5) {
        ImageView r02 = this.f1082h;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.getVisibility() != 0) goto L9;
        LinearLayout.LayoutParams r03 = (LinearLayout.LayoutParams) this.f1082h.getLayoutParams();
        int r1 = r5.top;
        r5.top = ((this.f1082h.getHeight() + r03.topMargin) + r03.bottomMargin) + r1;
        return;
    }

    @Override // p055f.InterfaceC0786q
    /* JADX INFO: renamed from: c */
    public final void mo1113c(MenuItemC0780k r11) {
        this.f1075a = r11;
        int r2 = 0;
        if (r11.isVisible() == false) goto L5;
        int r02 = 0;
    L6:
        setVisibility(r02);
        setTitle(r11.f2811e);
        setCheckable(r11.isCheckable());
        if (r11.f2820n.mo2008n() == true) goto L9;
    L14:
        boolean r03 = false;
    L15:
        r11.f2820n.mo2007m();
        if (r03 == false) goto L28;
        MenuItemC0780k r04 = this.f1075a;
        if (r04.f2820n.mo2008n() == true) goto L20;
    L25:
        boolean r05 = false;
    L26:
        if (r05 == false) goto L28;
    L29:
        if (r2 != 0) goto L56;
        TextView r06 = this.f1080f;
        MenuItemC0780k r4 = this.f1075a;
        if (r4.f2820n.mo2007m() == false) goto L33;
        char r5 = r4.f2816j;
    L34:
        if (r5 != 0) goto L36;
        String r1 = "";
    L54:
        r06.setText(r1);
        goto L56
    L36:
        MenuC0779j r6 = r4.f2820n;
        Resources r7 = r6.f2785a.getResources();
        StringBuilder r8 = new StringBuilder();
        if (ViewConfiguration.get(r6.f2785a).hasPermanentMenuKey() == false) goto L40;
        r8.append(r7.getString(C1031R.string.abc_prepend_shortcut_label));
    L40:
        if (r6.mo2007m() == false) goto L42;
        int r42 = r4.f2817k;
    L43:
        MenuItemC0780k.m2014a(r8, r42, 65536, r7.getString(C1031R.string.abc_menu_meta_shortcut_label));
        MenuItemC0780k.m2014a(r8, r42, 4096, r7.getString(C1031R.string.abc_menu_ctrl_shortcut_label));
        MenuItemC0780k.m2014a(r8, r42, 2, r7.getString(C1031R.string.abc_menu_alt_shortcut_label));
        MenuItemC0780k.m2014a(r8, r42, 1, r7.getString(C1031R.string.abc_menu_shift_shortcut_label));
        MenuItemC0780k.m2014a(r8, r42, 4, r7.getString(C1031R.string.abc_menu_sym_shortcut_label));
        MenuItemC0780k.m2014a(r8, r42, 8, r7.getString(C1031R.string.abc_menu_function_shortcut_label));
        if (r5 != '\b') goto L46;
        r8.append(r7.getString(C1031R.string.abc_menu_delete_shortcut_label));
    L53:
        r1 = r8.toString();
        goto L54
    L46:
        if (r5 != '\n') goto L48;
        r8.append(r7.getString(C1031R.string.abc_menu_enter_shortcut_label));
        goto L53
    L48:
        if (r5 == ' ') goto L50;
        r8.append(r5);
        goto L53
    L50:
        r8.append(r7.getString(C1031R.string.abc_menu_space_shortcut_label));
        goto L53
    L42:
        r42 = r4.f2815i;
        goto L43
    L33:
        r5 = r4.f2814h;
    L56:
        if (this.f1080f.getVisibility() == r2) goto L58;
        this.f1080f.setVisibility(r2);
    L58:
        setIcon(r11.getIcon());
        setEnabled(r11.isEnabled());
        setSubMenuArrowVisible(r11.hasSubMenu());
        setContentDescription(r11.f2823q);
        return;
    L20:
        if (r04.f2820n.mo2007m() == false) goto L22;
        char r07 = r04.f2816j;
    L23:
        if (r07 == 0) goto L25;
        r05 = true;
        goto L26
    L22:
        r07 = r04.f2814h;
    L28:
        r2 = 8;
        goto L29
    L9:
        if (r11.f2820n.mo2007m() == false) goto L11;
        char r08 = r11.f2816j;
    L12:
        if (r08 == 0) goto L14;
        r03 = true;
        goto L15
    L11:
        r08 = r11.f2814h;
        goto L12
    L5:
        r02 = 8;
        goto L6
    }

    @Override // p055f.InterfaceC0786q
    public MenuItemC0780k getItemData() {
        return this.f1075a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1084j);
        TextView r02 = (TextView) findViewById(C1031R.id.title);
        this.f1078d = r02;
        int r2 = this.f1085k;
        if (r2 == (-1)) goto L5;
        r02.setTextAppearance(this.f1086l, r2);
    L5:
        this.f1080f = (TextView) findViewById(C1031R.id.shortcut);
        ImageView r03 = (ImageView) findViewById(C1031R.id.submenuarrow);
        this.f1081g = r03;
        if (r03 == null) goto L8;
        r03.setImageDrawable(this.f1088n);
    L8:
        this.f1082h = (ImageView) findViewById(C1031R.id.group_divider);
        this.f1083i = (LinearLayout) findViewById(C1031R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
        if (this.f1076b != null) goto L5;
    L11:
        super.onMeasure(r4, r5);
        return;
    L5:
        if (this.f1087m == false) goto L11;
        ViewGroup.LayoutParams r02 = getLayoutParams();
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) this.f1076b.getLayoutParams();
        int r03 = r02.height;
        if (r03 <= 0) goto L11;
        if (r1.width > 0) goto L11;
        r1.width = r03;
        goto L11
    }

    public void setCheckable(boolean r5) {
        if (r5 == true) goto L9;
        if (this.f1077c != null) goto L9;
        if (this.f1079e != null) goto L9;
        return;
    L9:
        if ((this.f1075a.f2830x & 4) == 0) goto L18;
        if (this.f1077c != null) goto L16;
        RadioButton r02 = (RadioButton) getInflater().inflate(C1031R.layout.abc_list_menu_item_radio, this, false);
        this.f1077c = r02;
        LinearLayout r3 = this.f1083i;
        if (r3 == null) goto L15;
        r3.addView(r02, -1);
        goto L16
    L15:
        addView(r02, -1);
    L16:
        CompoundButton r03 = this.f1077c;
        View r1 = this.f1079e;
    L25:
        if (r5 == false) goto L33;
        r03.setChecked(this.f1075a.isChecked());
        if (r03.getVisibility() == 0) goto L29;
        r03.setVisibility(0);
    L29:
        if (r1 != null) goto L31;
        return;
    L31:
        if (r1.getVisibility() == 8) goto L41;
        r1.setVisibility(8);
        return;
    L41:
        return;
    L33:
        CheckBox r52 = this.f1079e;
        if (r52 == null) goto L36;
        r52.setVisibility(8);
    L36:
        RadioButton r53 = this.f1077c;
        if (r53 == null) goto L43;
        r53.setVisibility(8);
        return;
    L43:
        return;
    L18:
        if (this.f1079e != null) goto L23;
        CheckBox r04 = (CheckBox) getInflater().inflate(C1031R.layout.abc_list_menu_item_checkbox, this, false);
        this.f1079e = r04;
        LinearLayout r32 = this.f1083i;
        if (r32 == null) goto L22;
        r32.addView(r04, -1);
        goto L23
    L22:
        addView(r04, -1);
    L23:
        r03 = this.f1079e;
        r1 = this.f1077c;
        goto L25
    }

    public void setChecked(boolean r5) {
        if ((this.f1075a.f2830x & 4) == 0) goto L12;
        if (this.f1077c != null) goto L10;
        RadioButton r02 = (RadioButton) getInflater().inflate(C1031R.layout.abc_list_menu_item_radio, this, false);
        this.f1077c = r02;
        LinearLayout r2 = this.f1083i;
        if (r2 == null) goto L9;
        r2.addView(r02, -1);
        goto L10
    L9:
        addView(r02, -1);
    L10:
        CompoundButton r03 = this.f1077c;
    L18:
        r03.setChecked(r5);
        return;
    L12:
        if (this.f1079e != null) goto L17;
        CheckBox r04 = (CheckBox) getInflater().inflate(C1031R.layout.abc_list_menu_item_checkbox, this, false);
        this.f1079e = r04;
        LinearLayout r22 = this.f1083i;
        if (r22 == null) goto L16;
        r22.addView(r04, -1);
        goto L17
    L16:
        addView(r04, -1);
    L17:
        r03 = this.f1079e;
        goto L18
    }

    public void setForceShowIcon(boolean r1) {
        this.f1091q = r1;
        this.f1087m = r1;
    }

    public void setGroupDividerEnabled(boolean r3) {
        ImageView r02 = this.f1082h;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f1089o == true) goto L8;
        if (r3 == false) goto L8;
        int r32 = 0;
    L9:
        r02.setVisibility(r32);
        return;
    L8:
        r32 = 8;
        goto L9
    }

    public void setIcon(Drawable r5) {
        this.f1075a.f2820n.getClass();
        boolean r02 = this.f1091q;
        if (r02 == false) goto L5;
    L7:
        ImageView r1 = this.f1076b;
        if (r1 != null) goto L14;
        if (r5 != null) goto L14;
        if (this.f1087m == true) goto L14;
        return;
    L14:
        if (r1 != null) goto L19;
        ImageView r12 = (ImageView) getInflater().inflate(C1031R.layout.abc_list_menu_item_icon, this, false);
        this.f1076b = r12;
        LinearLayout r3 = this.f1083i;
        if (r3 == null) goto L18;
        r3.addView(r12, 0);
        goto L19
    L18:
        addView(r12, 0);
    L19:
        if (r5 == null) goto L21;
    L24:
        ImageView r13 = this.f1076b;
        if (r02 == true) goto L28;
        r5 = null;
    L28:
        r13.setImageDrawable(r5);
        if (this.f1076b.getVisibility() == 0) goto L33;
        this.f1076b.setVisibility(0);
        return;
    L33:
        return;
    L21:
        if (this.f1087m == true) goto L24;
        this.f1076b.setVisibility(8);
        return;
    L5:
        if (this.f1087m == true) goto L7;
    }

    public void setTitle(CharSequence r2) {
        if (r2 == null) goto L7;
        this.f1078d.setText(r2);
        if (this.f1078d.getVisibility() == 0) goto L10;
        this.f1078d.setVisibility(0);
        return;
    L10:
        return;
    L7:
        if (this.f1078d.getVisibility() == 8) goto L12;
        this.f1078d.setVisibility(8);
        return;
    }
}
