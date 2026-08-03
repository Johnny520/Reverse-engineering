package Yue;

import Yue.InterfaceC7144;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C8812;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4623 {

    /* JADX INFO: renamed from: ۥ */
    public final C0459 f1019;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ$ۥ */
    @InterfaceC7113(19)
    public static class C0458 extends C0459 {

        /* JADX INFO: renamed from: ۥ */
        public final TextView f1020;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C4616 f1021;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f9932 = true;

        public C0458(TextView textView) {
            this.f1020 = textView;
            this.f1021 = new C4616(textView);
        }

        @Override // Yue.C4623.C0459
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public InputFilter[] mo1582(@InterfaceC6391 InputFilter[] inputFilterArr) {
            return !this.f9932 ? m13906(inputFilterArr) : m13904(inputFilterArr);
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1583() {
            return this.f9932;
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo13900(boolean z) {
            if (z) {
                mo13902();
            }
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo13901(boolean z) {
            this.f9932 = z;
            mo13902();
            m13909();
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo13902() {
            this.f1020.setTransformationMethod(mo13903(this.f1020.getTransformationMethod()));
        }

        @Override // Yue.C4623.C0459
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public TransformationMethod mo13903(@InterfaceC6490 TransformationMethod transformationMethod) {
            return this.f9932 ? m13910(transformationMethod) : m13908(transformationMethod);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final InputFilter[] m13904(@InterfaceC6391 InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f1021) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f1021;
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final SparseArray<InputFilter> m13905(@InterfaceC6391 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C4616) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final InputFilter[] m13906(@InterfaceC6391 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayM13905 = m13905(inputFilterArr);
            if (sparseArrayM13905.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayM13905.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayM13905.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m13907(boolean z) {
            this.f9932 = z;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final TransformationMethod m13908(@InterfaceC6490 TransformationMethod transformationMethod) {
            return transformationMethod instanceof C4626 ? ((C4626) transformationMethod).m1586() : transformationMethod;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m13909() {
            this.f1020.setFilters(mo1582(this.f1020.getFilters()));
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final TransformationMethod m13910(@InterfaceC6490 TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C4626) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C4626(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ$ۥ۟ */
    public static class C0459 {
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public InputFilter[] mo1582(@InterfaceC6391 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1583() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo13900(boolean z) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo13901(boolean z) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo13902() {
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public TransformationMethod mo13903(@InterfaceC6490 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۧۡ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(19)
    public static class C4624 extends C0459 {

        /* JADX INFO: renamed from: ۥ */
        public final C0458 f1022;

        public C4624(TextView textView) {
            this.f1022 = new C0458(textView);
        }

        @Override // Yue.C4623.C0459
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public InputFilter[] mo1582(@InterfaceC6391 InputFilter[] inputFilterArr) {
            return m13911() ? inputFilterArr : this.f1022.mo1582(inputFilterArr);
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1583() {
            return this.f1022.mo1583();
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo13900(boolean z) {
            if (m13911()) {
                return;
            }
            this.f1022.mo13900(z);
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo13901(boolean z) {
            if (m13911()) {
                this.f1022.m13907(z);
            } else {
                this.f1022.mo13901(z);
            }
        }

        @Override // Yue.C4623.C0459
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo13902() {
            if (m13911()) {
                return;
            }
            this.f1022.mo13902();
        }

        @Override // Yue.C4623.C0459
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public TransformationMethod mo13903(@InterfaceC6490 TransformationMethod transformationMethod) {
            return m13911() ? transformationMethod : this.f1022.mo13903(transformationMethod);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m13911() {
            return !C8812.m29623();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4623(@InterfaceC6391 TextView textView) {
        this(textView, true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public InputFilter[] m1580(@InterfaceC6391 InputFilter[] inputFilterArr) {
        return this.f1019.mo1582(inputFilterArr);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1581() {
        return this.f1019.mo1583();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m13896(boolean z) {
        this.f1019.mo13900(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m13897(boolean z) {
        this.f1019.mo13901(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m13898() {
        this.f1019.mo13902();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public TransformationMethod m13899(@InterfaceC6490 TransformationMethod transformationMethod) {
        return this.f1019.mo13903(transformationMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4623(@InterfaceC6391 TextView textView, boolean z) {
        C6740.m21416(textView, "textView cannot be null");
        if (z) {
            this.f1019 = new C0458(textView);
        } else {
            this.f1019 = new C4624(textView);
        }
    }
}
