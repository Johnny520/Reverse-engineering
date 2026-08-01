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
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.AbstractC0994;
import androidx.compose.p001ui.text.input.C2857;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3100;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3048;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3165;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC3176;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.C6385;
import p069.AbstractC7390;
import p316.ViewOnTouchListenerC9429;
import p321.C9472;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3968<S> extends DialogInterfaceOnCancelListenerC3176 {

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public boolean f10673;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public Button f10674;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public CharSequence f10675;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public CharSequence f10676;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public CharSequence f10677;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public int f10678;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public CheckableImageButton f10679;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public C9472 f10680;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public TextView f10681;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public TextView f10682;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public AbstractC3945 f10683;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public CalendarConstraints f10684;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public DateSelector f10687;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public int f10688;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public int f10689;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public CharSequence f10690;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public int f10691;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public CharSequence f10692;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public CharSequence f10693;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public int f10694;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public CharSequence f10697;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public int f10698;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public int f10699;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public boolean f10700;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public DayViewDecorator f10701;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public MaterialCalendar f10702;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final LinkedHashSet f10695 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final LinkedHashSet f10696 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final LinkedHashSet f10686 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10685 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m7700(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC7390.m12626(context, MaterialCalendar.class.getCanonicalName(), C0328R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static int m7701(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(AbstractC3953.m7688());
        int dimensionPixelSize = resources.getDimensionPixelSize(C0328R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.f10613;
        return AbstractC0900.m703(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f10686.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f10685.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f7226;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7702(CheckableImageButton checkableImageButton) {
        this.f10679.setContentDescription(this.f10699 == 1 ? checkableImageButton.getContext().getString(C0328R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(C0328R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7703() {
        Context contextM4995 = m4995();
        int iMo7655 = this.f10688;
        if (iMo7655 == 0) {
            iMo7655 = m7705().mo7655(contextM4995);
        }
        String str = this.f10699 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4935 = m5002().m4935(str);
        AbstractC3945 abstractC3945 = abstractComponentCallbacksC3171M4935 instanceof AbstractC3945 ? (AbstractC3945) abstractComponentCallbacksC3171M4935 : null;
        if (abstractC3945 == null) {
            if (this.f10699 == 1) {
                DateSelector dateSelectorM7705 = m7705();
                CalendarConstraints calendarConstraints = this.f10684;
                C3965 c3965 = new C3965();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iMo7655);
                bundle.putParcelable("DATE_SELECTOR_KEY", dateSelectorM7705);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                c3965.m4999(bundle);
                abstractC3945 = c3965;
            } else {
                DateSelector dateSelectorM77052 = m7705();
                CalendarConstraints calendarConstraints2 = this.f10684;
                DayViewDecorator dayViewDecorator = this.f10701;
                MaterialCalendar materialCalendar = new MaterialCalendar();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iMo7655);
                bundle2.putParcelable("GRID_SELECTOR_KEY", dateSelectorM77052);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.f10580);
                materialCalendar.m4999(bundle2);
                this.f10702 = materialCalendar;
                abstractC3945 = materialCalendar;
            }
        }
        this.f10683 = abstractC3945;
        abstractC3945.mo7667(new C3967(0, this));
        this.f10681.setText((this.f10699 == 1 && m4995().getResources().getConfiguration().orientation == 2) ? this.f10675 : this.f10676);
        String strMo7659 = m7705().mo7659(m5001());
        this.f10682.setContentDescription(m7705().mo7658(m4995()));
        this.f10682.setText(strMo7659);
        AbstractC3146 abstractC3146M5002 = m5002();
        abstractC3146M5002.getClass();
        C3165 c3165 = new C3165(abstractC3146M5002);
        c3165.m4991(C0328R.id.mtrl_calendar_frame, this.f10683, str);
        if (c3165.f7201) {
            C6755.m11870("This transaction is already being added to the back stack");
        } else {
            c3165.f7200 = false;
            c3165.f7196.m4938(c3165, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m7704(CheckableImageButton checkableImageButton) {
        AbstractC0994.m1161(this.f10679, this.f10699 == 1 ? checkableImageButton.getContext().getString(C0328R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(C0328R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final DateSelector m7705() {
        if (this.f10687 == null) {
            this.f10687 = (DateSelector) this.f7250.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f10687;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Dialog mo5025() {
        Context contextM4995 = m4995();
        Context contextM49952 = m4995();
        int iMo7655 = this.f10688;
        if (iMo7655 == 0) {
            iMo7655 = m7705().mo7655(contextM49952);
        }
        Dialog dialog = new Dialog(contextM4995, iMo7655);
        Context context = dialog.getContext();
        this.f10700 = m7700(context, R.attr.windowFullscreen);
        this.f10680 = new C9472(context, null, C0328R.attr.materialCalendarStyle, C0328R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC9490.f24782, C0328R.attr.materialCalendarStyle, C0328R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10680.m14897(context);
        this.f10680.m14900(ColorStateList.valueOf(color));
        this.f10680.m14899(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176, androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5008() {
        super.mo5008();
        Dialog dialog = this.f7273;
        if (dialog == null) {
            C6385.m11442(this, "DialogFragment ", " does not have a Dialog.");
            return;
        }
        Window window = dialog.getWindow();
        if (this.f10700) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f10680);
            if (!this.f10673) {
                View viewFindViewById = m4994().findViewById(C0328R.id.fullscreen_header);
                ColorStateList colorStateListM8879 = AbstractC4765.m8879(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM8879 != null ? Integer.valueOf(colorStateListM8879.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                Integer numM10605 = AbstractC5894.m10605(window.getContext(), R.attr.colorBackground);
                int iIntValue = numM10605 != null ? numM10605.intValue() : -16777216;
                if (z) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                AbstractC3100.m4790(window, false);
                window.getContext();
                window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(0);
                }
                new C3048(window, window.getDecorView()).f6843.mo4573(AbstractC5894.m10602(0) || AbstractC5894.m10602(numValueOf.intValue()));
                new C3048(window, window.getDecorView()).f6843.mo4574(AbstractC5894.m10602(0) || AbstractC5894.m10602(iIntValue));
                C2857 c2857 = new C2857(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                AbstractC3026.m4564(viewFindViewById, c2857);
                this.f10673 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m4995().getResources().getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f10680, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f7273;
            if (dialog2 == null) {
                C6385.m11442(this, "DialogFragment ", " does not have a Dialog.");
                return;
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC9429(dialog2, rect));
        }
        m7703();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176, androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5009() {
        this.f10683.f10626.clear();
        super.mo5009();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176, androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo5011(Bundle bundle) {
        super.mo5011(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10688);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10687);
        CalendarConstraints calendarConstraints = this.f10684;
        C3961 c3961 = new C3961();
        c3961.f10661 = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.f10585.f10614;
        long j2 = calendarConstraints.f10583.f10614;
        c3961.f10662 = Long.valueOf(calendarConstraints.f10580.f10614);
        int i = calendarConstraints.f10579;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f10584;
        c3961.f10661 = dateValidator;
        MaterialCalendar materialCalendar = this.f10702;
        Month month = materialCalendar == null ? null : materialCalendar.f10603;
        if (month != null) {
            c3961.f10662 = Long.valueOf(month.f10614);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthM7673 = Month.m7673(j);
        Month monthM76732 = Month.m7673(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c3961.f10662;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM7673, monthM76732, dateValidator2, l == null ? null : Month.m7673(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10701);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10698);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10697);
        bundle.putInt("INPUT_MODE_KEY", this.f10699);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10691);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10692);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10689);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10690);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10694);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f10693);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10678);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10677);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3176, androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5014(Bundle bundle) {
        super.mo5014(bundle);
        if (bundle == null) {
            bundle = this.f7250;
        }
        this.f10688 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f10687 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10684 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10701 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10698 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f10697 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f10699 = bundle.getInt("INPUT_MODE_KEY");
        this.f10691 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10692 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f10689 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10690 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f10694 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10693 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f10678 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10677 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f10697;
        if (text == null) {
            text = m4995().getResources().getText(this.f10698);
        }
        this.f10676 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f10675 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo5015(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f10700 ? C0328R.layout.mtrl_picker_fullscreen : C0328R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f10700) {
            viewInflate.findViewById(C0328R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m7701(context), -2));
        } else {
            viewInflate.findViewById(C0328R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m7701(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(C0328R.id.mtrl_picker_header_selection_text);
        this.f10682 = textView;
        final int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.f10679 = (CheckableImageButton) viewInflate.findViewById(C0328R.id.mtrl_picker_header_toggle);
        this.f10681 = (TextView) viewInflate.findViewById(C0328R.id.mtrl_picker_title_text);
        this.f10679.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f10679;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC4765.m8871(context, C0328R.drawable.material_ic_calendar_black_24dp));
        final int i2 = 0;
        stateListDrawable.addState(new int[0], AbstractC4765.m8871(context, C0328R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f10679.setChecked(this.f10699 != 0);
        AbstractC3103.m4804(this.f10679, null);
        m7702(this.f10679);
        m7704(this.f10679);
        final int i3 = 2;
        this.f10679.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3968 f10663;

            {
                this.f10663 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                C3968 c3968 = this.f10663;
                switch (i4) {
                    case 0:
                        Iterator it = c3968.f10695.iterator();
                        if (!it.hasNext()) {
                            c3968.m5026(false, false);
                            return;
                        } else if (it.next() != null) {
                            C3775.m6954();
                            return;
                        } else {
                            c3968.m7705().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3968.f10696.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3968.m5026(false, false);
                        return;
                    default:
                        c3968.f10674.setEnabled(c3968.m7705().mo7654());
                        c3968.f10679.toggle();
                        c3968.f10699 = c3968.f10699 != 1 ? 1 : 0;
                        c3968.m7702(c3968.f10679);
                        c3968.m7704(c3968.f10679);
                        c3968.m7703();
                        return;
                }
            }
        });
        this.f10674 = (Button) viewInflate.findViewById(C0328R.id.confirm_button);
        boolean zMo7654 = m7705().mo7654();
        Button button = this.f10674;
        if (zMo7654) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.f10674.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f10692;
        if (charSequence != null) {
            this.f10674.setText(charSequence);
        } else {
            int i4 = this.f10691;
            if (i4 != 0) {
                this.f10674.setText(i4);
            }
        }
        CharSequence charSequence2 = this.f10690;
        if (charSequence2 != null) {
            this.f10674.setContentDescription(charSequence2);
        } else if (this.f10689 != 0) {
            this.f10674.setContentDescription(m5001().getResources().getText(this.f10689));
        }
        this.f10674.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3968 f10663;

            {
                this.f10663 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                C3968 c3968 = this.f10663;
                switch (i42) {
                    case 0:
                        Iterator it = c3968.f10695.iterator();
                        if (!it.hasNext()) {
                            c3968.m5026(false, false);
                            return;
                        } else if (it.next() != null) {
                            C3775.m6954();
                            return;
                        } else {
                            c3968.m7705().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3968.f10696.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3968.m5026(false, false);
                        return;
                    default:
                        c3968.f10674.setEnabled(c3968.m7705().mo7654());
                        c3968.f10679.toggle();
                        c3968.f10699 = c3968.f10699 != 1 ? 1 : 0;
                        c3968.m7702(c3968.f10679);
                        c3968.m7704(c3968.f10679);
                        c3968.m7703();
                        return;
                }
            }
        });
        Button button2 = (Button) viewInflate.findViewById(C0328R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f10693;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i5 = this.f10694;
            if (i5 != 0) {
                button2.setText(i5);
            }
        }
        CharSequence charSequence4 = this.f10677;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.f10678 != 0) {
            button2.setContentDescription(m5001().getResources().getText(this.f10678));
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.飘花落叶言子楪兰世哲苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3968 f10663;

            {
                this.f10663 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i;
                C3968 c3968 = this.f10663;
                switch (i42) {
                    case 0:
                        Iterator it = c3968.f10695.iterator();
                        if (!it.hasNext()) {
                            c3968.m5026(false, false);
                            return;
                        } else if (it.next() != null) {
                            C3775.m6954();
                            return;
                        } else {
                            c3968.m7705().getClass();
                            throw null;
                        }
                    case 1:
                        Iterator it2 = c3968.f10696.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        c3968.m5026(false, false);
                        return;
                    default:
                        c3968.f10674.setEnabled(c3968.m7705().mo7654());
                        c3968.f10679.toggle();
                        c3968.f10699 = c3968.f10699 != 1 ? 1 : 0;
                        c3968.m7702(c3968.f10679);
                        c3968.m7704(c3968.f10679);
                        c3968.m7703();
                        return;
                }
            }
        });
        return viewInflate;
    }
}
