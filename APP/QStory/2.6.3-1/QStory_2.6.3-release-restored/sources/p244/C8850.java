package p244;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p238.AbstractC8813;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8850 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22495;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22496;

    public /* synthetic */ C8850(Object obj, int i) {
        this.f22496 = i;
        this.f22495 = obj;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
        int i = this.f22496;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) {
        int i = this.f22496;
        Object obj = this.f22495;
        switch (i) {
            case 0:
                try {
                    interfaceC3795.mo6994(AbstractC8813.m14025((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC3795.mo6995(e);
                    return;
                }
                break;
            default:
                interfaceC3795.mo6994(obj);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        switch (this.f22496) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        int i = this.f22496;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        switch (this.f22496) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f22495.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m14065() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m14066() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    private final void m14067() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m14068() {
    }
}
