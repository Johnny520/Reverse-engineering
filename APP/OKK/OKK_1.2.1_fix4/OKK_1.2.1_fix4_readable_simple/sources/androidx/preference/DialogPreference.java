package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context r3, AttributeSet r4, int r5) {
        super(r3, r4, r5);
        TypedArray r32 = r3.obtainStyledAttributes(r4, AbstractC0318a.f599b, r5, 0);
        AbstractC1083b.m2569c(r32, 9, 0);
        AbstractC1083b.m2569c(r32, 8, 1);
        if (r32.getDrawable(6) != null) goto L5;
        r32.getDrawable(2);
    L5:
        AbstractC1083b.m2569c(r32, 11, 3);
        AbstractC1083b.m2569c(r32, 10, 4);
        r32.getResourceId(7, r32.getResourceId(5, 0));
        r32.recycle();
    }

    public DialogPreference(Context r3, AttributeSet r4) {
        this(r3, r4, AbstractC1083b.m2568b(r3, C1031R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
