package androidx.compose.p001ui.adaptive;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            if (r2 == 0) goto L9
            java.lang.String r0 = "android.intent.extra.DOCK_STATE"
            r1 = 0
            int r0 = r2.getIntExtra(r0, r1)
        L9:
            r0 = 0
            throw r0
    }
}
