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

    public ListMenuItemView(Context r5, AttributeSet r6) {
        super(r5, r6);
        C2656w4 r62 = C2656w4.m5186A(getContext(), r6, AbstractC0982Wu.f3083r, R.attr.listMenuViewStyle);
        this.f3708j = r62.m5210q(5);
        TypedArray r0 = (TypedArray) r62.f9196b;
        this.f3709k = r0.getResourceId(1, -1);
        this.f3711m = r0.getBoolean(7, false);
        this.f3710l = r5;
        this.f3712n = r62.m5210q(8);
        TypedArray r52 = r5.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3713o = r52.hasValue(0);
        r62.m5195E();
        r52.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3714p != null) goto L6;
        this.f3714p = LayoutInflater.from(getContext());
    L6:
        return this.f3714p;
    }

    private void setSubMenuArrowVisible(boolean r2) {
        ImageView r0 = this.f3705g;
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
        ImageView r0 = this.f3706h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getVisibility() != 0) goto L9;
        LinearLayout.LayoutParams r02 = (LinearLayout.LayoutParams) this.f3706h.getLayoutParams();
        int r1 = r5.top;
        r5.top = ((this.f3706h.getHeight() + r02.topMargin) + r02.bottomMargin) + r1;
        return;
    }

    @Override // p000.InterfaceC0249Fr
    /* JADX INFO: renamed from: c */
    public final void mo521c(C2427qr r11) {
        this.f3699a = r11;
        boolean r0 = r11.isVisible();
        MenuC2204lr r1 = r11.f8505n;
        int r3 = 0;
        if (r0 == false) goto L5;
        int r02 = 0;
    L6:
        setVisibility(r02);
        setTitle(r11.f8496e);
        setCheckable(r11.isCheckable());
        if (r1.mo433o() == true) goto L9;
    L14:
        boolean r03 = false;
    L15:
        r1.mo432n();
        if (r03 == false) goto L28;
        C2427qr r04 = this.f3699a;
        MenuC2204lr r12 = r04.f8505n;
        if (r12.mo433o() == true) goto L20;
    L25:
        boolean r05 = false;
    L26:
        if (r05 == false) goto L28;
    L29:
        if (r3 != 0) goto L56;
        TextView r06 = this.f3704f;
        C2427qr r13 = this.f3699a;
        MenuC2204lr r5 = r13.f8505n;
        Context r6 = r5.f7660a;
        if (r5.mo432n() == false) goto L33;
        char r7 = r13.f8501j;
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
        if (r5.mo432n() == false) goto L42;
        int r15 = r13.f8502k;
    L43:
        C2427qr.m4858c(r15, 65536, r8.getString(R.string.abc_menu_meta_shortcut_label), r9);
        C2427qr.m4858c(r15, 4096, r8.getString(R.string.abc_menu_ctrl_shortcut_label), r9);
        C2427qr.m4858c(r15, 2, r8.getString(R.string.abc_menu_alt_shortcut_label), r9);
        C2427qr.m4858c(r15, 1, r8.getString(R.string.abc_menu_shift_shortcut_label), r9);
        C2427qr.m4858c(r15, 4, r8.getString(R.string.abc_menu_sym_shortcut_label), r9);
        C2427qr.m4858c(r15, 8, r8.getString(R.string.abc_menu_function_shortcut_label), r9);
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
        r15 = r13.f8500i;
        goto L43
    L33:
        r7 = r13.f8499h;
    L56:
        if (this.f3704f.getVisibility() == r3) goto L58;
        this.f3704f.setVisibility(r3);
    L58:
        setIcon(r11.getIcon());
        setEnabled(r11.isEnabled());
        setSubMenuArrowVisible(r11.hasSubMenu());
        setContentDescription(r11.f8508q);
        return;
    L20:
        if (r12.mo432n() == false) goto L22;
        char r07 = r04.f8501j;
    L23:
        if (r07 == 0) goto L25;
        r05 = true;
        goto L26
    L22:
        r07 = r04.f8499h;
    L28:
        r3 = 8;
        goto L29
    L9:
        if (r1.mo432n() == false) goto L11;
        char r08 = r11.f8501j;
    L12:
        if (r08 == 0) goto L14;
        r03 = true;
        goto L15
    L11:
        r08 = r11.f8499h;
        goto L12
    L5:
        r02 = 8;
        goto L6
    }

    @Override // p000.InterfaceC0249Fr
    public C2427qr getItemData() {
        return this.f3699a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f3708j);
        TextView r0 = (TextView) findViewById(R.id.title);
        this.f3702d = r0;
        int r2 = this.f3709k;
        if (r2 == (-1)) goto L5;
        r0.setTextAppearance(this.f3710l, r2);
    L5:
        this.f3704f = (TextView) findViewById(R.id.shortcut);
        ImageView r02 = (ImageView) findViewById(R.id.submenuarrow);
        this.f3705g = r02;
        if (r02 == null) goto L8;
        r02.setImageDrawable(this.f3712n);
    L8:
        this.f3706h = (ImageView) findViewById(R.id.group_divider);
        this.f3707i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
        if (this.f3700b != null) goto L5;
    L11:
        super.onMeasure(r4, r5);
        return;
    L5:
        if (this.f3711m == false) goto L11;
        ViewGroup.LayoutParams r0 = getLayoutParams();
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) this.f3700b.getLayoutParams();
        int r02 = r0.height;
        if (r02 <= 0) goto L11;
        if (r1.width > 0) goto L11;
        r1.width = r02;
        goto L11
    }

    public void setCheckable(boolean r5) {
        if (r5 == true) goto L9;
        if (this.f3701c != null) goto L9;
        if (this.f3703e != null) goto L9;
        return;
    L9:
        if ((this.f3699a.f8515x & 4) == 0) goto L18;
        if (this.f3701c != null) goto L16;
        RadioButton r0 = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f3701c = r0;
        LinearLayout r3 = this.f3707i;
        if (r3 == null) goto L15;
        r3.addView(r0, -1);
        goto L16
    L15:
        addView(r0, -1);
    L16:
        CompoundButton r02 = this.f3701c;
        View r1 = this.f3703e;
    L25:
        if (r5 == false) goto L34;
        r02.setChecked(this.f3699a.isChecked());
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
        CheckBox r52 = this.f3703e;
        if (r52 == null) goto L37;
        r52.setVisibility(8);
    L37:
        RadioButton r53 = this.f3701c;
        if (r53 == null) goto L43;
        r53.setVisibility(8);
        return;
    L43:
        return;
    L18:
        if (this.f3703e != null) goto L23;
        CheckBox r03 = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f3703e = r03;
        LinearLayout r32 = this.f3707i;
        if (r32 == null) goto L22;
        r32.addView(r03, -1);
        goto L23
    L22:
        addView(r03, -1);
    L23:
        r02 = this.f3703e;
        r1 = this.f3701c;
        goto L25
    }

    public void setChecked(boolean r5) {
        if ((this.f3699a.f8515x & 4) == 0) goto L12;
        if (this.f3701c != null) goto L10;
        RadioButton r0 = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f3701c = r0;
        LinearLayout r2 = this.f3707i;
        if (r2 == null) goto L9;
        r2.addView(r0, -1);
        goto L10
    L9:
        addView(r0, -1);
    L10:
        CompoundButton r02 = this.f3701c;
    L18:
        r02.setChecked(r5);
        return;
    L12:
        if (this.f3703e != null) goto L17;
        CheckBox r03 = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f3703e = r03;
        LinearLayout r22 = this.f3707i;
        if (r22 == null) goto L16;
        r22.addView(r03, -1);
        goto L17
    L16:
        addView(r03, -1);
    L17:
        r02 = this.f3703e;
        goto L18
    }

    public void setForceShowIcon(boolean r1) {
        this.f3715q = r1;
        this.f3711m = r1;
    }

    public void setGroupDividerEnabled(boolean r3) {
        ImageView r0 = this.f3706h;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f3713o == true) goto L8;
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
        MenuC2204lr r0 = this.f3699a.f8505n;
        boolean r02 = this.f3715q;
        if (r02 == false) goto L5;
    L7:
        ImageView r1 = this.f3700b;
        if (r1 != null) goto L14;
        if (r5 != null) goto L14;
        if (this.f3711m == true) goto L14;
        return;
    L14:
        if (r1 != null) goto L19;
        ImageView r12 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
        this.f3700b = r12;
        LinearLayout r3 = this.f3707i;
        if (r3 == null) goto L18;
        r3.addView(r12, 0);
        goto L19
    L18:
        addView(r12, 0);
    L19:
        if (r5 == null) goto L21;
    L25:
        ImageView r13 = this.f3700b;
        if (r02 == true) goto L29;
        r5 = null;
    L29:
        r13.setImageDrawable(r5);
        if (this.f3700b.getVisibility() == 0) goto L33;
        this.f3700b.setVisibility(0);
        return;
    L33:
        return;
    L21:
        if (this.f3711m == true) goto L25;
        this.f3700b.setVisibility(8);
        return;
    L5:
        if (this.f3711m == true) goto L7;
    }

    public void setTitle(CharSequence r2) {
        if (r2 == null) goto L8;
        this.f3702d.setText(r2);
        if (this.f3702d.getVisibility() == 0) goto L11;
        this.f3702d.setVisibility(0);
        return;
    L11:
        return;
    L8:
        if (this.f3702d.getVisibility() == 8) goto L12;
        this.f3702d.setVisibility(8);
        return;
    }
}
