package p000;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes.dex */
public final class C0745ti extends AbstractC0188ei {

    /* JADX INFO: renamed from: a */
    public final WeakReference f4525a;

    public C0745ti(EditText editText) {
        this.f4525a = new WeakReference(editText);
    }

    @Override // p000.AbstractC0188ei
    /* JADX INFO: renamed from: a */
    public final void mo997a() {
        C0782ui.m2476a((EditText) this.f4525a.get(), 1);
    }
}
