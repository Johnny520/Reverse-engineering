package p259r9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import gg.C1423s;

/* JADX INFO: renamed from: r9.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3750c0 implements TextWatcher {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1423s f12167g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextView f12168h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ EditText f12169i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ EditText f12170j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3750c0(C1423s c1423s, TextView textView, EditText editText, EditText editText2) {
        this.f12167g = c1423s;
        this.f12168h = textView;
        this.f12169i = editText;
        this.f12170j = editText2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        this.f12167g.f4736g = -1;
        this.f12168h.setText("搜索结果: " + C3752d0.m7770I0(this.f12169i, this.f12170j).size());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
