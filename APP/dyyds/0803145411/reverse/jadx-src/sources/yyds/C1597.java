package yyds;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/* JADX INFO: renamed from: yyds.ᛷᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1597 extends Toast implements InterfaceC1215 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public TextView f8148;

    @Override // android.widget.Toast, yyds.InterfaceC1215
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        TextView textView = this.f8148;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // android.widget.Toast, yyds.InterfaceC1215
    public final void setView(View view) {
        super.setView(view);
        if (view == null) {
            this.f8148 = null;
        } else {
            this.f8148 = InterfaceC1215.m2474(view);
        }
    }
}
