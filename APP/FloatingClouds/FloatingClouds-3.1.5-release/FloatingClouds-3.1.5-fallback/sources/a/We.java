package a;

/* JADX INFO: loaded from: classes.dex */
public final class We extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f329a;
    public final /* synthetic */ android.text.TextPaint b;
    public final /* synthetic */ a.AbstractC0040a2 c;
    public final /* synthetic */ a.Ve d;

    public We(a.Ve r1, android.content.Context r2, android.text.TextPaint r3, a.AbstractC0040a2 r4) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.f329a = r2
            r0.b = r3
            r0.c = r4
            return
    }

    @Override // a.AbstractC0040a2
    public final void d(int r2) {
            r1 = this;
            a.a2 r0 = r1.c
            r0.d(r2)
            return
    }

    @Override // a.AbstractC0040a2
    public final void e(android.graphics.Typeface r4, boolean r5) {
            r3 = this;
            android.text.TextPaint r0 = r3.b
            a.Ve r1 = r3.d
            android.content.Context r2 = r3.f329a
            r1.g(r2, r0, r4)
            a.a2 r0 = r3.c
            r0.e(r4, r5)
            return
    }
}
