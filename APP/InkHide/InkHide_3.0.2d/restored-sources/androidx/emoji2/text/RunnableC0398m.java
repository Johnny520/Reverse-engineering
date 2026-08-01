package androidx.emoji2.text;

import android.os.Trace;
import p091u.AbstractC1014d;

/* JADX INFO: renamed from: androidx.emoji2.text.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0398m implements Runnable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = AbstractC1014d.f3612a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0396k.f1174j != null) {
                C0396k.m761a().m763c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i3 = AbstractC1014d.f3612a;
            Trace.endSection();
            throw th;
        }
    }
}
