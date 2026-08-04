package yyds;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;

/* JADX INFO: renamed from: yyds.ᛴᛴᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0842 implements TextWatcher {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ ImageView f3871;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f3872;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0438 f3873;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f3874;

    public native C0842(C0172 c0172, C0172 c01722, ImageView imageView, C0438 c0438);

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    @Override // android.text.TextWatcher
    public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
}
