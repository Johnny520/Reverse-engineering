package yyds;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: yyds.ᛱᲁᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC0218 extends RemoteCallbackList {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ MultiInstanceInvalidationService f1230;

    public RemoteCallbackListC0218(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1230 = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.f1230.f370.remove((Integer) obj);
    }
}
