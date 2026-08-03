package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public EditTextPreference(Context r4, AttributeSet r5) {
        int r02 = AbstractC1083b.m2568b(r4, C1031R.attr.editTextPreferenceStyle, R.attr.editTextPreferenceStyle);
        super(r4, r5, r02);
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0318a.f600c, r02, 0);
        if (r42.getBoolean(0, r42.getBoolean(0, false)) == true) goto L5;
    L8:
        r42.recycle();
        return;
    L5:
        if (C1121e.f4287c != null) goto L7;
        C1121e.f4287c = new C1121e(6);
    L7:
        this.f1514g = C1121e.f4287c;
        goto L8
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray r1, int r2) {
        return r1.getString(r2);
    }
}
