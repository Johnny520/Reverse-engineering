package p357y1;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import p276sf.C3967n;
import sg.C3971c;

/* JADX INFO: renamed from: y1.u2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5941u2 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3971c f24157a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5941u2(C3971c c3971c, Handler handler) {
        super(handler);
        this.f24157a = c3971c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z9, Uri uri) {
        this.f24157a.mo8208p(C3967n.f12976a);
    }
}
