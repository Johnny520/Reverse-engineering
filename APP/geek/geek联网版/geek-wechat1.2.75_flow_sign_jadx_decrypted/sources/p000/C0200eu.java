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

/* JADX INFO: renamed from: eu */
/* JADX INFO: loaded from: classes.dex */
public final class C0200eu<S> extends DialogInterfaceOnCancelListenerC0743tg {

    /* JADX INFO: renamed from: A0 */
    public CharSequence f1637A0;

    /* JADX INFO: renamed from: B0 */
    public CharSequence f1638B0;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet f1639e0;

    /* JADX INFO: renamed from: f0 */
    public final LinkedHashSet f1640f0;

    /* JADX INFO: renamed from: g0 */
    public int f1641g0;

    /* JADX INFO: renamed from: h0 */
    public AbstractC0909xx f1642h0;

    /* JADX INFO: renamed from: i0 */
    public C0476m8 f1643i0;

    /* JADX INFO: renamed from: j0 */
    public C0942yt f1644j0;

    /* JADX INFO: renamed from: k0 */
    public int f1645k0;

    /* JADX INFO: renamed from: l0 */
    public CharSequence f1646l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f1647m0;

    /* JADX INFO: renamed from: n0 */
    public int f1648n0;

    /* JADX INFO: renamed from: o0 */
    public int f1649o0;

    /* JADX INFO: renamed from: p0 */
    public CharSequence f1650p0;

    /* JADX INFO: renamed from: q0 */
    public int f1651q0;

    /* JADX INFO: renamed from: r0 */
    public CharSequence f1652r0;

    /* JADX INFO: renamed from: s0 */
    public int f1653s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence f1654t0;

    /* JADX INFO: renamed from: u0 */
    public int f1655u0;

    /* JADX INFO: renamed from: v0 */
    public CharSequence f1656v0;

    /* JADX INFO: renamed from: w0 */
    public TextView f1657w0;

    /* JADX INFO: renamed from: x0 */
    public CheckableImageButton f1658x0;

    /* JADX INFO: renamed from: y0 */
    public C0350iu f1659y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f1660z0;

