package yyds;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᲀᛳᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1980 extends AbstractC0505 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f9918;

    public C1980(EditText editText) {
        this.f9918 = new WeakReference(editText);
    }

    @Override // yyds.AbstractC0505
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1356() {
        C0341.m1026((EditText) this.f9918.get(), 1);
    }
}
