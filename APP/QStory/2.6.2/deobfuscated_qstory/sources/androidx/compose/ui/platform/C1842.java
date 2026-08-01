package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.C5175;
import kotlinx.coroutines.channels.C5189;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1842 extends ContentObserver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5189 f5346;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842(C5189 c5189, Handler handler) {
        super(handler);
        this.f5346 = c5189;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f5346.mo8445(C5175.f14739);
    }
}
