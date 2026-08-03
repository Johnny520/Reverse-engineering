package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public MultiSelectListPreference(Context r4, AttributeSet r5) {
        int r02 = AbstractC1083b.m2568b(r4, C1031R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle);
        super(r4, r5, r02);
        new HashSet();
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0318a.f602e, r02, 0);
        if (r42.getTextArray(2) != null) goto L6;
        r42.getTextArray(0);
    L6:
        if (r42.getTextArray(3) != null) goto L8;
        r42.getTextArray(1);
    L8:
        r42.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray r4, int r5) {
        CharSequence[] r42 = r4.getTextArray(r5);
        HashSet r52 = new HashSet();
        int r02 = r42.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        r52.add(r42[r1].toString());
        r1 = r1 + 1;
        goto L3
    L5:
        return r52;
    }
}
