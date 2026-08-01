package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲈᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1205 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f3915;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.graphics.Typeface f3916;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f3917;

    public RunnableC1205(android.widget.TextView r1, android.graphics.Typeface r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3915 = r1
            r0.f3916 = r2
            r0.f3917 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            android.graphics.Typeface r0 = r2.f3916
            int r1 = r2.f3917
            android.widget.TextView r2 = r2.f3915
            r2.setTypeface(r0, r1)
            return
    }
}
