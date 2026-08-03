package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public SwitchPreferenceCompat(Context r4, AttributeSet r5) {
        super(r4, r5, C1031R.attr.switchPreferenceCompatStyle);
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0318a.f608k, C1031R.attr.switchPreferenceCompatStyle, 0);
        AbstractC1083b.m2569c(r42, 7, 0);
        if (r42.getString(6) != null) goto L6;
        r42.getString(1);
    L6:
        if (r42.getString(9) != null) goto L9;
        r42.getString(3);
    L9:
        if (r42.getString(8) != null) goto L11;
        r42.getString(4);
    L11:
        r42.getBoolean(5, r42.getBoolean(2, false));
        r42.recycle();
    }
}
