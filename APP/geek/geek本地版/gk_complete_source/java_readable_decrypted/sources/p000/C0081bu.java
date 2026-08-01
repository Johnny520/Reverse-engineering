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
import com.ljx.wechatmod.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: bu */
/* JADX INFO: loaded from: classes.dex */
public final class C0081bu<S> extends DialogInterfaceOnCancelListenerC0670rg {

    /* JADX INFO: renamed from: A0 */
    public CharSequence f831A0;

    /* JADX INFO: renamed from: B0 */
    public CharSequence f832B0;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet f833e0;

    /* JADX INFO: renamed from: f0 */
    public final LinkedHashSet f834f0;

    /* JADX INFO: renamed from: g0 */
    public int f835g0;

    /* JADX INFO: renamed from: h0 */
    public AbstractC0613px f836h0;

    /* JADX INFO: renamed from: i0 */
    public C0095c8 f837i0;

    /* JADX INFO: renamed from: j0 */
    public C0794ut f838j0;

    /* JADX INFO: renamed from: k0 */
    public int f839k0;

    /* JADX INFO: renamed from: l0 */
    public CharSequence f840l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f841m0;

    /* JADX INFO: renamed from: n0 */
    public int f842n0;

    /* JADX INFO: renamed from: o0 */
    public int f843o0;

    /* JADX INFO: renamed from: p0 */
    public CharSequence f844p0;

    /* JADX INFO: renamed from: q0 */
    public int f845q0;

    /* JADX INFO: renamed from: r0 */
    public CharSequence f846r0;

    /* JADX INFO: renamed from: s0 */
    public int f847s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence f848t0;

    /* JADX INFO: renamed from: u0 */
    public int f849u0;

    /* JADX INFO: renamed from: v0 */
    public CharSequence f850v0;

    /* JADX INFO: renamed from: w0 */
    public TextView f851w0;

    /* JADX INFO: renamed from: x0 */
    public CheckableImageButton f852x0;

    /* JADX INFO: renamed from: y0 */
    public C0200eu f853y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f854z0;

