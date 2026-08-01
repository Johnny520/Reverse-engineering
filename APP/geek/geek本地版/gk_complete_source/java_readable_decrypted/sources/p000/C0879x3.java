package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0879x3 {

    /* JADX INFO: renamed from: a */
    public final TextView f5088a;

    /* JADX INFO: renamed from: b */
    public final C0431l0 f5089b;

    public C0879x3(TextView textView) {
        this.f5088a = textView;
        this.f5089b = new C0431l0(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m2605a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f5088a.getContext().obtainStyledAttributes(attributeSet, AbstractC0910xy.f5225i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2607c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2606b(boolean z) {
        ((a80) this.f5089b.f2980b).mo62C(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m2607c(boolean z) {
        ((a80) this.f5089b.f2980b).mo63D(z);
    }
}
