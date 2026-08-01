package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ve extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        kr r0 = (kr) this.b;
        if (r0.z.isShowing() == false) goto L10;
        r0.f();
        return;
    L10:
        return;
    L8:
        e50 r02 = (e50) this.b;
        r02.a = true;
        r02.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((kr) this.b).dismiss();
        return;
    L6:
        e50 r0 = (e50) this.b;
        r0.a = false;
        r0.notifyDataSetInvalidated();
    }
}
