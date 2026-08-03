package com.google.android.material.timepicker;

import Yue.C8273;
import Yue.InterfaceC4525;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC8871;
import com.google.android.material.C1980R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialTimePicker extends DialogInterfaceOnCancelListenerC8871 implements TimePickerView.OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";

    @InterfaceC6490
    private TimePickerPresenter activePresenter;
    private Button cancelButton;

    @InterfaceC4525
    private int clockIcon;

    @InterfaceC4525
    private int keyboardIcon;
    private MaterialButton modeButton;
    private CharSequence negativeButtonText;
    private CharSequence positiveButtonText;
    private ViewStub textInputStub;
    private TimeModel time;

    @InterfaceC6490
    private TimePickerClockPresenter timePickerClockPresenter;

    @InterfaceC6490
    private TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private CharSequence titleText;
    private final Set<View.OnClickListener> positiveButtonListeners = new LinkedHashSet();
    private final Set<View.OnClickListener> negativeButtonListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> cancelListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> dismissListeners = new LinkedHashSet();

    @InterfaceC7613
    private int titleResId = 0;

    @InterfaceC7613
    private int positiveButtonTextResId = 0;

    @InterfaceC7613
    private int negativeButtonTextResId = 0;
    private int inputMode = 0;
    private int overrideThemeResId = 0;

    public static final class Builder {

        @InterfaceC6490
        private Integer inputMode;
        private CharSequence negativeButtonText;
        private CharSequence positiveButtonText;
        private CharSequence titleText;
        private TimeModel time = new TimeModel();

        @InterfaceC7613
        private int titleTextResId = 0;

        @InterfaceC7613
        private int positiveButtonTextResId = 0;

        @InterfaceC7613
        private int negativeButtonTextResId = 0;
        private int overrideThemeResId = 0;

        @InterfaceC6391
        public MaterialTimePicker build() {
            return MaterialTimePicker.newInstance(this);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setHour(@InterfaceC5459(from = 0, m2228to = 23) int i) {
            this.time.setHourOfDay(i);
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setInputMode(int i) {
            this.inputMode = Integer.valueOf(i);
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setMinute(@InterfaceC5459(from = 0, m2228to = 59) int i) {
            this.time.setMinute(i);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@InterfaceC7613 int i) {
            this.negativeButtonTextResId = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@InterfaceC7613 int i) {
            this.positiveButtonTextResId = i;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTheme(@InterfaceC7651 int i) {
            this.overrideThemeResId = i;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i) {
            TimeModel timeModel = this.time;
            int i2 = timeModel.hour;
            int i3 = timeModel.minute;
            TimeModel timeModel2 = new TimeModel(i);
            this.time = timeModel2;
            timeModel2.setMinute(i3);
            this.time.setHourOfDay(i2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTitleText(@InterfaceC7613 int i) {
            this.titleTextResId = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@InterfaceC6490 CharSequence charSequence) {
            this.negativeButtonText = charSequence;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@InterfaceC6490 CharSequence charSequence) {
            this.positiveButtonText = charSequence;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setTitleText(@InterfaceC6490 CharSequence charSequence) {
            this.titleText = charSequence;
            return this;
        }
    }

    private Pair<Integer, Integer> dataForMode(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.keyboardIcon), Integer.valueOf(C1980R.string.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.clockIcon), Integer.valueOf(C1980R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i);
    }

    private int getThemeResId() {
        int i = this.overrideThemeResId;
        if (i != 0) {
            return i;
        }
        TypedValue typedValueResolve = MaterialAttributes.resolve(requireContext(), C1980R.attr.materialTimePickerTheme);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i, @InterfaceC6391 TimePickerView timePickerView, @InterfaceC6391 ViewStub viewStub) {
        if (i != 0) {
            if (this.timePickerTextInputPresenter == null) {
                this.timePickerTextInputPresenter = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.time);
            }
            this.timePickerTextInputPresenter.clearCheck();
            return this.timePickerTextInputPresenter;
        }
        TimePickerClockPresenter timePickerClockPresenter = this.timePickerClockPresenter;
        if (timePickerClockPresenter == null) {
            timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.time);
        }
        this.timePickerClockPresenter = timePickerClockPresenter;
        return timePickerClockPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0() {
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter instanceof TimePickerTextInputPresenter) {
            ((TimePickerTextInputPresenter) timePickerPresenter).resetChecked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC6391
    public static MaterialTimePicker newInstance(@InterfaceC6391 Builder builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable(TIME_MODEL_EXTRA, builder.time);
        if (builder.inputMode != null) {
            bundle.putInt(INPUT_MODE_EXTRA, builder.inputMode.intValue());
        }
        bundle.putInt(TITLE_RES_EXTRA, builder.titleTextResId);
        if (builder.titleText != null) {
            bundle.putCharSequence(TITLE_TEXT_EXTRA, builder.titleText);
        }
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, builder.positiveButtonTextResId);
        if (builder.positiveButtonText != null) {
            bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, builder.positiveButtonText);
        }
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, builder.negativeButtonTextResId);
        if (builder.negativeButtonText != null) {
            bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, builder.negativeButtonText);
        }
        bundle.putInt(OVERRIDE_THEME_RES_ID, builder.overrideThemeResId);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void restoreState(@InterfaceC6490 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(TIME_MODEL_EXTRA);
        this.time = timeModel;
        if (timeModel == null) {
            this.time = new TimeModel();
        }
        this.inputMode = bundle.getInt(INPUT_MODE_EXTRA, this.time.format != 1 ? 0 : 1);
        this.titleResId = bundle.getInt(TITLE_RES_EXTRA, 0);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_EXTRA);
        this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_EXTRA);
        this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA);
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID, 0);
    }

    private void updateCancelButtonVisibility() {
        Button button = this.cancelButton;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInputMode(MaterialButton materialButton) {
        if (materialButton == null || this.timePickerView == null || this.textInputStub == null) {
            return;
        }
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.hide();
        }
        TimePickerPresenter timePickerPresenterInitializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode, this.timePickerView, this.textInputStub);
        this.activePresenter = timePickerPresenterInitializeOrRetrieveActivePresenterForMode;
        timePickerPresenterInitializeOrRetrieveActivePresenterForMode.show();
        this.activePresenter.invalidate();
        Pair<Integer, Integer> pairDataForMode = dataForMode(this.inputMode);
        materialButton.setIconResource(((Integer) pairDataForMode.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairDataForMode.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean addOnCancelListener(@InterfaceC6391 DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(@InterfaceC6391 DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@InterfaceC6391 View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@InterfaceC6391 View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    @InterfaceC5459(from = 0, m2228to = 23)
    public int getHour() {
        return this.time.hour % 24;
    }

    public int getInputMode() {
        return this.inputMode;
    }

    @InterfaceC5459(from = 0, m2228to = 59)
    public int getMinute() {
        return this.time.minute;
    }

    @InterfaceC6490
    public TimePickerClockPresenter getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@InterfaceC6391 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.cancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871, androidx.fragment.app.Fragment
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    @InterfaceC6391
    public final Dialog onCreateDialog(@InterfaceC6490 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId());
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, C1980R.attr.materialTimePickerStyle, C1980R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C1980R.styleable.MaterialTimePicker, C1980R.attr.materialTimePickerStyle, C1980R.style.Widget_MaterialComponents_TimePicker);
        this.clockIcon = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialTimePicker_clockIcon, 0);
        this.keyboardIcon = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(C1980R.styleable.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(C8273.m27347(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC6391
    public final View onCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C1980R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C1980R.id.material_timepicker_view);
        this.timePickerView = timePickerView;
        timePickerView.setOnDoubleTapListener(this);
        this.textInputStub = (ViewStub) viewGroup2.findViewById(C1980R.id.material_textinput_timepicker);
        this.modeButton = (MaterialButton) viewGroup2.findViewById(C1980R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(C1980R.id.header_title);
        int i = this.titleResId;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.titleText)) {
            textView.setText(this.titleText);
        }
        updateInputMode(this.modeButton);
        Button button = (Button) viewGroup2.findViewById(C1980R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator it = MaterialTimePicker.this.positiveButtonListeners.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i2 = this.positiveButtonTextResId;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.positiveButtonText)) {
            button.setText(this.positiveButtonText);
        }
        Button button2 = (Button) viewGroup2.findViewById(C1980R.id.material_timepicker_cancel_button);
        this.cancelButton = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Iterator it = MaterialTimePicker.this.negativeButtonListeners.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i3 = this.negativeButtonTextResId;
        if (i3 != 0) {
            this.cancelButton.setText(i3);
        } else if (!TextUtils.isEmpty(this.negativeButtonText)) {
            this.cancelButton.setText(this.negativeButtonText);
        }
        updateCancelButtonVisibility();
        this.modeButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                materialTimePicker.inputMode = materialTimePicker.inputMode == 0 ? 1 : 0;
                MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
                materialTimePicker2.updateInputMode(materialTimePicker2.modeButton);
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        TimePickerView timePickerView = this.timePickerView;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.timePickerView = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@InterfaceC6391 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.dismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.inputMode = 1;
        updateInputMode(this.modeButton);
        this.timePickerTextInputPresenter.resetChecked();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@InterfaceC6391 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(TIME_MODEL_EXTRA, this.time);
        bundle.putInt(INPUT_MODE_EXTRA, this.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, this.titleResId);
        bundle.putCharSequence(TITLE_TEXT_EXTRA, this.titleText);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, this.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, this.negativeButtonText);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@InterfaceC6391 View view, @InterfaceC6490 Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.activePresenter instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new Runnable() { // from class: Yue.ۥۡ۠ۤۢ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14902.lambda$onViewCreated$0();
                }
            }, 100L);
        }
    }

    public boolean removeOnCancelListener(@InterfaceC6391 DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@InterfaceC6391 DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@InterfaceC6391 View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@InterfaceC6391 View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }

    @InterfaceC8392
    public void setActivePresenter(@InterfaceC6490 TimePickerPresenter timePickerPresenter) {
        this.activePresenter = timePickerPresenter;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        updateCancelButtonVisibility();
    }

    public void setHour(@InterfaceC5459(from = 0, m2228to = 23) int i) {
        this.time.setHour(i);
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }

    public void setMinute(@InterfaceC5459(from = 0, m2228to = 59) int i) {
        this.time.setMinute(i);
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }
}
