package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ri extends ci {
    public final WeakReference a;

    public ri(EditText r2) {
        this.a = new WeakReference(r2);
    }

    @Override // defpackage.ci
    public final void a() {
        si.a((EditText) this.a.get(), 1);
    }
}
