package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class ye extends fj {
    public final /* synthetic */ int e;

    public /* synthetic */ ye(ej r1, int r2) {
        this.e = r2;
        super(r1);
    }

    @Override // defpackage.fj
    public void q() {
        switch(this.e) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ej r0 = this.b;
        r0.o = null;
        CheckableImageButton r02 = r0.g;
        r02.setOnLongClickListener(null);
        ff.M(r02, null);
    }
}
