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
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.C5554;
import p053.AbstractC6561;
import p300.ViewOnTouchListenerC8600;
import p305.C8643;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3136<S> extends DialogInterfaceOnCancelListenerC2343 {

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public boolean f10328;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public Button f10329;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public CharSequence f10330;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public CharSequence f10331;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public CharSequence f10332;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public int f10333;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public CheckableImageButton f10334;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public C8643 f10335;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public TextView f10336;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public TextView f10337;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public AbstractC3113 f10338;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public CalendarConstraints f10339;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public DateSelector f10342;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public int f10343;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public int f10344;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public CharSequence f10345;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public int f10346;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public CharSequence f10347;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public CharSequence f10348;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public int f10349;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public CharSequence f10352;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public int f10353;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public int f10354;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public boolean f10355;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public DayViewDecorator f10356;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public MaterialCalendar f10357;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final LinkedHashSet f10350 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final LinkedHashSet f10351 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final LinkedHashSet f10341 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10340 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m7141(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC6561.m12067(context, MaterialCalendar.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static int m7142(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(AbstractC3121.m7129());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.f10268;
        return AbstractC0053.m143(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f10341.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f10340.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f6881;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7143(CheckableImageButton checkableImageButton) {
        this.f10334.setContentDescription(this.f10354 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7144() {
        Context contextM4435 = m4435();
        int iMo7096 = this.f10343;
        if (iMo7096 == 0) {
            iMo7096 = m7146().mo7096(contextM4435);
        }
        String str = this.f10354 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4375 = m4442().m4375(str);
        AbstractC3113 abstractC3113 = abstractComponentCallbacksC2338M4375 instanceof AbstractC3113 ? (AbstractC3113) abstractComponentCallbacksC2338M4375 : null;
        if (abstractC3113 == null) {
            if (this.f10354 == 1) {
                DateSelector dateSelectorM7146 = m7146();
                CalendarConstraints calendarConstraints = this.f10339;
                C3133 c3133 = new C3133();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iMo7096);
                bundle.putParcelable("DATE_SELECTOR_KEY", dateSelectorM7146);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                c3133.m4439(bundle);
                abstractC3113 = c3133;
            } else {
                DateSelector dateSelectorM71462 = m7146();
                CalendarConstraints calendarConstraints2 = this.f10339;
                DayViewDecorator dayViewDecorator = this.f10356;
                MaterialCalendar materialCalendar = new MaterialCalendar();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iMo7096);
                bundle2.putParcelable("GRID_SELECTOR_KEY", dateSelectorM71462);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.f10235);
                materialCalendar.m4439(bundle2);
                this.f10357 = materialCalendar;
                abstractC3113 = materialCalendar;
            }
        }
        this.f10338 = abstractC3113;
        abstractC3113.mo7108(new C3135(0, this));
        this.f10336.setText((this.f10354 == 1 && m4435().getResources().getConfiguration().orientation == 2) ? this.f10330 : this.f10331);
        String strMo7100 = m7146().mo7100(m4441());
        this.f10337.setContentDescription(m7146().mo7099(m4435()));
        this.f10337.setText(strMo7100);
        AbstractC2313 abstractC2313M4442 = m4442();
        abstractC2313M4442.getClass();
        C2332 c2332 = new C2332(abstractC2313M4442);
        c2332.m4431(R.id.mtrl_calendar_frame, this.f10338, str);
        if (c2332.f6856) {
            C5925.m11311("This transaction is already being added to the back stack");
        } else {
            c2332.f6855 = false;
            c2332.f6851.m4378(c2332, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m7145(CheckableImageButton checkableImageButton) {
        AbstractC0147.m601(this.f10334, this.f10354 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final DateSelector m7146() {
        if (this.f10342 == null) {
            this.f10342 = (DateSelector) this.f6905.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f10342;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Dialog mo4465() {
        Context contextM4435 = m4435();
        Context contextM44352 = m4435();
        int iMo7096 = this.f10343;
        if (iMo7096 == 0) {
            iMo7096 = m7146().mo7096(contextM44352);
        }
        Dialog dialog = new Dialog(contextM4435, iMo7096);
        Context context = dialog.getContext();
        this.f10355 = m7141(context, android.R.attr.windowFullscreen);
        this.f10335 = new C8643(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC8661.f24437, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10335.m14338(context);
        this.f10335.m14341(ColorStateList.valueOf(color));
        this.f10335.m14340(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo4448() {
        super.mo4448();
        Dialog dialog = this.f6928;
        if (dialog == null) {
            C5554.m10883(this, "DialogFragment ", " does not have a Dialog.");
            return;
        }
        Window window = dialog.getWindow();
        if (this.f10355) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f10335);
            if (!this.f10328) {
                View viewFindViewById = m4434().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM8320 = AbstractC3933.m8320(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM8320 != null ? Integer.valueOf(colorStateListM8320.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                Integer numM10046 = AbstractC5062.m10046(window.getContext(), android.R.attr.colorBackground);
                int iIntValue = numM10046 != null ? numM10046.intValue() : -16777216;
                if (z) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                AbstractC2267.m4230(window, false);
                window.getContext();
                window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(0);
                }
                new C2215(window, window.getDecorView()).f6498.mo4013(AbstractC5062.m10043(0) || AbstractC5062.m10043(numValueOf.intValue()));
                new C2215(window, window.getDecorView()).f6498.mo4014(AbstractC5062.m10043(0) || AbstractC5062.m10043(iIntValue));
                C2023 c2023 = new C2023(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                AbstractC2193.m4004(viewFindViewById, c2023);
                this.f10328 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m4435().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f10335, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f6928;
            if (dialog2 == null) {
                C5554.m10883(this, "DialogFragment ", " does not have a Dialog.");
                return;
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC8600(dialog2, rect));
        }
        m7144();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo4449() {
        this.f10338.f10281.clear();
        super.mo4449();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo4451(Bundle bundle) {
        super.mo4451(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10343);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10342);
        CalendarConstraints calendarConstraints = this.f10339;
        C3129 c3129 = new C3129();
        c3129.f10316 = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.f10240.f10269;
        long j2 = calendarConstraints.f10238.f10269;
        c3129.f10317 = Long.valueOf(calendarConstraints.f10235.f10269);
        int i = calendarConstraints.f10234;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f10239;
        c3129.f10316 = dateValidator;
        MaterialCalendar materialCalendar = this.f10357;
        Month month = materialCalendar == null ? null : materialCalendar.f10258;
        if (month != null) {
            c3129.f10317 = Long.valueOf(month.f10269);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthM7114 = Month.m7114(j);
        Month monthM71142 = Month.m7114(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c3129.f10317;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM7114, monthM71142, dateValidator2, l == null ? null : Month.m7114(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10356);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10353);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10352);
        bundle.putInt("INPUT_MODE_KEY", this.f10354);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10346);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10347);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10344);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10345);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10349);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f10348);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10333);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10332);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4454(Bundle bundle) {
        super.mo4454(bundle);
        if (bundle == null) {
            bundle = this.f6905;
        }
        this.f10343 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f10342 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10339 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10356 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10353 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f10352 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f10354 = bundle.getInt("INPUT_MODE_KEY");
        this.f10346 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10347 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f10344 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10345 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f10349 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10348 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f10333 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10332 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f10352;
        if (text == null) {
            text = m4435().getResources().getText(this.f10353);
        }
        this.f10331 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f10330 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f10355 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f10355) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m7142(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m7142(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f10337 = textView;
        final int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.f10334 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f10336 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f10334.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f10334;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC3933.m8312(context, R.drawable.material_ic_calendar_black_24dp));
        final int i2 = 0;
        stateListDrawable.addState(new int[0], AbstractC3933.m8312(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f10334.setChecked(this.f10354 != 0);
        AbstractC2270.m4244(this.f10334, null);
        m7143(this.f10334);
        m7145(this.f10334);
        final int i3 = 2;
        this.f10334.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3136 f10318;

            {
                this.f10318 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                C3136 c3136 = this.f10318;
                switch (i4) {
                    case 0:
                        Iterator it = c3136.f10350.iterator();
                        if (!it.hasNext()) {
                            c3136.m4466(false, false);
                            return;
                        } else if (it.next() != null) {
                            C2942.m6394();
                            return;
                        } else {
                            c3136.m7146().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3136.f10351.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3136.m4466(false, false);
                        return;
                    default:
                        c3136.f10329.setEnabled(c3136.m7146().mo7095());
                        c3136.f10334.toggle();
                        c3136.f10354 = c3136.f10354 != 1 ? 1 : 0;
                        c3136.m7143(c3136.f10334);
                        c3136.m7145(c3136.f10334);
                        c3136.m7144();
                        return;
                }
            }
        });
        this.f10329 = (Button) viewInflate.findViewById(R.id.confirm_button);
        boolean zMo7095 = m7146().mo7095();
        Button button = this.f10329;
        if (zMo7095) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.f10329.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f10347;
        if (charSequence != null) {
            this.f10329.setText(charSequence);
        } else {
            int i4 = this.f10346;
            if (i4 != 0) {
                this.f10329.setText(i4);
            }
        }
        CharSequence charSequence2 = this.f10345;
        if (charSequence2 != null) {
            this.f10329.setContentDescription(charSequence2);
        } else if (this.f10344 != 0) {
            this.f10329.setContentDescription(m4441().getResources().getText(this.f10344));
        }
        this.f10329.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3136 f10318;

            {
                this.f10318 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                C3136 c3136 = this.f10318;
                switch (i42) {
                    case 0:
                        Iterator it = c3136.f10350.iterator();
                        if (!it.hasNext()) {
                            c3136.m4466(false, false);
                            return;
                        } else if (it.next() != null) {
                            C2942.m6394();
                            return;
                        } else {
                            c3136.m7146().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3136.f10351.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3136.m4466(false, false);
                        return;
                    default:
                        c3136.f10329.setEnabled(c3136.m7146().mo7095());
                        c3136.f10334.toggle();
                        c3136.f10354 = c3136.f10354 != 1 ? 1 : 0;
                        c3136.m7143(c3136.f10334);
                        c3136.m7145(c3136.f10334);
                        c3136.m7144();
                        return;
                }
            }
        });
        Button button2 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f10348;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i5 = this.f10349;
            if (i5 != 0) {
                button2.setText(i5);
            }
        }
        CharSequence charSequence4 = this.f10332;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.f10333 != 0) {
            button2.setContentDescription(m4441().getResources().getText(this.f10333));
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3136 f10318;

            {
                this.f10318 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i;
                C3136 c3136 = this.f10318;
                switch (i42) {
                    case 0:
                        Iterator it = c3136.f10350.iterator();
                        if (!it.hasNext()) {
                            c3136.m4466(false, false);
                            return;
                        } else if (it.next() != null) {
                            C2942.m6394();
                            return;
                        } else {
                            c3136.m7146().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3136.f10351.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3136.m4466(false, false);
                        return;
                    default:
                        c3136.f10329.setEnabled(c3136.m7146().mo7095());
                        c3136.f10334.toggle();
                        c3136.f10354 = c3136.f10354 != 1 ? 1 : 0;
                        c3136.m7143(c3136.f10334);
                        c3136.m7145(c3136.f10334);
                        c3136.m7144();
                        return;
                }
            }
        });
        return viewInflate;
    }
}
