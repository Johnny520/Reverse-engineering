package w8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.List f14885d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f14886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f14887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f14888c;

    static {
            java.lang.String r0 = "com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI"
            java.lang.String r1 = "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            w8.a.f14885d = r0
            return
    }

    public a(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f14886a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_auto_original_image_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f14887b = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.f14888c = r2
            return
    }
}
