package p227;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p221.C7976;
import p228.C8036;
import p228.InterfaceC8033;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8009 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f22115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8033 f22116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8033 f22117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22118;

    public C8009(Context context, InterfaceC8033 interfaceC8033, InterfaceC8033 interfaceC80332, Class cls) {
        this.f22118 = context.getApplicationContext();
        this.f22117 = interfaceC8033;
        this.f22116 = interfaceC80332;
        this.f22115 = cls;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13501(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5062.m10041((Uri) obj);
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        Uri uri = (Uri) obj;
        return new C8036(new C7976(uri), new C8010(this.f22118, this.f22117, this.f22116, uri, i, i2, c8397, this.f22115));
    }
}
