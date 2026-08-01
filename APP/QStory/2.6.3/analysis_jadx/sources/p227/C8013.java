package p227;

import com.bumptech.glide.load.data.C2970;
import java.util.ArrayDeque;
import p228.C8031;
import p228.C8035;
import p228.C8036;
import p228.C8037;
import p228.InterfaceC8033;
import p286.C8397;
import p286.C8398;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8013 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8398 f22132 = C8398.m13965(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5856 f22133;

    public C8013(C5856 c5856) {
        this.f22133 = c5856;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ /* synthetic */ boolean mo13501(Object obj) {
        return true;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        C8037 c8037 = (C8037) obj;
        C5856 c5856 = this.f22133;
        if (c5856 != null) {
            C8031 c8031 = (C8031) c5856.f16014;
            C8035 c8035M13519 = C8035.m13519(c8037);
            Object objM6384 = c8031.m6384(c8035M13519);
            ArrayDeque arrayDeque = C8035.f22184;
            synchronized (arrayDeque) {
                arrayDeque.offer(c8035M13519);
            }
            C8037 c80372 = (C8037) objM6384;
            if (c80372 == null) {
                c8031.m6381(C8035.m13519(c8037), c8037);
            } else {
                c8037 = c80372;
            }
        }
        return new C8036(c8037, new C2970(c8037, ((Integer) c8397.m13964(f22132)).intValue()));
    }
}
