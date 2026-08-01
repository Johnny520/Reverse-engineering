package p008E;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import p069i.ViewOnClickListenerC0667c1;

/* JADX INFO: renamed from: E.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0097a extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnClickListenerC0667c1 f383a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097a(ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1) {
        super(new Handler());
        this.f383a = viewOnClickListenerC0667c1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1 = this.f383a;
        if (!viewOnClickListenerC0667c1.f387c || (cursor = viewOnClickListenerC0667c1.f388d) == null || cursor.isClosed()) {
            return;
        }
        viewOnClickListenerC0667c1.f386b = viewOnClickListenerC0667c1.f388d.requery();
    }
}
