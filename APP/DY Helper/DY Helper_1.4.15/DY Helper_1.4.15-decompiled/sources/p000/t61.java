package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t61 implements android.view.View.OnLongClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10211;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f10212;

    public /* synthetic */ t61(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10211 = r1
            r0.f10212 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f10211
            java.lang.Object r2 = r2.f10212
            switch(r3) {
                case 0: goto L36;
                case 1: goto L30;
                default: goto L7;
            }
        L7:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = "clipboard"
            java.lang.Object r3 = r2.getSystemService(r3)
            boolean r0 = r3 instanceof android.content.ClipboardManager
            if (r0 == 0) goto L16
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 == 0) goto L24
            java.lang.String r0 = "DYHelper群组"
            java.lang.String r1 = "DYHelper群组https://t.me/MFDYHelper"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r1)
            r3.setPrimaryClip(r0)
        L24:
            java.lang.String r3 = "群组链接已复制"
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L2e:
            r2 = 1
            return r2
        L30:
            p70 r2 = (p000.p70) r2
            r2.invoke()
            goto L2e
        L36:
            p70 r2 = (p000.p70) r2
            r2.invoke()
            goto L2e
    }
}
