package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;

/* JADX INFO: renamed from: ea */
/* JADX INFO: loaded from: classes.dex */
public final class C1363ea implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageView f4871b;

    public /* synthetic */ C1363ea(ImageView imageView, int i) {
        this.f4870a = i;
        this.f4871b = imageView;
    }

    /* JADX INFO: renamed from: a */
    private final void m2643a(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2644b(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2645c(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2646d(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: e */
    private final void m2647e(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: f */
    private final void m2648f(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f4870a) {
            case 0:
                this.f4871b.setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                break;
            case 1:
                this.f4871b.setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                break;
            default:
                this.f4871b.setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f4870a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f4870a;
    }
}
