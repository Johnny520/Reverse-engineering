package androidx.compose.ui.text.font;

import android.util.Log;
import kotlin.coroutines.AbstractC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlinx.coroutines.InterfaceC5404;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1985 extends AbstractC4359 implements InterfaceC5404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5867;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1985(InterfaceC4361 interfaceC4361, int i) {
        super(interfaceC4361);
        this.f5867 = i;
    }

    @Override // kotlinx.coroutines.InterfaceC5404
    public final void handleException(InterfaceC4360 interfaceC4360, Throwable th) {
        switch (this.f5867) {
            case 0:
                break;
            default:
                Log.e("StickerUploader", "upload error", th);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m3701(InterfaceC4360 interfaceC4360, Throwable th) {
    }
}
