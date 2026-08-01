package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC1041 extends android.os.RemoteCallbackList {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f4625;

    public RemoteCallbackListC1041(androidx.room.MultiInstanceInvalidationService r1) {
            r0 = this;
            r0.f4625 = r1
            r0.<init>()
            return
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(android.os.IInterface r1, java.lang.Object r2) {
            r0 = this;
            ᛴᲈᲇᛱ r1 = (defpackage.InterfaceC0801) r1
            androidx.room.MultiInstanceInvalidationService r0 = r0.f4625
            java.util.LinkedHashMap r0 = r0.f339
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.remove(r2)
            return
    }
}
