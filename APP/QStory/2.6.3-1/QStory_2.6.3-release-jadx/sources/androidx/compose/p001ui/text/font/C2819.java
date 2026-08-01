package androidx.compose.p001ui.text.font;

import android.util.Log;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlinx.coroutines.InterfaceC6236;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2819 extends AbstractC5191 implements InterfaceC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6212;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2819(InterfaceC5193 interfaceC5193, int i) {
        super(interfaceC5193);
        this.f6212 = i;
    }

    @Override // kotlinx.coroutines.InterfaceC6236
    public final void handleException(InterfaceC5192 interfaceC5192, Throwable th) {
        switch (this.f6212) {
            case 0:
                break;
            default:
                Log.e("StickerUploader", "upload error", th);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m4261(InterfaceC5192 interfaceC5192, Throwable th) {
    }
}
