package androidx.compose.p001ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.C6008;
import kotlinx.coroutines.channels.C6022;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2677 extends ContentObserver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6022 f5692;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2677(C6022 c6022, Handler handler) {
        super(handler);
        this.f5692 = c6022;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f5692.mo8995(C6008.f15084);
    }
}
