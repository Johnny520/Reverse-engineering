package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AlertController f809a;
    public final /* synthetic */ androidx.appcompat.app.AlertController.b b;

    public a(androidx.appcompat.app.AlertController.b r1, androidx.appcompat.app.AlertController r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f809a = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.app.AlertController$b r1 = r0.b
            android.content.DialogInterface$OnClickListener r2 = r1.h
            androidx.appcompat.app.AlertController r4 = r0.f809a
            androidx.appcompat.app.b r5 = r4.b
            r2.onClick(r5, r3)
            boolean r1 = r1.i
            if (r1 != 0) goto L14
            androidx.appcompat.app.b r1 = r4.b
            r1.dismiss()
        L14:
            return
    }
}
