package p227;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bumptech.glide.AbstractC3064;
import p221.C7975;
import p228.C8035;
import p228.InterfaceC8032;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8008 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f22118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8032 f22119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8032 f22120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22121;

    public C8008(Context context, InterfaceC8032 interfaceC8032, InterfaceC8032 interfaceC80322, Class cls) {
        this.f22121 = context.getApplicationContext();
        this.f22120 = interfaceC8032;
        this.f22119 = interfaceC80322;
        this.f22118 = cls;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13473(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC3064.m6779((Uri) obj);
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        Uri uri = (Uri) obj;
        return new C8035(new C7975(uri), new C8009(this.f22121, this.f22120, this.f22119, uri, i, i2, c8396, this.f22118));
    }
}
