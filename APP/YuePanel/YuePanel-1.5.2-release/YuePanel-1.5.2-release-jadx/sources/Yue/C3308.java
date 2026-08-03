package Yue;

import Yue.C6898;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3308 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final TextView f210;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C4623 f211;

    public C3308(@InterfaceC6391 TextView textView) {
        this.f210 = textView;
        this.f211 = new C4623(textView, false);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public InputFilter[] m376(@InterfaceC6391 InputFilter[] inputFilterArr) {
        return this.f211.m1580(inputFilterArr);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m377() {
        return this.f211.m1581();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m6766(@InterfaceC6490 AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f210.getContext().obtainStyledAttributes(attributeSet, C6898.C6909.f19438, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19453) ? typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19453, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m6768(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m6767(boolean z) {
        this.f211.m13896(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m6768(boolean z) {
        this.f211.m13897(z);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public TransformationMethod m6769(@InterfaceC6490 TransformationMethod transformationMethod) {
        return this.f211.m13899(transformationMethod);
    }
}
