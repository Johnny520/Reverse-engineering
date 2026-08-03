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
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p081s0.RunnableC1078l;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    public final Chip f2515a;

    /* JADX INFO: renamed from: b */
    public final EditText f2516b;

    public ChipTextInputComboView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        LayoutInflater r42 = LayoutInflater.from(r4);
        Chip r52 = (Chip) r42.inflate(C1031R.layout.material_time_chip, this, false);
        this.f2515a = r52;
        r52.setAccessibilityClassName("android.view.View");
        TextInputLayout r43 = (TextInputLayout) r42.inflate(C1031R.layout.material_time_input, this, false);
        EditText r1 = r43.getEditText();
        this.f2516b = r1;
        r1.setVisibility(4);
        r1.addTextChangedListener(new C0723a(this));
        r1.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(r52);
        addView(r43);
        TextView r44 = (TextView) findViewById(C1031R.id.material_label);
        Field r53 = AbstractC0080Q.f219a;
        r1.setId(View.generateViewId());
        r44.setLabelFor(r1.getId());
        r1.setSaveEnabled(false);
        r1.setLongClickable(false);
    }

    /* JADX INFO: renamed from: a */
    public static String m1911a(ChipTextInputComboView r1, CharSequence r2) {
        return String.format(r1.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(r2)))});
    L5:
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2515a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r2) {
        super.onConfigurationChanged(r2);
        LocaleList r22 = getContext().getResources().getConfiguration().getLocales();
        this.f2516b.setImeHintLocales(r22);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean r5) {
        Chip r02 = this.f2515a;
        r02.setChecked(r5);
        int r1 = 0;
        if (r5 == false) goto L5;
        int r2 = 0;
    L6:
        final EditText r3 = this.f2516b;
        r3.setVisibility(r2);
        if (r5 == false) goto L9;
        r1 = 8;
    L9:
        r02.setVisibility(r1);
        if (r02.isChecked() == false) goto L13;
        r3.requestFocus();
        r3.post(new RunnableC1078l(r3));
        return;
    L13:
        return;
    L5:
        r2 = 4;
        goto L6
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener r2) {
        this.f2515a.setOnClickListener(r2);
    }

    @Override // android.view.View
    public final void setTag(int r2, Object r3) {
        this.f2515a.setTag(r2, r3);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f2515a.toggle();
    }
}
