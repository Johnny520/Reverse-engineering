package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public CheckBoxPreference(Context r4, AttributeSet r5) {
        int r02 = AbstractC1083b.m2568b(r4, C1031R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle);
        super(r4, r5, r02);
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0318a.f598a, r02, 0);
        AbstractC1083b.m2569c(r42, 5, 0);
        if (r42.getString(4) != null) goto L5;
        r42.getString(1);
    L5:
        r42.getBoolean(3, r42.getBoolean(2, false));
        r42.recycle();
    }
}
