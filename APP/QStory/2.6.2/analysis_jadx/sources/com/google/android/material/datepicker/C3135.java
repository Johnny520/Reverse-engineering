package com.google.android.material.datepicker;

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
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.AbstractC0147;
import androidx.compose.ui.text.input.C2023;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2267;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2215;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.C2332;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2343;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.xposed.hook.javaplugin.C5553;
import p251.AbstractC8174;
import p300.ViewOnTouchListenerC8608;
import p305.C8651;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3135<S> extends DialogInterfaceOnCancelListenerC2343 {

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public boolean f10323;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public Button f10324;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public CharSequence f10325;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public CharSequence f10326;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public CharSequence f10327;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public int f10328;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public CheckableImageButton f10329;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public C8651 f10330;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public TextView f10331;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public TextView f10332;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public AbstractC3112 f10333;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public CalendarConstraints f10334;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public DateSelector f10337;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public int f10338;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public int f10339;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public CharSequence f10340;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public int f10341;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public CharSequence f10342;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public CharSequence f10343;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public int f10344;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public CharSequence f10347;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public int f10348;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public int f10349;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public boolean f10350;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public DayViewDecorator f10351;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public MaterialCalendar f10352;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final LinkedHashSet f10345 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final LinkedHashSet f10346 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final LinkedHashSet f10336 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10335 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m7154(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC8174.m13595(context, MaterialCalendar.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static int m7155(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(AbstractC3120.m7142());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.f10263;
        return AbstractC0053.m142(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f10336.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f10335.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f6880;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7156(CheckableImageButton checkableImageButton) {
        this.f10329.setContentDescription(this.f10349 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7157() {
        Context contextM4425 = m4425();
        int iMo7109 = this.f10338;
        if (iMo7109 == 0) {
            iMo7109 = m7159().mo7109(contextM4425);
        }
        String str = this.f10349 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4365 = m4432().m4365(str);
        AbstractC3112 abstractC3112 = abstractComponentCallbacksC2338M4365 instanceof AbstractC3112 ? (AbstractC3112) abstractComponentCallbacksC2338M4365 : null;
        if (abstractC3112 == null) {
            if (this.f10349 == 1) {
                DateSelector dateSelectorM7159 = m7159();
                CalendarConstraints calendarConstraints = this.f10334;
                C3132 c3132 = new C3132();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iMo7109);
                bundle.putParcelable("DATE_SELECTOR_KEY", dateSelectorM7159);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                c3132.m4429(bundle);
                abstractC3112 = c3132;
            } else {
                DateSelector dateSelectorM71592 = m7159();
                CalendarConstraints calendarConstraints2 = this.f10334;
                DayViewDecorator dayViewDecorator = this.f10351;
                MaterialCalendar materialCalendar = new MaterialCalendar();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iMo7109);
                bundle2.putParcelable("GRID_SELECTOR_KEY", dateSelectorM71592);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.f10230);
                materialCalendar.m4429(bundle2);
                this.f10352 = materialCalendar;
                abstractC3112 = materialCalendar;
            }
        }
        this.f10333 = abstractC3112;
        abstractC3112.mo7121(new C3134(0, this));
        this.f10331.setText((this.f10349 == 1 && m4425().getResources().getConfiguration().orientation == 2) ? this.f10325 : this.f10326);
        String strMo7113 = m7159().mo7113(m4431());
        this.f10332.setContentDescription(m7159().mo7110(m4425()));
        this.f10332.setText(strMo7113);
        AbstractC2313 abstractC2313M4432 = m4432();
        abstractC2313M4432.getClass();
        C2332 c2332 = new C2332(abstractC2313M4432);
        c2332.m4421(R.id.mtrl_calendar_frame, this.f10333, str);
        if (c2332.f6855) {
            C5919.m11250("This transaction is already being added to the back stack");
        } else {
            c2332.f6854 = false;
            c2332.f6850.m4368(c2332, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m7158(CheckableImageButton checkableImageButton) {
        AbstractC0147.m600(this.f10329, this.f10349 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final DateSelector m7159() {
        if (this.f10337 == null) {
            this.f10337 = (DateSelector) this.f6904.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f10337;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Dialog mo4455() {
        Context contextM4425 = m4425();
        Context contextM44252 = m4425();
        int iMo7109 = this.f10338;
        if (iMo7109 == 0) {
            iMo7109 = m7159().mo7109(contextM44252);
        }
        Dialog dialog = new Dialog(contextM4425, iMo7109);
        Context context = dialog.getContext();
        this.f10350 = m7154(context, android.R.attr.windowFullscreen);
        this.f10330 = new C8651(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC8669.f24446, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10330.m14320(context);
        this.f10330.m14323(ColorStateList.valueOf(color));
        this.f10330.m14322(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo4438() {
        super.mo4438();
        Dialog dialog = this.f6927;
        if (dialog == null) {
            C5553.m10826(this, "DialogFragment ", " does not have a Dialog.");
            return;
        }
        Window window = dialog.getWindow();
        if (this.f10350) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f10330);
            if (!this.f10323) {
                View viewFindViewById = m4424().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM10038 = AbstractC5061.m10038(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM10038 != null ? Integer.valueOf(colorStateListM10038.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                Integer numM9893 = AbstractC4921.m9893(window.getContext(), android.R.attr.colorBackground);
                int iIntValue = numM9893 != null ? numM9893.intValue() : -16777216;
                if (z) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                AbstractC2267.m4220(window, false);
                window.getContext();
                window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(0);
                }
                new C2215(window, window.getDecorView()).f6497.mo4003(AbstractC4921.m9879(0) || AbstractC4921.m9879(numValueOf.intValue()));
                new C2215(window, window.getDecorView()).f6497.mo4004(AbstractC4921.m9879(0) || AbstractC4921.m9879(iIntValue));
                C2023 c2023 = new C2023(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                AbstractC2193.m3994(viewFindViewById, c2023);
                this.f10323 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m4425().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f10330, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f6927;
            if (dialog2 == null) {
                C5553.m10826(this, "DialogFragment ", " does not have a Dialog.");
                return;
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC8608(dialog2, rect));
        }
        m7157();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo4439() {
        this.f10333.f10276.clear();
        super.mo4439();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo4441(Bundle bundle) {
        super.mo4441(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10338);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10337);
        CalendarConstraints calendarConstraints = this.f10334;
        C3128 c3128 = new C3128();
        c3128.f10311 = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.f10235.f10264;
        long j2 = calendarConstraints.f10233.f10264;
        c3128.f10312 = Long.valueOf(calendarConstraints.f10230.f10264);
        int i = calendarConstraints.f10229;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f10234;
        c3128.f10311 = dateValidator;
        MaterialCalendar materialCalendar = this.f10352;
        Month month = materialCalendar == null ? null : materialCalendar.f10253;
        if (month != null) {
            c3128.f10312 = Long.valueOf(month.f10264);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthM7127 = Month.m7127(j);
        Month monthM71272 = Month.m7127(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c3128.f10312;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM7127, monthM71272, dateValidator2, l == null ? null : Month.m7127(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10351);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10348);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10347);
        bundle.putInt("INPUT_MODE_KEY", this.f10349);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10341);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10342);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10339);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10340);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10344);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f10343);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10328);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10327);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4444(Bundle bundle) {
        super.mo4444(bundle);
        if (bundle == null) {
            bundle = this.f6904;
        }
        this.f10338 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f10337 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10334 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10351 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10348 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f10347 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f10349 = bundle.getInt("INPUT_MODE_KEY");
        this.f10341 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10342 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f10339 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10340 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f10344 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10343 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f10328 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10327 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f10347;
        if (text == null) {
            text = m4425().getResources().getText(this.f10348);
        }
        this.f10326 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f10325 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4445(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f10350 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f10350) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m7155(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m7155(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f10332 = textView;
        final int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.f10329 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f10331 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f10329.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f10329;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC3054.m6607(context, R.drawable.material_ic_calendar_black_24dp));
        final int i2 = 0;
        stateListDrawable.addState(new int[0], AbstractC3054.m6607(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f10329.setChecked(this.f10349 != 0);
        AbstractC2270.m4234(this.f10329, null);
        m7156(this.f10329);
        m7158(this.f10329);
        final int i3 = 2;
        this.f10329.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3135 f10313;

            {
                this.f10313 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                C3135 c3135 = this.f10313;
                switch (i4) {
                    case 0:
                        Iterator it = c3135.f10345.iterator();
                        if (!it.hasNext()) {
                            c3135.m4456(false, false);
                            return;
                        } else if (it.next() != null) {
                            C2941.m6336();
                            return;
                        } else {
                            c3135.m7159().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3135.f10346.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3135.m4456(false, false);
                        return;
                    default:
                        c3135.f10324.setEnabled(c3135.m7159().mo7108());
                        c3135.f10329.toggle();
                        c3135.f10349 = c3135.f10349 != 1 ? 1 : 0;
                        c3135.m7156(c3135.f10329);
                        c3135.m7158(c3135.f10329);
                        c3135.m7157();
                        return;
                }
            }
        });
        this.f10324 = (Button) viewInflate.findViewById(R.id.confirm_button);
        boolean zMo7108 = m7159().mo7108();
        Button button = this.f10324;
        if (zMo7108) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.f10324.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f10342;
        if (charSequence != null) {
            this.f10324.setText(charSequence);
        } else {
            int i4 = this.f10341;
            if (i4 != 0) {
                this.f10324.setText(i4);
            }
        }
        CharSequence charSequence2 = this.f10340;
        if (charSequence2 != null) {
            this.f10324.setContentDescription(charSequence2);
        } else if (this.f10339 != 0) {
            this.f10324.setContentDescription(m4431().getResources().getText(this.f10339));
        }
        this.f10324.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3135 f10313;

            {
                this.f10313 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                C3135 c3135 = this.f10313;
                switch (i42) {
                    case 0:
                        Iterator it = c3135.f10345.iterator();
                        if (!it.hasNext()) {
                            c3135.m4456(false, false);
                            return;
                        } else if (it.next() != null) {
                            C2941.m6336();
                            return;
                        } else {
                            c3135.m7159().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3135.f10346.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3135.m4456(false, false);
                        return;
                    default:
                        c3135.f10324.setEnabled(c3135.m7159().mo7108());
                        c3135.f10329.toggle();
                        c3135.f10349 = c3135.f10349 != 1 ? 1 : 0;
                        c3135.m7156(c3135.f10329);
                        c3135.m7158(c3135.f10329);
                        c3135.m7157();
                        return;
                }
            }
        });
        Button button2 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f10343;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i5 = this.f10344;
            if (i5 != 0) {
                button2.setText(i5);
            }
        }
        CharSequence charSequence4 = this.f10327;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.f10328 != 0) {
            button2.setContentDescription(m4431().getResources().getText(this.f10328));
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3135 f10313;

            {
                this.f10313 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i;
                C3135 c3135 = this.f10313;
                switch (i42) {
                    case 0:
                        Iterator it = c3135.f10345.iterator();
                        if (!it.hasNext()) {
                            c3135.m4456(false, false);
                            return;
                        } else if (it.next() != null) {
                            C2941.m6336();
                            return;
                        } else {
                            c3135.m7159().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3135.f10346.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3135.m4456(false, false);
                        return;
                    default:
                        c3135.f10324.setEnabled(c3135.m7159().mo7108());
                        c3135.f10329.toggle();
                        c3135.f10349 = c3135.f10349 != 1 ? 1 : 0;
                        c3135.m7156(c3135.f10329);
                        c3135.m7158(c3135.f10329);
                        c3135.m7157();
                        return;
                }
            }
        });
        return viewInflate;
    }
}
