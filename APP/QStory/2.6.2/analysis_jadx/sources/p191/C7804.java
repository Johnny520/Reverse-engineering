package p191;

import com.bumptech.glide.AbstractC3055;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7804 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C7804 f21277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7802 f21278 = new C7802();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static C7804 m13141() {
        if (f21277 != null) {
            return f21277;
        }
        synchronized (C7804.class) {
            try {
                if (f21277 == null) {
                    f21277 = new C7804();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21277;
    }
}
