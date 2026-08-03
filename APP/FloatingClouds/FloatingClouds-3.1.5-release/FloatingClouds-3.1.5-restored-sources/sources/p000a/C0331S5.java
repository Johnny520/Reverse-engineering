package p000a;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C1094c;

/* JADX INFO: renamed from: a.S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0331S5 {

    /* JADX INFO: renamed from: a */
    public final b f1181a;

    /* JADX INFO: renamed from: a.S5$a */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final TextView f1182a;

        /* JADX INFO: renamed from: b */
        public final C0260O5 f1183b;

        /* JADX INFO: renamed from: c */
        public boolean f1184c = true;

        public a(TextView textView) {
            this.f1182a = textView;
            this.f1183b = new C0260O5(textView);
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: a */
        public final InputFilter[] mo911a(InputFilter[] inputFilterArr) {
            if (!this.f1184c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof C0260O5) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                C0260O5 c0260o5 = this.f1183b;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = c0260o5;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == c0260o5) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: b */
        public final boolean mo912b() {
            return this.f1184c;
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: c */
        public final void mo913c(boolean z) {
            if (z) {
                TextView textView = this.f1182a;
                textView.setTransformationMethod(mo915e(textView.getTransformationMethod()));
            }
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: d */
        public final void mo914d(boolean z) {
            this.f1184c = z;
            TextView textView = this.f1182a;
            textView.setTransformationMethod(mo915e(textView.getTransformationMethod()));
            textView.setFilters(mo911a(textView.getFilters()));
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: e */
        public final TransformationMethod mo915e(TransformationMethod transformationMethod) {
            return this.f1184c ? ((transformationMethod instanceof C0367U5) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0367U5(transformationMethod) : transformationMethod instanceof C0367U5 ? ((C0367U5) transformationMethod).f1376a : transformationMethod;
        }
    }

    /* JADX INFO: renamed from: a.S5$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo911a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo912b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo913c(boolean z) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo914d(boolean z) {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public TransformationMethod mo915e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a.S5$c */
    public static class c extends b {

        /* JADX INFO: renamed from: a */
        public final a f1185a;

        public c(TextView textView) {
            this.f1185a = new a(textView);
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: a */
        public final InputFilter[] mo911a(InputFilter[] inputFilterArr) {
            return !(C1094c.f4484k != null) ? inputFilterArr : this.f1185a.mo911a(inputFilterArr);
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: b */
        public final boolean mo912b() {
            return this.f1185a.f1184c;
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: c */
        public final void mo913c(boolean z) {
            if (C1094c.f4484k != null) {
                this.f1185a.mo913c(z);
            }
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: d */
        public final void mo914d(boolean z) {
            boolean z2 = C1094c.f4484k != null;
            a aVar = this.f1185a;
            if (z2) {
                aVar.mo914d(z);
            } else {
                aVar.f1184c = z;
            }
        }

        @Override // p000a.C0331S5.b
        /* JADX INFO: renamed from: e */
        public final TransformationMethod mo915e(TransformationMethod transformationMethod) {
            return !(C1094c.f4484k != null) ? transformationMethod : this.f1185a.mo915e(transformationMethod);
        }
    }

    public C0331S5(TextView textView) {
        this.f1181a = new c(textView);
    }
}
