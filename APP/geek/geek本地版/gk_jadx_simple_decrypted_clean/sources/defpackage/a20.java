package defpackage;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class a20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ a20(SearchView r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        we r0 = this.b.O;
        if ((r0 instanceof e50) == false) goto L10;
        r0.b(null);
        return;
    L10:
        return;
    L8:
        this.b.s();
    }
}
