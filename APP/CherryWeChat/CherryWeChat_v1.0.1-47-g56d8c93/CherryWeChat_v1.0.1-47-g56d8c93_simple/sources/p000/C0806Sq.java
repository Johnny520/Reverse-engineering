package p000;

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
import io.github.cherrywechat.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Sq */
/* JADX INFO: loaded from: classes.dex */
public class C0806Sq<S> extends DialogInterfaceOnCancelListenerC0450Kd {

    /* JADX INFO: renamed from: A0 */
    public C1021Xq f2528A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f2529B0;

    /* JADX INFO: renamed from: C0 */
    public CharSequence f2530C0;

    /* JADX INFO: renamed from: D0 */
    public CharSequence f2531D0;

    /* JADX INFO: renamed from: g0 */
    public final LinkedHashSet f2532g0;

    /* JADX INFO: renamed from: h0 */
    public final LinkedHashSet f2533h0;

    /* JADX INFO: renamed from: i0 */
    public int f2534i0;

    /* JADX INFO: renamed from: j0 */
    public AbstractC0595Nt f2535j0;

    /* JADX INFO: renamed from: k0 */
    public C0136D6 f2536k0;

    /* JADX INFO: renamed from: l0 */
    public C0549Mq f2537l0;

    /* JADX INFO: renamed from: m0 */
    public int f2538m0;

    /* JADX INFO: renamed from: n0 */
    public CharSequence f2539n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f2540o0;

    /* JADX INFO: renamed from: p0 */
    public int f2541p0;

    /* JADX INFO: renamed from: q0 */
    public int f2542q0;

    /* JADX INFO: renamed from: r0 */
    public CharSequence f2543r0;

    /* JADX INFO: renamed from: s0 */
    public int f2544s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence f2545t0;

    /* JADX INFO: renamed from: u0 */
    public int f2546u0;

    /* JADX INFO: renamed from: v0 */
    public CharSequence f2547v0;

    /* JADX INFO: renamed from: w0 */
    public int f2548w0;

    /* JADX INFO: renamed from: x0 */
    public CharSequence f2549x0;

    /* JADX INFO: renamed from: y0 */
    public TextView f2550y0;

    /* JADX INFO: renamed from: z0 */
    public CheckableImageButton f2551z0;

