package p244;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.resource.bitmap.C3858;
import java.io.InputStream;
import p249.InterfaceC8906;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8857 implements InterfaceC8863, InterfaceC8906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f22513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22514;

    public /* synthetic */ C8857(Resources resources, int i) {
        this.f22514 = i;
        this.f22513 = resources;
    }

    @Override // p249.InterfaceC8906
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC3821 mo900(InterfaceC3821 interfaceC3821, C9226 c9226) {
        if (interfaceC3821 == null) {
            return null;
        }
        return new C3858(this.f22513, interfaceC3821);
    }

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8862 mo877(C8856 c8856) {
        int i = this.f22514;
        Resources resources = this.f22513;
        switch (i) {
            case 0:
                return new C8852(resources, c8856.m14070(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C8852(resources, c8856.m14070(Uri.class, InputStream.class));
            default:
                return new C8852(resources, C8846.f22486);
        }
    }
}
