package p228;

import android.net.Uri;
import com.bumptech.glide.load.data.C2965;
import com.bumptech.glide.load.data.C2966;
import com.bumptech.glide.load.data.InterfaceC2962;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p221.C7976;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8015 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22136 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8016 f22137;

    public C8015(C8016 c8016) {
        this.f22137 = c8016;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13501(Object obj) {
        return f22136.contains(((Uri) obj).getScheme());
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        InterfaceC2962 c2965;
        Uri uri = (Uri) obj;
        C7976 c7976 = new C7976(uri);
        C8016 c8016 = this.f22137;
        switch (c8016.f22140) {
            case 0:
                c2965 = new C2965(c8016.f22138, uri, c8016.f22139, 0);
                break;
            case 1:
                c2965 = new C2965(c8016.f22138, uri, c8016.f22139, 1);
                break;
            default:
                c2965 = new C2966(c8016.f22138, uri, c8016.f22139);
                break;
        }
        return new C8036(c7976, c2965);
    }
}
