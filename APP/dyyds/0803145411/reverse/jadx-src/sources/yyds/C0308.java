package yyds;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛲᛳᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0308 implements TextWatcher {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1615;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1616;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1617;

    public native C0308(View view, C0513 c0513, Context context);

    public C0308(C1633 c1633, C0172 c0172) {
        this.f1616 = 0;
        this.f1617 = c1633;
        this.f1615 = c0172;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private final void m969(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m970(Editable editable) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m971(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m972(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private final void m973(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final void m974(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM4341;
        int i = this.f1616;
        Object obj = this.f1617;
        Object obj2 = this.f1615;
        switch (i) {
            case 0:
                break;
            case 1:
                if (editable == null || (strM4341 = editable.toString()) == null) {
                    strM4341 = AbstractC2328.m4341(-1049053924852590L);
                }
                C1807.m3581((View) obj, (View) obj2, strM4341);
                C1509.f7142.getClass();
                AbstractC2328.m4341(-26568240563054L);
                C1509.f7175.m1581(C1509.f7179[68], strM4341);
                break;
            default:
                C0513.m1361((Context) obj2, (View) obj, AbstractC0473.m1314(String.valueOf(editable)).toString());
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f1616;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C0312 c0312;
        switch (this.f1616) {
            case 0:
                C1633 c1633 = (C1633) this.f1617;
                ((TextView) c1633.f8335).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
                Object obj = ((C0172) this.f1615).f997;
                if (obj == null) {
                    AbstractC2328.m4341(-235531284415342L);
                    c0312 = null;
                } else {
                    c0312 = (C0312) obj;
                }
                AbstractC2071.m3949(c1633, c0312);
                break;
        }
    }

    public C0308(View view, View view2, C1807 c1807) {
        this.f1616 = 1;
        this.f1617 = view;
        this.f1615 = view2;
    }
}
