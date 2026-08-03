package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: h */
    public final CharSequence[] f1506h;

    /* JADX INFO: renamed from: i */
    public final String f1507i;

    public ListPreference(Context r5, AttributeSet r6, int r7) {
        super(r5, r6, r7);
        TypedArray r02 = r5.obtainStyledAttributes(r6, AbstractC0318a.f601d, r7, 0);
        CharSequence[] r2 = r02.getTextArray(2);
        if (r2 != null) goto L5;
        r2 = r02.getTextArray(0);
    L5:
        this.f1506h = r2;
        if (r02.getTextArray(3) != null) goto L9;
        r02.getTextArray(1);
    L9:
        if (r02.getBoolean(4, r02.getBoolean(4, false)) == true) goto L11;
    L14:
        r02.recycle();
        TypedArray r52 = r5.obtainStyledAttributes(r6, AbstractC0318a.f603f, r7, 0);
        this.f1507i = AbstractC1083b.m2569c(r52, 33, 7);
        r52.recycle();
        return;
    L11:
        if (C1121e.f4288d != null) goto L13;
        C1121e.f4288d = new C1121e(7);
    L13:
        this.f1514g = C1121e.f4288d;
        mo1263b();
        goto L14
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final CharSequence mo1265a() {
        C1121e r02 = this.f1514g;
        if (r02 != null) goto L5;
        CharSequence r03 = m1266d();
        CharSequence r1 = super.mo1265a();
        String r2 = this.f1507i;
        if (r2 != null) goto L9;
        return r1;
    L9:
        if (r03 != null) goto L11;
        r03 = "";
    L11:
        String r04 = String.format(r2, new Object[]{r03});
        if (TextUtils.equals(r04, r1) == false) goto L14;
        return r1;
    L14:
        return r04;
    L5:
        return r02.m2639h(this);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray r1, int r2) {
        return r1.getString(r2);
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m1266d() {
        return null;
    }

    public ListPreference(Context r3, AttributeSet r4) {
        this(r3, r4, AbstractC1083b.m2568b(r3, C1031R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
