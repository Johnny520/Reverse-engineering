package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;
import kotlin.Result;
import kotlinx.coroutines.C5444;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1524 implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5444 f4415;

    public C1524(C5444 c5444) {
        this.f4415 = c5444;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.f4415.resumeWith(Result.m8745constructorimpl(imageReader.acquireLatestImage()));
    }
}
