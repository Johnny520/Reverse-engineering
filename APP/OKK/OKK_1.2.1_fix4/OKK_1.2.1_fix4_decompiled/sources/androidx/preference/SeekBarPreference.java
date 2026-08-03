package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: h */
    public final int f1515h;

    /* JADX INFO: renamed from: i */
    public final int f1516i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0318a.f606i, C1031R.attr.seekBarPreferenceStyle, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.f1515h) {
            this.f1515h = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f1516i) {
            this.f1516i = Math.min(this.f1515h - i2, Math.abs(i4));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }
}