    public C0806Sq() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2532g0 = new LinkedHashSet();
        this.f2533h0 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: E */
    public static int m1611E(Context r6) {
        Resources r62 = r6.getResources();
        int r0 = r62.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar r1 = AbstractC2407qD.m4844b();
        r1.set(5, 1);
        Calendar r12 = AbstractC2407qD.m4843a(r1);
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

    /* JADX INFO: renamed from: F */
    public static boolean m1612F(Context r2, int r3) {
        TypedArray r22 = r2.obtainStyledAttributes(AbstractC1293cr.m2539R(r2, R.attr.materialCalendarStyle, C0549Mq.class.getCanonicalName()).data, new int[]{r3});
        boolean r32 = r22.getBoolean(0, false);
        r22.recycle();
        return r32;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd
    /* JADX INFO: renamed from: C */
    public final Dialog mo896C() {
        Context r1 = m2878y();
        m2878y();
        int r2 = this.f2534i0;
        if (r2 == 0) goto L6;
        Dialog r0 = new Dialog(r1, r2);
        Context r12 = r0.getContext();
        this.f2540o0 = m1612F(r12, android.R.attr.windowFullscreen);
        this.f2528A0 = new C1021Xq(r12, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray r22 = r12.obtainStyledAttributes(null, AbstractC0939Vu.f2944m, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int r3 = r22.getColor(1, 0);
        r22.recycle();
        this.f2528A0.m1925k(r12);
        this.f2528A0.m1928n(ColorStateList.valueOf(r3));
        this.f2528A0.m1927m(r0.getWindow().getDecorView().getElevation());
        return r0;
    L6:
        m1613D();
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public final void m1613D() {
        if (this.f5315f.getParcelable("DATE_SELECTOR_KEY") != null) goto L6;
        return;
    L6:
        throw new ClassCastException();
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public final void mo900n(Bundle r4) {
        super.mo900n(r4);
        if (r4 != null) goto L5;
        r4 = this.f5315f;
    L5:
        this.f2534i0 = r4.getInt("OVERRIDE_THEME_RES_ID");
        if (r4.getParcelable("DATE_SELECTOR_KEY") != null) goto L24;
        this.f2536k0 = (C0136D6) r4.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (r4.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) goto L22;
        this.f2538m0 = r4.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2539n0 = r4.getCharSequence("TITLE_TEXT_KEY");
        this.f2541p0 = r4.getInt("INPUT_MODE_KEY");
        this.f2542q0 = r4.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2543r0 = r4.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2544s0 = r4.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2545t0 = r4.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2546u0 = r4.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2547v0 = r4.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2548w0 = r4.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2549x0 = r4.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence r42 = this.f2539n0;
        if (r42 != null) goto L13;
        r42 = m2878y().getResources().getText(this.f2538m0);
    L13:
        this.f2530C0 = r42;
        if (r42 == null) goto L18;
        CharSequence[] r0 = TextUtils.split(String.valueOf(r42), "\n");
        if (r0.length <= 1) goto L19;
        r42 = r0[0];
    L19:
        this.f2531D0 = r42;
        return;
    L18:
        r42 = null;
        goto L19
    L22:
        throw new ClassCastException();
    L24:
        throw new ClassCastException();
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: o */
    public final View mo1043o(LayoutInflater r7, ViewGroup r8) {
        if (this.f2540o0 == false) goto L5;
        int r0 = R.layout.mtrl_picker_fullscreen;
    L6:
        View r72 = r7.inflate(r0, r8);
        Context r82 = r72.getContext();
        if (this.f2540o0 == false) goto L9;
        r72.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1611E(r82), -2));
    L10:
        ((TextView) r72.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f2551z0 = (CheckableImageButton) r72.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2550y0 = (TextView) r72.findViewById(R.id.mtrl_picker_title_text);
        this.f2551z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton r02 = this.f2551z0;
        StateListDrawable r2 = new StateListDrawable();
        r2.addState(new int[]{android.R.attr.state_checked}, AbstractC1406fG.m2695U(r82, R.drawable.material_ic_calendar_black_24dp));
        boolean r3 = false;
        r2.addState(new int[0], AbstractC1406fG.m2695U(r82, R.drawable.material_ic_edit_black_24dp));
        r02.setImageDrawable(r2);
        CheckableImageButton r83 = this.f2551z0;
        if (this.f2541p0 == 0) goto L13;
        r3 = true;
    L13:
        r83.setChecked(r3);
        AbstractC2185lE.m4399l(this.f2551z0, null);
        CheckableImageButton r84 = this.f2551z0;
        if (this.f2541p0 != 1) goto L16;
        String r85 = r84.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
    L17:
        this.f2551z0.setContentDescription(r85);
        this.f2551z0.setOnClickListener(new ViewOnClickListenerC1477h(7, this));
        Button r73 = (Button) r72.findViewById(R.id.confirm_button);
        m1613D();
        throw null;
    L16:
        r85 = r84.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        goto L17
    L9:
        r72.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1611E(r82), -1));
        goto L10
    L5:
        r0 = R.layout.mtrl_picker_dialog;
        goto L6
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r3) {
        Iterator r0 = this.f2532g0.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((DialogInterface.OnCancelListener) r0.next()).onCancel(r3);
        goto L4
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        Iterator r0 = this.f2533h0.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((DialogInterface.OnDismissListener) r0.next()).onDismiss(r3);
        goto L4
    L6:
        ViewGroup r02 = (ViewGroup) this.f5296E;
        if (r02 == null) goto L9;
        r02.removeAllViews();
    L9:
        super.onDismiss(r3);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public final void mo904t(Bundle r15) {
        super.mo904t(r15);
        r15.putInt("OVERRIDE_THEME_RES_ID", this.f2534i0);
        r15.putParcelable("DATE_SELECTOR_KEY", null);
        C0136D6 r2 = this.f2536k0;
        C0093C6 r0 = new C0093C6();
        int r3 = C0093C6.f208b;
        int r32 = C0093C6.f208b;
        long r33 = r2.f349a.f5212f;
        long r5 = r2.f350b.f5212f;
        r0.f209a = Long.valueOf(r2.f352d.f5212f);
        int r13 = r2.f353e;
        C0019Ac r22 = r2.f351c;
        C0549Mq r7 = this.f2537l0;
        if (r7 != null) goto L5;
        C1469gs r72 = null;
    L6:
        if (r72 == null) goto L8;
        r0.f209a = Long.valueOf(r72.f5212f);
    L8:
        Bundle r73 = new Bundle();
        r73.putParcelable("DEEP_COPY_VALIDATOR_KEY", r22);
        C1469gs r9 = C1469gs.m2821b(r33);
        C1469gs r10 = C1469gs.m2821b(r5);
        C0019Ac r11 = (C0019Ac) r73.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long r02 = r0.f209a;
        if (r02 != null) goto L11;
        C1469gs r12 = null;
    L12:
        r15.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0136D6(r9, r10, r11, r12, r13));
        r15.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r15.putInt("TITLE_TEXT_RES_ID_KEY", this.f2538m0);
        r15.putCharSequence("TITLE_TEXT_KEY", this.f2539n0);
        r15.putInt("INPUT_MODE_KEY", this.f2541p0);
        r15.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2542q0);
        r15.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2543r0);
        r15.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2544s0);
        r15.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2545t0);
        r15.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2546u0);
        r15.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2547v0);
        r15.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2548w0);
        r15.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2549x0);
        return;
    L11:
        r12 = C1469gs.m2821b(r02.longValue());
        goto L12
    L5:
        r72 = r7.f1776W;
        goto L6
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: u */
    public final void mo905u() {
        super.mo905u();
        Dialog r0 = this.f1479c0;
        if (r0 == null) goto L66;
        Window r02 = r0.getWindow();
        if (this.f2540o0 == false) goto L45;
        r02.setLayout(-1, -1);
        r02.setBackgroundDrawable(this.f2528A0);
        if (this.f2529B0 == true) goto L48;
        View r7 = m2879z().findViewById(R.id.fullscreen_header);
        ColorStateList r1 = AbstractC0585Nj.m1158z(r7.getBackground());
        if (r1 == null) goto L11;
        Integer r12 = Integer.valueOf(r1.getDefaultColor());
    L12:
        boolean r2 = false;
        if (r12 != null) goto L15;
    L18:
        boolean r3 = true;
    L19:
        int r6 = AbstractC0295Gu.m620m(r02.getContext(), android.R.attr.colorBackground, -16777216);
        if (r3 == false) goto L22;
        r12 = Integer.valueOf(r6);
    L22:
        AbstractC0671Pj.m1359y(r02, false);
        r02.getContext();
        r02.getContext();
        r02.setStatusBarColor(0);
        r02.setNavigationBarColor(0);
        boolean r13 = AbstractC0295Gu.m627t(r12.intValue());
        if (AbstractC0295Gu.m627t(0) == true) goto L27;
        if (r13 == true) goto L27;
        boolean r14 = false;
    L28:
        C1517hw r8 = new C1517hw(r02.getDecorView(), 8);
        int r32 = Build.VERSION.SDK_INT;
        if (r32 < 35) goto L31;
        AbstractC1293cr r33 = new C0618OF(r02, r8);
    L34:
        r33.mo1028T(r14);
        boolean r15 = AbstractC0295Gu.m627t(r6);
        if (AbstractC0295Gu.m627t(0) == true) goto L37;
        if (r15 == true) goto L37;
    L38:
        C1517hw r34 = new C1517hw(r02.getDecorView(), 8);
        int r16 = Build.VERSION.SDK_INT;
        if (r16 < 35) goto L41;
        AbstractC1293cr r17 = new C0618OF(r02, r34);
    L44:
        r17.mo1027S(r2);
        int r10 = r7.getPaddingTop();
        C0763Rq r62 = new C0763Rq(r7, r7.getLayoutParams().height, r7.getPaddingLeft(), r10, r7.getPaddingRight());
        WeakHashMap r03 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2640l(r7, r62);
        this.f2529B0 = true;
        goto L48
    L41:
        if (r16 < 30) goto L43;
        r17 = new C0575NF(r02, r34);
        goto L44
    L43:
        r17 = new C0532MF(r02, r34);
    L37:
        r2 = true;
        goto L38
    L31:
        if (r32 < 30) goto L33;
        r33 = new C0575NF(r02, r8);
        goto L34
    L33:
        r33 = new C0532MF(r02, r8);
    L27:
        r14 = true;
        goto L28
    L15:
        if (r12.intValue() == 0) goto L18;
        r3 = false;
        goto L19
    L11:
        r12 = null;
    L48:
        m2878y();
        int r04 = this.f2534i0;
        if (r04 == 0) goto L61;
        m1613D();
        C0136D6 r18 = this.f2536k0;
        C0549Mq r22 = new C0549Mq();
        Bundle r35 = new Bundle();
        r35.putInt("THEME_RES_ID_KEY", r04);
        r35.putParcelable("GRID_SELECTOR_KEY", null);
        r35.putParcelable("CALENDAR_CONSTRAINTS_KEY", r18);
        r35.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r35.putParcelable("CURRENT_MONTH_KEY", r18.f352d);
        r22.m2867B(r35);
        this.f2537l0 = r22;
        AbstractC0595Nt r23 = r22;
        if (this.f2541p0 != 1) goto L53;
        m1613D();
        C0136D6 r19 = this.f2536k0;
        C1064Yq r24 = new C1064Yq();
        Bundle r36 = new Bundle();
        r36.putInt("THEME_RES_ID_KEY", r04);
        r36.putParcelable("DATE_SELECTOR_KEY", null);
        r36.putParcelable("CALENDAR_CONSTRAINTS_KEY", r19);
        r24.m2867B(r36);
        r23 = r24;
    L53:
        this.f2535j0 = r23;
        TextView r05 = this.f2550y0;
        if (this.f2541p0 == 1) goto L56;
    L58:
        CharSequence r110 = this.f2530C0;
    L59:
        r05.setText(r110);
        m1613D();
        throw null;
    L56:
        if (m2878y().getResources().getConfiguration().orientation != 2) goto L58;
        r110 = this.f2531D0;
        goto L59
    L61:
        m1613D();
        throw null;
    L45:
        r02.setLayout(-2, -2);
        int r9 = m2878y().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
        Rect r37 = new Rect(r9, r9, r9, r9);
        r02.setBackgroundDrawable(new InsetDrawable(this.f2528A0, r9, r9, r9, r9));
        View r06 = r02.getDecorView();
        Dialog r72 = this.f1479c0;
        if (r72 == null) goto L64;
        r06.setOnTouchListener(new ViewOnTouchListenerC2722xl(r72, r37));
        goto L48
    L64:
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    L66:
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: v */
    public final void mo906v() {
        this.f2535j0.f1926T.clear();
        super.mo906v();
    }
}
