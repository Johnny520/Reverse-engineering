package p167;

import android.os.Trace;
import androidx.core.os.AbstractC2177;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7703 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = AbstractC2177.f6449;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C7712.m12979()) {
                C7712.m12980().m12982();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = AbstractC2177.f6449;
            Trace.endSection();
            throw th;
        }
    }
}
