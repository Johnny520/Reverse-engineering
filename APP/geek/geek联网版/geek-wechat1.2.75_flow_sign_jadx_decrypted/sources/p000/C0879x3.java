package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0879x3 {

    /* JADX INFO: renamed from: a */
    public final TextView f5158a;

    /* JADX INFO: renamed from: b */
    public final C0431l0 f5159b;

    public C0879x3(TextView textView) {
        this.f5158a = textView;
        this.f5159b = new C0431l0(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m2629a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f5158a.getContext().obtainStyledAttributes(attributeSet, AbstractC0205ez.f1685i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2631c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2630b(boolean z) {
        ((AbstractC0493mp) this.f5159b.f2886b).mo1876N(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m2631c(boolean z) {
        ((AbstractC0493mp) this.f5159b.f2886b).mo1877O(z);
    }
}
