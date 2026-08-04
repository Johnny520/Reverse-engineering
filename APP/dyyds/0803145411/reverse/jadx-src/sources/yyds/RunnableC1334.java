package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1334 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0846 f6181;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ long f6182;

    public RunnableC1334(C0846 c0846, long j) {
        this.f6181 = c0846;
        this.f6182 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0846 c0846 = this.f6181;
        if (c0846.f3887) {
            float fM1483 = AbstractC0598.m1483((System.currentTimeMillis() - this.f6182) / 650.0f, 0.0f, 1.0f);
            float f = 1.0f - fM1483;
            c0846.f3883 = 1.0f - ((f * f) * f);
            c0846.invalidateSelf();
            if (fM1483 < 1.0f) {
                c0846.scheduleSelf(this, 16L);
                return;
            }
            c0846.f3887 = false;
            c0846.f3883 = -1.0f;
            c0846.invalidateSelf();
        }
    }
}