    public C0200eu() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1639e0 = new LinkedHashSet();
        this.f1640f0 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: F */
    public static int m1019F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM2820b = z80.m2820b();
        calendarM2820b.set(5, 1);
        Calendar calendarM2819a = z80.m2819a(calendarM2820b);
        calendarM2819a.get(2);
        calendarM2819a.get(1);
        int maximum = calendarM2819a.getMaximum(7);
        calendarM2819a.getActualMaximum(5);
        calendarM2819a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m1020G(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0493mp.m1838L(context, R.attr.materialCalendarStyle, C0942yt.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg
    /* JADX INFO: renamed from: D */
    public final Dialog mo1021D() {
        Context contextM2050z = m2050z();
        m2050z();
        int i = this.f1641g0;
        if (i == 0) {
            m1022E();
            throw null;
        }
        Dialog dialog = new Dialog(contextM2050z, i);
        Context context = dialog.getContext();
        this.f1647m0 = m1020G(context, android.R.attr.windowFullscreen);
        this.f1659y0 = new C0350iu(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0168dz.f1449l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1659y0.m1535h(context);
        this.f1659y0.m1537j(ColorStateList.valueOf(color));
        C0350iu c0350iu = this.f1659y0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = oa0.f3426a;
        c0350iu.m1536i(da0.m891i(decorView));
        return dialog;
    }

    /* JADX INFO: renamed from: E */
    public final void m1022E() {
        if (this.f3491f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg, p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: m */
    public final void mo1023m(Bundle bundle) {
        super.mo1023m(bundle);
        if (bundle == null) {
            bundle = this.f3491f;
        }
        this.f1641g0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1643i0 = (C0476m8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1645k0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1646l0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1648n0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1649o0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1650p0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1651q0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1652r0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1653s0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1654t0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1655u0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1656v0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f1646l0;
        if (text == null) {
            text = m2050z().getResources().getText(this.f1645k0);
        }
        this.f1637A0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f1638B0 = text;
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: n */
    public final View mo1024n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f1647m0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f1647m0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1019F(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1019F(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = oa0.f3426a;
        aa0.m43f(textView, 1);
        this.f1658x0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1657w0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1658x0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1658x0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0259gf.m1261w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0259gf.m1261w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1658x0.setChecked(this.f1648n0 != 0);
        oa0.m2012l(this.f1658x0, null);
        CheckableImageButton checkableImageButton2 = this.f1658x0;
        this.f1658x0.setContentDescription(this.f1648n0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1658x0.setOnClickListener(new ViewOnClickListenerC0923ya(5, this));
        m1022E();
        throw null;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1639e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1640f0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f3474E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg, p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: r */
    public final void mo1025r(Bundle bundle) {
        super.mo1025r(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1641g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0476m8 c0476m8 = this.f1643i0;
        C0439l8 c0439l8 = new C0439l8();
        int i = C0439l8.f2968b;
        int i2 = C0439l8.f2968b;
        long j = c0476m8.f3099a.f2065f;
        long j2 = c0476m8.f3100b.f2065f;
        c0439l8.f2969a = Long.valueOf(c0476m8.f3102d.f2065f);
        int i3 = c0476m8.f3103e;
        C0149df c0149df = c0476m8.f3101c;
        C0942yt c0942yt = this.f1644j0;
        C0276gw c0276gw = c0942yt == null ? null : c0942yt.f5494U;
        if (c0276gw != null) {
            c0439l8.f2969a = Long.valueOf(c0276gw.f2065f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0149df);
        C0276gw c0276gwM1342b = C0276gw.m1342b(j);
        C0276gw c0276gwM1342b2 = C0276gw.m1342b(j2);
        C0149df c0149df2 = (C0149df) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0439l8.f2969a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0476m8(c0276gwM1342b, c0276gwM1342b2, c0149df2, l == null ? null : C0276gw.m1342b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1645k0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1646l0);
        bundle.putInt("INPUT_MODE_KEY", this.f1648n0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1649o0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1650p0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1651q0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1652r0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1653s0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1654t0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1655u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1656v0);
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg, p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: s */
    public final void mo1026s() {
        AbstractC0498mu cd0Var;
        AbstractC0498mu cd0Var2;
        super.mo1026s();
        Dialog dialog = this.f4519a0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1647m0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1659y0);
            if (!this.f1660z0) {
                View viewFindViewById = m2031A().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM1199n = g80.m1199n(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM1199n != null ? Integer.valueOf(colorStateListM1199n.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iM1197l = g80.m1197l(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iM1197l);
                }
                if (i >= 30) {
                    ac0.m47a(window, false);
                } else {
                    zb0.m2832a(window, false);
                }
                window.getContext();
                int iM2144d = i < 27 ? AbstractC0627qb.m2144d(g80.m1197l(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iM2144d);
                boolean z3 = g80.m1204s(0) || g80.m1204s(numValueOf.intValue());
                View decorView = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    dd0 dd0Var = new dd0(window.getInsetsController());
                    dd0Var.f1387b = window;
                    cd0Var = dd0Var;
                } else {
                    cd0Var = new cd0(window, decorView);
                }
                cd0Var.mo630F(z3);
                boolean zM1204s = g80.m1204s(iM1197l);
                if (g80.m1204s(iM2144d) || (iM2144d == 0 && zM1204s)) {
                    z = true;
                }
                View decorView2 = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    dd0 dd0Var2 = new dd0(window.getInsetsController());
                    dd0Var2.f1387b = window;
                    cd0Var2 = dd0Var2;
                } else {
                    cd0Var2 = new cd0(window, decorView2);
                }
                cd0Var2.mo629E(z);
                C0163du c0163du = new C0163du(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = oa0.f3426a;
                da0.m903u(viewFindViewById, c0163du);
                this.f1660z0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m2050z().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1659y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView3 = window.getDecorView();
            Dialog dialog2 = this.f4519a0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView3.setOnTouchListener(new ViewOnTouchListenerC0269gp(dialog2, rect));
        }
        m2050z();
        int i2 = this.f1641g0;
        if (i2 == 0) {
            m1022E();
            throw null;
        }
        m1022E();
        C0476m8 c0476m8 = this.f1643i0;
        C0942yt c0942yt = new C0942yt();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0476m8);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0476m8.f3102d);
        c0942yt.m2033C(bundle);
        this.f1644j0 = c0942yt;
        AbstractC0909xx abstractC0909xx = c0942yt;
        if (this.f1648n0 == 1) {
            m1022E();
            C0476m8 c0476m82 = this.f1643i0;
            C0424ku c0424ku = new C0424ku();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0476m82);
            c0424ku.m2033C(bundle2);
            abstractC0909xx = c0424ku;
        }
        this.f1642h0 = abstractC0909xx;
        this.f1657w0.setText((this.f1648n0 == 1 && m2050z().getResources().getConfiguration().orientation == 2) ? this.f1638B0 : this.f1637A0);
        m1022E();
        throw null;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0743tg, p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: t */
    public final void mo1027t() {
        this.f1642h0.f5319R.clear();
        super.mo1027t();
    }
}
