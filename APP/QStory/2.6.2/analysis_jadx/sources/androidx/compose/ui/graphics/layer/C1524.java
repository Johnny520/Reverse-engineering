package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;
import kotlin.Result;
import kotlinx.coroutines.C5443;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1524 implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5443 f4414;

    public C1524(C5443 c5443) {
        this.f4414 = c5443;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.f4414.resumeWith(Result.m8755constructorimpl(imageReader.acquireLatestImage()));
    }
}
