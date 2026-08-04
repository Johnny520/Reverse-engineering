package yyds;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᲁᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2160 implements TextWatcher {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ View f10623;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10624;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f10625;

    public /* synthetic */ C2160(C1417 c1417, View view, int i) {
        this.f10624 = i;
        this.f10625 = c1417;
        this.f10623 = view;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m4123(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m4124(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m4125(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final void m4126(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        String string2;
        int i = this.f10624;
        View view = this.f10623;
        C1417 c1417 = this.f10625;
        switch (i) {
            case 0:
                if (!c1417.f6702 && editable != null && (string = editable.toString()) != null) {
                    String string3 = AbstractC0473.m1314(string).toString();
                    Integer numValueOf = null;
                    if (string3.length() == 8) {
                        try {
                            numValueOf = Integer.valueOf((int) Long.parseLong(string3, 16));
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    if (numValueOf != null) {
                        C1509 c1509 = C1509.f7142;
                        c1509.getClass();
                        C1509.f7256.m1581(C1509.f7179[77], numValueOf);
                        c1509.getClass();
                        view.setBackgroundColor(C1509.m3079());
                        C0644.m1542();
                    }
                }
                break;
            default:
                if (!c1417.f6702 && editable != null && (string2 = editable.toString()) != null) {
                    C0644.m1543(view, string2);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f10624;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f10624;
    }
}
