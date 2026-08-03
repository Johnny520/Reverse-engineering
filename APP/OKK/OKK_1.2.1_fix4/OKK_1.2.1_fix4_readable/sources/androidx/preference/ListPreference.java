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

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0318a.f601d, i2, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f1506h = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (C1121e.f4288d == null) {
                C1121e.f4288d = new C1121e(7);
            }
            this.f1514g = C1121e.f4288d;
            mo1263b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0318a.f603f, i2, 0);
        this.f1507i = AbstractC1083b.m2569c(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final CharSequence mo1265a() {
        C1121e c1121e = this.f1514g;
        if (c1121e != null) {
            return c1121e.m2639h(this);
        }
        CharSequence charSequenceM1266d = m1266d();
        CharSequence charSequenceMo1265a = super.mo1265a();
        String str = this.f1507i;
        if (str == null) {
            return charSequenceMo1265a;
        }
        if (charSequenceM1266d == null) {
            charSequenceM1266d = "";
        }
        String str2 = String.format(str, charSequenceM1266d);
        return TextUtils.equals(str2, charSequenceMo1265a) ? charSequenceMo1265a : str2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public final Object mo1264c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m1266d() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1083b.m2568b(context, C1031R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
