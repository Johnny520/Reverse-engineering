package com.google.android.material.datepicker;

import android.R;
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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.C1247R;
import com.google.android.material.datepicker.C1282a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.AbstractC0169J4;
import p000a.AbstractC0553e7;
import p000a.AbstractC0577fc;
import p000a.AbstractC0843tc;
import p000a.C0181Jg;
import p000a.C0247Na;
import p000a.C0265Oa;
import p000a.C0327S1;
import p000a.C0354Ta;
import p000a.C0372Ua;
import p000a.C0467Zf;
import p000a.C0674ke;
import p000a.C0677kh;
import p000a.C0726n9;
import p000a.C0810rh;
import p000a.C0842tb;
import p000a.C0848th;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0931y5;
import p000a.C0955za;
import p000a.DialogInterfaceOnCancelListenerC0646j5;
import p000a.InterfaceC0151I4;
import p000a.InterfaceC0301Qa;
import p000a.ViewOnClickListenerC0606h3;
import p000a.ViewOnTouchListenerC0460Z8;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1285d<S> extends DialogInterfaceOnCancelListenerC0646j5 {

    /* JADX INFO: renamed from: A0 */
    public int f5710A0;

    /* JADX INFO: renamed from: B0 */
    public CharSequence f5711B0;

    /* JADX INFO: renamed from: C0 */
    public int f5712C0;

    /* JADX INFO: renamed from: D0 */
    public CharSequence f5713D0;

    /* JADX INFO: renamed from: E0 */
    public int f5714E0;

    /* JADX INFO: renamed from: F0 */
    public CharSequence f5715F0;

    /* JADX INFO: renamed from: G0 */
    public TextView f5716G0;

    /* JADX INFO: renamed from: H0 */
    public TextView f5717H0;

    /* JADX INFO: renamed from: I0 */
    public CheckableImageButton f5718I0;

    /* JADX INFO: renamed from: J0 */
    public C0354Ta f5719J0;

    /* JADX INFO: renamed from: K0 */
    public Button f5720K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f5721L0;

    /* JADX INFO: renamed from: M0 */
    public CharSequence f5722M0;

    /* JADX INFO: renamed from: N0 */
    public CharSequence f5723N0;

    /* JADX INFO: renamed from: k0 */
    public final LinkedHashSet<InterfaceC0301Qa<? super S>> f5724k0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: l0 */
    public final LinkedHashSet<View.OnClickListener> f5725l0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: m0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f5726m0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: n0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f5727n0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: o0 */
    public int f5728o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC0151I4<S> f5729p0;

    /* JADX INFO: renamed from: q0 */
    public AbstractC0843tc<S> f5730q0;

    /* JADX INFO: renamed from: r0 */
    public C1282a f5731r0;

    /* JADX INFO: renamed from: s0 */
    public AbstractC0169J4 f5732s0;

    /* JADX INFO: renamed from: t0 */
    public C1284c<S> f5733t0;

    /* JADX INFO: renamed from: u0 */
    public int f5734u0;

    /* JADX INFO: renamed from: v0 */
    public CharSequence f5735v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f5736w0;

    /* JADX INFO: renamed from: x0 */
    public int f5737x0;

    /* JADX INFO: renamed from: y0 */
    public int f5738y0;

    /* JADX INFO: renamed from: z0 */
    public CharSequence f5739z0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.d$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1285d c1285d = C1285d.this;
            for (InterfaceC0301Qa<? super S> interfaceC0301Qa : c1285d.f5724k0) {
                c1285d.m3219H().m423a();
                interfaceC0301Qa.m843a();
            }
            c1285d.m1506F(false, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.d$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1285d c1285d = C1285d.this;
            Iterator<View.OnClickListener> it = c1285d.f5725l0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            c1285d.m1506F(false, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.d$c */
    public class c extends AbstractC0577fc<S> {
        public c() {
        }

        @Override // p000a.AbstractC0577fc
        /* JADX INFO: renamed from: a */
        public final void mo997a(S s) {
            C1285d c1285d = C1285d.this;
            String strM425c = c1285d.m3219H().m425c();
            TextView textView = c1285d.f5717H0;
            InterfaceC0151I4<S> interfaceC0151I4M3219H = c1285d.m3219H();
            c1285d.m2524A();
            textView.setContentDescription(interfaceC0151I4M3219H.m430i());
            c1285d.f5717H0.setText(strM425c);
            c1285d.f5720K0.setEnabled(c1285d.m3219H().m429h());
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m3217I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM1138d = C0467Zf.m1138d();
        calendarM1138d.set(5, 1);
        Calendar calendarM1137c = C0467Zf.m1137c(calendarM1138d);
        calendarM1137c.get(2);
        calendarM1137c.get(1);
        int maximum = calendarM1137c.getMaximum(7);
        calendarM1137c.getActualMaximum(5);
        calendarM1137c.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(C1247R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m3218J(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0955za.m2246c(context, C1247R.attr.materialCalendarStyle, C1284c.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5
    /* JADX INFO: renamed from: G */
    public final Dialog mo1507G() {
        Context contextM2524A = m2524A();
        m2524A();
        int iM426d = this.f5728o0;
        if (iM426d == 0) {
            iM426d = m3219H().m426d();
        }
        Dialog dialog = new Dialog(contextM2524A, iM426d);
        Context context = dialog.getContext();
        this.f5736w0 = m3218J(context, R.attr.windowFullscreen);
        this.f5719J0 = new C0354Ta(context, null, C1247R.attr.materialCalendarStyle, C1247R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C1247R.styleable.MaterialCalendar, C1247R.attr.materialCalendarStyle, C1247R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(C1247R.styleable.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f5719J0.m965i(context);
        this.f5719J0.m967k(ColorStateList.valueOf(color));
        C0354Ta c0354Ta = this.f5719J0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        c0354Ta.m966j(C0866ug.d.m2017i(decorView));
        return dialog;
    }

    /* JADX INFO: renamed from: H */
    public final InterfaceC0151I4<S> m3219H() {
        if (this.f5729p0 == null) {
            this.f5729p0 = (InterfaceC0151I4) this.f4562f.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f5729p0;
    }

    /* JADX INFO: renamed from: K */
    public final void m3220K() {
        m2524A();
        int iM426d = this.f5728o0;
        if (iM426d == 0) {
            iM426d = m3219H().m426d();
        }
        InterfaceC0151I4<S> interfaceC0151I4M3219H = m3219H();
        C1282a c1282a = this.f5731r0;
        AbstractC0169J4 abstractC0169J4 = this.f5732s0;
        C0372Ua c1284c = new C1284c<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iM426d);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC0151I4M3219H);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1282a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC0169J4);
        bundle.putParcelable("CURRENT_MONTH_KEY", c1282a.f5683d);
        c1284c.m2528E(bundle);
        this.f5733t0 = c1284c;
        if (this.f5737x0 == 1) {
            InterfaceC0151I4<S> interfaceC0151I4M3219H2 = m3219H();
            C1282a c1282a2 = this.f5731r0;
            C0372Ua c0372Ua = new C0372Ua();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iM426d);
            bundle2.putParcelable("DATE_SELECTOR_KEY", interfaceC0151I4M3219H2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1282a2);
            c0372Ua.m2528E(bundle2);
            c1284c = c0372Ua;
        }
        this.f5730q0 = c1284c;
        this.f5716G0.setText((this.f5737x0 == 1 && m2524A().getResources().getConfiguration().orientation == 2) ? this.f5723N0 : this.f5722M0);
        String strM425c = m3219H().m425c();
        TextView textView = this.f5717H0;
        InterfaceC0151I4<S> interfaceC0151I4M3219H3 = m3219H();
        m2524A();
        textView.setContentDescription(interfaceC0151I4M3219H3.m430i());
        this.f5717H0.setText(strM425c);
        AbstractC0553e7 abstractC0553e7M2530c = m2530c();
        abstractC0553e7M2530c.getClass();
        C0327S1 c0327s1 = new C0327S1(abstractC0553e7M2530c);
        int i = C1247R.id.mtrl_calendar_frame;
        AbstractC0843tc<S> abstractC0843tc = this.f5730q0;
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c0327s1.m905e(i, abstractC0843tc, null, 2);
        if (c0327s1.f3006g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0327s1.f1161q.m1335A(c0327s1, false);
        this.f5730q0.mo1968F(new c());
    }

    /* JADX INFO: renamed from: L */
    public final void m3221L(CheckableImageButton checkableImageButton) {
        this.f5718I0.setContentDescription(this.f5737x0 == 1 ? checkableImageButton.getContext().getString(C1247R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(C1247R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5, androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: o */
    public final void mo994o(Bundle bundle) {
        super.mo994o(bundle);
        if (bundle == null) {
            bundle = this.f4562f;
        }
        this.f5728o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f5729p0 = (InterfaceC0151I4) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5731r0 = (C1282a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5732s0 = (AbstractC0169J4) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f5734u0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f5735v0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f5737x0 = bundle.getInt("INPUT_MODE_KEY");
        this.f5738y0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5739z0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f5710A0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5711B0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f5712C0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5713D0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f5714E0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5715F0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f5735v0;
        if (text == null) {
            text = m2524A().getResources().getText(this.f5734u0);
        }
        this.f5722M0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f5723N0 = text;
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f5726m0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f5727n0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f4543G;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: p */
    public final View mo995p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f5736w0 ? C1247R.layout.mtrl_picker_fullscreen : C1247R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f5736w0) {
            viewInflate.findViewById(C1247R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m3217I(context), -2));
        } else {
            viewInflate.findViewById(C1247R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m3217I(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(C1247R.id.mtrl_picker_header_selection_text);
        this.f5717H0 = textView;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        textView.setAccessibilityLiveRegion(1);
        this.f5718I0 = (CheckableImageButton) viewInflate.findViewById(C1247R.id.mtrl_picker_header_toggle);
        this.f5716G0 = (TextView) viewInflate.findViewById(C1247R.id.mtrl_picker_title_text);
        this.f5718I0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f5718I0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C0889w1.m2115A(context, C1247R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0889w1.m2115A(context, C1247R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f5718I0.setChecked(this.f5737x0 != 0);
        C0866ug.m2003j(this.f5718I0, null);
        m3221L(this.f5718I0);
        this.f5718I0.setOnClickListener(new ViewOnClickListenerC0606h3(6, this));
        this.f5720K0 = (Button) viewInflate.findViewById(C1247R.id.confirm_button);
        if (m3219H().m429h()) {
            this.f5720K0.setEnabled(true);
        } else {
            this.f5720K0.setEnabled(false);
        }
        this.f5720K0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f5739z0;
        if (charSequence != null) {
            this.f5720K0.setText(charSequence);
        } else {
            int i = this.f5738y0;
            if (i != 0) {
                this.f5720K0.setText(i);
            }
        }
        CharSequence charSequence2 = this.f5711B0;
        if (charSequence2 != null) {
            this.f5720K0.setContentDescription(charSequence2);
        } else if (this.f5710A0 != 0) {
            this.f5720K0.setContentDescription(m2531d().getResources().getText(this.f5710A0));
        }
        this.f5720K0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(C1247R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f5713D0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.f5712C0;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.f5715F0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f5714E0 != 0) {
            button.setContentDescription(m2531d().getResources().getText(this.f5714E0));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5, androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: t */
    public final void mo996t(Bundle bundle) {
        super.mo996t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f5728o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5729p0);
        C1282a c1282a = this.f5731r0;
        C1282a.b bVar = new C1282a.b();
        int i = C1282a.b.f5687c;
        int i2 = C1282a.b.f5687c;
        bVar.f5689b = new C1283b(Long.MIN_VALUE);
        long j = c1282a.f5680a.f3317f;
        long j2 = c1282a.f5681b.f3317f;
        bVar.f5688a = Long.valueOf(c1282a.f5683d.f3317f);
        C1282a.c cVar = c1282a.f5682c;
        bVar.f5689b = cVar;
        C1284c<S> c1284c = this.f5733t0;
        C0842tb c0842tb = c1284c == null ? null : c1284c.f5695a0;
        if (c0842tb != null) {
            bVar.f5688a = Long.valueOf(c0842tb.f3317f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        C0842tb c0842tbM1965l = C0842tb.m1965l(j);
        C0842tb c0842tbM1965l2 = C0842tb.m1965l(j2);
        C1282a.c cVar2 = (C1282a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.f5688a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C1282a(c0842tbM1965l, c0842tbM1965l2, cVar2, l != null ? C0842tb.m1965l(l.longValue()) : null, c1282a.f5684e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f5732s0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f5734u0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f5735v0);
        bundle.putInt("INPUT_MODE_KEY", this.f5737x0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f5738y0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f5739z0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5710A0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5711B0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5712C0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f5713D0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5714E0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5715F0);
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5, androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: u */
    public final void mo1513u() {
        C0726n9 c0810rh;
        C0726n9 c0810rh2;
        super.mo1513u();
        Dialog dialog = this.f2378g0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f5736w0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5719J0);
            if (!this.f5721L0) {
                View viewFindViewById = m2525B().findViewById(C1247R.id.fullscreen_header);
                ColorStateList colorStateListM2216a = C0931y5.m2216a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM2216a != null ? Integer.valueOf(colorStateListM2216a.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int iM683a = C0247Na.m683a(window.getContext(), R.attr.colorBackground, -16777216);
                if (z) {
                    numValueOf = Integer.valueOf(iM683a);
                }
                if (i >= 30) {
                    C0677kh.m1547a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = C0247Na.m685c(0) || C0247Na.m685c(numValueOf.intValue());
                C0674ke c0674ke = new C0674ke(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    C0848th c0848th = new C0848th(window.getInsetsController(), c0674ke);
                    c0848th.f3327c = window;
                    c0810rh = c0848th;
                } else {
                    c0810rh = new C0810rh(window, c0674ke);
                }
                c0810rh.mo1683y(z2);
                boolean z3 = C0247Na.m685c(0) || C0247Na.m685c(iM683a);
                C0674ke c0674ke2 = new C0674ke(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    C0848th c0848th2 = new C0848th(window.getInsetsController(), c0674ke2);
                    c0848th2.f3327c = window;
                    c0810rh2 = c0848th2;
                } else {
                    c0810rh2 = new C0810rh(window, c0674ke2);
                }
                c0810rh2.mo1682x(z3);
                C0265Oa c0265Oa = new C0265Oa(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0866ug.d.m2029u(viewFindViewById, c0265Oa);
                this.f5721L0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m2524A().getResources().getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5719J0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f2378g0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC0460Z8(dialog2, rect));
        }
        m3220K();
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0646j5, androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: v */
    public final void mo1514v() {
        this.f5730q0.f3319V.clear();
        super.mo1514v();
    }
}
