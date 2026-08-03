package p000a;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0490b1 {

    /* JADX INFO: renamed from: a */
    public final TextView f1821a;

    /* JADX INFO: renamed from: b */
    public final C0331S5 f1822b;

    public C0490b1(TextView textView) {
        this.f1821a = textView;
        this.f1822b = new C0331S5(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m1189a(InputFilter[] inputFilterArr) {
        return this.f1822b.f1181a.mo911a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m1190b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1821a.getContext().obtainStyledAttributes(attributeSet, C0983R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m1192d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1191c(boolean z) {
        this.f1822b.f1181a.mo913c(z);
    }

    /* JADX INFO: renamed from: d */
    public final void m1192d(boolean z) {
        this.f1822b.f1181a.mo914d(z);
    }
}
