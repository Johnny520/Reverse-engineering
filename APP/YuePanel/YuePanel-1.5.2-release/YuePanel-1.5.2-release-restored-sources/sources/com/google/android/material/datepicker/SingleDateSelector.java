package com.google.android.material.datepicker;

import Yue.C6600;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public SingleDateSelector createFromParcel(@InterfaceC6391 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    };

    @InterfaceC6490
    private CharSequence error;

    @InterfaceC6490
    private Long selectedItem;

    @InterfaceC6490
    private SimpleDateFormat textInputFormat;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, C1980R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return C1980R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @InterfaceC6490
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @InterfaceC6391
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @InterfaceC6391
    public Collection<C6600<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @InterfaceC6391
    public String getSelectionContentDescription(@InterfaceC6391 Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        return resources.getString(C1980R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(C1980R.string.mtrl_picker_announce_current_selection_none) : DateStrings.getYearMonthDay(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @InterfaceC6391
    public String getSelectionDisplayString(@InterfaceC6391 Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(C1980R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(C1980R.string.mtrl_picker_date_header_selected, DateStrings.getYearMonthDay(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle, CalendarConstraints calendarConstraints, @InterfaceC6391 final OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(C1980R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C1980R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat defaultTextInputFormat = this.textInputFormat;
        boolean z = defaultTextInputFormat != null;
        if (!z) {
            defaultTextInputFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat = defaultTextInputFormat;
        String pattern = z ? simpleDateFormat.toPattern() : UtcDates.getDefaultTextInputHint(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l = this.selectedItem;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                SingleDateSelector.this.error = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@InterfaceC6490 Long l2) {
                if (l2 == null) {
                    SingleDateSelector.this.clearSelection();
                } else {
                    SingleDateSelector.this.select(l2.longValue());
                }
                SingleDateSelector.this.error = null;
                onSelectionChangedListener.onSelectionChanged(SingleDateSelector.this.getSelection());
            }
        });
        DateSelector.showKeyboardWithAutoHideBehavior(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@InterfaceC6490 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getSelection()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @InterfaceC6490
    public Long getSelection() {
        return this.selectedItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setSelection(Ljava/lang/Object;)V */
    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@InterfaceC6490 Long l) {
        this.selectedItem = l == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l.longValue()));
    }
}
