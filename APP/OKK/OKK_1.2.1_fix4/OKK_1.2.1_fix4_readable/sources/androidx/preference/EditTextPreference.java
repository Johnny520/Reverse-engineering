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
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM2568b = AbstractC1083b.m2568b(context, C1031R.attr.editTextPreferenceStyle, R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM2568b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0318a.f600c, iM2568b, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C1121e.f4287c == null) {
                C1121e.f4287c = new C1121e(6);
            }
            this.f1514g = C1121e.f4287c;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
