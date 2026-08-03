package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import io.github.cherrywechat.R;
import p000.RunnableC1311d8;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    public final Chip f4669a;

    /* JADX INFO: renamed from: b */
    public final EditText f4670b;

    public ChipTextInputComboView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        LayoutInflater r42 = LayoutInflater.from(r4);
        Chip r52 = (Chip) r42.inflate(R.layout.material_time_chip, this, false);
        this.f4669a = r52;
        r52.setAccessibilityClassName("android.view.View");
        TextInputLayout r43 = (TextInputLayout) r42.inflate(R.layout.material_time_input, this, false);
        EditText r1 = r43.getEditText();
        this.f4670b = r1;
        r1.setVisibility(4);
        r1.addTextChangedListener(new C1279a(this));
        r1.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(r52);
        addView(r43);
        TextView r44 = (TextView) findViewById(R.id.material_label);
        r1.setId(View.generateViewId());
        r44.setLabelFor(r1.getId());
        r1.setSaveEnabled(false);
        r1.setLongClickable(false);
    }

    /* JADX INFO: renamed from: a */
    public static String m2504a(ChipTextInputComboView r1, CharSequence r2) {
        return String.format(r1.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(r2)))});
    L5:
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4669a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r2) {
        super.onConfigurationChanged(r2);
        LocaleList r22 = getContext().getResources().getConfiguration().getLocales();
        this.f4670b.setImeHintLocales(r22);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean r5) {
        Chip r0 = this.f4669a;
        r0.setChecked(r5);
        int r1 = 0;
        if (r5 == false) goto L5;
        int r2 = 0;
    L6:
        EditText r3 = this.f4670b;
        r3.setVisibility(r2);
        if (r5 == false) goto L9;
        r1 = 8;
    L9:
        r0.setVisibility(r1);
        if (r0.isChecked() == false) goto L13;
        r3.requestFocus();
        r3.post(new RunnableC1311d8(r3, 2));
        return;
    L13:
        return;
    L5:
        r2 = 4;
        goto L6
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener r2) {
        this.f4669a.setOnClickListener(r2);
    }

    @Override // android.view.View
    public final void setTag(int r2, Object r3) {
        this.f4669a.setTag(r2, r3);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f4669a.toggle();
    }
}
