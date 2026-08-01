package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.ljx.wechatmod.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bu<S> extends rg {
    public CharSequence A0;
    public CharSequence B0;
    public final LinkedHashSet e0;
    public final LinkedHashSet f0;
    public int g0;
    public px h0;
    public c8 i0;
    public ut j0;
    public int k0;
    public CharSequence l0;
    public boolean m0;
    public int n0;
    public int o0;
    public CharSequence p0;
    public int q0;
    public CharSequence r0;
    public int s0;
    public CharSequence t0;
    public int u0;
    public CharSequence v0;
    public TextView w0;
    public CheckableImageButton x0;
    public eu y0;
    public boolean z0;

    public bu() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.e0 = new LinkedHashSet();
        this.f0 = new LinkedHashSet();
    }

    public static int F(Context r6) {
        Resources r62 = r6.getResources();
        int r0 = r62.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar r1 = u80.b();
        r1.set(5, 1);
        Calendar r12 = u80.a(r1);
        r12.get(2);
        r12.get(1);
        int r5 = r12.getMaximum(7);
        r12.getActualMaximum(5);
        r12.getTimeInMillis();
        int r13 = r62.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int r14 = r13 * r5;
        int r52 = r5 - 1;
        int r53 = r52 * r62.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        return r53 + (r14 + (r0 * 2));
    }

    public static boolean G(Context r2, int r3) {
        TypedArray r22 = r2.obtainStyledAttributes(gt.A(r2, R.attr.materialCalendarStyle, ut.class.getCanonicalName()).data, new int[]{r3});
        boolean r32 = r22.getBoolean(0, false);
        r22.recycle();
        return r32;
    }

    @Override // defpackage.rg
    public final Dialog D() {
        Context r1 = z();
        z();
        int r2 = this.g0;
        if (r2 == 0) goto L6;
        Dialog r0 = new Dialog(r1, r2);
        Context r12 = r0.getContext();
        this.m0 = G(r12, android.R.attr.windowFullscreen);
        this.y0 = new eu(r12, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray r22 = r12.obtainStyledAttributes(null, wy.l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int r3 = r22.getColor(1, 0);
        r22.recycle();
        this.y0.h(r12);
        this.y0.j(ColorStateList.valueOf(r3));
        eu r13 = this.y0;
        View r23 = r0.getWindow().getDecorView();
        WeakHashMap r32 = ja0.a;
        r13.i(y90.i(r23));
        return r0;
    L6:
        E();
        throw null;
    }

    public final void E() {
        if (this.f.getParcelable("DATE_SELECTOR_KEY") != null) goto L6;
        return;
    L6:
        throw new ClassCastException();
    }

    @Override // defpackage.rg, defpackage.ml
    public final void m(Bundle r4) {
        super.m(r4);
        if (r4 != null) goto L5;
        r4 = this.f;
    L5:
        this.g0 = r4.getInt("OVERRIDE_THEME_RES_ID");
        if (r4.getParcelable("DATE_SELECTOR_KEY") != null) goto L24;
        this.i0 = (c8) r4.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (r4.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) goto L22;
        this.k0 = r4.getInt("TITLE_TEXT_RES_ID_KEY");
        this.l0 = r4.getCharSequence("TITLE_TEXT_KEY");
        this.n0 = r4.getInt("INPUT_MODE_KEY");
        this.o0 = r4.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.p0 = r4.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.q0 = r4.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.r0 = r4.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.s0 = r4.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.t0 = r4.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.u0 = r4.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.v0 = r4.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence r42 = this.l0;
        if (r42 != null) goto L13;
        r42 = z().getResources().getText(this.k0);
    L13:
        this.A0 = r42;
        if (r42 == null) goto L18;
        CharSequence[] r0 = TextUtils.split(String.valueOf(r42), "\n");
        if (r0.length <= 1) goto L19;
        r42 = r0[0];
    L19:
        this.B0 = r42;
        return;
    L18:
        r42 = null;
        goto L19
    L22:
        throw new ClassCastException();
    L24:
        throw new ClassCastException();
    }

    @Override // defpackage.ml
    public final View n(LayoutInflater r7, ViewGroup r8) {
        if (this.m0 == false) goto L5;
        int r0 = R.layout.mtrl_picker_fullscreen;
    L6:
        View r72 = r7.inflate(r0, r8);
        Context r82 = r72.getContext();
        if (this.m0 == false) goto L9;
        r72.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(F(r82), -2));
    L10:
        TextView r02 = (TextView) r72.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap r1 = ja0.a;
        v90.f(r02, 1);
        this.x0 = (CheckableImageButton) r72.findViewById(R.id.mtrl_picker_header_toggle);
        this.w0 = (TextView) r72.findViewById(R.id.mtrl_picker_title_text);
        this.x0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton r03 = this.x0;
        StateListDrawable r2 = new StateListDrawable();
        r2.addState(new int[]{android.R.attr.state_checked}, ff.r(r82, R.drawable.material_ic_calendar_black_24dp));
        boolean r3 = false;
        r2.addState(new int[0], ff.r(r82, R.drawable.material_ic_edit_black_24dp));
        r03.setImageDrawable(r2);
        CheckableImageButton r83 = this.x0;
        if (this.n0 == 0) goto L13;
        r3 = true;
    L13:
        r83.setChecked(r3);
        ja0.l(this.x0, null);
        CheckableImageButton r84 = this.x0;
        if (this.n0 != 1) goto L16;
        String r85 = r84.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
    L17:
        this.x0.setContentDescription(r85);
        this.x0.setOnClickListener(new qa(5, this));
        Button r73 = (Button) r72.findViewById(R.id.confirm_button);
        E();
        throw null;
    L16:
        r85 = r84.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        goto L17
    L9:
        r72.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(F(r82), -1));
        goto L10
    L5:
        r0 = R.layout.mtrl_picker_dialog;
        goto L6
    }

    @Override // defpackage.rg, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r3) {
        Iterator r0 = this.e0.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((DialogInterface.OnCancelListener) r0.next()).onCancel(r3);
        goto L4
    }

    @Override // defpackage.rg, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        Iterator r0 = this.f0.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((DialogInterface.OnDismissListener) r0.next()).onDismiss(r3);
        goto L4
    L6:
        ViewGroup r02 = (ViewGroup) this.E;
        if (r02 == null) goto L9;
        r02.removeAllViews();
    L9:
        super.onDismiss(r3);
    }

    @Override // defpackage.rg, defpackage.ml
    public final void r(Bundle r15) {
        super.r(r15);
        r15.putInt("OVERRIDE_THEME_RES_ID", this.g0);
        r15.putParcelable("DATE_SELECTOR_KEY", null);
        c8 r2 = this.i0;
        b8 r0 = new b8();
        int r3 = b8.b;
        int r32 = b8.b;
        long r33 = r2.a.f;
        long r5 = r2.b.f;
        r0.a = Long.valueOf(r2.d.f);
        int r13 = r2.e;
        cf r22 = r2.c;
        ut r7 = this.j0;
        if (r7 != null) goto L5;
        zv r72 = null;
    L6:
        if (r72 == null) goto L8;
        r0.a = Long.valueOf(r72.f);
    L8:
        Bundle r73 = new Bundle();
        r73.putParcelable("DEEP_COPY_VALIDATOR_KEY", r22);
        zv r9 = zv.b(r33);
        zv r10 = zv.b(r5);
        cf r11 = (cf) r73.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long r02 = r0.a;
        if (r02 != null) goto L11;
        zv r12 = null;
    L12:
        r15.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c8(r9, r10, r11, r12, r13));
        r15.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r15.putInt("TITLE_TEXT_RES_ID_KEY", this.k0);
        r15.putCharSequence("TITLE_TEXT_KEY", this.l0);
        r15.putInt("INPUT_MODE_KEY", this.n0);
        r15.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.o0);
        r15.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.p0);
        r15.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.q0);
        r15.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.r0);
        r15.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.s0);
        r15.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.t0);
        r15.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.u0);
        r15.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.v0);
        return;
    L11:
        r12 = zv.b(r02.longValue());
        goto L12
    L5:
        r72 = r7.U;
        goto L6
    }

    @Override // defpackage.rg, defpackage.ml
    public final void s() {
        super.s();
        Dialog r0 = this.a0;
        if (r0 == null) goto L71;
        Window r02 = r0.getWindow();
        if (this.m0 == false) goto L50;
        r02.setLayout(-1, -1);
        r02.setBackgroundDrawable(this.y0);
        if (this.z0 == true) goto L53;
        View r1 = A().findViewById(R.id.fullscreen_header);
        ColorStateList r2 = ff.o(r1.getBackground());
        if (r2 == null) goto L11;
        Integer r22 = Integer.valueOf(r2.getDefaultColor());
    L12:
        int r3 = Build.VERSION.SDK_INT;
        boolean r6 = false;
        if (r22 != null) goto L15;
    L18:
        boolean r7 = true;
    L19:
        int r8 = zt.j(r02.getContext(), android.R.attr.colorBackground, -16777216);
        if (r7 == false) goto L23;
        r22 = Integer.valueOf(r8);
    L23:
        if (r3 < 30) goto L25;
        vb0.a(r02, false);
    L26:
        r02.getContext();
        Context r9 = r02.getContext();
        if (r3 >= 27) goto L29;
        int r32 = ib.d(zt.j(r9, android.R.attr.navigationBarColor, -16777216), 128);
    L30:
        r02.setStatusBarColor(0);
        r02.setNavigationBarColor(r32);
        boolean r23 = zt.z(r22.intValue());
        if (zt.z(0) == true) goto L35;
        if (r23 == true) goto L35;
        boolean r24 = false;
    L36:
        View r92 = r02.getDecorView();
        if (Build.VERSION.SDK_INT < 30) goto L39;
        yc0 r93 = new yc0(uc0.b(r02));
        r93.b = r02;
        gt r94 = r93;
    L40:
        r94.C(r24);
        boolean r25 = zt.z(r8);
        if (zt.z(r32) == true) goto L44;
        if (r32 != 0) goto L45;
        if (r25 == true) goto L44;
    L45:
        View r26 = r02.getDecorView();
        if (Build.VERSION.SDK_INT < 30) goto L48;
        yc0 r27 = new yc0(uc0.b(r02));
        r27.b = r02;
        gt r28 = r27;
    L49:
        r28.B(r6);
        au r33 = new au(r1, r1.getLayoutParams().height, r1.getPaddingTop());
        WeakHashMap r03 = ja0.a;
        y90.u(r1, r33);
        this.z0 = true;
        goto L53
    L48:
        r28 = new xc0(r02, r26);
    L44:
        r6 = true;
        goto L45
    L39:
        r94 = new xc0(r02, r92);
    L35:
        r24 = true;
        goto L36
    L29:
        r32 = 0;
        goto L30
    L25:
        ub0.a(r02, false);
        goto L26
    L15:
        if (r22.intValue() == 0) goto L18;
        r7 = false;
        goto L19
    L11:
        r22 = null;
    L53:
        z();
        int r04 = this.g0;
        if (r04 == 0) goto L66;
        E();
        c8 r12 = this.i0;
        ut r29 = new ut();
        Bundle r34 = new Bundle();
        r34.putInt("THEME_RES_ID_KEY", r04);
        r34.putParcelable("GRID_SELECTOR_KEY", null);
        r34.putParcelable("CALENDAR_CONSTRAINTS_KEY", r12);
        r34.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r34.putParcelable("CURRENT_MONTH_KEY", r12.d);
        r29.C(r34);
        this.j0 = r29;
        px r210 = r29;
        if (this.n0 != 1) goto L58;
        E();
        c8 r13 = this.i0;
        fu r211 = new fu();
        Bundle r35 = new Bundle();
        r35.putInt("THEME_RES_ID_KEY", r04);
        r35.putParcelable("DATE_SELECTOR_KEY", null);
        r35.putParcelable("CALENDAR_CONSTRAINTS_KEY", r13);
        r211.C(r35);
        r210 = r211;
    L58:
        this.h0 = r210;
        TextView r05 = this.w0;
        if (this.n0 == 1) goto L61;
    L63:
        CharSequence r14 = this.A0;
    L64:
        r05.setText(r14);
        E();
        throw null;
    L61:
        if (z().getResources().getConfiguration().orientation != 2) goto L63;
        r14 = this.B0;
        goto L64
    L66:
        E();
        throw null;
    L50:
        r02.setLayout(-2, -2);
        int r95 = z().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
        Rect r36 = new Rect(r95, r95, r95, r95);
        r02.setBackgroundDrawable(new InsetDrawable(this.y0, r95, r95, r95, r95));
        View r06 = r02.getDecorView();
        Dialog r72 = this.a0;
        if (r72 == null) goto L69;
        r06.setOnTouchListener(new cp(r72, r36));
        goto L53
    L69:
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    L71:
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // defpackage.rg, defpackage.ml
    public final void t() {
        this.h0.R.clear();
        super.t();
    }
}
