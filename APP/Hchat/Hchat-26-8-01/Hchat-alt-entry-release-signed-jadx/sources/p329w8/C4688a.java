package p329w8;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0000a;
import p258r8.C3742g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: w8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4688a {

    /* JADX INFO: renamed from: d */
    public static final List f15655d = AbstractC0000a.m101y0("com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI", "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");

    /* JADX INFO: renamed from: a */
    public final C3742g f15656a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f15657b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap.KeySetView f15658c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4688a(C3742g c3742g) {
        c3742g.getClass();
        this.f15656a = c3742g;
        this.f15657b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_auto_original_image_config");
        this.f15658c = ConcurrentHashMap.newKeySet();
    }
}
