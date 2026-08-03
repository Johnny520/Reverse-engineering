package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p083u.AbstractC1083b;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC1083b.m2568b(context, C1031R.attr.preferenceCategoryStyle, R.attr.preferenceCategoryStyle));
    }
}
