package p244;

import android.net.Uri;
import com.bumptech.glide.load.data.C3797;
import com.bumptech.glide.load.data.C3798;
import com.bumptech.glide.load.data.InterfaceC3794;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p237.C8805;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8844 implements InterfaceC8862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22481 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8845 f22482;

    public C8844(C8845 c8845) {
        this.f22482 = c8845;
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14060(Object obj) {
        return f22481.contains(((Uri) obj).getScheme());
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8865 mo14061(Object obj, int i, int i2, C9226 c9226) {
        InterfaceC3794 c3797;
        Uri uri = (Uri) obj;
        C8805 c8805 = new C8805(uri);
        C8845 c8845 = this.f22482;
        switch (c8845.f22485) {
            case 0:
                c3797 = new C3797(c8845.f22483, uri, c8845.f22484, 0);
                break;
            case 1:
                c3797 = new C3797(c8845.f22483, uri, c8845.f22484, 1);
                break;
            default:
                c3797 = new C3798(c8845.f22483, uri, c8845.f22484);
                break;
        }
        return new C8865(c8805, c3797);
    }
}
