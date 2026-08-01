package androidx.compose.ui.text.font;

import android.util.Log;
import kotlin.coroutines.AbstractC4358;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5403;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1985 extends AbstractC4358 implements InterfaceC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5866;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1985(InterfaceC4360 interfaceC4360, int i) {
        super(interfaceC4360);
        this.f5866 = i;
    }

    @Override // kotlinx.coroutines.InterfaceC5403
    public final void handleException(InterfaceC4359 interfaceC4359, Throwable th) {
        switch (this.f5866) {
            case 0:
                break;
            default:
                Log.e("StickerUploader", "upload error", th);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m3691(InterfaceC4359 interfaceC4359, Throwable th) {
    }
}
