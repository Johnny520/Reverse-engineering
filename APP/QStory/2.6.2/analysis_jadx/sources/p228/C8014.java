package p228;

import android.net.Uri;
import com.bumptech.glide.load.data.C2964;
import com.bumptech.glide.load.data.C2965;
import com.bumptech.glide.load.data.InterfaceC2961;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p221.C7975;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8014 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22139 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8015 f22140;

    public C8014(C8015 c8015) {
        this.f22140 = c8015;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        return f22139.contains(((Uri) obj).getScheme());
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        InterfaceC2961 c2964;
        Uri uri = (Uri) obj;
        C7975 c7975 = new C7975(uri);
        C8015 c8015 = this.f22140;
        switch (c8015.f22143) {
            case 0:
                c2964 = new C2964(c8015.f22141, uri, c8015.f22142, 0);
                break;
            case 1:
                c2964 = new C2964(c8015.f22141, uri, c8015.f22142, 1);
                break;
            default:
                c2964 = new C2965(c8015.f22141, uri, c8015.f22142);
                break;
        }
        return new C8035(c7975, c2964);
    }
}
