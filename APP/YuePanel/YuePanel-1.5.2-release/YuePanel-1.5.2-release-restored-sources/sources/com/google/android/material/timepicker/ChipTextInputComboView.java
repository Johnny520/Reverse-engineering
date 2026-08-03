package com.google.android.material.timepicker;

import Yue.C3024;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.C1980R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final Chip chip;
    private final EditText editText;
    private TextView label;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    public class TextFormatter extends TextWatcherAdapter {
        private static final String DEFAULT_TEXT = "00";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.chip.setText(ChipTextInputComboView.this.formatText(DEFAULT_TEXT));
                return;
            }
            String text = ChipTextInputComboView.this.formatText(editable);
            Chip chip = ChipTextInputComboView.this.chip;
            if (TextUtils.isEmpty(text)) {
                text = ChipTextInputComboView.this.formatText(DEFAULT_TEXT);
            }
            chip.setText(text);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChipTextInputComboView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatText(CharSequence charSequence) {
        return TimeModel.formatText(getResources(), charSequence);
    }

    private void updateHintLocales() {
        this.editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.editText.setFilters(inputFilterArr);
    }

    @InterfaceC8392
    public CharSequence getChipText() {
        return this.chip.getText();
    }

    public TextInputLayout getTextInput() {
        return this.textInputLayout;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.chip.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateHintLocales();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.chip.setChecked(z);
        this.editText.setVisibility(z ? 0 : 4);
        this.chip.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.editText, false);
        }
    }

    public void setChipDelegate(C3024 c3024) {
        C8273.m27439(this.chip, c3024);
    }

    public void setCursorVisible(boolean z) {
        this.editText.setCursorVisible(z);
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.chip.setTag(i, obj);
    }

    public void setText(CharSequence charSequence) {
        String text = formatText(charSequence);
        this.chip.setText(text);
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.editText.removeTextChangedListener(this.watcher);
        this.editText.setText(text);
        this.editText.addTextChangedListener(this.watcher);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.chip.toggle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ChipTextInputComboView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(C1980R.layout.material_time_chip, (ViewGroup) this, false);
        this.chip = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(C1980R.layout.material_time_input, (ViewGroup) this, false);
        this.textInputLayout = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.editText = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.watcher = textFormatter;
        editText.addTextChangedListener(textFormatter);
        updateHintLocales();
        addView(chip);
        addView(textInputLayout);
        this.label = (TextView) findViewById(C1980R.id.material_label);
        editText.setId(C8273.m27331());
        C8273.m27462(this.label, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
