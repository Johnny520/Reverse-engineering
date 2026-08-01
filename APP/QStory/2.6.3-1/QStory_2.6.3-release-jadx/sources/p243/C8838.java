package p243;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p237.C8805;
import p244.C8865;
import p244.InterfaceC8862;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8838 implements InterfaceC8862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f22460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8862 f22461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8862 f22462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22463;

    public C8838(Context context, InterfaceC8862 interfaceC8862, InterfaceC8862 interfaceC88622, Class cls) {
        this.f22463 = context.getApplicationContext();
        this.f22462 = interfaceC8862;
        this.f22461 = interfaceC88622;
        this.f22460 = cls;
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14060(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5894.m10600((Uri) obj);
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8865 mo14061(Object obj, int i, int i2, C9226 c9226) {
        Uri uri = (Uri) obj;
        return new C8865(new C8805(uri), new C8839(this.f22463, this.f22462, this.f22461, uri, i, i2, c9226, this.f22460));
    }
}
