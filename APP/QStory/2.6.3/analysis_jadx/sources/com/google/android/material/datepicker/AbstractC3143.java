package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.appcompat.app.RunnableC0099;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3143 extends AbstractC3159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f10366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CalendarConstraints f10367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10368 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final RunnableC0099 f10369;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public RunnableC3144 f10370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f10371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final SimpleDateFormat f10372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f10373;

    public AbstractC3143(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f10371 = str;
        this.f10372 = simpleDateFormat;
        this.f10373 = textInputLayout;
        this.f10367 = calendarConstraints;
        this.f10366 = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f10369 = new RunnableC0099(this, 4, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f10371;
        if (length >= str.length() || editable.length() < this.f10368) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // com.google.android.material.internal.AbstractC3159, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f10368 = charSequence.length();
    }

    @Override // com.google.android.material.internal.AbstractC3159, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.f10367;
        TextInputLayout textInputLayout = this.f10373;
        RunnableC0099 runnableC0099 = this.f10369;
        textInputLayout.removeCallbacks(runnableC0099);
        textInputLayout.removeCallbacks(this.f10370);
        textInputLayout.setError(null);
        mo7136(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f10371.length()) {
            return;
        }
        try {
            Date date = this.f10372.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (calendarConstraints.f10239.mo7091(time)) {
                Calendar calendarM7132 = AbstractC3121.m7132(calendarConstraints.f10240.f10273);
                calendarM7132.set(5, 1);
                if (calendarM7132.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f10238;
                    int i4 = month.f10267;
                    Calendar calendarM71322 = AbstractC3121.m7132(month.f10273);
                    calendarM71322.set(5, i4);
                    if (time <= calendarM71322.getTimeInMillis()) {
                        mo7136(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            RunnableC3144 runnableC3144 = new RunnableC3144(this, time, 0);
            this.f10370 = runnableC3144;
            textInputLayout.post(runnableC3144);
        } catch (ParseException unused) {
            textInputLayout.post(runnableC0099);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo7136(Long l);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo7137();
}
