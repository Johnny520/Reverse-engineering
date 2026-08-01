package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.appcompat.app.RunnableC0099;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3158;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3142 extends AbstractC3158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f10361;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CalendarConstraints f10362;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10363 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final RunnableC0099 f10364;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public RunnableC3143 f10365;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f10366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final SimpleDateFormat f10367;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f10368;

    public AbstractC3142(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f10366 = str;
        this.f10367 = simpleDateFormat;
        this.f10368 = textInputLayout;
        this.f10362 = calendarConstraints;
        this.f10361 = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f10364 = new RunnableC0099(this, 4, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f10366;
        if (length >= str.length() || editable.length() < this.f10363) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // com.google.android.material.internal.AbstractC3158, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f10363 = charSequence.length();
    }

    @Override // com.google.android.material.internal.AbstractC3158, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.f10362;
        TextInputLayout textInputLayout = this.f10368;
        RunnableC0099 runnableC0099 = this.f10364;
        textInputLayout.removeCallbacks(runnableC0099);
        textInputLayout.removeCallbacks(this.f10365);
        textInputLayout.setError(null);
        mo7149(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f10366.length()) {
            return;
        }
        try {
            Date date = this.f10367.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (calendarConstraints.f10234.mo7104(time)) {
                Calendar calendarM7145 = AbstractC3120.m7145(calendarConstraints.f10235.f10268);
                calendarM7145.set(5, 1);
                if (calendarM7145.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f10233;
                    int i4 = month.f10262;
                    Calendar calendarM71452 = AbstractC3120.m7145(month.f10268);
                    calendarM71452.set(5, i4);
                    if (time <= calendarM71452.getTimeInMillis()) {
                        mo7149(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            RunnableC3143 runnableC3143 = new RunnableC3143(this, time, 0);
            this.f10365 = runnableC3143;
            textInputLayout.post(runnableC3143);
        } catch (ParseException unused) {
            textInputLayout.post(runnableC0099);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo7149(Long l);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo7150();
}
