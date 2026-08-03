package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import p032R.AbstractC0318a;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public PreferenceGroup(Context r3, AttributeSet r4, int r5) {
        super(r3, r4, r5);
        new Handler(Looper.getMainLooper());
        new ArrayList();
        TypedArray r32 = r3.obtainStyledAttributes(r4, AbstractC0318a.f604g, r5, 0);
        r32.getBoolean(2, r32.getBoolean(2, true));
        if (r32.hasValue(1) == true) goto L5;
    L7:
        r32.recycle();
        return;
    L5:
        if (r32.getInt(1, r32.getInt(1, Integer.MAX_VALUE)) == Integer.MAX_VALUE) goto L7;
        TextUtils.isEmpty(this.f1512e);
        goto L7
    }

    public PreferenceGroup(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }
}
