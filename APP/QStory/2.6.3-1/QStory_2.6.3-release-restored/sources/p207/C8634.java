package p207;

import com.bumptech.glide.AbstractC3897;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8634 extends AbstractC3897 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C8634 f21619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8632 f21620 = new C8632();

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C8634 m13728() {
        if (f21619 != null) {
            return f21619;
        }
        synchronized (C8634.class) {
            try {
                if (f21619 == null) {
                    f21619 = new C8634();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21619;
    }
}
