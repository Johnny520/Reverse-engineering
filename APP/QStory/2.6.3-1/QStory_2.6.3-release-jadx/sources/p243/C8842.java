package p243;

import com.bumptech.glide.load.data.C3802;
import java.util.ArrayDeque;
import p244.C8860;
import p244.C8864;
import p244.C8865;
import p244.C8866;
import p244.InterfaceC8862;
import p302.C9226;
import p302.C9227;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8842 implements InterfaceC8862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9227 f22477 = C9227.m14524(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6686 f22478;

    public C8842(C6686 c6686) {
        this.f22478 = c6686;
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final /* bridge */ /* synthetic */ boolean mo14060(Object obj) {
        return true;
    }

    @Override // p244.InterfaceC8862
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8865 mo14061(Object obj, int i, int i2, C9226 c9226) {
        C8866 c8866 = (C8866) obj;
        C6686 c6686 = this.f22478;
        if (c6686 != null) {
            C8860 c8860 = (C8860) c6686.f16359;
            C8864 c8864M14078 = C8864.m14078(c8866);
            Object objM6944 = c8860.m6944(c8864M14078);
            ArrayDeque arrayDeque = C8864.f22529;
            synchronized (arrayDeque) {
                arrayDeque.offer(c8864M14078);
            }
            C8866 c88662 = (C8866) objM6944;
            if (c88662 == null) {
                c8860.m6941(C8864.m14078(c8866), c8866);
            } else {
                c8866 = c88662;
            }
        }
        return new C8865(c8866, new C3802(c8866, ((Integer) c9226.m14523(f22477)).intValue()));
    }
}
