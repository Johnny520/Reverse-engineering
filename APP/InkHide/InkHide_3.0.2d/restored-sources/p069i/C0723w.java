package p069i;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p004C.C0066j;
import p006D.AbstractC0079h;
import p058d.AbstractC0515a;

/* JADX INFO: renamed from: i.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0723w {

    /* JADX INFO: renamed from: a */
    public final TextView f2447a;

    /* JADX INFO: renamed from: b */
    public final C0066j f2448b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0723w(TextView textView) {
        this.f2447a = textView;
        this.f2448b = new C0066j(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1372a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f2447a.getContext().obtainStyledAttributes(attributeSet, AbstractC0515a.f1645i, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m1374c(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1373b(boolean z2) {
        ((AbstractC0079h) this.f2448b.f312c).mo205P(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1374c(boolean z2) {
        ((AbstractC0079h) this.f2448b.f312c).mo206Q(z2);
    }
}
