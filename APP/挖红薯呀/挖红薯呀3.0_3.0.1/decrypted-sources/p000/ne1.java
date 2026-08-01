package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0834vb f4247a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(C0834vb c0834vb, Handler handler) {
        super(handler);
        this.f4247a = c0834vb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f4247a.mo1710s(na1.f4229a);
    }
}
