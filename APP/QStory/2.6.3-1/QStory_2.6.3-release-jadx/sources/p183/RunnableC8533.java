package p183;

import android.os.Trace;
import androidx.core.os.AbstractC3010;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8533 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = AbstractC3010.f6795;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C8542.m13568()) {
                C8542.m13569().m13571();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = AbstractC3010.f6795;
            Trace.endSection();
            throw th;
        }
    }
}
