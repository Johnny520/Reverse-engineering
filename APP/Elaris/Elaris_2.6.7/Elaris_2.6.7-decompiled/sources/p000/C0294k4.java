package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: k4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0294k4 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0209f2 f491a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0294k4(C0209f2 c0209f2) {
        this.f491a = c0209f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C0209f2 c0209f2 = this.f491a;
        if (AbstractC0449s4.m895n(c0209f2, false)) {
            return;
        }
        AbstractC0449s4.m887f(c0209f2, "input_changed");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
