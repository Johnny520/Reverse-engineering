package p025N;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.AbstractC0483h;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: N.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0257h extends AbstractC0483h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f541a = 0;

    /* JADX INFO: renamed from: b */
    public final WeakReference f542b;

    public C0257h(EditText editText) {
        this.f542b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0483h
    /* JADX INFO: renamed from: a */
    public void mo686a() {
        switch (this.f541a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f542b.get();
                if (switchCompat != null) {
                    switchCompat.m1133c();
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0483h
    /* JADX INFO: renamed from: b */
    public final void mo685b() {
        switch (this.f541a) {
            case 0:
                C0258i.m687a((EditText) this.f542b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f542b.get();
                if (switchCompat != null) {
                    switchCompat.m1133c();
                }
                break;
        }
    }

    public C0257h(SwitchCompat switchCompat) {
        this.f542b = new WeakReference(switchCompat);
    }
}
