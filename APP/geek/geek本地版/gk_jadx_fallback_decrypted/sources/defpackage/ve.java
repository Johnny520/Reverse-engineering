package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ve extends android.database.DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ve(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            kr r0 = (defpackage.kr) r0
            c4 r1 = r0.z
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L14
            r0.f()
        L14:
            return
        L15:
            java.lang.Object r0 = r2.b
            e50 r0 = (defpackage.e50) r0
            r1 = 1
            r0.a = r1
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            kr r0 = (defpackage.kr) r0
            r0.dismiss()
            return
        Ld:
            java.lang.Object r0 = r2.b
            e50 r0 = (defpackage.e50) r0
            r1 = 0
            r0.a = r1
            r0.notifyDataSetInvalidated()
            return
    }
}
