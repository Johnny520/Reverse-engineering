package defpackage;

/* JADX INFO: renamed from: ᛴᛶᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0691 extends defpackage.InterfaceC0503 {
    android.app.Activity getActivity();

    android.os.Bundle getArguments();

    boolean isAdded();

    boolean isRemoving();

    void requestPermissions(java.lang.String[] r1, int r2);

    void setArguments(android.os.Bundle r1);

    void setRetainInstance(boolean r1);

    @Override // defpackage.InterfaceC0503
    /* synthetic */ void startActivity(android.content.Intent r1);

    @Override // defpackage.InterfaceC0503
    /* synthetic */ void startActivityForResult(android.content.Intent r1, int r2);
}
