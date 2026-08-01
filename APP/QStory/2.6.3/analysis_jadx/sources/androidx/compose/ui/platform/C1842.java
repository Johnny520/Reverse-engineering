package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.C5176;
import kotlinx.coroutines.channels.C5190;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1842 extends ContentObserver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5190 f5347;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842(C5190 c5190, Handler handler) {
        super(handler);
        this.f5347 = c5190;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f5347.mo8436(C5176.f14739);
    }
}
