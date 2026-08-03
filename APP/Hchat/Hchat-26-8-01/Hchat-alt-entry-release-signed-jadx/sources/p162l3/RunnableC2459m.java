package p162l3;

import android.os.Trace;
import p043d3.AbstractC0687c;

/* JADX INFO: renamed from: l3.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2459m implements Runnable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i9 = AbstractC0687c.f2094a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C2455i.m5847d()) {
                C2455i.m5846a().m5850e();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            int i10 = AbstractC0687c.f2094a;
            Trace.endSection();
            throw th2;
        }
    }
}
