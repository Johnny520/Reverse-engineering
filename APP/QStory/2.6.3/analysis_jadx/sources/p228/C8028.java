package p228;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.resource.bitmap.C3026;
import java.io.InputStream;
import p233.InterfaceC8077;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8028 implements InterfaceC8034, InterfaceC8077 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f22168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22169;

    public /* synthetic */ C8028(Resources resources, int i) {
        this.f22169 = i;
        this.f22168 = resources;
    }

    @Override // p233.InterfaceC8077
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC2989 mo340(InterfaceC2989 interfaceC2989, C8397 c8397) {
        if (interfaceC2989 == null) {
            return null;
        }
        return new C3026(this.f22168, interfaceC2989);
    }

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8033 mo317(C8027 c8027) {
        int i = this.f22169;
        Resources resources = this.f22168;
        switch (i) {
            case 0:
                return new C8023(resources, c8027.m13511(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C8023(resources, c8027.m13511(Uri.class, InputStream.class));
            default:
                return new C8023(resources, C8017.f22141);
        }
    }
}
