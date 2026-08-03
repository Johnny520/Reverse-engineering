package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0213Ey;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0452Kf;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeStoreItem {
    public static final Companion Companion = null;
    private final String author;
    private final String coverImage;
    private final String demoUrl;
    private final String description;
    private final int downloadCount;
    private final boolean featured;

    /* JADX INFO: renamed from: id */
    private final String f5574id;
    private final String name;
    private final double price;
    private final List<String> screenshots;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeStoreItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ThemeStoreItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        double r4 = 0.0d;
        String r6 = null;
        String r7 = null;
        List r8 = null;
        String r9 = null;
        boolean r10 = false;
        int r11 = 0;
        this(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeStoreItem copy$default(ThemeStoreItem r0, String r1, String r2, String r3, double r4, String r6, String r7, List r8, String r9, boolean r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.f5574id;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.author;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.price;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = r0.demoUrl;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = r0.coverImage;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = r0.screenshots;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = r0.description;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = r0.featured;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = r0.downloadCount;
    L32:
        boolean r122 = r10;
        int r132 = r11;
        List r102 = r8;
        String r112 = r9;
        double r62 = r4;
        String r42 = r2;
        String r5 = r3;
        String r32 = r1;
        return r0.copy(r32, r42, r5, r62, r6, r7, r102, r112, r122, r132);
    }

    public static /* synthetic */ void getDownloadCount$annotations() {
    }

    public static /* synthetic */ void getFeatured$annotations() {
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getScreenshots$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeStoreItem r5, InterfaceC0962Wa r6, InterfaceC0126Cx r7) {
        if (r6.m1845g() == false) goto L6;
    L7:
        String r72 = r5.f5574id;
        r6.m1842d();
    L9:
        if (r6.m1845g() == false) goto L12;
    L13:
        String r73 = r5.name;
        r6.m1842d();
    L15:
        if (r6.m1845g() == false) goto L18;
    L19:
        String r74 = r5.author;
        r6.m1842d();
    L21:
        if (r6.m1845g() == false) goto L24;
    L25:
        TolerantDoubleSerializer r75 = TolerantDoubleSerializer.INSTANCE;
        double r1 = r5.price;
        r6.m1839a();
    L27:
        if (r6.m1845g() == false) goto L30;
    L31:
        C2521sz r76 = C2521sz.f8819a;
        String r77 = r5.demoUrl;
        r6.m1844f();
    L33:
        if (r6.m1845g() == false) goto L36;
    L37:
        C2521sz r78 = C2521sz.f8819a;
        String r79 = r5.coverImage;
        r6.m1844f();
    L39:
        if (r6.m1845g() == false) goto L42;
    L43:
        ScreenshotsSerializer r710 = ScreenshotsSerializer.INSTANCE;
        List<String> r711 = r5.screenshots;
        r6.m1839a();
    L45:
        if (r6.m1845g() == false) goto L48;
    L49:
        String r712 = r5.description;
        r6.m1842d();
    L51:
        if (r6.m1845g() == false) goto L54;
    L55:
        TolerantBooleanSerializer r713 = TolerantBooleanSerializer.INSTANCE;
        boolean r714 = r5.featured;
        r6.m1839a();
    L57:
        if (r6.m1845g() == false) goto L60;
    L61:
        TolerantIntSerializer r715 = TolerantIntSerializer.INSTANCE;
        int r52 = r5.downloadCount;
        r6.m1839a();
        return;
    L60:
        if (r5.downloadCount != 0) goto L61;
        return;
    L54:
        if (r5.featured == false) goto L57;
    L48:
        if (AbstractC0585Nj.m1134a(r5.description, "") == true) goto L51;
    L42:
        if (AbstractC0585Nj.m1134a(r5.screenshots, C0452Kf.f1484a) == true) goto L45;
    L36:
        if (r5.coverImage == null) goto L39;
    L30:
        if (r5.demoUrl == null) goto L33;
    L24:
        if (Double.compare(r5.price, 0.0d) == 0) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r5.author, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r5.name, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r5.f5574id, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.f5574id;
    }

    public final int component10() {
        return this.downloadCount;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.author;
    }

    public final double component4() {
        return this.price;
    }

    public final String component5() {
        return this.demoUrl;
    }

    public final String component6() {
        return this.coverImage;
    }

    public final List<String> component7() {
        return this.screenshots;
    }

    public final String component8() {
        return this.description;
    }

    public final boolean component9() {
        return this.featured;
    }

    public final ThemeStoreItem copy(String r13, String r14, String r15, double r16, String r18, String r19, List<String> r20, String r21, boolean r22, int r23) {
        return new ThemeStoreItem(r13, r14, r15, r16, r18, r19, r20, r21, r22, r23);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ThemeStoreItem) == true) goto L8;
        return false;
    L8:
        ThemeStoreItem r82 = (ThemeStoreItem) r8;
        if (AbstractC0585Nj.m1134a(this.f5574id, r82.f5574id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.author, r82.author) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.price, r82.price) == 0) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.demoUrl, r82.demoUrl) == true) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.coverImage, r82.coverImage) == true) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.screenshots, r82.screenshots) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.description, r82.description) == true) goto L33;
        return false;
    L33:
        if (this.featured == r82.featured) goto L36;
        return false;
    L36:
        if (this.downloadCount == r82.downloadCount) goto L38;
        return false;
    L38:
        return true;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final String getDemoUrl() {
        return this.demoUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDownloadCount() {
        return this.downloadCount;
    }

    public final boolean getFeatured() {
        return this.featured;
    }

    public final String getId() {
        return this.f5574id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final List<String> getScreenshots() {
        return this.screenshots;
    }

    public int hashCode() {
        int r2 = (Double.hashCode(this.price) + AbstractC2374ph.m4810g(this.author, AbstractC2374ph.m4810g(this.name, this.f5574id.hashCode() * 31, 31), 31)) * 31;
        String r0 = this.demoUrl;
        int r3 = 0;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        int r22 = (r2 + r02) * 31;
        String r03 = this.coverImage;
        if (r03 == null) goto L11;
        r3 = r03.hashCode();
    L11:
        return Integer.hashCode(this.downloadCount) + ((Boolean.hashCode(this.featured) + AbstractC2374ph.m4810g(this.description, (this.screenshots.hashCode() + ((r22 + r3) * 31)) * 31, 31)) * 31);
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("ThemeStoreItem(id=");
        r0.append(this.f5574id);
        r0.append(", name=");
        r0.append(this.name);
        r0.append(", author=");
        r0.append(this.author);
        r0.append(", price=");
        r0.append(this.price);
        r0.append(", demoUrl=");
        r0.append(this.demoUrl);
        r0.append(", coverImage=");
        r0.append(this.coverImage);
        r0.append(", screenshots=");
        r0.append(this.screenshots);
        r0.append(", description=");
        r0.append(this.description);
        r0.append(", featured=");
        r0.append(this.featured);
        r0.append(", downloadCount=");
        return AbstractC0213Ey.m408f(r0, this.downloadCount, ')');
    }

    public /* synthetic */ ThemeStoreItem(int r2, String r3, String r4, String r5, double r6, String r8, String r9, List r10, String r11, boolean r12, int r13, AbstractC0298Gx r14) {
        if ((r2 & 1) != 0) goto L5;
        this.f5574id = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.name = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.author = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.price = 0.0d;
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.demoUrl = null;
    L23:
        if ((r2 & 32) != 0) goto L25;
        this.coverImage = null;
    L27:
        if ((r2 & 64) != 0) goto L29;
        this.screenshots = C0452Kf.f1484a;
    L31:
        if ((r2 & 128) != 0) goto L33;
        this.description = "";
    L35:
        if ((r2 & 256) != 0) goto L37;
        this.featured = false;
    L39:
        if ((r2 & 512) != 0) goto L42;
        this.downloadCount = 0;
        return;
    L42:
        this.downloadCount = r13;
        return;
    L37:
        this.featured = r12;
        goto L39
    L33:
        this.description = r11;
        goto L35
    L29:
        this.screenshots = r10;
        goto L31
    L25:
        this.coverImage = r9;
        goto L27
    L21:
        this.demoUrl = r8;
        goto L23
    L17:
        this.price = r6;
        goto L19
    L13:
        this.author = r5;
        goto L15
    L9:
        this.name = r4;
        goto L11
    L5:
        this.f5574id = r3;
        goto L7
    }

    public ThemeStoreItem(String r1, String r2, String r3, double r4, String r6, String r7, List<String> r8, String r9, boolean r10, int r11) {
        this.f5574id = r1;
        this.name = r2;
        this.author = r3;
        this.price = r4;
        this.demoUrl = r6;
        this.coverImage = r7;
        this.screenshots = r8;
        this.description = r9;
        this.featured = r10;
        this.downloadCount = r11;
    }

    public /* synthetic */ ThemeStoreItem(String r3, String r4, String r5, double r6, String r8, String r9, List r10, String r11, boolean r12, int r13, int r14, AbstractC0621Oc r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = 0.0d;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r8 = null;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r9 = null;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r10 = C0452Kf.f1484a;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r11 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r12 = false;
    L30:
        if ((r14 & 512) == 0) goto L33;
        int r142 = 0;
    L32:
        boolean r132 = r12;
        String r122 = r11;
        List r112 = r10;
        double r7 = r6;
        String r62 = r5;
        this(r3, r4, r62, r7, r8, r9, r112, r122, r132, r142);
        return;
    L33:
        r142 = r13;
        goto L32
    }
}
