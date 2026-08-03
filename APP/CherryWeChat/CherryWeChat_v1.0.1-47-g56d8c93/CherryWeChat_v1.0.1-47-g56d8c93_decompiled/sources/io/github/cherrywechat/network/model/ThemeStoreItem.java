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
    public static final Companion Companion = new Companion(null);
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

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ThemeStoreItem() {
        this((String) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (List) null, (String) null, false, 0, 1023, (AbstractC0621Oc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeStoreItem copy$default(ThemeStoreItem themeStoreItem, String str, String str2, String str3, double d, String str4, String str5, List list, String str6, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = themeStoreItem.f5574id;
        }
        if ((i2 & 2) != 0) {
            str2 = themeStoreItem.name;
        }
        if ((i2 & 4) != 0) {
            str3 = themeStoreItem.author;
        }
        if ((i2 & 8) != 0) {
            d = themeStoreItem.price;
        }
        if ((i2 & 16) != 0) {
            str4 = themeStoreItem.demoUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = themeStoreItem.coverImage;
        }
        if ((i2 & 64) != 0) {
            list = themeStoreItem.screenshots;
        }
        if ((i2 & 128) != 0) {
            str6 = themeStoreItem.description;
        }
        if ((i2 & 256) != 0) {
            z = themeStoreItem.featured;
        }
        if ((i2 & 512) != 0) {
            i = themeStoreItem.downloadCount;
        }
        boolean z2 = z;
        int i3 = i;
        double d2 = d;
        String str7 = str3;
        return themeStoreItem.copy(str, str2, str7, d2, str4, str5, list, str6, z2, i3);
    }

    public static /* synthetic */ void getDownloadCount$annotations() {
    }

    public static /* synthetic */ void getFeatured$annotations() {
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getScreenshots$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeStoreItem themeStoreItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeStoreItem.f5574id, "")) {
            String str = themeStoreItem.f5574id;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeStoreItem.name, "")) {
            String str2 = themeStoreItem.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeStoreItem.author, "")) {
            String str3 = themeStoreItem.author;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || Double.compare(themeStoreItem.price, 0.0d) != 0) {
            TolerantDoubleSerializer tolerantDoubleSerializer = TolerantDoubleSerializer.INSTANCE;
            double d = themeStoreItem.price;
            interfaceC0962Wa.m1839a();
        }
        if (interfaceC0962Wa.m1845g() || themeStoreItem.demoUrl != null) {
            C2521sz c2521sz = C2521sz.f8819a;
            String str4 = themeStoreItem.demoUrl;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || themeStoreItem.coverImage != null) {
            C2521sz c2521sz2 = C2521sz.f8819a;
            String str5 = themeStoreItem.coverImage;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeStoreItem.screenshots, C0452Kf.f1484a)) {
            ScreenshotsSerializer screenshotsSerializer = ScreenshotsSerializer.INSTANCE;
            List<String> list = themeStoreItem.screenshots;
            interfaceC0962Wa.m1839a();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeStoreItem.description, "")) {
            String str6 = themeStoreItem.description;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || themeStoreItem.featured) {
            TolerantBooleanSerializer tolerantBooleanSerializer = TolerantBooleanSerializer.INSTANCE;
            boolean z = themeStoreItem.featured;
            interfaceC0962Wa.m1839a();
        }
        if (!interfaceC0962Wa.m1845g() && themeStoreItem.downloadCount == 0) {
            return;
        }
        TolerantIntSerializer tolerantIntSerializer = TolerantIntSerializer.INSTANCE;
        int i = themeStoreItem.downloadCount;
        interfaceC0962Wa.m1839a();
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

    public final ThemeStoreItem copy(String str, String str2, String str3, double d, String str4, String str5, List<String> list, String str6, boolean z, int i) {
        return new ThemeStoreItem(str, str2, str3, d, str4, str5, list, str6, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeStoreItem)) {
            return false;
        }
        ThemeStoreItem themeStoreItem = (ThemeStoreItem) obj;
        return AbstractC0585Nj.m1134a(this.f5574id, themeStoreItem.f5574id) && AbstractC0585Nj.m1134a(this.name, themeStoreItem.name) && AbstractC0585Nj.m1134a(this.author, themeStoreItem.author) && Double.compare(this.price, themeStoreItem.price) == 0 && AbstractC0585Nj.m1134a(this.demoUrl, themeStoreItem.demoUrl) && AbstractC0585Nj.m1134a(this.coverImage, themeStoreItem.coverImage) && AbstractC0585Nj.m1134a(this.screenshots, themeStoreItem.screenshots) && AbstractC0585Nj.m1134a(this.description, themeStoreItem.description) && this.featured == themeStoreItem.featured && this.downloadCount == themeStoreItem.downloadCount;
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
        int iHashCode = (Double.hashCode(this.price) + AbstractC2374ph.m4810g(this.author, AbstractC2374ph.m4810g(this.name, this.f5574id.hashCode() * 31, 31), 31)) * 31;
        String str = this.demoUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImage;
        return Integer.hashCode(this.downloadCount) + ((Boolean.hashCode(this.featured) + AbstractC2374ph.m4810g(this.description, (this.screenshots.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThemeStoreItem(id=");
        sb.append(this.f5574id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", demoUrl=");
        sb.append(this.demoUrl);
        sb.append(", coverImage=");
        sb.append(this.coverImage);
        sb.append(", screenshots=");
        sb.append(this.screenshots);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", featured=");
        sb.append(this.featured);
        sb.append(", downloadCount=");
        return AbstractC0213Ey.m408f(sb, this.downloadCount, ')');
    }

    public /* synthetic */ ThemeStoreItem(int i, String str, String str2, String str3, double d, String str4, String str5, List list, String str6, boolean z, int i2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5574id = "";
        } else {
            this.f5574id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.author = "";
        } else {
            this.author = str3;
        }
        if ((i & 8) == 0) {
            this.price = 0.0d;
        } else {
            this.price = d;
        }
        if ((i & 16) == 0) {
            this.demoUrl = null;
        } else {
            this.demoUrl = str4;
        }
        if ((i & 32) == 0) {
            this.coverImage = null;
        } else {
            this.coverImage = str5;
        }
        if ((i & 64) == 0) {
            this.screenshots = C0452Kf.f1484a;
        } else {
            this.screenshots = list;
        }
        if ((i & 128) == 0) {
            this.description = "";
        } else {
            this.description = str6;
        }
        if ((i & 256) == 0) {
            this.featured = false;
        } else {
            this.featured = z;
        }
        if ((i & 512) == 0) {
            this.downloadCount = 0;
        } else {
            this.downloadCount = i2;
        }
    }

    public ThemeStoreItem(String str, String str2, String str3, double d, String str4, String str5, List<String> list, String str6, boolean z, int i) {
        this.f5574id = str;
        this.name = str2;
        this.author = str3;
        this.price = d;
        this.demoUrl = str4;
        this.coverImage = str5;
        this.screenshots = list;
        this.description = str6;
        this.featured = z;
        this.downloadCount = i;
    }

    public /* synthetic */ ThemeStoreItem(String str, String str2, String str3, double d, String str4, String str5, List list, String str6, boolean z, int i, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? C0452Kf.f1484a : list, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? 0 : i);
    }
}
