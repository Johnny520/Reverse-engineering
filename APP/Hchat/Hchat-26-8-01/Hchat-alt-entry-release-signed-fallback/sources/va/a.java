package va;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f14293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14294c;

    public /* synthetic */ a(android.app.Activity r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f14292a = r3
            r0.f14293b = r1
            r0.f14294c = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.f14292a
            switch(r4) {
                case 0: goto L55;
                case 1: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = "clipboard"
            android.app.Activity r0 = r3.f14293b
            java.lang.Object r4 = r0.getSystemService(r4)
            boolean r1 = r4 instanceof android.content.ClipboardManager
            if (r1 == 0) goto L14
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            goto L15
        L14:
            r4 = 0
        L15:
            if (r4 == 0) goto L22
            java.lang.String r1 = "ID"
            java.lang.String r2 = r3.f14294c
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            r4.setPrimaryClip(r1)
        L22:
            java.lang.String r4 = "已复制ID"
            r1 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
            r4.show()
            return
        L2d:
            java.lang.String r4 = "clipboard"
            android.app.Activity r0 = r3.f14293b
            java.lang.Object r4 = r0.getSystemService(r4)
            boolean r1 = r4 instanceof android.content.ClipboardManager
            if (r1 == 0) goto L3c
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            goto L3d
        L3c:
            r4 = 0
        L3d:
            if (r4 == 0) goto L4a
            java.lang.String r1 = "ID"
            java.lang.String r2 = r3.f14294c
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            r4.setPrimaryClip(r1)
        L4a:
            java.lang.String r4 = "已复制ID"
            r1 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
            r4.show()
            return
        L55:
            java.lang.String r4 = "clipboard"
            android.app.Activity r0 = r3.f14293b
            java.lang.Object r4 = r0.getSystemService(r4)
            boolean r1 = r4 instanceof android.content.ClipboardManager
            if (r1 == 0) goto L64
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            goto L65
        L64:
            r4 = 0
        L65:
            if (r4 == 0) goto L72
            java.lang.String r1 = "ID"
            java.lang.String r2 = r3.f14294c
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            r4.setPrimaryClip(r1)
        L72:
            java.lang.String r4 = "已复制ID"
            r1 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
            r4.show()
            return
    }
}
