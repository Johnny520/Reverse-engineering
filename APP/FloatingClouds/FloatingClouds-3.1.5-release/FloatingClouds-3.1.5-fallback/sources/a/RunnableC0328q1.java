package a;

/* JADX INFO: renamed from: a.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0328q1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f647a;
    public final /* synthetic */ android.graphics.Typeface b;
    public final /* synthetic */ int c;

    public RunnableC0328q1(android.widget.TextView r1, android.graphics.Typeface r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f647a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            android.graphics.Typeface r0 = r3.b
            int r1 = r3.c
            android.widget.TextView r2 = r3.f647a
            r2.setTypeface(r0, r1)
            return
    }
}
