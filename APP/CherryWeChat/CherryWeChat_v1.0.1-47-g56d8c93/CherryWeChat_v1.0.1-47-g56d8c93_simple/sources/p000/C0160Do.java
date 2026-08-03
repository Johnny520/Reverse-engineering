package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: Do */
/* JADX INFO: loaded from: classes.dex */
public final class C0160Do extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f436b;

    public /* synthetic */ C0160Do(int r1, Object r2) {
        this.f435a = r1;
        this.f436b = r2;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch(this.f435a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0230FE) this.f436b).m455e();
        return;
    L6:
        C0289Go r0 = (C0289Go) this.f436b;
        if (r0.f962z.isShowing() == false) goto L10;
        r0.mo577c();
        return;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch(this.f435a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0230FE) this.f436b).m455e();
        return;
    L6:
        ((C0289Go) this.f436b).dismiss();
    }
}
