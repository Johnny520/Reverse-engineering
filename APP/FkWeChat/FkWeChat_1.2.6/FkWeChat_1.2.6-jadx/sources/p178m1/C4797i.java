package p178m1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: m1.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4797i {

    /* JADX INFO: renamed from: a */
    public static final C4797i f14274a = new C4797i();

    /* JADX INFO: renamed from: A */
    public final void m19212A(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    /* JADX INFO: renamed from: B */
    public final void m19213B(ViewStructure viewStructure, int i10) {
        viewStructure.setVisibility(i10);
    }

    /* JADX INFO: renamed from: C */
    public final CharSequence m19214C(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    /* JADX INFO: renamed from: a */
    public final int m19215a(ViewStructure viewStructure, int i10) {
        return viewStructure.addChildCount(i10);
    }

    /* JADX INFO: renamed from: b */
    public final AutofillValue m19216b(String str) {
        return AutofillValue.forText(str);
    }

    /* JADX INFO: renamed from: c */
    public final AutofillValue m19217c(boolean z10) {
        return AutofillValue.forToggle(z10);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19218d(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19219e(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19220f(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19221g(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    /* JADX INFO: renamed from: h */
    public final ViewStructure m19222h(ViewStructure viewStructure, int i10) {
        return viewStructure.newChild(i10);
    }

    /* JADX INFO: renamed from: i */
    public final void m19223i(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: j */
    public final void m19224j(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    /* JADX INFO: renamed from: k */
    public final void m19225k(ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    /* JADX INFO: renamed from: l */
    public final void m19226l(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    /* JADX INFO: renamed from: m */
    public final void m19227m(ViewStructure viewStructure, boolean z10) {
        viewStructure.setCheckable(z10);
    }

    /* JADX INFO: renamed from: n */
    public final void m19228n(ViewStructure viewStructure, boolean z10) {
        viewStructure.setChecked(z10);
    }

    /* JADX INFO: renamed from: o */
    public final void m19229o(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    /* JADX INFO: renamed from: p */
    public final void m19230p(ViewStructure viewStructure, boolean z10) {
        viewStructure.setClickable(z10);
    }

    /* JADX INFO: renamed from: q */
    public final void m19231q(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: r */
    public final void m19232r(ViewStructure viewStructure, boolean z10) {
        viewStructure.setDataIsSensitive(z10);
    }

    /* JADX INFO: renamed from: s */
    public final void m19233s(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    /* JADX INFO: renamed from: t */
    public final void m19234t(ViewStructure viewStructure, boolean z10) {
        viewStructure.setEnabled(z10);
    }

    /* JADX INFO: renamed from: u */
    public final void m19235u(ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocusable(z10);
    }

    /* JADX INFO: renamed from: v */
    public final void m19236v(ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocused(z10);
    }

    /* JADX INFO: renamed from: w */
    public final void m19237w(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        viewStructure.setId(i10, str, str2, str3);
    }

    /* JADX INFO: renamed from: x */
    public final void m19238x(ViewStructure viewStructure, int i10) {
        viewStructure.setInputType(i10);
    }

    /* JADX INFO: renamed from: y */
    public final void m19239y(ViewStructure viewStructure, boolean z10) {
        viewStructure.setLongClickable(z10);
    }

    /* JADX INFO: renamed from: z */
    public final void m19240z(ViewStructure viewStructure, boolean z10) {
        viewStructure.setSelected(z10);
    }
}
