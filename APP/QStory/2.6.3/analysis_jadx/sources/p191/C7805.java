package p191;

import com.bumptech.glide.AbstractC3065;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7805 extends AbstractC3065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C7805 f21274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7803 f21275 = new C7803();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C7805 m13169() {
        if (f21274 != null) {
            return f21274;
        }
        synchronized (C7805.class) {
            try {
                if (f21274 == null) {
                    f21274 = new C7805();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21274;
    }
}
