package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: J3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0391J3 {

    /* JADX INFO: renamed from: a */
    public final TextView f1326a;

    /* JADX INFO: renamed from: b */
    public final C0132D2 f1327b;

    public C0391J3(TextView textView) {
        this.f1326a = textView;
        this.f1327b = new C0132D2(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m828a(InputFilter[] inputFilterArr) {
        return ((AbstractC0828TB) this.f1327b.f328b).mo104m(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m829b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1326a.getContext().obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3074i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m831d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m830c(boolean z) {
        ((AbstractC0828TB) this.f1327b.f328b).mo101B(z);
    }

    /* JADX INFO: renamed from: d */
    public final void m831d(boolean z) {
        ((AbstractC0828TB) this.f1327b.f328b).mo102C(z);
    }
}
