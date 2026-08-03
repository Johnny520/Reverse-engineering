package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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
    public static int m1611E(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM4844b = AbstractC2407qD.m4844b();
        calendarM4844b.set(5, 1);
        Calendar calendarM4843a = AbstractC2407qD.m4843a(calendarM4844b);
        calendarM4843a.get(2);
        calendarM4843a.get(1);
        int maximum = calendarM4843a.getMaximum(7);
        calendarM4843a.getActualMaximum(5);
        calendarM4843a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1612F(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1293cr.m2539R(context, R.attr.materialCalendarStyle, C0549Mq.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd
    /* JADX INFO: renamed from: C */
    public final Dialog mo896C() {
        Context contextM2878y = m2878y();
        m2878y();
        int i = this.f2534i0;
        if (i == 0) {
            m1613D();
            throw null;
        }
        Dialog dialog = new Dialog(contextM2878y, i);
        Context context = dialog.getContext();
        this.f2540o0 = m1612F(context, android.R.attr.windowFullscreen);
        this.f2528A0 = new C1021Xq(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0939Vu.f2944m, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2528A0.m1925k(context);
        this.f2528A0.m1928n(ColorStateList.valueOf(color));
        this.f2528A0.m1927m(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    /* JADX INFO: renamed from: D */
    public final void m1613D() {
        if (this.f5315f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public final void mo900n(Bundle bundle) {
        super.mo900n(bundle);
        if (bundle == null) {
            bundle = this.f5315f;
        }
        this.f2534i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2536k0 = (C0136D6) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2538m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2539n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2541p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2542q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2543r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2544s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2545t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2546u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2547v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2548w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2549x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f2539n0;
        if (text == null) {
            text = m2878y().getResources().getText(this.f2538m0);
        }
        this.f2530C0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f2531D0 = text;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: o */
    public final View mo1043o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f2540o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f2540o0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1611E(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1611E(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f2551z0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2550y0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2551z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2551z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC1406fG.m2695U(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC1406fG.m2695U(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2551z0.setChecked(this.f2541p0 != 0);
        AbstractC2185lE.m4399l(this.f2551z0, null);
        CheckableImageButton checkableImageButton2 = this.f2551z0;
        this.f2551z0.setContentDescription(this.f2541p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2551z0.setOnClickListener(new ViewOnClickListenerC1477h(7, this));
        m1613D();
        throw null;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2532g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2533h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f5296E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public final void mo904t(Bundle bundle) {
        super.mo904t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2534i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0136D6 c0136d6 = this.f2536k0;
        C0093C6 c0093c6 = new C0093C6();
        int i = C0093C6.f208b;
        int i2 = C0093C6.f208b;
        long j = c0136d6.f349a.f5212f;
        long j2 = c0136d6.f350b.f5212f;
        c0093c6.f209a = Long.valueOf(c0136d6.f352d.f5212f);
        int i3 = c0136d6.f353e;
        C0019Ac c0019Ac = c0136d6.f351c;
        C0549Mq c0549Mq = this.f2537l0;
        C1469gs c1469gs = c0549Mq == null ? null : c0549Mq.f1776W;
        if (c1469gs != null) {
            c0093c6.f209a = Long.valueOf(c1469gs.f5212f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0019Ac);
        C1469gs c1469gsM2821b = C1469gs.m2821b(j);
        C1469gs c1469gsM2821b2 = C1469gs.m2821b(j2);
        C0019Ac c0019Ac2 = (C0019Ac) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0093c6.f209a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0136D6(c1469gsM2821b, c1469gsM2821b2, c0019Ac2, l == null ? null : C1469gs.m2821b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2538m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2539n0);
        bundle.putInt("INPUT_MODE_KEY", this.f2541p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2542q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2543r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2544s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2545t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2546u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2547v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2548w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2549x0);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: u */
    public final void mo905u() {
        super.mo905u();
        Dialog dialog = this.f1479c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f2540o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2528A0);
            if (!this.f2529B0) {
                View viewFindViewById = m2879z().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM1158z = AbstractC0585Nj.m1158z(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM1158z != null ? Integer.valueOf(colorStateListM1158z.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int iM620m = AbstractC0295Gu.m620m(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z) {
                    numValueOf = Integer.valueOf(iM620m);
                }
                AbstractC0671Pj.m1359y(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = AbstractC0295Gu.m627t(0) || AbstractC0295Gu.m627t(numValueOf.intValue());
                C1517hw c1517hw = new C1517hw(window.getDecorView(), 8);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new C0618OF(window, c1517hw) : i >= 30 ? new C0575NF(window, c1517hw) : new C0532MF(window, c1517hw)).mo1028T(z2);
                boolean z3 = AbstractC0295Gu.m627t(0) || AbstractC0295Gu.m627t(iM620m);
                C1517hw c1517hw2 = new C1517hw(window.getDecorView(), 8);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new C0618OF(window, c1517hw2) : i2 >= 30 ? new C0575NF(window, c1517hw2) : new C0532MF(window, c1517hw2)).mo1027S(z3);
                C0763Rq c0763Rq = new C0763Rq(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                AbstractC1360eE.m2640l(viewFindViewById, c0763Rq);
                this.f2529B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m2878y().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2528A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1479c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC2722xl(dialog2, rect));
        }
        m2878y();
        int i3 = this.f2534i0;
        if (i3 == 0) {
            m1613D();
            throw null;
        }
        m1613D();
        C0136D6 c0136d6 = this.f2536k0;
        C0549Mq c0549Mq = new C0549Mq();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0136d6);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0136d6.f352d);
        c0549Mq.m2867B(bundle);
        this.f2537l0 = c0549Mq;
        AbstractC0595Nt abstractC0595Nt = c0549Mq;
        if (this.f2541p0 == 1) {
            m1613D();
            C0136D6 c0136d62 = this.f2536k0;
            C1064Yq c1064Yq = new C1064Yq();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0136d62);
            c1064Yq.m2867B(bundle2);
            abstractC0595Nt = c1064Yq;
        }
        this.f2535j0 = abstractC0595Nt;
        this.f2550y0.setText((this.f2541p0 == 1 && m2878y().getResources().getConfiguration().orientation == 2) ? this.f2531D0 : this.f2530C0);
        m1613D();
        throw null;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0450Kd, p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: v */
    public final void mo906v() {
        this.f2535j0.f1926T.clear();
        super.mo906v();
    }
}
