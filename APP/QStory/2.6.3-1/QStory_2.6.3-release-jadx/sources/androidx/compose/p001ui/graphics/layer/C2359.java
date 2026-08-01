package androidx.compose.p001ui.graphics.layer;

import android.media.ImageReader;
import kotlin.Result;
import kotlinx.coroutines.C6276;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2359 implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6276 f4760;

    public C2359(C6276 c6276) {
        this.f4760 = c6276;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.f4760.resumeWith(Result.m9304constructorimpl(imageReader.acquireLatestImage()));
    }
}
