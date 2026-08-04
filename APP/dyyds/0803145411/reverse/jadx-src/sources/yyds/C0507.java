package yyds;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛳᛱᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0507 implements TextWatcher {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2455;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0184 f2456;

    public /* synthetic */ C0507(C0184 c0184, int i) {
        this.f2455 = i;
        this.f2456 = c0184;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m1357(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m1358(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m1359(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final void m1360(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM4341;
        String string;
        int i = this.f2455;
        C0184 c0184 = this.f2456;
        switch (i) {
            case 0:
                if (editable == null || (string = editable.toString()) == null || (strM4341 = AbstractC0473.m1314(string).toString()) == null) {
                    strM4341 = AbstractC2328.m4341(-155095136895854L);
                }
                ImageView imageView = c0184.f1054;
                if (imageView != null) {
                    imageView.setVisibility(strM4341.length() <= 0 ? 8 : 0);
                }
                c0184.m770(strM4341);
                break;
            default:
                TextView textView = c0184.f1064;
                StringBuilder sb = new StringBuilder();
                sb.append(editable != null ? editable.length() : 0);
                sb.append(AbstractC2328.m4341(-175603605734254L));
                textView.setText(sb.toString());
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f2455;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f2455;
    }
}
