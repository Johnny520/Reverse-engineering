package p047I0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import p056K2.C0891q;
import p172h3.C2243c;

/* JADX INFO: renamed from: I0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0733h1 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2243c f2310a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0733h1(C2243c c2243c, Handler handler) {
        super(handler);
        this.f2310a = c2243c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z5, Uri uri) {
        this.f2310a.mo4090o(C0891q.f2780a);
    }
}
