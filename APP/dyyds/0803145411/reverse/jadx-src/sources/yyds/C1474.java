package yyds;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: renamed from: yyds.ᛷᛱᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1474 extends ContentObserver {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC1975 f7006;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1474(ViewOnClickListenerC1975 viewOnClickListenerC1975) {
        super(new Handler());
        this.f7006 = viewOnClickListenerC1975;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        ViewOnClickListenerC1975 viewOnClickListenerC1975 = this.f7006;
        if (!viewOnClickListenerC1975.f8084 || (cursor = viewOnClickListenerC1975.f8080) == null || cursor.isClosed()) {
            return;
        }
        viewOnClickListenerC1975.f8082 = viewOnClickListenerC1975.f8080.requery();
    }
}
