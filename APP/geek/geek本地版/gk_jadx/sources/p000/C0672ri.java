package p000;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ri */
/* JADX INFO: loaded from: classes.dex */
public final class C0672ri extends AbstractC0105ci {

    /* JADX INFO: renamed from: a */
    public final WeakReference f4286a;

    public C0672ri(EditText editText) {
        this.f4286a = new WeakReference(editText);
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: a */
    public final void mo690a() {
        C0709si.m2331a((EditText) this.f4286a.get(), 1);
    }
}
