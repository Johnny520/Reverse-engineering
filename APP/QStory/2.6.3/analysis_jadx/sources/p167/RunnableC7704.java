package p167;

import android.os.Trace;
import androidx.core.os.AbstractC2177;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7704 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = AbstractC2177.f6450;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C7713.m13009()) {
                C7713.m13010().m13012();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = AbstractC2177.f6450;
            Trace.endSection();
            throw th;
        }
    }
}
