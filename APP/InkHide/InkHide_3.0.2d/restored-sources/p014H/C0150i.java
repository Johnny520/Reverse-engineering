package p014H;

import android.widget.EditText;
import androidx.emoji2.text.AbstractC0393h;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: H.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0150i extends AbstractC0393h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f460a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0150i(EditText editText) {
        this.f460a = new WeakReference(editText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.emoji2.text.AbstractC0393h
    /* JADX INFO: renamed from: a */
    public final void mo335a() {
        C0151j.m337a((EditText) this.f460a.get(), 1);
    }
}
