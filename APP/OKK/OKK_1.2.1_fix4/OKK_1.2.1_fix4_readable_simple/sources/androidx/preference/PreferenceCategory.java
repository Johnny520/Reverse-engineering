package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p083u.AbstractC1083b;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context r3, AttributeSet r4) {
        super(r3, r4, AbstractC1083b.m2568b(r3, C1031R.attr.preferenceCategoryStyle, R.attr.preferenceCategoryStyle));
    }
}
