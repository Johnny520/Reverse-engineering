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

    public SeekBarPreference(Context r5, AttributeSet r6) {
        super(r5, r6, C1031R.attr.seekBarPreferenceStyle);
        TypedArray r52 = r5.obtainStyledAttributes(r6, AbstractC0318a.f606i, C1031R.attr.seekBarPreferenceStyle, 0);
        int r62 = r52.getInt(3, 0);
        int r1 = r52.getInt(1, 100);
        if (r1 >= r62) goto L6;
        r1 = r62;
    L6:
        if (r1 == this.f1515h) goto L8;
        this.f1515h = r1;
    L8:
        int r12 = r52.getInt(4, 0);
        if (r12 == this.f1516i) goto L11;
        this.f1516i = Math.min(this.f1515h - r62, Math.abs(r12));
    L11:
        r52.getBoolean(2, true);
        r52.getBoolean(5, false);
        r52.getBoolean(6, false);
        r52.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray r2, int r3) {
        return Integer.valueOf(r2.getInt(r3, 0));
    }
}
