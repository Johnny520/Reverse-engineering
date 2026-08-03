package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0452Kf;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeDetailData {
    public static final Companion Companion = new Companion(null);
    private final String author;
    private final String description;
    private final String details;
    private final String name;
    private final double price;
    private final List<String> screenshots;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeDetailData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ThemeDetailData() {
        this((String) null, (String) null, 0.0d, (String) null, (String) null, (List) null, 63, (AbstractC0621Oc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeDetailData copy$default(ThemeDetailData themeDetailData, String str, String str2, double d, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeDetailData.name;
        }
        if ((i & 2) != 0) {
            str2 = themeDetailData.author;
        }
        if ((i & 4) != 0) {
            d = themeDetailData.price;
        }
        if ((i & 8) != 0) {
            str3 = themeDetailData.details;
        }
        if ((i & 16) != 0) {
            str4 = themeDetailData.description;
        }
        if ((i & 32) != 0) {
            list = themeDetailData.screenshots;
        }
        List list2 = list;
        String str5 = str3;
        double d2 = d;
        return themeDetailData.copy(str, str2, d2, str5, str4, list2);
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getScreenshots$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeDetailData themeDetailData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeDetailData.name, "")) {
            String str = themeDetailData.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeDetailData.author, "")) {
            String str2 = themeDetailData.author;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || Double.compare(themeDetailData.price, 0.0d) != 0) {
            TolerantDoubleSerializer tolerantDoubleSerializer = TolerantDoubleSerializer.INSTANCE;
            double d = themeDetailData.price;
            interfaceC0962Wa.m1839a();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeDetailData.details, "")) {
            String str3 = themeDetailData.details;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeDetailData.description, "")) {
            String str4 = themeDetailData.description;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themeDetailData.screenshots, C0452Kf.f1484a)) {
            return;
        }
        ScreenshotsSerializer screenshotsSerializer = ScreenshotsSerializer.INSTANCE;
        List<String> list = themeDetailData.screenshots;
        interfaceC0962Wa.m1839a();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.author;
    }

    public final double component3() {
        return this.price;
    }

    public final String component4() {
        return this.details;
    }

    public final String component5() {
        return this.description;
    }

    public final List<String> component6() {
        return this.screenshots;
    }

    public final ThemeDetailData copy(String str, String str2, double d, String str3, String str4, List<String> list) {
        return new ThemeDetailData(str, str2, d, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeDetailData)) {
            return false;
        }
        ThemeDetailData themeDetailData = (ThemeDetailData) obj;
        return AbstractC0585Nj.m1134a(this.name, themeDetailData.name) && AbstractC0585Nj.m1134a(this.author, themeDetailData.author) && Double.compare(this.price, themeDetailData.price) == 0 && AbstractC0585Nj.m1134a(this.details, themeDetailData.details) && AbstractC0585Nj.m1134a(this.description, themeDetailData.description) && AbstractC0585Nj.m1134a(this.screenshots, themeDetailData.screenshots);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetails() {
        return this.details;
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
        return this.screenshots.hashCode() + AbstractC2374ph.m4810g(this.description, AbstractC2374ph.m4810g(this.details, (Double.hashCode(this.price) + AbstractC2374ph.m4810g(this.author, this.name.hashCode() * 31, 31)) * 31, 31), 31);
    }

    public String toString() {
        return "ThemeDetailData(name=" + this.name + ", author=" + this.author + ", price=" + this.price + ", details=" + this.details + ", description=" + this.description + ", screenshots=" + this.screenshots + ')';
    }

    public /* synthetic */ ThemeDetailData(int i, String str, String str2, double d, String str3, String str4, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.author = "";
        } else {
            this.author = str2;
        }
        if ((i & 4) == 0) {
            this.price = 0.0d;
        } else {
            this.price = d;
        }
        if ((i & 8) == 0) {
            this.details = "";
        } else {
            this.details = str3;
        }
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 32) == 0) {
            this.screenshots = C0452Kf.f1484a;
        } else {
            this.screenshots = list;
        }
    }

    public ThemeDetailData(String str, String str2, double d, String str3, String str4, List<String> list) {
        this.name = str;
        this.author = str2;
        this.price = d;
        this.details = str3;
        this.description = str4;
        this.screenshots = list;
    }

    public /* synthetic */ ThemeDetailData(String str, String str2, double d, String str3, String str4, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? C0452Kf.f1484a : list);
    }
}
