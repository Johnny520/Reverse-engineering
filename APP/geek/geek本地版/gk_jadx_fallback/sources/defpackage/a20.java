package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a20 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.widget.SearchView b;

    public /* synthetic */ a20(androidx.appcompat.widget.SearchView r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.SearchView r0 = r2.b
            we r0 = r0.O
            boolean r1 = r0 instanceof defpackage.e50
            if (r1 == 0) goto L11
            r1 = 0
            r0.b(r1)
        L11:
            return
        L12:
            androidx.appcompat.widget.SearchView r0 = r2.b
            r0.s()
            return
    }
}
