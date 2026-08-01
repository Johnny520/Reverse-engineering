package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends qz {
    public boolean a;
    public final /* synthetic */ hx b;

    public w30(hx r1) {
        this.b = r1;
        this.a = false;
    }

    @Override // defpackage.qz
    public final void a(RecyclerView r1, int r2) {
        if (r2 == 0) goto L4;
        return;
    L4:
        if (this.a == false) goto L8;
        this.a = false;
        this.b.f();
        return;
    }

    @Override // defpackage.qz
    public final void b(RecyclerView r1, int r2, int r3) {
        if (r2 != 0) goto L6;
        if (r3 != 0) goto L6;
        return;
    L6:
        this.a = true;
    }
}
