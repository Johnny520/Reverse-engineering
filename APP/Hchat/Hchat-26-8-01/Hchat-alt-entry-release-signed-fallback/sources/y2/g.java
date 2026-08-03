package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.x f22221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f22222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f22223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.m f22225k;

    public g(y2.x r1, fg.a r2, y2.c0 r3, java.lang.String r4, u2.m r5) {
            r0 = this;
            r0.f22221g = r1
            r0.f22222h = r2
            r0.f22223i = r3
            r0.f22224j = r4
            r0.f22225k = r5
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            i0.a0 r5 = (i0.a0) r5
            y2.x r5 = r4.f22221g
            android.view.WindowManager r0 = r5.f22280v
            android.view.WindowManager$LayoutParams r1 = r5.f22281w
            r0.addView(r5, r1)
            java.lang.String r0 = r4.f22224j
            u2.m r1 = r4.f22225k
            fg.a r2 = r4.f22222h
            y2.c0 r3 = r4.f22223i
            r5.o(r2, r3, r0, r1)
            b0.m r0 = new b0.m
            r1 = 9
            r0.<init>(r5, r1)
            return r0
    }
}
