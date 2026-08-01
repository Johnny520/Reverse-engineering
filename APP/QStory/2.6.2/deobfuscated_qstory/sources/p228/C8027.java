package p228;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.resource.bitmap.C3025;
import java.io.InputStream;
import p233.InterfaceC8076;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8027 implements InterfaceC8033, InterfaceC8076 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f22171;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22172;

    public /* synthetic */ C8027(Resources resources, int i) {
        this.f22172 = i;
        this.f22171 = resources;
    }

    @Override // p233.InterfaceC8076
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC2988 mo339(InterfaceC2988 interfaceC2988, C8396 c8396) {
        if (interfaceC2988 == null) {
            return null;
        }
        return new C3025(this.f22171, interfaceC2988);
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8032 mo316(C8026 c8026) {
        int i = this.f22172;
        Resources resources = this.f22171;
        switch (i) {
            case 0:
                return new C8022(resources, c8026.m13483(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C8022(resources, c8026.m13483(Uri.class, InputStream.class));
            default:
                return new C8022(resources, C8016.f22144);
        }
    }
}