    public C0081bu() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f833e0 = new LinkedHashSet();
        this.f834f0 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: F */
    public static int m570F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM2427b = u80.m2427b();
        calendarM2427b.set(5, 1);
        Calendar calendarM2426a = u80.m2426a(calendarM2427b);
        calendarM2426a.get(2);
        calendarM2426a.get(1);
        int maximum = calendarM2426a.getMaximum(7);
        calendarM2426a.getActualMaximum(5);
        calendarM2426a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m571G(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0273gt.m1297A(context, R.attr.materialCalendarStyle, C0794ut.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg
    /* JADX INFO: renamed from: D */
    public final Dialog mo572D() {
        Context contextM1848z = m1848z();
        m1848z();
        int i = this.f835g0;
        if (i == 0) {
            m573E();
            throw null;
        }
        Dialog dialog = new Dialog(contextM1848z, i);
        Context context = dialog.getContext();
        this.f841m0 = m571G(context, android.R.attr.windowFullscreen);
        this.f853y0 = new C0200eu(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0873wy.f5053l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f853y0.m1083h(context);
        this.f853y0.m1085j(ColorStateList.valueOf(color));
        C0200eu c0200eu = this.f853y0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = ja0.f2600a;
        c0200eu.m1084i(y90.m2663i(decorView));
        return dialog;
    }

    /* JADX INFO: renamed from: E */
    public final void m573E() {
        if (this.f3246f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg, p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: m */
    public final void mo574m(Bundle bundle) {
        super.mo574m(bundle);
        if (bundle == null) {
            bundle = this.f3246f;
        }
        this.f835g0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f837i0 = (C0095c8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f839k0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f840l0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f842n0 = bundle.getInt("INPUT_MODE_KEY");
        this.f843o0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f844p0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f845q0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f846r0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f847s0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f848t0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f849u0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f850v0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f840l0;
        if (text == null) {
            text = m1848z().getResources().getText(this.f839k0);
        }
        this.f831A0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f832B0 = text;
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: n */
    public final View mo575n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f841m0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f841m0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m570F(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m570F(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = ja0.f2600a;
        v90.m2499f(textView, 1);
        this.f852x0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f851w0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f852x0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f852x0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0222ff.m1196r(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0222ff.m1196r(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f852x0.setChecked(this.f842n0 != 0);
        ja0.m1575l(this.f852x0, null);
        CheckableImageButton checkableImageButton2 = this.f852x0;
        this.f852x0.setContentDescription(this.f842n0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f852x0.setOnClickListener(new ViewOnClickListenerC0627qa(5, this));
        m573E();
        throw null;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f833e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f834f0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f3229E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg, p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: r */
    public final void mo576r(Bundle bundle) {
        super.mo576r(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f835g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0095c8 c0095c8 = this.f837i0;
        C0059b8 c0059b8 = new C0059b8();
        int i = C0059b8.f777b;
        int i2 = C0059b8.f777b;
        long j = c0095c8.f909a.f5624f;
        long j2 = c0095c8.f910b.f5624f;
        c0059b8.f778a = Long.valueOf(c0095c8.f912d.f5624f);
        int i3 = c0095c8.f913e;
        C0102cf c0102cf = c0095c8.f911c;
        C0794ut c0794ut = this.f838j0;
        C0981zv c0981zv = c0794ut == null ? null : c0794ut.f4762U;
        if (c0981zv != null) {
            c0059b8.f778a = Long.valueOf(c0981zv.f5624f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0102cf);
        C0981zv c0981zvM2841b = C0981zv.m2841b(j);
        C0981zv c0981zvM2841b2 = C0981zv.m2841b(j2);
        C0102cf c0102cf2 = (C0102cf) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0059b8.f778a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0095c8(c0981zvM2841b, c0981zvM2841b2, c0102cf2, l == null ? null : C0981zv.m2841b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f839k0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f840l0);
        bundle.putInt("INPUT_MODE_KEY", this.f842n0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f843o0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f844p0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f845q0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f846r0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f847s0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f848t0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f849u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f850v0);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg, p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: s */
    public final void mo577s() {
        AbstractC0273gt xc0Var;
        AbstractC0273gt xc0Var2;
        super.mo577s();
        Dialog dialog = this.f4280a0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f841m0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f853y0);
            if (!this.f854z0) {
                View viewFindViewById = m1829A().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM1193o = AbstractC0222ff.m1193o(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM1193o != null ? Integer.valueOf(colorStateListM1193o.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iM2829j = AbstractC0979zt.m2829j(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iM2829j);
                }
                if (i >= 30) {
                    vb0.m2503a(window, false);
                } else {
                    ub0.m2441a(window, false);
                }
                window.getContext();
                int iM1428d = i < 27 ? AbstractC0329ib.m1428d(AbstractC0979zt.m2829j(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iM1428d);
                boolean z3 = AbstractC0979zt.m2837z(0) || AbstractC0979zt.m2837z(numValueOf.intValue());
                View decorView = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    yc0 yc0Var = new yc0(window.getInsetsController());
                    yc0Var.f5332b = window;
                    xc0Var = yc0Var;
                } else {
                    xc0Var = new xc0(window, decorView);
                }
                xc0Var.mo1319C(z3);
                boolean zM2837z = AbstractC0979zt.m2837z(iM2829j);
                if (AbstractC0979zt.m2837z(iM1428d) || (iM1428d == 0 && zM2837z)) {
                    z = true;
                }
                View decorView2 = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    yc0 yc0Var2 = new yc0(window.getInsetsController());
                    yc0Var2.f5332b = window;
                    xc0Var2 = yc0Var2;
                } else {
                    xc0Var2 = new xc0(window, decorView2);
                }
                xc0Var2.mo1318B(z);
                C0044au c0044au = new C0044au(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = ja0.f2600a;
                y90.m2675u(viewFindViewById, c0044au);
                this.f854z0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1848z().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f853y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView3 = window.getDecorView();
            Dialog dialog2 = this.f4280a0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView3.setOnTouchListener(new ViewOnTouchListenerC0122cp(dialog2, rect));
        }
        m1848z();
        int i2 = this.f835g0;
        if (i2 == 0) {
            m573E();
            throw null;
        }
        m573E();
        C0095c8 c0095c8 = this.f837i0;
        C0794ut c0794ut = new C0794ut();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0095c8);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0095c8.f912d);
        c0794ut.m1831C(bundle);
        this.f838j0 = c0794ut;
        AbstractC0613px abstractC0613px = c0794ut;
        if (this.f842n0 == 1) {
            m573E();
            C0095c8 c0095c82 = this.f837i0;
            C0237fu c0237fu = new C0237fu();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0095c82);
            c0237fu.m1831C(bundle2);
            abstractC0613px = c0237fu;
        }
        this.f836h0 = abstractC0613px;
        this.f851w0.setText((this.f842n0 == 1 && m1848z().getResources().getConfiguration().orientation == 2) ? this.f832B0 : this.f831A0);
        m573E();
        throw null;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0670rg, p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: t */
    public final void mo578t() {
        this.f836h0.f3960R.clear();
        super.mo578t();
    }
}
