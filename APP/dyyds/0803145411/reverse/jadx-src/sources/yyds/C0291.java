package yyds;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: yyds.ᛲᛲᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0291 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public float f1543;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f1544;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2332 f1545;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Handler f1546;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public long f1547;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public float f1548;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f1549;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f1550;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f1551;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Interpolator f1552;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f1553;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0291 m942(float f, float f2) {
        C0291 c0291 = new C0291();
        c0291.f1546 = new Handler(Looper.getMainLooper());
        c0291.f1553 = false;
        c0291.f1544 = 0;
        c0291.f1550 = 0;
        c0291.f1549 = 16;
        c0291.f1548 = f;
        c0291.f1543 = f2;
        return c0291;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m943() {
        if (this.f1553) {
            return;
        }
        this.f1553 = true;
        this.f1551 = System.currentTimeMillis();
        new Thread(new RunnableC0871(5, this)).start();
    }
}
