package p025N;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.AbstractC0483h;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: N.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0257h extends AbstractC0483h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f541a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f542b;

    public C0257h(EditText r2) {
        this.f541a = 0;
        this.f542b = new WeakReference(r2);
    }

    @Override // androidx.emoji2.text.AbstractC0483h
    /* JADX INFO: renamed from: a */
    public void mo686a() {
        switch(this.f541a) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        SwitchCompat r02 = (SwitchCompat) this.f542b.get();
        if (r02 == null) goto L9;
        r02.m1133c();
        return;
    }

    @Override // androidx.emoji2.text.AbstractC0483h
    /* JADX INFO: renamed from: b */
    public final void mo685b() {
        switch(this.f541a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        SwitchCompat r02 = (SwitchCompat) this.f542b.get();
        if (r02 == null) goto L10;
        r02.m1133c();
        return;
    L10:
        return;
    L8:
        C0258i.m687a((EditText) this.f542b.get(), 1);
    }

    public C0257h(SwitchCompat r2) {
        this.f541a = 1;
        this.f542b = new WeakReference(r2);
    }
}
