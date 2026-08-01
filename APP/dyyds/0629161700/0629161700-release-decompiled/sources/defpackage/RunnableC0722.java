package defpackage;

/* JADX INFO: renamed from: ᛴᛸᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0722 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f3438;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.graphics.Typeface f3439;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f3440;

    public RunnableC0722(android.widget.TextView r1, android.graphics.Typeface r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3440 = r1
            r0.f3439 = r2
            r0.f3438 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            android.graphics.Typeface r0 = r2.f3439
            int r1 = r2.f3438
            android.widget.TextView r2 = r2.f3440
            r2.setTypeface(r0, r1)
            return
    }
}
