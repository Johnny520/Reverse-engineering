package p228;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p222.AbstractC7984;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8021 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22151;

    public /* synthetic */ C8021(Object obj, int i) {
        this.f22151 = i;
        this.f22150 = obj;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
        int i = this.f22151;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) {
        int i = this.f22151;
        Object obj = this.f22150;
        switch (i) {
            case 0:
                try {
                    interfaceC2963.mo6434(AbstractC7984.m13466((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC2963.mo6435(e);
                    return;
                }
                break;
            default:
                interfaceC2963.mo6434(obj);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        switch (this.f22151) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        int i = this.f22151;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        switch (this.f22151) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f22150.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m13506() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m13507() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    private final void m13508() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m13509() {
    }
}
