package p227;

import com.bumptech.glide.load.data.C2969;
import java.util.ArrayDeque;
import p228.C8030;
import p228.C8034;
import p228.C8035;
import p228.C8036;
import p228.InterfaceC8032;
import p286.C8396;
import p286.C8397;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8012 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8397 f22135 = C8397.m13948(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5851 f22136;

    public C8012(C5851 c5851) {
        this.f22136 = c5851;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ /* synthetic */ boolean mo13473(Object obj) {
        return true;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        C8036 c8036 = (C8036) obj;
        C5851 c5851 = this.f22136;
        if (c5851 != null) {
            C8030 c8030 = (C8030) c5851.f16007;
            C8034 c8034M13491 = C8034.m13491(c8036);
            Object objM6326 = c8030.m6326(c8034M13491);
            ArrayDeque arrayDeque = C8034.f22187;
            synchronized (arrayDeque) {
                arrayDeque.offer(c8034M13491);
            }
            C8036 c80362 = (C8036) objM6326;
            if (c80362 == null) {
                c8030.m6323(C8034.m13491(c8036), c8036);
            } else {
                c8036 = c80362;
            }
        }
        return new C8035(c8036, new C2969(c8036, ((Integer) c8396.m13947(f22135)).intValue()));
    }
}
