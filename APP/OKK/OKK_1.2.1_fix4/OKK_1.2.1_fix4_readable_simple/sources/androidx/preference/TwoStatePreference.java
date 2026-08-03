package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public TwoStatePreference(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray r2, int r3) {
        return Boolean.valueOf(r2.getBoolean(r3, false));
    }
}
