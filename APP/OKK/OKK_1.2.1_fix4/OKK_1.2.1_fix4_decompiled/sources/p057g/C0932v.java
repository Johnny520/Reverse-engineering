package p057g;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p001A0.AbstractC0040p;
import p006D.C0095d;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0932v {

    /* JADX INFO: renamed from: a */
    public final TextView f3305a;

    /* JADX INFO: renamed from: b */
    public final C0095d f3306b;

    public C0932v(TextView textView) {
        this.f3305a = textView;
        this.f3306b = new C0095d(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m2262a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f3305a.getContext().obtainStyledAttributes(attributeSet, AbstractC0550a.f1622g, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((AbstractC0040p) this.f3306b.f251b).mo128R(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
